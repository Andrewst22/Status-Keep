package D1;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
/* loaded from: classes.dex */
public final class T extends AbstractSequentialList implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    public final AbstractCollection f217m;

    /* renamed from: n  reason: collision with root package name */
    public final C1.e f218n;

    public T(List list, C1.e eVar) {
        list.getClass();
        this.f217m = (AbstractCollection) list;
        this.f218n = eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        return new Q(this, this.f217m.listIterator(i3), 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i4) {
        this.f217m.subList(i3, i4).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f217m.size();
    }
}
