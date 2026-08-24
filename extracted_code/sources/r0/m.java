package r0;

import D1.AbstractC0046z;
import D1.I;
import D1.Z;
import D1.b0;
import D1.i0;
import R.U;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class m extends o implements Comparable {

    /* renamed from: q  reason: collision with root package name */
    public final int f8959q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f8960r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f8961s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f8962t;

    /* renamed from: u  reason: collision with root package name */
    public final int f8963u;

    /* renamed from: v  reason: collision with root package name */
    public final int f8964v;

    /* renamed from: w  reason: collision with root package name */
    public final int f8965w;
    public final int x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f8966y;

    public m(int i3, U u3, int i4, C0757j c0757j, int i5, String str) {
        super(i3, u3, i4);
        boolean z3;
        boolean z4;
        b0 b0Var;
        int i6;
        boolean z5;
        boolean z6;
        boolean z7;
        int i7 = 0;
        this.f8960r = D2.h.i(i5, false);
        int i8 = this.f8970p.f1966e;
        c0757j.getClass();
        if ((i8 & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f8961s = z3;
        if ((i8 & 2) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f8962t = z4;
        b0 b0Var2 = c0757j.f1857n;
        if (b0Var2.isEmpty()) {
            b0Var = I.o("");
        } else {
            b0Var = b0Var2;
        }
        int i9 = 0;
        while (true) {
            if (i9 < b0Var.size()) {
                i6 = q.d(this.f8970p, (String) b0Var.get(i9), false);
                if (i6 > 0) {
                    break;
                }
                i9++;
            } else {
                i9 = Integer.MAX_VALUE;
                i6 = 0;
                break;
            }
        }
        this.f8963u = i9;
        this.f8964v = i6;
        int c3 = q.c(this.f8970p.f1967f, c0757j.f1858o);
        this.f8965w = c3;
        if ((this.f8970p.f1967f & 1088) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f8966y = z5;
        if (q.f(str) == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        int d3 = q.d(this.f8970p, str, z6);
        this.x = d3;
        if (i6 <= 0 && ((!b0Var2.isEmpty() || c3 <= 0) && !this.f8961s && (!this.f8962t || d3 <= 0))) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (D2.h.i(i5, c0757j.f8951w) && z7) {
            i7 = 1;
        }
        this.f8959q = i7;
    }

    @Override // r0.o
    public final int a() {
        return this.f8959q;
    }

    @Override // r0.o
    public final /* bridge */ /* synthetic */ boolean b(o oVar) {
        m mVar = (m) oVar;
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public final int compareTo(m mVar) {
        AbstractC0046z c3 = AbstractC0046z.f317a.c(this.f8960r, mVar.f8960r);
        Integer valueOf = Integer.valueOf(this.f8963u);
        Integer valueOf2 = Integer.valueOf(mVar.f8963u);
        Comparator comparator = Z.f224m;
        comparator.getClass();
        i0 i0Var = i0.f271m;
        AbstractC0046z b3 = c3.b(valueOf, valueOf2, i0Var);
        int i3 = this.f8964v;
        AbstractC0046z a3 = b3.a(i3, mVar.f8964v);
        int i4 = this.f8965w;
        AbstractC0046z c4 = a3.a(i4, mVar.f8965w).c(this.f8961s, mVar.f8961s);
        Boolean valueOf3 = Boolean.valueOf(this.f8962t);
        Boolean valueOf4 = Boolean.valueOf(mVar.f8962t);
        if (i3 != 0) {
            comparator = i0Var;
        }
        AbstractC0046z a4 = c4.b(valueOf3, valueOf4, comparator).a(this.x, mVar.x);
        if (i4 == 0) {
            a4 = a4.d(this.f8966y, mVar.f8966y);
        }
        return a4.e();
    }
}
