package K;
/* loaded from: classes.dex */
public final class B extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public Q f503p;

    /* renamed from: q  reason: collision with root package name */
    public int f504q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ Object f505r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Q f506s;

    /* renamed from: t  reason: collision with root package name */
    public int f507t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(Q q3, w2.b bVar) {
        super(bVar);
        this.f506s = q3;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f505r = obj;
        this.f507t |= Integer.MIN_VALUE;
        return this.f506s.h(this);
    }
}
