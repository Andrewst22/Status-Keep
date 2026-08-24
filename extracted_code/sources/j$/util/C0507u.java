package j$.util;

import j$.util.function.C0361p;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0362q;
import java.util.Objects;
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* renamed from: j$.util.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0507u implements PrimitiveIterator.OfInt {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0508v f7318a;

    private /* synthetic */ C0507u(InterfaceC0508v interfaceC0508v) {
        this.f7318a = interfaceC0508v;
    }

    public static /* synthetic */ C0507u a(InterfaceC0508v interfaceC0508v) {
        return new C0507u(interfaceC0508v);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0508v interfaceC0508v = this.f7318a;
        if (obj instanceof C0507u) {
            obj = ((C0507u) obj).f7318a;
        }
        return interfaceC0508v.equals(obj);
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        ((J) this.f7318a).b(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return ((J) this.f7318a).hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f7318a.hashCode();
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Object next() {
        return ((J) this.f7318a).next();
    }

    @Override // java.util.PrimitiveIterator.OfInt
    public final /* synthetic */ int nextInt() {
        return ((J) this.f7318a).nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f7318a.remove();
    }

    @Override // java.util.PrimitiveIterator
    public final void forEachRemaining(IntConsumer intConsumer) {
        J j3 = (J) this.f7318a;
        InterfaceC0362q interfaceC0362q = (InterfaceC0362q) intConsumer;
        Objects.requireNonNull(interfaceC0362q);
        while (j3.hasNext()) {
            interfaceC0362q.e(j3.nextInt());
        }
    }

    @Override // java.util.PrimitiveIterator.OfInt
    /* renamed from: forEachRemaining  reason: avoid collision after fix types in other method */
    public final void forEachRemaining2(IntConsumer intConsumer) {
        InterfaceC0508v interfaceC0508v = this.f7318a;
        C0361p b3 = C0361p.b(intConsumer);
        J j3 = (J) interfaceC0508v;
        Objects.requireNonNull(b3);
        while (j3.hasNext()) {
            b3.e(j3.nextInt());
        }
    }

    @Override // java.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final Integer next() {
        J j3 = (J) this.f7318a;
        if (Y.f6738a) {
            Y.a(J.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(j3.nextInt());
    }
}
