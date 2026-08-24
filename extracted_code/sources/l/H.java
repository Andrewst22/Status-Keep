package l;

import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class H implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f7733m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ K f7734n;

    public /* synthetic */ H(K k3, int i3) {
        this.f7733m = i3;
        this.f7734n = k3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K k3 = this.f7734n;
        switch (this.f7733m) {
            case 0:
                M m3 = k3.f7750o;
                if (m3 != null) {
                    m3.setListSelectionHidden(true);
                    m3.requestLayout();
                    return;
                }
                return;
            default:
                M m4 = k3.f7750o;
                if (m4 != null) {
                    Field field = C.y.f117a;
                    if (m4.isAttachedToWindow() && k3.f7750o.getCount() > k3.f7750o.getChildCount() && k3.f7750o.getChildCount() <= Integer.MAX_VALUE) {
                        k3.f7747H.setInputMethodMode(2);
                        k3.d();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
