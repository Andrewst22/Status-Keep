package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class V extends AbstractC0418i0 {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f7046m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(AbstractC0382b abstractC0382b, int i3, int i4) {
        super(abstractC0382b, i3, 1);
        this.f7046m = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0382b
    public final InterfaceC0440m2 V(int i3, InterfaceC0440m2 interfaceC0440m2) {
        switch (this.f7046m) {
            case 0:
                return new U(0, interfaceC0440m2);
            default:
                return interfaceC0440m2;
        }
    }
}
