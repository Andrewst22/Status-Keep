package N2;

import K2.P;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public final class p extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public q f1169p;

    /* renamed from: q  reason: collision with root package name */
    public e f1170q;

    /* renamed from: r  reason: collision with root package name */
    public s f1171r;

    /* renamed from: s  reason: collision with root package name */
    public P f1172s;

    /* renamed from: t  reason: collision with root package name */
    public Object f1173t;

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f1174u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ q f1175v;

    /* renamed from: w  reason: collision with root package name */
    public int f1176w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, InterfaceC0866d interfaceC0866d) {
        super(interfaceC0866d);
        this.f1175v = qVar;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f1174u = obj;
        this.f1176w |= Integer.MIN_VALUE;
        this.f1175v.x(null, this);
        return EnumC0879a.f9494m;
    }
}
