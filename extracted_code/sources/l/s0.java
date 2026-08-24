package l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
/* loaded from: classes.dex */
public final class s0 implements InterfaceC0585x {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f7908a;

    /* renamed from: b  reason: collision with root package name */
    public int f7909b;

    /* renamed from: c  reason: collision with root package name */
    public View f7910c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f7911d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f7912e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f7913f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7914g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f7915h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f7916i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f7917j;

    /* renamed from: k  reason: collision with root package name */
    public Window.Callback f7918k;

    /* renamed from: l  reason: collision with root package name */
    public int f7919l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f7920m;

    public final void a(int i3) {
        View view;
        int i4 = this.f7909b ^ i3;
        this.f7909b = i3;
        if (i4 != 0) {
            if ((i4 & 4) != 0) {
                if ((i3 & 4) != 0) {
                    b();
                }
                int i5 = this.f7909b & 4;
                Toolbar toolbar = this.f7908a;
                if (i5 != 0) {
                    Drawable drawable = this.f7913f;
                    if (drawable == null) {
                        drawable = this.f7920m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i4 & 3) != 0) {
                c();
            }
            int i6 = i4 & 8;
            Toolbar toolbar2 = this.f7908a;
            if (i6 != 0) {
                if ((i3 & 8) != 0) {
                    toolbar2.setTitle(this.f7915h);
                    toolbar2.setSubtitle(this.f7916i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i4 & 16) != 0 && (view = this.f7910c) != null) {
                if ((i3 & 16) != 0) {
                    toolbar2.addView(view);
                } else {
                    toolbar2.removeView(view);
                }
            }
        }
    }

    public final void b() {
        if ((this.f7909b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f7917j);
            Toolbar toolbar = this.f7908a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f7919l);
            } else {
                toolbar.setNavigationContentDescription(this.f7917j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i3 = this.f7909b;
        if ((i3 & 2) != 0) {
            if ((i3 & 1) != 0) {
                drawable = this.f7912e;
                if (drawable == null) {
                    drawable = this.f7911d;
                }
            } else {
                drawable = this.f7911d;
            }
        } else {
            drawable = null;
        }
        this.f7908a.setLogo(drawable);
    }
}
