package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.example.flutter_application_1.R;
@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: m  reason: collision with root package name */
    public final int f4117m;

    /* renamed from: n  reason: collision with root package name */
    public final int f4118n;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4117m = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
        this.f4118n = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f4117m * 2), this.f4118n), 1073741824), i4);
    }
}
