package l;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
/* loaded from: classes.dex */
public final class f0 extends TouchDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final View f7802a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f7803b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f7804c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f7805d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7806e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7807f;

    public f0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f7806e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f7803b = rect3;
        Rect rect4 = new Rect();
        this.f7805d = rect4;
        Rect rect5 = new Rect();
        this.f7804c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i3 = -scaledTouchSlop;
        rect4.inset(i3, i3);
        rect5.set(rect2);
        this.f7802a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z4;
        int x = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z5 = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action == 3) {
                    z4 = this.f7807f;
                    this.f7807f = false;
                }
                z3 = true;
                z5 = false;
            } else {
                z4 = this.f7807f;
                if (z4 && !this.f7805d.contains(x, y3)) {
                    z5 = z4;
                    z3 = false;
                }
            }
            z5 = z4;
            z3 = true;
        } else {
            if (this.f7803b.contains(x, y3)) {
                this.f7807f = true;
                z3 = true;
            }
            z3 = true;
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        Rect rect = this.f7804c;
        View view = this.f7802a;
        if (z3 && !rect.contains(x, y3)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x - rect.left, y3 - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
