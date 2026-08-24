package m2;

import u2.InterfaceC0866d;
/* renamed from: m2.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0648q extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ Object f8284p;

    /* renamed from: q  reason: collision with root package name */
    public int f8285q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ N2.l f8286r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0648q(N2.l lVar, InterfaceC0866d interfaceC0866d) {
        super(interfaceC0866d);
        this.f8286r = lVar;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f8284p = obj;
        this.f8285q |= Integer.MIN_VALUE;
        return this.f8286r.a(null, this);
    }
}
