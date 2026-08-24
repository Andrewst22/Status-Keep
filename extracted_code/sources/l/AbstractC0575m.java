package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.example.flutter_application_1.R;
/* renamed from: l.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0575m extends AutoCompleteTextView {

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f7870o = {16843126};

    /* renamed from: m  reason: collision with root package name */
    public final C0576n f7871m;

    /* renamed from: n  reason: collision with root package name */
    public final C0580s f7872n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0575m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        k0.a(context);
        B1.e n02 = B1.e.n0(getContext(), attributeSet, f7870o, R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) n02.f57o).hasValue(0)) {
            setDropDownBackgroundDrawable(n02.b0(0));
        }
        n02.r0();
        C0576n c0576n = new C0576n(this);
        this.f7871m = c0576n;
        c0576n.b(attributeSet, R.attr.autoCompleteTextViewStyle);
        C0580s c0580s = new C0580s(this);
        this.f7872n = c0580s;
        c0580s.d(attributeSet, R.attr.autoCompleteTextViewStyle);
        c0580s.b();
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0576n c0576n = this.f7871m;
        if (c0576n != null) {
            c0576n.a();
        }
        C0580s c0580s = this.f7872n;
        if (c0580s != null) {
            c0580s.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        l0 l0Var;
        C0576n c0576n = this.f7871m;
        if (c0576n == null || (l0Var = (l0) c0576n.f7877e) == null) {
            return null;
        }
        return l0Var.f7866a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        l0 l0Var;
        C0576n c0576n = this.f7871m;
        if (c0576n == null || (l0Var = (l0) c0576n.f7877e) == null) {
            return null;
        }
        return l0Var.f7867b;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0576n c0576n = this.f7871m;
        if (c0576n != null) {
            c0576n.f7873a = -1;
            c0576n.d(null);
            c0576n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0576n c0576n = this.f7871m;
        if (c0576n != null) {
            c0576n.c(i3);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.support.v4.media.session.a.Z(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i3) {
        setDropDownBackgroundDrawable(f.b.c(getContext(), i3));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0576n c0576n = this.f7871m;
        if (c0576n != null) {
            c0576n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0576n c0576n = this.f7871m;
        if (c0576n != null) {
            c0576n.f(mode);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C0580s c0580s = this.f7872n;
        if (c0580s != null) {
            c0580s.e(context, i3);
        }
    }
}
