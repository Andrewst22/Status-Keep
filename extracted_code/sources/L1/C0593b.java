package l1;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import p.C0723e;
/* renamed from: l1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0593b extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public C0607p f8061a;

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f8062b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f8063c;

    /* renamed from: d  reason: collision with root package name */
    public C0723e f8064d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
