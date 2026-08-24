package androidx.datastore.preferences.protobuf;

import java.util.Collections;
/* renamed from: androidx.datastore.preferences.protobuf.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190m {

    /* renamed from: a  reason: collision with root package name */
    public static volatile C0190m f4281a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0190m f4282b;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.m, java.lang.Object] */
    static {
        ?? obj = new Object();
        Collections.emptyMap();
        f4282b = obj;
    }

    public static C0190m a() {
        Q q3 = Q.f4198c;
        C0190m c0190m = f4281a;
        if (c0190m == null) {
            synchronized (C0190m.class) {
                try {
                    c0190m = f4281a;
                    if (c0190m == null) {
                        Class cls = AbstractC0189l.f4280a;
                        C0190m c0190m2 = null;
                        if (cls != null) {
                            try {
                                c0190m2 = (C0190m) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0190m2 == null) {
                            c0190m2 = f4282b;
                        }
                        f4281a = c0190m2;
                        c0190m = c0190m2;
                    }
                } finally {
                }
            }
        }
        return c0190m;
    }
}
