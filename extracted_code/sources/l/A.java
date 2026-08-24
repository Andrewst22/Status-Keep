package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.example.flutter_application_1.R;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public abstract class A extends ListView {

    /* renamed from: m  reason: collision with root package name */
    public final Rect f7701m;

    /* renamed from: n  reason: collision with root package name */
    public int f7702n;

    /* renamed from: o  reason: collision with root package name */
    public int f7703o;

    /* renamed from: p  reason: collision with root package name */
    public int f7704p;

    /* renamed from: q  reason: collision with root package name */
    public int f7705q;

    /* renamed from: r  reason: collision with root package name */
    public int f7706r;

    /* renamed from: s  reason: collision with root package name */
    public final Field f7707s;

    /* renamed from: t  reason: collision with root package name */
    public C0587z f7708t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f7709u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f7710v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f7711w;
    public H.g x;

    /* renamed from: y  reason: collision with root package name */
    public H.b f7712y;

    public A(Context context, boolean z3) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f7701m = new Rect();
        this.f7702n = 0;
        this.f7703o = 0;
        this.f7704p = 0;
        this.f7705q = 0;
        this.f7710v = z3;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f7707s = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    public final int a(int i3, int i4) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i5 = listPaddingTop + listPaddingBottom;
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        View view = null;
        int i6 = 0;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            if (i8 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i3, makeMeasureSpec);
            view.forceLayout();
            if (i7 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i4) {
                return i4;
            }
        }
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r3 != 3) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int r17, android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.A.b(int, android.view.MotionEvent):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f7701m;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f7712y != null) {
            return;
        }
        super.drawableStateChanged();
        C0587z c0587z = this.f7708t;
        if (c0587z != null) {
            c0587z.f7964n = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f7711w && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (!this.f7710v && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (!this.f7710v && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (!this.f7710v && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if ((this.f7710v && this.f7709u) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f7712y = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f7712y == null) {
            H.b bVar = new H.b(this, 6);
            this.f7712y = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                Drawable selector = getSelector();
                if (selector != null && this.f7711w && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f7706r = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        H.b bVar = this.f7712y;
        if (bVar != null) {
            A a3 = (A) bVar.f402n;
            a3.f7712y = null;
            a3.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z3) {
        this.f7709u = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.graphics.drawable.Drawable$Callback, l.z, android.graphics.drawable.Drawable] */
    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0587z c0587z = null;
        if (drawable != 0) {
            ?? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.f7963m;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.f7963m = drawable;
            drawable.setCallback(drawable2);
            drawable2.f7964n = true;
            c0587z = drawable2;
        }
        this.f7708t = c0587z;
        super.setSelector(c0587z);
        Rect rect = new Rect();
        if (drawable != 0) {
            drawable.getPadding(rect);
        }
        this.f7702n = rect.left;
        this.f7703o = rect.top;
        this.f7704p = rect.right;
        this.f7705q = rect.bottom;
    }
}
