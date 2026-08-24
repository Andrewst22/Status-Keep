package K1;
/* loaded from: classes.dex */
public final class e extends I1.r {

    /* renamed from: a  reason: collision with root package name */
    public I1.r f744a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f745b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f746c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ I1.k f747d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ P1.a f748e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f f749f;

    public e(f fVar, boolean z3, boolean z4, I1.k kVar, P1.a aVar) {
        this.f749f = fVar;
        this.f745b = z3;
        this.f746c = z4;
        this.f747d = kVar;
        this.f748e = aVar;
    }

    @Override // I1.r
    public final Object a(Q1.b bVar) {
        if (this.f745b) {
            bVar.B();
            return null;
        }
        I1.r rVar = this.f744a;
        if (rVar == null) {
            rVar = this.f747d.d(this.f749f, this.f748e);
            this.f744a = rVar;
        }
        return rVar.a(bVar);
    }

    @Override // I1.r
    public final void b(Q1.c cVar, Object obj) {
        if (this.f746c) {
            cVar.j();
            return;
        }
        I1.r rVar = this.f744a;
        if (rVar == null) {
            rVar = this.f747d.d(this.f749f, this.f748e);
            this.f744a = rVar;
        }
        rVar.b(cVar, obj);
    }
}
