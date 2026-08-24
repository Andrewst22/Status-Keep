package j$.util;

import j$.util.function.Predicate;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
/* loaded from: classes2.dex */
public class DesugarCollections {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f6693a;

    /* renamed from: b  reason: collision with root package name */
    private static final Field f6694b;

    /* renamed from: c  reason: collision with root package name */
    private static final Field f6695c;

    /* renamed from: d  reason: collision with root package name */
    private static final Constructor f6696d;

    /* renamed from: e  reason: collision with root package name */
    private static final Constructor f6697e;

    static {
        Field field;
        Field field2;
        Constructor<?> constructor;
        Class<?> cls = Collections.synchronizedCollection(new ArrayList()).getClass();
        f6693a = cls;
        Collections.synchronizedList(new LinkedList()).getClass();
        Constructor<?> constructor2 = null;
        try {
            field = cls.getDeclaredField("mutex");
        } catch (NoSuchFieldException unused) {
            field = null;
        }
        f6694b = field;
        if (field != null) {
            field.setAccessible(true);
        }
        try {
            field2 = cls.getDeclaredField("c");
        } catch (NoSuchFieldException unused2) {
            field2 = null;
        }
        f6695c = field2;
        if (field2 != null) {
            field2.setAccessible(true);
        }
        try {
            constructor = Collections.synchronizedSet(new HashSet()).getClass().getDeclaredConstructor(Set.class, Object.class);
        } catch (NoSuchMethodException unused3) {
            constructor = null;
        }
        f6697e = constructor;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
        try {
            constructor2 = cls.getDeclaredConstructor(Collection.class, Object.class);
        } catch (NoSuchMethodException unused4) {
        }
        f6696d = constructor2;
        if (constructor2 != null) {
            constructor2.setAccessible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Collection collection, Predicate predicate) {
        boolean c3;
        Field field = f6694b;
        if (field == null) {
            try {
                Collection collection2 = (Collection) f6695c.get(collection);
                return collection2 instanceof InterfaceC0341c ? ((InterfaceC0341c) collection2).c(predicate) : Collection$CC.$default$removeIf(collection2, predicate);
            } catch (IllegalAccessException e2) {
                throw new Error("Runtime illegal access in synchronized collection removeIf fall-back.", e2);
            }
        }
        try {
            synchronized (field.get(collection)) {
                Collection collection3 = (Collection) f6695c.get(collection);
                c3 = collection3 instanceof InterfaceC0341c ? ((InterfaceC0341c) collection3).c(predicate) : Collection$CC.$default$removeIf(collection3, predicate);
            }
            return c3;
        } catch (IllegalAccessException e3) {
            throw new Error("Runtime illegal access in synchronized collection removeIf.", e3);
        }
    }

    public static <K, V> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V> map) {
        return new C0366h(map);
    }
}
