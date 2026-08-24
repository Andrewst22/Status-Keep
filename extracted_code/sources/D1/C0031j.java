package D1;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
/* renamed from: D1.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0031j extends C0026e implements SortedSet {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Y f272o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0031j(Y y3, SortedMap sortedMap) {
        super(y3, sortedMap);
        this.f272o = y3;
    }

    public SortedMap a() {
        return (SortedMap) this.f246m;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C0031j(this.f272o, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C0031j(this.f272o, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C0031j(this.f272o, a().tailMap(obj));
    }
}
