package X1;

import android.app.ActivityManager;
import android.app.Person;
import android.os.Parcelable;
import android.view.DisplayCutout;
/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* synthetic */ ActivityManager.TaskDescription c(String str, int i3) {
        return new ActivityManager.TaskDescription(str, 0, i3);
    }

    public static /* bridge */ /* synthetic */ Person d(Parcelable parcelable) {
        return (Person) parcelable;
    }

    public static /* bridge */ /* synthetic */ DisplayCutout h(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean n(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
