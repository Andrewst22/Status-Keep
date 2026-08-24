package androidx.appcompat.widget;

import C.AbstractC0014o;
import C.C0009j;
import C.InterfaceC0007h;
import C.InterfaceC0008i;
import C.y;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.example.flutter_application_1.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import l.C0564b;
import l.C0567e;
import l.InterfaceC0566d;
import l.InterfaceC0585x;
import l.RunnableC0565c;
import l.s0;
import l.y0;
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0007h, InterfaceC0008i {

    /* renamed from: K  reason: collision with root package name */
    public static final int[] f3950K = {R.attr.actionBarSize, 16842841};

    /* renamed from: A  reason: collision with root package name */
    public final Rect f3951A;

    /* renamed from: B  reason: collision with root package name */
    public final Rect f3952B;

    /* renamed from: C  reason: collision with root package name */
    public final Rect f3953C;

    /* renamed from: D  reason: collision with root package name */
    public final Rect f3954D;

    /* renamed from: E  reason: collision with root package name */
    public OverScroller f3955E;

    /* renamed from: F  reason: collision with root package name */
    public ViewPropertyAnimator f3956F;

    /* renamed from: G  reason: collision with root package name */
    public final C0564b f3957G;

    /* renamed from: H  reason: collision with root package name */
    public final RunnableC0565c f3958H;

    /* renamed from: I  reason: collision with root package name */
    public final RunnableC0565c f3959I;

    /* renamed from: J  reason: collision with root package name */
    public final C0009j f3960J;

    /* renamed from: m  reason: collision with root package name */
    public int f3961m;

    /* renamed from: n  reason: collision with root package name */
    public ContentFrameLayout f3962n;

    /* renamed from: o  reason: collision with root package name */
    public ActionBarContainer f3963o;

    /* renamed from: p  reason: collision with root package name */
    public InterfaceC0585x f3964p;

    /* renamed from: q  reason: collision with root package name */
    public Drawable f3965q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3966r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3967s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3968t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3969u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3970v;

    /* renamed from: w  reason: collision with root package name */
    public int f3971w;
    public final Rect x;

    /* renamed from: y  reason: collision with root package name */
    public final Rect f3972y;

    /* renamed from: z  reason: collision with root package name */
    public final Rect f3973z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.x = new Rect();
        this.f3972y = new Rect();
        this.f3973z = new Rect();
        this.f3951A = new Rect();
        this.f3952B = new Rect();
        this.f3953C = new Rect();
        this.f3954D = new Rect();
        this.f3957G = new C0564b(this);
        this.f3958H = new RunnableC0565c(this, 0);
        this.f3959I = new RunnableC0565c(this, 1);
        i(context);
        this.f3960J = new C0009j(0);
    }

    public static boolean g(View view, Rect rect, boolean z3) {
        boolean z4;
        C0567e c0567e = (C0567e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0567e).leftMargin;
        int i4 = rect.left;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0567e).leftMargin = i4;
            z4 = true;
        } else {
            z4 = false;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0567e).topMargin;
        int i6 = rect.top;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0567e).topMargin = i6;
            z4 = true;
        }
        int i7 = ((ViewGroup.MarginLayoutParams) c0567e).rightMargin;
        int i8 = rect.right;
        if (i7 != i8) {
            ((ViewGroup.MarginLayoutParams) c0567e).rightMargin = i8;
            z4 = true;
        }
        if (z3) {
            int i9 = ((ViewGroup.MarginLayoutParams) c0567e).bottomMargin;
            int i10 = rect.bottom;
            if (i9 != i10) {
                ((ViewGroup.MarginLayoutParams) c0567e).bottomMargin = i10;
                return true;
            }
        }
        return z4;
    }

    @Override // C.InterfaceC0007h
    public final void a(View view, View view2, int i3, int i4) {
        if (i4 == 0) {
            onNestedScrollAccepted(view, view2, i3);
        }
    }

    @Override // C.InterfaceC0007h
    public final void b(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            onNestedScroll(viewGroup, i3, i4, i5, i6);
        }
    }

    @Override // C.InterfaceC0007h
    public final void c(View view, int i3) {
        if (i3 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0567e;
    }

    @Override // C.InterfaceC0008i
    public final void d(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        b(viewGroup, i3, i4, i5, i6, i7);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        if (this.f3965q != null && !this.f3966r) {
            if (this.f3963o.getVisibility() == 0) {
                i3 = (int) (this.f3963o.getTranslationY() + this.f3963o.getBottom() + 0.5f);
            } else {
                i3 = 0;
            }
            this.f3965q.setBounds(0, i3, getWidth(), this.f3965q.getIntrinsicHeight() + i3);
            this.f3965q.draw(canvas);
        }
    }

    @Override // C.InterfaceC0007h
    public final boolean f(View view, View view2, int i3, int i4) {
        if (i4 == 0 && onStartNestedScroll(view, view2, i3)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        j();
        Field field = y.f117a;
        getWindowSystemUiVisibility();
        boolean g3 = g(this.f3963o, rect, false);
        Rect rect2 = this.f3951A;
        rect2.set(rect);
        Method method = y0.f7962a;
        Rect rect3 = this.x;
        if (method != null) {
            try {
                method.invoke(this, rect2, rect3);
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
        Rect rect4 = this.f3952B;
        if (!rect4.equals(rect2)) {
            rect4.set(rect2);
            g3 = true;
        }
        Rect rect5 = this.f3972y;
        if (!rect5.equals(rect3)) {
            rect5.set(rect3);
            g3 = true;
        }
        if (g3) {
            requestLayout();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f3963o;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0009j c0009j = this.f3960J;
        return c0009j.f108c | c0009j.f107b;
    }

    public CharSequence getTitle() {
        j();
        return ((s0) this.f3964p).f7908a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f3958H);
        removeCallbacks(this.f3959I);
        ViewPropertyAnimator viewPropertyAnimator = this.f3956F;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        boolean z3;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f3950K);
        boolean z4 = false;
        this.f3961m = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f3965q = drawable;
        if (drawable == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        setWillNotDraw(z3);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z4 = true;
        }
        this.f3966r = z4;
        this.f3955E = new OverScroller(context);
    }

    public final void j() {
        InterfaceC0585x wrapper;
        if (this.f3962n == null) {
            this.f3962n = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f3963o = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0585x) {
                wrapper = (InterfaceC0585x) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f3964p = wrapper;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = y.f117a;
        AbstractC0014o.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0567e c0567e = (C0567e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = ((ViewGroup.MarginLayoutParams) c0567e).leftMargin + paddingLeft;
                int i9 = ((ViewGroup.MarginLayoutParams) c0567e).topMargin + paddingTop;
                childAt.layout(i8, i9, measuredWidth + i8, measuredHeight + i9);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        boolean z3;
        j();
        measureChildWithMargins(this.f3963o, i3, 0, i4, 0);
        C0567e c0567e = (C0567e) this.f3963o.getLayoutParams();
        int i5 = 0;
        int max = Math.max(0, this.f3963o.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0567e).leftMargin + ((ViewGroup.MarginLayoutParams) c0567e).rightMargin);
        int max2 = Math.max(0, this.f3963o.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0567e).topMargin + ((ViewGroup.MarginLayoutParams) c0567e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f3963o.getMeasuredState());
        Field field = y.f117a;
        if ((getWindowSystemUiVisibility() & 256) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            i5 = this.f3961m;
            if (this.f3968t && this.f3963o.getTabContainer() != null) {
                i5 += this.f3961m;
            }
        } else if (this.f3963o.getVisibility() != 8) {
            i5 = this.f3963o.getMeasuredHeight();
        }
        Rect rect = this.x;
        Rect rect2 = this.f3973z;
        rect2.set(rect);
        Rect rect3 = this.f3953C;
        rect3.set(this.f3951A);
        if (!this.f3967s && !z3) {
            rect2.top += i5;
            rect2.bottom = rect2.bottom;
        } else {
            rect3.top += i5;
            rect3.bottom = rect3.bottom;
        }
        g(this.f3962n, rect2, true);
        Rect rect4 = this.f3954D;
        if (!rect4.equals(rect3)) {
            rect4.set(rect3);
            this.f3962n.a(rect3);
        }
        measureChildWithMargins(this.f3962n, i3, 0, i4, 0);
        C0567e c0567e2 = (C0567e) this.f3962n.getLayoutParams();
        int max3 = Math.max(max, this.f3962n.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0567e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0567e2).rightMargin);
        int max4 = Math.max(max2, this.f3962n.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0567e2).topMargin + ((ViewGroup.MarginLayoutParams) c0567e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f3962n.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i3, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i4, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f4, boolean z3) {
        if (this.f3969u && z3) {
            this.f3955E.fling(0, 0, 0, (int) f4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.f3955E.getFinalY() > this.f3963o.getHeight()) {
                h();
                this.f3959I.run();
            } else {
                h();
                this.f3958H.run();
            }
            this.f3970v = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f4) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        int i7 = this.f3971w + i4;
        this.f3971w = i7;
        setActionBarHideOffset(i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        this.f3960J.f107b = i3;
        this.f3971w = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        if ((i3 & 2) != 0 && this.f3963o.getVisibility() == 0) {
            return this.f3969u;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.f3969u && !this.f3970v) {
            if (this.f3971w <= this.f3963o.getHeight()) {
                h();
                postDelayed(this.f3958H, 600L);
                return;
            }
            h();
            postDelayed(this.f3959I, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i3) {
        super.onWindowSystemUiVisibilityChanged(i3);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i3) {
        super.onWindowVisibilityChanged(i3);
    }

    public void setActionBarHideOffset(int i3) {
        h();
        this.f3963o.setTranslationY(-Math.max(0, Math.min(i3, this.f3963o.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0566d interfaceC0566d) {
        if (getWindowToken() == null) {
            return;
        }
        throw null;
    }

    public void setHasNonEmbeddedTabs(boolean z3) {
        this.f3968t = z3;
    }

    public void setHideOnContentScrollEnabled(boolean z3) {
        if (z3 != this.f3969u) {
            this.f3969u = z3;
            if (!z3) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i3) {
        j();
        s0 s0Var = (s0) this.f3964p;
        s0Var.f7911d = i3 != 0 ? f.b.c(s0Var.f7908a.getContext(), i3) : null;
        s0Var.c();
    }

    public void setLogo(int i3) {
        Drawable drawable;
        j();
        s0 s0Var = (s0) this.f3964p;
        if (i3 != 0) {
            drawable = f.b.c(s0Var.f7908a.getContext(), i3);
        } else {
            drawable = null;
        }
        s0Var.f7912e = drawable;
        s0Var.c();
    }

    public void setOverlayMode(boolean z3) {
        boolean z4;
        this.f3967s = z3;
        if (z3 && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f3966r = z4;
    }

    public void setShowingForActionMode(boolean z3) {
    }

    public void setUiOptions(int i3) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((s0) this.f3964p).f7918k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        s0 s0Var = (s0) this.f3964p;
        if (!s0Var.f7914g) {
            s0Var.f7915h = charSequence;
            if ((s0Var.f7909b & 8) != 0) {
                s0Var.f7908a.setTitle(charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        s0 s0Var = (s0) this.f3964p;
        s0Var.f7911d = drawable;
        s0Var.c();
    }

    @Override // C.InterfaceC0007h
    public final void e(int i3, int i4, int i5, int[] iArr) {
    }
}
