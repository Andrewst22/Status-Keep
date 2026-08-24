package androidx.recyclerview.widget;

import C.C0009j;
import C.y;
import C0.e;
import H.b;
import a.AbstractC0155a;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import c1.C0232F;
import e0.l;
import i1.C0292C;
import i1.C0297H;
import i1.C0299J;
import i1.C0300K;
import i1.C0312k;
import i1.t;
import i1.u;
import i1.z;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.BitSet;
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends t {

    /* renamed from: h  reason: collision with root package name */
    public final int f4486h;

    /* renamed from: i  reason: collision with root package name */
    public final C0232F[] f4487i;

    /* renamed from: j  reason: collision with root package name */
    public final e f4488j;

    /* renamed from: k  reason: collision with root package name */
    public final e f4489k;

    /* renamed from: l  reason: collision with root package name */
    public final int f4490l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f4491m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f4492n = false;

    /* renamed from: o  reason: collision with root package name */
    public final C0299J f4493o;

    /* renamed from: p  reason: collision with root package name */
    public final int f4494p;

    /* renamed from: q  reason: collision with root package name */
    public C0300K f4495q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f4496r;

    /* renamed from: s  reason: collision with root package name */
    public final b f4497s;

    /* JADX WARN: Type inference failed for: r1v0, types: [i1.J, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f4486h = -1;
        this.f4491m = false;
        ?? obj = new Object();
        this.f4493o = obj;
        this.f4494p = 2;
        new Rect();
        new l(this, 17);
        this.f4496r = true;
        this.f4497s = new b(this, 5);
        C0312k w3 = t.w(context, attributeSet, i3, i4);
        int i5 = w3.f6038b;
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i5 != this.f4490l) {
            this.f4490l = i5;
            e eVar = this.f4488j;
            this.f4488j = this.f4489k;
            this.f4489k = eVar;
            H();
        }
        int i6 = w3.f6039c;
        a(null);
        if (i6 != this.f4486h) {
            obj.f5973a = null;
            H();
            this.f4486h = i6;
            new BitSet(this.f4486h);
            this.f4487i = new C0232F[this.f4486h];
            for (int i7 = 0; i7 < this.f4486h; i7++) {
                this.f4487i[i7] = new C0232F(this, i7);
            }
            H();
        }
        boolean z3 = w3.f6040d;
        a(null);
        C0300K c0300k = this.f4495q;
        if (c0300k != null && c0300k.f5981t != z3) {
            c0300k.f5981t = z3;
        }
        this.f4491m = z3;
        H();
        C0009j c0009j = new C0009j(5);
        c0009j.f107b = 0;
        c0009j.f108c = 0;
        this.f4488j = e.a(this, this.f4490l);
        this.f4489k = e.a(this, 1 - this.f4490l);
    }

    @Override // i1.t
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View O3 = O(false);
            View N3 = N(false);
            if (O3 != null && N3 != null) {
                ((u) O3.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // i1.t
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof C0300K) {
            this.f4495q = (C0300K) parcelable;
            H();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, i1.K, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.os.Parcelable, i1.K, java.lang.Object] */
    @Override // i1.t
    public final Parcelable C() {
        View O3;
        C0300K c0300k = this.f4495q;
        if (c0300k != null) {
            ?? obj = new Object();
            obj.f5976o = c0300k.f5976o;
            obj.f5974m = c0300k.f5974m;
            obj.f5975n = c0300k.f5975n;
            obj.f5977p = c0300k.f5977p;
            obj.f5978q = c0300k.f5978q;
            obj.f5979r = c0300k.f5979r;
            obj.f5981t = c0300k.f5981t;
            obj.f5982u = c0300k.f5982u;
            obj.f5983v = c0300k.f5983v;
            obj.f5980s = c0300k.f5980s;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.f5981t = this.f4491m;
        obj2.f5982u = false;
        obj2.f5983v = false;
        obj2.f5978q = 0;
        if (p() > 0) {
            P();
            obj2.f5974m = 0;
            if (this.f4492n) {
                O3 = N(true);
            } else {
                O3 = O(true);
            }
            if (O3 == null) {
                obj2.f5975n = -1;
                int i3 = this.f4486h;
                obj2.f5976o = i3;
                obj2.f5977p = new int[i3];
                for (int i4 = 0; i4 < this.f4486h; i4++) {
                    C0232F c0232f = this.f4487i[i4];
                    int i5 = c0232f.f4817a;
                    if (i5 == Integer.MIN_VALUE) {
                        if (((ArrayList) c0232f.f4820d).size() == 0) {
                            i5 = Integer.MIN_VALUE;
                        } else {
                            View view = (View) ((ArrayList) c0232f.f4820d).get(0);
                            c0232f.f4817a = ((StaggeredGridLayoutManager) c0232f.f4821e).f4488j.c(view);
                            ((C0297H) view.getLayoutParams()).getClass();
                            i5 = c0232f.f4817a;
                        }
                    }
                    if (i5 != Integer.MIN_VALUE) {
                        i5 -= this.f4488j.g();
                    }
                    obj2.f5977p[i4] = i5;
                }
            } else {
                ((u) O3.getLayoutParams()).getClass();
                throw null;
            }
        } else {
            obj2.f5974m = -1;
            obj2.f5975n = -1;
            obj2.f5976o = 0;
        }
        return obj2;
    }

    @Override // i1.t
    public final void D(int i3) {
        if (i3 == 0) {
            J();
        }
    }

    public final boolean J() {
        int i3 = this.f4486h;
        boolean z3 = this.f4492n;
        if (p() == 0 || this.f4494p == 0 || !this.f6056e) {
            return false;
        }
        if (z3) {
            Q();
            P();
        } else {
            P();
            Q();
        }
        int p3 = p();
        int i4 = p3 - 1;
        new BitSet(i3).set(0, i3, true);
        if (this.f4490l == 1) {
            RecyclerView recyclerView = this.f6053b;
            Field field = y.f117a;
            if (recyclerView.getLayoutDirection() != 1) {
            }
        }
        if (z3) {
            p3 = -1;
        } else {
            i4 = 0;
        }
        if (i4 == p3) {
            return false;
        }
        ((C0297H) o(i4).getLayoutParams()).getClass();
        throw null;
    }

    public final int K(C0292C c0292c) {
        if (p() == 0) {
            return 0;
        }
        e eVar = this.f4488j;
        boolean z3 = !this.f4496r;
        return AbstractC0155a.s(c0292c, eVar, O(z3), N(z3), this, this.f4496r);
    }

    public final void L(C0292C c0292c) {
        if (p() == 0) {
            return;
        }
        boolean z3 = !this.f4496r;
        View O3 = O(z3);
        View N3 = N(z3);
        if (p() != 0 && c0292c.a() != 0 && O3 != null && N3 != null) {
            ((u) O3.getLayoutParams()).getClass();
            throw null;
        }
    }

    public final int M(C0292C c0292c) {
        if (p() == 0) {
            return 0;
        }
        e eVar = this.f4488j;
        boolean z3 = !this.f4496r;
        return AbstractC0155a.t(c0292c, eVar, O(z3), N(z3), this, this.f4496r);
    }

    public final View N(boolean z3) {
        int g3 = this.f4488j.g();
        int d3 = this.f4488j.d();
        View view = null;
        for (int p3 = p() - 1; p3 >= 0; p3--) {
            View o3 = o(p3);
            int c3 = this.f4488j.c(o3);
            int b3 = this.f4488j.b(o3);
            if (b3 > g3 && c3 < d3) {
                if (b3 > d3 && z3) {
                    if (view == null) {
                        view = o3;
                    }
                } else {
                    return o3;
                }
            }
        }
        return view;
    }

    public final View O(boolean z3) {
        int g3 = this.f4488j.g();
        int d3 = this.f4488j.d();
        int p3 = p();
        View view = null;
        for (int i3 = 0; i3 < p3; i3++) {
            View o3 = o(i3);
            int c3 = this.f4488j.c(o3);
            if (this.f4488j.b(o3) > g3 && c3 < d3) {
                if (c3 < g3 && z3) {
                    if (view == null) {
                        view = o3;
                    }
                } else {
                    return o3;
                }
            }
        }
        return view;
    }

    public final void P() {
        if (p() == 0) {
            return;
        }
        t.v(o(0));
        throw null;
    }

    public final void Q() {
        int p3 = p();
        if (p3 == 0) {
            return;
        }
        t.v(o(p3 - 1));
        throw null;
    }

    @Override // i1.t
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f4495q == null && (recyclerView = this.f6053b) != null) {
            recyclerView.b(str);
        }
    }

    @Override // i1.t
    public final boolean b() {
        if (this.f4490l == 0) {
            return true;
        }
        return false;
    }

    @Override // i1.t
    public final boolean c() {
        if (this.f4490l == 1) {
            return true;
        }
        return false;
    }

    @Override // i1.t
    public final boolean d(u uVar) {
        return uVar instanceof C0297H;
    }

    @Override // i1.t
    public final int f(C0292C c0292c) {
        return K(c0292c);
    }

    @Override // i1.t
    public final void g(C0292C c0292c) {
        L(c0292c);
    }

    @Override // i1.t
    public final int h(C0292C c0292c) {
        return M(c0292c);
    }

    @Override // i1.t
    public final int i(C0292C c0292c) {
        return K(c0292c);
    }

    @Override // i1.t
    public final void j(C0292C c0292c) {
        L(c0292c);
    }

    @Override // i1.t
    public final int k(C0292C c0292c) {
        return M(c0292c);
    }

    @Override // i1.t
    public final u l() {
        if (this.f4490l == 0) {
            return new u(-2, -1);
        }
        return new u(-1, -2);
    }

    @Override // i1.t
    public final u m(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    @Override // i1.t
    public final u n(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new u((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new u(layoutParams);
    }

    @Override // i1.t
    public final int q(z zVar, C0292C c0292c) {
        if (this.f4490l == 1) {
            return this.f4486h;
        }
        super.q(zVar, c0292c);
        return 1;
    }

    @Override // i1.t
    public final int x(z zVar, C0292C c0292c) {
        if (this.f4490l == 0) {
            return this.f4486h;
        }
        super.x(zVar, c0292c);
        return 1;
    }

    @Override // i1.t
    public final boolean y() {
        if (this.f4494p != 0) {
            return true;
        }
        return false;
    }

    @Override // i1.t
    public final void z(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f6053b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f4497s);
        }
        for (int i3 = 0; i3 < this.f4486h; i3++) {
            C0232F c0232f = this.f4487i[i3];
            ((ArrayList) c0232f.f4820d).clear();
            c0232f.f4817a = Integer.MIN_VALUE;
            c0232f.f4818b = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}
