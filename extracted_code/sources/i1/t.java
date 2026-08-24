package i1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import e0.C0262c;
import g2.C0276a;
import h1.AbstractC0285a;
import java.lang.reflect.Field;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public B1.e f6052a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f6053b;

    /* renamed from: c  reason: collision with root package name */
    public final C0276a f6054c;

    /* renamed from: d  reason: collision with root package name */
    public final C0276a f6055d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6056e;

    /* renamed from: f  reason: collision with root package name */
    public int f6057f;

    /* renamed from: g  reason: collision with root package name */
    public int f6058g;

    public t() {
        C0320s c0320s = new C0320s(this, 0);
        C0320s c0320s2 = new C0320s(this, 1);
        this.f6054c = new C0276a(c0320s);
        this.f6055d = new C0276a(c0320s2);
        this.f6056e = false;
    }

    public static int e(int i3, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i4, i5);
            }
            return size;
        }
        return Math.min(size, Math.max(i4, i5));
    }

    public static void v(View view) {
        ((u) view.getLayoutParams()).getClass();
        throw null;
    }

    public static C0312k w(Context context, AttributeSet attributeSet, int i3, int i4) {
        C0312k c0312k = new C0312k(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0285a.f5940a, i3, i4);
        c0312k.f6038b = obtainStyledAttributes.getInt(0, 1);
        c0312k.f6039c = obtainStyledAttributes.getInt(9, 1);
        c0312k.f6040d = obtainStyledAttributes.getBoolean(8, false);
        c0312k.f6041e = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        return c0312k;
    }

    public void A(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f6053b;
        z zVar = recyclerView.f4466m;
        C0292C c0292c = recyclerView.f4463j0;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z3 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f6053b.canScrollVertically(-1) && !this.f6053b.canScrollHorizontally(-1) && !this.f6053b.canScrollHorizontally(1)) {
                z3 = false;
            }
            accessibilityEvent.setScrollable(z3);
            this.f6053b.getClass();
        }
    }

    public abstract void B(Parcelable parcelable);

    public abstract Parcelable C();

    public final void E() {
        int p3 = p() - 1;
        if (p3 < 0) {
            return;
        }
        RecyclerView.j(o(p3));
        throw null;
    }

    public final void F(z zVar) {
        int size = ((ArrayList) zVar.f6065c).size();
        int i3 = size - 1;
        ArrayList arrayList = (ArrayList) zVar.f6065c;
        if (i3 < 0) {
            arrayList.clear();
            if (size > 0) {
                this.f6053b.invalidate();
                return;
            }
            return;
        }
        arrayList.get(i3).getClass();
        throw new ClassCastException();
    }

    public final boolean G(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z4) {
        int s3 = s();
        int u3 = u();
        int t3 = this.f6057f - t();
        int r3 = this.f6058g - r();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i3 = left - s3;
        int min = Math.min(0, i3);
        int i4 = top - u3;
        int min2 = Math.min(0, i4);
        int i5 = width - t3;
        int max = Math.max(0, i5);
        int max2 = Math.max(0, height - r3);
        RecyclerView recyclerView2 = this.f6053b;
        Field field = C.y.f117a;
        if (recyclerView2.getLayoutDirection() == 1) {
            if (max == 0) {
                max = Math.max(min, i5);
            }
        } else {
            if (min == 0) {
                min = Math.min(i3, max);
            }
            max = min;
        }
        if (min2 == 0) {
            min2 = Math.min(i4, max2);
        }
        int[] iArr = {max, min2};
        int i6 = iArr[0];
        int i7 = iArr[1];
        if (z4) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int s4 = s();
                int u4 = u();
                int t4 = this.f6057f - t();
                int r4 = this.f6058g - r();
                Rect rect2 = this.f6053b.f4478s;
                int[] iArr2 = RecyclerView.f4427t0;
                u uVar = (u) focusedChild.getLayoutParams();
                Rect rect3 = uVar.f6059a;
                rect2.set((focusedChild.getLeft() - rect3.left) - ((ViewGroup.MarginLayoutParams) uVar).leftMargin, (focusedChild.getTop() - rect3.top) - ((ViewGroup.MarginLayoutParams) uVar).topMargin, focusedChild.getRight() + rect3.right + ((ViewGroup.MarginLayoutParams) uVar).rightMargin, focusedChild.getBottom() + rect3.bottom + ((ViewGroup.MarginLayoutParams) uVar).bottomMargin);
                if (rect2.left - i6 >= t4 || rect2.right - i6 <= s4 || rect2.top - i7 >= r4 || rect2.bottom - i7 <= u4) {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (i6 == 0 && i7 == 0) {
            return false;
        }
        if (z3) {
            recyclerView.scrollBy(i6, i7);
            return true;
        }
        recyclerView.r(i6, i7);
        return true;
    }

    public final void H() {
        RecyclerView recyclerView = this.f6053b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void I(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f6053b = null;
            this.f6052a = null;
            this.f6057f = 0;
            this.f6058g = 0;
            return;
        }
        this.f6053b = recyclerView;
        this.f6052a = recyclerView.f4472p;
        this.f6057f = recyclerView.getWidth();
        this.f6058g = recyclerView.getHeight();
    }

    public abstract void a(String str);

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(u uVar) {
        if (uVar != null) {
            return true;
        }
        return false;
    }

    public abstract int f(C0292C c0292c);

    public abstract void g(C0292C c0292c);

    public abstract int h(C0292C c0292c);

    public abstract int i(C0292C c0292c);

    public abstract void j(C0292C c0292c);

    public abstract int k(C0292C c0292c);

    public abstract u l();

    public u m(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    public u n(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof u) {
            return new u((u) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new u((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new u(layoutParams);
    }

    public final View o(int i3) {
        B1.e eVar = this.f6052a;
        if (eVar != null) {
            int i4 = -1;
            if (i3 >= 0) {
                int childCount = ((RecyclerView) ((C0262c) eVar.f56n).f5225n).getChildCount();
                int i5 = i3;
                while (true) {
                    if (i5 >= childCount) {
                        break;
                    }
                    E0.c cVar = (E0.c) eVar.f57o;
                    int E3 = i3 - (i5 - cVar.E(i5));
                    if (E3 == 0) {
                        i4 = i5;
                        while (cVar.F(i4)) {
                            i4++;
                        }
                    } else {
                        i5 += E3;
                    }
                }
            }
            return ((RecyclerView) ((C0262c) eVar.f56n).f5225n).getChildAt(i4);
        }
        return null;
    }

    public final int p() {
        B1.e eVar = this.f6052a;
        if (eVar != null) {
            return ((RecyclerView) ((C0262c) eVar.f56n).f5225n).getChildCount() - ((ArrayList) eVar.f58p).size();
        }
        return 0;
    }

    public int q(z zVar, C0292C c0292c) {
        RecyclerView recyclerView = this.f6053b;
        if (recyclerView != null) {
            recyclerView.getClass();
            return 1;
        }
        return 1;
    }

    public final int r() {
        RecyclerView recyclerView = this.f6053b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int s() {
        RecyclerView recyclerView = this.f6053b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int t() {
        RecyclerView recyclerView = this.f6053b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.f6053b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int x(z zVar, C0292C c0292c) {
        RecyclerView recyclerView = this.f6053b;
        if (recyclerView != null) {
            recyclerView.getClass();
            return 1;
        }
        return 1;
    }

    public abstract boolean y();

    public abstract void z(RecyclerView recyclerView);

    public void D(int i3) {
    }
}
