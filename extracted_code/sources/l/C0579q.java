package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageView;
/* renamed from: l.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0579q extends ImageView {

    /* renamed from: m  reason: collision with root package name */
    public final C0576n f7891m;

    /* renamed from: n  reason: collision with root package name */
    public final B1.e f7892n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0579q(Context context, int i3) {
        super(context, null, i3);
        k0.a(context);
        C0576n c0576n = new C0576n(this);
        this.f7891m = c0576n;
        c0576n.b(null, i3);
        B1.e eVar = new B1.e(this, 17);
        this.f7892n = eVar;
        eVar.k0(i3);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0576n c0576n = this.f7891m;
        if (c0576n != null) {
            c0576n.a();
        }
        B1.e eVar = this.f7892n;
        if (eVar != null) {
            eVar.Q();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        l0 l0Var;
        C0576n c0576n = this.f7891m;
        if (c0576n == null || (l0Var = (l0) c0576n.f7877e) == null) {
            return null;
        }
        return l0Var.f7866a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        l0 l0Var;
        C0576n c0576n = this.f7891m;
        if (c0576n == null || (l0Var = (l0) c0576n.f7877e) == null) {
            return null;
        }
        return l0Var.f7867b;
    }

    public ColorStateList getSupportImageTintList() {
        l0 l0Var;
        B1.e eVar = this.f7892n;
        if (eVar == null || (l0Var = (l0) eVar.f57o) == null) {
            return null;
        }
        return l0Var.f7866a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        l0 l0Var;
        B1.e eVar = this.f7892n;
        if (eVar == null || (l0Var = (l0) eVar.f57o) == null) {
            return null;
        }
        return l0Var.f7867b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.f7892n.f56n).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0576n c0576n = this.f7891m;
        if (c0576n != null) {
            c0576n.f7873a = -1;
            c0576n.d(null);
            c0576n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0576n c0576n = this.f7891m;
        if (c0576n != null) {
            c0576n.c(i3);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        B1.e eVar = this.f7892n;
        if (eVar != null) {
            eVar.Q();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        B1.e eVar = this.f7892n;
        if (eVar != null) {
            eVar.Q();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i3) {
        B1.e eVar = this.f7892n;
        if (eVar != null) {
            ImageView imageView = (ImageView) eVar.f56n;
            if (i3 != 0) {
                Drawable c3 = f.b.c(imageView.getContext(), i3);
                if (c3 != null) {
                    AbstractC0586y.b(c3);
                }
                imageView.setImageDrawable(c3);
            } else {
                imageView.setImageDrawable(null);
            }
            eVar.Q();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        B1.e eVar = this.f7892n;
        if (eVar != null) {
            eVar.Q();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0576n c0576n = this.f7891m;
        if (c0576n != null) {
            c0576n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0576n c0576n = this.f7891m;
        if (c0576n != null) {
            c0576n.f(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        B1.e eVar = this.f7892n;
        if (eVar != null) {
            if (((l0) eVar.f57o) == null) {
                eVar.f57o = new Object();
            }
            l0 l0Var = (l0) eVar.f57o;
            l0Var.f7866a = colorStateList;
            l0Var.f7869d = true;
            eVar.Q();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        B1.e eVar = this.f7892n;
        if (eVar != null) {
            if (((l0) eVar.f57o) == null) {
                eVar.f57o = new Object();
            }
            l0 l0Var = (l0) eVar.f57o;
            l0Var.f7867b = mode;
            l0Var.f7868c = true;
            eVar.Q();
        }
    }
}
