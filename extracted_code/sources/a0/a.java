package A0;

import D1.G;
import D1.I;
import D1.b0;
import R.r;
import java.util.List;
import w0.C;
import w0.o;
import w0.p;
import w0.q;
/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20a;

    /* renamed from: b  reason: collision with root package name */
    public final o f21b;

    public a(int i3, byte b3) {
        this.f20a = i3;
        switch (i3) {
            case 1:
                this.f21b = new C(35152, 2, "image/png");
                return;
            default:
                this.f21b = new C(16973, 2, "image/bmp");
                return;
        }
    }

    @Override // w0.o
    public final void b(long j3, long j4) {
        switch (this.f20a) {
            case 0:
                ((C) this.f21b).b(j3, j4);
                return;
            case 1:
                ((C) this.f21b).b(j3, j4);
                return;
            default:
                this.f21b.b(j3, j4);
                return;
        }
    }

    @Override // w0.o
    public final o d() {
        int i3 = this.f20a;
        return this;
    }

    @Override // w0.o
    public final boolean e(p pVar) {
        switch (this.f20a) {
            case 0:
                return ((C) this.f21b).e(pVar);
            case 1:
                return ((C) this.f21b).e(pVar);
            default:
                return this.f21b.e(pVar);
        }
    }

    @Override // w0.o
    public final int f(p pVar, r rVar) {
        switch (this.f20a) {
            case 0:
                return ((C) this.f21b).f(pVar, rVar);
            case 1:
                return ((C) this.f21b).f(pVar, rVar);
            default:
                return this.f21b.f(pVar, rVar);
        }
    }

    @Override // w0.o
    public final void h(q qVar) {
        switch (this.f20a) {
            case 0:
                ((C) this.f21b).h(qVar);
                return;
            case 1:
                ((C) this.f21b).h(qVar);
                return;
            default:
                this.f21b.h(qVar);
                return;
        }
    }

    @Override // w0.o
    public final List l() {
        switch (this.f20a) {
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
        switch (this.f20a) {
            case 0:
            case 1:
                return;
            default:
                this.f21b.release();
                return;
        }
    }

    public a(int i3) {
        this.f20a = 2;
        if ((i3 & 1) != 0) {
            this.f21b = new C(65496, 2, "image/jpeg");
        } else {
            this.f21b = new E0.a();
        }
    }

    private final void a() {
    }

    private final void c() {
    }
}
