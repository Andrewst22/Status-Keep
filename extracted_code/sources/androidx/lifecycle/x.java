package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
/* loaded from: classes.dex */
public final class x extends g {
    final /* synthetic */ y this$0;

    /* loaded from: classes.dex */
    public static final class a extends g {
        final /* synthetic */ y this$0;

        public a(y yVar) {
            this.this$0 = yVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            D2.i.e(activity, "activity");
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            D2.i.e(activity, "activity");
            y yVar = this.this$0;
            int i3 = yVar.f4363m + 1;
            yVar.f4363m = i3;
            if (i3 == 1 && yVar.f4366p) {
                yVar.f4368r.d(k.ON_START);
                yVar.f4366p = false;
            }
        }
    }

    public x(y yVar) {
        this.this$0 = yVar;
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        D2.i.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i3 = B.f4327n;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            D2.i.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((B) findFragmentByTag).f4328m = this.this$0.f4370t;
        }
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        D2.i.e(activity, "activity");
        y yVar = this.this$0;
        int i3 = yVar.f4364n - 1;
        yVar.f4364n = i3;
        if (i3 == 0) {
            Handler handler = yVar.f4367q;
            D2.i.b(handler);
            handler.postDelayed(yVar.f4369s, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        D2.i.e(activity, "activity");
        w.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        D2.i.e(activity, "activity");
        y yVar = this.this$0;
        int i3 = yVar.f4363m - 1;
        yVar.f4363m = i3;
        if (i3 == 0 && yVar.f4365o) {
            yVar.f4368r.d(k.ON_STOP);
            yVar.f4366p = true;
        }
    }
}
