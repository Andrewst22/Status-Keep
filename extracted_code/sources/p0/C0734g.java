package p0;

import U.AbstractC0123a;
import o0.T;
import o0.U;
/* renamed from: p0.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0734g implements U {

    /* renamed from: m  reason: collision with root package name */
    public final C0735h f8787m;

    /* renamed from: n  reason: collision with root package name */
    public final T f8788n;

    /* renamed from: o  reason: collision with root package name */
    public final int f8789o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f8790p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ C0735h f8791q;

    public C0734g(C0735h c0735h, C0735h c0735h2, T t3, int i3) {
        this.f8791q = c0735h;
        this.f8787m = c0735h2;
        this.f8788n = t3;
        this.f8789o = i3;
    }

    public final void b() {
        if (!this.f8790p) {
            C0735h c0735h = this.f8791q;
            d0.d dVar = c0735h.f8807s;
            int[] iArr = c0735h.f8802n;
            int i3 = this.f8789o;
            dVar.a(iArr[i3], c0735h.f8803o[i3], 0, null, c0735h.f8797F);
            this.f8790p = true;
        }
    }

    public final void c() {
        C0735h c0735h = this.f8791q;
        boolean[] zArr = c0735h.f8804p;
        int i3 = this.f8789o;
        AbstractC0123a.j(zArr[i3]);
        c0735h.f8804p[i3] = false;
    }

    @Override // o0.U
    public final boolean f() {
        C0735h c0735h = this.f8791q;
        if (!c0735h.y() && this.f8788n.w(c0735h.f8800I)) {
            return true;
        }
        return false;
    }

    @Override // o0.U
    public final int i(B1.a aVar, X.f fVar, int i3) {
        C0735h c0735h = this.f8791q;
        if (c0735h.y()) {
            return -3;
        }
        AbstractC0728a abstractC0728a = c0735h.f8799H;
        T t3 = this.f8788n;
        if (abstractC0728a != null && abstractC0728a.e(this.f8789o + 1) <= t3.r()) {
            return -3;
        }
        b();
        return t3.B(aVar, fVar, i3, c0735h.f8800I);
    }

    @Override // o0.U
    public final int n(long j3) {
        C0735h c0735h = this.f8791q;
        if (c0735h.y()) {
            return 0;
        }
        boolean z3 = c0735h.f8800I;
        T t3 = this.f8788n;
        int t4 = t3.t(j3, z3);
        AbstractC0728a abstractC0728a = c0735h.f8799H;
        if (abstractC0728a != null) {
            t4 = Math.min(t4, abstractC0728a.e(this.f8789o + 1) - t3.r());
        }
        t3.H(t4);
        if (t4 > 0) {
            b();
        }
        return t4;
    }

    @Override // o0.U
    public final void a() {
    }
}
