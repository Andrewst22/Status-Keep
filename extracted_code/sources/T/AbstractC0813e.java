package t;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
/* renamed from: t.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0813e {
    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i3) {
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i3);
    }
}
