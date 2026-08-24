package i1;

import C.C0001b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
/* renamed from: i1.G  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296G extends C0001b {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f5968d;

    public C0296G(RecyclerView recyclerView) {
        this.f5968d = recyclerView;
        new C0295F(this);
    }

    @Override // C.C0001b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !this.f5968d.l()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().A(accessibilityEvent);
            }
        }
    }

    @Override // C.C0001b
    public final void b(View view, D.l lVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f89a;
        AccessibilityNodeInfo accessibilityNodeInfo = lVar.f179a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = this.f5968d;
        if (!recyclerView.l() && recyclerView.getLayoutManager() != null) {
            t layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f6053b;
            z zVar = recyclerView2.f4466m;
            if (recyclerView2.canScrollVertically(-1) || layoutManager.f6053b.canScrollHorizontally(-1)) {
                accessibilityNodeInfo.addAction(8192);
                accessibilityNodeInfo.setScrollable(true);
            }
            if (layoutManager.f6053b.canScrollVertically(1) || layoutManager.f6053b.canScrollHorizontally(1)) {
                accessibilityNodeInfo.addAction(4096);
                accessibilityNodeInfo.setScrollable(true);
            }
            C0292C c0292c = recyclerView2.f4463j0;
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.x(zVar, c0292c), layoutManager.q(zVar, c0292c), false, 0));
        }
    }

    @Override // C.C0001b
    public final boolean c(View view, int i3, Bundle bundle) {
        int i4;
        int s3;
        if (super.c(view, i3, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f5968d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        t layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f6053b;
        z zVar = recyclerView2.f4466m;
        if (i3 != 4096) {
            if (i3 != 8192) {
                s3 = 0;
                i4 = 0;
            } else {
                if (recyclerView2.canScrollVertically(-1)) {
                    i4 = -((layoutManager.f6058g - layoutManager.u()) - layoutManager.r());
                } else {
                    i4 = 0;
                }
                if (layoutManager.f6053b.canScrollHorizontally(-1)) {
                    s3 = -((layoutManager.f6057f - layoutManager.s()) - layoutManager.t());
                }
                s3 = 0;
            }
        } else {
            if (recyclerView2.canScrollVertically(1)) {
                i4 = (layoutManager.f6058g - layoutManager.u()) - layoutManager.r();
            } else {
                i4 = 0;
            }
            if (layoutManager.f6053b.canScrollHorizontally(1)) {
                s3 = (layoutManager.f6057f - layoutManager.s()) - layoutManager.t();
            }
            s3 = 0;
        }
        if (i4 == 0 && s3 == 0) {
            return false;
        }
        layoutManager.f6053b.r(s3, i4);
        return true;
    }
}
