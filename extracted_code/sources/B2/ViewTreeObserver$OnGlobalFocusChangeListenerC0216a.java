package b2;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import g0.C0271b;
import io.flutter.plugin.platform.g;
import m2.AbstractC0635d;
/* renamed from: b2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnGlobalFocusChangeListenerC0216a implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4684a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View.OnFocusChangeListener f4685b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f4686c;

    public ViewTreeObserver$OnGlobalFocusChangeListenerC0216a(View.OnFocusChangeListener onFocusChangeListener, b bVar) {
        this.f4685b = onFocusChangeListener;
        this.f4686c = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.f4684a) {
            case 0:
                b bVar = (b) this.f4686c;
                this.f4685b.onFocusChange(bVar, AbstractC0635d.y(bVar, new C0271b(8)));
                return;
            default:
                C0271b c0271b = new C0271b(8);
                g gVar = (g) this.f4686c;
                this.f4685b.onFocusChange(gVar, AbstractC0635d.y(gVar, c0271b));
                return;
        }
    }

    public ViewTreeObserver$OnGlobalFocusChangeListenerC0216a(g gVar, View.OnFocusChangeListener onFocusChangeListener) {
        this.f4686c = gVar;
        this.f4685b = onFocusChangeListener;
    }
}
