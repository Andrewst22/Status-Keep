package H;

import C.C0001b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
/* loaded from: classes.dex */
public final class h extends C0001b {
    @Override // C.C0001b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        boolean z3;
        super.a(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        if (nestedScrollView.getScrollRange() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        accessibilityEvent.setScrollable(z3);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    @Override // C.C0001b
    public final void b(View view, D.l lVar) {
        int scrollRange;
        View.AccessibilityDelegate accessibilityDelegate = this.f89a;
        AccessibilityNodeInfo accessibilityNodeInfo = lVar.f179a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityNodeInfo.setClassName("android.widget.ScrollView");
        if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
            accessibilityNodeInfo.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) D.e.f173d.f176a);
                accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) D.e.f174e.f176a);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) D.e.f172c.f176a);
                accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) D.e.f175f.f176a);
            }
        }
    }

    @Override // C.C0001b
    public final boolean c(View view, int i3, Bundle bundle) {
        if (super.c(view, i3, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        Rect rect = new Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i3 != 4096) {
            if (i3 != 8192 && i3 != 16908344) {
                if (i3 != 16908346) {
                    return false;
                }
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.t(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                return true;
            }
        }
        int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.t(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
        return true;
    }
}
