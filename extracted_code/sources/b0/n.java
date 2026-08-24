package b0;

import R.C0113p;
import R.H;
import R.InterfaceC0107j;
import U.A;
import U.t;
import android.os.Handler;
import o0.P;
import o0.T;
import w0.F;
import w0.G;
/* loaded from: classes.dex */
public final class n implements G {

    /* renamed from: a  reason: collision with root package name */
    public final T f4621a;

    /* renamed from: b  reason: collision with root package name */
    public final B1.a f4622b = new B1.a(13, false);

    /* renamed from: c  reason: collision with root package name */
    public final F0.a f4623c = new X.f(1);

    /* renamed from: d  reason: collision with root package name */
    public long f4624d = -9223372036854775807L;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ o f4625e;

    /* JADX WARN: Type inference failed for: r2v3, types: [X.f, F0.a] */
    public n(o oVar, s0.e eVar) {
        this.f4625e = oVar;
        this.f4621a = new T(eVar, null, null);
    }

    @Override // w0.G
    public final void a(t tVar, int i3, int i4) {
        T t3 = this.f4621a;
        t3.getClass();
        t3.a(tVar, i3, 0);
    }

    @Override // w0.G
    public final void b(long j3, int i3, int i4, int i5, F f3) {
        long h3;
        long j4;
        this.f4621a.b(j3, i3, i4, i5, f3);
        while (this.f4621a.w(false)) {
            F0.a aVar = this.f4623c;
            aVar.e();
            if (this.f4621a.B(this.f4622b, aVar, 0, false) == -4) {
                aVar.i();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j5 = aVar.f2936s;
                R.F m3 = this.f4625e.f4628o.m(aVar);
                if (m3 != null) {
                    H0.a aVar2 = (H0.a) m3.f1770m[0];
                    String str = aVar2.f431m;
                    String str2 = aVar2.f432n;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j4 = A.P(A.p(aVar2.f435q));
                        } catch (H unused) {
                            j4 = -9223372036854775807L;
                        }
                        if (j4 != -9223372036854775807L) {
                            m mVar = new m(j5, j4);
                            Handler handler = this.f4625e.f4629p;
                            handler.sendMessage(handler.obtainMessage(1, mVar));
                        }
                    }
                }
            }
        }
        T t3 = this.f4621a;
        P p3 = t3.f8525a;
        synchronized (t3) {
            int i6 = t3.f8543s;
            if (i6 == 0) {
                h3 = -1;
            } else {
                h3 = t3.h(i6);
            }
        }
        p3.b(h3);
    }

    @Override // w0.G
    public final void c(C0113p c0113p) {
        this.f4621a.c(c0113p);
    }

    @Override // w0.G
    public final int d(InterfaceC0107j interfaceC0107j, int i3, boolean z3) {
        return e(interfaceC0107j, i3, z3);
    }

    @Override // w0.G
    public final int e(InterfaceC0107j interfaceC0107j, int i3, boolean z3) {
        T t3 = this.f4621a;
        t3.getClass();
        return t3.e(interfaceC0107j, i3, z3);
    }

    @Override // w0.G
    public final void f(int i3, t tVar) {
        a(tVar, i3, 0);
    }
}
