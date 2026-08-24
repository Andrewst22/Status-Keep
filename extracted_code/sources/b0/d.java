package B0;

import C.C0002c;
import D1.I;
import D1.b0;
import K0.h;
import R.F;
import R.H;
import R.r;
import U.A;
import b1.C0211a;
import java.util.Arrays;
import java.util.List;
import w0.AbstractC0892b;
import w0.G;
import w0.InterfaceC0890A;
import w0.l;
import w0.o;
import w0.p;
import w0.q;
import w0.s;
import w0.t;
/* loaded from: classes.dex */
public final class d implements o {

    /* renamed from: e  reason: collision with root package name */
    public q f38e;

    /* renamed from: f  reason: collision with root package name */
    public G f39f;

    /* renamed from: h  reason: collision with root package name */
    public F f41h;

    /* renamed from: i  reason: collision with root package name */
    public t f42i;

    /* renamed from: j  reason: collision with root package name */
    public int f43j;

    /* renamed from: k  reason: collision with root package name */
    public int f44k;

    /* renamed from: l  reason: collision with root package name */
    public c f45l;

    /* renamed from: m  reason: collision with root package name */
    public int f46m;

    /* renamed from: n  reason: collision with root package name */
    public long f47n;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f34a = new byte[42];

    /* renamed from: b  reason: collision with root package name */
    public final U.t f35b = new U.t(new byte[32768], 0);

    /* renamed from: c  reason: collision with root package name */
    public final boolean f36c = false;

    /* renamed from: d  reason: collision with root package name */
    public final r f37d = new Object();

    /* renamed from: g  reason: collision with root package name */
    public int f40g = 0;

    @Override // w0.o
    public final void b(long j3, long j4) {
        long j5 = 0;
        if (j3 == 0) {
            this.f40g = 0;
        } else {
            c cVar = this.f45l;
            if (cVar != null) {
                cVar.d(j4);
            }
        }
        if (j4 != 0) {
            j5 = -1;
        }
        this.f47n = j5;
        this.f46m = 0;
        this.f35b.D(0);
    }

    @Override // w0.o
    public final o d() {
        return this;
    }

    @Override // w0.o
    public final boolean e(p pVar) {
        l lVar = (l) pVar;
        F a3 = new C0211a(1).a(lVar, h.f719c);
        if (a3 != null) {
            int length = a3.f1770m.length;
        }
        U.t tVar = new U.t(4);
        lVar.p(tVar.f2477a, 0, 4, false);
        if (tVar.w() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override // w0.o
    public final int f(p pVar, r rVar) {
        C0002c c0002c;
        t tVar;
        InterfaceC0890A sVar;
        long j3;
        long j4;
        long j5;
        boolean z3;
        long j6;
        boolean z4;
        boolean z5;
        boolean z6 = true;
        int i3 = this.f40g;
        F f3 = null;
        if (i3 != 0) {
            byte[] bArr = this.f34a;
            if (i3 != 1) {
                int i4 = 3;
                if (i3 != 2) {
                    int i5 = 7;
                    if (i3 != 3) {
                        long j7 = 0;
                        if (i3 != 4) {
                            if (i3 == 5) {
                                this.f39f.getClass();
                                this.f42i.getClass();
                                c cVar = this.f45l;
                                if (cVar != null && cVar.f32c != null) {
                                    return cVar.b((l) pVar, rVar);
                                }
                                if (this.f47n == -1) {
                                    t tVar2 = this.f42i;
                                    ((l) pVar).f9610r = 0;
                                    l lVar = (l) pVar;
                                    lVar.a(1, false);
                                    byte[] bArr2 = new byte[1];
                                    lVar.p(bArr2, 0, 1, false);
                                    if ((bArr2[0] & 1) == 1) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    lVar.a(2, false);
                                    if (!z5) {
                                        i5 = 6;
                                    }
                                    U.t tVar3 = new U.t(i5);
                                    byte[] bArr3 = tVar3.f2477a;
                                    int i6 = 0;
                                    while (i6 < i5) {
                                        int e2 = lVar.e(bArr3, i6, i5 - i6);
                                        if (e2 == -1) {
                                            break;
                                        }
                                        i6 += e2;
                                    }
                                    tVar3.F(i6);
                                    lVar.f9610r = 0;
                                    try {
                                        long B3 = tVar3.B();
                                        if (!z5) {
                                            B3 *= tVar2.f9625b;
                                        }
                                        j7 = B3;
                                    } catch (NumberFormatException unused) {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        this.f47n = j7;
                                        return 0;
                                    }
                                    throw H.a(null, null);
                                }
                                U.t tVar4 = this.f35b;
                                int i7 = tVar4.f2479c;
                                if (i7 < 32768) {
                                    int read = ((l) pVar).read(tVar4.f2477a, i7, 32768 - i7);
                                    if (read == -1) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (!z3) {
                                        tVar4.F(i7 + read);
                                    } else if (tVar4.a() == 0) {
                                        t tVar5 = this.f42i;
                                        int i8 = A.f2405a;
                                        this.f39f.b((this.f47n * 1000000) / tVar5.f9628e, 1, this.f46m, 0, null);
                                        return -1;
                                    }
                                } else {
                                    z3 = false;
                                }
                                int i9 = tVar4.f2478b;
                                int i10 = this.f46m;
                                int i11 = this.f43j;
                                if (i10 < i11) {
                                    tVar4.H(Math.min(i11 - i10, tVar4.a()));
                                }
                                this.f42i.getClass();
                                int i12 = tVar4.f2478b;
                                while (true) {
                                    int i13 = tVar4.f2479c - 16;
                                    r rVar2 = this.f37d;
                                    if (i12 <= i13) {
                                        tVar4.G(i12);
                                        if (AbstractC0892b.d(tVar4, this.f42i, this.f44k, rVar2)) {
                                            tVar4.G(i12);
                                            j6 = rVar2.f1989a;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        if (z3) {
                                            while (true) {
                                                int i14 = tVar4.f2479c;
                                                if (i12 <= i14 - this.f43j) {
                                                    tVar4.G(i12);
                                                    try {
                                                        z4 = AbstractC0892b.d(tVar4, this.f42i, this.f44k, rVar2);
                                                    } catch (IndexOutOfBoundsException unused2) {
                                                        z4 = false;
                                                    }
                                                    if (tVar4.f2478b > tVar4.f2479c) {
                                                        z4 = false;
                                                    }
                                                    if (z4) {
                                                        tVar4.G(i12);
                                                        j6 = rVar2.f1989a;
                                                        break;
                                                    }
                                                    i12++;
                                                } else {
                                                    tVar4.G(i14);
                                                    break;
                                                }
                                            }
                                        } else {
                                            tVar4.G(i12);
                                        }
                                        j6 = -1;
                                    }
                                }
                                int i15 = tVar4.f2478b - i9;
                                tVar4.G(i9);
                                this.f39f.f(i15, tVar4);
                                int i16 = i15 + this.f46m;
                                this.f46m = i16;
                                if (j6 != -1) {
                                    t tVar6 = this.f42i;
                                    int i17 = A.f2405a;
                                    this.f39f.b((this.f47n * 1000000) / tVar6.f9628e, 1, i16, 0, null);
                                    this.f46m = 0;
                                    this.f47n = j6;
                                }
                                if (tVar4.a() >= 16) {
                                    return 0;
                                }
                                int a3 = tVar4.a();
                                byte[] bArr4 = tVar4.f2477a;
                                System.arraycopy(bArr4, tVar4.f2478b, bArr4, 0, a3);
                                tVar4.G(0);
                                tVar4.F(a3);
                                return 0;
                            }
                            throw new IllegalStateException();
                        }
                        ((l) pVar).f9610r = 0;
                        U.t tVar7 = new U.t(2);
                        l lVar2 = (l) pVar;
                        lVar2.p(tVar7.f2477a, 0, 2, false);
                        int A3 = tVar7.A();
                        if ((A3 >> 2) == 16382) {
                            lVar2.f9610r = 0;
                            this.f44k = A3;
                            q qVar = this.f38e;
                            int i18 = A.f2405a;
                            long j8 = lVar2.f9608p;
                            this.f42i.getClass();
                            t tVar8 = this.f42i;
                            if (tVar8.f9634k != null) {
                                sVar = new s(tVar8, j8, 0);
                            } else {
                                long j9 = lVar2.f9607o;
                                if (j9 != -1 && tVar8.f9633j > 0) {
                                    int i19 = this.f44k;
                                    a aVar = new a(tVar8, 0);
                                    b bVar = new b(tVar8, i19);
                                    long b3 = tVar8.b();
                                    int i20 = tVar8.f9626c;
                                    int i21 = tVar8.f9627d;
                                    if (i21 > 0) {
                                        j3 = j9;
                                        j5 = ((i21 + i20) / 2) + 1;
                                    } else {
                                        j3 = j9;
                                        int i22 = tVar8.f9625b;
                                        int i23 = tVar8.f9624a;
                                        if (i23 == i22 && i23 > 0) {
                                            j4 = i23;
                                        } else {
                                            j4 = 4096;
                                        }
                                        j5 = (((j4 * tVar8.f9630g) * tVar8.f9631h) / 8) + 64;
                                    }
                                    c cVar2 = new c(aVar, bVar, b3, tVar8.f9633j, j8, j3, j5, Math.max(6, i20));
                                    this.f45l = cVar2;
                                    sVar = cVar2.f30a;
                                } else {
                                    sVar = new s(tVar8.b());
                                }
                            }
                            qVar.n(sVar);
                            this.f40g = 5;
                            return 0;
                        }
                        lVar2.f9610r = 0;
                        throw H.a(null, "First frame does not start with sync code.");
                    }
                    t tVar9 = this.f42i;
                    boolean z7 = false;
                    while (!z7) {
                        ((l) pVar).f9610r = 0;
                        byte[] bArr5 = new byte[4];
                        U.s sVar2 = new U.s(bArr5, 4);
                        l lVar3 = (l) pVar;
                        lVar3.p(bArr5, 0, 4, false);
                        boolean h3 = sVar2.h();
                        int i24 = sVar2.i(i5);
                        int i25 = sVar2.i(24) + 4;
                        if (i24 == 0) {
                            byte[] bArr6 = new byte[38];
                            lVar3.i(bArr6, 0, 38, false);
                            tVar9 = new t(bArr6, 4);
                        } else if (tVar9 != null) {
                            if (i24 == i4) {
                                U.t tVar10 = new U.t(i25);
                                lVar3.i(tVar10.f2477a, 0, i25, false);
                                tVar = new t(tVar9.f9624a, tVar9.f9625b, tVar9.f9626c, tVar9.f9627d, tVar9.f9628e, tVar9.f9630g, tVar9.f9631h, tVar9.f9633j, AbstractC0892b.u(tVar10), tVar9.f9635l);
                            } else {
                                F f4 = tVar9.f9635l;
                                if (i24 == 4) {
                                    U.t tVar11 = new U.t(i25);
                                    lVar3.i(tVar11.f2477a, 0, i25, false);
                                    tVar11.H(4);
                                    F s3 = AbstractC0892b.s(Arrays.asList((String[]) AbstractC0892b.v(tVar11, false, false).f7632n));
                                    if (f4 != null) {
                                        s3 = f4.e(s3);
                                    }
                                    tVar = new t(tVar9.f9624a, tVar9.f9625b, tVar9.f9626c, tVar9.f9627d, tVar9.f9628e, tVar9.f9630g, tVar9.f9631h, tVar9.f9633j, tVar9.f9634k, s3);
                                } else if (i24 == 6) {
                                    U.t tVar12 = new U.t(i25);
                                    lVar3.i(tVar12.f2477a, 0, i25, false);
                                    tVar12.H(4);
                                    F f5 = new F(I.o(I0.a.d(tVar12)));
                                    if (f4 != null) {
                                        f5 = f4.e(f5);
                                    }
                                    tVar = new t(tVar9.f9624a, tVar9.f9625b, tVar9.f9626c, tVar9.f9627d, tVar9.f9628e, tVar9.f9630g, tVar9.f9631h, tVar9.f9633j, tVar9.f9634k, f5);
                                } else {
                                    lVar3.d(i25);
                                }
                            }
                            tVar9 = tVar;
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i26 = A.f2405a;
                        this.f42i = tVar9;
                        z7 = h3;
                        i4 = 3;
                        i5 = 7;
                    }
                    this.f42i.getClass();
                    this.f43j = Math.max(this.f42i.f9626c, 6);
                    G g3 = this.f39f;
                    int i27 = A.f2405a;
                    g3.c(this.f42i.c(bArr, this.f41h));
                    this.f40g = 4;
                    return 0;
                }
                U.t tVar13 = new U.t(4);
                ((l) pVar).i(tVar13.f2477a, 0, 4, false);
                if (tVar13.w() == 1716281667) {
                    this.f40g = 3;
                    return 0;
                }
                throw H.a(null, "Failed to read FLAC stream marker.");
            }
            ((l) pVar).p(bArr, 0, bArr.length, false);
            ((l) pVar).f9610r = 0;
            this.f40g = 2;
            return 0;
        }
        ((l) pVar).f9610r = 0;
        l lVar4 = (l) pVar;
        long u3 = lVar4.u();
        if (!this.f36c) {
            c0002c = null;
        } else {
            c0002c = h.f719c;
        }
        F a4 = new C0211a(1).a(lVar4, c0002c);
        if (a4 != null && a4.f1770m.length != 0) {
            f3 = a4;
        }
        lVar4.d((int) (lVar4.u() - u3));
        this.f41h = f3;
        this.f40g = 1;
        return 0;
    }

    @Override // w0.o
    public final void h(q qVar) {
        this.f38e = qVar;
        this.f39f = qVar.w(0, 1);
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
