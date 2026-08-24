package j$.util.stream;

import j$.util.function.Consumer;
/* loaded from: classes2.dex */
final class N extends O {

    /* renamed from: b  reason: collision with root package name */
    final Consumer f6982b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N(Consumer consumer, boolean z3) {
        super(z3);
        this.f6982b = consumer;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f6982b.accept(obj);
    }
}
