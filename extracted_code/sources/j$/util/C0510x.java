package j$.util;

import j$.util.function.Consumer;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* renamed from: j$.util.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0510x implements PrimitiveIterator.OfLong {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0511y f7320a;

    private /* synthetic */ C0510x(InterfaceC0511y interfaceC0511y) {
        this.f7320a = interfaceC0511y;
    }

    public static /* synthetic */ C0510x a(InterfaceC0511y interfaceC0511y) {
        return new C0510x(interfaceC0511y);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0511y interfaceC0511y = this.f7320a;
        if (obj instanceof C0510x) {
            obj = ((C0510x) obj).f7320a;
        }
        return interfaceC0511y.equals(obj);
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        ((K) this.f7320a).b(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return ((K) this.f7320a).hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f7320a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Object next() {
        return ((K) this.f7320a).next();
    }

    @Override // java.util.PrimitiveIterator.OfLong
    public final /* synthetic */ long nextLong() {
        return ((K) this.f7320a).nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f7320a.remove();
    }

    @Override // java.util.PrimitiveIterator
    public final void forEachRemaining(LongConsumer longConsumer) {
        K k3 = (K) this.f7320a;
        j$.util.function.y yVar = (j$.util.function.y) longConsumer;
        Objects.requireNonNull(yVar);
        while (k3.hasNext()) {
            yVar.f(k3.nextLong());
        }
    }

    @Override // java.util.PrimitiveIterator.OfLong
    /* renamed from: forEachRemaining  reason: avoid collision after fix types in other method */
    public final void forEachRemaining2(LongConsumer longConsumer) {
        InterfaceC0511y interfaceC0511y = this.f7320a;
        j$.util.function.x b3 = j$.util.function.x.b(longConsumer);
        K k3 = (K) interfaceC0511y;
        Objects.requireNonNull(b3);
        while (k3.hasNext()) {
            b3.f(k3.nextLong());
        }
    }

    @Override // java.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final Long next() {
        K k3 = (K) this.f7320a;
        if (Y.f6738a) {
            Y.a(K.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(k3.nextLong());
    }
}
