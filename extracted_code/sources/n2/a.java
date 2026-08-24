package N2;

import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public final class a extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public O2.n f1115p;

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ Object f1116q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C1.j f1117r;

    /* renamed from: s  reason: collision with root package name */
    public int f1118s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C1.j jVar, InterfaceC0866d interfaceC0866d) {
        super(interfaceC0866d);
        this.f1117r = jVar;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f1116q = obj;
        this.f1118s |= Integer.MIN_VALUE;
        return this.f1117r.x(null, this);
    }
}
