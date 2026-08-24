package e0;

import android.os.SystemClock;
import java.util.List;
import r0.AbstractC0750c;
/* loaded from: classes.dex */
public final class h extends AbstractC0750c {

    /* renamed from: g  reason: collision with root package name */
    public int f5233g;

    @Override // r0.s
    public final int e() {
        return 0;
    }

    @Override // r0.s
    public final int f() {
        return this.f5233g;
    }

    @Override // r0.s
    public final Object l() {
        return null;
    }

    @Override // r0.s
    public final void p(long j3, long j4, long j5, List list, p0.m[] mVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!o(elapsedRealtime, this.f5233g)) {
            return;
        }
        for (int i3 = this.f8905b - 1; i3 >= 0; i3--) {
            if (!o(elapsedRealtime, i3)) {
                this.f5233g = i3;
                return;
            }
        }
        throw new IllegalStateException();
    }
}
