package s;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a  reason: collision with root package name */
    public final String f9077a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence[] f9078b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9079c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f9080d;

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f9081e;

    public Y(String str, CharSequence[] charSequenceArr, boolean z3, Bundle bundle, HashSet hashSet) {
        this.f9077a = str;
        this.f9078b = charSequenceArr;
        this.f9079c = z3;
        this.f9080d = bundle;
        this.f9081e = hashSet;
    }

    public static RemoteInput a(Y y3) {
        y3.getClass();
        RemoteInput.Builder addExtras = new RemoteInput.Builder("FlutterLocalNotificationsPluginInputResult").setLabel(y3.f9077a).setChoices(y3.f9078b).setAllowFreeFormInput(y3.f9079c).addExtras(y3.f9080d);
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator it = y3.f9081e.iterator();
            while (it.hasNext()) {
                W.d(addExtras, (String) it.next(), true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            X.b(addExtras, 0);
        }
        return addExtras.build();
    }
}
