package c1;

import R.C0112o;
import U.AbstractC0123a;
import java.util.Collections;
import java.util.List;
/* renamed from: c1.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240g implements InterfaceC0241h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4893a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4894b;

    /* renamed from: c  reason: collision with root package name */
    public long f4895c;

    /* renamed from: d  reason: collision with root package name */
    public int f4896d;

    /* renamed from: e  reason: collision with root package name */
    public int f4897e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f4898f;

    /* renamed from: g  reason: collision with root package name */
    public Object f4899g;

    public C0240g(List list) {
        this.f4893a = 0;
        this.f4898f = list;
        this.f4899g = new w0.G[list.size()];
        this.f4895c = -9223372036854775807L;
    }

    @Override // c1.InterfaceC0241h
    public final void a() {
        switch (this.f4893a) {
            case 0:
                this.f4894b = false;
                this.f4895c = -9223372036854775807L;
                return;
            default:
                this.f4894b = false;
                this.f4895c = -9223372036854775807L;
                return;
        }
    }

    @Override // c1.InterfaceC0241h
    public final void d(U.t tVar) {
        w0.G[] gArr;
        boolean z3;
        boolean z4;
        switch (this.f4893a) {
            case 0:
                if (this.f4894b) {
                    if (this.f4896d == 2) {
                        if (tVar.a() == 0) {
                            z4 = false;
                        } else {
                            if (tVar.u() != 32) {
                                this.f4894b = false;
                            }
                            this.f4896d--;
                            z4 = this.f4894b;
                        }
                        if (!z4) {
                            return;
                        }
                    }
                    if (this.f4896d == 1) {
                        if (tVar.a() == 0) {
                            z3 = false;
                        } else {
                            if (tVar.u() != 0) {
                                this.f4894b = false;
                            }
                            this.f4896d--;
                            z3 = this.f4894b;
                        }
                        if (!z3) {
                            return;
                        }
                    }
                    int i3 = tVar.f2478b;
                    int a3 = tVar.a();
                    for (w0.G g3 : (w0.G[]) this.f4899g) {
                        tVar.G(i3);
                        g3.f(a3, tVar);
                    }
                    this.f4897e += a3;
                    return;
                }
                return;
            default:
                AbstractC0123a.k((w0.G) this.f4899g);
                if (this.f4894b) {
                    int a4 = tVar.a();
                    int i4 = this.f4897e;
                    if (i4 < 10) {
                        int min = Math.min(a4, 10 - i4);
                        byte[] bArr = tVar.f2477a;
                        int i5 = tVar.f2478b;
                        U.t tVar2 = (U.t) this.f4898f;
                        System.arraycopy(bArr, i5, tVar2.f2477a, this.f4897e, min);
                        if (this.f4897e + min == 10) {
                            tVar2.G(0);
                            if (73 == tVar2.u() && 68 == tVar2.u() && 51 == tVar2.u()) {
                                tVar2.H(3);
                                this.f4896d = tVar2.t() + 10;
                            } else {
                                AbstractC0123a.A("Id3Reader", "Discarding invalid ID3 tag");
                                this.f4894b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a4, this.f4896d - this.f4897e);
                    ((w0.G) this.f4899g).f(min2, tVar);
                    this.f4897e += min2;
                    return;
                }
                return;
        }
    }

    @Override // c1.InterfaceC0241h
    public final void e(boolean z3) {
        boolean z4;
        int i3;
        boolean z5;
        switch (this.f4893a) {
            case 0:
                if (this.f4894b) {
                    if (this.f4895c != -9223372036854775807L) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    AbstractC0123a.j(z4);
                    for (w0.G g3 : (w0.G[]) this.f4899g) {
                        g3.b(this.f4895c, 1, this.f4897e, 0, null);
                    }
                    this.f4894b = false;
                    return;
                }
                return;
            default:
                AbstractC0123a.k((w0.G) this.f4899g);
                if (this.f4894b && (i3 = this.f4896d) != 0 && this.f4897e == i3) {
                    if (this.f4895c != -9223372036854775807L) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    AbstractC0123a.j(z5);
                    ((w0.G) this.f4899g).b(this.f4895c, 1, this.f4896d, 0, null);
                    this.f4894b = false;
                    return;
                }
                return;
        }
    }

    @Override // c1.InterfaceC0241h
    public final void f(long j3, int i3) {
        switch (this.f4893a) {
            case 0:
                if ((i3 & 4) != 0) {
                    this.f4894b = true;
                    this.f4895c = j3;
                    this.f4897e = 0;
                    this.f4896d = 2;
                    return;
                }
                return;
            default:
                if ((i3 & 4) != 0) {
                    this.f4894b = true;
                    this.f4895c = j3;
                    this.f4896d = 0;
                    this.f4897e = 0;
                    return;
                }
                return;
        }
    }

    @Override // c1.InterfaceC0241h
    public final void g(w0.q qVar, C0232F c0232f) {
        switch (this.f4893a) {
            case 0:
                int i3 = 0;
                while (true) {
                    w0.G[] gArr = (w0.G[]) this.f4899g;
                    if (i3 < gArr.length) {
                        C0231E c0231e = (C0231E) ((List) this.f4898f).get(i3);
                        c0232f.a();
                        c0232f.c();
                        w0.G w3 = qVar.w(c0232f.f4819c, 3);
                        C0112o c0112o = new C0112o();
                        c0232f.c();
                        c0112o.f1926a = (String) c0232f.f4821e;
                        c0112o.f1937l = R.G.l("application/dvbsubs");
                        c0112o.f1940o = Collections.singletonList(c0231e.f4816b);
                        c0112o.f1929d = c0231e.f4815a;
                        D2.h.p(c0112o, w3);
                        gArr[i3] = w3;
                        i3++;
                    } else {
                        return;
                    }
                }
            default:
                c0232f.a();
                c0232f.c();
                w0.G w4 = qVar.w(c0232f.f4819c, 5);
                this.f4899g = w4;
                C0112o c0112o2 = new C0112o();
                c0232f.c();
                c0112o2.f1926a = (String) c0232f.f4821e;
                c0112o2.f1937l = R.G.l("application/id3");
                D2.h.p(c0112o2, w4);
                return;
        }
    }

    public C0240g() {
        this.f4893a = 1;
        this.f4898f = new U.t(10);
        this.f4895c = -9223372036854775807L;
    }
}
