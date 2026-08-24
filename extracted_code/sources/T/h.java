package t;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public abstract class h extends ContentProvider {

    /* renamed from: p  reason: collision with root package name */
    public static final String[] f9232p = {"_display_name", "_size"};

    /* renamed from: q  reason: collision with root package name */
    public static final File f9233q = new File("/");

    /* renamed from: r  reason: collision with root package name */
    public static final HashMap f9234r = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    public final Object f9235m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public String f9236n;

    /* renamed from: o  reason: collision with root package name */
    public C0815g f9237o;

    public static String a(String str) {
        if (str.length() > 0 && str.charAt(str.length() - 1) == '/') {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static C0815g c(Context context, String str) {
        C0815g c0815g;
        HashMap hashMap = f9234r;
        synchronized (hashMap) {
            try {
                c0815g = (C0815g) hashMap.get(str);
                if (c0815g == null) {
                    try {
                        try {
                            c0815g = d(context, str);
                            hashMap.put(str, c0815g);
                        } catch (IOException e2) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                        }
                    } catch (XmlPullParserException e3) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0815g;
    }

    public static C0815g d(Context context, String str) {
        C0815g c0815g = new C0815g(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider != null) {
            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData == null) {
                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            }
            while (true) {
                int next = loadXmlMetaData.next();
                if (next != 1) {
                    if (next == 2) {
                        String name = loadXmlMetaData.getName();
                        File file = null;
                        String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                        String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                        if ("root-path".equals(name)) {
                            file = f9233q;
                        } else if ("files-path".equals(name)) {
                            file = context.getFilesDir();
                        } else if ("cache-path".equals(name)) {
                            file = context.getCacheDir();
                        } else if ("external-path".equals(name)) {
                            file = Environment.getExternalStorageDirectory();
                        } else if ("external-files-path".equals(name)) {
                            File[] externalFilesDirs = context.getExternalFilesDirs(null);
                            if (externalFilesDirs.length > 0) {
                                file = externalFilesDirs[0];
                            }
                        } else if ("external-cache-path".equals(name)) {
                            File[] externalCacheDirs = context.getExternalCacheDirs();
                            if (externalCacheDirs.length > 0) {
                                file = externalCacheDirs[0];
                            }
                        } else if ("external-media-path".equals(name)) {
                            File[] a3 = AbstractC0814f.a(context);
                            if (a3.length > 0) {
                                file = a3[0];
                            }
                        }
                        if (file == null) {
                            continue;
                        } else {
                            String str2 = new String[]{attributeValue2}[0];
                            if (str2 != null) {
                                file = new File(file, str2);
                            }
                            if (!TextUtils.isEmpty(attributeValue)) {
                                try {
                                    c0815g.f9231b.put(attributeValue, file.getCanonicalFile());
                                } catch (IOException e2) {
                                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e2);
                                }
                            } else {
                                throw new IllegalArgumentException("Name must not be empty");
                            }
                        }
                    }
                } else {
                    return c0815g;
                }
            }
        } else {
            throw new IllegalArgumentException(D2.h.l("Couldn't find meta-data for provider with authority ", str));
        }
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                String str = providerInfo.authority.split(";")[0];
                synchronized (this.f9235m) {
                    this.f9236n = str;
                }
                HashMap hashMap = f9234r;
                synchronized (hashMap) {
                    hashMap.remove(str);
                }
                return;
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    public final C0815g b() {
        C0815g c0815g;
        synchronized (this.f9235m) {
            try {
                if (this.f9236n != null) {
                    if (this.f9237o == null) {
                        this.f9237o = c(getContext(), this.f9236n);
                    }
                    c0815g = this.f9237o;
                } else {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0815g;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return b().b(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File b3 = b().b(uri);
        int lastIndexOf = b3.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(b3.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
            return "application/octet-stream";
        }
        return "application/octet-stream";
    }

    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i3;
        File b3 = b().b(uri);
        if ("r".equals(str)) {
            i3 = 268435456;
        } else if (!"w".equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                i3 = 704643072;
            } else if ("rw".equals(str)) {
                i3 = 939524096;
            } else if ("rwt".equals(str)) {
                i3 = 1006632960;
            } else {
                throw new IllegalArgumentException(D2.h.l("Invalid mode: ", str));
            }
        } else {
            i3 = 738197504;
        }
        return ParcelFileDescriptor.open(b3, i3);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i3;
        String str3;
        File b3 = b().b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f9232p;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i4 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                strArr3[i4] = "_display_name";
                i3 = i4 + 1;
                if (queryParameter == null) {
                    str3 = b3.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[i4] = str3;
            } else if ("_size".equals(str4)) {
                strArr3[i4] = "_size";
                i3 = i4 + 1;
                objArr[i4] = Long.valueOf(b3.length());
            }
            i4 = i3;
        }
        String[] strArr4 = new String[i4];
        System.arraycopy(strArr3, 0, strArr4, 0, i4);
        Object[] objArr2 = new Object[i4];
        System.arraycopy(objArr, 0, objArr2, 0, i4);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
