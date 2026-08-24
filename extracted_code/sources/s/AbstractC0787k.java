package s;

import android.app.Notification;
import android.graphics.drawable.Icon;
/* renamed from: s.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0787k {
    public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(charSequence);
    }

    public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z3) {
        bigPictureStyle.showBigPictureWhenCollapsed(z3);
    }
}
