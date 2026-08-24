package R2;

import P2.AbstractC0097a;
import P2.x;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2136a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f2137b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f2138c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f2139d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f2140e;

    /* renamed from: f  reason: collision with root package name */
    public static final f f2141f;

    /* renamed from: g  reason: collision with root package name */
    public static final i f2142g;

    /* renamed from: h  reason: collision with root package name */
    public static final i f2143h;

    static {
        String str;
        int i3 = x.f1517a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f2136a = str;
        f2137b = AbstractC0097a.k("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i4 = x.f1517a;
        if (i4 < 2) {
            i4 = 2;
        }
        f2138c = AbstractC0097a.l("kotlinx.coroutines.scheduler.core.pool.size", i4, 1, 0, 8);
        f2139d = AbstractC0097a.l("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f2140e = TimeUnit.SECONDS.toNanos(AbstractC0097a.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f2141f = f.f2130a;
        f2142g = new i(0);
        f2143h = new i(1);
    }
}
