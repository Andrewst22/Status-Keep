package l;

import a.AbstractC0155a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import e.AbstractC0259a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k.AbstractC0529k;
import k.InterfaceC0535q;
/* loaded from: classes.dex */
public abstract class K implements InterfaceC0535q {

    /* renamed from: I  reason: collision with root package name */
    public static final Method f7737I;

    /* renamed from: J  reason: collision with root package name */
    public static final Method f7738J;

    /* renamed from: K  reason: collision with root package name */
    public static final Method f7739K;

    /* renamed from: D  reason: collision with root package name */
    public final Handler f7743D;

    /* renamed from: F  reason: collision with root package name */
    public Rect f7745F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f7746G;

    /* renamed from: H  reason: collision with root package name */
    public final r f7747H;

    /* renamed from: m  reason: collision with root package name */
    public final Context f7748m;

    /* renamed from: n  reason: collision with root package name */
    public ListAdapter f7749n;

    /* renamed from: o  reason: collision with root package name */
    public M f7750o;

    /* renamed from: q  reason: collision with root package name */
    public int f7752q;

    /* renamed from: r  reason: collision with root package name */
    public int f7753r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f7754s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f7755t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f7756u;

    /* renamed from: w  reason: collision with root package name */
    public I.b f7758w;
    public View x;

    /* renamed from: y  reason: collision with root package name */
    public AbstractC0529k f7759y;

    /* renamed from: p  reason: collision with root package name */
    public int f7751p = -2;

    /* renamed from: v  reason: collision with root package name */
    public int f7757v = 0;

    /* renamed from: z  reason: collision with root package name */
    public final H f7760z = new H(this, 1);

    /* renamed from: A  reason: collision with root package name */
    public final J f7740A = new J(this);

    /* renamed from: B  reason: collision with root package name */
    public final I f7741B = new I(this);

    /* renamed from: C  reason: collision with root package name */
    public final H f7742C = new H(this, 0);

    /* renamed from: E  reason: collision with root package name */
    public final Rect f7744E = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f7737I = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f7739K = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f7738J = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [l.r, android.widget.PopupWindow] */
    public K(Context context, int i3) {
        Drawable drawable;
        int resourceId;
        this.f7748m = context;
        this.f7743D = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0259a.f5202k, i3, 0);
        this.f7752q = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f7753r = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f7754s = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, (AttributeSet) null, i3, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, AbstractC0259a.f5206o, i3, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            AbstractC0155a.H(popupWindow, obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = f.b.c(context, resourceId);
        } else {
            drawable = obtainStyledAttributes2.getDrawable(0);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.f7747H = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    public final void a(ListAdapter listAdapter) {
        I.b bVar = this.f7758w;
        if (bVar == null) {
            this.f7758w = new I.b(this, 1);
        } else {
            ListAdapter listAdapter2 = this.f7749n;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f7749n = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f7758w);
        }
        M m3 = this.f7750o;
        if (m3 != null) {
            m3.setAdapter(this.f7749n);
        }
    }

    @Override // k.InterfaceC0535q
    public final void d() {
        int i3;
        boolean z3;
        int maxAvailableHeight;
        int makeMeasureSpec;
        int i4;
        M m3;
        int i5;
        M m4 = this.f7750o;
        r rVar = this.f7747H;
        Context context = this.f7748m;
        if (m4 == null) {
            M m5 = new M(context, !this.f7746G);
            m5.setHoverListener((N) this);
            this.f7750o = m5;
            m5.setAdapter(this.f7749n);
            this.f7750o.setOnItemClickListener(this.f7759y);
            this.f7750o.setFocusable(true);
            this.f7750o.setFocusableInTouchMode(true);
            this.f7750o.setOnItemSelectedListener(new G(this, 0));
            this.f7750o.setOnScrollListener(this.f7741B);
            rVar.setContentView(this.f7750o);
        } else {
            ViewGroup viewGroup = (ViewGroup) rVar.getContentView();
        }
        Drawable background = rVar.getBackground();
        Rect rect = this.f7744E;
        if (background != null) {
            background.getPadding(rect);
            int i6 = rect.top;
            i3 = rect.bottom + i6;
            if (!this.f7754s) {
                this.f7753r = -i6;
            }
        } else {
            rect.setEmpty();
            i3 = 0;
        }
        if (rVar.getInputMethodMode() == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        View view = this.x;
        int i7 = this.f7753r;
        if (Build.VERSION.SDK_INT > 23) {
            maxAvailableHeight = rVar.getMaxAvailableHeight(view, i7, z3);
        } else {
            Method method = f7738J;
            if (method != null) {
                try {
                    maxAvailableHeight = ((Integer) method.invoke(rVar, view, Integer.valueOf(i7), Boolean.valueOf(z3))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            maxAvailableHeight = rVar.getMaxAvailableHeight(view, i7);
        }
        int i8 = this.f7751p;
        int i9 = -1;
        if (i8 != -2) {
            if (i8 != -1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            }
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
        }
        int a3 = this.f7750o.a(makeMeasureSpec, maxAvailableHeight);
        if (a3 > 0) {
            i4 = this.f7750o.getPaddingBottom() + this.f7750o.getPaddingTop() + i3;
        } else {
            i4 = 0;
        }
        int i10 = a3 + i4;
        this.f7747H.getInputMethodMode();
        if (Build.VERSION.SDK_INT >= 23) {
            H.l.d(rVar, 1002);
        } else {
            if (!AbstractC0155a.f3596n) {
                try {
                    Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                    AbstractC0155a.f3595m = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused2) {
                }
                AbstractC0155a.f3596n = true;
            }
            Method method2 = AbstractC0155a.f3595m;
            if (method2 != null) {
                try {
                    method2.invoke(rVar, 1002);
                } catch (Exception unused3) {
                }
            }
        }
        if (rVar.isShowing()) {
            View view2 = this.x;
            Field field = C.y.f117a;
            if (!view2.isAttachedToWindow()) {
                return;
            }
            int i11 = this.f7751p;
            if (i11 == -1) {
                i11 = -1;
            } else if (i11 == -2) {
                i11 = this.x.getWidth();
            }
            rVar.setOutsideTouchable(true);
            View view3 = this.x;
            int i12 = this.f7752q;
            int i13 = this.f7753r;
            if (i11 < 0) {
                i5 = -1;
            } else {
                i5 = i11;
            }
            if (i10 >= 0) {
                i9 = i10;
            }
            rVar.update(view3, i12, i13, i5, i9);
            return;
        }
        int i14 = this.f7751p;
        if (i14 == -1) {
            i14 = -1;
        } else if (i14 == -2) {
            i14 = this.x.getWidth();
        }
        rVar.setWidth(i14);
        rVar.setHeight(i10);
        if (Build.VERSION.SDK_INT > 28) {
            rVar.setIsClippedToScreen(true);
        } else {
            Method method3 = f7737I;
            if (method3 != null) {
                try {
                    method3.invoke(rVar, Boolean.TRUE);
                } catch (Exception unused4) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        }
        rVar.setOutsideTouchable(true);
        rVar.setTouchInterceptor(this.f7740A);
        if (this.f7756u) {
            AbstractC0155a.H(rVar, this.f7755t);
        }
        if (Build.VERSION.SDK_INT > 28) {
            rVar.setEpicenterBounds(this.f7745F);
        } else {
            Method method4 = f7739K;
            if (method4 != null) {
                try {
                    method4.invoke(rVar, this.f7745F);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        }
        rVar.showAsDropDown(this.x, this.f7752q, this.f7753r, this.f7757v);
        this.f7750o.setSelection(-1);
        if ((!this.f7746G || this.f7750o.isInTouchMode()) && (m3 = this.f7750o) != null) {
            m3.setListSelectionHidden(true);
            m3.requestLayout();
        }
        if (!this.f7746G) {
            this.f7743D.post(this.f7742C);
        }
    }

    @Override // k.InterfaceC0535q
    public final void dismiss() {
        r rVar = this.f7747H;
        rVar.dismiss();
        rVar.setContentView(null);
        this.f7750o = null;
        this.f7743D.removeCallbacks(this.f7760z);
    }

    @Override // k.InterfaceC0535q
    public final boolean i() {
        return this.f7747H.isShowing();
    }

    @Override // k.InterfaceC0535q
    public final ListView j() {
        return this.f7750o;
    }
}
