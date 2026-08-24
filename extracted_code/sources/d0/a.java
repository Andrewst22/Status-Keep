package D0;

import D1.G;
import D1.I;
import D1.b0;
import N.k;
import R.r;
import U.t;
import java.util.List;
import w0.C;
import w0.l;
import w0.o;
import w0.p;
import w0.q;
/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f180a;

    /* renamed from: b  reason: collision with root package name */
    public final t f181b;

    /* renamed from: c  reason: collision with root package name */
    public final C f182c;

    public a(int i3) {
        this.f180a = i3;
        switch (i3) {
            case 1:
                this.f181b = new t(4);
                this.f182c = new C(-1, -1, "image/webp");
                return;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                this.f181b = new t(4);
                this.f182c = new C(-1, -1, "image/avif");
                return;
            default:
                this.f181b = new t(4);
                this.f182c = new C(-1, -1, "image/heif");
                return;
        }
    }

    @Override // w0.o
    public final void b(long j3, long j4) {
        switch (this.f180a) {
            case 0:
                this.f182c.b(j3, j4);
                return;
            case 1:
                this.f182c.b(j3, j4);
                return;
            default:
                this.f182c.b(j3, j4);
                return;
        }
    }

    @Override // w0.o
    public final o d() {
        int i3 = this.f180a;
        return this;
    }

    @Override // w0.o
    public final boolean e(p pVar) {
        switch (this.f180a) {
            case 0:
                l lVar = (l) pVar;
                lVar.a(4, false);
                t tVar = this.f181b;
                tVar.D(4);
                lVar.p(tVar.f2477a, 0, 4, false);
                if (tVar.w() != 1718909296) {
                    return false;
                }
                tVar.D(4);
                lVar.p(tVar.f2477a, 0, 4, false);
                if (tVar.w() != 1751476579) {
                    return false;
                }
                return true;
            case 1:
                t tVar2 = this.f181b;
                tVar2.D(4);
                l lVar2 = (l) pVar;
                lVar2.p(tVar2.f2477a, 0, 4, false);
                if (tVar2.w() != 1380533830) {
                    return false;
                }
                lVar2.a(4, false);
                tVar2.D(4);
                lVar2.p(tVar2.f2477a, 0, 4, false);
                if (tVar2.w() != 1464156752) {
                    return false;
                }
                return true;
            default:
                l lVar3 = (l) pVar;
                lVar3.a(4, false);
                t tVar3 = this.f181b;
                tVar3.D(4);
                lVar3.p(tVar3.f2477a, 0, 4, false);
                if (tVar3.w() != 1718909296) {
                    return false;
                }
                tVar3.D(4);
                lVar3.p(tVar3.f2477a, 0, 4, false);
                if (tVar3.w() != 1635150182) {
                    return false;
                }
                return true;
        }
    }

    @Override // w0.o
    public final int f(p pVar, r rVar) {
        switch (this.f180a) {
            case 0:
                return this.f182c.f(pVar, rVar);
            case 1:
                return this.f182c.f(pVar, rVar);
            default:
                return this.f182c.f(pVar, rVar);
        }
    }

    @Override // w0.o
    public final void h(q qVar) {
        switch (this.f180a) {
            case 0:
                this.f182c.h(qVar);
                return;
            case 1:
                this.f182c.h(qVar);
                return;
            default:
                this.f182c.h(qVar);
                return;
        }
    }

    @Override // w0.o
    public final List l() {
        switch (this.f180a) {
            case 0:
                G g3 = I.f197n;
                return b0.f231q;
            case 1:
                G g4 = I.f197n;
                return b0.f231q;
            default:
                G g5 = I.f197n;
                return b0.f231q;
        }
    }

    @Override // w0.o
    public final void release() {
        int i3 = this.f180a;
    }

    private final void a() {
    }

    private final void c() {
    }

    private final void g() {
    }
}
