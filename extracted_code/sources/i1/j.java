package I1;
/* loaded from: classes.dex */
public final class j extends r {

    /* renamed from: a  reason: collision with root package name */
    public r f467a;

    @Override // I1.r
    public final Object a(Q1.b bVar) {
        r rVar = this.f467a;
        if (rVar != null) {
            return rVar.a(bVar);
        }
        throw new IllegalStateException();
    }

    @Override // I1.r
    public final void b(Q1.c cVar, Object obj) {
        r rVar = this.f467a;
        if (rVar != null) {
            rVar.b(cVar, obj);
            return;
        }
        throw new IllegalStateException();
    }
}
