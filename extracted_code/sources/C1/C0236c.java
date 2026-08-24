package c1;

import D1.I;
import D1.b0;
import java.util.List;
/* renamed from: c1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0236c implements w0.o {

    /* renamed from: a  reason: collision with root package name */
    public final C0235b f4839a = new C0235b(0, 1, null);

    /* renamed from: b  reason: collision with root package name */
    public final U.t f4840b = new U.t(16384);

    /* renamed from: c  reason: collision with root package name */
    public boolean f4841c;

    @Override // w0.o
    public final void b(long j3, long j4) {
        this.f4841c = false;
        this.f4839a.a();
    }

    @Override // w0.o
    public final w0.o d() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
        r5.f9610r = 0;
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
        if ((r1 - r3) < 8192) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
        return false;
     */
    @Override // w0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(w0.p r15) {
        /*
            r14 = this;
            U.t r0 = new U.t
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.f2477a
            r5 = r15
            w0.l r5 = (w0.l) r5
            r5.p(r4, r2, r1, r2)
            r0.G(r2)
            int r4 = r0.x()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L8f
            r5.f9610r = r2
            r5.a(r3, r2)
            r1 = r3
        L24:
            r15 = 0
        L25:
            byte[] r4 = r0.f2477a
            r6 = 7
            r5.p(r4, r2, r6, r2)
            r0.G(r2)
            int r4 = r0.A()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r4 == r8) goto L4b
            if (r4 == r9) goto L4b
            r5.f9610r = r2
            int r1 = r1 + 1
            int r15 = r1 - r3
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r15 < r4) goto L47
            return r2
        L47:
            r5.a(r1, r2)
            goto L24
        L4b:
            r8 = 1
            int r15 = r15 + r8
            r10 = 4
            if (r15 < r10) goto L51
            return r8
        L51:
            byte[] r8 = r0.f2477a
            int r11 = r8.length
            r12 = -1
            if (r11 >= r6) goto L59
            r11 = -1
            goto L86
        L59:
            r11 = 2
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r13 = r8[r7]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L80
            r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r11 = 5
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r10 = r10 | r11
            r11 = 6
            r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r10 | r8
            goto L81
        L80:
            r6 = 4
        L81:
            if (r4 != r9) goto L85
            int r6 = r6 + 2
        L85:
            int r11 = r11 + r6
        L86:
            if (r11 != r12) goto L89
            return r2
        L89:
            int r11 = r11 + (-7)
            r5.a(r11, r2)
            goto L25
        L8f:
            r0.H(r7)
            int r4 = r0.t()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.a(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.C0236c.e(w0.p):boolean");
    }

    @Override // w0.o
    public final int f(w0.p pVar, R.r rVar) {
        U.t tVar = this.f4840b;
        int read = ((w0.l) pVar).read(tVar.f2477a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        tVar.G(0);
        tVar.F(read);
        boolean z3 = this.f4841c;
        C0235b c0235b = this.f4839a;
        if (!z3) {
            c0235b.f4838n = 0L;
            this.f4841c = true;
        }
        c0235b.d(tVar);
        return 0;
    }

    @Override // w0.o
    public final void h(w0.q qVar) {
        this.f4839a.g(qVar, new C0232F(0, 1));
        qVar.s();
        qVar.n(new w0.s(-9223372036854775807L));
    }

    @Override // w0.o
    public final List l() {
        D1.G g3 = I.f197n;
        return b0.f231q;
    }

    @Override // w0.o
    public final void release() {
    }
}
