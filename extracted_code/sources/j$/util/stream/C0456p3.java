package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.Spliterator;
import j$.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.p3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0456p3 extends AbstractC0470s3 implements j$.util.B {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0340b.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean p(Consumer consumer) {
        return AbstractC0340b.k(this, consumer);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [j$.util.stream.u3, j$.util.Spliterator] */
    @Override // j$.util.stream.AbstractC0480u3
    protected final Spliterator a(Spliterator spliterator, long j3, long j4, long j5, long j6) {
        return new AbstractC0480u3((j$.util.B) spliterator, j3, j4, j5, j6);
    }

    @Override // j$.util.stream.AbstractC0470s3
    protected final Object d() {
        return new A0(1);
    }
}
