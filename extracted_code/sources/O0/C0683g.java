package o0;

import U.AbstractC0123a;
import java.util.ArrayList;
/* renamed from: o0.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0683g extends c0 {

    /* renamed from: A  reason: collision with root package name */
    public final R.S f8597A;

    /* renamed from: B  reason: collision with root package name */
    public C0681e f8598B;

    /* renamed from: C  reason: collision with root package name */
    public C0682f f8599C;

    /* renamed from: D  reason: collision with root package name */
    public long f8600D;

    /* renamed from: E  reason: collision with root package name */
    public long f8601E;
    public final long x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f8602y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList f8603z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0683g(AbstractC0677a abstractC0677a, long j3, boolean z3) {
        super(abstractC0677a);
        abstractC0677a.getClass();
        this.x = j3;
        this.f8602y = z3;
        this.f8603z = new ArrayList();
        this.f8597A = new R.S();
    }

    @Override // o0.c0
    public final void C(R.T t3) {
        if (this.f8599C != null) {
            return;
        }
        F(t3);
    }

    public final void F(R.T t3) {
        long j3;
        R.S s3 = this.f8597A;
        t3.n(0, s3);
        long j4 = s3.f1819p;
        C0681e c0681e = this.f8598B;
        ArrayList arrayList = this.f8603z;
        long j5 = this.x;
        long j6 = Long.MIN_VALUE;
        if (c0681e != null && !arrayList.isEmpty()) {
            long j7 = this.f8600D - j4;
            if (j5 != Long.MIN_VALUE) {
                j6 = this.f8601E - j4;
            }
            j5 = j6;
            j3 = j7;
        } else {
            this.f8600D = j4;
            if (j5 != Long.MIN_VALUE) {
                j6 = j4 + j5;
            }
            this.f8601E = j6;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0680d c0680d = (C0680d) arrayList.get(i3);
                long j8 = this.f8600D;
                long j9 = this.f8601E;
                c0680d.f8590q = j8;
                c0680d.f8591r = j9;
            }
            j3 = 0;
        }
        try {
            C0681e c0681e2 = new C0681e(t3, j3, j5);
            this.f8598B = c0681e2;
            p(c0681e2);
        } catch (C0682f e2) {
            this.f8599C = e2;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                ((C0680d) arrayList.get(i4)).f8592s = this.f8599C;
            }
        }
    }

    @Override // o0.AbstractC0677a
    public final InterfaceC0699x b(C0701z c0701z, s0.e eVar, long j3) {
        C0680d c0680d = new C0680d(this.f8585w.b(c0701z, eVar, j3), this.f8602y, this.f8600D, this.f8601E);
        this.f8603z.add(c0680d);
        return c0680d;
    }

    @Override // o0.AbstractC0686j, o0.AbstractC0677a
    public final void m() {
        C0682f c0682f = this.f8599C;
        if (c0682f == null) {
            super.m();
            return;
        }
        throw c0682f;
    }

    @Override // o0.AbstractC0677a
    public final void q(InterfaceC0699x interfaceC0699x) {
        ArrayList arrayList = this.f8603z;
        AbstractC0123a.j(arrayList.remove(interfaceC0699x));
        this.f8585w.q(((C0680d) interfaceC0699x).f8586m);
        if (arrayList.isEmpty()) {
            C0681e c0681e = this.f8598B;
            c0681e.getClass();
            F(c0681e.f8627b);
        }
    }

    @Override // o0.AbstractC0686j, o0.AbstractC0677a
    public final void s() {
        super.s();
        this.f8599C = null;
        this.f8598B = null;
    }
}
