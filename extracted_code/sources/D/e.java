package D;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f172c;

    /* renamed from: d  reason: collision with root package name */
    public static final e f173d;

    /* renamed from: e  reason: collision with root package name */
    public static final e f174e;

    /* renamed from: f  reason: collision with root package name */
    public static final e f175f;

    /* renamed from: a  reason: collision with root package name */
    public final Object f176a;

    /* renamed from: b  reason: collision with root package name */
    public final int f177b;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
        new e(null, 1, null);
        new e(null, 2, null);
        new e(null, 4, null);
        new e(null, 8, null);
        new e(null, 16, null);
        new e(null, 32, null);
        new e(null, 64, null);
        new e(null, 128, null);
        new e(null, 256, m.class);
        new e(null, 512, m.class);
        new e(null, 1024, n.class);
        new e(null, 2048, n.class);
        f172c = new e(null, 4096, null);
        f173d = new e(null, 8192, null);
        new e(null, 16384, null);
        new e(null, 32768, null);
        new e(null, 65536, null);
        new e(null, 131072, r.class);
        new e(null, 262144, null);
        new e(null, 524288, null);
        new e(null, 1048576, null);
        new e(null, 2097152, s.class);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        } else {
            accessibilityAction = null;
        }
        new e(accessibilityAction, 16908342, null);
        if (i3 >= 23) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        } else {
            accessibilityAction2 = null;
        }
        new e(accessibilityAction2, 16908343, p.class);
        if (i3 >= 23) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        } else {
            accessibilityAction3 = null;
        }
        f174e = new e(accessibilityAction3, 16908344, null);
        if (i3 >= 23) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
        } else {
            accessibilityAction4 = null;
        }
        new e(accessibilityAction4, 16908345, null);
        if (i3 >= 23) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
        } else {
            accessibilityAction5 = null;
        }
        f175f = new e(accessibilityAction5, 16908346, null);
        if (i3 >= 23) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        } else {
            accessibilityAction6 = null;
        }
        new e(accessibilityAction6, 16908347, null);
        if (i3 >= 29) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction7 = null;
        }
        new e(accessibilityAction7, 16908358, null);
        if (i3 >= 29) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction8 = null;
        }
        new e(accessibilityAction8, 16908359, null);
        if (i3 >= 29) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction9 = null;
        }
        new e(accessibilityAction9, 16908360, null);
        if (i3 >= 29) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        } else {
            accessibilityAction10 = null;
        }
        new e(accessibilityAction10, 16908361, null);
        if (i3 >= 23) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
        } else {
            accessibilityAction11 = null;
        }
        new e(accessibilityAction11, 16908348, null);
        if (i3 >= 24) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        } else {
            accessibilityAction12 = null;
        }
        new e(accessibilityAction12, 16908349, q.class);
        if (i3 >= 26) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction13 = null;
        }
        new e(accessibilityAction13, 16908354, o.class);
        if (i3 >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction14 = null;
        }
        new e(accessibilityAction14, 16908356, null);
        if (i3 >= 28) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        } else {
            accessibilityAction15 = null;
        }
        new e(accessibilityAction15, 16908357, null);
        if (i3 >= 30) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction16 = null;
        }
        new e(accessibilityAction16, 16908362, null);
        if (i3 >= 30) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        } else {
            accessibilityAction17 = null;
        }
        new e(accessibilityAction17, 16908372, null);
        if (i3 >= 32) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction18 = null;
        }
        new e(accessibilityAction18, 16908373, null);
        if (i3 >= 32) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction19 = null;
        }
        new e(accessibilityAction19, 16908374, null);
        if (i3 >= 32) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        } else {
            accessibilityAction20 = null;
        }
        new e(accessibilityAction20, 16908375, null);
        if (i3 >= 33) {
            accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        } else {
            accessibilityAction21 = null;
        }
        new e(accessibilityAction21, 16908376, null);
        if (i3 >= 34) {
            accessibilityAction22 = j.a();
        } else {
            accessibilityAction22 = null;
        }
        new e(accessibilityAction22, 16908382, null);
    }

    public e(Object obj, int i3, Class cls) {
        this.f177b = i3;
        if (obj == null) {
            this.f176a = new AccessibilityNodeInfo.AccessibilityAction(i3, null);
        } else {
            this.f176a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        Object obj2 = ((e) obj).f176a;
        Object obj3 = this.f176a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        } else if (!obj3.equals(obj2)) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        Object obj = this.f176a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String b3 = l.b(this.f177b);
        if (b3.equals("ACTION_UNKNOWN")) {
            Object obj = this.f176a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                b3 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(b3);
        return sb.toString();
    }
}
