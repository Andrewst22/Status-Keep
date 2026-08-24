package j$.util;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0366h implements java.util.Map, Serializable, Map {
    private static final long serialVersionUID = 1978198479659022715L;

    /* renamed from: a  reason: collision with root package name */
    private final java.util.Map f6860a;

    /* renamed from: b  reason: collision with root package name */
    final Object f6861b;

    /* renamed from: c  reason: collision with root package name */
    private transient Set f6862c;

    /* renamed from: d  reason: collision with root package name */
    private transient Set f6863d;

    /* renamed from: e  reason: collision with root package name */
    private transient Collection f6864e;

    @Override // java.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0366h(java.util.Map map) {
        Objects.requireNonNull(map);
        this.f6860a = map;
        this.f6861b = this;
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.f6861b) {
            size = this.f6860a.size();
        }
        return size;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f6861b) {
            isEmpty = this.f6860a.isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.f6861b) {
            containsKey = this.f6860a.containsKey(obj);
        }
        return containsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.f6861b) {
            containsValue = this.f6860a.containsValue(obj);
        }
        return containsValue;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f6861b) {
            obj2 = this.f6860a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.f6861b) {
            put = this.f6860a.put(obj, obj2);
        }
        return put;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object remove;
        synchronized (this.f6861b) {
            remove = this.f6860a.remove(obj);
        }
        return remove;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        synchronized (this.f6861b) {
            this.f6860a.putAll(map);
        }
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.f6861b) {
            this.f6860a.clear();
        }
    }

    private static Set a(Set set, Object obj) {
        Constructor constructor;
        Constructor constructor2;
        constructor = DesugarCollections.f6697e;
        if (constructor == null) {
            return Collections.synchronizedSet(set);
        }
        try {
            constructor2 = DesugarCollections.f6697e;
            return (Set) constructor2.newInstance(set, obj);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new Error("Unable to instantiate a synchronized list.", e2);
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        Set set;
        synchronized (this.f6861b) {
            try {
                if (this.f6862c == null) {
                    this.f6862c = a(this.f6860a.keySet(), this.f6861b);
                }
                set = this.f6862c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return set;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        Set set;
        synchronized (this.f6861b) {
            try {
                if (this.f6863d == null) {
                    this.f6863d = a(this.f6860a.entrySet(), this.f6861b);
                }
                set = this.f6863d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return set;
    }

    @Override // java.util.Map
    public final Collection values() {
        Collection collection;
        Constructor constructor;
        Constructor constructor2;
        Collection collection2;
        synchronized (this.f6861b) {
            try {
                if (this.f6864e == null) {
                    Collection values = this.f6860a.values();
                    Object obj = this.f6861b;
                    constructor = DesugarCollections.f6696d;
                    if (constructor == null) {
                        collection2 = Collections.synchronizedCollection(values);
                    } else {
                        try {
                            constructor2 = DesugarCollections.f6696d;
                            collection2 = (Collection) constructor2.newInstance(values, obj);
                        } catch (IllegalAccessException e2) {
                            e = e2;
                            throw new Error("Unable to instantiate a synchronized list.", e);
                        } catch (InstantiationException e3) {
                            e = e3;
                            throw new Error("Unable to instantiate a synchronized list.", e);
                        } catch (InvocationTargetException e4) {
                            e = e4;
                            throw new Error("Unable to instantiate a synchronized list.", e);
                        }
                    }
                    this.f6864e = collection2;
                }
                collection = this.f6864e;
            } finally {
            }
        }
        return collection;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f6861b) {
            equals = this.f6860a.equals(obj);
        }
        return equals;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int hashCode;
        synchronized (this.f6861b) {
            hashCode = this.f6860a.hashCode();
        }
        return hashCode;
    }

    public final String toString() {
        String obj;
        synchronized (this.f6861b) {
            obj = this.f6860a.toString();
        }
        return obj;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object orDefault;
        synchronized (this.f6861b) {
            orDefault = Map.EL.getOrDefault(this.f6860a, obj, obj2);
        }
        return orDefault;
    }

    @Override // j$.util.Map
    public final void forEach(j$.util.function.BiConsumer biConsumer) {
        synchronized (this.f6861b) {
            java.util.Map map = this.f6860a;
            if (map instanceof Map) {
                ((Map) map).forEach(biConsumer);
            } else if (map instanceof ConcurrentMap) {
                j$.util.concurrent.u.a((ConcurrentMap) map, biConsumer);
            } else {
                Map.CC.$default$forEach(map, biConsumer);
            }
        }
    }

    @Override // j$.util.Map
    public final void replaceAll(j$.util.function.BiFunction biFunction) {
        synchronized (this.f6861b) {
            java.util.Map map = this.f6860a;
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(biFunction);
                j$.util.concurrent.t tVar = new j$.util.concurrent.t(concurrentMap, biFunction);
                if (concurrentMap instanceof j$.util.concurrent.v) {
                    ((j$.util.concurrent.v) concurrentMap).forEach(tVar);
                } else {
                    j$.util.concurrent.u.a(concurrentMap, tVar);
                }
            } else {
                Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object a3;
        synchronized (this.f6861b) {
            a3 = Map.EL.a(this.f6860a, obj, obj2);
        }
        return a3;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        boolean remove;
        synchronized (this.f6861b) {
            java.util.Map map = this.f6860a;
            remove = map instanceof Map ? ((Map) map).remove(obj, obj2) : Map.CC.$default$remove(map, obj, obj2);
        }
        return remove;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean replace;
        synchronized (this.f6861b) {
            java.util.Map map = this.f6860a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return replace;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object replace;
        synchronized (this.f6861b) {
            java.util.Map map = this.f6860a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2) : Map.CC.$default$replace(map, obj, obj2);
        }
        return replace;
    }

    @Override // j$.util.Map
    public final Object computeIfAbsent(Object obj, j$.util.function.Function function) {
        Object $default$computeIfAbsent;
        Object a3;
        synchronized (this.f6861b) {
            java.util.Map map = this.f6860a;
            if (map instanceof Map) {
                $default$computeIfAbsent = ((Map) map).computeIfAbsent(obj, function);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(function);
                Object obj2 = concurrentMap.get(obj);
                $default$computeIfAbsent = (obj2 == null && (a3 = function.a(obj)) != null && (obj2 = concurrentMap.putIfAbsent(obj, a3)) == null) ? a3 : obj2;
            } else {
                $default$computeIfAbsent = Map.CC.$default$computeIfAbsent(map, obj, function);
            }
        }
        return $default$computeIfAbsent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        r5 = r3;
     */
    @Override // j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfPresent(java.lang.Object r5, j$.util.function.BiFunction r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f6861b
            monitor-enter(r0)
            java.util.Map r1 = r4.f6860a     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r1 instanceof j$.util.Map     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L10
            j$.util.Map r1 = (j$.util.Map) r1     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r5 = r1.computeIfPresent(r5, r6)     // Catch: java.lang.Throwable -> L3c
            goto L3a
        L10:
            boolean r2 = r1 instanceof java.util.concurrent.ConcurrentMap     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L36
            java.util.concurrent.ConcurrentMap r1 = (java.util.concurrent.ConcurrentMap) r1     // Catch: java.lang.Throwable -> L3c
            java.util.Objects.requireNonNull(r6)     // Catch: java.lang.Throwable -> L3c
        L19:
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L34
            java.lang.Object r3 = r6.c(r5, r2)     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L2c
            boolean r2 = r1.remove(r5, r2)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L19
            goto L32
        L2c:
            boolean r2 = r1.replace(r5, r2, r3)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L19
        L32:
            r5 = r3
            goto L3a
        L34:
            r5 = 0
            goto L3a
        L36:
            java.lang.Object r5 = j$.util.Map.CC.$default$computeIfPresent(r1, r5, r6)     // Catch: java.lang.Throwable -> L3c
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            return r5
        L3c:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.C0366h.computeIfPresent(java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
        r5 = r3;
     */
    @Override // j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object compute(java.lang.Object r5, j$.util.function.BiFunction r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f6861b
            monitor-enter(r0)
            java.util.Map r1 = r4.f6860a     // Catch: java.lang.Throwable -> L41
            boolean r2 = r1 instanceof j$.util.Map     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L10
            j$.util.Map r1 = (j$.util.Map) r1     // Catch: java.lang.Throwable -> L41
            java.lang.Object r5 = r1.compute(r5, r6)     // Catch: java.lang.Throwable -> L41
            goto L3f
        L10:
            boolean r2 = r1 instanceof java.util.concurrent.ConcurrentMap     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L3b
            java.util.concurrent.ConcurrentMap r1 = (java.util.concurrent.ConcurrentMap) r1     // Catch: java.lang.Throwable -> L41
        L16:
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L41
        L1a:
            java.lang.Object r3 = r6.c(r5, r2)     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L31
            if (r2 == 0) goto L2a
            boolean r2 = r1.replace(r5, r2, r3)     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L16
        L28:
            r5 = r3
            goto L3f
        L2a:
            java.lang.Object r2 = r1.putIfAbsent(r5, r3)     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L1a
            goto L28
        L31:
            if (r2 == 0) goto L39
            boolean r2 = r1.remove(r5, r2)     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L16
        L39:
            r5 = 0
            goto L3f
        L3b:
            java.lang.Object r5 = j$.util.Map.CC.$default$compute(r1, r5, r6)     // Catch: java.lang.Throwable -> L41
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            return r5
        L41:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.C0366h.compute(java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        r3 = r7.c(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r3 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r1.replace(r5, r2, r3) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r1.remove(r5, r2) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        r6 = null;
     */
    @Override // j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object merge(java.lang.Object r5, java.lang.Object r6, j$.util.function.BiFunction r7) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f6861b
            monitor-enter(r0)
            java.util.Map r1 = r4.f6860a     // Catch: java.lang.Throwable -> L46
            boolean r2 = r1 instanceof j$.util.Map     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L10
            j$.util.Map r1 = (j$.util.Map) r1     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r1.merge(r5, r6, r7)     // Catch: java.lang.Throwable -> L46
            goto L44
        L10:
            boolean r2 = r1 instanceof java.util.concurrent.ConcurrentMap     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L40
            java.util.concurrent.ConcurrentMap r1 = (java.util.concurrent.ConcurrentMap) r1     // Catch: java.lang.Throwable -> L46
            java.util.Objects.requireNonNull(r7)     // Catch: java.lang.Throwable -> L46
            java.util.Objects.requireNonNull(r6)     // Catch: java.lang.Throwable -> L46
        L1c:
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L46
        L20:
            if (r2 == 0) goto L38
            java.lang.Object r3 = r7.c(r2, r6)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L30
            boolean r2 = r1.replace(r5, r2, r3)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L1c
            r6 = r3
            goto L3e
        L30:
            boolean r2 = r1.remove(r5, r2)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L1c
            r6 = 0
            goto L3e
        L38:
            java.lang.Object r2 = r1.putIfAbsent(r5, r6)     // Catch: java.lang.Throwable -> L46
            if (r2 != 0) goto L20
        L3e:
            r5 = r6
            goto L44
        L40:
            java.lang.Object r5 = j$.util.Map.CC.$default$merge(r1, r5, r6, r7)     // Catch: java.lang.Throwable -> L46
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            return r5
        L46:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.C0366h.merge(java.lang.Object, java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f6861b) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
