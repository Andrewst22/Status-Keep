package W;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
/* loaded from: classes.dex */
public final class z extends AbstractC0126c {

    /* renamed from: q  reason: collision with root package name */
    public final Context f2807q;

    /* renamed from: r  reason: collision with root package name */
    public l f2808r;

    /* renamed from: s  reason: collision with root package name */
    public AssetFileDescriptor f2809s;

    /* renamed from: t  reason: collision with root package name */
    public FileInputStream f2810t;

    /* renamed from: u  reason: collision with root package name */
    public long f2811u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2812v;

    public z(Context context) {
        super(false);
        this.f2807q = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i3) {
        return Uri.parse("rawresource:///" + i3);
    }

    @Override // W.h
    public final void close() {
        this.f2808r = null;
        try {
            try {
                FileInputStream fileInputStream = this.f2810t;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f2810t = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f2809s;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e2) {
                        throw new i(null, e2, 2000);
                    }
                } finally {
                    this.f2809s = null;
                    if (this.f2812v) {
                        this.f2812v = false;
                        b();
                    }
                }
            } catch (IOException e3) {
                throw new i(null, e3, 2000);
            }
        } catch (Throwable th) {
            this.f2810t = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f2809s;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f2809s = null;
                    if (this.f2812v) {
                        this.f2812v = false;
                        b();
                    }
                    throw th;
                } catch (IOException e4) {
                    throw new i(null, e4, 2000);
                }
            } finally {
                this.f2809s = null;
                if (this.f2812v) {
                    this.f2812v = false;
                    b();
                }
            }
        }
    }

    @Override // W.h
    public final long j(l lVar) {
        String host;
        Resources resourcesForApplication;
        int parseInt;
        int i3;
        Resources resources;
        long min;
        this.f2808r = lVar;
        e();
        Uri normalizeScheme = lVar.f2767a.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.f2807q;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                try {
                    i3 = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new i("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                throw new i("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
        } else if (TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            if (TextUtils.isEmpty(normalizeScheme.getHost())) {
                host = context.getPackageName();
            } else {
                host = normalizeScheme.getHost();
            }
            if (host.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(host);
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new i("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e2, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new i("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(host + ":" + path, "raw", null);
                if (parseInt == 0) {
                    throw new i("Resource not found.", null, 2005);
                }
            }
            i3 = parseInt;
            resources = resourcesForApplication;
        } else {
            throw new i("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i3);
            if (openRawResourceFd != null) {
                this.f2809s = openRawResourceFd;
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(this.f2809s.getFileDescriptor());
                this.f2810t = fileInputStream;
                long j3 = lVar.f2771e;
                int i4 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                try {
                    if (i4 != 0 && j3 > length) {
                        throw new i(null, null, 2008);
                    }
                    long startOffset = this.f2809s.getStartOffset();
                    long skip = fileInputStream.skip(startOffset + j3) - startOffset;
                    if (skip == j3) {
                        if (i4 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            if (channel.size() == 0) {
                                this.f2811u = -1L;
                            } else {
                                long size = channel.size() - channel.position();
                                this.f2811u = size;
                                if (size < 0) {
                                    throw new i(null, null, 2008);
                                }
                            }
                        } else {
                            long j4 = length - skip;
                            this.f2811u = j4;
                            if (j4 < 0) {
                                throw new i(2008);
                            }
                        }
                        long j5 = lVar.f2772f;
                        int i5 = (j5 > (-1L) ? 1 : (j5 == (-1L) ? 0 : -1));
                        if (i5 != 0) {
                            long j6 = this.f2811u;
                            if (j6 == -1) {
                                min = j5;
                            } else {
                                min = Math.min(j6, j5);
                            }
                            this.f2811u = min;
                        }
                        this.f2812v = true;
                        h(lVar);
                        if (i5 == 0) {
                            return this.f2811u;
                        }
                        return j5;
                    }
                    throw new i(null, null, 2008);
                } catch (y e3) {
                    throw e3;
                } catch (IOException e4) {
                    throw new i(null, e4, 2000);
                }
            }
            throw new i("Resource is compressed: " + normalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e5) {
            throw new i(null, e5, 2005);
        }
    }

    @Override // W.h
    public final Uri o() {
        l lVar = this.f2808r;
        if (lVar != null) {
            return lVar.f2767a;
        }
        return null;
    }

    @Override // R.InterfaceC0107j
    public final int read(byte[] bArr, int i3, int i4) {
        if (i4 == 0) {
            return 0;
        }
        long j3 = this.f2811u;
        if (j3 == 0) {
            return -1;
        }
        if (j3 != -1) {
            try {
                i4 = (int) Math.min(j3, i4);
            } catch (IOException e2) {
                throw new i(null, e2, 2000);
            }
        }
        FileInputStream fileInputStream = this.f2810t;
        int i5 = U.A.f2405a;
        int read = fileInputStream.read(bArr, i3, i4);
        if (read == -1) {
            if (this.f2811u == -1) {
                return -1;
            }
            throw new i("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j4 = this.f2811u;
        if (j4 != -1) {
            this.f2811u = j4 - read;
        }
        a(read);
        return read;
    }
}
