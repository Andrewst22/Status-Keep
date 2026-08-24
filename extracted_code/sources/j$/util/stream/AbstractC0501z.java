package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0501z extends A {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f7311l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC0501z(AbstractC0382b abstractC0382b, int i3, int i4) {
        super(abstractC0382b, i3);
        this.f7311l = i4;
    }

    @Override // j$.util.stream.AbstractC0382b
    final boolean U() {
        switch (this.f7311l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.AbstractC0382b, j$.util.stream.InterfaceC0407g
    public final /* bridge */ /* synthetic */ C parallel() {
        switch (this.f7311l) {
            case 0:
                parallel();
                return this;
            default:
                parallel();
                return this;
        }
    }

    @Override // j$.util.stream.AbstractC0382b, j$.util.stream.InterfaceC0407g
    public final /* bridge */ /* synthetic */ C sequential() {
        switch (this.f7311l) {
            case 0:
                sequential();
                return this;
            default:
                sequential();
                return this;
        }
    }
}
