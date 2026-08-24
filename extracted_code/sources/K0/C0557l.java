package k0;

import D1.g0;
import U.AbstractC0123a;
import android.net.Uri;
import android.util.SparseArray;
import g2.C0276a;
import java.io.Closeable;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Locale;
import javax.net.SocketFactory;
/* renamed from: k0.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0557l implements Closeable {

    /* renamed from: B  reason: collision with root package name */
    public boolean f7614B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f7615C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f7616D;

    /* renamed from: m  reason: collision with root package name */
    public final C0558m f7618m;

    /* renamed from: n  reason: collision with root package name */
    public final C0558m f7619n;

    /* renamed from: o  reason: collision with root package name */
    public final String f7620o;

    /* renamed from: p  reason: collision with root package name */
    public final SocketFactory f7621p;

    /* renamed from: t  reason: collision with root package name */
    public Uri f7625t;

    /* renamed from: v  reason: collision with root package name */
    public c0.t f7627v;

    /* renamed from: w  reason: collision with root package name */
    public String f7628w;

    /* renamed from: y  reason: collision with root package name */
    public RunnableC0556k f7629y;

    /* renamed from: z  reason: collision with root package name */
    public U.r f7630z;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayDeque f7622q = new ArrayDeque();

    /* renamed from: r  reason: collision with root package name */
    public final SparseArray f7623r = new SparseArray();

    /* renamed from: s  reason: collision with root package name */
    public final B0.b f7624s = new B0.b(this);

    /* renamed from: u  reason: collision with root package name */
    public y f7626u = new y(new C0276a(this));
    public long x = 60000;

    /* renamed from: E  reason: collision with root package name */
    public long f7617E = -9223372036854775807L;

    /* renamed from: A  reason: collision with root package name */
    public int f7613A = -1;

    public C0557l(C0558m c0558m, C0558m c0558m2, String str, Uri uri, SocketFactory socketFactory) {
        this.f7618m = c0558m;
        this.f7619n = c0558m2;
        this.f7620o = str;
        this.f7621p = socketFactory;
        this.f7625t = z.f(uri);
        this.f7627v = z.d(uri);
    }

    public static void c(C0557l c0557l, A2.b bVar) {
        c0557l.getClass();
        if (c0557l.f7614B) {
            c0557l.f7619n.m(bVar);
            return;
        }
        String message = bVar.getMessage();
        if (message == null) {
            message = "";
        }
        c0557l.f7618m.o(message, bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RunnableC0556k runnableC0556k = this.f7629y;
        if (runnableC0556k != null) {
            runnableC0556k.close();
            this.f7629y = null;
            Uri uri = this.f7625t;
            String str = this.f7628w;
            str.getClass();
            B0.b bVar = this.f7624s;
            C0557l c0557l = (C0557l) bVar.f29p;
            int i3 = c0557l.f7613A;
            if (i3 != -1 && i3 != 0) {
                c0557l.f7613A = 0;
                bVar.k(bVar.e(12, str, g0.f255s, uri));
            }
        }
        this.f7626u.close();
    }

    public final void f() {
        long j3;
        p pVar = (p) this.f7622q.pollFirst();
        if (pVar == null) {
            r rVar = (r) this.f7619n.f7632n;
            long j4 = rVar.f7666z;
            if (j4 != -9223372036854775807L) {
                j3 = U.A.Z(j4);
            } else {
                long j5 = rVar.f7646A;
                if (j5 != -9223372036854775807L) {
                    j3 = U.A.Z(j5);
                } else {
                    j3 = 0;
                }
            }
            rVar.f7657p.i(j3);
            return;
        }
        Uri a3 = pVar.a();
        AbstractC0123a.k(pVar.f7638c);
        String str = pVar.f7638c;
        String str2 = this.f7628w;
        B0.b bVar = this.f7624s;
        ((C0557l) bVar.f29p).f7613A = 0;
        D1.r.d("Transport", str);
        bVar.k(bVar.e(10, str2, g0.b(1, new Object[]{"Transport", str}, null), a3));
    }

    public final Socket g(Uri uri) {
        boolean z3;
        int i3;
        if (uri.getHost() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        if (uri.getPort() > 0) {
            i3 = uri.getPort();
        } else {
            i3 = 554;
        }
        String host = uri.getHost();
        host.getClass();
        return this.f7621p.createSocket(host, i3);
    }

    public final void h(long j3) {
        boolean z3;
        if (this.f7613A == 2 && !this.f7616D) {
            Uri uri = this.f7625t;
            String str = this.f7628w;
            str.getClass();
            B0.b bVar = this.f7624s;
            C0557l c0557l = (C0557l) bVar.f29p;
            if (c0557l.f7613A == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0123a.j(z3);
            bVar.k(bVar.e(5, str, g0.f255s, uri));
            c0557l.f7616D = true;
        }
        this.f7617E = j3;
    }

    public final void i(long j3) {
        boolean z3;
        Uri uri = this.f7625t;
        String str = this.f7628w;
        str.getClass();
        B0.b bVar = this.f7624s;
        int i3 = ((C0557l) bVar.f29p).f7613A;
        if (i3 != 1 && i3 != 2) {
            z3 = false;
        } else {
            z3 = true;
        }
        AbstractC0123a.j(z3);
        C0539B c0539b = C0539B.f7501c;
        Object[] objArr = {Double.valueOf(j3 / 1000.0d)};
        int i4 = U.A.f2405a;
        bVar.k(bVar.e(6, str, g0.b(1, new Object[]{"Range", String.format(Locale.US, "npt=%.3f-", objArr)}, null), uri));
    }
}
