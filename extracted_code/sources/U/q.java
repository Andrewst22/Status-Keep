package U;

import a0.C0161e;
import a0.C0165i;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class q extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2462a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2463b;

    public /* synthetic */ q(Object obj, int i3) {
        this.f2462a = i3;
        this.f2463b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Executor mainExecutor;
        switch (this.f2462a) {
            case 0:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                int i3 = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i3 = type != 9 ? 8 : 7;
                                        }
                                        i3 = 5;
                                    }
                                }
                                i3 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                                    i3 = 3;
                                    break;
                                case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                                case N.k.LONG_FIELD_NUMBER /* 4 */:
                                case N.k.STRING_FIELD_NUMBER /* 5 */:
                                case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                case N.k.BYTES_FIELD_NUMBER /* 8 */:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i3 = 4;
                                    break;
                                case 13:
                                    i3 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i3 = 6;
                                    break;
                                case 18:
                                    i3 = 2;
                                    break;
                                case 20:
                                    if (A.f2405a >= 29) {
                                        i3 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i3 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                }
                int i4 = A.f2405a;
                r rVar = (r) this.f2463b;
                if (i4 >= 31 && i3 == 5) {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        telephonyManager.getClass();
                        p pVar = new p(rVar);
                        mainExecutor = context.getMainExecutor();
                        telephonyManager.registerTelephonyCallback(mainExecutor, pVar);
                        telephonyManager.unregisterTelephonyCallback(pVar);
                        return;
                    } catch (RuntimeException unused2) {
                        r.a(5, rVar);
                        return;
                    }
                }
                r.a(i3, rVar);
                return;
            case 1:
                if (!isInitialStickyBroadcast()) {
                    C0165i c0165i = (C0165i) this.f2463b;
                    c0165i.a(C0161e.c(context, intent, c0165i.f3759i, c0165i.f3758h));
                    return;
                }
                return;
            default:
                if ("close action".equals(intent.getAction())) {
                    ((WebViewActivity) this.f2463b).finish();
                    return;
                }
                return;
        }
    }
}
