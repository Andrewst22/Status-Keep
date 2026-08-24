package D1;

import a.AbstractC0155a;
import java.util.ListIterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class G extends q0 implements ListIterator {

    /* renamed from: m  reason: collision with root package name */
    public final int f191m;

    /* renamed from: n  reason: collision with root package name */
    public int f192n;

    /* renamed from: o  reason: collision with root package name */
    public final I f193o;

    public G(I i3, int i4) {
        int size = i3.size();
        AbstractC0155a.o(i4, size);
        this.f191m = size;
        this.f192n = i4;
        this.f193o = i3;
    }

    public final Object a(int i3) {
        return this.f193o.get(i3);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f192n < this.f191m) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f192n > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i3 = this.f192n;
            this.f192n = i3 + 1;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f192n;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i3 = this.f192n - 1;
            this.f192n = i3;
            return a(i3);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f192n - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
