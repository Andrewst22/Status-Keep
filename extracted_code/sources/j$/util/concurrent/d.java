package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
final class d extends AbstractC0342a implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        l lVar = this.f6789b;
        if (lVar == null) {
            throw new NoSuchElementException();
        }
        Object obj = lVar.f6781b;
        Object obj2 = lVar.f6782c;
        this.f6769j = lVar;
        a();
        return new k(obj, obj2, this.f6768i);
    }
}
