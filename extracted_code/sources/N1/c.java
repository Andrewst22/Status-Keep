package N1;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public static Class f1112d;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1113b;

    /* renamed from: c  reason: collision with root package name */
    public final Field f1114c;

    public c() {
        Object obj;
        Field field = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f1112d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f1113b = obj;
        try {
            field = AccessibleObject.class.getDeclaredField("override");
        } catch (Exception unused2) {
        }
        this.f1114c = field;
    }

    @Override // N1.b
    public final void a(AccessibleObject accessibleObject) {
        Field field;
        Object obj = this.f1113b;
        if (obj != null && (field = this.f1114c) != null) {
            try {
                Long l3 = (Long) f1112d.getMethod("objectFieldOffset", Field.class).invoke(obj, field);
                l3.getClass();
                f1112d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(obj, accessibleObject, l3, Boolean.TRUE);
                return;
            } catch (Exception unused) {
            }
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e2) {
            throw new RuntimeException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e2);
        }
    }
}
