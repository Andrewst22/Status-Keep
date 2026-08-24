package g;

import android.graphics.drawable.Drawable;
import l1.C0595d;
/* loaded from: classes.dex */
public final class f implements Drawable.Callback {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f5685m = 0;

    /* renamed from: n  reason: collision with root package name */
    public Object f5686n;

    public /* synthetic */ f() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f5685m) {
            case 0:
                return;
            default:
                ((C0595d) this.f5686n).invalidateSelf();
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f5685m) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f5686n;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
            default:
                ((C0595d) this.f5686n).scheduleSelf(runnable, j3);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f5685m) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f5686n;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            default:
                ((C0595d) this.f5686n).unscheduleSelf(runnable);
                return;
        }
    }

    public f(C0595d c0595d) {
        this.f5686n = c0595d;
    }

    private final void a(Drawable drawable) {
    }
}
