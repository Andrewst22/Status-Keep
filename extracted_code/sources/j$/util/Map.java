package j$.util;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes2.dex */
public interface Map<K, V> {
    V compute(K k3, BiFunction<? super K, ? super V, ? extends V> biFunction);

    V computeIfAbsent(K k3, Function<? super K, ? extends V> function);

    V computeIfPresent(K k3, BiFunction<? super K, ? super V, ? extends V> biFunction);

    void forEach(BiConsumer<? super K, ? super V> biConsumer);

    V getOrDefault(Object obj, V v3);

    V merge(K k3, V v3, BiFunction<? super V, ? super V, ? extends V> biFunction);

    V putIfAbsent(K k3, V v3);

    boolean remove(Object obj, Object obj2);

    V replace(K k3, V v3);

    boolean replace(K k3, V v3, V v4);

    void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction);

    /* renamed from: j$.util.Map$-EL  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class EL {
        public static /* synthetic */ Object a(java.util.Map map, Object obj, Object obj2) {
            return map instanceof Map ? ((Map) map).putIfAbsent(obj, obj2) : CC.$default$putIfAbsent(map, obj, obj2);
        }

        public static Object getOrDefault(java.util.Map map, Object obj, Object obj2) {
            if (map instanceof Map) {
                return ((Map) map).getOrDefault(obj, obj2);
            }
            if (map instanceof ConcurrentMap) {
                Object obj3 = ((ConcurrentMap) map).get(obj);
                return obj3 != null ? obj3 : obj2;
            }
            Object obj4 = map.get(obj);
            return (obj4 != null || map.containsKey(obj)) ? obj4 : obj2;
        }
    }

    /* renamed from: j$.util.Map$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static void $default$forEach(java.util.Map map, BiConsumer biConsumer) {
            Objects.requireNonNull(biConsumer);
            for (Map.Entry<K, V> entry : map.entrySet()) {
                try {
                    biConsumer.u(entry.getKey(), entry.getValue());
                } catch (IllegalStateException e2) {
                    throw new ConcurrentModificationException(e2);
                }
            }
        }

        public static void $default$replaceAll(java.util.Map map, BiFunction biFunction) {
            Objects.requireNonNull(biFunction);
            for (Map.Entry<K, V> entry : map.entrySet()) {
                try {
                    try {
                        entry.setValue((V) biFunction.c(entry.getKey(), entry.getValue()));
                    } catch (IllegalStateException e2) {
                        throw new ConcurrentModificationException(e2);
                    }
                } catch (IllegalStateException e3) {
                    throw new ConcurrentModificationException(e3);
                }
            }
        }

        public static Object $default$putIfAbsent(java.util.Map map, Object obj, Object obj2) {
            Object obj3 = map.get(obj);
            return obj3 == null ? map.put(obj, obj2) : obj3;
        }

        public static boolean $default$remove(java.util.Map map, Object obj, Object obj2) {
            Object obj3 = map.get(obj);
            if (Objects.equals(obj3, obj2)) {
                if (obj3 != null || map.containsKey(obj)) {
                    map.remove(obj);
                    return true;
                }
                return false;
            }
            return false;
        }

        public static boolean $default$replace(java.util.Map map, Object obj, Object obj2, Object obj3) {
            Object obj4 = map.get(obj);
            if (Objects.equals(obj4, obj2)) {
                if (obj4 != null || map.containsKey(obj)) {
                    map.put(obj, obj3);
                    return true;
                }
                return false;
            }
            return false;
        }

        public static Object $default$replace(java.util.Map map, Object obj, Object obj2) {
            Object obj3 = map.get(obj);
            return (obj3 != null || map.containsKey(obj)) ? map.put(obj, obj2) : obj3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$computeIfAbsent(java.util.Map map, Object obj, Function function) {
            Object a3;
            Objects.requireNonNull(function);
            Object obj2 = map.get(obj);
            if (obj2 != null || (a3 = function.a(obj)) == null) {
                return obj2;
            }
            map.put(obj, a3);
            return a3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$computeIfPresent(java.util.Map map, Object obj, BiFunction biFunction) {
            Objects.requireNonNull(biFunction);
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                Object c3 = biFunction.c(obj, obj2);
                if (c3 != null) {
                    map.put(obj, c3);
                    return c3;
                }
                map.remove(obj);
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$compute(java.util.Map map, Object obj, BiFunction biFunction) {
            Objects.requireNonNull(biFunction);
            Object obj2 = map.get(obj);
            Object c3 = biFunction.c(obj, obj2);
            if (c3 == null) {
                if (obj2 != null || map.containsKey(obj)) {
                    map.remove(obj);
                    return null;
                }
                return null;
            }
            map.put(obj, c3);
            return c3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Object $default$merge(java.util.Map map, Object obj, Object obj2, BiFunction biFunction) {
            Objects.requireNonNull(biFunction);
            Objects.requireNonNull(obj2);
            Object obj3 = map.get(obj);
            if (obj3 != null) {
                obj2 = biFunction.c(obj3, obj2);
            }
            if (obj2 == null) {
                map.remove(obj);
            } else {
                map.put(obj, obj2);
            }
            return obj2;
        }
    }
}
