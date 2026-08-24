package K;

import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public final class C extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public Q f508p;

    /* renamed from: q  reason: collision with root package name */
    public b0 f509q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f510r;

    /* renamed from: s  reason: collision with root package name */
    public /* synthetic */ Object f511s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Q f512t;

    /* renamed from: u  reason: collision with root package name */
    public int f513u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Q q3, InterfaceC0866d interfaceC0866d) {
        super(interfaceC0866d);
        this.f512t = q3;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f511s = obj;
        this.f513u |= Integer.MIN_VALUE;
        return Q.e(this.f512t, false, this);
    }
}
