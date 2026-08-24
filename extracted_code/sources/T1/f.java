package T1;

import android.content.Intent;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import g2.t;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class f implements t {

    /* renamed from: m  reason: collision with root package name */
    public R1.f f2350m;

    /* renamed from: n  reason: collision with root package name */
    public AtomicBoolean f2351n;

    public final boolean a(R1.f fVar) {
        AtomicBoolean atomicBoolean = this.f2351n;
        if (atomicBoolean.compareAndSet(true, false)) {
            SharePlusPendingIntent.f5190a = "";
            atomicBoolean.set(false);
            this.f2350m = fVar;
            return true;
        }
        fVar.a("Share callback error", "prior share-sheet did not call back, did you await it? Maybe use non-result variant", null);
        return false;
    }

    @Override // g2.t
    public final boolean onActivityResult(int i3, int i4, Intent intent) {
        R1.f fVar;
        if (i3 != 22643) {
            return false;
        }
        String str = SharePlusPendingIntent.f5190a;
        if (this.f2351n.compareAndSet(false, true) && (fVar = this.f2350m) != null) {
            fVar.b(str);
            this.f2350m = null;
        }
        return true;
    }
}
