package P2;

import s2.C0808g;
/* loaded from: classes.dex */
public final class q extends D2.j implements C2.l {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ C2.l f1509n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f1510o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ u2.i f1511p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(C2.l lVar, Object obj, u2.i iVar) {
        super(1);
        this.f1509n = lVar;
        this.f1510o = obj;
        this.f1511p = iVar;
    }

    @Override // C2.l
    public final Object b(Object obj) {
        Throwable th = (Throwable) obj;
        AbstractC0097a.a(this.f1509n, this.f1510o, this.f1511p);
        return C0808g.f9229a;
    }
}
