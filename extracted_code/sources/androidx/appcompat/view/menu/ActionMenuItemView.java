package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import e.AbstractC0259a;
import k.AbstractC0520b;
import k.InterfaceC0526h;
import k.InterfaceC0534p;
import k.MenuC0527i;
import k.MenuItemC0528j;
import k.View$OnTouchListenerC0519a;
import l.C0581t;
import l.InterfaceC0572j;
/* loaded from: classes.dex */
public class ActionMenuItemView extends C0581t implements InterfaceC0534p, View.OnClickListener, InterfaceC0572j {

    /* renamed from: A  reason: collision with root package name */
    public final int f3903A;

    /* renamed from: q  reason: collision with root package name */
    public MenuItemC0528j f3904q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f3905r;

    /* renamed from: s  reason: collision with root package name */
    public Drawable f3906s;

    /* renamed from: t  reason: collision with root package name */
    public InterfaceC0526h f3907t;

    /* renamed from: u  reason: collision with root package name */
    public View$OnTouchListenerC0519a f3908u;

    /* renamed from: v  reason: collision with root package name */
    public AbstractC0520b f3909v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3910w;
    public boolean x;

    /* renamed from: y  reason: collision with root package name */
    public final int f3911y;

    /* renamed from: z  reason: collision with root package name */
    public int f3912z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f3910w = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0259a.f5194c, 0, 0);
        this.f3911y = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f3903A = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f3912z = -1;
        setSaveEnabled(false);
    }

    @Override // l.InterfaceC0572j
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // k.InterfaceC0534p
    public final void b(MenuItemC0528j menuItemC0528j) {
        int i3;
        this.f3904q = menuItemC0528j;
        setIcon(menuItemC0528j.getIcon());
        setTitle(menuItemC0528j.getTitleCondensed());
        setId(menuItemC0528j.f7439a);
        if (menuItemC0528j.isVisible()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        setVisibility(i3);
        setEnabled(menuItemC0528j.isEnabled());
        if (menuItemC0528j.hasSubMenu() && this.f3908u == null) {
            this.f3908u = new View$OnTouchListenerC0519a(this);
        }
    }

    @Override // l.InterfaceC0572j
    public final boolean c() {
        if (!TextUtils.isEmpty(getText()) && this.f3904q.getIcon() == null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (i3 < 480 && ((i3 < 640 || i4 < 480) && configuration.orientation != 2)) {
            return false;
        }
        return true;
    }

    public final void f() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(this.f3905r);
        if (this.f3906s != null && ((this.f3904q.f7462y & 4) != 4 || (!this.f3910w && !this.x))) {
            z3 = false;
        }
        boolean z5 = z4 & z3;
        CharSequence charSequence3 = null;
        if (z5) {
            charSequence = this.f3905r;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.f3904q.f7455q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z5) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f3904q.f7443e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.f3904q.f7456r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z5) {
                charSequence3 = this.f3904q.f7443e;
            }
            a.S(this, charSequence3);
            return;
        }
        a.S(this, charSequence5);
    }

    @Override // k.InterfaceC0534p
    public MenuItemC0528j getItemData() {
        return this.f3904q;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0526h interfaceC0526h = this.f3907t;
        if (interfaceC0526h != null) {
            interfaceC0526h.a(this.f3904q);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3910w = e();
        f();
    }

    @Override // l.C0581t, android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i6 = this.f3912z) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i3, i4);
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int measuredWidth = getMeasuredWidth();
        int i7 = this.f3911y;
        if (mode == Integer.MIN_VALUE) {
            i5 = Math.min(size, i7);
        } else {
            i5 = i7;
        }
        if (mode != 1073741824 && i7 > 0 && measuredWidth < i5) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), i4);
        }
        if (isEmpty && this.f3906s != null) {
            super.setPadding((getMeasuredWidth() - this.f3906s.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View$OnTouchListenerC0519a view$OnTouchListenerC0519a;
        if (this.f3904q.hasSubMenu() && (view$OnTouchListenerC0519a = this.f3908u) != null && view$OnTouchListenerC0519a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z3) {
    }

    public void setChecked(boolean z3) {
    }

    public void setExpandedFormat(boolean z3) {
        if (this.x != z3) {
            this.x = z3;
            MenuItemC0528j menuItemC0528j = this.f3904q;
            if (menuItemC0528j != null) {
                MenuC0527i menuC0527i = menuItemC0528j.f7452n;
                menuC0527i.f7427k = true;
                menuC0527i.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f3906s = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i3 = this.f3903A;
            if (intrinsicWidth > i3) {
                intrinsicHeight = (int) (intrinsicHeight * (i3 / intrinsicWidth));
                intrinsicWidth = i3;
            }
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (intrinsicWidth * (i3 / intrinsicHeight));
            } else {
                i3 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i3);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(InterfaceC0526h interfaceC0526h) {
        this.f3907t = interfaceC0526h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i3, int i4, int i5, int i6) {
        this.f3912z = i3;
        super.setPadding(i3, i4, i5, i6);
    }

    public void setPopupCallback(AbstractC0520b abstractC0520b) {
        this.f3909v = abstractC0520b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f3905r = charSequence;
        f();
    }
}
