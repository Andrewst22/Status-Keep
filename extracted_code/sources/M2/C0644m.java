package m2;

import u2.InterfaceC0866d;
/* renamed from: m2.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0644m extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ Object f8270p;

    /* renamed from: q  reason: collision with root package name */
    public int f8271q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C0645n f8272r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0644m(C0645n c0645n, InterfaceC0866d interfaceC0866d) {
        super(interfaceC0866d);
        this.f8272r = c0645n;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f8270p = obj;
        this.f8271q |= Integer.MIN_VALUE;
        return this.f8272r.a(null, this);
    }
}
