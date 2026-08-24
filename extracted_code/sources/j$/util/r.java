package j$.util;

import j$.util.function.C0351f;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0352g;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class r implements PrimitiveIterator.OfDouble {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0376s f6879a;

    private /* synthetic */ r(InterfaceC0376s interfaceC0376s) {
        this.f6879a = interfaceC0376s;
    }

    public static /* synthetic */ r a(InterfaceC0376s interfaceC0376s) {
        return new r(interfaceC0376s);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0376s interfaceC0376s = this.f6879a;
        if (obj instanceof r) {
            obj = ((r) obj).f6879a;
        }
        return interfaceC0376s.equals(obj);
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        ((L) this.f6879a).b(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return ((L) this.f6879a).hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f6879a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final /* synthetic */ Object next() {
        return ((L) this.f6879a).next();
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    public final /* synthetic */ double nextDouble() {
        return ((L) this.f6879a).nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f6879a.remove();
    }

    @Override // java.util.PrimitiveIterator
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        L l3 = (L) this.f6879a;
        InterfaceC0352g interfaceC0352g = (InterfaceC0352g) doubleConsumer;
        Objects.requireNonNull(interfaceC0352g);
        while (l3.hasNext()) {
            interfaceC0352g.d(l3.nextDouble());
        }
    }

    @Override // java.util.PrimitiveIterator.OfDouble
    /* renamed from: forEachRemaining  reason: avoid collision after fix types in other method */
    public final void forEachRemaining2(DoubleConsumer doubleConsumer) {
        InterfaceC0376s interfaceC0376s = this.f6879a;
        C0351f b3 = C0351f.b(doubleConsumer);
        L l3 = (L) interfaceC0376s;
        Objects.requireNonNull(b3);
        while (l3.hasNext()) {
            b3.d(l3.nextDouble());
        }
    }

    @Override // java.util.PrimitiveIterator.OfDouble, java.util.Iterator
    public final Double next() {
        L l3 = (L) this.f6879a;
        if (Y.f6738a) {
            Y.a(L.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(l3.nextDouble());
    }
}
