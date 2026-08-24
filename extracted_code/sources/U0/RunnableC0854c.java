package u0;

import R.c0;
/* renamed from: u0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0854c implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f9309m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ v f9310n;

    public /* synthetic */ RunnableC0854c(C0855d c0855d, v vVar, int i3) {
        this.f9309m = i3;
        this.f9310n = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9309m) {
            case 0:
                this.f9310n.getClass();
                return;
            case 1:
                this.f9310n.f();
                return;
            default:
                this.f9310n.d();
                return;
        }
    }

    public /* synthetic */ RunnableC0854c(C0855d c0855d, v vVar, c0 c0Var) {
        this.f9309m = 0;
        this.f9310n = vVar;
    }
}
