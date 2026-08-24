package j$.util;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC0362q;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes2.dex */
final class J implements InterfaceC0508v, InterfaceC0362q, InterfaceC0369k {

    /* renamed from: a  reason: collision with root package name */
    boolean f6703a = false;

    /* renamed from: b  reason: collision with root package name */
    int f6704b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ D f6705c;

    @Override // java.util.Iterator
    public final Object next() {
        if (Y.f6738a) {
            Y.a(J.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(nextInt());
    }

    @Override // j$.util.InterfaceC0369k
    public final void b(Consumer consumer) {
        if (consumer instanceof InterfaceC0362q) {
            InterfaceC0362q interfaceC0362q = (InterfaceC0362q) consumer;
            Objects.requireNonNull(interfaceC0362q);
            while (hasNext()) {
                interfaceC0362q.e(nextInt());
            }
            return;
        }
        Objects.requireNonNull(consumer);
        if (!Y.f6738a) {
            while (hasNext()) {
                consumer.accept(Integer.valueOf(nextInt()));
            }
            return;
        }
        Y.a(J.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public J(D d3) {
        this.f6705c = d3;
    }

    @Override // j$.util.function.InterfaceC0362q
    public final void e(int i3) {
        this.f6703a = true;
        this.f6704b = i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f6703a) {
            this.f6705c.c(this);
        }
        return this.f6703a;
    }

    public final int nextInt() {
        if (!this.f6703a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6703a = false;
        return this.f6704b;
    }
}
