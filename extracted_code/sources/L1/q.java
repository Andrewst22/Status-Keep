package L1;
/* loaded from: classes.dex */
public final class q implements I1.s {

    /* renamed from: m  reason: collision with root package name */
    public final P1.a f926m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f927n;

    /* renamed from: o  reason: collision with root package name */
    public final z1.b f928o;

    public q(z1.b bVar, P1.a aVar, boolean z3) {
        this.f928o = bVar;
        this.f926m = aVar;
        this.f927n = z3;
    }

    @Override // I1.s
    public final I1.r create(I1.k kVar, P1.a aVar) {
        P1.a aVar2 = this.f926m;
        if (aVar2 != null) {
            if (!aVar2.equals(aVar) && (!this.f927n || aVar2.f1466b != aVar.f1465a)) {
                return null;
            }
            return new r(this.f928o, kVar, aVar, this);
        }
        throw null;
    }
}
