package R;

import java.util.HashSet;
/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet f1720a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public static String f1721b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (A.class) {
            if (f1720a.add(str)) {
                f1721b += ", " + str;
            }
        }
    }
}
