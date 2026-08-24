package N2;

import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public final class h extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ Object f1134p;

    /* renamed from: q  reason: collision with root package name */
    public int f1135q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ i f1136r;

    /* renamed from: s  reason: collision with root package name */
    public Object f1137s;

    /* renamed from: t  reason: collision with root package name */
    public e f1138t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, InterfaceC0866d interfaceC0866d) {
        super(interfaceC0866d);
        this.f1136r = iVar;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f1134p = obj;
        this.f1135q |= Integer.MIN_VALUE;
        return this.f1136r.x(null, this);
    }
}
