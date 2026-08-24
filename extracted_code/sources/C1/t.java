package c1;

import R.C0112o;
import R.C0113p;
import U.AbstractC0123a;
/* loaded from: classes.dex */
public final class t implements InterfaceC0241h {

    /* renamed from: a  reason: collision with root package name */
    public final U.t f5047a;

    /* renamed from: b  reason: collision with root package name */
    public final w0.y f5048b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5049c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5050d;

    /* renamed from: e  reason: collision with root package name */
    public w0.G f5051e;

    /* renamed from: f  reason: collision with root package name */
    public String f5052f;

    /* renamed from: g  reason: collision with root package name */
    public int f5053g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f5054h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5055i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5056j;

    /* renamed from: k  reason: collision with root package name */
    public long f5057k;

    /* renamed from: l  reason: collision with root package name */
    public int f5058l;

    /* renamed from: m  reason: collision with root package name */
    public long f5059m;

    /* JADX WARN: Type inference failed for: r0v1, types: [w0.y, java.lang.Object] */
    public t(String str, int i3) {
        U.t tVar = new U.t(4);
        this.f5047a = tVar;
        tVar.f2477a[0] = -1;
        this.f5048b = new Object();
        this.f5059m = -9223372036854775807L;
        this.f5049c = str;
        this.f5050d = i3;
    }

    @Override // c1.InterfaceC0241h
    public final void a() {
        this.f5053g = 0;
        this.f5054h = 0;
        this.f5056j = false;
        this.f5059m = -9223372036854775807L;
    }

    @Override // c1.InterfaceC0241h
    public final void d(U.t tVar) {
        boolean z3;
        boolean z4;
        AbstractC0123a.k(this.f5051e);
        while (tVar.a() > 0) {
            int i3 = this.f5053g;
            boolean z5 = true;
            U.t tVar2 = this.f5047a;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        int min = Math.min(tVar.a(), this.f5058l - this.f5054h);
                        this.f5051e.f(min, tVar);
                        int i4 = this.f5054h + min;
                        this.f5054h = i4;
                        if (i4 >= this.f5058l) {
                            if (this.f5059m == -9223372036854775807L) {
                                z5 = false;
                            }
                            AbstractC0123a.j(z5);
                            this.f5051e.b(this.f5059m, 1, this.f5058l, 0, null);
                            this.f5059m += this.f5057k;
                            this.f5054h = 0;
                            this.f5053g = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int min2 = Math.min(tVar.a(), 4 - this.f5054h);
                    tVar.f(tVar2.f2477a, this.f5054h, min2);
                    int i5 = this.f5054h + min2;
                    this.f5054h = i5;
                    if (i5 >= 4) {
                        tVar2.G(0);
                        int h3 = tVar2.h();
                        w0.y yVar = this.f5048b;
                        if (!yVar.a(h3)) {
                            this.f5054h = 0;
                            this.f5053g = 1;
                        } else {
                            this.f5058l = yVar.f9655b;
                            if (!this.f5055i) {
                                this.f5057k = (yVar.f9659f * 1000000) / yVar.f9656c;
                                C0112o c0112o = new C0112o();
                                c0112o.f1926a = this.f5052f;
                                c0112o.f1937l = R.G.l((String) yVar.f9660g);
                                c0112o.f1938m = 4096;
                                c0112o.f1950z = yVar.f9657d;
                                c0112o.f1917A = yVar.f9656c;
                                c0112o.f1929d = this.f5049c;
                                c0112o.f1931f = this.f5050d;
                                this.f5051e.c(new C0113p(c0112o));
                                this.f5055i = true;
                            }
                            tVar2.G(0);
                            this.f5051e.f(4, tVar2);
                            this.f5053g = 2;
                        }
                    }
                }
            } else {
                byte[] bArr = tVar.f2477a;
                int i6 = tVar.f2478b;
                int i7 = tVar.f2479c;
                while (true) {
                    if (i6 < i7) {
                        byte b3 = bArr[i6];
                        if ((b3 & 255) == 255) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (this.f5056j && (b3 & 224) == 224) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        this.f5056j = z3;
                        if (z4) {
                            tVar.G(i6 + 1);
                            this.f5056j = false;
                            tVar2.f2477a[1] = bArr[i6];
                            this.f5054h = 2;
                            this.f5053g = 1;
                            break;
                        }
                        i6++;
                    } else {
                        tVar.G(i7);
                        break;
                    }
                }
            }
        }
    }

    @Override // c1.InterfaceC0241h
    public final void f(long j3, int i3) {
        this.f5059m = j3;
    }

    @Override // c1.InterfaceC0241h
    public final void g(w0.q qVar, C0232F c0232f) {
        c0232f.a();
        c0232f.c();
        this.f5052f = (String) c0232f.f4821e;
        c0232f.c();
        this.f5051e = qVar.w(c0232f.f4819c, 1);
    }

    @Override // c1.InterfaceC0241h
    public final void e(boolean z3) {
    }
}
