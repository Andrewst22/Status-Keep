package j$.util;

import j$.util.function.Consumer;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes2.dex */
final class K implements InterfaceC0511y, j$.util.function.y, InterfaceC0369k {

    /* renamed from: a  reason: collision with root package name */
    boolean f6706a = false;

    /* renamed from: b  reason: collision with root package name */
    long f6707b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ F f6708c;

    @Override // java.util.Iterator
    public final Object next() {
        if (Y.f6738a) {
            Y.a(K.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(nextLong());
    }

    @Override // j$.util.InterfaceC0369k
    public final void b(Consumer consumer) {
        if (consumer instanceof j$.util.function.y) {
            j$.util.function.y yVar = (j$.util.function.y) consumer;
            Objects.requireNonNull(yVar);
            while (hasNext()) {
                yVar.f(nextLong());
            }
            return;
        }
        Objects.requireNonNull(consumer);
        if (!Y.f6738a) {
            while (hasNext()) {
                consumer.accept(Long.valueOf(nextLong()));
            }
            return;
        }
        Y.a(K.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public K(F f3) {
        this.f6708c = f3;
    }

    @Override // j$.util.function.y
    public final void f(long j3) {
        this.f6706a = true;
        this.f6707b = j3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f6706a) {
            this.f6708c.j(this);
        }
        return this.f6706a;
    }

    public final long nextLong() {
        if (!this.f6706a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6706a = false;
        return this.f6707b;
    }
}
