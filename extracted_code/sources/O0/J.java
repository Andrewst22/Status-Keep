package o0;

import U.AbstractC0123a;
import a.AbstractC0155a;
import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class J implements s0.k {

    /* renamed from: n  reason: collision with root package name */
    public final Uri f8439n;

    /* renamed from: o  reason: collision with root package name */
    public final W.A f8440o;

    /* renamed from: p  reason: collision with root package name */
    public final B1.e f8441p;

    /* renamed from: q  reason: collision with root package name */
    public final M f8442q;

    /* renamed from: r  reason: collision with root package name */
    public final U.c f8443r;

    /* renamed from: t  reason: collision with root package name */
    public volatile boolean f8445t;

    /* renamed from: v  reason: collision with root package name */
    public long f8447v;
    public w0.G x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f8449y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ M f8450z;

    /* renamed from: s  reason: collision with root package name */
    public final R.r f8444s = new Object();

    /* renamed from: u  reason: collision with root package name */
    public boolean f8446u = true;

    /* renamed from: m  reason: collision with root package name */
    public final long f8438m = r.f8633b.getAndIncrement();

    /* renamed from: w  reason: collision with root package name */
    public W.l f8448w = a(0);

    /* JADX WARN: Type inference failed for: r1v2, types: [R.r, java.lang.Object] */
    public J(M m3, Uri uri, W.h hVar, B1.e eVar, M m4, U.c cVar) {
        this.f8450z = m3;
        this.f8439n = uri;
        this.f8440o = new W.A(hVar);
        this.f8441p = eVar;
        this.f8442q = m4;
        this.f8443r = cVar;
    }

    public final W.l a(long j3) {
        Collections.emptyMap();
        this.f8450z.getClass();
        Map map = M.f8455Z;
        Uri uri = this.f8439n;
        AbstractC0123a.l(uri, "The uri must be set.");
        return new W.l(uri, 1, null, map, j3, -1L, null, 6);
    }

    @Override // s0.k
    public final void b() {
        W.h hVar;
        w0.o oVar;
        int i3;
        int i4 = 0;
        while (i4 == 0 && !this.f8445t) {
            try {
                long j3 = this.f8444s.f1989a;
                W.l a3 = a(j3);
                this.f8448w = a3;
                long j4 = this.f8440o.j(a3);
                if (this.f8445t) {
                    if (i4 != 1 && this.f8441p.a0() != -1) {
                        this.f8444s.f1989a = this.f8441p.a0();
                    }
                    AbstractC0155a.r(this.f8440o);
                    return;
                }
                if (j4 != -1) {
                    j4 += j3;
                    M m3 = this.f8450z;
                    m3.f8458B.post(new H(m3, 0));
                }
                long j5 = j4;
                this.f8450z.f8460D = J0.b.d(this.f8440o.f2722m.x());
                W.A a4 = this.f8440o;
                J0.b bVar = this.f8450z.f8460D;
                if (bVar != null && (i3 = bVar.f491r) != -1) {
                    hVar = new C0693q(a4, i3, this);
                    M m4 = this.f8450z;
                    m4.getClass();
                    w0.G C3 = m4.C(new L(0, true));
                    this.x = C3;
                    C3.c(M.f8456a0);
                } else {
                    hVar = a4;
                }
                long j6 = j3;
                this.f8441p.i0(hVar, this.f8439n, this.f8440o.f2722m.x(), j3, j5, this.f8442q);
                if (this.f8450z.f8460D != null && (oVar = (w0.o) this.f8441p.f57o) != null) {
                    w0.o d3 = oVar.d();
                    if (d3 instanceof P0.d) {
                        ((P0.d) d3).f1450r = true;
                    }
                }
                if (this.f8446u) {
                    B1.e eVar = this.f8441p;
                    long j7 = this.f8447v;
                    w0.o oVar2 = (w0.o) eVar.f57o;
                    oVar2.getClass();
                    oVar2.b(j6, j7);
                    this.f8446u = false;
                }
                while (true) {
                    long j8 = j6;
                    while (i4 == 0 && !this.f8445t) {
                        try {
                            U.c cVar = this.f8443r;
                            synchronized (cVar) {
                                while (!cVar.f2428a) {
                                    cVar.wait();
                                }
                            }
                            B1.e eVar2 = this.f8441p;
                            R.r rVar = this.f8444s;
                            w0.o oVar3 = (w0.o) eVar2.f57o;
                            oVar3.getClass();
                            w0.l lVar = (w0.l) eVar2.f58p;
                            lVar.getClass();
                            i4 = oVar3.f(lVar, rVar);
                            j6 = this.f8441p.a0();
                            if (j6 > this.f8450z.f8489u + j8) {
                                break;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    this.f8443r.a();
                    M m5 = this.f8450z;
                    m5.f8458B.post(m5.f8457A);
                }
                if (i4 == 1) {
                    i4 = 0;
                } else if (this.f8441p.a0() != -1) {
                    this.f8444s.f1989a = this.f8441p.a0();
                }
                AbstractC0155a.r(this.f8440o);
            } catch (Throwable th) {
                if (i4 != 1 && this.f8441p.a0() != -1) {
                    this.f8444s.f1989a = this.f8441p.a0();
                }
                AbstractC0155a.r(this.f8440o);
                throw th;
            }
        }
    }

    @Override // s0.k
    public final void c() {
        this.f8445t = true;
    }
}
