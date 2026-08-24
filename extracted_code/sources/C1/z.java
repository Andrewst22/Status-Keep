package c1;

import D1.I;
import D1.b0;
import U.AbstractC0123a;
import android.util.SparseArray;
import java.util.List;
import t0.C0816a;
/* loaded from: classes.dex */
public final class z implements w0.o {

    /* renamed from: e  reason: collision with root package name */
    public boolean f5116e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5117f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5118g;

    /* renamed from: h  reason: collision with root package name */
    public long f5119h;

    /* renamed from: i  reason: collision with root package name */
    public B0.c f5120i;

    /* renamed from: j  reason: collision with root package name */
    public w0.q f5121j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5122k;

    /* renamed from: a  reason: collision with root package name */
    public final U.y f5112a = new U.y(0);

    /* renamed from: c  reason: collision with root package name */
    public final U.t f5114c = new U.t(4096);

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray f5113b = new SparseArray();

    /* renamed from: d  reason: collision with root package name */
    public final x f5115d = new x(0);

    @Override // w0.o
    public final void b(long j3, long j4) {
        boolean z3;
        U.y yVar = this.f5112a;
        boolean z4 = true;
        if (yVar.e() == -9223372036854775807L) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            long d3 = yVar.d();
            z3 = (d3 == -9223372036854775807L || d3 == 0 || d3 == j4) ? false : false;
        }
        if (z3) {
            yVar.g(j4);
        }
        B0.c cVar = this.f5120i;
        if (cVar != null) {
            cVar.d(j4);
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f5113b;
            if (i3 < sparseArray.size()) {
                y yVar2 = (y) sparseArray.valueAt(i3);
                yVar2.f5110f = false;
                yVar2.f5105a.a();
                i3++;
            } else {
                return;
            }
        }
    }

    @Override // w0.o
    public final w0.o d() {
        return this;
    }

    @Override // w0.o
    public final boolean e(w0.p pVar) {
        byte[] bArr = new byte[14];
        w0.l lVar = (w0.l) pVar;
        lVar.p(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        lVar.a(bArr[13] & 7, false);
        lVar.p(bArr, 0, 3, false);
        if (1 != (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return false;
        }
        return true;
    }

    @Override // w0.o
    public final int f(w0.p pVar, R.r rVar) {
        long j3;
        long j4;
        long j5;
        InterfaceC0241h interfaceC0241h;
        long j6;
        int i3;
        long j7;
        AbstractC0123a.k(this.f5121j);
        long j8 = ((w0.l) pVar).f9607o;
        x xVar = this.f5115d;
        int i4 = (j8 > (-1L) ? 1 : (j8 == (-1L) ? 0 : -1));
        if (i4 != 0 && !xVar.f5099d) {
            boolean z3 = xVar.f5101f;
            U.t tVar = xVar.f5098c;
            if (!z3) {
                w0.l lVar = (w0.l) pVar;
                long j9 = lVar.f9607o;
                int min = (int) Math.min(20000L, j9);
                long j10 = j9 - min;
                if (lVar.f9608p != j10) {
                    rVar.f1989a = j10;
                    i3 = 1;
                } else {
                    tVar.D(min);
                    lVar.f9610r = 0;
                    lVar.p(tVar.f2477a, 0, min, false);
                    int i5 = tVar.f2478b;
                    int i6 = tVar.f2479c - 4;
                    while (true) {
                        if (i6 >= i5) {
                            if (x.b(tVar.f2477a, i6) == 442) {
                                tVar.G(i6 + 4);
                                j7 = x.c(tVar);
                                if (j7 != -9223372036854775807L) {
                                    break;
                                }
                            }
                            i6--;
                        } else {
                            j7 = -9223372036854775807L;
                            break;
                        }
                    }
                    xVar.f5103h = j7;
                    xVar.f5101f = true;
                    i3 = 0;
                }
            } else if (xVar.f5103h == -9223372036854775807L) {
                xVar.a((w0.l) pVar);
                return 0;
            } else if (!xVar.f5100e) {
                w0.l lVar2 = (w0.l) pVar;
                int min2 = (int) Math.min(20000L, lVar2.f9607o);
                long j11 = 0;
                if (lVar2.f9608p != j11) {
                    rVar.f1989a = j11;
                    i3 = 1;
                } else {
                    tVar.D(min2);
                    lVar2.f9610r = 0;
                    lVar2.p(tVar.f2477a, 0, min2, false);
                    int i7 = tVar.f2478b;
                    int i8 = tVar.f2479c;
                    while (true) {
                        if (i7 < i8 - 3) {
                            if (x.b(tVar.f2477a, i7) == 442) {
                                tVar.G(i7 + 4);
                                j6 = x.c(tVar);
                                if (j6 != -9223372036854775807L) {
                                    break;
                                }
                            }
                            i7++;
                        } else {
                            j6 = -9223372036854775807L;
                            break;
                        }
                    }
                    xVar.f5102g = j6;
                    xVar.f5100e = true;
                    i3 = 0;
                }
            } else {
                long j12 = xVar.f5102g;
                if (j12 == -9223372036854775807L) {
                    xVar.a((w0.l) pVar);
                    return 0;
                }
                U.y yVar = xVar.f5097b;
                xVar.f5104i = yVar.c(xVar.f5103h) - yVar.b(j12);
                xVar.a((w0.l) pVar);
                return 0;
            }
            return i3;
        }
        if (!this.f5122k) {
            this.f5122k = true;
            long j13 = xVar.f5104i;
            if (j13 != -9223372036854775807L) {
                j3 = j8;
                B0.c cVar = new B0.c(new C0816a(3), new B1.a(xVar.f5097b), j13, j13 + 1, 0L, j8, 188L, 1000);
                this.f5120i = cVar;
                this.f5121j.n(cVar.f30a);
            } else {
                j3 = j8;
                this.f5121j.n(new w0.s(j13));
            }
        } else {
            j3 = j8;
        }
        B0.c cVar2 = this.f5120i;
        if (cVar2 != null && cVar2.f32c != null) {
            return cVar2.b((w0.l) pVar, rVar);
        }
        w0.l lVar3 = (w0.l) pVar;
        lVar3.f9610r = 0;
        if (i4 != 0) {
            j4 = j3 - lVar3.u();
        } else {
            j4 = -1;
        }
        if (j4 != -1 && j4 < 4) {
            return -1;
        }
        U.t tVar2 = this.f5114c;
        if (!lVar3.p(tVar2.f2477a, 0, 4, true)) {
            return -1;
        }
        tVar2.G(0);
        int h3 = tVar2.h();
        if (h3 == 441) {
            return -1;
        }
        if (h3 == 442) {
            lVar3.p(tVar2.f2477a, 0, 10, false);
            tVar2.G(9);
            lVar3.d((tVar2.u() & 7) + 14);
            return 0;
        } else if (h3 == 443) {
            lVar3.p(tVar2.f2477a, 0, 2, false);
            tVar2.G(0);
            lVar3.d(tVar2.A() + 6);
            return 0;
        } else if (((h3 & (-256)) >> 8) != 1) {
            lVar3.d(1);
            return 0;
        } else {
            int i9 = h3 & 255;
            SparseArray sparseArray = this.f5113b;
            y yVar2 = (y) sparseArray.get(i9);
            if (!this.f5116e) {
                if (yVar2 == null) {
                    if (i9 == 189) {
                        interfaceC0241h = new C0235b();
                        this.f5117f = true;
                        this.f5119h = lVar3.f9608p;
                    } else if ((h3 & 224) == 192) {
                        interfaceC0241h = new t(null, 0);
                        this.f5117f = true;
                        this.f5119h = lVar3.f9608p;
                    } else if ((h3 & 240) == 224) {
                        interfaceC0241h = new C0243j(null);
                        this.f5118g = true;
                        this.f5119h = lVar3.f9608p;
                    } else {
                        interfaceC0241h = null;
                    }
                    if (interfaceC0241h != null) {
                        interfaceC0241h.g(this.f5121j, new C0232F(i9, 256));
                        yVar2 = new y(interfaceC0241h, this.f5112a);
                        sparseArray.put(i9, yVar2);
                    }
                }
                if (this.f5117f && this.f5118g) {
                    j5 = this.f5119h + 8192;
                } else {
                    j5 = 1048576;
                }
                if (lVar3.f9608p > j5) {
                    this.f5116e = true;
                    this.f5121j.s();
                }
            }
            lVar3.p(tVar2.f2477a, 0, 2, false);
            tVar2.G(0);
            int A3 = tVar2.A() + 6;
            if (yVar2 == null) {
                lVar3.d(A3);
                return 0;
            }
            tVar2.D(A3);
            lVar3.i(tVar2.f2477a, 0, A3, false);
            tVar2.G(6);
            U.s sVar = yVar2.f5107c;
            tVar2.f(sVar.f2472d, 0, 3);
            sVar.q(0);
            sVar.t(8);
            yVar2.f5108d = sVar.h();
            yVar2.f5109e = sVar.h();
            sVar.t(6);
            tVar2.f(sVar.f2472d, 0, sVar.i(8));
            sVar.q(0);
            yVar2.f5111g = 0L;
            if (yVar2.f5108d) {
                sVar.t(4);
                sVar.t(1);
                sVar.t(1);
                long i10 = (sVar.i(3) << 30) | (sVar.i(15) << 15) | sVar.i(15);
                sVar.t(1);
                boolean z4 = yVar2.f5110f;
                U.y yVar3 = yVar2.f5106b;
                if (!z4 && yVar2.f5109e) {
                    sVar.t(4);
                    sVar.t(1);
                    long i11 = sVar.i(15) << 15;
                    sVar.t(1);
                    sVar.t(1);
                    yVar3.b(i11 | (sVar.i(3) << 30) | sVar.i(15));
                    yVar2.f5110f = true;
                }
                yVar2.f5111g = yVar3.b(i10);
            }
            long j14 = yVar2.f5111g;
            InterfaceC0241h interfaceC0241h2 = yVar2.f5105a;
            interfaceC0241h2.f(j14, 4);
            interfaceC0241h2.d(tVar2);
            interfaceC0241h2.e(false);
            tVar2.F(tVar2.f2477a.length);
            return 0;
        }
    }

    @Override // w0.o
    public final void h(w0.q qVar) {
        this.f5121j = qVar;
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
