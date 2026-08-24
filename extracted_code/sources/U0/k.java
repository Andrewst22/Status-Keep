package u0;

import U.A;
import Y.C0142m;
import a0.C0171o;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
/* loaded from: classes.dex */
public final class k implements Handler.Callback {

    /* renamed from: m  reason: collision with root package name */
    public final Handler f9347m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ l f9348n;

    public k(l lVar, h0.l lVar2) {
        this.f9348n = lVar;
        Handler n3 = A.n(this);
        this.f9347m = n3;
        lVar2.H(this, n3);
    }

    public final void a(long j3) {
        boolean z3;
        Surface surface;
        l lVar = this.f9348n;
        if (this == lVar.f9377u1 && lVar.f5905W != null) {
            if (j3 == Long.MAX_VALUE) {
                lVar.f5888J0 = true;
                return;
            }
            try {
                lVar.t0(j3);
                lVar.z0(lVar.f9373p1);
                lVar.f5891L0.f3293e++;
                o oVar = lVar.f9354V0;
                if (oVar.f9392d != 3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                oVar.f9392d = 3;
                oVar.f9399k.getClass();
                oVar.f9394f = A.M(SystemClock.elapsedRealtime());
                if (z3 && (surface = lVar.f9362d1) != null) {
                    C0171o c0171o = lVar.S0;
                    Handler handler = c0171o.f3774b;
                    if (handler != null) {
                        handler.post(new u(c0171o, surface, SystemClock.elapsedRealtime()));
                    }
                    lVar.f9364g1 = true;
                }
                lVar.b0(j3);
            } catch (C0142m e2) {
                lVar.f5890K0 = e2;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i3 = message.arg1;
        int i4 = message.arg2;
        int i5 = A.f2405a;
        a(((i3 & 4294967295L) << 32) | (4294967295L & i4));
        return true;
    }
}
