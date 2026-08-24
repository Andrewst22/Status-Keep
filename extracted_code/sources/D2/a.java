package D2;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class a implements Iterator {

    /* renamed from: m  reason: collision with root package name */
    public final Object[] f320m;

    /* renamed from: n  reason: collision with root package name */
    public int f321n;

    public a(Object[] objArr) {
        this.f320m = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f321n < this.f320m.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f320m;
            int i3 = this.f321n;
            this.f321n = i3 + 1;
            return objArr[i3];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f321n--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
