package U;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
/* loaded from: classes.dex */
public final class p extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: a  reason: collision with root package name */
    public final r f2461a;

    public p(r rVar) {
        this.f2461a = rVar;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        boolean z3;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i3 = 5;
        if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
            z3 = false;
        } else {
            z3 = true;
        }
        r rVar = this.f2461a;
        if (z3) {
            i3 = 10;
        }
        r.a(i3, rVar);
    }
}
