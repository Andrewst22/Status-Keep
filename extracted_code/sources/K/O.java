package K;
/* loaded from: classes.dex */
public final class O extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public D2.o f556p;

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ Object f557q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Q f558r;

    /* renamed from: s  reason: collision with root package name */
    public int f559s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Q q3, w2.b bVar) {
        super(bVar);
        this.f558r = q3;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f557q = obj;
        this.f559s |= Integer.MIN_VALUE;
        return this.f558r.j(null, false, this);
    }
}
