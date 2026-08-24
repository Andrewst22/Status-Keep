package D1;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
/* loaded from: classes.dex */
public final class m0 extends l0 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f283m).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f283m.iterator();
        it.getClass();
        C1.g gVar = this.f284n;
        gVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (gVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [D1.l0, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new l0(((SortedSet) this.f283m).headSet(obj), this.f284n);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f283m;
        while (true) {
            Object last = sortedSet.last();
            if (this.f284n.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [D1.l0, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new l0(((SortedSet) this.f283m).subSet(obj, obj2), this.f284n);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [D1.l0, java.util.SortedSet] */
    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new l0(((SortedSet) this.f283m).tailSet(obj), this.f284n);
    }
}
