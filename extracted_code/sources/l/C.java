package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import k.View$OnTouchListenerC0519a;
/* loaded from: classes.dex */
public final class C implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f7713m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ View$OnTouchListenerC0519a f7714n;

    public /* synthetic */ C(View$OnTouchListenerC0519a view$OnTouchListenerC0519a, int i3) {
        this.f7713m = i3;
        this.f7714n = view$OnTouchListenerC0519a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7713m) {
            case 0:
                ViewParent parent = this.f7714n.f7372d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                View$OnTouchListenerC0519a view$OnTouchListenerC0519a = this.f7714n;
                view$OnTouchListenerC0519a.a();
                View view = view$OnTouchListenerC0519a.f7372d;
                if (view.isEnabled() && !view.isLongClickable() && view$OnTouchListenerC0519a.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    view$OnTouchListenerC0519a.f7375g = true;
                    return;
                }
                return;
        }
    }
}
