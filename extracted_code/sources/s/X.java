package s;

import android.app.RemoteInput;
/* loaded from: classes.dex */
public abstract class X {
    public static int a(Object obj) {
        return ((RemoteInput) obj).getEditChoicesBeforeSending();
    }

    public static RemoteInput.Builder b(RemoteInput.Builder builder, int i3) {
        return builder.setEditChoicesBeforeSending(i3);
    }
}
