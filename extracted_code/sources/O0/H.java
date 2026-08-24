package o0;
/* loaded from: classes.dex */
public final /* synthetic */ class H implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f8435m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ M f8436n;

    public /* synthetic */ H(M m3, int i3) {
        this.f8435m = i3;
        this.f8436n = m3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8435m) {
            case 0:
                this.f8436n.f8474S = true;
                return;
            case 1:
                this.f8436n.z();
                return;
            default:
                M m3 = this.f8436n;
                if (!m3.f8480Y) {
                    InterfaceC0698w interfaceC0698w = m3.f8459C;
                    interfaceC0698w.getClass();
                    interfaceC0698w.f(m3);
                    return;
                }
                return;
        }
    }
}
