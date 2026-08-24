package l0;

import D1.g0;
import R.H;
import U.A;
import U.AbstractC0123a;
import U.s;
import U.t;
import a.AbstractC0155a;
import k0.C0553h;
import k0.C0555j;
import w0.G;
import w0.q;
/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: a  reason: collision with root package name */
    public final C0555j f8013a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8014b;

    /* renamed from: c  reason: collision with root package name */
    public G f8015c;

    /* renamed from: d  reason: collision with root package name */
    public long f8016d;

    /* renamed from: e  reason: collision with root package name */
    public int f8017e;

    /* renamed from: f  reason: collision with root package name */
    public int f8018f;

    /* renamed from: g  reason: collision with root package name */
    public long f8019g;

    /* renamed from: h  reason: collision with root package name */
    public long f8020h;

    public f(C0555j c0555j) {
        this.f8013a = c0555j;
        try {
            this.f8014b = a(c0555j.f7607d);
            this.f8016d = -9223372036854775807L;
            this.f8017e = -1;
            this.f8018f = 0;
            this.f8019g = 0L;
            this.f8020h = -9223372036854775807L;
        } catch (H e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int a(g0 g0Var) {
        boolean z3;
        boolean z4;
        String str = (String) g0Var.get("config");
        int i3 = 0;
        boolean z5 = false;
        i3 = 0;
        if (str != null && str.length() % 2 == 0) {
            byte[] t3 = A.t(str);
            s sVar = new s(t3, t3.length);
            int i4 = sVar.i(1);
            if (i4 == 0) {
                if (sVar.i(1) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                AbstractC0123a.d("Only supports allStreamsSameTimeFraming.", z3);
                int i5 = sVar.i(6);
                if (sVar.i(4) == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                AbstractC0123a.d("Only suppors one program.", z4);
                if (sVar.i(3) == 0) {
                    z5 = true;
                }
                AbstractC0123a.d("Only suppors one layer.", z5);
                i3 = i5;
            } else {
                throw new H(D2.h.k("unsupported audio mux version: ", i4), null, true, 0);
            }
        }
        return i3 + 1;
    }

    @Override // l0.i
    public final void b(long j3, long j4) {
        this.f8016d = j3;
        this.f8018f = 0;
        this.f8019g = j4;
    }

    @Override // l0.i
    public final void c(t tVar, long j3, int i3, boolean z3) {
        AbstractC0123a.k(this.f8015c);
        int a3 = C0553h.a(this.f8017e);
        if (this.f8018f > 0 && a3 < i3) {
            G g3 = this.f8015c;
            g3.getClass();
            g3.b(this.f8020h, 1, this.f8018f, 0, null);
            this.f8018f = 0;
            this.f8020h = -9223372036854775807L;
        }
        for (int i4 = 0; i4 < this.f8014b; i4++) {
            int i5 = 0;
            while (tVar.f2478b < tVar.f2479c) {
                int u3 = tVar.u();
                i5 += u3;
                if (u3 != 255) {
                    break;
                }
            }
            this.f8015c.f(i5, tVar);
            this.f8018f += i5;
        }
        this.f8020h = AbstractC0155a.M(this.f8019g, j3, this.f8016d, this.f8013a.f7605b);
        if (z3) {
            G g4 = this.f8015c;
            g4.getClass();
            g4.b(this.f8020h, 1, this.f8018f, 0, null);
            this.f8018f = 0;
            this.f8020h = -9223372036854775807L;
        }
        this.f8017e = i3;
    }

    @Override // l0.i
    public final void d(long j3) {
        boolean z3;
        if (this.f8016d == -9223372036854775807L) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        this.f8016d = j3;
    }

    @Override // l0.i
    public final void e(q qVar, int i3) {
        G w3 = qVar.w(i3, 2);
        this.f8015c = w3;
        int i4 = A.f2405a;
        w3.c(this.f8013a.f7606c);
    }
}
