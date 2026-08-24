package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class Z extends AbstractC0378a0 {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f7065l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(AbstractC0382b abstractC0382b, int i3, int i4) {
        super(abstractC0382b, i3);
        this.f7065l = i4;
    }

    @Override // j$.util.stream.AbstractC0382b
    final boolean U() {
        switch (this.f7065l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.AbstractC0382b, j$.util.stream.InterfaceC0407g
    public final /* bridge */ /* synthetic */ InterfaceC0388c0 parallel() {
        switch (this.f7065l) {
            case 0:
                parallel();
                return this;
            default:
                parallel();
                return this;
        }
    }

    @Override // j$.util.stream.AbstractC0382b, j$.util.stream.InterfaceC0407g
    public final /* bridge */ /* synthetic */ InterfaceC0388c0 sequential() {
        switch (this.f7065l) {
            case 0:
                sequential();
                return this;
            default:
                sequential();
                return this;
        }
    }
}
