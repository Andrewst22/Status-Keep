package o0;

import java.io.IOException;
/* loaded from: classes.dex */
public final class K implements U {

    /* renamed from: m  reason: collision with root package name */
    public final int f8451m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ M f8452n;

    public K(M m3, int i3) {
        this.f8452n = m3;
        this.f8451m = i3;
    }

    @Override // o0.U
    public final void a() {
        M m3 = this.f8452n;
        m3.f8461E[this.f8451m].y();
        int u3 = m3.f8484p.u(m3.f8470O);
        s0.n nVar = m3.f8491w;
        IOException iOException = nVar.f9203o;
        if (iOException == null) {
            s0.j jVar = nVar.f9202n;
            if (jVar != null) {
                if (u3 == Integer.MIN_VALUE) {
                    u3 = jVar.f9188m;
                }
                IOException iOException2 = jVar.f9192q;
                if (iOException2 != null && jVar.f9193r > u3) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override // o0.U
    public final boolean f() {
        M m3 = this.f8452n;
        if (!m3.E() && m3.f8461E[this.f8451m].w(m3.f8479X)) {
            return true;
        }
        return false;
    }

    @Override // o0.U
    public final int i(B1.a aVar, X.f fVar, int i3) {
        M m3 = this.f8452n;
        if (m3.E()) {
            return -3;
        }
        int i4 = this.f8451m;
        m3.A(i4);
        int B3 = m3.f8461E[i4].B(aVar, fVar, i3, m3.f8479X);
        if (B3 == -3) {
            m3.B(i4);
        }
        return B3;
    }

    @Override // o0.U
    public final int n(long j3) {
        M m3 = this.f8452n;
        if (m3.E()) {
            return 0;
        }
        int i3 = this.f8451m;
        m3.A(i3);
        T t3 = m3.f8461E[i3];
        int t4 = t3.t(j3, m3.f8479X);
        t3.H(t4);
        if (t4 == 0) {
            m3.B(i3);
            return t4;
        }
        return t4;
    }
}
