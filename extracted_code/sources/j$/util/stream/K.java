package j$.util.stream;

import j$.util.function.InterfaceC0352g;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class K extends O implements InterfaceC0425j2 {

    /* renamed from: b  reason: collision with root package name */
    final InterfaceC0352g f6955b;

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        w((Double) obj);
    }

    @Override // j$.util.stream.InterfaceC0425j2
    public final /* synthetic */ void w(Double d3) {
        AbstractC0482v0.d(this, d3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public K(InterfaceC0352g interfaceC0352g, boolean z3) {
        super(z3);
        this.f6955b = interfaceC0352g;
    }

    @Override // j$.util.stream.O, j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final void d(double d3) {
        this.f6955b.d(d3);
    }
}
