package N2;

import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public final class k extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public l f1147p;

    /* renamed from: q  reason: collision with root package name */
    public Object f1148q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ Object f1149r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ l f1150s;

    /* renamed from: t  reason: collision with root package name */
    public int f1151t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, InterfaceC0866d interfaceC0866d) {
        super(interfaceC0866d);
        this.f1150s = lVar;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f1149r = obj;
        this.f1151t |= Integer.MIN_VALUE;
        return this.f1150s.a(null, this);
    }
}
