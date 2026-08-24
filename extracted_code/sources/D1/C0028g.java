package D1;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
/* renamed from: D1.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028g extends C0031j implements NavigableSet {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Y f254p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0028g(Y y3, NavigableMap navigableMap) {
        super(y3, navigableMap);
        this.f254p = y3;
    }

    @Override // D1.C0031j
    /* renamed from: b */
    public final NavigableMap a() {
        return (NavigableMap) ((SortedMap) this.f246m);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return a().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C0026e) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C0028g(this.f254p, a().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return a().floorKey(obj);
    }

    @Override // D1.C0031j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return a().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return a().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C0024c c0024c = (C0024c) iterator();
        if (c0024c.hasNext()) {
            Object next = c0024c.next();
            c0024c.remove();
            return next;
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (descendingIterator.hasNext()) {
            Object next = descendingIterator.next();
            descendingIterator.remove();
            return next;
        }
        return null;
    }

    @Override // D1.C0031j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // D1.C0031j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z3) {
        return new C0028g(this.f254p, a().headMap(obj, z3));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z3, Object obj2, boolean z4) {
        return new C0028g(this.f254p, a().subMap(obj, z3, obj2, z4));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z3) {
        return new C0028g(this.f254p, a().tailMap(obj, z3));
    }
}
