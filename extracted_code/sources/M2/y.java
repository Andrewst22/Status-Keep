package m2;

import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public final class y extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ Object f8319p;

    /* renamed from: q  reason: collision with root package name */
    public int f8320q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C0645n f8321r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C0645n c0645n, InterfaceC0866d interfaceC0866d) {
        super(interfaceC0866d);
        this.f8321r = c0645n;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f8319p = obj;
        this.f8320q |= Integer.MIN_VALUE;
        return this.f8321r.a(null, this);
    }
}
