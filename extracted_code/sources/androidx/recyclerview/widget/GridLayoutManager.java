package androidx.recyclerview.widget;

import D2.h;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import e0.C0262c;
import i1.C0292C;
import i1.C0311j;
import i1.t;
import i1.u;
import i1.z;
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: p  reason: collision with root package name */
    public final int f4417p;

    /* renamed from: q  reason: collision with root package name */
    public final C0262c f4418q;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f4417p = -1;
        new SparseIntArray();
        new SparseIntArray();
        C0262c c0262c = new C0262c(24);
        this.f4418q = c0262c;
        new Rect();
        int i5 = t.w(context, attributeSet, i3, i4).f6039c;
        if (i5 != this.f4417p) {
            if (i5 >= 1) {
                this.f4417p = i5;
                ((SparseIntArray) c0262c.f5225n).clear();
                H();
                return;
            }
            throw new IllegalArgumentException(h.k("Span count should be at least 1. Provided ", i5));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q(boolean z3) {
        if (!z3) {
            super.Q(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final int R(z zVar, C0292C c0292c, int i3) {
        int Y2;
        boolean z3 = c0292c.f5957c;
        C0262c c0262c = this.f4418q;
        if (!z3) {
            int i4 = this.f4417p;
            c0262c.getClass();
            return C0262c.n(i3, i4);
        }
        RecyclerView recyclerView = (RecyclerView) zVar.f6068f;
        if (i3 >= 0 && i3 < recyclerView.f4463j0.a()) {
            if (!recyclerView.f4463j0.f5957c) {
                Y2 = i3;
            } else {
                Y2 = recyclerView.f4470o.Y(i3, 0);
            }
            if (Y2 == -1) {
                Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i3);
                return 0;
            }
            int i5 = this.f4417p;
            c0262c.getClass();
            return C0262c.n(Y2, i5);
        }
        throw new IndexOutOfBoundsException("invalid position " + i3 + ". State item count is " + recyclerView.f4463j0.a() + recyclerView.h());
    }

    @Override // i1.t
    public final boolean d(u uVar) {
        return uVar instanceof C0311j;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, i1.t
    public final u l() {
        if (this.f4419h == 0) {
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
        if (this.f4419h == 1) {
            return this.f4417p;
        }
        if (c0292c.a() < 1) {
            return 0;
        }
        return R(zVar, c0292c, c0292c.a() - 1) + 1;
    }

    @Override // i1.t
    public final int x(z zVar, C0292C c0292c) {
        if (this.f4419h == 0) {
            return this.f4417p;
        }
        if (c0292c.a() < 1) {
            return 0;
        }
        return R(zVar, c0292c, c0292c.a() - 1) + 1;
    }
}
