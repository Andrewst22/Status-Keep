package p;

import java.util.ConcurrentModificationException;
import java.util.Map;
/* renamed from: p.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0727i {

    /* renamed from: p  reason: collision with root package name */
    public static Object[] f8744p;

    /* renamed from: q  reason: collision with root package name */
    public static int f8745q;

    /* renamed from: r  reason: collision with root package name */
    public static Object[] f8746r;

    /* renamed from: s  reason: collision with root package name */
    public static int f8747s;

    /* renamed from: m  reason: collision with root package name */
    public int[] f8748m = AbstractC0725g.f8737a;

    /* renamed from: n  reason: collision with root package name */
    public Object[] f8749n = AbstractC0725g.f8738b;

    /* renamed from: o  reason: collision with root package name */
    public int f8750o = 0;

    public static void b(int[] iArr, Object[] objArr, int i3) {
        if (iArr.length == 8) {
            synchronized (C0727i.class) {
                try {
                    if (f8747s < 10) {
                        objArr[0] = f8746r;
                        objArr[1] = iArr;
                        for (int i4 = (i3 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f8746r = objArr;
                        f8747s++;
                    }
                } finally {
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0727i.class) {
                try {
                    if (f8745q < 10) {
                        objArr[0] = f8744p;
                        objArr[1] = iArr;
                        for (int i5 = (i3 << 1) - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f8744p = objArr;
                        f8745q++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i3) {
        if (i3 == 8) {
            synchronized (C0727i.class) {
                try {
                    Object[] objArr = f8746r;
                    if (objArr != null) {
                        this.f8749n = objArr;
                        f8746r = (Object[]) objArr[0];
                        this.f8748m = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f8747s--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i3 == 4) {
            synchronized (C0727i.class) {
                try {
                    Object[] objArr2 = f8744p;
                    if (objArr2 != null) {
                        this.f8749n = objArr2;
                        f8744p = (Object[]) objArr2[0];
                        this.f8748m = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f8745q--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f8748m = new int[i3];
        this.f8749n = new Object[i3 << 1];
    }

    public final int c(int i3, Object obj) {
        int i4 = this.f8750o;
        if (i4 == 0) {
            return -1;
        }
        try {
            int a3 = AbstractC0725g.a(i4, i3, this.f8748m);
            if (a3 < 0) {
                return a3;
            }
            if (obj.equals(this.f8749n[a3 << 1])) {
                return a3;
            }
            int i5 = a3 + 1;
            while (i5 < i4 && this.f8748m[i5] == i3) {
                if (obj.equals(this.f8749n[i5 << 1])) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = a3 - 1; i6 >= 0 && this.f8748m[i6] == i3; i6--) {
                if (obj.equals(this.f8749n[i6 << 1])) {
                    return i6;
                }
            }
            return ~i5;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i3 = this.f8750o;
        if (i3 > 0) {
            int[] iArr = this.f8748m;
            Object[] objArr = this.f8749n;
            this.f8748m = AbstractC0725g.f8737a;
            this.f8749n = AbstractC0725g.f8738b;
            this.f8750o = 0;
            b(iArr, objArr, i3);
        }
        if (this.f8750o <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean containsKey(Object obj) {
        if (d(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (f(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(Object obj) {
        if (obj == null) {
            return e();
        }
        return c(obj.hashCode(), obj);
    }

    public final int e() {
        int i3 = this.f8750o;
        if (i3 == 0) {
            return -1;
        }
        try {
            int a3 = AbstractC0725g.a(i3, 0, this.f8748m);
            if (a3 < 0) {
                return a3;
            }
            if (this.f8749n[a3 << 1] == null) {
                return a3;
            }
            int i4 = a3 + 1;
            while (i4 < i3 && this.f8748m[i4] == 0) {
                if (this.f8749n[i4 << 1] == null) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = a3 - 1; i5 >= 0 && this.f8748m[i5] == 0; i5--) {
                if (this.f8749n[i5 << 1] == null) {
                    return i5;
                }
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0727i) {
            C0727i c0727i = (C0727i) obj;
            if (this.f8750o != c0727i.f8750o) {
                return false;
            }
            for (int i3 = 0; i3 < this.f8750o; i3++) {
                Object g3 = g(i3);
                Object i4 = i(i3);
                Object orDefault = c0727i.getOrDefault(g3, null);
                if (i4 == null) {
                    if (orDefault != null || !c0727i.containsKey(g3)) {
                        return false;
                    }
                } else if (!i4.equals(orDefault)) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f8750o != map.size()) {
                return false;
            }
            for (int i5 = 0; i5 < this.f8750o; i5++) {
                Object g4 = g(i5);
                Object i6 = i(i5);
                Object obj2 = map.get(g4);
                if (i6 == null) {
                    if (obj2 != null || !map.containsKey(g4)) {
                        return false;
                    }
                } else if (!i6.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int f(Object obj) {
        int i3 = this.f8750o * 2;
        Object[] objArr = this.f8749n;
        if (obj == null) {
            for (int i4 = 1; i4 < i3; i4 += 2) {
                if (objArr[i4] == null) {
                    return i4 >> 1;
                }
            }
            return -1;
        }
        for (int i5 = 1; i5 < i3; i5 += 2) {
            if (obj.equals(objArr[i5])) {
                return i5 >> 1;
            }
        }
        return -1;
    }

    public final Object g(int i3) {
        return this.f8749n[i3 << 1];
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d3 = d(obj);
        if (d3 >= 0) {
            return this.f8749n[(d3 << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int i3) {
        Object[] objArr = this.f8749n;
        int i4 = i3 << 1;
        Object obj = objArr[i4 + 1];
        int i5 = this.f8750o;
        if (i5 <= 1) {
            clear();
        } else {
            int i6 = i5 - 1;
            int[] iArr = this.f8748m;
            int i7 = 8;
            if (iArr.length > 8 && i5 < iArr.length / 3) {
                if (i5 > 8) {
                    i7 = i5 + (i5 >> 1);
                }
                a(i7);
                if (i5 == this.f8750o) {
                    if (i3 > 0) {
                        System.arraycopy(iArr, 0, this.f8748m, 0, i3);
                        System.arraycopy(objArr, 0, this.f8749n, 0, i4);
                    }
                    if (i3 < i6) {
                        int i8 = i3 + 1;
                        int i9 = i6 - i3;
                        System.arraycopy(iArr, i8, this.f8748m, i3, i9);
                        System.arraycopy(objArr, i8 << 1, this.f8749n, i4, i9 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i3 < i6) {
                    int i10 = i3 + 1;
                    int i11 = i6 - i3;
                    System.arraycopy(iArr, i10, iArr, i3, i11);
                    Object[] objArr2 = this.f8749n;
                    System.arraycopy(objArr2, i10 << 1, objArr2, i4, i11 << 1);
                }
                Object[] objArr3 = this.f8749n;
                int i12 = i6 << 1;
                objArr3[i12] = null;
                objArr3[i12 + 1] = null;
            }
            if (i5 == this.f8750o) {
                this.f8750o = i6;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return obj;
    }

    public final int hashCode() {
        int hashCode;
        int[] iArr = this.f8748m;
        Object[] objArr = this.f8749n;
        int i3 = this.f8750o;
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            Object obj = objArr[i4];
            int i7 = iArr[i5];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i6 += hashCode ^ i7;
            i5++;
            i4 += 2;
        }
        return i6;
    }

    public final Object i(int i3) {
        return this.f8749n[(i3 << 1) + 1];
    }

    public final boolean isEmpty() {
        if (this.f8750o <= 0) {
            return true;
        }
        return false;
    }

    public final Object put(Object obj, Object obj2) {
        int i3;
        int c3;
        int i4 = this.f8750o;
        if (obj == null) {
            c3 = e();
            i3 = 0;
        } else {
            int hashCode = obj.hashCode();
            i3 = hashCode;
            c3 = c(hashCode, obj);
        }
        if (c3 >= 0) {
            int i5 = (c3 << 1) + 1;
            Object[] objArr = this.f8749n;
            Object obj3 = objArr[i5];
            objArr[i5] = obj2;
            return obj3;
        }
        int i6 = ~c3;
        int[] iArr = this.f8748m;
        if (i4 >= iArr.length) {
            int i7 = 8;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i7 = 4;
            }
            Object[] objArr2 = this.f8749n;
            a(i7);
            if (i4 == this.f8750o) {
                int[] iArr2 = this.f8748m;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f8749n, 0, objArr2.length);
                }
                b(iArr, objArr2, i4);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr3 = this.f8748m;
            int i8 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i8, i4 - i6);
            Object[] objArr3 = this.f8749n;
            System.arraycopy(objArr3, i6 << 1, objArr3, i8 << 1, (this.f8750o - i6) << 1);
        }
        int i9 = this.f8750o;
        if (i4 == i9) {
            int[] iArr4 = this.f8748m;
            if (i6 < iArr4.length) {
                iArr4[i6] = i3;
                Object[] objArr4 = this.f8749n;
                int i10 = i6 << 1;
                objArr4[i10] = obj;
                objArr4[i10 + 1] = obj2;
                this.f8750o = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        if (orDefault == null) {
            return put(obj, obj2);
        }
        return orDefault;
    }

    public final Object remove(Object obj) {
        int d3 = d(obj);
        if (d3 >= 0) {
            return h(d3);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d3 = d(obj);
        if (d3 >= 0) {
            int i3 = (d3 << 1) + 1;
            Object[] objArr = this.f8749n;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        return null;
    }

    public final int size() {
        return this.f8750o;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8750o * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f8750o; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object g3 = g(i3);
            if (g3 != this) {
                sb.append(g3);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i4 = i(i3);
            if (i4 != this) {
                sb.append(i4);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int d3 = d(obj);
        if (d3 >= 0) {
            Object i3 = i(d3);
            if (obj2 == i3 || (obj2 != null && obj2.equals(i3))) {
                h(d3);
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d3 = d(obj);
        if (d3 >= 0) {
            Object i3 = i(d3);
            if (i3 == obj2 || (obj2 != null && obj2.equals(i3))) {
                int i4 = (d3 << 1) + 1;
                Object[] objArr = this.f8749n;
                Object obj4 = objArr[i4];
                objArr[i4] = obj3;
                return true;
            }
            return false;
        }
        return false;
    }
}
