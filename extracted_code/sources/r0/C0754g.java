package r0;

import R.U;
/* renamed from: r0.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0754g extends o implements Comparable {

    /* renamed from: q  reason: collision with root package name */
    public final int f8933q;

    /* renamed from: r  reason: collision with root package name */
    public final int f8934r;

    public C0754g(int i3, U u3, int i4, C0757j c0757j, int i5) {
        super(i3, u3, i4);
        this.f8933q = D2.h.i(i5, c0757j.f8951w) ? 1 : 0;
        this.f8934r = this.f8970p.b();
    }

    @Override // r0.o
    public final int a() {
        return this.f8933q;
    }

    @Override // r0.o
    public final /* bridge */ /* synthetic */ boolean b(o oVar) {
        C0754g c0754g = (C0754g) oVar;
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f8934r, ((C0754g) obj).f8934r);
    }
}
