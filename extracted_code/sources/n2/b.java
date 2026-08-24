package N2;
/* loaded from: classes.dex */
public final class b extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public M2.p f1119p;

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ Object f1120q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ c f1121r;

    /* renamed from: s  reason: collision with root package name */
    public int f1122s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, w2.b bVar) {
        super(bVar);
        this.f1121r = cVar;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f1120q = obj;
        this.f1122s |= Integer.MIN_VALUE;
        return this.f1121r.a(null, this);
    }
}
