package o0;
/* loaded from: classes.dex */
public final class Z implements U {

    /* renamed from: m  reason: collision with root package name */
    public final U f8566m;

    /* renamed from: n  reason: collision with root package name */
    public final long f8567n;

    public Z(U u3, long j3) {
        this.f8566m = u3;
        this.f8567n = j3;
    }

    @Override // o0.U
    public final void a() {
        this.f8566m.a();
    }

    @Override // o0.U
    public final boolean f() {
        return this.f8566m.f();
    }

    @Override // o0.U
    public final int i(B1.a aVar, X.f fVar, int i3) {
        int i4 = this.f8566m.i(aVar, fVar, i3);
        if (i4 == -4) {
            fVar.f2936s += this.f8567n;
        }
        return i4;
    }

    @Override // o0.U
    public final int n(long j3) {
        return this.f8566m.n(j3 - this.f8567n);
    }
}
