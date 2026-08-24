package j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class b implements Collection, Serializable {
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a  reason: collision with root package name */
    final ConcurrentHashMap f6770a;

    @Override // java.util.Collection
    public abstract boolean contains(Object obj);

    @Override // java.util.Collection, java.lang.Iterable
    public abstract Iterator iterator();

    @Override // java.util.Collection
    public abstract boolean remove(Object obj);

    @Override // java.util.Collection
    public final Object[] toArray() {
        long j3 = this.f6770a.j();
        if (j3 < 0) {
            j3 = 0;
        }
        if (j3 > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i3 = (int) j3;
        Object[] objArr = new Object[i3];
        Iterator it = iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i4 == i3) {
                if (i3 >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i5 = i3 < 1073741819 ? (i3 >>> 1) + 1 + i3 : 2147483639;
                objArr = Arrays.copyOf(objArr, i5);
                i3 = i5;
            }
            objArr[i4] = next;
            i4++;
        }
        return i4 == i3 ? objArr : Arrays.copyOf(objArr, i4);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        long j3 = this.f6770a.j();
        if (j3 < 0) {
            j3 = 0;
        }
        if (j3 > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i3 = (int) j3;
        Object[] objArr2 = objArr.length >= i3 ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        int length = objArr2.length;
        Iterator it = iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i4 == length) {
                if (length >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i5 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                objArr2 = Arrays.copyOf(objArr2, i5);
                length = i5;
            }
            objArr2[i4] = next;
            i4++;
        }
        if (objArr != objArr2 || i4 >= length) {
            return i4 == length ? objArr2 : Arrays.copyOf(objArr2, i4);
        }
        objArr2[i4] = null;
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(ConcurrentHashMap concurrentHashMap) {
        this.f6770a = concurrentHashMap;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f6770a.clear();
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f6770a.size();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f6770a.isEmpty();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsAll(java.util.Collection r2) {
        /*
            r1 = this;
            if (r2 == r1) goto L1a
            java.util.Iterator r2 = r2.iterator()
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r2.next()
            if (r0 == 0) goto L18
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L6
        L18:
            r2 = 0
            return r2
        L1a:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.b.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        collection.getClass();
        l[] lVarArr = this.f6770a.f6755a;
        boolean z3 = false;
        if (lVarArr == null) {
            return false;
        }
        if ((collection instanceof Set) && collection.size() > lVarArr.length) {
            Iterator it = iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z3 = true;
                }
            }
        } else {
            for (Object obj : collection) {
                z3 |= remove(obj);
            }
        }
        return z3;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        Iterator it = iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z3 = true;
            }
        }
        return z3;
    }
}
