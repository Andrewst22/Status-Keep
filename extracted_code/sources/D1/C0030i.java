package D1;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
/* renamed from: D1.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0030i extends C0025d implements SortedMap {

    /* renamed from: q  reason: collision with root package name */
    public SortedSet f269q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Y f270r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0030i(Y y3, SortedMap sortedMap) {
        super(y3, sortedMap);
        this.f270r = y3;
    }

    public SortedSet b() {
        return new C0031j(this.f270r, d());
    }

    @Override // D1.C0025d, java.util.AbstractMap, java.util.Map
    /* renamed from: c */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f269q;
        if (sortedSet == null) {
            SortedSet b3 = b();
            this.f269q = b3;
            return b3;
        }
        return sortedSet;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f241o;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C0030i(this.f270r, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C0030i(this.f270r, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C0030i(this.f270r, d().tailMap(obj));
    }
}
