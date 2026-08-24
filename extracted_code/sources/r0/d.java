package R0;

import D1.G;
import D1.I;
import D1.b0;
import R.H;
import U.A;
import U.t;
import java.util.List;
import w0.AbstractC0892b;
import w0.l;
import w0.o;
import w0.p;
import w0.q;
/* loaded from: classes.dex */
public final class d implements o {

    /* renamed from: a  reason: collision with root package name */
    public q f2027a;

    /* renamed from: b  reason: collision with root package name */
    public i f2028b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2029c;

    public final boolean a(l lVar) {
        boolean z3;
        f fVar = new f();
        if (fVar.a(lVar, true) && (fVar.f2035a & 2) == 2) {
            int min = Math.min(fVar.f2039e, 8);
            t tVar = new t(min);
            lVar.p(tVar.f2477a, 0, min, false);
            tVar.G(0);
            if (tVar.a() >= 5 && tVar.u() == 127 && tVar.w() == 1179402563) {
                this.f2028b = new i();
            } else {
                tVar.G(0);
                try {
                    z3 = AbstractC0892b.w(1, tVar, true);
                } catch (H unused) {
                    z3 = false;
                }
                if (z3) {
                    this.f2028b = new i();
                } else {
                    tVar.G(0);
                    if (h.e(tVar, h.f2042o)) {
                        this.f2028b = new i();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // w0.o
    public final void b(long j3, long j4) {
        i iVar = this.f2028b;
        if (iVar != null) {
            e eVar = iVar.f2045a;
            f fVar = (f) eVar.f2033p;
            fVar.f2035a = 0;
            fVar.f2036b = 0L;
            fVar.f2037c = 0;
            fVar.f2038d = 0;
            fVar.f2039e = 0;
            ((t) eVar.f2034q).D(0);
            eVar.f2030m = -1;
            eVar.f2032o = false;
            if (j3 == 0) {
                iVar.d(!iVar.f2056l);
            } else if (iVar.f2052h != 0) {
                long j5 = (iVar.f2053i * j4) / 1000000;
                iVar.f2049e = j5;
                g gVar = iVar.f2048d;
                int i3 = A.f2405a;
                gVar.j(j5);
                iVar.f2052h = 2;
            }
        }
    }

    @Override // w0.o
    public final o d() {
        return this;
    }

    @Override // w0.o
    public final boolean e(p pVar) {
        try {
            return a((l) pVar);
        } catch (H unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x018a  */
    @Override // w0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(w0.p r21, R.r r22) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.d.f(w0.p, R.r):int");
    }

    @Override // w0.o
    public final void h(q qVar) {
        this.f2027a = qVar;
    }

    @Override // w0.o
    public final List l() {
        G g3 = I.f197n;
        return b0.f231q;
    }

    @Override // w0.o
    public final void release() {
    }
}
