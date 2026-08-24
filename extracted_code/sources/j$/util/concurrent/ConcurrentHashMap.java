package j$.util.concurrent;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
/* loaded from: classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, v {

    /* renamed from: g  reason: collision with root package name */
    static final int f6746g = Runtime.getRuntime().availableProcessors();

    /* renamed from: h  reason: collision with root package name */
    private static final j$.sun.misc.a f6747h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f6748i;

    /* renamed from: j  reason: collision with root package name */
    private static final long f6749j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f6750k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f6751l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f6752m;

    /* renamed from: n  reason: collision with root package name */
    private static final int f6753n;

    /* renamed from: o  reason: collision with root package name */
    private static final int f6754o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a  reason: collision with root package name */
    volatile transient l[] f6755a;

    /* renamed from: b  reason: collision with root package name */
    private volatile transient l[] f6756b;
    private volatile transient long baseCount;

    /* renamed from: c  reason: collision with root package name */
    private volatile transient c[] f6757c;
    private volatile transient int cellsBusy;

    /* renamed from: d  reason: collision with root package name */
    private transient i f6758d;

    /* renamed from: e  reason: collision with root package name */
    private transient s f6759e;

    /* renamed from: f  reason: collision with root package name */
    private transient e f6760f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static final int i(int i3) {
        return (i3 ^ (i3 >>> 16)) & Integer.MAX_VALUE;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    static {
        ObjectStreamField objectStreamField = new ObjectStreamField("segments", n[].class);
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{objectStreamField, new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a h3 = j$.sun.misc.a.h();
        f6747h = h3;
        f6748i = h3.j(ConcurrentHashMap.class, "sizeCtl");
        f6749j = h3.j(ConcurrentHashMap.class, "transferIndex");
        f6750k = h3.j(ConcurrentHashMap.class, "baseCount");
        f6751l = h3.j(ConcurrentHashMap.class, "cellsBusy");
        f6752m = h3.j(c.class, "value");
        f6753n = h3.a(l[].class);
        int b3 = h3.b(l[].class);
        if (((b3 - 1) & b3) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        f6754o = 31 - Integer.numberOfLeadingZeros(b3);
    }

    private static final int l(int i3) {
        int numberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i3 - 1);
        if (numberOfLeadingZeros < 0) {
            return 1;
        }
        if (numberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return 1 + numberOfLeadingZeros;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (obj instanceof Comparable) {
            Class<?> cls = obj.getClass();
            if (cls == String.class) {
                return cls;
            }
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces != null) {
                for (Type type : genericInterfaces) {
                    if (type instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) type;
                        if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                            return cls;
                        }
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final l k(l[] lVarArr, int i3) {
        return (l) f6747h.g(lVarArr, (i3 << f6754o) + f6753n);
    }

    static final boolean b(l[] lVarArr, int i3, l lVar) {
        return f6747h.e(lVarArr, (i3 << f6754o) + f6753n, lVar);
    }

    static final void h(l[] lVarArr, int i3, l lVar) {
        f6747h.l(lVarArr, (i3 << f6754o) + f6753n, lVar);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i3, int i4) {
        if (i3 < 0 || i4 <= 0) {
            throw new IllegalArgumentException();
        }
        long j3 = (long) (((i3 < i4 ? i4 : i3) / 0.75f) + 1.0d);
        this.sizeCtl = j3 >= 1073741824 ? 1073741824 : l((int) j3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j3 = j();
        if (j3 < 0) {
            return 0;
        }
        if (j3 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return j() <= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
        return (V) r1.f6782c;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V get(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            int r0 = i(r0)
            j$.util.concurrent.l[] r1 = r4.f6755a
            r2 = 0
            if (r1 == 0) goto L4e
            int r3 = r1.length
            if (r3 <= 0) goto L4e
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.l r1 = k(r1, r3)
            if (r1 == 0) goto L4e
            int r3 = r1.f6780a
            if (r3 != r0) goto L2c
            java.lang.Object r3 = r1.f6781b
            if (r3 == r5) goto L29
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L29:
            java.lang.Object r5 = r1.f6782c
            return r5
        L2c:
            if (r3 >= 0) goto L37
            j$.util.concurrent.l r5 = r1.a(r0, r5)
            if (r5 == 0) goto L36
            java.lang.Object r2 = r5.f6782c
        L36:
            return r2
        L37:
            j$.util.concurrent.l r1 = r1.f6783d
            if (r1 == 0) goto L4e
            int r3 = r1.f6780a
            if (r3 != r0) goto L37
            java.lang.Object r3 = r1.f6781b
            if (r3 == r5) goto L4b
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L4b:
            java.lang.Object r5 = r1.f6782c
            return r5
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        l[] lVarArr = this.f6755a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a3 = pVar.a();
                if (a3 == null) {
                    break;
                }
                Object obj2 = a3.f6782c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k3, V v3) {
        return (V) f(k3, v3, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a5, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00b4, code lost:
        a(1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00b9, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.f(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        o(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        return g(obj, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ae, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r12 = this;
            int r0 = r13.hashCode()
            int r0 = i(r0)
            j$.util.concurrent.l[] r1 = r12.f6755a
        La:
            r2 = 0
            if (r1 == 0) goto Lc0
            int r3 = r1.length
            if (r3 == 0) goto Lc0
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.l r4 = k(r1, r3)
            if (r4 != 0) goto L1b
            goto Lc0
        L1b:
            int r5 = r4.f6780a
            r6 = -1
            if (r5 != r6) goto L25
            j$.util.concurrent.l[] r1 = r12.d(r1, r4)
            goto La
        L25:
            monitor-enter(r4)
            j$.util.concurrent.l r7 = k(r1, r3)     // Catch: java.lang.Throwable -> L42
            if (r7 != r4) goto Laf
            r7 = 1
            if (r5 < 0) goto L6e
            r8 = r2
            r5 = r4
        L31:
            int r9 = r5.f6780a     // Catch: java.lang.Throwable -> L42
            if (r9 != r0) goto L65
            java.lang.Object r9 = r5.f6781b     // Catch: java.lang.Throwable -> L42
            if (r9 == r13) goto L45
            if (r9 == 0) goto L65
            boolean r9 = r13.equals(r9)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L65
            goto L45
        L42:
            r13 = move-exception
            goto Lbe
        L45:
            java.lang.Object r9 = r5.f6782c     // Catch: java.lang.Throwable -> L42
            if (r15 == 0) goto L53
            if (r15 == r9) goto L53
            if (r9 == 0) goto Lb0
            boolean r10 = r15.equals(r9)     // Catch: java.lang.Throwable -> L42
            if (r10 == 0) goto Lb0
        L53:
            if (r14 == 0) goto L58
            r5.f6782c = r14     // Catch: java.lang.Throwable -> L42
            goto Lb1
        L58:
            if (r8 == 0) goto L5f
            j$.util.concurrent.l r3 = r5.f6783d     // Catch: java.lang.Throwable -> L42
            r8.f6783d = r3     // Catch: java.lang.Throwable -> L42
            goto Lb1
        L5f:
            j$.util.concurrent.l r5 = r5.f6783d     // Catch: java.lang.Throwable -> L42
            h(r1, r3, r5)     // Catch: java.lang.Throwable -> L42
            goto Lb1
        L65:
            j$.util.concurrent.l r8 = r5.f6783d     // Catch: java.lang.Throwable -> L42
            if (r8 != 0) goto L6a
            goto Lb0
        L6a:
            r11 = r8
            r8 = r5
            r5 = r11
            goto L31
        L6e:
            boolean r5 = r4 instanceof j$.util.concurrent.q     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto La2
            r5 = r4
            j$.util.concurrent.q r5 = (j$.util.concurrent.q) r5     // Catch: java.lang.Throwable -> L42
            j$.util.concurrent.r r8 = r5.f6798e     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto Lb0
            j$.util.concurrent.r r8 = r8.b(r0, r13, r2)     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto Lb0
            java.lang.Object r9 = r8.f6782c     // Catch: java.lang.Throwable -> L42
            if (r15 == 0) goto L8d
            if (r15 == r9) goto L8d
            if (r9 == 0) goto Lb0
            boolean r10 = r15.equals(r9)     // Catch: java.lang.Throwable -> L42
            if (r10 == 0) goto Lb0
        L8d:
            if (r14 == 0) goto L92
            r8.f6782c = r14     // Catch: java.lang.Throwable -> L42
            goto Lb1
        L92:
            boolean r8 = r5.f(r8)     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto Lb1
            j$.util.concurrent.r r5 = r5.f6799f     // Catch: java.lang.Throwable -> L42
            j$.util.concurrent.l r5 = p(r5)     // Catch: java.lang.Throwable -> L42
            h(r1, r3, r5)     // Catch: java.lang.Throwable -> L42
            goto Lb1
        La2:
            boolean r3 = r4 instanceof j$.util.concurrent.m     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto La7
            goto Laf
        La7:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L42
            java.lang.String r14 = "Recursive update"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L42
            throw r13     // Catch: java.lang.Throwable -> L42
        Laf:
            r7 = 0
        Lb0:
            r9 = r2
        Lb1:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            if (r7 == 0) goto La
            if (r9 == 0) goto Lc0
            if (r14 != 0) goto Lbd
            r13 = -1
            r12.a(r13, r6)
        Lbd:
            return r9
        Lbe:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            throw r13
        Lc0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.g(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        l k3;
        l lVar;
        l[] lVarArr = this.f6755a;
        long j3 = 0;
        loop0: while (true) {
            int i3 = 0;
            while (lVarArr != null && i3 < lVarArr.length) {
                k3 = k(lVarArr, i3);
                if (k3 == null) {
                    i3++;
                } else {
                    int i4 = k3.f6780a;
                    if (i4 == -1) {
                        break;
                    }
                    synchronized (k3) {
                        try {
                            if (k(lVarArr, i3) == k3) {
                                if (i4 >= 0) {
                                    lVar = k3;
                                } else {
                                    lVar = k3 instanceof q ? ((q) k3).f6799f : null;
                                }
                                while (lVar != null) {
                                    j3--;
                                    lVar = lVar.f6783d;
                                }
                                h(lVarArr, i3, null);
                                i3++;
                            }
                        } finally {
                        }
                    }
                }
            }
            lVarArr = d(lVarArr, k3);
        }
        if (j3 != 0) {
            a(j3, -1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.concurrent.b, j$.util.concurrent.i, java.util.Set] */
    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        i iVar = this.f6758d;
        if (iVar != null) {
            return iVar;
        }
        ?? bVar = new b(this);
        this.f6758d = bVar;
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.concurrent.b, j$.util.concurrent.s, java.util.Collection] */
    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        s sVar = this.f6759e;
        if (sVar != null) {
            return sVar;
        }
        ?? bVar = new b(this);
        this.f6759e = bVar;
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.concurrent.b, j$.util.concurrent.e, java.util.Set] */
    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        e eVar = this.f6760f;
        if (eVar != null) {
            return eVar;
        }
        ?? bVar = new b(this);
        this.f6760f = bVar;
        return bVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        l[] lVarArr = this.f6755a;
        int i3 = 0;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a3 = pVar.a();
                if (a3 == null) {
                    break;
                }
                i3 += a3.f6782c.hashCode() ^ a3.f6781b.hashCode();
            }
        }
        return i3;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        l[] lVarArr = this.f6755a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        l a3 = pVar.a();
        if (a3 != null) {
            while (true) {
                Object obj = a3.f6781b;
                Object obj2 = a3.f6782c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                a3 = pVar.a();
                if (a3 == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v3;
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                l[] lVarArr = this.f6755a;
                int length = lVarArr == null ? 0 : lVarArr.length;
                p pVar = new p(lVarArr, length, 0, length);
                while (true) {
                    l a3 = pVar.a();
                    if (a3 != null) {
                        Object obj2 = a3.f6782c;
                        Object obj3 = map.get(a3.f6781b);
                        if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                            break;
                        }
                    } else {
                        for (Map.Entry<K, V> entry : map.entrySet()) {
                            K key = entry.getKey();
                            if (key == null || (value = entry.getValue()) == null || (v3 = get(key)) == null || (value != v3 && !value.equals(v3))) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i3 = 1;
        int i4 = 0;
        while (i3 < 16) {
            i4++;
            i3 <<= 1;
        }
        int i5 = 32 - i4;
        int i6 = i3 - 1;
        n[] nVarArr = new n[16];
        for (int i7 = 0; i7 < 16; i7++) {
            nVarArr[i7] = new ReentrantLock();
        }
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("segments", nVarArr);
        putFields.put("segmentShift", i5);
        putFields.put("segmentMask", i6);
        objectOutputStream.writeFields();
        l[] lVarArr = this.f6755a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a3 = pVar.a();
                if (a3 == null) {
                    break;
                }
                objectOutputStream.writeObject(a3.f6781b);
                objectOutputStream.writeObject(a3.f6782c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j3;
        boolean z3;
        boolean z4;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j4 = 0;
        long j5 = 0;
        l lVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j3 = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j5++;
            lVar = new l(i(readObject.hashCode()), readObject, readObject2, lVar);
        }
        if (j5 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j6 = (long) ((((float) j5) / 0.75f) + 1.0d);
        int l3 = j6 >= 1073741824 ? 1073741824 : l((int) j6);
        l[] lVarArr = new l[l3];
        int i3 = l3 - 1;
        while (lVar != null) {
            l lVar2 = lVar.f6783d;
            int i4 = lVar.f6780a;
            int i5 = i4 & i3;
            l k3 = k(lVarArr, i5);
            if (k3 == null) {
                z4 = true;
            } else {
                Object obj2 = lVar.f6781b;
                if (k3.f6780a >= 0) {
                    int i6 = 0;
                    for (l lVar3 = k3; lVar3 != null; lVar3 = lVar3.f6783d) {
                        if (lVar3.f6780a == i4 && ((obj = lVar3.f6781b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z3 = false;
                            break;
                        }
                        i6++;
                    }
                    z3 = true;
                    if (!z3 || i6 < 8) {
                        z4 = z3;
                    } else {
                        long j7 = j4 + 1;
                        lVar.f6783d = k3;
                        l lVar4 = lVar;
                        r rVar = null;
                        r rVar2 = null;
                        while (lVar4 != null) {
                            long j8 = j7;
                            r rVar3 = new r(lVar4.f6780a, lVar4.f6781b, lVar4.f6782c, null, null);
                            rVar3.f6804h = rVar2;
                            if (rVar2 == null) {
                                rVar = rVar3;
                            } else {
                                rVar2.f6783d = rVar3;
                            }
                            lVar4 = lVar4.f6783d;
                            rVar2 = rVar3;
                            j7 = j8;
                        }
                        h(lVarArr, i5, new q(rVar));
                        j4 = j7;
                    }
                } else if (((q) k3).e(i4, obj2, lVar.f6782c) == null) {
                    j4 += j3;
                }
                z4 = false;
            }
            j3 = 1;
            if (z4) {
                j4++;
                lVar.f6783d = k3;
                h(lVarArr, i5, lVar);
            }
            lVar = lVar2;
        }
        this.f6755a = lVarArr;
        this.sizeCtl = l3 - (l3 >>> 2);
        this.baseCount = j4;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k3, V v3) {
        return (V) f(k3, v3, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return g(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v3 = get(obj);
        return v3 == null ? obj2 : v3;
    }

    @Override // j$.util.Map
    public final void forEach(j$.util.function.BiConsumer biConsumer) {
        biConsumer.getClass();
        l[] lVarArr = this.f6755a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l a3 = pVar.a();
            if (a3 == null) {
                return;
            }
            biConsumer.u(a3.f6781b, a3.f6782c);
        }
    }

    @Override // j$.util.Map
    public final void replaceAll(j$.util.function.BiFunction biFunction) {
        biFunction.getClass();
        l[] lVarArr = this.f6755a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l a3 = pVar.a();
            if (a3 == null) {
                return;
            }
            Object obj = a3.f6782c;
            Object obj2 = a3.f6781b;
            do {
                Object c3 = biFunction.c(obj2, obj);
                c3.getClass();
                if (g(obj2, c3, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x00f0, code lost:
        if (r5 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f2, code lost:
        a(1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00f7, code lost:
        return r5;
     */
    @Override // j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, j$.util.function.Function r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, j$.util.function.Function):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00aa, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfPresent(java.lang.Object r14, j$.util.function.BiFunction r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto Lbd
            if (r15 == 0) goto Lbd
            int r1 = r14.hashCode()
            int r1 = i(r1)
            j$.util.concurrent.l[] r2 = r13.f6755a
            r3 = 0
            r5 = r0
            r4 = 0
        L12:
            if (r2 == 0) goto Lb7
            int r6 = r2.length
            if (r6 != 0) goto L19
            goto Lb7
        L19:
            int r6 = r6 + (-1)
            r6 = r6 & r1
            j$.util.concurrent.l r7 = k(r2, r6)
            if (r7 != 0) goto L24
            goto Lae
        L24:
            int r8 = r7.f6780a
            r9 = -1
            if (r8 != r9) goto L2e
            j$.util.concurrent.l[] r2 = r13.d(r2, r7)
            goto L12
        L2e:
            monitor-enter(r7)
            j$.util.concurrent.l r10 = k(r2, r6)     // Catch: java.lang.Throwable -> L4b
            if (r10 != r7) goto Lab
            if (r8 < 0) goto L70
            r4 = 1
            r10 = r0
            r8 = r7
        L3a:
            int r11 = r8.f6780a     // Catch: java.lang.Throwable -> L4b
            if (r11 != r1) goto L65
            java.lang.Object r11 = r8.f6781b     // Catch: java.lang.Throwable -> L4b
            if (r11 == r14) goto L4e
            if (r11 == 0) goto L65
            boolean r11 = r14.equals(r11)     // Catch: java.lang.Throwable -> L4b
            if (r11 == 0) goto L65
            goto L4e
        L4b:
            r14 = move-exception
            goto Lb5
        L4e:
            java.lang.Object r5 = r8.f6782c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.c(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L59
            r8.f6782c = r5     // Catch: java.lang.Throwable -> L4b
            goto Lab
        L59:
            j$.util.concurrent.l r3 = r8.f6783d     // Catch: java.lang.Throwable -> L4b
            if (r10 == 0) goto L60
            r10.f6783d = r3     // Catch: java.lang.Throwable -> L4b
            goto L63
        L60:
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L63:
            r3 = -1
            goto Lab
        L65:
            j$.util.concurrent.l r10 = r8.f6783d     // Catch: java.lang.Throwable -> L4b
            if (r10 != 0) goto L6a
            goto Lab
        L6a:
            int r4 = r4 + 1
            r12 = r10
            r10 = r8
            r8 = r12
            goto L3a
        L70:
            boolean r8 = r7 instanceof j$.util.concurrent.q     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9e
            r4 = r7
            j$.util.concurrent.q r4 = (j$.util.concurrent.q) r4     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.r r8 = r4.f6798e     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            j$.util.concurrent.r r8 = r8.b(r1, r14, r0)     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            java.lang.Object r5 = r8.f6782c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.c(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L8c
            r8.f6782c = r5     // Catch: java.lang.Throwable -> L4b
            goto L9c
        L8c:
            boolean r3 = r4.f(r8)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L9b
            j$.util.concurrent.r r3 = r4.f6799f     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.l r3 = p(r3)     // Catch: java.lang.Throwable -> L4b
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L9b:
            r3 = -1
        L9c:
            r4 = 2
            goto Lab
        L9e:
            boolean r6 = r7 instanceof j$.util.concurrent.m     // Catch: java.lang.Throwable -> L4b
            if (r6 != 0) goto La3
            goto Lab
        La3:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r15 = "Recursive update"
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L4b
            throw r14     // Catch: java.lang.Throwable -> L4b
        Lab:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L12
        Lae:
            if (r3 == 0) goto Lb4
            long r14 = (long) r3
            r13.a(r14, r4)
        Lb4:
            return r5
        Lb5:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            throw r14
        Lb7:
            j$.util.concurrent.l[] r2 = r13.e()
            goto L12
        Lbd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0112, code lost:
        if (r4 == 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0114, code lost:
        a(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0118, code lost:
        return r5;
     */
    @Override // j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object compute(java.lang.Object r14, j$.util.function.BiFunction r15) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.compute(java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00dd, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object merge(java.lang.Object r18, java.lang.Object r19, j$.util.function.BiFunction r20) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.merge(java.lang.Object, java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    private final l[] e() {
        while (true) {
            l[] lVarArr = this.f6755a;
            if (lVarArr != null && lVarArr.length != 0) {
                return lVarArr;
            }
            int i3 = this.sizeCtl;
            if (i3 < 0) {
                Thread.yield();
            } else if (f6747h.c(this, f6748i, i3, -1)) {
                try {
                    l[] lVarArr2 = this.f6755a;
                    if (lVarArr2 != null) {
                        if (lVarArr2.length == 0) {
                        }
                        this.sizeCtl = i3;
                        return lVarArr2;
                    }
                    int i4 = i3 > 0 ? i3 : 16;
                    l[] lVarArr3 = new l[i4];
                    this.f6755a = lVarArr3;
                    i3 = i4 - (i4 >>> 2);
                    lVarArr2 = lVarArr3;
                    this.sizeCtl = i3;
                    return lVarArr2;
                } catch (Throwable th) {
                    this.sizeCtl = i3;
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r1.d(r25, r3, r5, r14) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x013f, code lost:
        if (r25.f6757c != r7) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0141, code lost:
        r25.f6757c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(r7, r8 << 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x019f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a(long r26, int r28) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.a(long, int):void");
    }

    final l[] d(l[] lVarArr, l lVar) {
        int i3;
        if (lVar instanceof g) {
            l[] lVarArr2 = ((g) lVar).f6773e;
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(lVarArr.length) | 32768;
            while (true) {
                if (lVarArr2 != this.f6756b || this.f6755a != lVarArr || (i3 = this.sizeCtl) >= 0 || (i3 >>> 16) != numberOfLeadingZeros || i3 == numberOfLeadingZeros + 1 || i3 == 65535 + numberOfLeadingZeros || this.transferIndex <= 0) {
                    break;
                } else if (f6747h.c(this, f6748i, i3, i3 + 1)) {
                    m(lVarArr, lVarArr2);
                    break;
                }
            }
            return lVarArr2;
        }
        return this.f6755a;
    }

    private final void o(int i3) {
        int length;
        int l3 = i3 >= 536870912 ? 1073741824 : l(i3 + (i3 >>> 1) + 1);
        while (true) {
            int i4 = this.sizeCtl;
            if (i4 < 0) {
                return;
            }
            l[] lVarArr = this.f6755a;
            if (lVarArr == null || (length = lVarArr.length) == 0) {
                int i5 = i4 > l3 ? i4 : l3;
                if (f6747h.c(this, f6748i, i4, -1)) {
                    try {
                        if (this.f6755a == lVarArr) {
                            this.f6755a = new l[i5];
                            i4 = i5 - (i5 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = i4;
                    }
                } else {
                    continue;
                }
            } else if (l3 <= i4 || length >= 1073741824) {
                return;
            } else {
                if (lVarArr == this.f6755a && f6747h.c(this, f6748i, i4, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                    m(lVarArr, null);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r13v12, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r5v17, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r5v22, types: [j$.util.concurrent.l] */
    private final void m(l[] lVarArr, l[] lVarArr2) {
        l[] lVarArr3;
        int i3;
        int i4;
        g gVar;
        ConcurrentHashMap<K, V> concurrentHashMap;
        int i5;
        l qVar;
        l qVar2;
        r rVar;
        int i6;
        ConcurrentHashMap<K, V> concurrentHashMap2 = this;
        l[] lVarArr4 = lVarArr;
        int length = lVarArr4.length;
        int i7 = f6746g;
        int i8 = i7 > 1 ? (length >>> 3) / i7 : length;
        int i9 = i8 < 16 ? 16 : i8;
        if (lVarArr2 == null) {
            try {
                l[] lVarArr5 = new l[length << 1];
                concurrentHashMap2.f6756b = lVarArr5;
                concurrentHashMap2.transferIndex = length;
                lVarArr3 = lVarArr5;
            } catch (Throwable unused) {
                concurrentHashMap2.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            lVarArr3 = lVarArr2;
        }
        int length2 = lVarArr3.length;
        g gVar2 = new g(lVarArr3);
        int i10 = 0;
        int i11 = 0;
        boolean z3 = true;
        boolean z4 = false;
        while (true) {
            if (z3) {
                int i12 = i11 - 1;
                if (i12 >= i10 || z4) {
                    i10 = i10;
                    i11 = i12;
                } else {
                    int i13 = concurrentHashMap2.transferIndex;
                    if (i13 <= 0) {
                        i11 = -1;
                    } else {
                        j$.sun.misc.a aVar = f6747h;
                        long j3 = f6749j;
                        int i14 = i13 > i9 ? i13 - i9 : 0;
                        int i15 = i10;
                        if (aVar.c(this, j3, i13, i14)) {
                            i11 = i13 - 1;
                            i10 = i14;
                        } else {
                            i10 = i15;
                            i11 = i12;
                        }
                    }
                }
                z3 = false;
            } else {
                int i16 = i10;
                r rVar2 = null;
                if (i11 < 0 || i11 >= length || (i5 = i11 + length) >= length2) {
                    i3 = i9;
                    i4 = length2;
                    gVar = gVar2;
                    if (z4) {
                        this.f6756b = null;
                        this.f6755a = lVarArr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    concurrentHashMap = this;
                    j$.sun.misc.a aVar2 = f6747h;
                    long j4 = f6748i;
                    int i17 = concurrentHashMap.sizeCtl;
                    int i18 = i11;
                    if (!aVar2.c(this, j4, i17, i17 - 1)) {
                        i11 = i18;
                    } else if (i17 - 2 != ((Integer.numberOfLeadingZeros(length) | 32768) << 16)) {
                        return;
                    } else {
                        i11 = length;
                        z3 = true;
                        z4 = true;
                    }
                } else {
                    l k3 = k(lVarArr4, i11);
                    if (k3 == null) {
                        z3 = b(lVarArr4, i11, gVar2);
                        concurrentHashMap = concurrentHashMap2;
                        i3 = i9;
                        i4 = length2;
                        gVar = gVar2;
                    } else {
                        int i19 = k3.f6780a;
                        if (i19 == -1) {
                            concurrentHashMap = concurrentHashMap2;
                            i3 = i9;
                            i4 = length2;
                            gVar = gVar2;
                            z3 = true;
                        } else {
                            synchronized (k3) {
                                try {
                                    if (k(lVarArr4, i11) == k3) {
                                        if (i19 >= 0) {
                                            int i20 = i19 & length;
                                            r rVar3 = k3;
                                            for (r rVar4 = k3.f6783d; rVar4 != null; rVar4 = rVar4.f6783d) {
                                                int i21 = rVar4.f6780a & length;
                                                if (i21 != i20) {
                                                    rVar3 = rVar4;
                                                    i20 = i21;
                                                }
                                            }
                                            if (i20 == 0) {
                                                rVar = null;
                                                rVar2 = rVar3;
                                            } else {
                                                rVar = rVar3;
                                            }
                                            l lVar = k3;
                                            while (lVar != rVar3) {
                                                int i22 = lVar.f6780a;
                                                Object obj = lVar.f6781b;
                                                int i23 = i9;
                                                Object obj2 = lVar.f6782c;
                                                if ((i22 & length) == 0) {
                                                    i6 = length2;
                                                    rVar2 = new l(i22, obj, obj2, rVar2);
                                                } else {
                                                    i6 = length2;
                                                    rVar = new l(i22, obj, obj2, rVar);
                                                }
                                                lVar = lVar.f6783d;
                                                i9 = i23;
                                                length2 = i6;
                                            }
                                            i3 = i9;
                                            i4 = length2;
                                            h(lVarArr3, i11, rVar2);
                                            h(lVarArr3, i5, rVar);
                                            h(lVarArr4, i11, gVar2);
                                            gVar = gVar2;
                                        } else {
                                            i3 = i9;
                                            i4 = length2;
                                            if (k3 instanceof q) {
                                                q qVar3 = (q) k3;
                                                r rVar5 = null;
                                                r rVar6 = null;
                                                l lVar2 = qVar3.f6799f;
                                                int i24 = 0;
                                                int i25 = 0;
                                                r rVar7 = null;
                                                while (lVar2 != null) {
                                                    q qVar4 = qVar3;
                                                    int i26 = lVar2.f6780a;
                                                    g gVar3 = gVar2;
                                                    r rVar8 = new r(i26, lVar2.f6781b, lVar2.f6782c, null, null);
                                                    if ((i26 & length) == 0) {
                                                        rVar8.f6804h = rVar6;
                                                        if (rVar6 == null) {
                                                            rVar2 = rVar8;
                                                        } else {
                                                            rVar6.f6783d = rVar8;
                                                        }
                                                        i24++;
                                                        rVar6 = rVar8;
                                                    } else {
                                                        rVar8.f6804h = rVar5;
                                                        if (rVar5 == null) {
                                                            rVar7 = rVar8;
                                                        } else {
                                                            rVar5.f6783d = rVar8;
                                                        }
                                                        i25++;
                                                        rVar5 = rVar8;
                                                    }
                                                    lVar2 = lVar2.f6783d;
                                                    qVar3 = qVar4;
                                                    gVar2 = gVar3;
                                                }
                                                q qVar5 = qVar3;
                                                g gVar4 = gVar2;
                                                if (i24 <= 6) {
                                                    qVar = p(rVar2);
                                                } else {
                                                    qVar = i25 != 0 ? new q(rVar2) : qVar5;
                                                }
                                                if (i25 <= 6) {
                                                    qVar2 = p(rVar7);
                                                } else {
                                                    qVar2 = i24 != 0 ? new q(rVar7) : qVar5;
                                                }
                                                h(lVarArr3, i11, qVar);
                                                h(lVarArr3, i5, qVar2);
                                                lVarArr4 = lVarArr;
                                                gVar = gVar4;
                                                h(lVarArr4, i11, gVar);
                                            }
                                        }
                                        z3 = true;
                                    } else {
                                        i3 = i9;
                                        i4 = length2;
                                    }
                                    gVar = gVar2;
                                } finally {
                                }
                            }
                            concurrentHashMap = this;
                        }
                    }
                }
                gVar2 = gVar;
                concurrentHashMap2 = concurrentHashMap;
                i10 = i16;
                i9 = i3;
                length2 = i4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long j() {
        c[] cVarArr = this.f6757c;
        long j3 = this.baseCount;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j3 += cVar.value;
                }
            }
        }
        return j3;
    }

    private final void n(l[] lVarArr, int i3) {
        int length = lVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        l k3 = k(lVarArr, i3);
        if (k3 == null || k3.f6780a < 0) {
            return;
        }
        synchronized (k3) {
            try {
                if (k(lVarArr, i3) == k3) {
                    r rVar = null;
                    l lVar = k3;
                    r rVar2 = null;
                    while (lVar != null) {
                        r rVar3 = new r(lVar.f6780a, lVar.f6781b, lVar.f6782c, null, null);
                        rVar3.f6804h = rVar2;
                        if (rVar2 == null) {
                            rVar = rVar3;
                        } else {
                            rVar2.f6783d = rVar3;
                        }
                        lVar = lVar.f6783d;
                        rVar2 = rVar3;
                    }
                    h(lVarArr, i3, new q(rVar));
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [j$.util.concurrent.l] */
    static l p(r rVar) {
        l lVar = null;
        l lVar2 = null;
        for (r rVar2 = rVar; rVar2 != null; rVar2 = rVar2.f6783d) {
            l lVar3 = new l(rVar2.f6780a, rVar2.f6781b, rVar2.f6782c);
            if (lVar2 == null) {
                lVar = lVar3;
            } else {
                lVar2.f6783d = lVar3;
            }
            lVar2 = lVar3;
        }
        return lVar;
    }
}
