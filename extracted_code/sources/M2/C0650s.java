package m2;

import u2.InterfaceC0866d;
/* renamed from: m2.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0650s extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ Object f8292p;

    /* renamed from: q  reason: collision with root package name */
    public int f8293q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C0645n f8294r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0650s(C0645n c0645n, InterfaceC0866d interfaceC0866d) {
        super(interfaceC0866d);
        this.f8294r = c0645n;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f8292p = obj;
        this.f8293q |= Integer.MIN_VALUE;
        return this.f8294r.a(null, this);
    }
}
