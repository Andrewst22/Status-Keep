package W1;
/* loaded from: classes.dex */
public final /* synthetic */ class m implements B.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2872a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2873b;

    public /* synthetic */ m(Object obj, int i3) {
        this.f2872a = i3;
        this.f2873b = obj;
    }

    @Override // B.a
    public final void accept(Object obj) {
        switch (this.f2872a) {
            case 0:
                ((o) this.f2873b).setWindowInfoListenerDisplayFeatures((r1.j) obj);
                return;
            default:
                ((M2.o) ((M2.p) this.f2873b)).i((r1.j) obj);
                return;
        }
    }
}
