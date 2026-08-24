package T0;

import D1.I;
import D1.b0;
import R.C0112o;
import R.C0113p;
import R.H;
import R.r;
import U.A;
import U.AbstractC0123a;
import U.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import w0.G;
import w0.p;
import w0.q;
import w0.x;
/* loaded from: classes.dex */
public final class h implements w0.o {

    /* renamed from: a  reason: collision with root package name */
    public final l f2310a;

    /* renamed from: b  reason: collision with root package name */
    public final C0113p f2311b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f2312c;

    /* renamed from: f  reason: collision with root package name */
    public G f2315f;

    /* renamed from: g  reason: collision with root package name */
    public int f2316g;

    /* renamed from: h  reason: collision with root package name */
    public int f2317h;

    /* renamed from: i  reason: collision with root package name */
    public long[] f2318i;

    /* renamed from: j  reason: collision with root package name */
    public long f2319j;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f2314e = A.f2410f;

    /* renamed from: d  reason: collision with root package name */
    public final t f2313d = new t();

    public h(l lVar, C0113p c0113p) {
        this.f2310a = lVar;
        C0112o a3 = c0113p.a();
        a3.f1937l = R.G.l("application/x-media3-cues");
        a3.f1934i = c0113p.f1974m;
        a3.f1922F = lVar.k();
        this.f2311b = new C0113p(a3);
        this.f2312c = new ArrayList();
        this.f2317h = 0;
        this.f2318i = A.f2411g;
        this.f2319j = -9223372036854775807L;
    }

    public final void a(g gVar) {
        AbstractC0123a.k(this.f2315f);
        byte[] bArr = gVar.f2309n;
        int length = bArr.length;
        t tVar = this.f2313d;
        tVar.getClass();
        tVar.E(bArr, bArr.length);
        this.f2315f.f(length, tVar);
        this.f2315f.b(gVar.f2308m, 1, length, 0, null);
    }

    @Override // w0.o
    public final void b(long j3, long j4) {
        boolean z3;
        int i3 = this.f2317h;
        if (i3 != 0 && i3 != 5) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        this.f2319j = j4;
        if (this.f2317h == 2) {
            this.f2317h = 1;
        }
        if (this.f2317h == 4) {
            this.f2317h = 3;
        }
    }

    @Override // w0.o
    public final w0.o d() {
        return this;
    }

    @Override // w0.o
    public final boolean e(p pVar) {
        return true;
    }

    @Override // w0.o
    public final int f(p pVar, r rVar) {
        boolean z3;
        int i3;
        int f3;
        k kVar;
        int i4;
        int i5 = this.f2317h;
        if (i5 != 0 && i5 != 5) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        if (this.f2317h == 1) {
            if (((w0.l) pVar).f9607o != -1) {
                i4 = android.support.v4.media.session.a.i(((w0.l) pVar).f9607o);
            } else {
                i4 = 1024;
            }
            if (i4 > this.f2314e.length) {
                this.f2314e = new byte[i4];
            }
            this.f2316g = 0;
            this.f2317h = 2;
        }
        int i6 = this.f2317h;
        ArrayList arrayList = this.f2312c;
        if (i6 == 2) {
            byte[] bArr = this.f2314e;
            if (bArr.length == this.f2316g) {
                this.f2314e = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.f2314e;
            int i7 = this.f2316g;
            w0.l lVar = (w0.l) pVar;
            int read = lVar.read(bArr2, i7, bArr2.length - i7);
            if (read != -1) {
                this.f2316g += read;
            }
            long j3 = lVar.f9607o;
            if ((j3 != -1 && this.f2316g == j3) || read == -1) {
                try {
                    long j4 = this.f2319j;
                    if (j4 != -9223372036854775807L) {
                        kVar = new k(j4, true);
                    } else {
                        kVar = k.f2322c;
                    }
                    this.f2310a.e(this.f2314e, 0, this.f2316g, kVar, new B0.a(this, 2));
                    Collections.sort(arrayList);
                    this.f2318i = new long[arrayList.size()];
                    for (int i8 = 0; i8 < arrayList.size(); i8++) {
                        this.f2318i[i8] = ((g) arrayList.get(i8)).f2308m;
                    }
                    this.f2314e = A.f2410f;
                    this.f2317h = 4;
                } catch (RuntimeException e2) {
                    throw H.a(e2, "SubtitleParser failed.");
                }
            }
        }
        if (this.f2317h == 3) {
            if (((w0.l) pVar).f9607o != -1) {
                i3 = android.support.v4.media.session.a.i(((w0.l) pVar).f9607o);
            } else {
                i3 = 1024;
            }
            if (((w0.l) pVar).k(i3) == -1) {
                long j5 = this.f2319j;
                if (j5 == -9223372036854775807L) {
                    f3 = 0;
                } else {
                    f3 = A.f(this.f2318i, j5, true);
                }
                while (f3 < arrayList.size()) {
                    a((g) arrayList.get(f3));
                    f3++;
                }
                this.f2317h = 4;
            }
        }
        if (this.f2317h != 4) {
            return 0;
        }
        return -1;
    }

    @Override // w0.o
    public final void h(q qVar) {
        boolean z3;
        if (this.f2317h == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        G w3 = qVar.w(0, 3);
        this.f2315f = w3;
        w3.c(this.f2311b);
        qVar.s();
        qVar.n(new x(-9223372036854775807L, new long[]{0}, new long[]{0}));
        this.f2317h = 1;
    }

    @Override // w0.o
    public final List l() {
        D1.G g3 = I.f197n;
        return b0.f231q;
    }

    @Override // w0.o
    public final void release() {
        if (this.f2317h == 5) {
            return;
        }
        this.f2310a.b();
        this.f2317h = 5;
    }
}
