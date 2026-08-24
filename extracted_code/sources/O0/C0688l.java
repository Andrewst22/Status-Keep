package o0;

import U.AbstractC0123a;
import java.util.List;
/* renamed from: o0.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0688l implements W {

    /* renamed from: m  reason: collision with root package name */
    public final D1.b0 f8614m;

    /* renamed from: n  reason: collision with root package name */
    public long f8615n;

    public C0688l(List list, List list2) {
        boolean z3;
        D1.F i3 = D1.I.i();
        if (list.size() == list2.size()) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3.a(new C0687k((W) list.get(i4), (List) list2.get(i4)));
        }
        this.f8614m = i3.g();
        this.f8615n = -9223372036854775807L;
    }

    @Override // o0.W
    public final boolean d() {
        int i3 = 0;
        while (true) {
            D1.b0 b0Var = this.f8614m;
            if (i3 >= b0Var.size()) {
                return false;
            }
            if (((C0687k) b0Var.get(i3)).d()) {
                return true;
            }
            i3++;
        }
    }

    @Override // o0.W
    public final boolean h(Y.P p3) {
        boolean z3;
        boolean z4;
        boolean z5 = false;
        do {
            long t3 = t();
            if (t3 == Long.MIN_VALUE) {
                break;
            }
            int i3 = 0;
            z3 = false;
            while (true) {
                D1.b0 b0Var = this.f8614m;
                if (i3 >= b0Var.size()) {
                    break;
                }
                long t4 = ((C0687k) b0Var.get(i3)).t();
                if (t4 != Long.MIN_VALUE && t4 <= p3.f3150a) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (t4 == t3 || z4) {
                    z3 |= ((C0687k) b0Var.get(i3)).h(p3);
                }
                i3++;
            }
            z5 |= z3;
        } while (z3);
        return z5;
    }

    @Override // o0.W
    public final long m() {
        int i3 = 0;
        long j3 = Long.MAX_VALUE;
        long j4 = Long.MAX_VALUE;
        while (true) {
            D1.b0 b0Var = this.f8614m;
            if (i3 >= b0Var.size()) {
                break;
            }
            C0687k c0687k = (C0687k) b0Var.get(i3);
            long m3 = c0687k.m();
            if ((c0687k.a().contains(1) || c0687k.a().contains(2) || c0687k.a().contains(4)) && m3 != Long.MIN_VALUE) {
                j3 = Math.min(j3, m3);
            }
            if (m3 != Long.MIN_VALUE) {
                j4 = Math.min(j4, m3);
            }
            i3++;
        }
        if (j3 != Long.MAX_VALUE) {
            this.f8615n = j3;
            return j3;
        } else if (j4 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j5 = this.f8615n;
            if (j5 != -9223372036854775807L) {
                return j5;
            }
            return j4;
        }
    }

    @Override // o0.W
    public final long t() {
        int i3 = 0;
        long j3 = Long.MAX_VALUE;
        while (true) {
            D1.b0 b0Var = this.f8614m;
            if (i3 >= b0Var.size()) {
                break;
            }
            long t3 = ((C0687k) b0Var.get(i3)).t();
            if (t3 != Long.MIN_VALUE) {
                j3 = Math.min(j3, t3);
            }
            i3++;
        }
        if (j3 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    @Override // o0.W
    public final void v(long j3) {
        int i3 = 0;
        while (true) {
            D1.b0 b0Var = this.f8614m;
            if (i3 < b0Var.size()) {
                ((C0687k) b0Var.get(i3)).v(j3);
                i3++;
            } else {
                return;
            }
        }
    }
}
