package C;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.example.flutter_application_1.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
/* renamed from: C.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0001b {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f88c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f89a = f88c;

    /* renamed from: b  reason: collision with root package name */
    public final C0000a f90b = new C0000a(this);

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f89a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, D.l lVar) {
        this.f89a.onInitializeAccessibilityNodeInfo(view, lVar.f179a);
    }

    public boolean c(View view, int i3, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        ClickableSpan[] clickableSpanArr;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z3 = false;
        for (int i4 = 0; i4 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((D.e) list.get(i4)).f176a).getId() != i3; i4++) {
        }
        boolean performAccessibilityAction = this.f89a.performAccessibilityAction(view, i3, bundle);
        if (!performAccessibilityAction && i3 == R.id.accessibility_action_clickable_span && bundle != null) {
            int i5 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i5)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                } else {
                    clickableSpanArr = null;
                }
                int i6 = 0;
                while (true) {
                    if (clickableSpanArr == null || i6 >= clickableSpanArr.length) {
                        break;
                    } else if (clickableSpan.equals(clickableSpanArr[i6])) {
                        clickableSpan.onClick(view);
                        z3 = true;
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            return z3;
        }
        return performAccessibilityAction;
    }
}
