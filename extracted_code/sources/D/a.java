package D;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f169a;

    /* renamed from: b  reason: collision with root package name */
    public final l f170b;

    /* renamed from: c  reason: collision with root package name */
    public final int f171c;

    public a(int i3, l lVar, int i4) {
        this.f169a = i3;
        this.f170b = lVar;
        this.f171c = i4;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f169a);
        this.f170b.f179a.performAction(this.f171c, bundle);
    }
}
