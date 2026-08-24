package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: j$.util.stream.u0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0477u0 extends AbstractC0387c {

    /* renamed from: j  reason: collision with root package name */
    private final C0472t0 f7267j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0477u0(C0472t0 c0472t0, AbstractC0382b abstractC0382b, Spliterator spliterator) {
        super(abstractC0382b, spliterator);
        this.f7267j = c0472t0;
    }

    C0477u0(C0477u0 c0477u0, Spliterator spliterator) {
        super(c0477u0, spliterator);
        this.f7267j = c0477u0.f7267j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0397e
    public final AbstractC0397e e(Spliterator spliterator) {
        return new C0477u0(this, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0397e
    public final Object a() {
        boolean z3;
        AbstractC0382b abstractC0382b = this.f7148a;
        AbstractC0462r0 abstractC0462r0 = (AbstractC0462r0) this.f7267j.f7261b.get();
        abstractC0382b.Z(this.f7149b, abstractC0462r0);
        boolean z4 = abstractC0462r0.f7239b;
        z3 = this.f7267j.f7260a.f7248b;
        if (z4 == z3) {
            Boolean valueOf = Boolean.valueOf(z4);
            AtomicReference atomicReference = this.f7129h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC0387c
    protected final Object j() {
        boolean z3;
        z3 = this.f7267j.f7260a.f7248b;
        return Boolean.valueOf(!z3);
    }
}
