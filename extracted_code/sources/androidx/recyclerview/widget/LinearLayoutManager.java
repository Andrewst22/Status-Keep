package androidx.recyclerview.widget;

import C0.e;
import D2.h;
import a.AbstractC0155a;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import e0.l;
import i1.C0292C;
import i1.C0312k;
import i1.C0313l;
import i1.t;
import i1.u;
/* loaded from: classes.dex */
public class LinearLayoutManager extends t {

    /* renamed from: h  reason: collision with root package name */
    public final int f4419h;

    /* renamed from: i  reason: collision with root package name */
    public l f4420i;

    /* renamed from: j  reason: collision with root package name */
    public final e f4421j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f4422k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f4423l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4424m = false;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f4425n = true;

    /* renamed from: o  reason: collision with root package name */
    public C0313l f4426o = null;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f4419h = 1;
        this.f4422k = false;
        C0312k c0312k = new C0312k(0);
        c0312k.f6038b = -1;
        c0312k.f6039c = Integer.MIN_VALUE;
        c0312k.f6040d = false;
        c0312k.f6041e = false;
        C0312k w3 = t.w(context, attributeSet, i3, i4);
        int i5 = w3.f6038b;
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException(h.k("invalid orientation:", i5));
        }
        a(null);
        if (i5 != this.f4419h || this.f4421j == null) {
            this.f4421j = e.a(this, i5);
            this.f4419h = i5;
            H();
        }
        boolean z3 = w3.f6040d;
        a(null);
        if (z3 != this.f4422k) {
            this.f4422k = z3;
            H();
        }
        Q(w3.f6041e);
    }

    @Override // i1.t
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View P3 = P(0, p(), false);
            if (P3 == null) {
                accessibilityEvent.setFromIndex(-1);
                View P4 = P(p() - 1, -1, false);
                if (P4 == null) {
                    accessibilityEvent.setToIndex(-1);
                    return;
                } else {
                    ((u) P4.getLayoutParams()).getClass();
                    throw null;
                }
            }
            ((u) P3.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // i1.t
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof C0313l) {
            this.f4426o = (C0313l) parcelable;
            H();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, i1.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.os.Parcelable, i1.l, java.lang.Object] */
    @Override // i1.t
    public final Parcelable C() {
        C0313l c0313l = this.f4426o;
        if (c0313l != null) {
            ?? obj = new Object();
            obj.f6042m = c0313l.f6042m;
            obj.f6043n = c0313l.f6043n;
            obj.f6044o = c0313l.f6044o;
            return obj;
        }
        ?? obj2 = new Object();
        if (p() > 0) {
            M();
            boolean z3 = this.f4423l;
            obj2.f6044o = z3;
            int i3 = 0;
            if (z3) {
                if (!z3) {
                    i3 = p() - 1;
                }
                View o3 = o(i3);
                obj2.f6043n = this.f4421j.d() - this.f4421j.b(o3);
                t.v(o3);
                throw null;
            }
            if (z3) {
                i3 = p() - 1;
            }
            t.v(o(i3));
            throw null;
        }
        obj2.f6042m = -1;
        return obj2;
    }

    public final int J(C0292C c0292c) {
        if (p() == 0) {
            return 0;
        }
        M();
        e eVar = this.f4421j;
        boolean z3 = !this.f4425n;
        return AbstractC0155a.s(c0292c, eVar, O(z3), N(z3), this, this.f4425n);
    }

    public final void K(C0292C c0292c) {
        if (p() == 0) {
            return;
        }
        M();
        boolean z3 = !this.f4425n;
        View O3 = O(z3);
        View N3 = N(z3);
        if (p() != 0 && c0292c.a() != 0 && O3 != null && N3 != null) {
            ((u) O3.getLayoutParams()).getClass();
            throw null;
        }
    }

    public final int L(C0292C c0292c) {
        if (p() == 0) {
            return 0;
        }
        M();
        e eVar = this.f4421j;
        boolean z3 = !this.f4425n;
        return AbstractC0155a.t(c0292c, eVar, O(z3), N(z3), this, this.f4425n);
    }

    public final void M() {
        if (this.f4420i == null) {
            this.f4420i = new l(13);
        }
    }

    public final View N(boolean z3) {
        if (this.f4423l) {
            return P(0, p(), z3);
        }
        return P(p() - 1, -1, z3);
    }

    public final View O(boolean z3) {
        if (this.f4423l) {
            return P(p() - 1, -1, z3);
        }
        return P(0, p(), z3);
    }

    public final View P(int i3, int i4, boolean z3) {
        int i5;
        M();
        if (z3) {
            i5 = 24579;
        } else {
            i5 = 320;
        }
        if (this.f4419h == 0) {
            return this.f6054c.b(i3, i4, i5, 320);
        }
        return this.f6055d.b(i3, i4, i5, 320);
    }

    public void Q(boolean z3) {
        a(null);
        if (this.f4424m == z3) {
            return;
        }
        this.f4424m = z3;
        H();
    }

    @Override // i1.t
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f4426o == null && (recyclerView = this.f6053b) != null) {
            recyclerView.b(str);
        }
    }

    @Override // i1.t
    public final boolean b() {
        if (this.f4419h == 0) {
            return true;
        }
        return false;
    }

    @Override // i1.t
    public final boolean c() {
        if (this.f4419h == 1) {
            return true;
        }
        return false;
    }

    @Override // i1.t
    public final int f(C0292C c0292c) {
        return J(c0292c);
    }

    @Override // i1.t
    public final void g(C0292C c0292c) {
        K(c0292c);
    }

    @Override // i1.t
    public final int h(C0292C c0292c) {
        return L(c0292c);
    }

    @Override // i1.t
    public final int i(C0292C c0292c) {
        return J(c0292c);
    }

    @Override // i1.t
    public final void j(C0292C c0292c) {
        K(c0292c);
    }

    @Override // i1.t
    public final int k(C0292C c0292c) {
        return L(c0292c);
    }

    @Override // i1.t
    public u l() {
        return new u(-2, -2);
    }

    @Override // i1.t
    public final boolean y() {
        return true;
    }

    @Override // i1.t
    public final void z(RecyclerView recyclerView) {
    }
}
