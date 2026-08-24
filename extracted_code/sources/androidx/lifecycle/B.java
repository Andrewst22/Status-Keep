package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
/* loaded from: classes.dex */
public class B extends Fragment {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f4327n = 0;

    /* renamed from: m  reason: collision with root package name */
    public C1.j f4328m;

    /* loaded from: classes.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final A Companion = new Object();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            D2.i.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            D2.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            D2.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            D2.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            D2.i.e(activity, "activity");
            int i3 = B.f4327n;
            z.a(activity, k.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            D2.i.e(activity, "activity");
            int i3 = B.f4327n;
            z.a(activity, k.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            D2.i.e(activity, "activity");
            int i3 = B.f4327n;
            z.a(activity, k.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            D2.i.e(activity, "activity");
            int i3 = B.f4327n;
            z.a(activity, k.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            D2.i.e(activity, "activity");
            int i3 = B.f4327n;
            z.a(activity, k.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            D2.i.e(activity, "activity");
            int i3 = B.f4327n;
            z.a(activity, k.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            D2.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            D2.i.e(activity, "activity");
            D2.i.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            D2.i.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            D2.i.e(activity, "activity");
        }
    }

    public final void a(k kVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            D2.i.d(activity, "activity");
            z.a(activity, kVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(k.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(k.ON_DESTROY);
        this.f4328m = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(k.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C1.j jVar = this.f4328m;
        if (jVar != null) {
            ((y) jVar.f168n).b();
        }
        a(k.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C1.j jVar = this.f4328m;
        if (jVar != null) {
            y yVar = (y) jVar.f168n;
            int i3 = yVar.f4363m + 1;
            yVar.f4363m = i3;
            if (i3 == 1 && yVar.f4366p) {
                yVar.f4368r.d(k.ON_START);
                yVar.f4366p = false;
            }
        }
        a(k.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(k.ON_STOP);
    }
}
