package D1;

import a.AbstractC0155a;
import java.util.Iterator;
import java.util.ListIterator;
/* loaded from: classes.dex */
public final class H extends I {

    /* renamed from: o  reason: collision with root package name */
    public final transient int f194o;

    /* renamed from: p  reason: collision with root package name */
    public final transient int f195p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ I f196q;

    public H(I i3, int i4, int i5) {
        this.f196q = i3;
        this.f194o = i4;
        this.f195p = i5;
    }

    @Override // D1.D
    public final Object[] c() {
        return this.f196q.c();
    }

    @Override // D1.D
    public final int d() {
        return this.f196q.e() + this.f194o + this.f195p;
    }

    @Override // D1.D
    public final int e() {
        return this.f196q.e() + this.f194o;
    }

    @Override // D1.D
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0155a.l(i3, this.f195p);
        return this.f196q.get(i3 + this.f194o);
    }

    @Override // D1.I, D1.D, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // D1.I, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // D1.I, java.util.List
    /* renamed from: s */
    public final I subList(int i3, int i4) {
        AbstractC0155a.p(i3, i4, this.f195p);
        int i5 = this.f194o;
        return this.f196q.subList(i3 + i5, i4 + i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f195p;
    }

    @Override // D1.I, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i3) {
        return listIterator(i3);
    }
}
