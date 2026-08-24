package K;
/* renamed from: K.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067v extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public Q f673p;

    /* renamed from: q  reason: collision with root package name */
    public S2.d f674q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ Object f675r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Q f676s;

    /* renamed from: t  reason: collision with root package name */
    public int f677t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0067v(Q q3, w2.b bVar) {
        super(bVar);
        this.f676s = q3;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f675r = obj;
        this.f677t |= Integer.MIN_VALUE;
        return Q.a(this.f676s, this);
    }
}
