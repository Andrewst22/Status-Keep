package N2;

import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public final class j extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ Object f1141p;

    /* renamed from: q  reason: collision with root package name */
    public int f1142q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ B1.a f1143r;

    /* renamed from: s  reason: collision with root package name */
    public B1.a f1144s;

    /* renamed from: t  reason: collision with root package name */
    public e f1145t;

    /* renamed from: u  reason: collision with root package name */
    public O2.n f1146u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(B1.a aVar, InterfaceC0866d interfaceC0866d) {
        super(interfaceC0866d);
        this.f1143r = aVar;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f1141p = obj;
        this.f1142q |= Integer.MIN_VALUE;
        return this.f1143r.x(null, this);
    }
}
