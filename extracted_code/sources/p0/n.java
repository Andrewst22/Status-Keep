package p0;

import R.C0113p;
import U.AbstractC0123a;
import W.A;
import a.AbstractC0155a;
import g2.C0276a;
import o0.T;
import w0.G;
/* loaded from: classes.dex */
public final class n extends AbstractC0728a {

    /* renamed from: A  reason: collision with root package name */
    public final int f8825A;

    /* renamed from: B  reason: collision with root package name */
    public final C0113p f8826B;

    /* renamed from: C  reason: collision with root package name */
    public long f8827C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f8828D;

    public n(W.h hVar, W.l lVar, C0113p c0113p, int i3, Object obj, long j3, long j4, long j5, int i4, C0113p c0113p2) {
        super(hVar, lVar, c0113p, i3, obj, j3, j4, -9223372036854775807L, -9223372036854775807L, j5);
        this.f8825A = i4;
        this.f8826B = c0113p2;
    }

    @Override // s0.k
    public final void b() {
        T[] tArr;
        A a3 = this.f8786u;
        C0276a c0276a = this.f8756y;
        AbstractC0123a.k(c0276a);
        for (T t3 : (T[]) c0276a.f5778o) {
            if (t3.f8523F != 0) {
                t3.f8523F = 0L;
                t3.f8549z = true;
            }
        }
        G l3 = c0276a.l(this.f8825A);
        l3.c(this.f8826B);
        try {
            long j3 = a3.j(this.f8779n.a(this.f8827C));
            if (j3 != -1) {
                j3 += this.f8827C;
            }
            w0.l lVar = new w0.l(this.f8786u, this.f8827C, j3);
            for (int i3 = 0; i3 != -1; i3 = l3.d(lVar, Integer.MAX_VALUE, true)) {
                this.f8827C += i3;
            }
            l3.b(this.f8784s, 1, (int) this.f8827C, 0, null);
            AbstractC0155a.r(a3);
            this.f8828D = true;
        } catch (Throwable th) {
            AbstractC0155a.r(a3);
            throw th;
        }
    }

    @Override // p0.l
    public final boolean d() {
        return this.f8828D;
    }

    @Override // s0.k
    public final void c() {
    }
}
