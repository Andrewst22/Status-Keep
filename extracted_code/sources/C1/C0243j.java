package c1;

import U.AbstractC0123a;
import Y.J;
/* renamed from: c1.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0243j implements InterfaceC0241h {

    /* renamed from: q  reason: collision with root package name */
    public static final double[] f4905q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    public String f4906a;

    /* renamed from: b  reason: collision with root package name */
    public w0.G f4907b;

    /* renamed from: c  reason: collision with root package name */
    public final C0229C f4908c;

    /* renamed from: d  reason: collision with root package name */
    public final U.t f4909d;

    /* renamed from: e  reason: collision with root package name */
    public final J f4910e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f4911f = new boolean[4];

    /* renamed from: g  reason: collision with root package name */
    public final C0242i f4912g;

    /* renamed from: h  reason: collision with root package name */
    public long f4913h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4914i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4915j;

    /* renamed from: k  reason: collision with root package name */
    public long f4916k;

    /* renamed from: l  reason: collision with root package name */
    public long f4917l;

    /* renamed from: m  reason: collision with root package name */
    public long f4918m;

    /* renamed from: n  reason: collision with root package name */
    public long f4919n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4920o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4921p;

    /* JADX WARN: Type inference failed for: r0v2, types: [c1.i, java.lang.Object] */
    public C0243j(C0229C c0229c) {
        this.f4908c = c0229c;
        ?? obj = new Object();
        obj.f4904d = new byte[128];
        this.f4912g = obj;
        if (c0229c != null) {
            this.f4910e = new J(178);
            this.f4909d = new U.t();
        } else {
            this.f4910e = null;
            this.f4909d = null;
        }
        this.f4917l = -9223372036854775807L;
        this.f4919n = -9223372036854775807L;
    }

    @Override // c1.InterfaceC0241h
    public final void a() {
        V.g.a(this.f4911f);
        C0242i c0242i = this.f4912g;
        c0242i.f4901a = false;
        c0242i.f4902b = 0;
        c0242i.f4903c = 0;
        J j3 = this.f4910e;
        if (j3 != null) {
            j3.d();
        }
        this.f4913h = 0L;
        this.f4914i = false;
        this.f4917l = -9223372036854775807L;
        this.f4919n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0207  */
    @Override // c1.InterfaceC0241h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(U.t r27) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.C0243j.d(U.t):void");
    }

    @Override // c1.InterfaceC0241h
    public final void e(boolean z3) {
        AbstractC0123a.k(this.f4907b);
        if (z3) {
            boolean z4 = this.f4920o;
            this.f4907b.b(this.f4919n, z4 ? 1 : 0, (int) (this.f4913h - this.f4918m), 0, null);
        }
    }

    @Override // c1.InterfaceC0241h
    public final void f(long j3, int i3) {
        this.f4917l = j3;
    }

    @Override // c1.InterfaceC0241h
    public final void g(w0.q qVar, C0232F c0232f) {
        c0232f.a();
        c0232f.c();
        this.f4906a = (String) c0232f.f4821e;
        c0232f.c();
        this.f4907b = qVar.w(c0232f.f4819c, 2);
        C0229C c0229c = this.f4908c;
        if (c0229c != null) {
            c0229c.b(qVar, c0232f);
        }
    }
}
