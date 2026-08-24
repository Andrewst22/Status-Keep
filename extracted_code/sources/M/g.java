package M;
/* loaded from: classes.dex */
public final class g extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public i f992p;

    /* renamed from: q  reason: collision with root package name */
    public c f993q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f994r;

    /* renamed from: s  reason: collision with root package name */
    public /* synthetic */ Object f995s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ i f996t;

    /* renamed from: u  reason: collision with root package name */
    public int f997u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, w2.b bVar) {
        super(bVar);
        this.f996t = iVar;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f995s = obj;
        this.f997u |= Integer.MIN_VALUE;
        return this.f996t.a(null, this);
    }
}
