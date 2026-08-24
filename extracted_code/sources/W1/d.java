package W1;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin;
import f2.C0268a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.C;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import l.v0;
import r2.AbstractC0766a;
/* loaded from: classes.dex */
public abstract class d extends Activity implements androidx.lifecycle.r {

    /* renamed from: q  reason: collision with root package name */
    public static final int f2835q = View.generateViewId();

    /* renamed from: m  reason: collision with root package name */
    public boolean f2836m = false;

    /* renamed from: n  reason: collision with root package name */
    public g f2837n;

    /* renamed from: o  reason: collision with root package name */
    public final androidx.lifecycle.t f2838o;

    /* renamed from: p  reason: collision with root package name */
    public final OnBackInvokedCallback f2839p;

    public d() {
        OnBackInvokedCallback onBackInvokedCallback;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 33) {
            onBackInvokedCallback = null;
        } else if (i3 >= 34) {
            onBackInvokedCallback = new c(this);
        } else {
            onBackInvokedCallback = new OnBackInvokedCallback() { // from class: W1.b
                public final void onBackInvoked() {
                    d.this.onBackPressed();
                }
            };
        }
        this.f2839p = onBackInvokedCallback;
        this.f2838o = new androidx.lifecycle.t(this);
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t a() {
        return this.f2838o;
    }

    public final String b() {
        String dataString;
        if ((getApplicationInfo().flags & 2) != 0 && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    public final int c() {
        if (getIntent().hasExtra("background_mode")) {
            String stringExtra = getIntent().getStringExtra("background_mode");
            if (stringExtra != null) {
                if (stringExtra.equals("opaque")) {
                    return 1;
                }
                if (stringExtra.equals("transparent")) {
                    return 2;
                }
                throw new IllegalArgumentException("No enum constant io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode.".concat(stringExtra));
            }
            throw new NullPointerException("Name is null");
        }
        return 1;
    }

    public final String d() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public final String e() {
        String str;
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle g3 = g();
            if (g3 != null) {
                str = g3.getString("io.flutter.Entrypoint");
            } else {
                str = null;
            }
            if (str == null) {
                return "main";
            }
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public final String f() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle g3 = g();
            if (g3 == null) {
                return null;
            }
            return g3.getString("io.flutter.InitialRoute");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Bundle g() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final void h(boolean z3) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcher2;
        if (z3 && !this.f2836m) {
            if (Build.VERSION.SDK_INT >= 33) {
                onBackInvokedDispatcher2 = getOnBackInvokedDispatcher();
                onBackInvokedDispatcher2.registerOnBackInvokedCallback(0, this.f2839p);
                this.f2836m = true;
            }
        } else if (!z3 && this.f2836m && Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f2839p);
            this.f2836m = false;
        }
    }

    public final boolean i() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        if (d() == null && !this.f2837n.f2849f) {
            return getIntent().getBooleanExtra("destroy_engine_with_activity", true);
        }
        return booleanExtra;
    }

    public final boolean j() {
        if (getIntent().hasExtra("enable_state_restoration")) {
            return getIntent().getBooleanExtra("enable_state_restoration", false);
        }
        if (d() != null) {
            return false;
        }
        return true;
    }

    public final boolean k(String str) {
        g gVar = this.f2837n;
        if (gVar == null) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        } else if (!gVar.f2852i) {
            Log.w("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
            return false;
        } else {
            return true;
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i3, int i4, Intent intent) {
        if (k("onActivityResult")) {
            g gVar = this.f2837n;
            gVar.c();
            if (gVar.f2845b != null) {
                Objects.toString(intent);
                X1.d dVar = gVar.f2845b.f2979d;
                if (dVar.f()) {
                    AbstractC0766a.b("FlutterEngineConnectionRegistry#onActivityResult");
                    try {
                        v0 v0Var = dVar.f3003f;
                        v0Var.getClass();
                        Iterator it = new HashSet((HashSet) v0Var.f7953d).iterator();
                        while (true) {
                            boolean z3 = false;
                            while (it.hasNext()) {
                                if (((g2.t) it.next()).onActivityResult(i3, i4, intent) || z3) {
                                    z3 = true;
                                }
                            }
                            Trace.endSection();
                            return;
                        }
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (k("onBackPressed")) {
            g gVar = this.f2837n;
            gVar.c();
            X1.c cVar = gVar.f2845b;
            if (cVar != null) {
                cVar.f2984i.f5557a.a("popRoute", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(48:(3:1|2|(1:6))|8|(1:10)|11|(2:13|(4:15|(1:17)|18|(2:20|21))(2:23|(4:25|(3:27|93|34)|40|(1:42)(2:43|44))(41:45|(1:47)|48|(1:50)|51|(1:53)(2:109|(1:111))|54|(1:56)|57|(1:59)|60|(1:62)|63|(1:65)|66|(1:68)|69|(1:71)|72|(1:74)|75|(1:77)|78|(1:80)|81|(1:83)|84|(2:86|(1:88)(1:89))|90|(1:92)|93|(1:95)|96|(1:98)|99|(1:101)|102|(1:104)|105|(1:107)|108)))|112|113|114|(1:116)|117|118|(1:120)|121|(1:123)(1:241)|124|(2:126|(1:128)(2:129|(1:131)(1:132)))|133|(4:135|136|137|(1:139)(2:228|(1:230)(2:231|232)))(1:240)|140|(1:142)|143|(1:145)|(1:147)(1:227)|148|(3:150|(1:152)(1:221)|153)(3:222|(1:224)(1:226)|225)|154|(6:156|(1:158)|159|(2:161|(3:163|(1:165)|166)(2:167|168))|169|170)|171|(1:173)|174|(1:176)|177|178|179|180|(2:(1:217)(1:184)|185)(1:218)|186|(2:187|(1:189)(1:190))|191|(2:192|(1:194)(1:195))|196|(2:197|(1:199)(1:200))|201|(2:202|(1:204)(1:205))|(2:206|(1:208)(1:209))|210|(6:212|(1:214)|159|(0)|169|170)(2:215|216)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0479, code lost:
        android.util.Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
     */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05cd  */
    /* JADX WARN: Type inference failed for: r1v14, types: [W1.l, android.view.TextureView] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.d.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onDestroy();
        if (k("onDestroy")) {
            this.f2837n.e();
            this.f2837n.f();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f2839p);
            this.f2836m = false;
        }
        g gVar = this.f2837n;
        if (gVar != null) {
            gVar.f2844a = null;
            gVar.f2845b = null;
            gVar.f2846c = null;
            gVar.f2847d = null;
            this.f2837n = null;
        }
        this.f2838o.d(androidx.lifecycle.k.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (k("onNewIntent")) {
            g gVar = this.f2837n;
            gVar.c();
            X1.c cVar = gVar.f2845b;
            if (cVar != null) {
                X1.d dVar = cVar.f2979d;
                if (dVar.f()) {
                    AbstractC0766a.b("FlutterEngineConnectionRegistry#onNewIntent");
                    try {
                        Iterator it = ((HashSet) dVar.f3003f.f7954e).iterator();
                        while (it.hasNext()) {
                            ((FlutterLocalNotificationsPlugin) it.next()).onNewIntent(intent);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
                }
                String d3 = gVar.d(intent);
                if (d3 != null && !d3.isEmpty()) {
                    C0268a c0268a = gVar.f2845b.f2984i;
                    c0268a.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("location", d3);
                    c0268a.f5557a.a("pushRouteInformation", hashMap, null);
                    return;
                }
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        if (k("onPause")) {
            g gVar = this.f2837n;
            gVar.c();
            gVar.f2844a.getClass();
            X1.c cVar = gVar.f2845b;
            if (cVar != null) {
                f2.c cVar2 = cVar.f2982g;
                cVar2.f(3, cVar2.f5561c);
            }
        }
        this.f2838o.d(androidx.lifecycle.k.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        if (k("onPostResume")) {
            g gVar = this.f2837n;
            gVar.c();
            if (gVar.f2845b != null) {
                R0.j jVar = gVar.f2847d;
                if (jVar != null) {
                    jVar.f();
                }
                gVar.f2845b.f2993r.m();
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        if (k("onRequestPermissionsResult")) {
            g gVar = this.f2837n;
            gVar.c();
            if (gVar.f2845b != null) {
                Arrays.toString(strArr);
                Arrays.toString(iArr);
                X1.d dVar = gVar.f2845b.f2979d;
                if (dVar.f()) {
                    AbstractC0766a.b("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
                    try {
                        Iterator it = ((HashSet) dVar.f3003f.f7952c).iterator();
                        while (true) {
                            boolean z3 = false;
                            while (it.hasNext()) {
                                if (((g2.u) it.next()).onRequestPermissionsResult(i3, strArr, iArr) || z3) {
                                    z3 = true;
                                }
                            }
                            Trace.endSection();
                            return;
                        }
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f2838o.d(androidx.lifecycle.k.ON_RESUME);
        if (k("onResume")) {
            g gVar = this.f2837n;
            gVar.c();
            gVar.f2844a.getClass();
            X1.c cVar = gVar.f2845b;
            if (cVar != null) {
                f2.c cVar2 = cVar.f2982g;
                cVar2.f(2, cVar2.f5561c);
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (k("onSaveInstanceState")) {
            g gVar = this.f2837n;
            gVar.c();
            if (gVar.f2844a.j()) {
                bundle.putByteArray("framework", gVar.f2845b.f2986k.f5606b);
            }
            gVar.f2844a.getClass();
            Bundle bundle2 = new Bundle();
            X1.d dVar = gVar.f2845b.f2979d;
            if (dVar.f()) {
                AbstractC0766a.b("FlutterEngineConnectionRegistry#onSaveInstanceState");
                try {
                    Iterator it = ((HashSet) dVar.f3003f.f7956g).iterator();
                    if (!it.hasNext()) {
                        Trace.endSection();
                    } else if (it.next() == null) {
                        throw null;
                    } else {
                        throw new ClassCastException();
                    }
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            }
            bundle.putBundle("plugins", bundle2);
            if (gVar.f2844a.d() != null && !gVar.f2844a.i()) {
                bundle.putBoolean("enableOnBackInvokedCallbackState", gVar.f2844a.f2836m);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() {
        /*
            r6 = this;
            super.onStart()
            androidx.lifecycle.t r0 = r6.f2838o
            androidx.lifecycle.k r1 = androidx.lifecycle.k.ON_START
            r0.d(r1)
            java.lang.String r0 = "onStart"
            boolean r0 = r6.k(r0)
            if (r0 == 0) goto Lbe
            W1.g r0 = r6.f2837n
            r0.c()
            W1.d r1 = r0.f2844a
            java.lang.String r1 = r1.d()
            if (r1 == 0) goto L21
            goto Lb1
        L21:
            X1.c r1 = r0.f2845b
            Y1.b r1 = r1.f2978c
            boolean r1 = r1.f3423r
            if (r1 == 0) goto L2b
            goto Lb1
        L2b:
            W1.d r1 = r0.f2844a
            java.lang.String r1 = r1.f()
            if (r1 != 0) goto L44
            W1.d r1 = r0.f2844a
            r1.getClass()
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r1 = r0.d(r1)
            if (r1 != 0) goto L44
            java.lang.String r1 = "/"
        L44:
            W1.d r2 = r0.f2844a
            r2.getClass()
            r3 = 0
            android.os.Bundle r2 = r2.g()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L57
            if (r2 == 0) goto L57
            java.lang.String r4 = "io.flutter.EntrypointUri"
            java.lang.String r2 = r2.getString(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L57
            goto L58
        L57:
            r2 = r3
        L58:
            W1.d r4 = r0.f2844a
            r4.e()
            X1.c r4 = r0.f2845b
            f2.a r4 = r4.f2984i
            g2.r r4 = r4.f5557a
            java.lang.String r5 = "setInitialRoute"
            r4.a(r5, r1, r3)
            W1.d r1 = r0.f2844a
            java.lang.String r1 = r1.b()
            if (r1 == 0) goto L76
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L82
        L76:
            B1.e r1 = B1.e.j0()
            java.lang.Object r1 = r1.f56n
            a2.e r1 = (a2.e) r1
            a2.b r1 = r1.f3860d
            java.lang.String r1 = r1.f3849b
        L82:
            if (r2 != 0) goto L90
            Y1.a r2 = new Y1.a
            W1.d r3 = r0.f2844a
            java.lang.String r3 = r3.e()
            r2.<init>(r1, r3)
            goto L9c
        L90:
            Y1.a r3 = new Y1.a
            W1.d r4 = r0.f2844a
            java.lang.String r4 = r4.e()
            r3.<init>(r1, r2, r4)
            r2 = r3
        L9c:
            X1.c r1 = r0.f2845b
            Y1.b r1 = r1.f2978c
            W1.d r3 = r0.f2844a
            android.content.Intent r3 = r3.getIntent()
            java.lang.String r4 = "dart_entrypoint_args"
            java.io.Serializable r3 = r3.getSerializableExtra(r4)
            java.util.List r3 = (java.util.List) r3
            r1.a(r2, r3)
        Lb1:
            java.lang.Integer r1 = r0.f2853j
            if (r1 == 0) goto Lbe
            W1.o r0 = r0.f2846c
            int r1 = r1.intValue()
            r0.setVisibility(r1)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.d.onStart():void");
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (k("onStop")) {
            g gVar = this.f2837n;
            gVar.c();
            gVar.f2844a.getClass();
            X1.c cVar = gVar.f2845b;
            if (cVar != null) {
                f2.c cVar2 = cVar.f2982g;
                cVar2.f(5, cVar2.f5561c);
            }
            gVar.f2853j = Integer.valueOf(gVar.f2846c.getVisibility());
            gVar.f2846c.setVisibility(8);
            X1.c cVar3 = gVar.f2845b;
            if (cVar3 != null) {
                cVar3.f2977b.e(40);
            }
        }
        this.f2838o.d(androidx.lifecycle.k.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        if (k("onTrimMemory")) {
            g gVar = this.f2837n;
            gVar.c();
            X1.c cVar = gVar.f2845b;
            if (cVar != null) {
                if (gVar.f2851h && i3 >= 10) {
                    FlutterJNI flutterJNI = cVar.f2978c.f3418m;
                    if (flutterJNI.isAttached()) {
                        flutterJNI.notifyLowMemoryWarning();
                    }
                    f2.b bVar = gVar.f2845b.f2991p;
                    bVar.getClass();
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("type", "memoryPressure");
                    bVar.f5558a.n(hashMap, null);
                }
                gVar.f2845b.f2977b.e(i3);
                io.flutter.plugin.platform.n nVar = gVar.f2845b.f2993r;
                if (i3 < 40) {
                    nVar.getClass();
                    return;
                }
                for (C c3 : nVar.f6245i.values()) {
                    c3.f6193h.setSurface(null);
                }
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        if (k("onUserLeaveHint")) {
            g gVar = this.f2837n;
            gVar.c();
            X1.c cVar = gVar.f2845b;
            if (cVar != null) {
                X1.d dVar = cVar.f2979d;
                if (dVar.f()) {
                    AbstractC0766a.b("FlutterEngineConnectionRegistry#onUserLeaveHint");
                    try {
                        Iterator it = ((HashSet) dVar.f3003f.f7955f).iterator();
                        if (!it.hasNext()) {
                            Trace.endSection();
                            return;
                        } else if (it.next() == null) {
                            throw null;
                        } else {
                            throw new ClassCastException();
                        }
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                Log.e("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (k("onWindowFocusChanged")) {
            g gVar = this.f2837n;
            gVar.c();
            gVar.f2844a.getClass();
            X1.c cVar = gVar.f2845b;
            if (cVar != null) {
                f2.c cVar2 = cVar.f2982g;
                if (z3) {
                    cVar2.f(cVar2.f5559a, true);
                } else {
                    cVar2.f(cVar2.f5559a, false);
                }
            }
        }
    }
}
