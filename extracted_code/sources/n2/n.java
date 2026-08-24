package N2;

import m2.C0645n;
import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public final class n extends w2.b {

    /* renamed from: p  reason: collision with root package name */
    public C0645n f1160p;

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ Object f1161q;

    /* renamed from: r  reason: collision with root package name */
    public int f1162r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ C0645n f1163s;

    /* renamed from: t  reason: collision with root package name */
    public Object f1164t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C0645n c0645n, InterfaceC0866d interfaceC0866d) {
        super(interfaceC0866d);
        this.f1163s = c0645n;
    }

    @Override // w2.b
    public final Object n(Object obj) {
        this.f1161q = obj;
        this.f1162r |= Integer.MIN_VALUE;
        return this.f1163s.a(null, this);
    }
}
