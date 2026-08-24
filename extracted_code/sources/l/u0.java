package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.example.flutter_application_1.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class u0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: j  reason: collision with root package name */
    public static u0 f7927j;

    /* renamed from: k  reason: collision with root package name */
    public static u0 f7928k;

    /* renamed from: a  reason: collision with root package name */
    public final View f7929a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f7930b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7931c;

    /* renamed from: d  reason: collision with root package name */
    public final t0 f7932d = new t0(this, 0);

    /* renamed from: e  reason: collision with root package name */
    public final t0 f7933e = new t0(this, 1);

    /* renamed from: f  reason: collision with root package name */
    public int f7934f;

    /* renamed from: g  reason: collision with root package name */
    public int f7935g;

    /* renamed from: h  reason: collision with root package name */
    public v0 f7936h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7937i;

    public u0(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f7929a = view;
        this.f7930b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = C.C.f59a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = C.A.a(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f7931c = scaledTouchSlop;
        this.f7934f = Integer.MAX_VALUE;
        this.f7935g = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(u0 u0Var) {
        u0 u0Var2 = f7927j;
        if (u0Var2 != null) {
            u0Var2.f7929a.removeCallbacks(u0Var2.f7932d);
        }
        f7927j = u0Var;
        if (u0Var != null) {
            u0Var.f7929a.postDelayed(u0Var.f7932d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        u0 u0Var = f7928k;
        View view = this.f7929a;
        if (u0Var == this) {
            f7928k = null;
            v0 v0Var = this.f7936h;
            if (v0Var != null) {
                View view2 = (View) v0Var.f7951b;
                if (view2.getParent() != null) {
                    ((WindowManager) v0Var.f7950a.getSystemService("window")).removeView(view2);
                }
                this.f7936h = null;
                this.f7934f = Integer.MAX_VALUE;
                this.f7935g = Integer.MAX_VALUE;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f7927j == this) {
            b(null);
        }
        view.removeCallbacks(this.f7933e);
    }

    public final void c(boolean z3) {
        int height;
        int i3;
        int i4;
        String str;
        int i5;
        String str2;
        int i6;
        long longPressTimeout;
        long j3;
        long j4;
        Field field = C.y.f117a;
        View view = this.f7929a;
        if (!view.isAttachedToWindow()) {
            return;
        }
        b(null);
        u0 u0Var = f7928k;
        if (u0Var != null) {
            u0Var.a();
        }
        f7928k = this;
        this.f7937i = z3;
        v0 v0Var = new v0(view.getContext());
        this.f7936h = v0Var;
        int i7 = this.f7934f;
        int i8 = this.f7935g;
        boolean z4 = this.f7937i;
        View view2 = (View) v0Var.f7951b;
        ViewParent parent = view2.getParent();
        Context context = v0Var.f7950a;
        if (parent != null && view2.getParent() != null) {
            ((WindowManager) context.getSystemService("window")).removeView(view2);
        }
        ((TextView) v0Var.f7952c).setText(this.f7930b);
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) v0Var.f7953d;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i7 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i8 + dimensionPixelOffset2;
            i3 = i8 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = context.getResources();
        if (z4) {
            i4 = R.dimen.tooltip_y_offset_touch;
        } else {
            i4 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i4);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context2 = view.getContext();
            while (true) {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                } else if (context2 instanceof Activity) {
                    rootView = ((Activity) context2).getWindow().getDecorView();
                    break;
                } else {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            str2 = "window";
        } else {
            Rect rect = (Rect) v0Var.f7954e;
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left >= 0 || rect.top >= 0) {
                str = "window";
                i5 = 0;
            } else {
                Resources resources2 = context.getResources();
                str = "window";
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i6 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i6 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i5 = 0;
                rect.set(0, i6, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            int[] iArr = (int[]) v0Var.f7956g;
            rootView.getLocationOnScreen(iArr);
            int[] iArr2 = (int[]) v0Var.f7955f;
            view.getLocationOnScreen(iArr2);
            int i9 = iArr2[i5] - iArr[i5];
            iArr2[i5] = i9;
            iArr2[1] = iArr2[1] - iArr[1];
            layoutParams.x = (i9 + i7) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, i5);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i10 = iArr2[1];
            int i11 = ((i3 + i10) - dimensionPixelOffset3) - measuredHeight;
            int i12 = i10 + height + dimensionPixelOffset3;
            if (z4) {
                if (i11 >= 0) {
                    layoutParams.y = i11;
                } else {
                    layoutParams.y = i12;
                }
            } else if (measuredHeight + i12 <= rect.height()) {
                layoutParams.y = i12;
            } else {
                layoutParams.y = i11;
            }
            str2 = str;
        }
        ((WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
        view.addOnAttachStateChangeListener(this);
        if (this.f7937i) {
            j4 = 2500;
        } else {
            if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j3 = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j3 = 15000;
            }
            j4 = j3 - longPressTimeout;
        }
        t0 t0Var = this.f7933e;
        view.removeCallbacks(t0Var);
        view.postDelayed(t0Var, j4);
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f7936h != null && this.f7937i) {
            return false;
        }
        View view2 = this.f7929a;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f7934f = Integer.MAX_VALUE;
                this.f7935g = Integer.MAX_VALUE;
                a();
            }
        } else if (view2.isEnabled() && this.f7936h == null) {
            int x = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int abs = Math.abs(x - this.f7934f);
            int i3 = this.f7931c;
            if (abs > i3 || Math.abs(y3 - this.f7935g) > i3) {
                this.f7934f = x;
                this.f7935g = y3;
                b(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f7934f = view.getWidth() / 2;
        this.f7935g = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
