package r0;

import D1.AbstractC0046z;
import D1.Z;
import D1.a0;
import D1.b0;
import D1.i0;
import R.C0113p;
import R.U;
import U.A;
import android.text.TextUtils;
/* renamed from: r0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0753f extends o implements Comparable {

    /* renamed from: A  reason: collision with root package name */
    public final int f8915A;

    /* renamed from: B  reason: collision with root package name */
    public final int f8916B;

    /* renamed from: C  reason: collision with root package name */
    public final boolean f8917C;

    /* renamed from: D  reason: collision with root package name */
    public final int f8918D;

    /* renamed from: E  reason: collision with root package name */
    public final int f8919E;

    /* renamed from: F  reason: collision with root package name */
    public final int f8920F;

    /* renamed from: G  reason: collision with root package name */
    public final int f8921G;

    /* renamed from: H  reason: collision with root package name */
    public final boolean f8922H;

    /* renamed from: I  reason: collision with root package name */
    public final boolean f8923I;

    /* renamed from: q  reason: collision with root package name */
    public final int f8924q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f8925r;

    /* renamed from: s  reason: collision with root package name */
    public final String f8926s;

    /* renamed from: t  reason: collision with root package name */
    public final C0757j f8927t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f8928u;

    /* renamed from: v  reason: collision with root package name */
    public final int f8929v;

    /* renamed from: w  reason: collision with root package name */
    public final int f8930w;
    public final int x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f8931y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f8932z;

    public C0753f(int i3, U u3, int i4, C0757j c0757j, int i5, boolean z3, C0751d c0751d, int i6) {
        super(i3, u3, i4);
        int i7;
        int i8;
        int i9;
        boolean z4;
        boolean z5;
        boolean z6;
        int i10;
        boolean z7;
        boolean z8;
        boolean z9;
        this.f8927t = c0757j;
        if (c0757j.f8949u) {
            i7 = 24;
        } else {
            i7 = 16;
        }
        int i11 = 0;
        this.f8931y = false;
        this.f8926s = q.f(this.f8970p.f1965d);
        this.f8928u = D2.h.i(i5, false);
        int i12 = 0;
        while (true) {
            b0 b0Var = c0757j.f1852i;
            i8 = Integer.MAX_VALUE;
            if (i12 < b0Var.size()) {
                i9 = q.d(this.f8970p, (String) b0Var.get(i12), false);
                if (i9 > 0) {
                    break;
                }
                i12++;
            } else {
                i12 = Integer.MAX_VALUE;
                i9 = 0;
                break;
            }
        }
        this.f8930w = i12;
        this.f8929v = i9;
        this.x = q.c(this.f8970p.f1967f, 0);
        C0113p c0113p = this.f8970p;
        int i13 = c0113p.f1967f;
        if (i13 != 0 && (i13 & 1) == 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f8932z = z4;
        if ((c0113p.f1966e & 1) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f8917C = z5;
        int i14 = c0113p.f1951A;
        this.f8918D = i14;
        this.f8919E = c0113p.f1952B;
        int i15 = c0113p.f1970i;
        this.f8920F = i15;
        if ((i15 == -1 || i15 <= c0757j.f1854k) && ((i14 == -1 || i14 <= c0757j.f1853j) && c0751d.apply(c0113p))) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f8925r = z6;
        String[] D3 = A.D();
        int i16 = 0;
        while (true) {
            if (i16 < D3.length) {
                i10 = q.d(this.f8970p, D3[i16], false);
                if (i10 > 0) {
                    break;
                }
                i16++;
            } else {
                i16 = Integer.MAX_VALUE;
                i10 = 0;
                break;
            }
        }
        this.f8915A = i16;
        this.f8916B = i10;
        int i17 = 0;
        while (true) {
            b0 b0Var2 = c0757j.f1855l;
            if (i17 < b0Var2.size()) {
                String str = this.f8970p.f1974m;
                if (str != null && str.equals(b0Var2.get(i17))) {
                    i8 = i17;
                    break;
                }
                i17++;
            } else {
                break;
            }
        }
        this.f8921G = i8;
        if (D2.h.f(i5) == 128) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f8922H = z7;
        if (D2.h.g(i5) == 64) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f8923I = z8;
        C0757j c0757j2 = this.f8927t;
        if (D2.h.i(i5, c0757j2.f8951w) && ((z9 = this.f8925r) || c0757j2.f8948t)) {
            c0757j2.f1856m.getClass();
            i11 = (!D2.h.i(i5, false) || !z9 || this.f8970p.f1970i == -1 || (!c0757j2.x && z3) || (i7 & i5) == 0) ? 1 : 2;
        }
        this.f8924q = i11;
    }

    @Override // r0.o
    public final int a() {
        return this.f8924q;
    }

    @Override // r0.o
    public final boolean b(o oVar) {
        int i3;
        String str;
        C0753f c0753f = (C0753f) oVar;
        this.f8927t.getClass();
        C0113p c0113p = this.f8970p;
        int i4 = c0113p.f1951A;
        if (i4 != -1) {
            C0113p c0113p2 = c0753f.f8970p;
            if (i4 == c0113p2.f1951A && ((this.f8931y || ((str = c0113p.f1974m) != null && TextUtils.equals(str, c0113p2.f1974m))) && (i3 = c0113p.f1952B) != -1 && i3 == c0113p2.f1952B)) {
                if (this.f8922H == c0753f.f8922H && this.f8923I == c0753f.f8923I) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public final int compareTo(C0753f c0753f) {
        a0 a3;
        boolean z3 = this.f8928u;
        boolean z4 = this.f8925r;
        if (z4 && z3) {
            a3 = q.f8985i;
        } else {
            a3 = q.f8985i.a();
        }
        AbstractC0046z c3 = AbstractC0046z.f317a.c(z3, c0753f.f8928u);
        Integer valueOf = Integer.valueOf(this.f8930w);
        Integer valueOf2 = Integer.valueOf(c0753f.f8930w);
        Z.f224m.getClass();
        i0 i0Var = i0.f271m;
        AbstractC0046z b3 = c3.b(valueOf, valueOf2, i0Var).a(this.f8929v, c0753f.f8929v).a(this.x, c0753f.x).c(this.f8917C, c0753f.f8917C).c(this.f8932z, c0753f.f8932z).b(Integer.valueOf(this.f8915A), Integer.valueOf(c0753f.f8915A), i0Var).a(this.f8916B, c0753f.f8916B).c(z4, c0753f.f8925r).b(Integer.valueOf(this.f8921G), Integer.valueOf(c0753f.f8921G), i0Var);
        this.f8927t.getClass();
        AbstractC0046z b4 = b3.c(this.f8922H, c0753f.f8922H).c(this.f8923I, c0753f.f8923I).b(Integer.valueOf(this.f8918D), Integer.valueOf(c0753f.f8918D), a3).b(Integer.valueOf(this.f8919E), Integer.valueOf(c0753f.f8919E), a3);
        if (A.a(this.f8926s, c0753f.f8926s)) {
            b4 = b4.b(Integer.valueOf(this.f8920F), Integer.valueOf(c0753f.f8920F), a3);
        }
        return b4.e();
    }
}
