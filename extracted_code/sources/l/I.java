package l;

import android.os.Handler;
import android.widget.AbsListView;
/* loaded from: classes.dex */
public final class I implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ K f7735a;

    public I(K k3) {
        this.f7735a = k3;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i3) {
        if (i3 == 1) {
            K k3 = this.f7735a;
            if (k3.f7747H.getInputMethodMode() != 2 && k3.f7747H.getContentView() != null) {
                Handler handler = k3.f7743D;
                H h3 = k3.f7760z;
                handler.removeCallbacks(h3);
                h3.run();
            }
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i3, int i4, int i5) {
    }
}
