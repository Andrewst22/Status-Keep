package androidx.appcompat.widget;

import B1.e;
import C.y;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.flutter_application_1.R;
import e.AbstractC0259a;
import j.d;
import java.lang.reflect.Field;
import java.util.ArrayList;
import k.MenuC0527i;
import k.MenuItemC0528j;
import k0.C0558m;
import l.C0568f;
import l.C0571i;
import l.C0578p;
import l.C0579q;
import l.C0581t;
import l.InterfaceC0585x;
import l.S;
import l.n0;
import l.o0;
import l.p0;
import l.q0;
import l.r0;
import l.s0;
import l.y0;
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A  reason: collision with root package name */
    public final int f4075A;

    /* renamed from: B  reason: collision with root package name */
    public int f4076B;

    /* renamed from: C  reason: collision with root package name */
    public int f4077C;

    /* renamed from: D  reason: collision with root package name */
    public int f4078D;

    /* renamed from: E  reason: collision with root package name */
    public int f4079E;

    /* renamed from: F  reason: collision with root package name */
    public S f4080F;

    /* renamed from: G  reason: collision with root package name */
    public int f4081G;

    /* renamed from: H  reason: collision with root package name */
    public int f4082H;

    /* renamed from: I  reason: collision with root package name */
    public final int f4083I;

    /* renamed from: J  reason: collision with root package name */
    public CharSequence f4084J;

    /* renamed from: K  reason: collision with root package name */
    public CharSequence f4085K;
    public ColorStateList L;

    /* renamed from: M  reason: collision with root package name */
    public ColorStateList f4086M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f4087N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f4088O;

    /* renamed from: P  reason: collision with root package name */
    public final ArrayList f4089P;

    /* renamed from: Q  reason: collision with root package name */
    public final ArrayList f4090Q;

    /* renamed from: R  reason: collision with root package name */
    public final int[] f4091R;

    /* renamed from: S  reason: collision with root package name */
    public final C0558m f4092S;

    /* renamed from: T  reason: collision with root package name */
    public s0 f4093T;

    /* renamed from: U  reason: collision with root package name */
    public o0 f4094U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f4095V;

    /* renamed from: W  reason: collision with root package name */
    public final H.b f4096W;

    /* renamed from: m  reason: collision with root package name */
    public ActionMenuView f4097m;

    /* renamed from: n  reason: collision with root package name */
    public C0581t f4098n;

    /* renamed from: o  reason: collision with root package name */
    public C0581t f4099o;

    /* renamed from: p  reason: collision with root package name */
    public C0578p f4100p;

    /* renamed from: q  reason: collision with root package name */
    public C0579q f4101q;

    /* renamed from: r  reason: collision with root package name */
    public final Drawable f4102r;

    /* renamed from: s  reason: collision with root package name */
    public final CharSequence f4103s;

    /* renamed from: t  reason: collision with root package name */
    public C0578p f4104t;

    /* renamed from: u  reason: collision with root package name */
    public View f4105u;

    /* renamed from: v  reason: collision with root package name */
    public Context f4106v;

    /* renamed from: w  reason: collision with root package name */
    public int f4107w;
    public int x;

    /* renamed from: y  reason: collision with root package name */
    public int f4108y;

    /* renamed from: z  reason: collision with root package name */
    public final int f4109z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f4083I = 8388627;
        this.f4089P = new ArrayList();
        this.f4090Q = new ArrayList();
        this.f4091R = new int[2];
        this.f4092S = new C0558m(this, 8);
        this.f4096W = new H.b(this, 7);
        e n02 = e.n0(getContext(), attributeSet, AbstractC0259a.f5211t, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) n02.f57o;
        this.x = typedArray.getResourceId(28, 0);
        this.f4108y = typedArray.getResourceId(19, 0);
        this.f4083I = typedArray.getInteger(0, 8388627);
        this.f4109z = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f4079E = dimensionPixelOffset;
        this.f4078D = dimensionPixelOffset;
        this.f4077C = dimensionPixelOffset;
        this.f4076B = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f4076B = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f4077C = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f4078D = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f4079E = dimensionPixelOffset5;
        }
        this.f4075A = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        S s3 = this.f4080F;
        s3.f7784h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            s3.f7781e = dimensionPixelSize;
            s3.f7777a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            s3.f7782f = dimensionPixelSize2;
            s3.f7778b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            s3.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f4081G = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f4082H = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f4102r = n02.b0(4);
        this.f4103s = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f4106v = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable b02 = n02.b0(16);
        if (b02 != null) {
            setNavigationIcon(b02);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable b03 = n02.b0(11);
        if (b03 != null) {
            setLogo(b03);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(n02.Z(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(n02.Z(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        n02.r0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.p0, android.view.ViewGroup$MarginLayoutParams] */
    public static p0 g() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f7890b = 0;
        marginLayoutParams.f7889a = 8388627;
        return marginLayoutParams;
    }

    private MenuInflater getMenuInflater() {
        return new d(getContext());
    }

    public static p0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z3 = layoutParams instanceof p0;
        if (z3) {
            p0 p0Var = (p0) layoutParams;
            p0 p0Var2 = new p0(p0Var);
            p0Var2.f7890b = 0;
            p0Var2.f7890b = p0Var.f7890b;
            return p0Var2;
        } else if (z3) {
            p0 p0Var3 = new p0((p0) layoutParams);
            p0Var3.f7890b = 0;
            return p0Var3;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            p0 p0Var4 = new p0(marginLayoutParams);
            p0Var4.f7890b = 0;
            ((ViewGroup.MarginLayoutParams) p0Var4).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) p0Var4).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) p0Var4).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) p0Var4).bottomMargin = marginLayoutParams.bottomMargin;
            return p0Var4;
        } else {
            p0 p0Var5 = new p0(layoutParams);
            p0Var5.f7890b = 0;
            return p0Var5;
        }
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i3, ArrayList arrayList) {
        boolean z3;
        Field field = y.f117a;
        if (getLayoutDirection() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, getLayoutDirection());
        arrayList.clear();
        if (z3) {
            for (int i4 = childCount - 1; i4 >= 0; i4--) {
                View childAt = getChildAt(i4);
                p0 p0Var = (p0) childAt.getLayoutParams();
                if (p0Var.f7890b == 0 && r(childAt) && i(p0Var.f7889a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = getChildAt(i5);
            p0 p0Var2 = (p0) childAt2.getLayoutParams();
            if (p0Var2.f7890b == 0 && r(childAt2) && i(p0Var2.f7889a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z3) {
        p0 p0Var;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            p0Var = g();
        } else if (!checkLayoutParams(layoutParams)) {
            p0Var = h(layoutParams);
        } else {
            p0Var = (p0) layoutParams;
        }
        p0Var.f7890b = 1;
        if (z3 && this.f4105u != null) {
            view.setLayoutParams(p0Var);
            this.f4090Q.add(view);
            return;
        }
        addView(view, p0Var);
    }

    public final void c() {
        if (this.f4104t == null) {
            C0578p c0578p = new C0578p(getContext());
            this.f4104t = c0578p;
            c0578p.setImageDrawable(this.f4102r);
            this.f4104t.setContentDescription(this.f4103s);
            p0 g3 = g();
            g3.f7889a = (this.f4109z & 112) | 8388611;
            g3.f7890b = 2;
            this.f4104t.setLayoutParams(g3);
            this.f4104t.setOnClickListener(new n0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof p0)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.S, java.lang.Object] */
    public final void d() {
        if (this.f4080F == null) {
            ?? obj = new Object();
            obj.f7777a = 0;
            obj.f7778b = 0;
            obj.f7779c = Integer.MIN_VALUE;
            obj.f7780d = Integer.MIN_VALUE;
            obj.f7781e = 0;
            obj.f7782f = 0;
            obj.f7783g = false;
            obj.f7784h = false;
            this.f4080F = obj;
        }
    }

    public final void e() {
        if (this.f4097m == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f4097m = actionMenuView;
            actionMenuView.setPopupTheme(this.f4107w);
            this.f4097m.setOnMenuItemClickListener(this.f4092S);
            this.f4097m.getClass();
            p0 g3 = g();
            g3.f7889a = (this.f4109z & 112) | 8388613;
            this.f4097m.setLayoutParams(g3);
            b(this.f4097m, false);
        }
        ActionMenuView actionMenuView2 = this.f4097m;
        if (actionMenuView2.f3974B == null) {
            MenuC0527i menuC0527i = (MenuC0527i) actionMenuView2.getMenu();
            if (this.f4094U == null) {
                this.f4094U = new o0(this);
            }
            this.f4097m.setExpandedActionViewsExclusive(true);
            menuC0527i.b(this.f4094U, this.f4106v);
        }
    }

    public final void f() {
        if (this.f4100p == null) {
            this.f4100p = new C0578p(getContext());
            p0 g3 = g();
            g3.f7889a = (this.f4109z & 112) | 8388611;
            this.f4100p.setLayoutParams(g3);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0578p c0578p = this.f4104t;
        if (c0578p != null) {
            return c0578p.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0578p c0578p = this.f4104t;
        if (c0578p != null) {
            return c0578p.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        S s3 = this.f4080F;
        if (s3 != null) {
            if (s3.f7783g) {
                return s3.f7777a;
            }
            return s3.f7778b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i3 = this.f4082H;
        if (i3 == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i3;
    }

    public int getContentInsetLeft() {
        S s3 = this.f4080F;
        if (s3 != null) {
            return s3.f7777a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        S s3 = this.f4080F;
        if (s3 != null) {
            return s3.f7778b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        S s3 = this.f4080F;
        if (s3 != null) {
            if (s3.f7783g) {
                return s3.f7778b;
            }
            return s3.f7777a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i3 = this.f4081G;
        if (i3 == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i3;
    }

    public int getCurrentContentInsetEnd() {
        MenuC0527i menuC0527i;
        ActionMenuView actionMenuView = this.f4097m;
        if (actionMenuView != null && (menuC0527i = actionMenuView.f3974B) != null && menuC0527i.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.f4082H, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        Field field = y.f117a;
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = y.f117a;
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f4081G, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        C0579q c0579q = this.f4101q;
        if (c0579q != null) {
            return c0579q.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0579q c0579q = this.f4101q;
        if (c0579q != null) {
            return c0579q.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f4097m.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        C0578p c0578p = this.f4100p;
        if (c0578p != null) {
            return c0578p.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0578p c0578p = this.f4100p;
        if (c0578p != null) {
            return c0578p.getDrawable();
        }
        return null;
    }

    public C0571i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f4097m.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f4106v;
    }

    public int getPopupTheme() {
        return this.f4107w;
    }

    public CharSequence getSubtitle() {
        return this.f4085K;
    }

    public final TextView getSubtitleTextView() {
        return this.f4099o;
    }

    public CharSequence getTitle() {
        return this.f4084J;
    }

    public int getTitleMarginBottom() {
        return this.f4079E;
    }

    public int getTitleMarginEnd() {
        return this.f4077C;
    }

    public int getTitleMarginStart() {
        return this.f4076B;
    }

    public int getTitleMarginTop() {
        return this.f4078D;
    }

    public final TextView getTitleTextView() {
        return this.f4098n;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, l.s0] */
    public InterfaceC0585x getWrapper() {
        boolean z3;
        Drawable drawable;
        if (this.f4093T == null) {
            ?? obj = new Object();
            obj.f7919l = 0;
            obj.f7908a = this;
            obj.f7915h = getTitle();
            obj.f7916i = getSubtitle();
            if (obj.f7915h != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            obj.f7914g = z3;
            obj.f7913f = getNavigationIcon();
            String str = null;
            e n02 = e.n0(getContext(), null, AbstractC0259a.f5192a, R.attr.actionBarStyle);
            obj.f7920m = n02.b0(15);
            TypedArray typedArray = (TypedArray) n02.f57o;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                obj.f7914g = true;
                obj.f7915h = text;
                if ((obj.f7909b & 8) != 0) {
                    obj.f7908a.setTitle(text);
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                obj.f7916i = text2;
                if ((obj.f7909b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable b02 = n02.b0(20);
            if (b02 != null) {
                obj.f7912e = b02;
                obj.c();
            }
            Drawable b03 = n02.b0(17);
            if (b03 != null) {
                obj.f7911d = b03;
                obj.c();
            }
            if (obj.f7913f == null && (drawable = obj.f7920m) != null) {
                obj.f7913f = drawable;
                int i3 = obj.f7909b & 4;
                Toolbar toolbar = obj.f7908a;
                if (i3 != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            obj.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = obj.f7910c;
                if (view != null && (obj.f7909b & 16) != 0) {
                    removeView(view);
                }
                obj.f7910c = inflate;
                if (inflate != null && (obj.f7909b & 16) != 0) {
                    addView(inflate);
                }
                obj.a(obj.f7909b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f4080F.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.x = resourceId2;
                C0581t c0581t = this.f4098n;
                if (c0581t != null) {
                    c0581t.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f4108y = resourceId3;
                C0581t c0581t2 = this.f4099o;
                if (c0581t2 != null) {
                    c0581t2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            n02.r0();
            if (R.string.abc_action_bar_up_description != obj.f7919l) {
                obj.f7919l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i4 = obj.f7919l;
                    if (i4 != 0) {
                        str = getContext().getString(i4);
                    }
                    obj.f7917j = str;
                    obj.b();
                }
            }
            obj.f7917j = getNavigationContentDescription();
            setNavigationOnClickListener(new n0((s0) obj));
            this.f4093T = obj;
        }
        return this.f4093T;
    }

    public final int i(int i3) {
        Field field = y.f117a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
        if (absoluteGravity != 1 && absoluteGravity != 3 && absoluteGravity != 5) {
            if (layoutDirection != 1) {
                return 3;
            }
            return 5;
        }
        return absoluteGravity;
    }

    public final int j(View view, int i3) {
        int i4;
        p0 p0Var = (p0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i3 > 0) {
            i4 = (measuredHeight - i3) / 2;
        } else {
            i4 = 0;
        }
        int i5 = p0Var.f7889a & 112;
        if (i5 != 16 && i5 != 48 && i5 != 80) {
            i5 = this.f4083I & 112;
        }
        if (i5 != 48) {
            if (i5 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i6 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i7 = ((ViewGroup.MarginLayoutParams) p0Var).topMargin;
                if (i6 < i7) {
                    i6 = i7;
                } else {
                    int i8 = (((height - paddingBottom) - measuredHeight) - i6) - paddingTop;
                    int i9 = ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin;
                    if (i8 < i9) {
                        i6 = Math.max(0, i6 - (i9 - i8));
                    }
                }
                return paddingTop + i6;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) p0Var).bottomMargin) - i4;
        }
        return getPaddingTop() - i4;
    }

    public final boolean m(View view) {
        if (view.getParent() != this && !this.f4090Q.contains(view)) {
            return false;
        }
        return true;
    }

    public final int n(View view, int i3, int i4, int[] iArr) {
        p0 p0Var = (p0) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) p0Var).leftMargin - iArr[0];
        int max = Math.max(0, i5) + i3;
        iArr[0] = Math.max(0, -i5);
        int j3 = j(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j3, max + measuredWidth, view.getMeasuredHeight() + j3);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) p0Var).rightMargin + max;
    }

    public final int o(View view, int i3, int i4, int[] iArr) {
        p0 p0Var = (p0) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) p0Var).rightMargin - iArr[1];
        int max = i3 - Math.max(0, i5);
        iArr[1] = Math.max(0, -i5);
        int j3 = j(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j3, max, view.getMeasuredHeight() + j3);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) p0Var).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f4096W);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4088O = false;
        }
        if (!this.f4088O) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f4088O = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f4088O = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x029b A[LOOP:0: B:106:0x0299->B:107:0x029b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b8 A[LOOP:1: B:109:0x02b6->B:110:0x02b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d6 A[LOOP:2: B:112:0x02d4->B:113:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0325 A[LOOP:3: B:121:0x0323->B:122:0x0325, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0222  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean a3 = y0.a(this);
        int i12 = !a3 ? 1 : 0;
        int i13 = 0;
        if (r(this.f4100p)) {
            q(this.f4100p, i3, 0, i4, this.f4075A);
            i5 = k(this.f4100p) + this.f4100p.getMeasuredWidth();
            i6 = Math.max(0, l(this.f4100p) + this.f4100p.getMeasuredHeight());
            i7 = View.combineMeasuredStates(0, this.f4100p.getMeasuredState());
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (r(this.f4104t)) {
            q(this.f4104t, i3, 0, i4, this.f4075A);
            i5 = k(this.f4104t) + this.f4104t.getMeasuredWidth();
            i6 = Math.max(i6, l(this.f4104t) + this.f4104t.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f4104t.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i5);
        int max2 = Math.max(0, currentContentInsetStart - i5);
        int[] iArr = this.f4091R;
        iArr[a3 ? 1 : 0] = max2;
        if (r(this.f4097m)) {
            q(this.f4097m, i3, max, i4, this.f4075A);
            i8 = k(this.f4097m) + this.f4097m.getMeasuredWidth();
            i6 = Math.max(i6, l(this.f4097m) + this.f4097m.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f4097m.getMeasuredState());
        } else {
            i8 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i8);
        iArr[i12] = Math.max(0, currentContentInsetEnd - i8);
        if (r(this.f4105u)) {
            max3 += p(this.f4105u, i3, max3, i4, 0, iArr);
            i6 = Math.max(i6, l(this.f4105u) + this.f4105u.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f4105u.getMeasuredState());
        }
        if (r(this.f4101q)) {
            max3 += p(this.f4101q, i3, max3, i4, 0, iArr);
            i6 = Math.max(i6, l(this.f4101q) + this.f4101q.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f4101q.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (((p0) childAt.getLayoutParams()).f7890b == 0 && r(childAt)) {
                max3 += p(childAt, i3, max3, i4, 0, iArr);
                i6 = Math.max(i6, l(childAt) + childAt.getMeasuredHeight());
                i7 = View.combineMeasuredStates(i7, childAt.getMeasuredState());
            }
        }
        int i15 = this.f4078D + this.f4079E;
        int i16 = this.f4076B + this.f4077C;
        if (r(this.f4098n)) {
            p(this.f4098n, i3, max3 + i16, i4, i15, iArr);
            int k3 = k(this.f4098n) + this.f4098n.getMeasuredWidth();
            i11 = l(this.f4098n) + this.f4098n.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i7, this.f4098n.getMeasuredState());
            i10 = k3;
        } else {
            i9 = i7;
            i10 = 0;
            i11 = 0;
        }
        if (r(this.f4099o)) {
            i10 = Math.max(i10, p(this.f4099o, i3, max3 + i16, i4, i11 + i15, iArr));
            i11 += l(this.f4099o) + this.f4099o.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i9, this.f4099o.getMeasuredState());
        }
        int max4 = Math.max(i6, i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i10, getSuggestedMinimumWidth()), i3, (-16777216) & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i4, i9 << 16);
        if (this.f4095V) {
            int childCount2 = getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = getChildAt(i17);
                if (!r(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i13);
        }
        i13 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i13);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuC0527i menuC0527i;
        MenuItem findItem;
        if (!(parcelable instanceof r0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        r0 r0Var = (r0) parcelable;
        super.onRestoreInstanceState(r0Var.f482m);
        ActionMenuView actionMenuView = this.f4097m;
        if (actionMenuView != null) {
            menuC0527i = actionMenuView.f3974B;
        } else {
            menuC0527i = null;
        }
        int i3 = r0Var.f7893o;
        if (i3 != 0 && this.f4094U != null && menuC0527i != null && (findItem = menuC0527i.findItem(i3)) != null) {
            findItem.expandActionView();
        }
        if (r0Var.f7894p) {
            H.b bVar = this.f4096W;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        d();
        S s3 = this.f4080F;
        boolean z3 = true;
        if (i3 != 1) {
            z3 = false;
        }
        if (z3 != s3.f7783g) {
            s3.f7783g = z3;
            if (s3.f7784h) {
                if (z3) {
                    int i4 = s3.f7780d;
                    if (i4 == Integer.MIN_VALUE) {
                        i4 = s3.f7781e;
                    }
                    s3.f7777a = i4;
                    int i5 = s3.f7779c;
                    if (i5 == Integer.MIN_VALUE) {
                        i5 = s3.f7782f;
                    }
                    s3.f7778b = i5;
                    return;
                }
                int i6 = s3.f7779c;
                if (i6 == Integer.MIN_VALUE) {
                    i6 = s3.f7781e;
                }
                s3.f7777a = i6;
                int i7 = s3.f7780d;
                if (i7 == Integer.MIN_VALUE) {
                    i7 = s3.f7782f;
                }
                s3.f7778b = i7;
                return;
            }
            s3.f7777a = s3.f7781e;
            s3.f7778b = s3.f7782f;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.r0, android.os.Parcelable, J.c] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z3;
        C0571i c0571i;
        C0568f c0568f;
        MenuItemC0528j menuItemC0528j;
        ?? cVar = new J.c(super.onSaveInstanceState());
        o0 o0Var = this.f4094U;
        if (o0Var != null && (menuItemC0528j = o0Var.f7885n) != null) {
            cVar.f7893o = menuItemC0528j.f7439a;
        }
        ActionMenuView actionMenuView = this.f4097m;
        if (actionMenuView != null && (c0571i = actionMenuView.f3977E) != null && (c0568f = c0571i.f7834D) != null && c0568f.b()) {
            z3 = true;
        } else {
            z3 = false;
        }
        cVar.f7894p = z3;
        return cVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4087N = false;
        }
        if (!this.f4087N) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f4087N = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f4087N = false;
        }
        return true;
    }

    public final int p(View view, int i3, int i4, int i5, int i6, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i7 = marginLayoutParams.leftMargin - iArr[0];
        int i8 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i8) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i7);
        iArr[1] = Math.max(0, -i8);
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + max + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i6, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public void setCollapseContentDescription(int i3) {
        setCollapseContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setCollapseIcon(int i3) {
        setCollapseIcon(f.b.c(getContext(), i3));
    }

    public void setCollapsible(boolean z3) {
        this.f4095V = z3;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f4082H) {
            this.f4082H = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f4081G) {
            this.f4081G = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i3) {
        setLogo(f.b.c(getContext(), i3));
    }

    public void setLogoDescription(int i3) {
        setLogoDescription(getContext().getText(i3));
    }

    public void setNavigationContentDescription(int i3) {
        setNavigationContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setNavigationIcon(int i3) {
        setNavigationIcon(f.b.c(getContext(), i3));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f4100p.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f4097m.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i3) {
        if (this.f4107w != i3) {
            this.f4107w = i3;
            if (i3 == 0) {
                this.f4106v = getContext();
            } else {
                this.f4106v = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setSubtitle(int i3) {
        setSubtitle(getContext().getText(i3));
    }

    public void setSubtitleTextColor(int i3) {
        setSubtitleTextColor(ColorStateList.valueOf(i3));
    }

    public void setTitle(int i3) {
        setTitle(getContext().getText(i3));
    }

    public void setTitleMarginBottom(int i3) {
        this.f4079E = i3;
        requestLayout();
    }

    public void setTitleMarginEnd(int i3) {
        this.f4077C = i3;
        requestLayout();
    }

    public void setTitleMarginStart(int i3) {
        this.f4076B = i3;
        requestLayout();
    }

    public void setTitleMarginTop(int i3) {
        this.f4078D = i3;
        requestLayout();
    }

    public void setTitleTextColor(int i3) {
        setTitleTextColor(ColorStateList.valueOf(i3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.p0, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f7889a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0259a.f5193b);
        marginLayoutParams.f7889a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.f7890b = 0;
        return marginLayoutParams;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0578p c0578p = this.f4104t;
        if (c0578p != null) {
            c0578p.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f4104t.setImageDrawable(drawable);
            return;
        }
        C0578p c0578p = this.f4104t;
        if (c0578p != null) {
            c0578p.setImageDrawable(this.f4102r);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f4101q == null) {
                this.f4101q = new C0579q(getContext(), 0);
            }
            if (!m(this.f4101q)) {
                b(this.f4101q, true);
            }
        } else {
            C0579q c0579q = this.f4101q;
            if (c0579q != null && m(c0579q)) {
                removeView(this.f4101q);
                this.f4090Q.remove(this.f4101q);
            }
        }
        C0579q c0579q2 = this.f4101q;
        if (c0579q2 != null) {
            c0579q2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f4101q == null) {
            this.f4101q = new C0579q(getContext(), 0);
        }
        C0579q c0579q = this.f4101q;
        if (c0579q != null) {
            c0579q.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C0578p c0578p = this.f4100p;
        if (c0578p != null) {
            c0578p.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f4100p)) {
                b(this.f4100p, true);
            }
        } else {
            C0578p c0578p = this.f4100p;
            if (c0578p != null && m(c0578p)) {
                removeView(this.f4100p);
                this.f4090Q.remove(this.f4100p);
            }
        }
        C0578p c0578p2 = this.f4100p;
        if (c0578p2 != null) {
            c0578p2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f4099o == null) {
                Context context = getContext();
                C0581t c0581t = new C0581t(context, null);
                this.f4099o = c0581t;
                c0581t.setSingleLine();
                this.f4099o.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f4108y;
                if (i3 != 0) {
                    this.f4099o.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f4086M;
                if (colorStateList != null) {
                    this.f4099o.setTextColor(colorStateList);
                }
            }
            if (!m(this.f4099o)) {
                b(this.f4099o, true);
            }
        } else {
            C0581t c0581t2 = this.f4099o;
            if (c0581t2 != null && m(c0581t2)) {
                removeView(this.f4099o);
                this.f4090Q.remove(this.f4099o);
            }
        }
        C0581t c0581t3 = this.f4099o;
        if (c0581t3 != null) {
            c0581t3.setText(charSequence);
        }
        this.f4085K = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f4086M = colorStateList;
        C0581t c0581t = this.f4099o;
        if (c0581t != null) {
            c0581t.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f4098n == null) {
                Context context = getContext();
                C0581t c0581t = new C0581t(context, null);
                this.f4098n = c0581t;
                c0581t.setSingleLine();
                this.f4098n.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.x;
                if (i3 != 0) {
                    this.f4098n.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.L;
                if (colorStateList != null) {
                    this.f4098n.setTextColor(colorStateList);
                }
            }
            if (!m(this.f4098n)) {
                b(this.f4098n, true);
            }
        } else {
            C0581t c0581t2 = this.f4098n;
            if (c0581t2 != null && m(c0581t2)) {
                removeView(this.f4098n);
                this.f4090Q.remove(this.f4098n);
            }
        }
        C0581t c0581t3 = this.f4098n;
        if (c0581t3 != null) {
            c0581t3.setText(charSequence);
        }
        this.f4084J = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.L = colorStateList;
        C0581t c0581t = this.f4098n;
        if (c0581t != null) {
            c0581t.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(q0 q0Var) {
    }
}
