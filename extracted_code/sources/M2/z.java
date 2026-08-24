package m2;

import K.C0065t;
import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public final class z extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ Object f8322p;

    /* renamed from: q  reason: collision with root package name */
    public int f8323q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C0065t f8324r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C0065t c0065t, InterfaceC0866d interfaceC0866d) {
        super(interfaceC0866d);
        this.f8324r = c0065t;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f8322p = obj;
        this.f8323q |= Integer.MIN_VALUE;
        return this.f8324r.a(null, this);
    }
}
