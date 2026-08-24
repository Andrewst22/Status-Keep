package H;

import android.os.Build;
/* loaded from: classes.dex */
public interface c {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f403a;

    static {
        boolean z3;
        if (Build.VERSION.SDK_INT >= 27) {
            z3 = true;
        } else {
            z3 = false;
        }
        f403a = z3;
    }
}
