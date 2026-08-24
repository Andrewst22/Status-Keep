package C;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
/* renamed from: C.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnApplyWindowInsetsListenerC0015p implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public S f115a = null;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f116b;

    public View$OnApplyWindowInsetsListenerC0015p(View view, InterfaceC0010k interfaceC0010k) {
        this.f116b = view;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        S a3 = S.a(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            AbstractC0016q.a(windowInsets, this.f116b);
            if (a3.equals(this.f115a)) {
                throw null;
            }
        }
        this.f115a = a3;
        throw null;
    }
}
