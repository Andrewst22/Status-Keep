package K;
/* loaded from: classes.dex */
public final class X extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public Object f592p;

    /* renamed from: q  reason: collision with root package name */
    public S2.d f593q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ Object f594r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ a0 f595s;

    /* renamed from: t  reason: collision with root package name */
    public int f596t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(a0 a0Var, w2.b bVar) {
        super(bVar);
        this.f595s = a0Var;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f594r = obj;
        this.f596t |= Integer.MIN_VALUE;
        return this.f595s.b(null, this);
    }
}
