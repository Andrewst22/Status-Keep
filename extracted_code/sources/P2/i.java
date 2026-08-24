package P2;

import K2.AbstractC0092v;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.os.storage.StorageManager;
import android.provider.DocumentsContract;
import android.util.Log;
import androidx.appcompat.widget.ActionMenuView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import k.MenuC0527i;
import k0.C0558m;
import l.C0568f;
import l.C0571i;
import l.C0580s;
import z.C0908d;
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f1488m;

    /* renamed from: n  reason: collision with root package name */
    public Object f1489n;

    /* renamed from: o  reason: collision with root package name */
    public final Object f1490o;

    public /* synthetic */ i(int i3, Object obj, Object obj2) {
        this.f1488m = i3;
        this.f1490o = obj;
        this.f1489n = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar;
        ArrayList parcelableArrayList;
        Uri uri;
        String str;
        String str2;
        Class<?> cls;
        Method method;
        Method method2;
        Object invoke;
        int i3;
        int i4;
        C0558m c0558m;
        Object[] objArr = null;
        r0 = null;
        String str3 = null;
        Object obj = this.f1490o;
        switch (this.f1488m) {
            case 0:
                int i5 = 0;
                do {
                    try {
                        ((Runnable) this.f1489n).run();
                    } catch (Throwable th) {
                        AbstractC0092v.d(th, u2.j.f9461m);
                    }
                    jVar = (j) obj;
                    Runnable i6 = jVar.i();
                    if (i6 != null) {
                        this.f1489n = i6;
                        i5++;
                    } else {
                        return;
                    }
                } while (i5 < 16);
                R2.l lVar = jVar.f1492o;
                lVar.getClass();
                lVar.g(jVar, this);
                return;
            case 1:
                R1.c cVar = (R1.c) obj;
                Intent intent = (Intent) this.f1489n;
                if (intent != null) {
                    ArrayList arrayList = new ArrayList();
                    if (intent.getClipData() != null) {
                        int itemCount = intent.getClipData().getItemCount();
                        for (int i7 = 0; i7 < itemCount; i7++) {
                            Uri uri2 = intent.getClipData().getItemAt(i7).getUri();
                            boolean equals = Objects.equals(cVar.f2080q, "image/*");
                            W1.d dVar = cVar.f2076m;
                            if (equals && cVar.f2081r && (i4 = cVar.f2082s) > 0) {
                                uri2 = android.support.v4.media.session.a.k(i4, dVar.getApplicationContext(), uri2);
                            }
                            R1.a H3 = android.support.v4.media.session.a.H(dVar, uri2, cVar.f2079p);
                            if (H3 != null) {
                                arrayList.add(H3);
                                Log.d("FilePickerDelegate", "[MultiFilePick] File #" + i7 + " - URI: " + uri2.getPath());
                            }
                        }
                        cVar.c(arrayList);
                        return;
                    } else if (intent.getData() != null) {
                        Uri data = intent.getData();
                        boolean equals2 = Objects.equals(cVar.f2080q, "image/*");
                        W1.d dVar2 = cVar.f2076m;
                        if (equals2 && cVar.f2081r && (i3 = cVar.f2082s) > 0) {
                            data = android.support.v4.media.session.a.k(i3, dVar2.getApplicationContext(), data);
                        }
                        if (cVar.f2080q.equals("dir")) {
                            int i8 = Build.VERSION.SDK_INT;
                            Uri buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(data, DocumentsContract.getTreeDocumentId(data));
                            Log.d("FilePickerDelegate", "[SingleFilePick] File URI:" + buildDocumentUriUsingTree.toString());
                            if (i8 < 30 && "com.android.providers.downloads.documents".equals(buildDocumentUriUsingTree.getAuthority())) {
                                String documentId = DocumentsContract.getDocumentId(buildDocumentUriUsingTree);
                                String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
                                if (documentId.equals("downloads")) {
                                    str3 = path;
                                } else if (documentId.matches("^ms[df]\\:.*")) {
                                    str3 = path + "/" + android.support.v4.media.session.a.x(buildDocumentUriUsingTree, dVar2);
                                } else if (documentId.startsWith("raw:")) {
                                    str3 = documentId.split(":")[1];
                                }
                            } else {
                                String[] split = DocumentsContract.getTreeDocumentId(buildDocumentUriUsingTree).split(":");
                                if (split.length > 0) {
                                    str = split[0];
                                } else {
                                    str = null;
                                }
                                try {
                                    StorageManager storageManager = (StorageManager) dVar2.getSystemService("storage");
                                    cls = Class.forName("android.os.storage.StorageVolume");
                                    Method method3 = storageManager.getClass().getMethod("getVolumeList", null);
                                    method = cls.getMethod("getUuid", null);
                                    method2 = cls.getMethod("isPrimary", null);
                                    invoke = method3.invoke(storageManager, null);
                                } catch (Exception unused) {
                                }
                                if (invoke != null) {
                                    int length = Array.getLength(invoke);
                                    int i9 = 0;
                                    while (i9 < length) {
                                        Object obj2 = Array.get(invoke, i9);
                                        String str4 = (String) method.invoke(obj2, objArr);
                                        if (((Boolean) method2.invoke(obj2, objArr)) != null && "primary".equals(str)) {
                                            str3 = android.support.v4.media.session.a.v(cls, obj2);
                                        } else if (str4 != null && str4.equals(str)) {
                                            str3 = android.support.v4.media.session.a.v(cls, obj2);
                                        } else {
                                            i9++;
                                            objArr = null;
                                        }
                                    }
                                    str3 = null;
                                }
                                if (str3 == null) {
                                    str3 = File.separator;
                                } else {
                                    String str5 = File.separator;
                                    if (str3.endsWith(str5)) {
                                        str3 = str3.substring(0, str3.length() - 1);
                                    }
                                    String[] split2 = DocumentsContract.getTreeDocumentId(buildDocumentUriUsingTree).split(":");
                                    if (split2.length < 2 || (str2 = split2[1]) == null) {
                                        str2 = str5;
                                    }
                                    if (str2.endsWith(str5)) {
                                        str2 = str2.substring(0, str2.length() - 1);
                                    }
                                    if (str2.length() > 0) {
                                        if (str2.startsWith(str5)) {
                                            str3 = str3 + str2;
                                        } else {
                                            str3 = str3 + str5 + str2;
                                        }
                                    }
                                }
                            }
                            if (str3 != null) {
                                cVar.c(str3);
                                return;
                            } else {
                                cVar.b("unknown_path", "Failed to retrieve directory path.");
                                return;
                            }
                        }
                        R1.a H4 = android.support.v4.media.session.a.H(dVar2, data, cVar.f2079p);
                        if (H4 != null) {
                            arrayList.add(H4);
                        }
                        if (!arrayList.isEmpty()) {
                            Log.d("FilePickerDelegate", "File path:" + arrayList.toString());
                            cVar.c(arrayList);
                            return;
                        }
                        cVar.b("unknown_path", "Failed to retrieve path.");
                        return;
                    } else if (intent.getExtras() != null) {
                        Bundle extras = intent.getExtras();
                        if (extras.keySet().contains("selectedItems")) {
                            cVar.getClass();
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelableArrayList = extras.getParcelableArrayList("selectedItems", Parcelable.class);
                            } else {
                                parcelableArrayList = extras.getParcelableArrayList("selectedItems");
                            }
                            if (parcelableArrayList != null) {
                                Iterator it = parcelableArrayList.iterator();
                                int i10 = 0;
                                while (it.hasNext()) {
                                    Parcelable parcelable = (Parcelable) it.next();
                                    if (parcelable instanceof Uri) {
                                        R1.a H5 = android.support.v4.media.session.a.H(cVar.f2076m, (Uri) parcelable, cVar.f2079p);
                                        if (H5 != null) {
                                            arrayList.add(H5);
                                            Log.d("FilePickerDelegate", "[MultiFilePick] File #" + i10 + " - URI: " + uri.getPath());
                                        }
                                    }
                                    i10++;
                                }
                            }
                            cVar.c(arrayList);
                            return;
                        }
                        cVar.b("unknown_path", "Failed to retrieve path from bundle.");
                        return;
                    } else {
                        cVar.b("unknown_activity", "Unknown activity error, please fill an issue.");
                        return;
                    }
                }
                cVar.b("unknown_activity", "Unknown activity error, please fill an issue.");
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                ((R1.f) ((R1.f) obj).f2093b).b(this.f1489n);
                return;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                C0571i c0571i = (C0571i) obj;
                MenuC0527i menuC0527i = c0571i.f7841o;
                if (menuC0527i != null && (c0558m = menuC0527i.f7421e) != null) {
                    ((ActionMenuView) c0558m.f7632n).getClass();
                }
                ActionMenuView actionMenuView = c0571i.f7845s;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    C0568f c0568f = (C0568f) this.f1489n;
                    if (!c0568f.b()) {
                        if (c0568f.f7470e != null) {
                            c0568f.d(0, 0, false, false);
                        }
                    }
                    c0571i.f7834D = c0568f;
                }
                c0571i.f7836F = null;
                return;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                C0580s c0580s = (C0580s) ((WeakReference) this.f1489n).get();
                if (c0580s != null && c0580s.f7907m) {
                    Typeface typeface = (Typeface) obj;
                    c0580s.f7895a.setTypeface(typeface);
                    c0580s.f7906l = typeface;
                    return;
                }
                return;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                Q0.h hVar = (Q0.h) ((C0558m) this.f1489n).f7632n;
                if (hVar != null) {
                    hVar.e((Typeface) obj);
                    return;
                }
                return;
            default:
                ((C0908d) this.f1489n).accept(obj);
                return;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, int i3, boolean z3) {
        this.f1488m = i3;
        this.f1489n = obj;
        this.f1490o = obj2;
    }
}
