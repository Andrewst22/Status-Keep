package K;
/* loaded from: classes.dex */
public final class V extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public C0059m f584p;

    /* renamed from: q  reason: collision with root package name */
    public S2.a f585q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ Object f586r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ C0059m f587s;

    /* renamed from: t  reason: collision with root package name */
    public int f588t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C0059m c0059m, w2.b bVar) {
        super(bVar);
        this.f587s = c0059m;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f586r = obj;
        this.f588t |= Integer.MIN_VALUE;
        return this.f587s.l(this);
    }
}
