package G2;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class b implements Iterator {

    /* renamed from: m  reason: collision with root package name */
    public final int f388m;

    /* renamed from: n  reason: collision with root package name */
    public final int f389n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f390o;

    /* renamed from: p  reason: collision with root package name */
    public int f391p;

    public b(int i3, int i4, int i5) {
        this.f388m = i5;
        this.f389n = i4;
        boolean z3 = false;
        if (i5 <= 0 ? i3 >= i4 : i3 <= i4) {
            z3 = true;
        }
        this.f390o = z3;
        this.f391p = z3 ? i3 : i4;
    }

    public final int a() {
        int i3 = this.f391p;
        if (i3 == this.f389n) {
            if (this.f390o) {
                this.f390o = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f391p = this.f388m + i3;
        }
        return i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f390o;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
