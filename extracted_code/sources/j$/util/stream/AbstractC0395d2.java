package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.d2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0395d2 extends AbstractC0400e2 {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f7142l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC0395d2(AbstractC0382b abstractC0382b, int i3, int i4) {
        super(abstractC0382b, i3);
        this.f7142l = i4;
    }

    @Override // j$.util.stream.AbstractC0382b
    final boolean U() {
        switch (this.f7142l) {
            case 0:
                return true;
            default:
                return false;
        }
    }
}
