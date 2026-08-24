package c1;

import U.AbstractC0123a;
import Y.J;
/* loaded from: classes.dex */
public final class r implements InterfaceC0241h {

    /* renamed from: a  reason: collision with root package name */
    public final C0229C f5011a;

    /* renamed from: b  reason: collision with root package name */
    public String f5012b;

    /* renamed from: c  reason: collision with root package name */
    public w0.G f5013c;

    /* renamed from: d  reason: collision with root package name */
    public q f5014d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5015e;

    /* renamed from: l  reason: collision with root package name */
    public long f5022l;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f5016f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    public final J f5017g = new J(32);

    /* renamed from: h  reason: collision with root package name */
    public final J f5018h = new J(33);

    /* renamed from: i  reason: collision with root package name */
    public final J f5019i = new J(34);

    /* renamed from: j  reason: collision with root package name */
    public final J f5020j = new J(39);

    /* renamed from: k  reason: collision with root package name */
    public final J f5021k = new J(40);

    /* renamed from: m  reason: collision with root package name */
    public long f5023m = -9223372036854775807L;

    /* renamed from: n  reason: collision with root package name */
    public final U.t f5024n = new U.t();

    public r(C0229C c0229c) {
        this.f5011a = c0229c;
    }

    @Override // c1.InterfaceC0241h
    public final void a() {
        this.f5022l = 0L;
        this.f5023m = -9223372036854775807L;
        V.g.a(this.f5016f);
        this.f5017g.d();
        this.f5018h.d();
        this.f5019i.d();
        this.f5020j.d();
        this.f5021k.d();
        q qVar = this.f5014d;
        if (qVar != null) {
            qVar.f5003f = false;
            qVar.f5004g = false;
            qVar.f5005h = false;
            qVar.f5006i = false;
            qVar.f5007j = false;
        }
    }

    public final void b(byte[] bArr, int i3, int i4) {
        boolean z3;
        q qVar = this.f5014d;
        if (qVar.f5003f) {
            int i5 = qVar.f5001d;
            int i6 = (i3 + 2) - i5;
            if (i6 < i4) {
                if ((bArr[i6] & 128) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                qVar.f5004g = z3;
                qVar.f5003f = false;
            } else {
                qVar.f5001d = (i4 - i3) + i5;
            }
        }
        if (!this.f5015e) {
            this.f5017g.a(bArr, i3, i4);
            this.f5018h.a(bArr, i3, i4);
            this.f5019i.a(bArr, i3, i4);
        }
        this.f5020j.a(bArr, i3, i4);
        this.f5021k.a(bArr, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022c A[SYNTHETIC] */
    @Override // c1.InterfaceC0241h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(U.t r38) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.r.d(U.t):void");
    }

    @Override // c1.InterfaceC0241h
    public final void e(boolean z3) {
        AbstractC0123a.k(this.f5013c);
        int i3 = U.A.f2405a;
        if (z3) {
            q qVar = this.f5014d;
            long j3 = this.f5022l;
            qVar.f5010m = qVar.f5000c;
            qVar.a((int) (j3 - qVar.f4999b));
            qVar.f5008k = qVar.f4999b;
            qVar.f4999b = j3;
            qVar.a(0);
            qVar.f5006i = false;
        }
    }

    @Override // c1.InterfaceC0241h
    public final void f(long j3, int i3) {
        this.f5023m = j3;
    }

    @Override // c1.InterfaceC0241h
    public final void g(w0.q qVar, C0232F c0232f) {
        c0232f.a();
        c0232f.c();
        this.f5012b = (String) c0232f.f4821e;
        c0232f.c();
        w0.G w3 = qVar.w(c0232f.f4819c, 2);
        this.f5013c = w3;
        this.f5014d = new q(w3);
        this.f5011a.b(qVar, c0232f);
    }
}
