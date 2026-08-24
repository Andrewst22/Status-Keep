package D1;

import java.util.AbstractList;
import java.util.ListIterator;
/* loaded from: classes.dex */
public final class Q extends p0 implements ListIterator {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f213n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ AbstractList f214o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(AbstractList abstractList, ListIterator listIterator, int i3) {
        super(listIterator);
        this.f213n = i3;
        this.f214o = abstractList;
    }

    @Override // D1.p0
    public final Object a(Object obj) {
        switch (this.f213n) {
            case 0:
                return ((S) this.f214o).f216n.apply(obj);
            default:
                return ((T) this.f214o).f218n.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f291m).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f291m).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f291m).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f291m).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
