package b0;

import p0.AbstractC0729b;
/* loaded from: classes.dex */
public final class j extends AbstractC0729b {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f4595p = 0;

    /* renamed from: q  reason: collision with root package name */
    public final Object f4596q;

    public j(n0.b bVar, int i3) {
        super(i3, bVar.f8353k - 1);
        this.f4596q = bVar;
    }

    @Override // p0.m
    public final long e() {
        switch (this.f4595p) {
            case 0:
                a();
                return ((i) this.f4596q).e(this.f8760o);
            default:
                return ((n0.b) this.f4596q).b((int) this.f8760o) + k();
        }
    }

    @Override // p0.m
    public final long k() {
        switch (this.f4595p) {
            case 0:
                a();
                return ((i) this.f4596q).f(this.f8760o);
            default:
                a();
                return ((n0.b) this.f4596q).f8357o[(int) this.f8760o];
        }
    }

    public j(i iVar, long j3, long j4) {
        super(j3, j4);
        this.f4596q = iVar;
    }
}
