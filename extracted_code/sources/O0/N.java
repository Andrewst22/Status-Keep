package o0;

import R.C0122z;
/* loaded from: classes.dex */
public final class N implements InterfaceC0700y {

    /* renamed from: a  reason: collision with root package name */
    public final B1.a f8494a;

    /* renamed from: b  reason: collision with root package name */
    public final B0.a f8495b;

    /* renamed from: c  reason: collision with root package name */
    public final C1.j f8496c;

    /* renamed from: d  reason: collision with root package name */
    public final e0.l f8497d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8498e;

    public N(B1.a aVar, w0.m mVar) {
        B0.a aVar2 = new B0.a(mVar, 22);
        C1.j jVar = new C1.j(28);
        e0.l lVar = new e0.l(28);
        this.f8494a = aVar;
        this.f8495b = aVar2;
        this.f8496c = jVar;
        this.f8497d = lVar;
        this.f8498e = 1048576;
    }

    @Override // o0.InterfaceC0700y
    public final InterfaceC0700y a(boolean z3) {
        return this;
    }

    @Override // o0.InterfaceC0700y
    public final InterfaceC0700y b(B1.b bVar) {
        return this;
    }

    @Override // o0.InterfaceC0700y
    public final AbstractC0677a c(C0122z c0122z) {
        c0122z.f2008b.getClass();
        return new O(c0122z, this.f8494a, this.f8495b, this.f8496c.y(c0122z), this.f8497d, this.f8498e);
    }
}
