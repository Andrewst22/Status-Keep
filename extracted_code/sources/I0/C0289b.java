package i0;

import D2.h;
import R.B;
import R.C;
import R.C0113p;
import R.E;
import R.F;
import U.A;
import U.AbstractC0123a;
import U.l;
import X.f;
import Y.AbstractC0135f;
import Y.D;
import Y.G;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
/* renamed from: i0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289b extends AbstractC0135f implements Handler.Callback {

    /* renamed from: D  reason: collision with root package name */
    public final C0288a f5945D;

    /* renamed from: E  reason: collision with root package name */
    public final D f5946E;

    /* renamed from: F  reason: collision with root package name */
    public final Handler f5947F;

    /* renamed from: G  reason: collision with root package name */
    public final F0.a f5948G;

    /* renamed from: H  reason: collision with root package name */
    public android.support.v4.media.session.a f5949H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f5950I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f5951J;

    /* renamed from: K  reason: collision with root package name */
    public long f5952K;
    public F L;

    /* renamed from: M  reason: collision with root package name */
    public long f5953M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.f, F0.a] */
    public C0289b(D d3, Looper looper) {
        super(5);
        Handler handler;
        C0288a c0288a = C0288a.f5944a;
        this.f5946E = d3;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.f5947F = handler;
        this.f5945D = c0288a;
        this.f5948G = new f(1);
        this.f5953M = -9223372036854775807L;
    }

    public final void B(F f3, ArrayList arrayList) {
        int i3 = 0;
        while (true) {
            E[] eArr = f3.f1770m;
            if (i3 < eArr.length) {
                C0113p c3 = eArr[i3].c();
                if (c3 != null) {
                    C0288a c0288a = this.f5945D;
                    if (c0288a.b(c3)) {
                        android.support.v4.media.session.a a3 = c0288a.a(c3);
                        byte[] b3 = eArr[i3].b();
                        b3.getClass();
                        F0.a aVar = this.f5948G;
                        aVar.e();
                        aVar.h(b3.length);
                        aVar.f2934q.put(b3);
                        aVar.i();
                        F m3 = a3.m(aVar);
                        if (m3 != null) {
                            B(m3, arrayList);
                        }
                        i3++;
                    }
                }
                arrayList.add(eArr[i3]);
                i3++;
            } else {
                return;
            }
        }
    }

    public final long C(long j3) {
        boolean z3;
        boolean z4 = false;
        if (j3 != -9223372036854775807L) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        if (this.f5953M != -9223372036854775807L) {
            z4 = true;
        }
        AbstractC0123a.j(z4);
        return j3 - this.f5953M;
    }

    public final void D(F f3) {
        D d3 = this.f5946E;
        G g3 = d3.f3021a;
        B a3 = g3.f3055c0.a();
        int i3 = 0;
        while (true) {
            E[] eArr = f3.f1770m;
            if (i3 >= eArr.length) {
                break;
            }
            eArr[i3].a(a3);
            i3++;
        }
        g3.f3055c0 = new C(a3);
        C j3 = g3.j();
        boolean equals = j3.equals(g3.f3036K);
        l lVar = g3.f3067l;
        if (!equals) {
            g3.f3036K = j3;
            lVar.c(14, new B0.a(d3, 9));
        }
        lVar.c(28, new B0.a(f3, 10));
        lVar.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            D((F) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // Y.AbstractC0135f
    public final String i() {
        return "MetadataRenderer";
    }

    @Override // Y.AbstractC0135f
    public final boolean k() {
        return this.f5951J;
    }

    @Override // Y.AbstractC0135f
    public final boolean l() {
        return true;
    }

    @Override // Y.AbstractC0135f
    public final void m() {
        this.L = null;
        this.f5949H = null;
        this.f5953M = -9223372036854775807L;
    }

    @Override // Y.AbstractC0135f
    public final void o(long j3, boolean z3) {
        this.L = null;
        this.f5950I = false;
        this.f5951J = false;
    }

    @Override // Y.AbstractC0135f
    public final void t(C0113p[] c0113pArr, long j3, long j4) {
        this.f5949H = this.f5945D.a(c0113pArr[0]);
        F f3 = this.L;
        if (f3 != null) {
            long j5 = this.f5953M;
            long j6 = f3.f1771n;
            long j7 = (j5 + j6) - j4;
            if (j6 != j7) {
                f3 = new F(j7, f3.f1770m);
            }
            this.L = f3;
        }
        this.f5953M = j4;
    }

    @Override // Y.AbstractC0135f
    public final void v(long j3, long j4) {
        boolean z3 = true;
        while (z3) {
            if (!this.f5950I && this.L == null) {
                F0.a aVar = this.f5948G;
                aVar.e();
                B1.a aVar2 = this.f3278o;
                aVar2.y();
                int u3 = u(aVar2, aVar, 0);
                if (u3 == -4) {
                    if (aVar.c(4)) {
                        this.f5950I = true;
                    } else if (aVar.f2936s >= this.x) {
                        aVar.f368v = this.f5952K;
                        aVar.i();
                        android.support.v4.media.session.a aVar3 = this.f5949H;
                        int i3 = A.f2405a;
                        F m3 = aVar3.m(aVar);
                        if (m3 != null) {
                            ArrayList arrayList = new ArrayList(m3.f1770m.length);
                            B(m3, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.L = new F(C(aVar.f2936s), (E[]) arrayList.toArray(new E[0]));
                            }
                        }
                    }
                } else if (u3 == -5) {
                    C0113p c0113p = (C0113p) aVar2.f51o;
                    c0113p.getClass();
                    this.f5952K = c0113p.f1979r;
                }
            }
            F f3 = this.L;
            if (f3 != null && f3.f1771n <= C(j3)) {
                F f4 = this.L;
                Handler handler = this.f5947F;
                if (handler != null) {
                    handler.obtainMessage(1, f4).sendToTarget();
                } else {
                    D(f4);
                }
                this.L = null;
                z3 = true;
            } else {
                z3 = false;
            }
            if (this.f5950I && this.L == null) {
                this.f5951J = true;
            }
        }
    }

    @Override // Y.AbstractC0135f
    public final int z(C0113p c0113p) {
        int i3;
        if (this.f5945D.b(c0113p)) {
            if (c0113p.f1960J == 0) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            return h.e(i3, 0, 0, 0);
        }
        return h.e(0, 0, 0, 0);
    }
}
