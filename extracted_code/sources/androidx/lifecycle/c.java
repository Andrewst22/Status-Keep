package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final c f4333c = new c();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4334a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f4335b = new HashMap();

    public static void b(HashMap hashMap, C0204b c0204b, k kVar, Class cls) {
        k kVar2 = (k) hashMap.get(c0204b);
        if (kVar2 != null && kVar != kVar2) {
            Method method = c0204b.f4332b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + kVar2 + ", new value " + kVar);
        } else if (kVar2 == null) {
            hashMap.put(c0204b, kVar);
        }
    }

    public final C0203a a(Class cls, Method[] methodArr) {
        Class<?>[] interfaces;
        int i3;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f4334a;
        if (superclass != null) {
            C0203a c0203a = (C0203a) hashMap2.get(superclass);
            if (c0203a == null) {
                c0203a = a(superclass, null);
            }
            hashMap.putAll(c0203a.f4330b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0203a c0203a2 = (C0203a) hashMap2.get(cls2);
            if (c0203a2 == null) {
                c0203a2 = a(cls2, null);
            }
            for (Map.Entry entry : c0203a2.f4330b.entrySet()) {
                b(hashMap, (C0204b) entry.getKey(), (k) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            v vVar = (v) method.getAnnotation(v.class);
            if (vVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (r.class.isAssignableFrom(parameterTypes[0])) {
                        i3 = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i3 = 0;
                }
                k value = vVar.value();
                if (parameterTypes.length > 1) {
                    if (k.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == k.ON_ANY) {
                            i3 = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new C0204b(i3, method), value, cls);
                    z3 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0203a c0203a3 = new C0203a(hashMap);
        hashMap2.put(cls, c0203a3);
        this.f4335b.put(cls, Boolean.valueOf(z3));
        return c0203a3;
    }
}
