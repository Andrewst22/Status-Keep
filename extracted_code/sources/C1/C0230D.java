package c1;

import D1.I;
import D1.b0;
import R.H;
import U.AbstractC0123a;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t0.C0816a;
/* renamed from: c1.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0230D implements w0.o {

    /* renamed from: a  reason: collision with root package name */
    public final int f4795a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4796b;

    /* renamed from: c  reason: collision with root package name */
    public final List f4797c;

    /* renamed from: d  reason: collision with root package name */
    public final U.t f4798d;

    /* renamed from: e  reason: collision with root package name */
    public final SparseIntArray f4799e;

    /* renamed from: f  reason: collision with root package name */
    public final B.b f4800f;

    /* renamed from: g  reason: collision with root package name */
    public final T0.j f4801g;

    /* renamed from: h  reason: collision with root package name */
    public final SparseArray f4802h;

    /* renamed from: i  reason: collision with root package name */
    public final SparseBooleanArray f4803i;

    /* renamed from: j  reason: collision with root package name */
    public final SparseBooleanArray f4804j;

    /* renamed from: k  reason: collision with root package name */
    public final x f4805k;

    /* renamed from: l  reason: collision with root package name */
    public B0.c f4806l;

    /* renamed from: m  reason: collision with root package name */
    public w0.q f4807m;

    /* renamed from: n  reason: collision with root package name */
    public int f4808n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4809o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4810p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4811q;

    /* renamed from: r  reason: collision with root package name */
    public InterfaceC0233G f4812r;

    /* renamed from: s  reason: collision with root package name */
    public int f4813s;

    /* renamed from: t  reason: collision with root package name */
    public int f4814t;

    public C0230D(int i3, int i4, T0.j jVar, U.y yVar, B.b bVar) {
        this.f4800f = bVar;
        this.f4795a = i3;
        this.f4796b = i4;
        this.f4801g = jVar;
        if (i3 != 1 && i3 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f4797c = arrayList;
            arrayList.add(yVar);
        } else {
            this.f4797c = Collections.singletonList(yVar);
        }
        this.f4798d = new U.t(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f4803i = sparseBooleanArray;
        this.f4804j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f4802h = sparseArray;
        this.f4799e = new SparseIntArray();
        this.f4805k = new x(1);
        this.f4807m = w0.q.f9620l;
        this.f4814t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i5 = 0; i5 < size; i5++) {
            sparseArray.put(sparseArray2.keyAt(i5), (InterfaceC0233G) sparseArray2.valueAt(i5));
        }
        sparseArray.put(0, new C0228B(new B1.a(this)));
        this.f4812r = null;
    }

    @Override // w0.o
    public final void b(long j3, long j4) {
        boolean z3;
        B0.c cVar;
        boolean z4;
        if (this.f4795a != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        List list = this.f4797c;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            U.y yVar = (U.y) list.get(i3);
            if (yVar.e() == -9223372036854775807L) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                long d3 = yVar.d();
                if (d3 != -9223372036854775807L && d3 != 0 && d3 != j4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            if (z4) {
                yVar.g(j4);
            }
        }
        if (j4 != 0 && (cVar = this.f4806l) != null) {
            cVar.d(j4);
        }
        this.f4798d.D(0);
        this.f4799e.clear();
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f4802h;
            if (i4 < sparseArray.size()) {
                ((InterfaceC0233G) sparseArray.valueAt(i4)).a();
                i4++;
            } else {
                this.f4813s = 0;
                return;
            }
        }
    }

    @Override // w0.o
    public final w0.o d() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        r2 = r2 + 1;
     */
    @Override // w0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(w0.p r7) {
        /*
            r6 = this;
            U.t r0 = r6.f4798d
            byte[] r0 = r0.f2477a
            w0.l r7 = (w0.l) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.p(r0, r1, r2, r1)
            r2 = 0
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = 0
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.d(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.C0230D.e(w0.p):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // w0.o
    public final int f(w0.p pVar, R.r rVar) {
        boolean z3;
        int i3;
        long j3;
        ?? r22;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z4;
        int i8;
        long j4;
        long j5;
        long j6 = ((w0.l) pVar).f9607o;
        int i9 = this.f4795a;
        if (i9 == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f4809o) {
            x xVar = this.f4805k;
            if (j6 != -1 && !z3 && !xVar.f5099d) {
                int i10 = this.f4814t;
                if (i10 <= 0) {
                    xVar.a((w0.l) pVar);
                    return 0;
                }
                boolean z5 = xVar.f5101f;
                U.t tVar = xVar.f5098c;
                if (!z5) {
                    w0.l lVar = (w0.l) pVar;
                    long j7 = lVar.f9607o;
                    int min = (int) Math.min(112800, j7);
                    long j8 = j7 - min;
                    if (lVar.f9608p != j8) {
                        rVar.f1989a = j8;
                    } else {
                        tVar.D(min);
                        lVar.f9610r = 0;
                        lVar.p(tVar.f2477a, 0, min, false);
                        int i11 = tVar.f2478b;
                        int i12 = tVar.f2479c;
                        int i13 = i12 - 188;
                        while (true) {
                            if (i13 >= i11) {
                                byte[] bArr = tVar.f2477a;
                                int i14 = -4;
                                int i15 = 0;
                                while (true) {
                                    if (i14 > 4) {
                                        break;
                                    }
                                    int i16 = (i14 * 188) + i13;
                                    if (i16 >= i11 && i16 < i12 && bArr[i16] == 71) {
                                        i15++;
                                        if (i15 == 5) {
                                            long J3 = android.support.v4.media.session.a.J(tVar, i13, i10);
                                            if (J3 != -9223372036854775807L) {
                                                j5 = J3;
                                                break;
                                            }
                                        }
                                    } else {
                                        i15 = 0;
                                    }
                                    i14++;
                                }
                                i13--;
                            } else {
                                j5 = -9223372036854775807L;
                                break;
                            }
                        }
                        xVar.f5103h = j5;
                        xVar.f5101f = true;
                        return 0;
                    }
                } else if (xVar.f5103h == -9223372036854775807L) {
                    xVar.a((w0.l) pVar);
                    return 0;
                } else if (!xVar.f5100e) {
                    w0.l lVar2 = (w0.l) pVar;
                    int min2 = (int) Math.min(112800, lVar2.f9607o);
                    long j9 = 0;
                    if (lVar2.f9608p != j9) {
                        rVar.f1989a = j9;
                    } else {
                        tVar.D(min2);
                        lVar2.f9610r = 0;
                        lVar2.p(tVar.f2477a, 0, min2, false);
                        int i17 = tVar.f2478b;
                        int i18 = tVar.f2479c;
                        while (true) {
                            if (i17 < i18) {
                                if (tVar.f2477a[i17] == 71) {
                                    long J4 = android.support.v4.media.session.a.J(tVar, i17, i10);
                                    if (J4 != -9223372036854775807L) {
                                        j4 = J4;
                                        break;
                                    }
                                }
                                i17++;
                            } else {
                                j4 = -9223372036854775807L;
                                break;
                            }
                        }
                        xVar.f5102g = j4;
                        xVar.f5100e = true;
                        return 0;
                    }
                } else {
                    long j10 = xVar.f5102g;
                    if (j10 == -9223372036854775807L) {
                        xVar.a((w0.l) pVar);
                        return 0;
                    }
                    U.y yVar = xVar.f5097b;
                    xVar.f5104i = yVar.c(xVar.f5103h) - yVar.b(j10);
                    xVar.a((w0.l) pVar);
                    return 0;
                }
                return 1;
            }
            if (!this.f4810p) {
                this.f4810p = true;
                long j11 = xVar.f5104i;
                if (j11 != -9223372036854775807L) {
                    i3 = i9;
                    j3 = j6;
                    B0.c cVar = new B0.c(new C0816a(3), new B0.b(this.f4814t, xVar.f5097b), j11, j11 + 1, 0L, j6, 188L, 940);
                    this.f4806l = cVar;
                    this.f4807m.n(cVar.f30a);
                } else {
                    i3 = i9;
                    j3 = j6;
                    this.f4807m.n(new w0.s(j11));
                }
            } else {
                i3 = i9;
                j3 = j6;
            }
            if (this.f4811q) {
                this.f4811q = false;
                b(0L, 0L);
                if (((w0.l) pVar).f9608p != 0) {
                    rVar.f1989a = 0L;
                    return 1;
                }
            }
            r22 = 1;
            r22 = 1;
            B0.c cVar2 = this.f4806l;
            if (cVar2 != null && cVar2.f32c != null) {
                return cVar2.b((w0.l) pVar, rVar);
            }
        } else {
            i3 = i9;
            j3 = j6;
            r22 = 1;
        }
        U.t tVar2 = this.f4798d;
        byte[] bArr2 = tVar2.f2477a;
        if (9400 - tVar2.f2478b < 188) {
            int a3 = tVar2.a();
            if (a3 > 0) {
                System.arraycopy(bArr2, tVar2.f2478b, bArr2, 0, a3);
            }
            tVar2.E(bArr2, a3);
        }
        while (true) {
            int a4 = tVar2.a();
            SparseArray sparseArray = this.f4802h;
            if (a4 < 188) {
                int i19 = tVar2.f2479c;
                int read = ((w0.l) pVar).read(bArr2, i19, 9400 - i19);
                if (read == -1) {
                    for (int i20 = 0; i20 < sparseArray.size(); i20++) {
                        InterfaceC0233G interfaceC0233G = (InterfaceC0233G) sparseArray.valueAt(i20);
                        if (interfaceC0233G instanceof w) {
                            w wVar = (w) interfaceC0233G;
                            if (wVar.f5086c == 3 && wVar.f5093j == -1 && (!z3 || !(wVar.f5084a instanceof C0243j))) {
                                wVar.b(r22, new U.t());
                            }
                        }
                    }
                    return -1;
                }
                tVar2.F(i19 + read);
            } else {
                int i21 = tVar2.f2478b;
                int i22 = tVar2.f2479c;
                byte[] bArr3 = tVar2.f2477a;
                int i23 = i21;
                while (i23 < i22 && bArr3[i23] != 71) {
                    i23++;
                }
                tVar2.G(i23);
                int i24 = i23 + 188;
                InterfaceC0233G interfaceC0233G2 = null;
                if (i24 > i22) {
                    int i25 = (i23 - i21) + this.f4813s;
                    this.f4813s = i25;
                    i4 = i3;
                    i5 = 2;
                    if (i4 != 2 || i25 <= 376) {
                        i6 = 0;
                    } else {
                        throw H.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i4 = i3;
                    i5 = 2;
                    i6 = 0;
                    this.f4813s = 0;
                }
                int i26 = tVar2.f2479c;
                if (i24 > i26) {
                    return i6;
                }
                int h3 = tVar2.h();
                if ((8388608 & h3) != 0) {
                    tVar2.G(i24);
                    return i6;
                }
                if ((4194304 & h3) != 0) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                int i27 = (2096896 & h3) >> 8;
                if ((h3 & 32) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((h3 & 16) != 0) {
                    interfaceC0233G2 = (InterfaceC0233G) sparseArray.get(i27);
                }
                if (interfaceC0233G2 == null) {
                    tVar2.G(i24);
                    return 0;
                }
                if (i4 != i5) {
                    int i28 = h3 & 15;
                    SparseIntArray sparseIntArray = this.f4799e;
                    int i29 = sparseIntArray.get(i27, i28 - 1);
                    sparseIntArray.put(i27, i28);
                    if (i29 == i28) {
                        tVar2.G(i24);
                        return 0;
                    } else if (i28 != ((i29 + r22) & 15)) {
                        interfaceC0233G2.a();
                    }
                }
                if (z4) {
                    int u3 = tVar2.u();
                    if ((tVar2.u() & 64) != 0) {
                        i8 = 2;
                    } else {
                        i8 = 0;
                    }
                    i7 |= i8;
                    tVar2.H(u3 - r22);
                }
                boolean z6 = this.f4809o;
                if (i4 == i5 || z6 || !this.f4804j.get(i27, false)) {
                    tVar2.F(i24);
                    interfaceC0233G2.b(i7, tVar2);
                    tVar2.F(i26);
                }
                if (i4 != i5 && !z6 && this.f4809o && j3 != -1) {
                    this.f4811q = r22;
                }
                tVar2.G(i24);
                return 0;
            }
        }
    }

    @Override // w0.o
    public final void h(w0.q qVar) {
        if ((this.f4796b & 1) == 0) {
            qVar = new B1.e(qVar, this.f4801g);
        }
        this.f4807m = qVar;
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
