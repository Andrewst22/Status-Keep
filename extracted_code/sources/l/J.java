package l;

import android.view.MotionEvent;
import android.view.View;
/* loaded from: classes.dex */
public final class J implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ K f7736a;

    public J(K k3) {
        this.f7736a = k3;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        r rVar;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        K k3 = this.f7736a;
        if (action == 0 && (rVar = k3.f7747H) != null && rVar.isShowing() && x >= 0 && x < k3.f7747H.getWidth() && y3 >= 0 && y3 < k3.f7747H.getHeight()) {
            k3.f7743D.postDelayed(k3.f7760z, 250L);
            return false;
        } else if (action == 1) {
            k3.f7743D.removeCallbacks(k3.f7760z);
            return false;
        } else {
            return false;
        }
    }
}
