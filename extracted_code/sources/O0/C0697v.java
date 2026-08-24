package o0;

import R.C0122z;
import U.AbstractC0123a;
import Y.i0;
/* renamed from: o0.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0697v extends c0 {

    /* renamed from: A  reason: collision with root package name */
    public C0695t f8646A;

    /* renamed from: B  reason: collision with root package name */
    public C0694s f8647B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f8648C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f8649D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f8650E;
    public final boolean x;

    /* renamed from: y  reason: collision with root package name */
    public final R.S f8651y;

    /* renamed from: z  reason: collision with root package name */
    public final R.Q f8652z;

    public C0697v(AbstractC0677a abstractC0677a, boolean z3) {
        super(abstractC0677a);
        boolean z4;
        if (z3 && abstractC0677a.l()) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.x = z4;
        this.f8651y = new R.S();
        this.f8652z = new R.Q();
        R.T i3 = abstractC0677a.i();
        if (i3 != null) {
            this.f8646A = new C0695t(i3, null, null);
            this.f8650E = true;
            return;
        }
        this.f8646A = new C0695t(new C0696u(abstractC0677a.k()), R.S.f1802q, C0695t.f8642e);
    }

    @Override // o0.c0
    public final C0701z B(C0701z c0701z) {
        Object obj = c0701z.f8653a;
        Object obj2 = this.f8646A.f8644d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C0695t.f8642e;
        }
        return c0701z.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // o0.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(R.T r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C0697v.C(R.T):void");
    }

    @Override // o0.c0
    public final void E() {
        if (!this.x) {
            this.f8648C = true;
            D();
        }
    }

    @Override // o0.AbstractC0677a
    /* renamed from: F */
    public final C0694s b(C0701z c0701z, s0.e eVar, long j3) {
        boolean z3;
        C0694s c0694s = new C0694s(c0701z, eVar, j3);
        if (c0694s.f8638p == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        c0694s.f8638p = this.f8585w;
        if (this.f8649D) {
            Object obj = this.f8646A.f8644d;
            Object obj2 = c0701z.f8653a;
            if (obj != null && obj2.equals(C0695t.f8642e)) {
                obj2 = this.f8646A.f8644d;
            }
            c0694s.a(c0701z.a(obj2));
        } else {
            this.f8647B = c0694s;
            if (!this.f8648C) {
                this.f8648C = true;
                D();
            }
        }
        return c0694s;
    }

    public final boolean G(long j3) {
        C0694s c0694s = this.f8647B;
        int b3 = this.f8646A.b(c0694s.f8635m.f8653a);
        if (b3 == -1) {
            return false;
        }
        C0695t c0695t = this.f8646A;
        R.Q q3 = this.f8652z;
        c0695t.f(b3, q3, false);
        long j4 = q3.f1798d;
        if (j4 != -9223372036854775807L && j3 >= j4) {
            j3 = Math.max(0L, j4 - 1);
        }
        c0694s.f8641s = j3;
        return true;
    }

    @Override // o0.AbstractC0677a
    public final void q(InterfaceC0699x interfaceC0699x) {
        C0694s c0694s = (C0694s) interfaceC0699x;
        if (c0694s.f8639q != null) {
            AbstractC0677a abstractC0677a = c0694s.f8638p;
            abstractC0677a.getClass();
            abstractC0677a.q(c0694s.f8639q);
        }
        if (interfaceC0699x == this.f8647B) {
            this.f8647B = null;
        }
    }

    @Override // o0.AbstractC0686j, o0.AbstractC0677a
    public final void s() {
        this.f8649D = false;
        this.f8648C = false;
        super.s();
    }

    @Override // o0.c0, o0.AbstractC0677a
    public final void v(C0122z c0122z) {
        if (this.f8650E) {
            C0695t c0695t = this.f8646A;
            this.f8646A = new C0695t(new i0(this.f8646A.f8627b, c0122z), c0695t.f8643c, c0695t.f8644d);
        } else {
            this.f8646A = new C0695t(new C0696u(c0122z), R.S.f1802q, C0695t.f8642e);
        }
        this.f8585w.v(c0122z);
    }

    @Override // o0.AbstractC0686j, o0.AbstractC0677a
    public final void m() {
    }
}
