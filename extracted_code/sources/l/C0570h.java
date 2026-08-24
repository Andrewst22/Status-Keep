package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.example.flutter_application_1.R;
import k.View$OnTouchListenerC0519a;
import w.AbstractC0880a;
/* renamed from: l.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0570h extends C0579q implements InterfaceC0572j {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ C0571i f7814o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0570h(C0571i c0571i, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f7814o = c0571i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        android.support.v4.media.session.a.S(this, getContentDescription());
        setOnTouchListener(new View$OnTouchListenerC0519a(this, this));
    }

    @Override // l.InterfaceC0572j
    public final boolean a() {
        return false;
    }

    @Override // l.InterfaceC0572j
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f7814o.j();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i3, int i4, int i5, int i6) {
        boolean frame = super.setFrame(i3, i4, i5, i6);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AbstractC0880a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
