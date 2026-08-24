package c1;

import U.AbstractC0123a;
import Y.J;
/* loaded from: classes.dex */
public final class p implements InterfaceC0241h {

    /* renamed from: a  reason: collision with root package name */
    public final C0229C f4983a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4984b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4985c;

    /* renamed from: g  reason: collision with root package name */
    public long f4989g;

    /* renamed from: i  reason: collision with root package name */
    public String f4991i;

    /* renamed from: j  reason: collision with root package name */
    public w0.G f4992j;

    /* renamed from: k  reason: collision with root package name */
    public o f4993k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4994l;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4996n;

    /* renamed from: h  reason: collision with root package name */
    public final boolean[] f4990h = new boolean[3];

    /* renamed from: d  reason: collision with root package name */
    public final J f4986d = new J(7);

    /* renamed from: e  reason: collision with root package name */
    public final J f4987e = new J(8);

    /* renamed from: f  reason: collision with root package name */
    public final J f4988f = new J(6);

    /* renamed from: m  reason: collision with root package name */
    public long f4995m = -9223372036854775807L;

    /* renamed from: o  reason: collision with root package name */
    public final U.t f4997o = new U.t();

    public p(C0229C c0229c, boolean z3, boolean z4) {
        this.f4983a = c0229c;
        this.f4984b = z3;
        this.f4985c = z4;
    }

    @Override // c1.InterfaceC0241h
    public final void a() {
        this.f4989g = 0L;
        this.f4996n = false;
        this.f4995m = -9223372036854775807L;
        V.g.a(this.f4990h);
        this.f4986d.d();
        this.f4987e.d();
        this.f4988f.d();
        o oVar = this.f4993k;
        if (oVar != null) {
            oVar.f4974k = false;
            oVar.f4978o = false;
            n nVar = oVar.f4977n;
            nVar.f4949b = false;
            nVar.f4948a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.p.b(byte[], int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x02ae, code lost:
        if (r2 != 1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0220, code lost:
        if (r6.f4961n != r7.f4961n) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0231, code lost:
        if (r6.f4963p != r7.f4963p) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x023f, code lost:
        if (r6.f4959l != r7.f4959l) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0286  */
    @Override // c1.InterfaceC0241h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(U.t r31) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.p.d(U.t):void");
    }

    @Override // c1.InterfaceC0241h
    public final void e(boolean z3) {
        AbstractC0123a.k(this.f4992j);
        int i3 = U.A.f2405a;
        if (z3) {
            o oVar = this.f4993k;
            long j3 = this.f4989g;
            oVar.a();
            oVar.f4973j = j3;
            long j4 = oVar.f4980q;
            if (j4 != -9223372036854775807L) {
                boolean z4 = oVar.f4981r;
                oVar.f4964a.b(j4, z4 ? 1 : 0, (int) (j3 - oVar.f4979p), 0, null);
            }
            oVar.f4978o = false;
        }
    }

    @Override // c1.InterfaceC0241h
    public final void f(long j3, int i3) {
        boolean z3;
        this.f4995m = j3;
        boolean z4 = this.f4996n;
        if ((i3 & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f4996n = z4 | z3;
    }

    @Override // c1.InterfaceC0241h
    public final void g(w0.q qVar, C0232F c0232f) {
        c0232f.a();
        c0232f.c();
        this.f4991i = (String) c0232f.f4821e;
        c0232f.c();
        w0.G w3 = qVar.w(c0232f.f4819c, 2);
        this.f4992j = w3;
        this.f4993k = new o(w3, this.f4984b, this.f4985c);
        this.f4983a.b(qVar, c0232f);
    }
}
