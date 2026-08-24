package l1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
/* renamed from: l1.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0605n extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f8113a;

    /* renamed from: b  reason: collision with root package name */
    public C0604m f8114b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f8115c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f8116d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8117e;

    /* renamed from: f  reason: collision with root package name */
    public Bitmap f8118f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f8119g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f8120h;

    /* renamed from: i  reason: collision with root package name */
    public int f8121i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f8122j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8123k;

    /* renamed from: l  reason: collision with root package name */
    public Paint f8124l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f8113a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0607p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0607p(this);
    }
}
