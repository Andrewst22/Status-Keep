package D1;

import java.util.List;
import java.util.ListIterator;
/* renamed from: D1.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032k extends C0024c implements ListIterator {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ C0033l f274q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0032k(C0033l c0033l) {
        super(c0033l);
        this.f274q = c0033l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C0033l c0033l = this.f274q;
        boolean isEmpty = c0033l.isEmpty();
        b().add(obj);
        c0033l.f282r.f222q++;
        if (isEmpty) {
            c0033l.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f235n;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0032k(C0033l c0033l, int i3) {
        super(c0033l, ((List) c0033l.f278n).listIterator(i3));
        this.f274q = c0033l;
    }
}
