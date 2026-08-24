package u;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
/* renamed from: u.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0848k {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f9289a;

    /* renamed from: b  reason: collision with root package name */
    public final Configuration f9290b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9291c;

    public C0848k(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f9289a = colorStateList;
        this.f9290b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f9291c = hashCode;
    }
}
