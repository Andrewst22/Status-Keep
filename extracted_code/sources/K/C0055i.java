package K;
/* renamed from: K.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055i extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public C0059m f626p;

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ Object f627q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C0059m f628r;

    /* renamed from: s  reason: collision with root package name */
    public int f629s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0055i(C0059m c0059m, w2.b bVar) {
        super(bVar);
        this.f628r = c0059m;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f627q = obj;
        this.f629s |= Integer.MIN_VALUE;
        return this.f628r.c(this);
    }
}
