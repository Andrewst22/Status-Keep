package V2;

import R1.f;
import java.io.Serializable;
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ boolean f2715m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ f f2716n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Exception f2717o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Serializable f2718p;

    public c(boolean z3, f fVar, Exception exc, Serializable serializable) {
        this.f2715m = z3;
        this.f2716n = fVar;
        this.f2717o = exc;
        this.f2718p = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f2716n;
        if (!this.f2715m) {
            fVar.c();
            return;
        }
        Exception exc = this.f2717o;
        if (exc != null) {
            exc.printStackTrace();
            fVar.a("exception", exc.getMessage(), null);
            return;
        }
        fVar.b(this.f2718p);
    }
}
