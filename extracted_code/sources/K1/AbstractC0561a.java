package k1;

import android.os.Trace;
/* renamed from: k1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0561a {
    public static void a(String str, int i3) {
        Trace.beginAsyncSection(str, i3);
    }

    public static void b(String str, int i3) {
        Trace.endAsyncSection(str, i3);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
