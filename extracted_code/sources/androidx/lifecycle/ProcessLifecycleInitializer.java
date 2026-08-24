package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import j1.C0516a;
import j1.InterfaceC0517b;
import java.util.List;
import t2.C0835l;
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0517b {
    @Override // j1.InterfaceC0517b
    public final List a() {
        return C0835l.f9264m;
    }

    @Override // j1.InterfaceC0517b
    public final Object b(Context context) {
        D2.i.e(context, "context");
        C0516a c3 = C0516a.c(context);
        D2.i.d(c3, "getInstance(context)");
        if (c3.f7363b.contains(ProcessLifecycleInitializer.class)) {
            if (!o.f4348a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                D2.i.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new n());
            }
            y yVar = y.f4362u;
            yVar.getClass();
            yVar.f4367q = new Handler();
            yVar.f4368r.d(k.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            D2.i.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new x(yVar));
            return yVar;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }
}
