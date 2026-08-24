package M;

import T2.p;
/* loaded from: classes.dex */
public final class b extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public Object f975p;

    /* renamed from: q  reason: collision with root package name */
    public p f976q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ Object f977r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ c f978s;

    /* renamed from: t  reason: collision with root package name */
    public int f979t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, w2.b bVar) {
        super(bVar);
        this.f978s = cVar;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f977r = obj;
        this.f979t |= Integer.MIN_VALUE;
        return c.a(this.f978s, this);
    }
}
