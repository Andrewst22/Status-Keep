package j$.util.stream;

import j$.util.function.InterfaceC0362q;
/* loaded from: classes2.dex */
final class L extends O implements InterfaceC0430k2 {

    /* renamed from: b  reason: collision with root package name */
    final InterfaceC0362q f6967b;

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        t((Integer) obj);
    }

    @Override // j$.util.stream.InterfaceC0430k2
    public final /* synthetic */ void t(Integer num) {
        AbstractC0482v0.f(this, num);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public L(InterfaceC0362q interfaceC0362q, boolean z3) {
        super(z3);
        this.f6967b = interfaceC0362q;
    }

    @Override // j$.util.stream.O, j$.util.stream.InterfaceC0440m2
    public final void e(int i3) {
        this.f6967b.e(i3);
    }
}
