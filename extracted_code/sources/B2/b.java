package b2;

import W1.C0128a;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
/* loaded from: classes.dex */
public final class b extends FrameLayout {

    /* renamed from: m  reason: collision with root package name */
    public FlutterMutatorsStack f4687m;

    /* renamed from: n  reason: collision with root package name */
    public final float f4688n;

    /* renamed from: o  reason: collision with root package name */
    public int f4689o;

    /* renamed from: p  reason: collision with root package name */
    public int f4690p;

    /* renamed from: q  reason: collision with root package name */
    public int f4691q;

    /* renamed from: r  reason: collision with root package name */
    public int f4692r;

    /* renamed from: s  reason: collision with root package name */
    public final C0128a f4693s;

    /* renamed from: t  reason: collision with root package name */
    public final Paint f4694t;

    /* renamed from: u  reason: collision with root package name */
    public ViewTreeObserver$OnGlobalFocusChangeListenerC0216a f4695u;

    public b(Activity activity, float f3, C0128a c0128a) {
        super(activity, null);
        this.f4688n = f3;
        this.f4693s = c0128a;
        this.f4694t = new Paint();
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f4687m.getFinalMatrix());
        float f3 = this.f4688n;
        matrix.preScale(1.0f / f3, 1.0f / f3);
        matrix.postTranslate(-this.f4689o, -this.f4690p);
        return matrix;
    }

    public final void a() {
        ViewTreeObserver$OnGlobalFocusChangeListenerC0216a viewTreeObserver$OnGlobalFocusChangeListenerC0216a;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (viewTreeObserver$OnGlobalFocusChangeListenerC0216a = this.f4695u) != null) {
            this.f4695u = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(viewTreeObserver$OnGlobalFocusChangeListenerC0216a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        for (Path path : this.f4687m.getFinalClippingPaths()) {
            Path path2 = new Path(path);
            path2.offset(-this.f4689o, -this.f4690p);
            canvas.clipPath(path2);
        }
        int finalOpacity = (int) (this.f4687m.getFinalOpacity() * 255.0f);
        Paint paint = this.f4694t;
        if (paint.getAlpha() != finalOpacity) {
            paint.setAlpha((int) (this.f4687m.getFinalOpacity() * 255.0f));
            setLayerType(2, paint);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0128a c0128a = this.f4693s;
        if (c0128a == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 2) {
                matrix.postTranslate(this.f4689o, this.f4690p);
            } else {
                matrix.postTranslate(this.f4691q, this.f4692r);
                this.f4691q = this.f4689o;
                this.f4692r = this.f4690p;
            }
        } else {
            int i3 = this.f4689o;
            this.f4691q = i3;
            int i4 = this.f4690p;
            this.f4692r = i4;
            matrix.postTranslate(i3, i4);
        }
        c0128a.d(motionEvent, matrix);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getImportantForAccessibility() == 4) {
            return false;
        }
        return super.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        a();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f4695u == null) {
            ViewTreeObserver$OnGlobalFocusChangeListenerC0216a viewTreeObserver$OnGlobalFocusChangeListenerC0216a = new ViewTreeObserver$OnGlobalFocusChangeListenerC0216a(onFocusChangeListener, this);
            this.f4695u = viewTreeObserver$OnGlobalFocusChangeListenerC0216a;
            viewTreeObserver.addOnGlobalFocusChangeListener(viewTreeObserver$OnGlobalFocusChangeListenerC0216a);
        }
    }
}
