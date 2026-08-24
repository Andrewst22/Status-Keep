package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f4254a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f4255b;

    /* renamed from: c  reason: collision with root package name */
    public static final g0 f4256c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f4257d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f4258e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f4259f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f4260g;

    static {
        boolean r3;
        boolean q3;
        Unsafe i3 = i();
        f4254a = i3;
        f4255b = AbstractC0180c.f4233a;
        boolean h3 = h(Long.TYPE);
        boolean h4 = h(Integer.TYPE);
        g0 g0Var = null;
        if (i3 != null) {
            if (AbstractC0180c.a()) {
                if (h3) {
                    g0Var = new e0(i3, 1);
                } else if (h4) {
                    g0Var = new e0(i3, 0);
                }
            } else {
                g0Var = new g0(i3);
            }
        }
        f4256c = g0Var;
        boolean z3 = false;
        if (g0Var == null) {
            r3 = false;
        } else {
            r3 = g0Var.r();
        }
        f4257d = r3;
        if (g0Var == null) {
            q3 = false;
        } else {
            q3 = g0Var.q();
        }
        f4258e = q3;
        f4259f = e(byte[].class);
        e(boolean[].class);
        f(boolean[].class);
        e(int[].class);
        f(int[].class);
        e(long[].class);
        f(long[].class);
        e(float[].class);
        f(float[].class);
        e(double[].class);
        f(double[].class);
        e(Object[].class);
        f(Object[].class);
        Field g3 = g();
        if (g3 != null && g0Var != null) {
            g0Var.i(g3);
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z3 = true;
        }
        f4260g = z3;
    }

    public static void a(Throwable th) {
        Logger logger = Logger.getLogger(h0.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static boolean b(long j3, Object obj) {
        if (((byte) ((f4256c.f((-4) & j3, obj) >>> ((int) (((~j3) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static boolean c(long j3, Object obj) {
        if (((byte) ((f4256c.f((-4) & j3, obj) >>> ((int) ((j3 & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static Object d(Class cls) {
        try {
            return f4254a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static int e(Class cls) {
        if (f4258e) {
            return f4256c.a(cls);
        }
        return -1;
    }

    public static void f(Class cls) {
        if (f4258e) {
            f4256c.b(cls);
        }
    }

    public static Field g() {
        Field field;
        Field field2;
        if (AbstractC0180c.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean h(Class cls) {
        if (!AbstractC0180c.a()) {
            return false;
        }
        try {
            Class cls2 = f4255b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new d0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, long j3, byte b3) {
        f4256c.k(bArr, f4259f + j3, b3);
    }

    public static void k(Object obj, long j3, byte b3) {
        long j4 = (-4) & j3;
        int f3 = f4256c.f(j4, obj);
        int i3 = ((~((int) j3)) & 3) << 3;
        m(j4, obj, ((255 & b3) << i3) | (f3 & (~(255 << i3))));
    }

    public static void l(Object obj, long j3, byte b3) {
        long j4 = (-4) & j3;
        int i3 = (((int) j3) & 3) << 3;
        m(j4, obj, ((255 & b3) << i3) | (f4256c.f(j4, obj) & (~(255 << i3))));
    }

    public static void m(long j3, Object obj, int i3) {
        f4256c.n(j3, obj, i3);
    }

    public static void n(Object obj, long j3, long j4) {
        f4256c.o(obj, j3, j4);
    }

    public static void o(Object obj, long j3, Object obj2) {
        f4256c.p(obj, j3, obj2);
    }
}
