package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.InterfaceC0341c;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class L0 implements H0 {

    /* renamed from: a  reason: collision with root package name */
    private final Collection f6968a;

    @Override // j$.util.stream.H0
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ H0 q(long j3, long j4, IntFunction intFunction) {
        return AbstractC0482v0.w(this, j3, j4, intFunction);
    }

    @Override // j$.util.stream.H0
    public final H0 c(int i3) {
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public L0(Collection collection) {
        this.f6968a = collection;
    }

    @Override // j$.util.stream.H0
    public final Spliterator spliterator() {
        Collection collection = this.f6968a;
        return (collection instanceof InterfaceC0341c ? ((InterfaceC0341c) collection).stream() : AbstractC0482v0.e0(AbstractC0340b.w(collection), false)).spliterator();
    }

    @Override // j$.util.stream.H0
    public final void m(Object[] objArr, int i3) {
        for (Object obj : this.f6968a) {
            objArr[i3] = obj;
            i3++;
        }
    }

    @Override // j$.util.stream.H0
    public final Object[] p(IntFunction intFunction) {
        Collection collection = this.f6968a;
        return collection.toArray((Object[]) intFunction.j(collection.size()));
    }

    @Override // j$.util.stream.H0
    public final long count() {
        return this.f6968a.size();
    }

    @Override // j$.util.stream.H0
    public final void b(Consumer consumer) {
        AbstractC0340b.u(this.f6968a, consumer);
    }

    public final String toString() {
        Collection collection = this.f6968a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }
}
