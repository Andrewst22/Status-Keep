package i1;

import C.C0001b;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: i1.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295F extends C0001b {

    /* renamed from: d  reason: collision with root package name */
    public final C0296G f5967d;

    public C0295F(C0296G c0296g) {
        this.f5967d = c0296g;
    }

    @Override // C.C0001b
    public final void b(View view, D.l lVar) {
        this.f89a.onInitializeAccessibilityNodeInfo(view, lVar.f179a);
        C0296G c0296g = this.f5967d;
        if (!c0296g.f5968d.l()) {
            RecyclerView recyclerView = c0296g.f5968d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().getClass();
                RecyclerView.j(view);
            }
        }
    }

    @Override // C.C0001b
    public final boolean c(View view, int i3, Bundle bundle) {
        if (super.c(view, i3, bundle)) {
            return true;
        }
        C0296G c0296g = this.f5967d;
        if (!c0296g.f5968d.l()) {
            RecyclerView recyclerView = c0296g.f5968d;
            if (recyclerView.getLayoutManager() != null) {
                z zVar = recyclerView.getLayoutManager().f6053b.f4466m;
            }
        }
        return false;
    }
}
