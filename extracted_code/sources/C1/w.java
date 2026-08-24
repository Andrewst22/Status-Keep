package c1;

import U.AbstractC0123a;
/* loaded from: classes.dex */
public final class w implements InterfaceC0233G {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0241h f5084a;

    /* renamed from: b  reason: collision with root package name */
    public final U.s f5085b = new U.s(new byte[10], 10);

    /* renamed from: c  reason: collision with root package name */
    public int f5086c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f5087d;

    /* renamed from: e  reason: collision with root package name */
    public U.y f5088e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5089f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5090g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5091h;

    /* renamed from: i  reason: collision with root package name */
    public int f5092i;

    /* renamed from: j  reason: collision with root package name */
    public int f5093j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5094k;

    /* renamed from: l  reason: collision with root package name */
    public long f5095l;

    public w(InterfaceC0241h interfaceC0241h) {
        this.f5084a = interfaceC0241h;
    }

    @Override // c1.InterfaceC0233G
    public final void a() {
        this.f5086c = 0;
        this.f5087d = 0;
        this.f5091h = false;
        this.f5084a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // c1.InterfaceC0233G
    public final void b(int i3, U.t tVar) {
        int i4;
        int i5;
        boolean z3;
        AbstractC0123a.k(this.f5088e);
        int i6 = i3 & 1;
        InterfaceC0241h interfaceC0241h = this.f5084a;
        int i7 = -1;
        int i8 = 3;
        int i9 = 2;
        ?? r9 = 0;
        if (i6 != 0) {
            int i10 = this.f5086c;
            if (i10 != 0 && i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        if (this.f5093j != -1) {
                            AbstractC0123a.A("PesReader", "Unexpected start indicator: expected " + this.f5093j + " more bytes");
                        }
                        if (tVar.f2479c == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        interfaceC0241h.e(z3);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    AbstractC0123a.A("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f5086c = 1;
            this.f5087d = 0;
        }
        int i11 = i3;
        while (tVar.a() > 0) {
            int i12 = this.f5086c;
            if (i12 != 0) {
                U.s sVar = this.f5085b;
                if (i12 != 1) {
                    if (i12 != i9) {
                        if (i12 == i8) {
                            int a3 = tVar.a();
                            int i13 = this.f5093j;
                            if (i13 == i7) {
                                i5 = 0;
                            } else {
                                i5 = a3 - i13;
                            }
                            if (i5 > 0) {
                                a3 -= i5;
                                tVar.F(tVar.f2478b + a3);
                            }
                            interfaceC0241h.d(tVar);
                            int i14 = this.f5093j;
                            if (i14 != i7) {
                                int i15 = i14 - a3;
                                this.f5093j = i15;
                                if (i15 == 0) {
                                    interfaceC0241h.e(r9);
                                    this.f5086c = 1;
                                    this.f5087d = r9;
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (d(tVar, sVar.f2472d, Math.min(10, this.f5092i)) && d(tVar, null, this.f5092i)) {
                            sVar.q(r9);
                            this.f5095l = -9223372036854775807L;
                            int i16 = 4;
                            if (this.f5089f) {
                                sVar.t(4);
                                sVar.t(1);
                                sVar.t(1);
                                long i17 = (sVar.i(i8) << 30) | (sVar.i(15) << 15) | sVar.i(15);
                                sVar.t(1);
                                if (!this.f5091h && this.f5090g) {
                                    sVar.t(4);
                                    sVar.t(1);
                                    long i18 = sVar.i(15) << 15;
                                    sVar.t(1);
                                    sVar.t(1);
                                    this.f5088e.b(i18 | (sVar.i(i8) << 30) | sVar.i(15));
                                    this.f5091h = true;
                                }
                                this.f5095l = this.f5088e.b(i17);
                            }
                            if (!this.f5094k) {
                                i16 = 0;
                            }
                            i11 |= i16;
                            interfaceC0241h.f(this.f5095l, i11);
                            this.f5086c = 3;
                            this.f5087d = 0;
                        }
                    }
                } else if (d(tVar, sVar.f2472d, 9)) {
                    sVar.q(0);
                    int i19 = sVar.i(24);
                    if (i19 != 1) {
                        D2.h.n(i19, "Unexpected start code prefix: ", "PesReader");
                        this.f5093j = -1;
                        i4 = 0;
                    } else {
                        sVar.t(8);
                        int i20 = sVar.i(16);
                        sVar.t(5);
                        this.f5094k = sVar.h();
                        sVar.t(2);
                        this.f5089f = sVar.h();
                        this.f5090g = sVar.h();
                        sVar.t(6);
                        int i21 = sVar.i(8);
                        this.f5092i = i21;
                        if (i20 == 0) {
                            this.f5093j = -1;
                        } else {
                            int i22 = (i20 - 3) - i21;
                            this.f5093j = i22;
                            if (i22 < 0) {
                                AbstractC0123a.A("PesReader", "Found negative packet payload size: " + this.f5093j);
                                this.f5093j = -1;
                                i4 = 2;
                            }
                        }
                        i4 = 2;
                    }
                    this.f5086c = i4;
                    this.f5087d = 0;
                }
            } else {
                tVar.H(tVar.a());
            }
            i7 = -1;
            i8 = 3;
            i9 = 2;
            r9 = 0;
        }
    }

    @Override // c1.InterfaceC0233G
    public final void c(U.y yVar, w0.q qVar, C0232F c0232f) {
        this.f5088e = yVar;
        this.f5084a.g(qVar, c0232f);
    }

    public final boolean d(U.t tVar, byte[] bArr, int i3) {
        int min = Math.min(tVar.a(), i3 - this.f5087d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            tVar.H(min);
        } else {
            tVar.f(bArr, this.f5087d, min);
        }
        int i4 = this.f5087d + min;
        this.f5087d = i4;
        if (i4 == i3) {
            return true;
        }
        return false;
    }
}
