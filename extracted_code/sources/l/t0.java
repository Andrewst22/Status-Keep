package l;
/* loaded from: classes.dex */
public final class t0 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f7925m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ u0 f7926n;

    public /* synthetic */ t0(u0 u0Var, int i3) {
        this.f7925m = i3;
        this.f7926n = u0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7925m) {
            case 0:
                this.f7926n.c(false);
                return;
            default:
                this.f7926n.a();
                return;
        }
    }
}
