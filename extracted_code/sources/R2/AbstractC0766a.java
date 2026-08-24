package r2;

import a.AbstractC0155a;
import android.os.Trace;
/* renamed from: r2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0766a implements AutoCloseable {
    public static String a(String str) {
        if (str.length() >= 124) {
            return str.substring(0, 124) + "...";
        }
        return str;
    }

    public static void b(String str) {
        Trace.beginSection(AbstractC0155a.O(a(str)));
    }
}
