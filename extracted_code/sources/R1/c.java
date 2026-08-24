package R1;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Looper;
import android.util.Log;
import g2.i;
import g2.t;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class c implements t {

    /* renamed from: w  reason: collision with root package name */
    public static final int f2075w = (g.class.hashCode() + 43) & 65535;
    public static final int x = (g.class.hashCode() + 83) & 65535;

    /* renamed from: m  reason: collision with root package name */
    public final W1.d f2076m;

    /* renamed from: q  reason: collision with root package name */
    public String f2080q;

    /* renamed from: t  reason: collision with root package name */
    public String[] f2083t;

    /* renamed from: u  reason: collision with root package name */
    public i f2084u;

    /* renamed from: v  reason: collision with root package name */
    public byte[] f2085v;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2078o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2079p = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2081r = true;

    /* renamed from: s  reason: collision with root package name */
    public int f2082s = 20;

    /* renamed from: n  reason: collision with root package name */
    public f f2077n = null;

    public c(W1.d dVar) {
        this.f2076m = dVar;
    }

    public final void a(boolean z3) {
        if (this.f2084u != null && !this.f2080q.equals("dir")) {
            new b(this, Looper.getMainLooper(), z3).obtainMessage().sendToTarget();
        }
    }

    public final void b(String str, String str2) {
        if (this.f2077n == null) {
            return;
        }
        a(false);
        this.f2077n.a(str, str2, null);
        this.f2077n = null;
    }

    public final void c(Serializable serializable) {
        a(false);
        if (this.f2077n != null) {
            if (serializable != null && !(serializable instanceof String)) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) serializable).iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    aVar.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("path", aVar.f2068a);
                    hashMap.put("name", aVar.f2069b);
                    hashMap.put("size", Long.valueOf(aVar.f2071d));
                    hashMap.put("bytes", aVar.f2072e);
                    hashMap.put("identifier", aVar.f2070c.toString());
                    arrayList.add(hashMap);
                }
                serializable = arrayList;
            }
            this.f2077n.b(serializable);
            this.f2077n = null;
        }
    }

    @Override // g2.t
    public final boolean onActivityResult(int i3, int i4, Intent intent) {
        if (i3 == x) {
            if (i4 == -1) {
                if (intent == null) {
                    return false;
                }
                a(true);
                Uri data = intent.getData();
                if (data != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
                    sb.append(File.separator);
                    W1.d dVar = this.f2076m;
                    sb.append(android.support.v4.media.session.a.x(data, dVar));
                    String sb2 = sb.toString();
                    try {
                        OutputStream openOutputStream = dVar.getContentResolver().openOutputStream(data);
                        if (openOutputStream != null) {
                            openOutputStream.write(this.f2085v);
                            openOutputStream.flush();
                            openOutputStream.close();
                        }
                        c(sb2);
                        return true;
                    } catch (IOException e2) {
                        Log.i("FilePickerDelegate", "Error while saving file", e2);
                        b("Error while saving file", e2.getMessage());
                    }
                }
            }
            if (i4 == 0) {
                Log.i("FilePickerDelegate", "User cancelled the save request");
                c(null);
            }
            return false;
        } else if (this.f2080q == null) {
            return false;
        } else {
            int i5 = f2075w;
            if (i3 == i5 && i4 == -1) {
                a(true);
                new Thread(new P2.i(1, this, intent)).start();
                return true;
            } else if (i3 == i5 && i4 == 0) {
                Log.i("FilePickerDelegate", "User cancelled the picker request");
                c(null);
                return true;
            } else {
                if (i3 == i5) {
                    b("unknown_activity", "Unknown activity error, please fill an issue.");
                }
                return false;
            }
        }
    }
}
