package androidx.core.widget;

import C.AbstractC0016q;
import C.C0001b;
import C.C0003d;
import C.C0006g;
import C.C0009j;
import C.InterfaceC0008i;
import C.y;
import C1.j;
import H.e;
import H.h;
import H.i;
import H.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.example.flutter_application_1.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0008i {

    /* renamed from: N  reason: collision with root package name */
    public static final float f4136N = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: O  reason: collision with root package name */
    public static final h f4137O = new C0001b();

    /* renamed from: P  reason: collision with root package name */
    public static final int[] f4138P = {16843130};

    /* renamed from: A  reason: collision with root package name */
    public final int f4139A;

    /* renamed from: B  reason: collision with root package name */
    public final int f4140B;

    /* renamed from: C  reason: collision with root package name */
    public final int f4141C;

    /* renamed from: D  reason: collision with root package name */
    public int f4142D;

    /* renamed from: E  reason: collision with root package name */
    public final int[] f4143E;

    /* renamed from: F  reason: collision with root package name */
    public final int[] f4144F;

    /* renamed from: G  reason: collision with root package name */
    public int f4145G;

    /* renamed from: H  reason: collision with root package name */
    public int f4146H;

    /* renamed from: I  reason: collision with root package name */
    public k f4147I;

    /* renamed from: J  reason: collision with root package name */
    public final C0009j f4148J;

    /* renamed from: K  reason: collision with root package name */
    public final C0006g f4149K;
    public float L;

    /* renamed from: M  reason: collision with root package name */
    public final C0003d f4150M;

    /* renamed from: m  reason: collision with root package name */
    public final float f4151m;

    /* renamed from: n  reason: collision with root package name */
    public long f4152n;

    /* renamed from: o  reason: collision with root package name */
    public final Rect f4153o;

    /* renamed from: p  reason: collision with root package name */
    public final OverScroller f4154p;

    /* renamed from: q  reason: collision with root package name */
    public final EdgeEffect f4155q;

    /* renamed from: r  reason: collision with root package name */
    public final EdgeEffect f4156r;

    /* renamed from: s  reason: collision with root package name */
    public int f4157s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4158t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4159u;

    /* renamed from: v  reason: collision with root package name */
    public View f4160v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f4161w;
    public VelocityTracker x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f4162y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f4163z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.f4153o = new Rect();
        this.f4158t = true;
        this.f4159u = false;
        this.f4160v = null;
        this.f4161w = false;
        this.f4163z = true;
        this.f4142D = -1;
        this.f4143E = new int[2];
        this.f4144F = new int[2];
        this.f4150M = new C0003d(getContext(), new j(this, 4));
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            edgeEffect = e.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f4155q = edgeEffect;
        if (i3 >= 31) {
            edgeEffect2 = e.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f4156r = edgeEffect2;
        this.f4151m = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f4154p = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f4139A = viewConfiguration.getScaledTouchSlop();
        this.f4140B = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4141C = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4138P, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f4148J = new C0009j(0);
        this.f4149K = new C0006g(this);
        setNestedScrollingEnabled(true);
        y.a(this, f4137O);
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && k((View) parent, nestedScrollView)) {
            return true;
        }
        return false;
    }

    @Override // C.InterfaceC0007h
    public final void a(View view, View view2, int i3, int i4) {
        C0009j c0009j = this.f4148J;
        if (i4 == 1) {
            c0009j.f108c = i3;
        } else {
            c0009j.f107b = i3;
        }
        u(2, i4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // C.InterfaceC0007h
    public final void b(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7) {
        m(i6, i7, null);
    }

    @Override // C.InterfaceC0007h
    public final void c(View view, int i3) {
        C0009j c0009j = this.f4148J;
        if (i3 == 1) {
            c0009j.f108c = 0;
        } else {
            c0009j.f107b = 0;
        }
        w(i3);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    @Override // C.InterfaceC0008i
    public final void d(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        m(i6, i7, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            boolean r0 = super.dispatchKeyEvent(r7)
            r1 = 1
            if (r0 != 0) goto Lcf
            android.graphics.Rect r0 = r6.f4153o
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r2 = 0
            r3 = 130(0x82, float:1.82E-43)
            if (r0 <= 0) goto La2
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            int r0 = r0.getHeight()
            int r5 = r4.topMargin
            int r0 = r0 + r5
            int r4 = r4.bottomMargin
            int r0 = r0 + r4
            int r4 = r6.getHeight()
            int r5 = r6.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r6.getPaddingBottom()
            int r4 = r4 - r5
            if (r0 <= r4) goto La2
            int r0 = r7.getAction()
            if (r0 != 0) goto Lca
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto L92
            r4 = 20
            if (r0 == r4) goto L82
            r4 = 62
            if (r0 == r4) goto L76
            r7 = 92
            if (r0 == r7) goto L71
            r7 = 93
            if (r0 == r7) goto L6c
            r7 = 122(0x7a, float:1.71E-43)
            if (r0 == r7) goto L68
            r7 = 123(0x7b, float:1.72E-43)
            if (r0 == r7) goto L63
            goto Lca
        L63:
            r6.p(r3)
            goto Lca
        L68:
            r6.p(r5)
            goto Lca
        L6c:
            boolean r7 = r6.j(r3)
            goto Lcb
        L71:
            boolean r7 = r6.j(r5)
            goto Lcb
        L76:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L7e
            r3 = 33
        L7e:
            r6.p(r3)
            goto Lca
        L82:
            boolean r7 = r7.isAltPressed()
            if (r7 == 0) goto L8d
            boolean r7 = r6.j(r3)
            goto Lcb
        L8d:
            boolean r7 = r6.g(r3)
            goto Lcb
        L92:
            boolean r7 = r7.isAltPressed()
            if (r7 == 0) goto L9d
            boolean r7 = r6.j(r5)
            goto Lcb
        L9d:
            boolean r7 = r6.g(r5)
            goto Lcb
        La2:
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto Lca
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto Lca
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto Lb6
            r7 = 0
        Lb6:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto Lca
            if (r7 == r6) goto Lca
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto Lca
            r7 = 1
            goto Lcb
        Lca:
            r7 = 0
        Lcb:
            if (r7 == 0) goto Lce
            goto Lcf
        Lce:
            r1 = 0
        Lcf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f4, boolean z3) {
        return this.f4149K.a(f3, f4, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f4) {
        return this.f4149K.b(f3, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return this.f4149K.c(i3, i4, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return this.f4149K.d(i3, i4, i5, i6, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f4155q;
        int i4 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (i.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i3 = getPaddingLeft();
            } else {
                i3 = 0;
            }
            if (i.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i3, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f4156r;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (i.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i4 = getPaddingLeft();
            }
            if (i.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i4 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // C.InterfaceC0007h
    public final void e(int i3, int i4, int i5, int[] iArr) {
        this.f4149K.c(i3, i4, i5, iArr, null);
    }

    @Override // C.InterfaceC0007h
    public final boolean f(View view, View view2, int i3, int i4) {
        return (i3 & 2) != 0;
    }

    public final boolean g(int i3) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i3);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && l(findNextFocus, maxScrollAmount, getHeight())) {
            Rect rect = this.f4153o;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            r(h(rect), 0, 1, true);
            findNextFocus.requestFocus(i3);
        } else {
            if (i3 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i3 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i3 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, 0, 1, true);
        }
        if (findFocus != null && findFocus.isFocused() && !l(findFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0009j c0009j = this.f4148J;
        return c0009j.f108c | c0009j.f107b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.L == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.L = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.L;
    }

    public final int h(Rect rect) {
        int i3;
        int i4;
        int i5;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i3 = i6 - verticalFadingEdgeLength;
        } else {
            i3 = i6;
        }
        int i7 = rect.bottom;
        if (i7 > i3 && rect.top > scrollY) {
            if (rect.height() > height) {
                i5 = rect.top - scrollY;
            } else {
                i5 = rect.bottom - i3;
            }
            return Math.min(i5, (childAt.getBottom() + layoutParams.bottomMargin) - i6);
        } else if (rect.top >= scrollY || i7 >= i3) {
            return 0;
        } else {
            if (rect.height() > height) {
                i4 = 0 - (i3 - rect.bottom);
            } else {
                i4 = 0 - (scrollY - rect.top);
            }
            return Math.max(i4, -getScrollY());
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f4149K.f(0);
    }

    public final void i(int i3) {
        if (getChildCount() > 0) {
            this.f4154p.fling(getScrollX(), getScrollY(), 0, i3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.f4146H = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f4149K.f104d;
    }

    public final boolean j(int i3) {
        boolean z3;
        int childCount;
        if (i3 == 130) {
            z3 = true;
        } else {
            z3 = false;
        }
        int height = getHeight();
        Rect rect = this.f4153o;
        rect.top = 0;
        rect.bottom = height;
        if (z3 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i3, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i3, int i4) {
        Rect rect = this.f4153o;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i3 >= getScrollY() && rect.top - i3 <= getScrollY() + i4) {
            return true;
        }
        return false;
    }

    public final void m(int i3, int i4, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i3);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f4149K.d(0, scrollY2, 0, i3 - scrollY2, null, i4, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int i3;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4142D) {
            if (actionIndex == 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            this.f4157s = (int) motionEvent.getY(i3);
            this.f4142D = motionEvent.getPointerId(i3);
            VelocityTracker velocityTracker = this.x;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i3, int i4, int i5, int i6) {
        boolean z3;
        boolean z4;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i5 + i3;
        if (i4 > 0 || i4 < 0) {
            i4 = 0;
            z3 = true;
        } else {
            z3 = false;
        }
        if (i7 > i6) {
            z4 = true;
        } else if (i7 < 0) {
            z4 = true;
            i6 = 0;
        } else {
            i6 = i7;
            z4 = false;
        }
        if (z4 && !this.f4149K.f(1)) {
            this.f4154p.springBack(i4, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i4, i6);
        if (z3 || z4) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4159u = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r27) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action == 2 && this.f4161w) {
            return true;
        }
        int i3 = action & 255;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 6) {
                            n(motionEvent);
                        }
                    }
                } else {
                    int i4 = this.f4142D;
                    if (i4 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i4);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i4 + " in onInterceptTouchEvent");
                        } else {
                            int y3 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y3 - this.f4157s) > this.f4139A && (2 & getNestedScrollAxes()) == 0) {
                                this.f4161w = true;
                                this.f4157s = y3;
                                if (this.x == null) {
                                    this.x = VelocityTracker.obtain();
                                }
                                this.x.addMovement(motionEvent);
                                this.f4145G = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.f4161w = false;
            this.f4142D = -1;
            VelocityTracker velocityTracker = this.x;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.x = null;
            }
            if (this.f4154p.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y4 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y4 >= childAt.getTop() - scrollY && y4 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.f4157s = y4;
                    this.f4142D = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.x;
                    if (velocityTracker2 == null) {
                        this.x = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.x.addMovement(motionEvent);
                    this.f4154p.computeScrollOffset();
                    if (!v(motionEvent) && this.f4154p.isFinished()) {
                        z3 = false;
                    }
                    this.f4161w = z3;
                    u(2, 0);
                }
            }
            if (!v(motionEvent) && this.f4154p.isFinished()) {
                z3 = false;
            }
            this.f4161w = z3;
            VelocityTracker velocityTracker3 = this.x;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.x = null;
            }
        }
        return this.f4161w;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7;
        super.onLayout(z3, i3, i4, i5, i6);
        int i8 = 0;
        this.f4158t = false;
        View view = this.f4160v;
        if (view != null && k(view, this)) {
            View view2 = this.f4160v;
            Rect rect = this.f4153o;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h3 = h(rect);
            if (h3 != 0) {
                scrollBy(0, h3);
            }
        }
        this.f4160v = null;
        if (!this.f4159u) {
            if (this.f4147I != null) {
                scrollTo(getScrollX(), this.f4147I.f422m);
                this.f4147I = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i7 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i7 = 0;
            }
            int paddingTop = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i7 && scrollY >= 0) {
                i8 = paddingTop + scrollY > i7 ? i7 - paddingTop : scrollY;
            }
            if (i8 != scrollY) {
                scrollTo(getScrollX(), i8);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f4159u = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (this.f4162y && View.MeasureSpec.getMode(i4) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f4, boolean z3) {
        if (!z3) {
            dispatchNestedFling(0.0f, f4, true);
            i((int) f4);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f4) {
        return this.f4149K.b(f3, f4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
        this.f4149K.c(i3, i4, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        m(i6, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        a(view, view2, i3, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i3, int i4, boolean z3, boolean z4) {
        super.scrollTo(i3, i4);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        View findNextFocusFromRect;
        if (i3 == 2) {
            i3 = 130;
        } else if (i3 == 1) {
            i3 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i3);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i3);
        }
        if (findNextFocusFromRect == null || !l(findNextFocusFromRect, 0, getHeight())) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i3, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        this.f4147I = kVar;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, H.k] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f422m = getScrollY();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i3, int i4, int i5, int i6) {
        super.onScrollChanged(i3, i4, i5, i6);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && l(findFocus, 0, i6)) {
            Rect rect = this.f4153o;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int h3 = h(rect);
            if (h3 != 0) {
                if (this.f4163z) {
                    t(0, h3, false);
                } else {
                    scrollBy(0, h3);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        return f(view, view2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.x == null) {
            this.x = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4145G = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f3 = 0.0f;
        obtain.offsetLocation(0.0f, this.f4145G);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f4156r;
            EdgeEffect edgeEffect2 = this.f4155q;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                n(motionEvent);
                                this.f4157s = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f4142D));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.f4157s = (int) motionEvent.getY(actionIndex);
                            this.f4142D = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        if (this.f4161w && getChildCount() > 0 && this.f4154p.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            postInvalidateOnAnimation();
                        }
                        this.f4142D = -1;
                        this.f4161w = false;
                        VelocityTracker velocityTracker = this.x;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.x = null;
                        }
                        w(0);
                        this.f4155q.onRelease();
                        this.f4156r.onRelease();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f4142D);
                    if (findPointerIndex == -1) {
                        Log.e("NestedScrollView", "Invalid pointerId=" + this.f4142D + " in onTouchEvent");
                    } else {
                        int y3 = (int) motionEvent.getY(findPointerIndex);
                        int i3 = this.f4157s - y3;
                        float x = motionEvent.getX(findPointerIndex) / getWidth();
                        float height = i3 / getHeight();
                        if (a.w(edgeEffect2) != 0.0f) {
                            float f4 = -a.G(edgeEffect2, -height, x);
                            if (a.w(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                            f3 = f4;
                        } else if (a.w(edgeEffect) != 0.0f) {
                            float G3 = a.G(edgeEffect, height, 1.0f - x);
                            if (a.w(edgeEffect) == 0.0f) {
                                edgeEffect.onRelease();
                            }
                            f3 = G3;
                        }
                        int round = Math.round(f3 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        int i4 = i3 - round;
                        if (!this.f4161w && Math.abs(i4) > this.f4139A) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f4161w = true;
                            i4 = i4 > 0 ? i4 - this.f4139A : i4 + this.f4139A;
                        }
                        if (this.f4161w) {
                            int r3 = r(i4, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.f4157s = y3 - r3;
                            this.f4145G += r3;
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker2 = this.x;
                velocityTracker2.computeCurrentVelocity(1000, this.f4141C);
                int yVelocity = (int) velocityTracker2.getYVelocity(this.f4142D);
                if (Math.abs(yVelocity) >= this.f4140B) {
                    if (a.w(edgeEffect2) != 0.0f) {
                        if (s(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            i(-yVelocity);
                        }
                    } else if (a.w(edgeEffect) != 0.0f) {
                        int i5 = -yVelocity;
                        if (s(edgeEffect, i5)) {
                            edgeEffect.onAbsorb(i5);
                        } else {
                            i(i5);
                        }
                    } else {
                        int i6 = -yVelocity;
                        float f5 = i6;
                        if (!this.f4149K.b(0.0f, f5)) {
                            dispatchNestedFling(0.0f, f5, true);
                            i(i6);
                        }
                    }
                } else if (this.f4154p.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f4142D = -1;
                this.f4161w = false;
                VelocityTracker velocityTracker3 = this.x;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.x = null;
                }
                w(0);
                this.f4155q.onRelease();
                this.f4156r.onRelease();
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.f4161w && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f4154p.isFinished()) {
                this.f4154p.abortAnimation();
                w(1);
            }
            int pointerId = motionEvent.getPointerId(0);
            this.f4157s = (int) motionEvent.getY();
            this.f4142D = pointerId;
            u(2, 0);
        }
        VelocityTracker velocityTracker4 = this.x;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int i3) {
        boolean z3;
        if (i3 == 130) {
            z3 = true;
        } else {
            z3 = false;
        }
        int height = getHeight();
        Rect rect = this.f4153o;
        if (z3) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i4 = rect.top;
        int i5 = height + i4;
        rect.bottom = i5;
        q(i3, i4, i5);
    }

    public final boolean q(int i3, int i4, int i5) {
        boolean z3;
        int i6;
        boolean z4;
        boolean z5;
        boolean z6;
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        if (i3 == 33) {
            z3 = true;
        } else {
            z3 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z7 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = focusables.get(i8);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i4 < bottom && top < i5) {
                if (i4 < top && bottom < i5) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (view == null) {
                    view = view2;
                    z7 = z5;
                } else {
                    if ((z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom())) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z7) {
                        if (z5) {
                            if (!z6) {
                            }
                            view = view2;
                        }
                    } else if (z5) {
                        view = view2;
                        z7 = true;
                    } else {
                        if (!z6) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i4 >= scrollY && i5 <= i7) {
            z4 = false;
        } else {
            if (z3) {
                i6 = i4 - scrollY;
            } else {
                i6 = i5 - i7;
            }
            r(i6, 0, 1, true);
            z4 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i3);
        }
        return z4;
    }

    public final int r(int i3, int i4, int i5, boolean z3) {
        int i6;
        int i7;
        boolean z4;
        boolean z5;
        boolean z6;
        VelocityTracker velocityTracker;
        if (i5 == 1) {
            u(2, i5);
        }
        boolean c3 = this.f4149K.c(0, i3, i5, this.f4144F, this.f4143E);
        int[] iArr = this.f4144F;
        int[] iArr2 = this.f4143E;
        if (c3) {
            i6 = i3 - iArr[1];
            i7 = iArr2[1];
        } else {
            i6 = i3;
            i7 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        if ((overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (o(i6, 0, scrollY, scrollRange) && !this.f4149K.f(i5)) {
            z5 = true;
        } else {
            z5 = false;
        }
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f4149K.d(0, scrollY2, 0, i6 - scrollY2, this.f4143E, i5, iArr);
        int i8 = i7 + iArr2[1];
        int i9 = i6 - iArr[1];
        int i10 = scrollY + i9;
        EdgeEffect edgeEffect = this.f4156r;
        EdgeEffect edgeEffect2 = this.f4155q;
        if (i10 < 0) {
            if (z4) {
                a.G(edgeEffect2, (-i9) / getHeight(), i4 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i10 > scrollRange && z4) {
            a.G(edgeEffect, i9 / getHeight(), 1.0f - (i4 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z6 = z5;
        } else {
            postInvalidateOnAnimation();
            z6 = false;
        }
        if (z6 && i5 == 0 && (velocityTracker = this.x) != null) {
            velocityTracker.clear();
        }
        if (i5 == 1) {
            w(i5);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f4158t) {
            Rect rect = this.f4153o;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h3 = h(rect);
            if (h3 != 0) {
                scrollBy(0, h3);
            }
        } else {
            this.f4160v = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        boolean z4;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h3 = h(rect);
        if (h3 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (z3) {
                scrollBy(0, h3);
            } else {
                t(0, h3, false);
            }
        }
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        VelocityTracker velocityTracker;
        if (z3 && (velocityTracker = this.x) != null) {
            velocityTracker.recycle();
            this.x = null;
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f4158t = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i3) {
        if (i3 > 0) {
            return true;
        }
        float w3 = a.w(edgeEffect) * getHeight();
        float f3 = this.f4151m * 0.015f;
        double log = Math.log((Math.abs(-i3) * 0.35f) / f3);
        double d3 = f4136N;
        if (((float) (Math.exp((d3 / (d3 - 1.0d)) * log) * f3)) < w3) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void scrollTo(int i3, int i4) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width < width2 && i3 >= 0) {
                if (width + i3 > width2) {
                    i3 = width2 - width;
                }
            } else {
                i3 = 0;
            }
            if (height < height2 && i4 >= 0) {
                if (height + i4 > height2) {
                    i4 = height2 - height;
                }
            } else {
                i4 = 0;
            }
            if (i3 != getScrollX() || i4 != getScrollY()) {
                super.scrollTo(i3, i4);
            }
        }
    }

    public void setFillViewport(boolean z3) {
        if (z3 != this.f4162y) {
            this.f4162y = z3;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        C0006g c0006g = this.f4149K;
        if (c0006g.f104d) {
            Field field = y.f117a;
            AbstractC0016q.z(c0006g.f103c);
        }
        c0006g.f104d = z3;
    }

    public void setSmoothScrollingEnabled(boolean z3) {
        this.f4163z = z3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i3) {
        return this.f4149K.g(i3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(int i3, int i4, boolean z3) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f4152n > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f4154p;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i4 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
            if (z3) {
                u(2, 1);
            } else {
                w(1);
            }
            this.f4146H = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f4154p.isFinished()) {
                this.f4154p.abortAnimation();
                w(1);
            }
            scrollBy(i3, i4);
        }
        this.f4152n = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void u(int i3, int i4) {
        this.f4149K.g(2, i4);
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z3;
        EdgeEffect edgeEffect = this.f4155q;
        if (a.w(edgeEffect) != 0.0f) {
            a.G(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z3 = true;
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.f4156r;
        if (a.w(edgeEffect2) != 0.0f) {
            a.G(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z3;
    }

    public final void w(int i3) {
        this.f4149K.h(i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3) {
        if (getChildCount() <= 0) {
            super.addView(view, i3);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(H.j jVar) {
    }
}
