package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import e0.l;
import k.InterfaceC0526h;
import k.MenuC0527i;
import k.MenuItemC0528j;
import k0.C0558m;
import l.C0568f;
import l.C0570h;
import l.C0571i;
import l.C0573k;
import l.D;
import l.E;
import l.InterfaceC0572j;
import l.InterfaceC0574l;
import l.y0;
/* loaded from: classes.dex */
public class ActionMenuView extends E implements InterfaceC0526h {

    /* renamed from: B  reason: collision with root package name */
    public MenuC0527i f3974B;

    /* renamed from: C  reason: collision with root package name */
    public Context f3975C;

    /* renamed from: D  reason: collision with root package name */
    public int f3976D;

    /* renamed from: E  reason: collision with root package name */
    public C0571i f3977E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f3978F;

    /* renamed from: G  reason: collision with root package name */
    public int f3979G;

    /* renamed from: H  reason: collision with root package name */
    public final int f3980H;

    /* renamed from: I  reason: collision with root package name */
    public final int f3981I;

    /* renamed from: J  reason: collision with root package name */
    public InterfaceC0574l f3982J;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f3980H = (int) (56.0f * f3);
        this.f3981I = (int) (f3 * 4.0f);
        this.f3975C = context;
        this.f3976D = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.D, l.k] */
    public static C0573k h() {
        ?? d3 = new D(-2);
        d3.f7859c = false;
        d3.f7716b = 16;
        return d3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.D, l.k] */
    public static C0573k i(ViewGroup.LayoutParams layoutParams) {
        C0573k c0573k;
        if (layoutParams != null) {
            if (layoutParams instanceof C0573k) {
                C0573k c0573k2 = (C0573k) layoutParams;
                ?? d3 = new D(c0573k2);
                d3.f7859c = c0573k2.f7859c;
                c0573k = d3;
            } else {
                c0573k = new D(layoutParams);
            }
            if (c0573k.f7716b <= 0) {
                c0573k.f7716b = 16;
            }
            return c0573k;
        }
        return h();
    }

    @Override // k.InterfaceC0526h
    public final boolean a(MenuItemC0528j menuItemC0528j) {
        return this.f3974B.p(menuItemC0528j, null, 0);
    }

    @Override // l.E, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0573k;
    }

    @Override // l.E
    public final /* bridge */ /* synthetic */ D d() {
        return h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.E
    public final D e(AttributeSet attributeSet) {
        return new D(getContext(), attributeSet);
    }

    @Override // l.E
    public final /* bridge */ /* synthetic */ D f(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // l.E, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // l.E, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.f3974B == null) {
            Context context = getContext();
            MenuC0527i menuC0527i = new MenuC0527i(context);
            this.f3974B = menuC0527i;
            menuC0527i.f7421e = new C0558m(this, 7);
            C0571i c0571i = new C0571i(context);
            this.f3977E = c0571i;
            c0571i.f7849w = true;
            c0571i.x = true;
            c0571i.f7843q = new l(21);
            this.f3974B.b(c0571i, this.f3975C);
            C0571i c0571i2 = this.f3977E;
            c0571i2.f7845s = this;
            this.f3974B = c0571i2.f7841o;
        }
        return this.f3974B;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0571i c0571i = this.f3977E;
        C0570h c0570h = c0571i.f7846t;
        if (c0570h != null) {
            return c0570h.getDrawable();
        }
        if (c0571i.f7848v) {
            return c0571i.f7847u;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f3976D;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i3) {
        boolean z3 = false;
        if (i3 == 0) {
            return false;
        }
        View childAt = getChildAt(i3 - 1);
        View childAt2 = getChildAt(i3);
        if (i3 < getChildCount() && (childAt instanceof InterfaceC0572j)) {
            z3 = ((InterfaceC0572j) childAt).a();
        }
        if (i3 > 0 && (childAt2 instanceof InterfaceC0572j)) {
            return z3 | ((InterfaceC0572j) childAt2).c();
        }
        return z3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0571i c0571i = this.f3977E;
        if (c0571i != null) {
            c0571i.h();
            C0568f c0568f = this.f3977E.f7834D;
            if (c0568f != null && c0568f.b()) {
                this.f3977E.i();
                this.f3977E.j();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0571i c0571i = this.f3977E;
        if (c0571i != null) {
            c0571i.i();
            C0568f c0568f = c0571i.f7835E;
            if (c0568f != null && c0568f.b()) {
                c0568f.f7474i.dismiss();
            }
        }
    }

    @Override // l.E, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7;
        int width;
        int i8;
        if (!this.f3978F) {
            super.onLayout(z3, i3, i4, i5, i6);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i6 - i4) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i5 - i3;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a3 = y0.a(this);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C0573k c0573k = (C0573k) childAt.getLayoutParams();
                if (c0573k.f7859c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i13)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a3) {
                        i8 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0573k).leftMargin;
                        width = i8 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0573k).rightMargin;
                        i8 = width - measuredWidth;
                    }
                    int i14 = i9 - (measuredHeight / 2);
                    childAt.layout(i8, i14, width, measuredHeight + i14);
                    paddingRight -= measuredWidth;
                    i11 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0573k).leftMargin) + ((ViewGroup.MarginLayoutParams) c0573k).rightMargin;
                    j(i13);
                    i12++;
                }
            }
        }
        if (childCount == 1 && i11 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i15 = (i10 / 2) - (measuredWidth2 / 2);
            int i16 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i15, i16, measuredWidth2 + i15, measuredHeight2 + i16);
            return;
        }
        int i17 = i12 - (i11 ^ 1);
        if (i17 > 0) {
            i7 = paddingRight / i17;
        } else {
            i7 = 0;
        }
        int max = Math.max(0, i7);
        if (a3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i18 = 0; i18 < childCount; i18++) {
                View childAt3 = getChildAt(i18);
                C0573k c0573k2 = (C0573k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0573k2.f7859c) {
                    int i19 = width2 - ((ViewGroup.MarginLayoutParams) c0573k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width2 = i19 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c0573k2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt4 = getChildAt(i21);
            C0573k c0573k3 = (C0573k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0573k3.f7859c) {
                int i22 = paddingLeft + ((ViewGroup.MarginLayoutParams) c0573k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i23 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i22, i23, i22 + measuredWidth4, measuredHeight4 + i23);
                paddingLeft = measuredWidth4 + ((ViewGroup.MarginLayoutParams) c0573k3).rightMargin + max + i22;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // l.E, android.view.View
    public final void onMeasure(int i3, int i4) {
        boolean z3;
        int i5;
        boolean z4;
        boolean z5;
        boolean z6;
        int i6;
        boolean z7;
        int i7;
        int i8;
        int i9;
        int i10;
        ?? r4;
        boolean z8;
        int i11;
        int i12;
        int i13;
        ActionMenuItemView actionMenuItemView;
        boolean z9;
        int i14;
        boolean z10;
        MenuC0527i menuC0527i;
        boolean z11 = this.f3978F;
        if (View.MeasureSpec.getMode(i3) == 1073741824) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f3978F = z3;
        if (z11 != z3) {
            this.f3979G = 0;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (this.f3978F && (menuC0527i = this.f3974B) != null && size != this.f3979G) {
            this.f3979G = size;
            menuC0527i.o(true);
        }
        int childCount = getChildCount();
        if (this.f3978F && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i4);
            int size2 = View.MeasureSpec.getSize(i3);
            int size3 = View.MeasureSpec.getSize(i4);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, paddingBottom, -2);
            int i15 = size2 - paddingRight;
            int i16 = this.f3980H;
            int i17 = i15 / i16;
            int i18 = i15 % i16;
            if (i17 == 0) {
                setMeasuredDimension(i15, 0);
                return;
            }
            int i19 = (i18 / i17) + i16;
            int childCount2 = getChildCount();
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            boolean z12 = false;
            long j3 = 0;
            int i24 = 0;
            while (true) {
                i5 = this.f3981I;
                if (i23 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i23);
                int i25 = size3;
                int i26 = i15;
                if (childAt.getVisibility() == 8) {
                    i12 = mode;
                    i13 = paddingBottom;
                } else {
                    boolean z13 = childAt instanceof ActionMenuItemView;
                    int i27 = i21 + 1;
                    if (z13) {
                        childAt.setPadding(i5, 0, i5, 0);
                    }
                    C0573k c0573k = (C0573k) childAt.getLayoutParams();
                    c0573k.f7864h = false;
                    c0573k.f7861e = 0;
                    c0573k.f7860d = 0;
                    c0573k.f7862f = false;
                    ((ViewGroup.MarginLayoutParams) c0573k).leftMargin = 0;
                    ((ViewGroup.MarginLayoutParams) c0573k).rightMargin = 0;
                    if (z13 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText())) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    c0573k.f7863g = z8;
                    if (c0573k.f7859c) {
                        i11 = 1;
                    } else {
                        i11 = i17;
                    }
                    C0573k c0573k2 = (C0573k) childAt.getLayoutParams();
                    i12 = mode;
                    i13 = paddingBottom;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z13) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && !TextUtils.isEmpty(actionMenuItemView.getText())) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (i11 > 0 && (!z9 || i11 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i11 * i19, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i14 = measuredWidth / i19;
                        if (measuredWidth % i19 != 0) {
                            i14++;
                        }
                        if (z9 && i14 < 2) {
                            i14 = 2;
                        }
                    } else {
                        i14 = 0;
                    }
                    if (!c0573k2.f7859c && z9) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c0573k2.f7862f = z10;
                    c0573k2.f7860d = i14;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i19, 1073741824), makeMeasureSpec);
                    i22 = Math.max(i22, i14);
                    if (c0573k.f7862f) {
                        i24++;
                    }
                    if (c0573k.f7859c) {
                        z12 = true;
                    }
                    i17 -= i14;
                    i20 = Math.max(i20, childAt.getMeasuredHeight());
                    if (i14 == 1) {
                        j3 |= 1 << i23;
                    }
                    i21 = i27;
                }
                i23++;
                size3 = i25;
                i15 = i26;
                paddingBottom = i13;
                mode = i12;
            }
            int i28 = mode;
            int i29 = i15;
            int i30 = size3;
            if (z12 && i21 == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z14 = false;
            while (i24 > 0 && i17 > 0) {
                int i31 = Integer.MAX_VALUE;
                int i32 = 0;
                int i33 = 0;
                long j4 = 0;
                while (i33 < childCount2) {
                    C0573k c0573k3 = (C0573k) getChildAt(i33).getLayoutParams();
                    boolean z15 = z14;
                    if (c0573k3.f7862f) {
                        int i34 = c0573k3.f7860d;
                        if (i34 < i31) {
                            j4 = 1 << i33;
                            i31 = i34;
                            i32 = 1;
                        } else if (i34 == i31) {
                            j4 |= 1 << i33;
                            i32++;
                        }
                    }
                    i33++;
                    z14 = z15;
                }
                z5 = z14;
                j3 |= j4;
                if (i32 > i17) {
                    break;
                }
                int i35 = i31 + 1;
                int i36 = 0;
                while (i36 < childCount2) {
                    View childAt2 = getChildAt(i36);
                    C0573k c0573k4 = (C0573k) childAt2.getLayoutParams();
                    int i37 = i20;
                    int i38 = childMeasureSpec;
                    int i39 = childCount2;
                    long j5 = 1 << i36;
                    if ((j4 & j5) == 0) {
                        if (c0573k4.f7860d == i35) {
                            j3 |= j5;
                        }
                    } else {
                        if (z4 && c0573k4.f7863g) {
                            r4 = 1;
                            r4 = 1;
                            if (i17 == 1) {
                                childAt2.setPadding(i5 + i19, 0, i5, 0);
                            }
                        } else {
                            r4 = 1;
                        }
                        c0573k4.f7860d += r4;
                        c0573k4.f7864h = r4;
                        i17--;
                    }
                    i36++;
                    childMeasureSpec = i38;
                    i20 = i37;
                    childCount2 = i39;
                }
                z14 = true;
            }
            z5 = z14;
            int i40 = i20;
            int i41 = childMeasureSpec;
            int i42 = childCount2;
            if (!z12 && i21 == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (i17 <= 0 || j3 == 0 || (i17 >= i21 - 1 && !z6 && i22 <= 1)) {
                i6 = i42;
                z7 = z5;
            } else {
                float bitCount = Long.bitCount(j3);
                if (!z6) {
                    if ((j3 & 1) != 0 && !((C0573k) getChildAt(0).getLayoutParams()).f7863g) {
                        bitCount -= 0.5f;
                    }
                    int i43 = i42 - 1;
                    if ((j3 & (1 << i43)) != 0 && !((C0573k) getChildAt(i43).getLayoutParams()).f7863g) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i10 = (int) ((i17 * i19) / bitCount);
                } else {
                    i10 = 0;
                }
                boolean z16 = z5;
                i6 = i42;
                for (int i44 = 0; i44 < i6; i44++) {
                    if ((j3 & (1 << i44)) != 0) {
                        View childAt3 = getChildAt(i44);
                        C0573k c0573k5 = (C0573k) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            c0573k5.f7861e = i10;
                            c0573k5.f7864h = true;
                            if (i44 == 0 && !c0573k5.f7863g) {
                                ((ViewGroup.MarginLayoutParams) c0573k5).leftMargin = (-i10) / 2;
                            }
                            z16 = true;
                        } else {
                            if (c0573k5.f7859c) {
                                c0573k5.f7861e = i10;
                                c0573k5.f7864h = true;
                                ((ViewGroup.MarginLayoutParams) c0573k5).rightMargin = (-i10) / 2;
                                z16 = true;
                            } else {
                                if (i44 != 0) {
                                    ((ViewGroup.MarginLayoutParams) c0573k5).leftMargin = i10 / 2;
                                }
                                if (i44 != i6 - 1) {
                                    ((ViewGroup.MarginLayoutParams) c0573k5).rightMargin = i10 / 2;
                                }
                            }
                        }
                    }
                }
                z7 = z16;
            }
            if (z7) {
                int i45 = 0;
                while (i45 < i6) {
                    View childAt4 = getChildAt(i45);
                    C0573k c0573k6 = (C0573k) childAt4.getLayoutParams();
                    if (!c0573k6.f7864h) {
                        i9 = i41;
                    } else {
                        i9 = i41;
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0573k6.f7860d * i19) + c0573k6.f7861e, 1073741824), i9);
                    }
                    i45++;
                    i41 = i9;
                }
            }
            if (i28 != 1073741824) {
                i8 = i29;
                i7 = i40;
            } else {
                i7 = i30;
                i8 = i29;
            }
            setMeasuredDimension(i8, i7);
            return;
        }
        for (int i46 = 0; i46 < childCount; i46++) {
            C0573k c0573k7 = (C0573k) getChildAt(i46).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c0573k7).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) c0573k7).leftMargin = 0;
        }
        super.onMeasure(i3, i4);
    }

    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f3977E.f7832B = z3;
    }

    public void setOnMenuItemClickListener(InterfaceC0574l interfaceC0574l) {
        this.f3982J = interfaceC0574l;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0571i c0571i = this.f3977E;
        C0570h c0570h = c0571i.f7846t;
        if (c0570h != null) {
            c0570h.setImageDrawable(drawable);
            return;
        }
        c0571i.f7848v = true;
        c0571i.f7847u = drawable;
    }

    public void setOverflowReserved(boolean z3) {
    }

    public void setPopupTheme(int i3) {
        if (this.f3976D != i3) {
            this.f3976D = i3;
            if (i3 == 0) {
                this.f3975C = getContext();
            } else {
                this.f3975C = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setPresenter(C0571i c0571i) {
        this.f3977E = c0571i;
        c0571i.f7845s = this;
        this.f3974B = c0571i.f7841o;
    }

    @Override // l.E, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new D(getContext(), attributeSet);
    }
}
