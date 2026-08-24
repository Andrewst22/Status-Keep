package R1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.r;
/* loaded from: classes.dex */
public final class d implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public final W1.d f2086a;

    public d(W1.d dVar) {
        this.f2086a = dVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void b(r rVar) {
        onActivityDestroyed(this.f2086a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f2086a == activity && activity.getApplicationContext() != null) {
            ((Application) activity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void a() {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void c(r rVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void e(r rVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void f(r rVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void g(r rVar) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
