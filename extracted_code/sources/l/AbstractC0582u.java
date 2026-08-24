package l;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.location.LocationManager;
import android.os.Parcelable;
import android.view.WindowManager;
/* renamed from: l.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0582u {
    public static /* bridge */ /* synthetic */ Icon c(Parcelable parcelable) {
        return (Icon) parcelable;
    }

    public static /* bridge */ /* synthetic */ Object f(Activity activity) {
        return activity.getSystemService(WindowManager.class);
    }

    public static /* bridge */ /* synthetic */ void h(r rVar) {
        rVar.setEnterTransition(null);
    }

    public static /* bridge */ /* synthetic */ boolean l(Parcelable parcelable) {
        return parcelable instanceof Icon;
    }

    public static /* bridge */ /* synthetic */ Object o(Context context) {
        return context.getSystemService(LocationManager.class);
    }

    public static /* bridge */ /* synthetic */ void p(r rVar) {
        rVar.setExitTransition(null);
    }
}
