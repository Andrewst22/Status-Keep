package m2;

import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public final class w extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ Object f8311p;

    /* renamed from: q  reason: collision with root package name */
    public int f8312q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C0645n f8313r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C0645n c0645n, InterfaceC0866d interfaceC0866d) {
        super(interfaceC0866d);
        this.f8313r = c0645n;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f8311p = obj;
        this.f8312q |= Integer.MIN_VALUE;
        return this.f8313r.a(null, this);
    }
}
