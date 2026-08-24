package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC0352g;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes2.dex */
final class L implements InterfaceC0376s, InterfaceC0352g, InterfaceC0369k {

    /* renamed from: a  reason: collision with root package name */
    boolean f6709a = false;

    /* renamed from: b  reason: collision with root package name */
    double f6710b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ B f6711c;

    @Override // java.util.Iterator
    public final Object next() {
        if (Y.f6738a) {
            Y.a(L.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // j$.util.InterfaceC0369k
    public final void b(Consumer consumer) {
        if (consumer instanceof InterfaceC0352g) {
            InterfaceC0352g interfaceC0352g = (InterfaceC0352g) consumer;
            Objects.requireNonNull(interfaceC0352g);
            while (hasNext()) {
                interfaceC0352g.d(nextDouble());
            }
            return;
        }
        Objects.requireNonNull(consumer);
        if (!Y.f6738a) {
            while (hasNext()) {
                consumer.accept(Double.valueOf(nextDouble()));
            }
            return;
        }
        Y.a(L.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public L(B b3) {
        this.f6711c = b3;
    }

    @Override // j$.util.function.InterfaceC0352g
    public final void d(double d3) {
        this.f6709a = true;
        this.f6710b = d3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f6709a) {
            this.f6711c.m(this);
        }
        return this.f6709a;
    }

    public final double nextDouble() {
        if (!this.f6709a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6709a = false;
        return this.f6710b;
    }
}
