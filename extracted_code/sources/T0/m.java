package T0;

import D1.G;
import D1.I;
import D1.b0;
import R.r;
import android.util.SparseArray;
import java.util.List;
import w0.p;
import w0.q;
/* loaded from: classes.dex */
public final class m implements w0.o {

    /* renamed from: a  reason: collision with root package name */
    public final w0.o f2325a;

    /* renamed from: b  reason: collision with root package name */
    public final B1.b f2326b;

    /* renamed from: c  reason: collision with root package name */
    public B1.e f2327c;

    public m(w0.o oVar, B1.b bVar) {
        this.f2325a = oVar;
        this.f2326b = bVar;
    }

    @Override // w0.o
    public final void b(long j3, long j4) {
        B1.e eVar = this.f2327c;
        if (eVar != null) {
            int i3 = 0;
            while (true) {
                SparseArray sparseArray = (SparseArray) eVar.f58p;
                if (i3 >= sparseArray.size()) {
                    break;
                }
                l lVar = ((o) sparseArray.valueAt(i3)).f2337g;
                if (lVar != null) {
                    lVar.b();
                }
                i3++;
            }
        }
        this.f2325a.b(j3, j4);
    }

    @Override // w0.o
    public final w0.o d() {
        return this.f2325a;
    }

    @Override // w0.o
    public final boolean e(p pVar) {
        return this.f2325a.e(pVar);
    }

    @Override // w0.o
    public final int f(p pVar, r rVar) {
        return this.f2325a.f(pVar, rVar);
    }

    @Override // w0.o
    public final void h(q qVar) {
        B1.e eVar = new B1.e(qVar, this.f2326b);
        this.f2327c = eVar;
        this.f2325a.h(eVar);
    }

    @Override // w0.o
    public final List l() {
        G g3 = I.f197n;
        return b0.f231q;
    }

    @Override // w0.o
    public final void release() {
        this.f2325a.release();
    }
}
