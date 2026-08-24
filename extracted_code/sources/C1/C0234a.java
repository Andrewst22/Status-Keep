package c1;

import D1.I;
import D1.b0;
import java.util.List;
/* renamed from: c1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234a implements w0.o {

    /* renamed from: a  reason: collision with root package name */
    public final C0235b f4822a = new C0235b();

    /* renamed from: b  reason: collision with root package name */
    public final U.t f4823b = new U.t(2786);

    /* renamed from: c  reason: collision with root package name */
    public boolean f4824c;

    @Override // w0.o
    public final void b(long j3, long j4) {
        this.f4824c = false;
        this.f4822a.a();
    }

    @Override // w0.o
    public final w0.o d() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
        if ((r4 - r3) < 8192) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
        r5.f9610r = 0;
        r4 = r4 + 1;
     */
    @Override // w0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(w0.p r14) {
        /*
            r13 = this;
            U.t r0 = new U.t
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.f2477a
            r5 = r14
            w0.l r5 = (w0.l) r5
            r5.p(r4, r2, r1, r2)
            r0.G(r2)
            int r4 = r0.x()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L80
            r5.f9610r = r2
            r5.a(r3, r2)
            r4 = r3
        L24:
            r14 = 0
        L25:
            byte[] r6 = r0.f2477a
            r8 = 6
            r5.p(r6, r2, r8, r2)
            r0.G(r2)
            int r6 = r0.A()
            r9 = 2935(0xb77, float:4.113E-42)
            if (r6 == r9) goto L45
            r5.f9610r = r2
            int r4 = r4 + 1
            int r14 = r4 - r3
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r14 < r6) goto L41
            return r2
        L41:
            r5.a(r4, r2)
            goto L24
        L45:
            r6 = 1
            int r14 = r14 + r6
            r9 = 4
            if (r14 < r9) goto L4b
            return r6
        L4b:
            byte[] r10 = r0.f2477a
            int r11 = r10.length
            r12 = -1
            if (r11 >= r8) goto L53
            r9 = -1
            goto L77
        L53:
            r11 = 5
            r11 = r10[r11]
            r11 = r11 & 248(0xf8, float:3.48E-43)
            int r11 = r11 >> r7
            if (r11 <= r1) goto L6b
            r8 = 2
            r9 = r10[r8]
            r9 = r9 & 7
            int r9 = r9 << 8
            r10 = r10[r7]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r9 = r9 | r10
            int r9 = r9 + r6
            int r9 = r9 * 2
            goto L77
        L6b:
            r6 = r10[r9]
            r9 = r6 & 192(0xc0, float:2.69E-43)
            int r8 = r9 >> 6
            r6 = r6 & 63
            int r9 = w0.AbstractC0892b.h(r8, r6)
        L77:
            if (r9 != r12) goto L7a
            return r2
        L7a:
            int r9 = r9 + (-6)
            r5.a(r9, r2)
            goto L25
        L80:
            r0.H(r7)
            int r4 = r0.t()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.a(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.C0234a.e(w0.p):boolean");
    }

    @Override // w0.o
    public final int f(w0.p pVar, R.r rVar) {
        U.t tVar = this.f4823b;
        int read = ((w0.l) pVar).read(tVar.f2477a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        tVar.G(0);
        tVar.F(read);
        boolean z3 = this.f4824c;
        C0235b c0235b = this.f4822a;
        if (!z3) {
            c0235b.f4838n = 0L;
            this.f4824c = true;
        }
        c0235b.d(tVar);
        return 0;
    }

    @Override // w0.o
    public final void h(w0.q qVar) {
        this.f4822a.g(qVar, new C0232F(0, 1));
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
