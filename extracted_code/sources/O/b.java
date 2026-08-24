package O;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import n2.AbstractC0664g;
import s2.C0803b;
import t2.AbstractC0827d;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Map f1184a;

    /* renamed from: b  reason: collision with root package name */
    public final M.a f1185b;

    public b(Map map, boolean z3) {
        D2.i.e(map, "preferencesMap");
        this.f1184a = map;
        this.f1185b = new M.a(z3);
    }

    public final Map a() {
        C0803b c0803b;
        Set<Map.Entry> entrySet = this.f1184a.entrySet();
        D2.i.e(entrySet, "<this>");
        int q3 = AbstractC0664g.q(entrySet.size());
        if (q3 < 16) {
            q3 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(q3);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                D2.i.d(copyOf, "copyOf(this, size)");
                c0803b = new C0803b(key, copyOf);
            } else {
                c0803b = new C0803b(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(c0803b.f9222m, c0803b.f9223n);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        D2.i.d(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (!this.f1185b.f974a.get()) {
            return;
        }
        throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
    }

    public final Object c(e eVar) {
        D2.i.e(eVar, "key");
        Object obj = this.f1184a.get(eVar);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            D2.i.d(copyOf, "copyOf(this, size)");
            return copyOf;
        }
        return obj;
    }

    public final void d(e eVar, Object obj) {
        b();
        Map map = this.f1184a;
        if (obj == null) {
            b();
            map.remove(eVar);
        } else if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(AbstractC0827d.I((Set) obj));
            D2.i.d(unmodifiableSet, "unmodifiableSet(set.toSet())");
            map.put(eVar, unmodifiableSet);
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            D2.i.d(copyOf, "copyOf(this, size)");
            map.put(eVar, copyOf);
        } else {
            map.put(eVar, obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof O.b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            O.b r7 = (O.b) r7
            java.util.Map r0 = r7.f1184a
            java.util.Map r2 = r6.f1184a
            r3 = 1
            if (r0 != r2) goto L10
            return r3
        L10:
            int r0 = r0.size()
            int r4 = r2.size()
            if (r0 == r4) goto L1b
            return r1
        L1b:
            java.util.Map r7 = r7.f1184a
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L25
        L23:
            r1 = 1
            goto L63
        L25:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L2d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r4 = r2.get(r4)
            if (r4 == 0) goto L60
            java.lang.Object r0 = r0.getValue()
            boolean r5 = r0 instanceof byte[]
            if (r5 == 0) goto L5b
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L60
            byte[] r0 = (byte[]) r0
            byte[] r4 = (byte[]) r4
            boolean r0 = java.util.Arrays.equals(r0, r4)
            if (r0 == 0) goto L60
            r0 = 1
            goto L61
        L5b:
            boolean r0 = D2.i.a(r0, r4)
            goto L61
        L60:
            r0 = 0
        L61:
            if (r0 != 0) goto L2d
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: O.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        int i3 = 0;
        for (Map.Entry entry : this.f1184a.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashCode = Arrays.hashCode((byte[]) value);
            } else {
                hashCode = value.hashCode();
            }
            i3 += hashCode;
        }
        return i3;
    }

    public final String toString() {
        return AbstractC0827d.F(this.f1184a.entrySet(), ",\n", "{\n", "\n}", a.f1183n, 24);
    }

    public /* synthetic */ b(boolean z3) {
        this(new LinkedHashMap(), z3);
    }
}
