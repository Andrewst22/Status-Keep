package b0;

import R.C0113p;
import U.A;
import o0.U;
/* loaded from: classes.dex */
public final class l implements U {

    /* renamed from: m  reason: collision with root package name */
    public final C0113p f4611m;

    /* renamed from: o  reason: collision with root package name */
    public long[] f4613o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4614p;

    /* renamed from: q  reason: collision with root package name */
    public c0.g f4615q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4616r;

    /* renamed from: s  reason: collision with root package name */
    public int f4617s;

    /* renamed from: n  reason: collision with root package name */
    public final B1.a f4612n = new B1.a(1);

    /* renamed from: t  reason: collision with root package name */
    public long f4618t = -9223372036854775807L;

    public l(c0.g gVar, C0113p c0113p, boolean z3) {
        this.f4611m = c0113p;
        this.f4615q = gVar;
        this.f4613o = gVar.f4742b;
        b(gVar, z3);
    }

    public final void b(c0.g gVar, boolean z3) {
        long j3;
        int i3 = this.f4617s;
        long j4 = -9223372036854775807L;
        if (i3 == 0) {
            j3 = -9223372036854775807L;
        } else {
            j3 = this.f4613o[i3 - 1];
        }
        this.f4614p = z3;
        this.f4615q = gVar;
        long[] jArr = gVar.f4742b;
        this.f4613o = jArr;
        long j5 = this.f4618t;
        if (j5 != -9223372036854775807L) {
            int b3 = A.b(jArr, j5, true);
            this.f4617s = b3;
            if (this.f4614p && b3 == this.f4613o.length) {
                j4 = j5;
            }
            this.f4618t = j4;
        } else if (j3 != -9223372036854775807L) {
            this.f4617s = A.b(jArr, j3, false);
        }
    }

    @Override // o0.U
    public final boolean f() {
        return true;
    }

    @Override // o0.U
    public final int i(B1.a aVar, X.f fVar, int i3) {
        boolean z3;
        int i4 = this.f4617s;
        if (i4 == this.f4613o.length) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && !this.f4614p) {
            fVar.f1529n = 4;
            return -4;
        } else if ((i3 & 2) == 0 && this.f4616r) {
            if (z3) {
                return -3;
            }
            if ((i3 & 1) == 0) {
                this.f4617s = i4 + 1;
            }
            if ((i3 & 4) == 0) {
                byte[] A3 = this.f4612n.A(this.f4615q.f4741a[i4]);
                fVar.h(A3.length);
                fVar.f2934q.put(A3);
            }
            fVar.f2936s = this.f4613o[i4];
            fVar.f1529n = 1;
            return -4;
        } else {
            aVar.f51o = this.f4611m;
            this.f4616r = true;
            return -5;
        }
    }

    @Override // o0.U
    public final int n(long j3) {
        int max = Math.max(this.f4617s, A.b(this.f4613o, j3, true));
        int i3 = max - this.f4617s;
        this.f4617s = max;
        return i3;
    }

    @Override // o0.U
    public final void a() {
    }
}
