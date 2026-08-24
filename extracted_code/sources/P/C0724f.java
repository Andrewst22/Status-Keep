package p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
/* renamed from: p.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0724f implements Collection, Set {

    /* renamed from: p  reason: collision with root package name */
    public static Object[] f8728p;

    /* renamed from: q  reason: collision with root package name */
    public static int f8729q;

    /* renamed from: r  reason: collision with root package name */
    public static Object[] f8730r;

    /* renamed from: s  reason: collision with root package name */
    public static int f8731s;

    /* renamed from: t  reason: collision with root package name */
    public static final Object f8732t = new Object();

    /* renamed from: u  reason: collision with root package name */
    public static final Object f8733u = new Object();

    /* renamed from: m  reason: collision with root package name */
    public int[] f8734m;

    /* renamed from: n  reason: collision with root package name */
    public Object[] f8735n;

    /* renamed from: o  reason: collision with root package name */
    public int f8736o;

    public static void b(int[] iArr, Object[] objArr, int i3) {
        if (iArr.length == 8) {
            synchronized (f8733u) {
                try {
                    if (f8731s < 10) {
                        objArr[0] = f8730r;
                        objArr[1] = iArr;
                        for (int i4 = i3 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f8730r = objArr;
                        f8731s++;
                    }
                } finally {
                }
            }
        } else if (iArr.length == 4) {
            synchronized (f8732t) {
                try {
                    if (f8729q < 10) {
                        objArr[0] = f8728p;
                        objArr[1] = iArr;
                        for (int i5 = i3 - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f8728p = objArr;
                        f8729q++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i3) {
        if (i3 == 8) {
            synchronized (f8733u) {
                try {
                    Object[] objArr = f8730r;
                    if (objArr != null) {
                        try {
                            this.f8735n = objArr;
                            f8730r = (Object[]) objArr[0];
                            int[] iArr = (int[]) objArr[1];
                            this.f8734m = iArr;
                            if (iArr != null) {
                                objArr[1] = null;
                                objArr[0] = null;
                                f8731s--;
                                return;
                            }
                        } catch (ClassCastException unused) {
                        }
                        System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                        f8730r = null;
                        f8731s = 0;
                    }
                } finally {
                }
            }
        } else if (i3 == 4) {
            synchronized (f8732t) {
                try {
                    Object[] objArr2 = f8728p;
                    if (objArr2 != null) {
                        try {
                            this.f8735n = objArr2;
                            f8728p = (Object[]) objArr2[0];
                            int[] iArr2 = (int[]) objArr2[1];
                            this.f8734m = iArr2;
                            if (iArr2 != null) {
                                objArr2[1] = null;
                                objArr2[0] = null;
                                f8729q--;
                                return;
                            }
                        } catch (ClassCastException unused2) {
                        }
                        System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                        f8728p = null;
                        f8729q = 0;
                    }
                } finally {
                }
            }
        }
        this.f8734m = new int[i3];
        this.f8735n = new Object[i3];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i3;
        int c3;
        int i4 = this.f8736o;
        if (obj == null) {
            c3 = d();
            i3 = 0;
        } else {
            int hashCode = obj.hashCode();
            i3 = hashCode;
            c3 = c(hashCode, obj);
        }
        if (c3 >= 0) {
            return false;
        }
        int i5 = ~c3;
        int[] iArr = this.f8734m;
        if (i4 >= iArr.length) {
            int i6 = 8;
            if (i4 >= 8) {
                i6 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i6 = 4;
            }
            Object[] objArr = this.f8735n;
            a(i6);
            if (i4 == this.f8736o) {
                int[] iArr2 = this.f8734m;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f8735n, 0, objArr.length);
                }
                b(iArr, objArr, i4);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i4) {
            int[] iArr3 = this.f8734m;
            int i7 = i5 + 1;
            int i8 = i4 - i5;
            System.arraycopy(iArr3, i5, iArr3, i7, i8);
            Object[] objArr2 = this.f8735n;
            System.arraycopy(objArr2, i5, objArr2, i7, i8);
        }
        int i9 = this.f8736o;
        if (i4 == i9) {
            int[] iArr4 = this.f8734m;
            if (i5 < iArr4.length) {
                iArr4[i5] = i3;
                this.f8735n[i5] = obj;
                this.f8736o = i9 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f8736o;
        int i3 = this.f8736o;
        int[] iArr = this.f8734m;
        boolean z3 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f8735n;
            a(size);
            int i4 = this.f8736o;
            if (i4 > 0) {
                System.arraycopy(iArr, 0, this.f8734m, 0, i4);
                System.arraycopy(objArr, 0, this.f8735n, 0, this.f8736o);
            }
            b(iArr, objArr, this.f8736o);
        }
        if (this.f8736o == i3) {
            for (Object obj : collection) {
                z3 |= add(obj);
            }
            return z3;
        }
        throw new ConcurrentModificationException();
    }

    public final int c(int i3, Object obj) {
        int i4 = this.f8736o;
        if (i4 == 0) {
            return -1;
        }
        try {
            int a3 = AbstractC0725g.a(i4, i3, this.f8734m);
            if (a3 < 0) {
                return a3;
            }
            if (obj.equals(this.f8735n[a3])) {
                return a3;
            }
            int i5 = a3 + 1;
            while (i5 < i4 && this.f8734m[i5] == i3) {
                if (obj.equals(this.f8735n[i5])) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = a3 - 1; i6 >= 0 && this.f8734m[i6] == i3; i6--) {
                if (obj.equals(this.f8735n[i6])) {
                    return i6;
                }
            }
            return ~i5;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i3 = this.f8736o;
        if (i3 != 0) {
            int[] iArr = this.f8734m;
            Object[] objArr = this.f8735n;
            this.f8734m = AbstractC0725g.f8737a;
            this.f8735n = AbstractC0725g.f8738b;
            this.f8736o = 0;
            b(iArr, objArr, i3);
        }
        if (this.f8736o == 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int c3;
        if (obj == null) {
            c3 = d();
        } else {
            c3 = c(obj.hashCode(), obj);
        }
        if (c3 >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public final int d() {
        int i3 = this.f8736o;
        if (i3 == 0) {
            return -1;
        }
        try {
            int a3 = AbstractC0725g.a(i3, 0, this.f8734m);
            if (a3 < 0) {
                return a3;
            }
            if (this.f8735n[a3] == null) {
                return a3;
            }
            int i4 = a3 + 1;
            while (i4 < i3 && this.f8734m[i4] == 0) {
                if (this.f8735n[i4] == null) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = a3 - 1; i5 >= 0 && this.f8734m[i5] == 0; i5--) {
                if (this.f8735n[i5] == null) {
                    return i5;
                }
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void e(int i3) {
        int i4 = this.f8736o;
        Object[] objArr = this.f8735n;
        Object obj = objArr[i3];
        if (i4 <= 1) {
            clear();
            return;
        }
        int i5 = i4 - 1;
        int[] iArr = this.f8734m;
        int i6 = 8;
        if (iArr.length > 8 && i4 < iArr.length / 3) {
            if (i4 > 8) {
                i6 = i4 + (i4 >> 1);
            }
            a(i6);
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f8734m, 0, i3);
                System.arraycopy(objArr, 0, this.f8735n, 0, i3);
            }
            if (i3 < i5) {
                int i7 = i3 + 1;
                int i8 = i5 - i3;
                System.arraycopy(iArr, i7, this.f8734m, i3, i8);
                System.arraycopy(objArr, i7, this.f8735n, i3, i8);
            }
        } else {
            if (i3 < i5) {
                int i9 = i3 + 1;
                int i10 = i5 - i3;
                System.arraycopy(iArr, i9, iArr, i3, i10);
                Object[] objArr2 = this.f8735n;
                System.arraycopy(objArr2, i9, objArr2, i3, i10);
            }
            this.f8735n[i5] = null;
        }
        if (i4 == this.f8736o) {
            this.f8736o = i5;
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f8736o != set.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f8736o; i3++) {
                try {
                    if (!set.contains(this.f8735n[i3])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f8734m;
        int i3 = this.f8736o;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += iArr[i5];
        }
        return i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.f8736o <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0719a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int c3;
        if (obj == null) {
            c3 = d();
        } else {
            c3 = c(obj.hashCode(), obj);
        }
        if (c3 >= 0) {
            e(c3);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        boolean z3 = false;
        for (Object obj : collection) {
            z3 |= remove(obj);
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z3 = false;
        for (int i3 = this.f8736o - 1; i3 >= 0; i3--) {
            if (!collection.contains(this.f8735n[i3])) {
                e(i3);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f8736o;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i3 = this.f8736o;
        Object[] objArr = new Object[i3];
        System.arraycopy(this.f8735n, 0, objArr, 0, i3);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8736o * 14);
        sb.append('{');
        for (int i3 = 0; i3 < this.f8736o; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = this.f8735n[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f8736o) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f8736o);
        }
        System.arraycopy(this.f8735n, 0, objArr, 0, this.f8736o);
        int length = objArr.length;
        int i3 = this.f8736o;
        if (length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
