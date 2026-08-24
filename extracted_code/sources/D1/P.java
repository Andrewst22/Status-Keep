package D1;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class P extends q0 {

    /* renamed from: n  reason: collision with root package name */
    public static final Object f211n = new Object();

    /* renamed from: m  reason: collision with root package name */
    public Object f212m;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f212m != f211n) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f212m;
        Object obj2 = f211n;
        if (obj != obj2) {
            this.f212m = obj2;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
