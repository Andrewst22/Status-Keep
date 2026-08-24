package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0491x extends AbstractC0501z {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f7302m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0491x(AbstractC0382b abstractC0382b, int i3, int i4) {
        super(abstractC0382b, i3, 1);
        this.f7302m = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0382b
    public final InterfaceC0440m2 V(int i3, InterfaceC0440m2 interfaceC0440m2) {
        switch (this.f7302m) {
            case 0:
                return interfaceC0440m2;
            case 1:
                return new U(1, interfaceC0440m2);
            default:
                return new AbstractC0415h2(interfaceC0440m2);
        }
    }
}
