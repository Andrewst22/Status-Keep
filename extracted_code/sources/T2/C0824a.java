package t2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
/* renamed from: t2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0824a implements Collection {

    /* renamed from: m  reason: collision with root package name */
    public final Object[] f9257m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f9258n;

    public C0824a(Object[] objArr, boolean z3) {
        this.f9257m = objArr;
        this.f9258n = z3;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int i3;
        Object[] objArr = this.f9257m;
        D2.i.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i3 = 0;
            while (i3 < length) {
                if (objArr[i3] == null) {
                    break;
                }
                i3++;
            }
            i3 = -1;
        } else {
            int length2 = objArr.length;
            for (int i4 = 0; i4 < length2; i4++) {
                if (obj.equals(objArr[i4])) {
                    i3 = i4;
                    break;
                }
            }
            i3 = -1;
        }
        if (i3 < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        D2.i.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f9257m.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new D2.a(this.f9257m);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f9257m.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f9257m;
        if (this.f9258n && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        D2.i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        D2.i.e(objArr, "array");
        return D2.i.i(this, objArr);
    }
}
