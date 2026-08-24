package k;

import android.widget.PopupWindow;
/* renamed from: k.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0530l implements PopupWindow.OnDismissListener {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ C0531m f7465m;

    public C0530l(C0531m c0531m) {
        this.f7465m = c0531m;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f7465m.c();
    }
}
