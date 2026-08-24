package T0;

import R.C0112o;
import R.C0113p;
import R.InterfaceC0107j;
import U.A;
import U.AbstractC0123a;
import U.t;
import java.io.EOFException;
import n2.AbstractC0662e;
import w0.F;
import w0.G;
/* loaded from: classes.dex */
public final class o implements G {

    /* renamed from: a  reason: collision with root package name */
    public final G f2331a;

    /* renamed from: b  reason: collision with root package name */
    public final j f2332b;

    /* renamed from: g  reason: collision with root package name */
    public l f2337g;

    /* renamed from: h  reason: collision with root package name */
    public C0113p f2338h;

    /* renamed from: d  reason: collision with root package name */
    public int f2334d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f2335e = 0;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f2336f = A.f2410f;

    /* renamed from: c  reason: collision with root package name */
    public final t f2333c = new t();

    public o(G g3, j jVar) {
        this.f2331a = g3;
        this.f2332b = jVar;
    }

    @Override // w0.G
    public final void a(t tVar, int i3, int i4) {
        if (this.f2337g == null) {
            this.f2331a.a(tVar, i3, i4);
            return;
        }
        g(i3);
        tVar.f(this.f2336f, this.f2335e, i3);
        this.f2335e += i3;
    }

    @Override // w0.G
    public final void b(long j3, int i3, int i4, int i5, F f3) {
        boolean z3;
        if (this.f2337g == null) {
            this.f2331a.b(j3, i3, i4, i5, f3);
            return;
        }
        if (f3 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.d("DRM on subtitles is not supported", z3);
        int i6 = (this.f2335e - i5) - i4;
        this.f2337g.e(this.f2336f, i6, i4, k.f2322c, new n(this, j3, i3));
        int i7 = i6 + i4;
        this.f2334d = i7;
        if (i7 == this.f2335e) {
            this.f2334d = 0;
            this.f2335e = 0;
        }
    }

    @Override // w0.G
    public final void c(C0113p c0113p) {
        boolean z3;
        l lVar;
        c0113p.f1974m.getClass();
        String str = c0113p.f1974m;
        if (R.G.g(str) == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        boolean equals = c0113p.equals(this.f2338h);
        j jVar = this.f2332b;
        if (!equals) {
            this.f2338h = c0113p;
            if (jVar.g(c0113p)) {
                lVar = jVar.l(c0113p);
            } else {
                lVar = null;
            }
            this.f2337g = lVar;
        }
        l lVar2 = this.f2337g;
        G g3 = this.f2331a;
        if (lVar2 == null) {
            g3.c(c0113p);
            return;
        }
        C0112o a3 = c0113p.a();
        a3.f1937l = R.G.l("application/x-media3-cues");
        a3.f1934i = str;
        a3.f1942q = Long.MAX_VALUE;
        a3.f1922F = jVar.e(c0113p);
        D2.h.p(a3, g3);
    }

    @Override // w0.G
    public final int d(InterfaceC0107j interfaceC0107j, int i3, boolean z3) {
        return e(interfaceC0107j, i3, z3);
    }

    @Override // w0.G
    public final int e(InterfaceC0107j interfaceC0107j, int i3, boolean z3) {
        if (this.f2337g == null) {
            return this.f2331a.e(interfaceC0107j, i3, z3);
        }
        g(i3);
        int read = interfaceC0107j.read(this.f2336f, this.f2335e, i3);
        if (read == -1) {
            if (z3) {
                return -1;
            }
            throw new EOFException();
        }
        this.f2335e += read;
        return read;
    }

    @Override // w0.G
    public final /* synthetic */ void f(int i3, t tVar) {
        AbstractC0662e.a(this, tVar, i3);
    }

    public final void g(int i3) {
        byte[] bArr;
        int length = this.f2336f.length;
        int i4 = this.f2335e;
        if (length - i4 >= i3) {
            return;
        }
        int i5 = i4 - this.f2334d;
        int max = Math.max(i5 * 2, i3 + i5);
        byte[] bArr2 = this.f2336f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.f2334d, bArr, 0, i5);
        this.f2334d = 0;
        this.f2335e = i5;
        this.f2336f = bArr;
    }
}
