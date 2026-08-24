package androidx.profileinstaller;

import U.n;
import android.content.Context;
import android.os.Build;
import e0.l;
import g1.g;
import j1.InterfaceC0517b;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0517b {
    @Override // j1.InterfaceC0517b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // j1.InterfaceC0517b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new l(9);
        }
        g.a(new n(7, this, context.getApplicationContext()));
        return new l(9);
    }
}
