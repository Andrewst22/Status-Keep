package D1;

import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class p0 implements Iterator {

    /* renamed from: m  reason: collision with root package name */
    public final Iterator f291m;

    public p0(Iterator it) {
        it.getClass();
        this.f291m = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f291m.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f291m.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f291m.remove();
    }
}
