package io.flutter.plugin.platform;

import W1.C0128a;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import b2.ViewTreeObserver$OnGlobalFocusChangeListenerC0216a;
/* loaded from: classes.dex */
public final class g extends FrameLayout {

    /* renamed from: m  reason: collision with root package name */
    public int f6201m;

    /* renamed from: n  reason: collision with root package name */
    public int f6202n;

    /* renamed from: o  reason: collision with root package name */
    public int f6203o;

    /* renamed from: p  reason: collision with root package name */
    public int f6204p;

    /* renamed from: q  reason: collision with root package name */
    public C0128a f6205q;

    /* renamed from: r  reason: collision with root package name */
    public f f6206r;

    /* renamed from: s  reason: collision with root package name */
    public ViewTreeObserver$OnGlobalFocusChangeListenerC0216a f6207s;

    public g(Activity activity) {
        super(activity);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Canvas lockHardwareCanvas;
        f fVar = this.f6206r;
        if (fVar == null) {
            super.draw(canvas);
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Surface surface = fVar.getSurface();
        if (surface.isValid()) {
            lockHardwareCanvas = surface.lockHardwareCanvas();
            if (lockHardwareCanvas == null) {
                invalidate();
                return;
            }
            try {
                lockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                super.draw(lockHardwareCanvas);
                return;
            } finally {
                this.f6206r.scheduleFrame();
                surface.unlockCanvasAndPost(lockHardwareCanvas);
            }
        }
        Log.e("PlatformViewWrapper", "Platform view cannot be composed without a valid RenderTarget surface.");
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.f6207s;
    }

    public int getRenderTargetHeight() {
        f fVar = this.f6206r;
        if (fVar != null) {
            return fVar.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        f fVar = this.f6206r;
        if (fVar != null) {
            return fVar.getWidth();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f6205q == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 2) {
                matrix.postTranslate(this.f6203o, this.f6204p);
            } else {
                matrix.postTranslate(this.f6201m, this.f6202n);
                this.f6201m = this.f6203o;
                this.f6202n = this.f6204p;
            }
        } else {
            int i3 = this.f6203o;
            this.f6201m = i3;
            int i4 = this.f6204p;
            this.f6202n = i4;
            matrix.postTranslate(i3, i4);
        }
        this.f6205q.d(motionEvent, matrix);
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

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        setLayoutParams((ViewGroup.LayoutParams) layoutParams);
        this.f6203o = layoutParams.leftMargin;
        this.f6204p = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        ViewTreeObserver$OnGlobalFocusChangeListenerC0216a viewTreeObserver$OnGlobalFocusChangeListenerC0216a;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (viewTreeObserver$OnGlobalFocusChangeListenerC0216a = this.f6207s) != null) {
            this.f6207s = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(viewTreeObserver$OnGlobalFocusChangeListenerC0216a);
        }
        ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.f6207s == null) {
            ViewTreeObserver$OnGlobalFocusChangeListenerC0216a viewTreeObserver$OnGlobalFocusChangeListenerC0216a2 = new ViewTreeObserver$OnGlobalFocusChangeListenerC0216a(this, onFocusChangeListener);
            this.f6207s = viewTreeObserver$OnGlobalFocusChangeListenerC0216a2;
            viewTreeObserver2.addOnGlobalFocusChangeListener(viewTreeObserver$OnGlobalFocusChangeListenerC0216a2);
        }
    }

    public void setTouchProcessor(C0128a c0128a) {
        this.f6205q = c0128a;
    }
}
