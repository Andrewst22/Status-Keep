package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class M extends O implements InterfaceC0435l2 {

    /* renamed from: b  reason: collision with root package name */
    final j$.util.function.y f6974b;

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        n((Long) obj);
    }

    @Override // j$.util.stream.InterfaceC0435l2
    public final /* synthetic */ void n(Long l3) {
        AbstractC0482v0.i(this, l3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public M(j$.util.function.y yVar, boolean z3) {
        super(z3);
        this.f6974b = yVar;
    }

    @Override // j$.util.stream.O, j$.util.stream.InterfaceC0440m2
    public final void f(long j3) {
        this.f6974b.f(j3);
    }
}
