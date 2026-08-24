package c1;
/* renamed from: c1.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0228B implements InterfaceC0233G {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0227A f4786a;

    /* renamed from: b  reason: collision with root package name */
    public final U.t f4787b = new U.t(32);

    /* renamed from: c  reason: collision with root package name */
    public int f4788c;

    /* renamed from: d  reason: collision with root package name */
    public int f4789d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4790e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4791f;

    public C0228B(InterfaceC0227A interfaceC0227A) {
        this.f4786a = interfaceC0227A;
    }

    @Override // c1.InterfaceC0233G
    public final void a() {
        this.f4791f = true;
    }

    @Override // c1.InterfaceC0233G
    public final void b(int i3, U.t tVar) {
        boolean z3;
        int i4;
        boolean z4;
        if ((i3 & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            i4 = tVar.f2478b + tVar.u();
        } else {
            i4 = -1;
        }
        if (this.f4791f) {
            if (!z3) {
                return;
            }
            this.f4791f = false;
            tVar.G(i4);
            this.f4789d = 0;
        }
        while (tVar.a() > 0) {
            int i5 = this.f4789d;
            U.t tVar2 = this.f4787b;
            if (i5 < 3) {
                if (i5 == 0) {
                    int u3 = tVar.u();
                    tVar.G(tVar.f2478b - 1);
                    if (u3 == 255) {
                        this.f4791f = true;
                        return;
                    }
                }
                int min = Math.min(tVar.a(), 3 - this.f4789d);
                tVar.f(tVar2.f2477a, this.f4789d, min);
                int i6 = this.f4789d + min;
                this.f4789d = i6;
                if (i6 == 3) {
                    tVar2.G(0);
                    tVar2.F(3);
                    tVar2.H(1);
                    int u4 = tVar2.u();
                    int u5 = tVar2.u();
                    if ((u4 & 128) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.f4790e = z4;
                    int i7 = (((u4 & 15) << 8) | u5) + 3;
                    this.f4788c = i7;
                    byte[] bArr = tVar2.f2477a;
                    if (bArr.length < i7) {
                        tVar2.b(Math.min(4098, Math.max(i7, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(tVar.a(), this.f4788c - this.f4789d);
                tVar.f(tVar2.f2477a, this.f4789d, min2);
                int i8 = this.f4789d + min2;
                this.f4789d = i8;
                int i9 = this.f4788c;
                if (i8 != i9) {
                    continue;
                } else {
                    if (this.f4790e) {
                        if (U.A.m(0, i9, -1, tVar2.f2477a) != 0) {
                            this.f4791f = true;
                            return;
                        }
                        tVar2.F(this.f4788c - 4);
                    } else {
                        tVar2.F(i9);
                    }
                    tVar2.G(0);
                    this.f4786a.d(tVar2);
                    this.f4789d = 0;
                }
            }
        }
    }

    @Override // c1.InterfaceC0233G
    public final void c(U.y yVar, w0.q qVar, C0232F c0232f) {
        this.f4786a.c(yVar, qVar, c0232f);
        this.f4791f = true;
    }
}
