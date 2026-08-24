package K;

import u2.InterfaceC0866d;
/* renamed from: K.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0064s extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ Object f664p;

    /* renamed from: q  reason: collision with root package name */
    public int f665q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C0065t f666r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0064s(C0065t c0065t, InterfaceC0866d interfaceC0866d) {
        super(interfaceC0866d);
        this.f666r = c0065t;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f664p = obj;
        this.f665q |= Integer.MIN_VALUE;
        return this.f666r.a(null, this);
    }
}
