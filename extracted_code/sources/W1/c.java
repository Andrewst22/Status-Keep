package W1;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import f2.C0268a;
/* loaded from: classes.dex */
public final class c implements OnBackAnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f2834a;

    public c(d dVar) {
        this.f2834a = dVar;
    }

    public final void onBackCancelled() {
        d dVar = this.f2834a;
        if (dVar.k("cancelBackGesture")) {
            g gVar = dVar.f2837n;
            gVar.c();
            X1.c cVar = gVar.f2845b;
            if (cVar != null) {
                cVar.f2985j.f5557a.a("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        d dVar = this.f2834a;
        if (dVar.k("commitBackGesture")) {
            g gVar = dVar.f2837n;
            gVar.c();
            X1.c cVar = gVar.f2845b;
            if (cVar != null) {
                cVar.f2985j.f5557a.a("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        d dVar = this.f2834a;
        if (dVar.k("updateBackGestureProgress")) {
            g gVar = dVar.f2837n;
            gVar.c();
            X1.c cVar = gVar.f2845b;
            if (cVar != null) {
                C0268a c0268a = cVar.f2985j;
                c0268a.getClass();
                c0268a.f5557a.a("updateBackGestureProgress", C0268a.a(backEvent), null);
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        d dVar = this.f2834a;
        if (dVar.k("startBackGesture")) {
            g gVar = dVar.f2837n;
            gVar.c();
            X1.c cVar = gVar.f2845b;
            if (cVar != null) {
                C0268a c0268a = cVar.f2985j;
                c0268a.getClass();
                c0268a.f5557a.a("startBackGesture", C0268a.a(backEvent), null);
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
        }
    }
}
