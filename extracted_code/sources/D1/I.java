package D1;

import a.AbstractC0155a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public abstract class I extends D implements List, RandomAccess {

    /* renamed from: n  reason: collision with root package name */
    public static final G f197n = new G(b0.f231q, 0);

    public static b0 h(int i3, Object[] objArr) {
        if (i3 == 0) {
            return b0.f231q;
        }
        return new b0(i3, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [D1.F, D1.C] */
    public static F i() {
        return new C(4);
    }

    public static I j(Collection collection) {
        if (collection instanceof D) {
            I a3 = ((D) collection).a();
            if (a3.f()) {
                Object[] array = a3.toArray(D.f188m);
                return h(array.length, array);
            }
            return a3;
        }
        Object[] array2 = collection.toArray();
        r.c(array2.length, array2);
        return h(array2.length, array2);
    }

    public static b0 k(Object[] objArr) {
        if (objArr.length == 0) {
            return b0.f231q;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        r.c(objArr2.length, objArr2);
        return h(objArr2.length, objArr2);
    }

    public static b0 m() {
        return b0.f231q;
    }

    public static b0 n(Long l3, Long l4, Long l5, Long l6, Long l7) {
        Object[] objArr = {l3, l4, l5, l6, l7};
        r.c(5, objArr);
        return h(5, objArr);
    }

    public static b0 o(Object obj) {
        Object[] objArr = {obj};
        r.c(1, objArr);
        return h(1, objArr);
    }

    public static b0 p(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        r.c(2, objArr);
        return h(2, objArr);
    }

    public static b0 q(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        r.c(3, objArr);
        return h(3, objArr);
    }

    public static b0 r(a0 a0Var, Collection collection) {
        a0Var.getClass();
        if (!(collection instanceof Collection)) {
            Iterator it = collection.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collection = arrayList;
        }
        Object[] array = collection.toArray();
        r.c(array.length, array);
        Arrays.sort(array, a0Var);
        return h(array.length, array);
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // D1.D
    public int b(int i3, Object[] objArr) {
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i3 + i4] = get(i4);
        }
        return i3 + size;
    }

    @Override // D1.D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i3 = 0; i3 < size; i3++) {
                        if (android.support.v4.media.session.a.s(get(i3), list.get(i3))) {
                        }
                    }
                    return true;
                }
                Iterator it = list.iterator();
                for (Object obj2 : this) {
                    if (it.hasNext()) {
                        if (!android.support.v4.media.session.a.s(obj2, it.next())) {
                        }
                    }
                }
                return !it.hasNext();
            }
        }
        return false;
    }

    @Override // D1.D
    public final q0 g() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i3 = 1;
        for (int i4 = 0; i4 < size; i4++) {
            i3 = ~(~(get(i4).hashCode() + (i3 * 31)));
        }
        return i3;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (obj.equals(get(i3))) {
                return i3;
            }
        }
        return -1;
    }

    @Override // D1.D, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: l */
    public final G listIterator(int i3) {
        AbstractC0155a.o(i3, size());
        if (isEmpty()) {
            return f197n;
        }
        return new G(this, i3);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s */
    public I subList(int i3, int i4) {
        AbstractC0155a.p(i3, i4, size());
        int i5 = i4 - i3;
        if (i5 == size()) {
            return this;
        }
        if (i5 == 0) {
            return b0.f231q;
        }
        return new H(this, i3, i5);
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // D1.D
    public final I a() {
        return this;
    }
}
