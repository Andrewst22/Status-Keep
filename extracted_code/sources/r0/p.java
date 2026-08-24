package r0;

import D1.AbstractC0046z;
import D1.Z;
import D1.i0;
import U.A;
/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f8971A;

    /* renamed from: B  reason: collision with root package name */
    public final int f8972B;

    /* renamed from: C  reason: collision with root package name */
    public final boolean f8973C;

    /* renamed from: D  reason: collision with root package name */
    public final boolean f8974D;

    /* renamed from: E  reason: collision with root package name */
    public final int f8975E;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f8976q;

    /* renamed from: r  reason: collision with root package name */
    public final C0757j f8977r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f8978s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f8979t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f8980u;

    /* renamed from: v  reason: collision with root package name */
    public final int f8981v;

    /* renamed from: w  reason: collision with root package name */
    public final int f8982w;
    public final int x;

    /* renamed from: y  reason: collision with root package name */
    public final int f8983y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f8984z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p(int r8, R.U r9, int r10, r0.C0757j r11, int r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.p.<init>(int, R.U, int, r0.j, int, int, boolean):void");
    }

    public static int c(p pVar, p pVar2) {
        AbstractC0046z c3 = AbstractC0046z.f317a.c(pVar.f8979t, pVar2.f8979t).a(pVar.f8983y, pVar2.f8983y).c(pVar.f8984z, pVar2.f8984z).c(pVar.f8980u, pVar2.f8980u).c(pVar.f8976q, pVar2.f8976q).c(pVar.f8978s, pVar2.f8978s);
        Integer valueOf = Integer.valueOf(pVar.x);
        Integer valueOf2 = Integer.valueOf(pVar2.x);
        Z.f224m.getClass();
        AbstractC0046z b3 = c3.b(valueOf, valueOf2, i0.f271m);
        boolean z3 = pVar2.f8973C;
        boolean z4 = pVar.f8973C;
        AbstractC0046z c4 = b3.c(z4, z3);
        boolean z5 = pVar2.f8974D;
        boolean z6 = pVar.f8974D;
        AbstractC0046z c5 = c4.c(z6, z5);
        if (z4 && z6) {
            c5 = c5.a(pVar.f8975E, pVar2.f8975E);
        }
        return c5.e();
    }

    @Override // r0.o
    public final int a() {
        return this.f8972B;
    }

    @Override // r0.o
    public final boolean b(o oVar) {
        p pVar = (p) oVar;
        if (this.f8971A || A.a(this.f8970p.f1974m, pVar.f8970p.f1974m)) {
            this.f8977r.getClass();
            if (this.f8973C == pVar.f8973C && this.f8974D == pVar.f8974D) {
                return true;
            }
        }
        return false;
    }
}
