package U;

import R.H;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: e  reason: collision with root package name */
    public static r f2464e;

    /* renamed from: a  reason: collision with root package name */
    public int f2465a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2466b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2467c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f2468d;

    public r(int i3, String str, String str2, String str3) {
        this.f2465a = i3;
        this.f2466b = str;
        this.f2467c = str2;
        this.f2468d = str3;
    }

    public static void a(int i3, r rVar) {
        synchronized (rVar.f2468d) {
            try {
                if (rVar.f2465a != i3) {
                    rVar.f2465a = i3;
                    Iterator it = ((CopyOnWriteArrayList) rVar.f2467c).iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        s0.f fVar = (s0.f) weakReference.get();
                        if (fVar != null) {
                            fVar.a(i3);
                        } else {
                            ((CopyOnWriteArrayList) rVar.f2467c).remove(weakReference);
                        }
                    }
                }
            } finally {
            }
        }
    }

    public static synchronized r c(Context context) {
        r rVar;
        synchronized (r.class) {
            try {
                if (f2464e == null) {
                    f2464e = new r(context);
                }
                rVar = f2464e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    public String b(c0.t tVar, Uri uri, int i3) {
        int i4 = this.f2465a;
        if (i4 != 1) {
            if (i4 == 2) {
                String str = (String) this.f2467c;
                String str2 = (String) this.f2466b;
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    String h3 = k0.z.h(i3);
                    Charset charset = k0.y.f7686s;
                    String Y2 = A.Y(messageDigest.digest((A.Y(messageDigest.digest((tVar.f4784b + ":" + str2 + ":" + tVar.f4785c).getBytes(charset))) + ":" + str + ":" + A.Y(messageDigest.digest((h3 + ":" + uri).getBytes(charset)))).getBytes(charset)));
                    String str3 = (String) this.f2468d;
                    if (str3.isEmpty()) {
                        return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", tVar.f4784b, str2, str, uri, Y2);
                    }
                    return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", tVar.f4784b, str2, str, uri, Y2, str3);
                } catch (NoSuchAlgorithmException e2) {
                    throw new H(null, e2, false, 4);
                }
            }
            throw new H(null, new UnsupportedOperationException(), false, 4);
        }
        String encodeToString = Base64.encodeToString((tVar.f4784b + ":" + tVar.f4785c).getBytes(k0.y.f7686s), 0);
        int i5 = A.f2405a;
        Locale locale = Locale.US;
        return D2.h.l("Basic ", encodeToString);
    }

    public int d() {
        int i3;
        synchronized (this.f2468d) {
            i3 = this.f2465a;
        }
        return i3;
    }

    public int e() {
        int i3 = this.f2465a;
        if (i3 != 2) {
            if (i3 != 3) {
                return 0;
            }
            return 512;
        }
        return 2048;
    }

    public r(Context context) {
        this.f2466b = new Handler(Looper.getMainLooper());
        this.f2467c = new CopyOnWriteArrayList();
        this.f2468d = new Object();
        this.f2465a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new q(this, 0), intentFilter);
    }

    public r(int i3, String str, int i4, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f2466b = str;
        this.f2465a = i4;
        if (arrayList == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f2467c = unmodifiableList;
        this.f2468d = bArr;
    }
}
