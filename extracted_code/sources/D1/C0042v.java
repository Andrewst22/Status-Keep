package D1;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* renamed from: D1.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042v extends AbstractMap implements Serializable {

    /* renamed from: v  reason: collision with root package name */
    public static final Object f305v = new Object();

    /* renamed from: m  reason: collision with root package name */
    public transient Object f306m;

    /* renamed from: n  reason: collision with root package name */
    public transient int[] f307n;

    /* renamed from: o  reason: collision with root package name */
    public transient Object[] f308o;

    /* renamed from: p  reason: collision with root package name */
    public transient Object[] f309p;

    /* renamed from: q  reason: collision with root package name */
    public transient int f310q;

    /* renamed from: r  reason: collision with root package name */
    public transient int f311r;

    /* renamed from: s  reason: collision with root package name */
    public transient C0040t f312s;

    /* renamed from: t  reason: collision with root package name */
    public transient C0040t f313t;

    /* renamed from: u  reason: collision with root package name */
    public transient C0035n f314u;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, D1.v] */
    public static C0042v a() {
        ?? abstractMap = new AbstractMap();
        abstractMap.f310q = Math.min(Math.max(3, 1), 1073741823);
        return abstractMap;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, D1.v] */
    public static C0042v b(int i3) {
        ?? abstractMap = new AbstractMap();
        if (i3 >= 0) {
            abstractMap.f310q = Math.min(Math.max(i3, 1), 1073741823);
            return abstractMap;
        }
        throw new IllegalArgumentException("Expected size must be >= 0");
    }

    public final Map c() {
        Object obj = this.f306m;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.f310q += 32;
        Map c3 = c();
        if (c3 != null) {
            this.f310q = Math.min(Math.max(size(), 3), 1073741823);
            c3.clear();
            this.f306m = null;
            this.f311r = 0;
            return;
        }
        Arrays.fill(j(), 0, this.f311r, (Object) null);
        Arrays.fill(k(), 0, this.f311r, (Object) null);
        Object obj = this.f306m;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(i(), 0, this.f311r, 0);
        this.f311r = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map c3 = c();
        if (c3 != null) {
            return c3.containsKey(obj);
        }
        if (e(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map c3 = c();
        if (c3 != null) {
            return c3.containsValue(obj);
        }
        for (int i3 = 0; i3 < this.f311r; i3++) {
            if (android.support.v4.media.session.a.s(obj, k()[i3])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.f310q & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int t3 = r.t(obj);
        int d3 = d();
        Object obj2 = this.f306m;
        Objects.requireNonNull(obj2);
        int u3 = r.u(t3 & d3, obj2);
        if (u3 == 0) {
            return -1;
        }
        int i3 = ~d3;
        int i4 = t3 & i3;
        do {
            int i5 = u3 - 1;
            int i6 = i()[i5];
            if ((i6 & i3) == i4 && android.support.v4.media.session.a.s(obj, j()[i5])) {
                return i5;
            }
            u3 = i6 & d3;
        } while (u3 != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0040t c0040t = this.f313t;
        if (c0040t == null) {
            C0040t c0040t2 = new C0040t(this, 0);
            this.f313t = c0040t2;
            return c0040t2;
        }
        return c0040t;
    }

    public final void f(int i3, int i4) {
        Object obj = this.f306m;
        Objects.requireNonNull(obj);
        int[] i5 = i();
        Object[] j3 = j();
        Object[] k3 = k();
        int size = size();
        int i6 = size - 1;
        if (i3 < i6) {
            Object obj2 = j3[i6];
            j3[i3] = obj2;
            k3[i3] = k3[i6];
            j3[i6] = null;
            k3[i6] = null;
            i5[i3] = i5[i6];
            i5[i6] = 0;
            int t3 = r.t(obj2) & i4;
            int u3 = r.u(t3, obj);
            if (u3 == size) {
                r.v(t3, i3 + 1, obj);
                return;
            }
            while (true) {
                int i7 = u3 - 1;
                int i8 = i5[i7];
                int i9 = i8 & i4;
                if (i9 == size) {
                    i5[i7] = r.o(i8, i3 + 1, i4);
                    return;
                }
                u3 = i9;
            }
        } else {
            j3[i3] = null;
            k3[i3] = null;
            i5[i3] = 0;
        }
    }

    public final boolean g() {
        if (this.f306m == null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map c3 = c();
        if (c3 != null) {
            return c3.get(obj);
        }
        int e2 = e(obj);
        if (e2 == -1) {
            return null;
        }
        return k()[e2];
    }

    public final Object h(Object obj) {
        boolean g3 = g();
        Object obj2 = f305v;
        if (g3) {
            return obj2;
        }
        int d3 = d();
        Object obj3 = this.f306m;
        Objects.requireNonNull(obj3);
        int q3 = r.q(obj, null, d3, obj3, i(), j(), null);
        if (q3 == -1) {
            return obj2;
        }
        Object obj4 = k()[q3];
        f(q3, d3);
        this.f311r--;
        this.f310q += 32;
        return obj4;
    }

    public final int[] i() {
        int[] iArr = this.f307n;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object[] j() {
        Object[] objArr = this.f308o;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] k() {
        Object[] objArr = this.f309p;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C0040t c0040t = this.f312s;
        if (c0040t == null) {
            C0040t c0040t2 = new C0040t(this, 1);
            this.f312s = c0040t2;
            return c0040t2;
        }
        return c0040t;
    }

    public final int l(int i3, int i4, int i5, int i6) {
        Object g3 = r.g(i4);
        int i7 = i4 - 1;
        if (i6 != 0) {
            r.v(i5 & i7, i6 + 1, g3);
        }
        Object obj = this.f306m;
        Objects.requireNonNull(obj);
        int[] i8 = i();
        for (int i9 = 0; i9 <= i3; i9++) {
            int u3 = r.u(i9, obj);
            while (u3 != 0) {
                int i10 = u3 - 1;
                int i11 = i8[i10];
                int i12 = ((~i3) & i11) | i9;
                int i13 = i12 & i7;
                int u4 = r.u(i13, g3);
                r.v(i13, u3, g3);
                i8[i10] = r.o(i12, u4, i7);
                u3 = i11 & i3;
            }
        }
        this.f306m = g3;
        this.f310q = r.o(this.f310q, 32 - Integer.numberOfLeadingZeros(i7), 31);
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0104 -> B:40:0x00ea). Please submit an issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D1.C0042v.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map c3 = c();
        if (c3 != null) {
            return c3.remove(obj);
        }
        Object h3 = h(obj);
        if (h3 == f305v) {
            return null;
        }
        return h3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map c3 = c();
        if (c3 != null) {
            return c3.size();
        }
        return this.f311r;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0035n c0035n = this.f314u;
        if (c0035n == null) {
            C0035n c0035n2 = new C0035n(1, this);
            this.f314u = c0035n2;
            return c0035n2;
        }
        return c0035n;
    }
}
