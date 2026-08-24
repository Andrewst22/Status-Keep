package p;

import java.util.Collection;
import java.util.Iterator;
/* renamed from: p.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0722d implements Collection {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ C0723e f8724m;

    public C0722d(C0723e c0723e) {
        this.f8724m = c0723e;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f8724m.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (this.f8724m.f(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f8724m.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0719a(this.f8724m, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0723e c0723e = this.f8724m;
        int f3 = c0723e.f(obj);
        if (f3 >= 0) {
            c0723e.h(f3);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0723e c0723e = this.f8724m;
        int i3 = c0723e.f8750o;
        int i4 = 0;
        boolean z3 = false;
        while (i4 < i3) {
            if (collection.contains(c0723e.i(i4))) {
                c0723e.h(i4);
                i4--;
                i3--;
                z3 = true;
            }
            i4++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0723e c0723e = this.f8724m;
        int i3 = c0723e.f8750o;
        int i4 = 0;
        boolean z3 = false;
        while (i4 < i3) {
            if (!collection.contains(c0723e.i(i4))) {
                c0723e.h(i4);
                i4--;
                i3--;
                z3 = true;
            }
            i4++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f8724m.f8750o;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0723e c0723e = this.f8724m;
        int i3 = c0723e.f8750o;
        Object[] objArr = new Object[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = c0723e.i(i4);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f8724m.j(1, objArr);
    }
}
