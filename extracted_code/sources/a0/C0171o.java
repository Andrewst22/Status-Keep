package a0;

import R.c0;
import Y.C0136g;
import android.os.Handler;
/* renamed from: a0.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3773a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f3774b;

    /* renamed from: c  reason: collision with root package name */
    public final Y.D f3775c;

    public /* synthetic */ C0171o(Handler handler, Y.D d3, int i3) {
        this.f3773a = i3;
        this.f3774b = handler;
        this.f3775c = d3;
    }

    private final void b(C0136g c0136g) {
        synchronized (c0136g) {
        }
        Handler handler = this.f3774b;
        if (handler != null) {
            handler.post(new U.n(3, this, c0136g));
        }
    }

    public final void a(C0136g c0136g) {
        switch (this.f3773a) {
            case 0:
                b(c0136g);
                return;
            default:
                synchronized (c0136g) {
                }
                Handler handler = this.f3774b;
                if (handler != null) {
                    handler.post(new U.n(14, this, c0136g));
                    return;
                }
                return;
        }
    }

    public void c(c0 c0Var) {
        Handler handler = this.f3774b;
        if (handler != null) {
            handler.post(new U.n(12, this, c0Var));
        }
    }
}
