package N2;

import m2.C0645n;
import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public final class m extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ Object f1156p;

    /* renamed from: q  reason: collision with root package name */
    public int f1157q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ B1.a f1158r;

    /* renamed from: s  reason: collision with root package name */
    public C0645n f1159s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(B1.a aVar, InterfaceC0866d interfaceC0866d) {
        super(interfaceC0866d);
        this.f1158r = aVar;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f1156p = obj;
        this.f1157q |= Integer.MIN_VALUE;
        return this.f1158r.x(null, this);
    }
}
