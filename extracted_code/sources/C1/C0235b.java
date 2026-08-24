package c1;

import R.C0112o;
import R.C0113p;
import U.AbstractC0123a;
import i1.C0308g;
import w0.AbstractC0892b;
import w0.C0893c;
/* renamed from: c1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235b implements InterfaceC0241h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4825a;

    /* renamed from: b  reason: collision with root package name */
    public final U.s f4826b;

    /* renamed from: c  reason: collision with root package name */
    public final U.t f4827c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4828d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4829e;

    /* renamed from: f  reason: collision with root package name */
    public String f4830f;

    /* renamed from: g  reason: collision with root package name */
    public w0.G f4831g;

    /* renamed from: h  reason: collision with root package name */
    public int f4832h;

    /* renamed from: i  reason: collision with root package name */
    public int f4833i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4834j;

    /* renamed from: k  reason: collision with root package name */
    public long f4835k;

    /* renamed from: l  reason: collision with root package name */
    public C0113p f4836l;

    /* renamed from: m  reason: collision with root package name */
    public int f4837m;

    /* renamed from: n  reason: collision with root package name */
    public long f4838n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0235b() {
        this(0, 0, null);
        this.f4825a = 0;
    }

    @Override // c1.InterfaceC0241h
    public final void a() {
        switch (this.f4825a) {
            case 0:
                this.f4832h = 0;
                this.f4833i = 0;
                this.f4834j = false;
                this.f4838n = -9223372036854775807L;
                return;
            default:
                this.f4832h = 0;
                this.f4833i = 0;
                this.f4834j = false;
                this.f4838n = -9223372036854775807L;
                return;
        }
    }

    @Override // c1.InterfaceC0241h
    public final void d(U.t tVar) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        switch (this.f4825a) {
            case 0:
                AbstractC0123a.k(this.f4831g);
                while (tVar.a() > 0) {
                    int i3 = this.f4832h;
                    U.t tVar2 = this.f4827c;
                    boolean z8 = true;
                    if (i3 == 0) {
                        while (true) {
                            if (tVar.a() <= 0) {
                                break;
                            } else if (!this.f4834j) {
                                if (tVar.u() == 11) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                this.f4834j = z3;
                            } else {
                                int u3 = tVar.u();
                                if (u3 == 119) {
                                    this.f4834j = false;
                                    this.f4832h = 1;
                                    byte[] bArr = tVar2.f2477a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f4833i = 2;
                                } else {
                                    if (u3 == 11) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    this.f4834j = z4;
                                }
                            }
                        }
                    } else if (i3 != 1) {
                        if (i3 == 2) {
                            int min = Math.min(tVar.a(), this.f4837m - this.f4833i);
                            this.f4831g.f(min, tVar);
                            int i4 = this.f4833i + min;
                            this.f4833i = i4;
                            if (i4 == this.f4837m) {
                                if (this.f4838n == -9223372036854775807L) {
                                    z8 = false;
                                }
                                AbstractC0123a.j(z8);
                                this.f4831g.b(this.f4838n, 1, this.f4837m, 0, null);
                                this.f4838n += this.f4835k;
                                this.f4832h = 0;
                            }
                        }
                    } else {
                        byte[] bArr2 = tVar2.f2477a;
                        int min2 = Math.min(tVar.a(), 128 - this.f4833i);
                        tVar.f(bArr2, this.f4833i, min2);
                        int i5 = this.f4833i + min2;
                        this.f4833i = i5;
                        if (i5 == 128) {
                            U.s sVar = this.f4826b;
                            sVar.q(0);
                            C0893c o3 = AbstractC0892b.o(sVar);
                            C0113p c0113p = this.f4836l;
                            int i6 = o3.f9557b;
                            int i7 = o3.f9558c;
                            String str = o3.f9556a;
                            if (c0113p == null || i7 != c0113p.f1951A || i6 != c0113p.f1952B || !U.A.a(str, c0113p.f1974m)) {
                                C0112o c0112o = new C0112o();
                                c0112o.f1926a = this.f4830f;
                                c0112o.f1937l = R.G.l(str);
                                c0112o.f1950z = i7;
                                c0112o.f1917A = i6;
                                c0112o.f1929d = this.f4828d;
                                c0112o.f1931f = this.f4829e;
                                int i8 = o3.f9561f;
                                c0112o.f1933h = i8;
                                if ("audio/ac3".equals(str)) {
                                    c0112o.f1932g = i8;
                                }
                                C0113p c0113p2 = new C0113p(c0112o);
                                this.f4836l = c0113p2;
                                this.f4831g.c(c0113p2);
                            }
                            this.f4837m = o3.f9559d;
                            this.f4835k = (o3.f9560e * 1000000) / this.f4836l.f1952B;
                            tVar2.G(0);
                            this.f4831g.f(128, tVar2);
                            this.f4832h = 2;
                        }
                    }
                }
                return;
            default:
                AbstractC0123a.k(this.f4831g);
                while (tVar.a() > 0) {
                    int i9 = this.f4832h;
                    U.t tVar3 = this.f4827c;
                    boolean z9 = true;
                    if (i9 != 0) {
                        if (i9 != 1) {
                            if (i9 == 2) {
                                int min3 = Math.min(tVar.a(), this.f4837m - this.f4833i);
                                this.f4831g.f(min3, tVar);
                                int i10 = this.f4833i + min3;
                                this.f4833i = i10;
                                if (i10 == this.f4837m) {
                                    if (this.f4838n == -9223372036854775807L) {
                                        z9 = false;
                                    }
                                    AbstractC0123a.j(z9);
                                    this.f4831g.b(this.f4838n, 1, this.f4837m, 0, null);
                                    this.f4838n += this.f4835k;
                                    this.f4832h = 0;
                                }
                            }
                        } else {
                            byte[] bArr3 = tVar3.f2477a;
                            int min4 = Math.min(tVar.a(), 16 - this.f4833i);
                            tVar.f(bArr3, this.f4833i, min4);
                            int i11 = this.f4833i + min4;
                            this.f4833i = i11;
                            if (i11 == 16) {
                                U.s sVar2 = this.f4826b;
                                sVar2.q(0);
                                C0308g p3 = AbstractC0892b.p(sVar2);
                                C0113p c0113p3 = this.f4836l;
                                int i12 = p3.f6023a;
                                if (c0113p3 == null || 2 != c0113p3.f1951A || i12 != c0113p3.f1952B || !"audio/ac4".equals(c0113p3.f1974m)) {
                                    C0112o c0112o2 = new C0112o();
                                    c0112o2.f1926a = this.f4830f;
                                    c0112o2.f1937l = R.G.l("audio/ac4");
                                    c0112o2.f1950z = 2;
                                    c0112o2.f1917A = i12;
                                    c0112o2.f1929d = this.f4828d;
                                    c0112o2.f1931f = this.f4829e;
                                    C0113p c0113p4 = new C0113p(c0112o2);
                                    this.f4836l = c0113p4;
                                    this.f4831g.c(c0113p4);
                                }
                                this.f4837m = p3.f6024b;
                                this.f4835k = (p3.f6025c * 1000000) / this.f4836l.f1952B;
                                tVar3.G(0);
                                this.f4831g.f(16, tVar3);
                                this.f4832h = 2;
                            }
                        }
                    } else {
                        while (tVar.a() > 0) {
                            if (!this.f4834j) {
                                if (tVar.u() == 172) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                this.f4834j = z5;
                            } else {
                                int u4 = tVar.u();
                                if (u4 == 172) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                this.f4834j = z6;
                                int i13 = 65;
                                if (u4 == 64 || u4 == 65) {
                                    if (u4 == 65) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    this.f4832h = 1;
                                    byte[] bArr4 = tVar3.f2477a;
                                    bArr4[0] = -84;
                                    if (!z7) {
                                        i13 = 64;
                                    }
                                    bArr4[1] = (byte) i13;
                                    this.f4833i = 2;
                                }
                            }
                        }
                    }
                }
                return;
        }
    }

    @Override // c1.InterfaceC0241h
    public final void e(boolean z3) {
        int i3 = this.f4825a;
    }

    @Override // c1.InterfaceC0241h
    public final void f(long j3, int i3) {
        switch (this.f4825a) {
            case 0:
                this.f4838n = j3;
                return;
            default:
                this.f4838n = j3;
                return;
        }
    }

    @Override // c1.InterfaceC0241h
    public final void g(w0.q qVar, C0232F c0232f) {
        switch (this.f4825a) {
            case 0:
                c0232f.a();
                c0232f.c();
                this.f4830f = (String) c0232f.f4821e;
                c0232f.c();
                this.f4831g = qVar.w(c0232f.f4819c, 1);
                return;
            default:
                c0232f.a();
                c0232f.c();
                this.f4830f = (String) c0232f.f4821e;
                c0232f.c();
                this.f4831g = qVar.w(c0232f.f4819c, 1);
                return;
        }
    }

    public C0235b(int i3, int i4, String str) {
        this.f4825a = i4;
        switch (i4) {
            case 1:
                U.s sVar = new U.s(new byte[16], 16);
                this.f4826b = sVar;
                this.f4827c = new U.t(sVar.f2472d);
                this.f4832h = 0;
                this.f4833i = 0;
                this.f4834j = false;
                this.f4838n = -9223372036854775807L;
                this.f4828d = str;
                this.f4829e = i3;
                return;
            default:
                U.s sVar2 = new U.s(new byte[128], 128);
                this.f4826b = sVar2;
                this.f4827c = new U.t(sVar2.f2472d);
                this.f4832h = 0;
                this.f4838n = -9223372036854775807L;
                this.f4828d = str;
                this.f4829e = i3;
                return;
        }
    }

    private final void b(boolean z3) {
    }

    private final void c(boolean z3) {
    }
}
