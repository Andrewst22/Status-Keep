package c1;

import D1.I;
import D1.b0;
import java.util.List;
/* renamed from: c1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237d implements w0.o {

    /* renamed from: d  reason: collision with root package name */
    public final U.t f4845d;

    /* renamed from: e  reason: collision with root package name */
    public final U.s f4846e;

    /* renamed from: f  reason: collision with root package name */
    public w0.q f4847f;

    /* renamed from: g  reason: collision with root package name */
    public long f4848g;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4851j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4852k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4853l;

    /* renamed from: a  reason: collision with root package name */
    public final int f4842a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final C0238e f4843b = new C0238e(0, null, true);

    /* renamed from: c  reason: collision with root package name */
    public final U.t f4844c = new U.t(2048);

    /* renamed from: i  reason: collision with root package name */
    public int f4850i = -1;

    /* renamed from: h  reason: collision with root package name */
    public long f4849h = -1;

    public C0237d() {
        U.t tVar = new U.t(10);
        this.f4845d = tVar;
        byte[] bArr = tVar.f2477a;
        this.f4846e = new U.s(bArr, bArr.length);
    }

    public final int a(w0.l lVar) {
        int i3 = 0;
        while (true) {
            U.t tVar = this.f4845d;
            lVar.p(tVar.f2477a, 0, 10, false);
            tVar.G(0);
            if (tVar.x() != 4801587) {
                break;
            }
            tVar.H(3);
            int t3 = tVar.t();
            i3 += t3 + 10;
            lVar.a(t3, false);
        }
        lVar.f9610r = 0;
        lVar.a(i3, false);
        if (this.f4849h == -1) {
            this.f4849h = i3;
        }
        return i3;
    }

    @Override // w0.o
    public final void b(long j3, long j4) {
        this.f4852k = false;
        this.f4843b.a();
        this.f4848g = j4;
    }

    @Override // w0.o
    public final w0.o d() {
        return this;
    }

    @Override // w0.o
    public final boolean e(w0.p pVar) {
        w0.l lVar = (w0.l) pVar;
        int a3 = a(lVar);
        int i3 = a3;
        int i4 = 0;
        int i5 = 0;
        do {
            U.t tVar = this.f4845d;
            lVar.p(tVar.f2477a, 0, 2, false);
            tVar.G(0);
            if ((tVar.A() & 65526) == 65520) {
                i4++;
                if (i4 >= 4 && i5 > 188) {
                    return true;
                }
                lVar.p(tVar.f2477a, 0, 4, false);
                U.s sVar = this.f4846e;
                sVar.q(14);
                int i6 = sVar.i(13);
                if (i6 <= 6) {
                    i3++;
                    lVar.f9610r = 0;
                    lVar.a(i3, false);
                } else {
                    lVar.a(i6 - 6, false);
                    i5 += i6;
                }
            } else {
                i3++;
                lVar.f9610r = 0;
                lVar.a(i3, false);
            }
            i4 = 0;
            i5 = 0;
        } while (i3 - a3 < 8192);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
        r18.f4851j = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
        throw R.H.a(null, "Malformed ADTS stream");
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0122  */
    @Override // w0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(w0.p r19, R.r r20) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.C0237d.f(w0.p, R.r):int");
    }

    @Override // w0.o
    public final void h(w0.q qVar) {
        this.f4847f = qVar;
        this.f4843b.g(qVar, new C0232F(0, 1));
        qVar.s();
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
