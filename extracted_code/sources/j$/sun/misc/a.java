package j$.sun.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final a f6415b;

    /* renamed from: a  reason: collision with root package name */
    private final Unsafe f6416a;

    static {
        Field i3 = i();
        i3.setAccessible(true);
        try {
            f6415b = new a((Unsafe) i3.get(null));
        } catch (IllegalAccessException e2) {
            throw new AssertionError("Couldn't get the Unsafe", e2);
        }
    }

    a(Unsafe unsafe) {
        this.f6416a = unsafe;
    }

    private static Field i() {
        Field[] declaredFields;
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e2) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e2);
        }
    }

    public static a h() {
        return f6415b;
    }

    public final int f(Object obj, long j3) {
        int intVolatile;
        do {
            intVolatile = this.f6416a.getIntVolatile(obj, j3);
        } while (!this.f6416a.compareAndSwapInt(obj, j3, intVolatile, intVolatile - 4));
        return intVolatile;
    }

    public final long k(Field field) {
        return this.f6416a.objectFieldOffset(field);
    }

    public final long j(Class cls, String str) {
        try {
            return k(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e2) {
            throw new AssertionError("Cannot find field:", e2);
        }
    }

    public final int a(Class cls) {
        return this.f6416a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f6416a.arrayIndexScale(cls);
    }

    public final Object g(Object obj, long j3) {
        return this.f6416a.getObjectVolatile(obj, j3);
    }

    public final void l(Object obj, long j3, Object obj2) {
        this.f6416a.putObjectVolatile(obj, j3, obj2);
    }

    public final boolean c(Object obj, long j3, int i3, int i4) {
        return this.f6416a.compareAndSwapInt(obj, j3, i3, i4);
    }

    public final boolean d(Object obj, long j3, long j4, long j5) {
        return this.f6416a.compareAndSwapLong(obj, j3, j4, j5);
    }

    public final boolean e(Object obj, long j3, Object obj2) {
        return j$.com.android.tools.r8.a.f(this.f6416a, obj, j3, obj2);
    }
}
