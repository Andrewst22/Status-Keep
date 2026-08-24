package W1;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import c2.InterfaceC0248b;
import d2.InterfaceC0257a;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import r2.AbstractC0766a;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public d f2844a;

    /* renamed from: b  reason: collision with root package name */
    public X1.c f2845b;

    /* renamed from: c  reason: collision with root package name */
    public o f2846c;

    /* renamed from: d  reason: collision with root package name */
    public R0.j f2847d;

    /* renamed from: e  reason: collision with root package name */
    public f f2848e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2849f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2850g;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2852i;

    /* renamed from: j  reason: collision with root package name */
    public Integer f2853j;

    /* renamed from: k  reason: collision with root package name */
    public final e f2854k = new e(this, 0);

    /* renamed from: h  reason: collision with root package name */
    public boolean f2851h = false;

    public g(d dVar) {
        this.f2844a = dVar;
    }

    public final void a(X1.f fVar) {
        String b3 = this.f2844a.b();
        if (b3 == null || b3.isEmpty()) {
            b3 = ((a2.e) B1.e.j0().f56n).f3860d.f3849b;
        }
        Y1.a aVar = new Y1.a(b3, this.f2844a.e());
        String f3 = this.f2844a.f();
        if (f3 == null) {
            d dVar = this.f2844a;
            dVar.getClass();
            f3 = d(dVar.getIntent());
            if (f3 == null) {
                f3 = "/";
            }
        }
        fVar.f3010p = aVar;
        fVar.f3011q = f3;
        fVar.f3012r = (List) this.f2844a.getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public final void b() {
        if (!this.f2844a.i()) {
            d dVar = this.f2844a;
            dVar.getClass();
            Log.w("FlutterActivity", "FlutterActivity " + dVar + " connection to the engine " + dVar.f2837n.f2845b + " evicted by another attaching activity");
            g gVar = dVar.f2837n;
            if (gVar != null) {
                gVar.e();
                dVar.f2837n.f();
                return;
            }
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f2844a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    public final void c() {
        if (this.f2844a != null) {
            return;
        }
        throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
    }

    public final String d(Intent intent) {
        boolean z3;
        Uri data;
        d dVar = this.f2844a;
        dVar.getClass();
        try {
            Bundle g3 = dVar.g();
            if (g3 != null && g3.containsKey("flutter_deeplinking_enabled")) {
                z3 = g3.getBoolean("flutter_deeplinking_enabled");
            } else {
                z3 = true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            z3 = false;
        }
        if (z3 && (data = intent.getData()) != null) {
            return data.toString();
        }
        return null;
    }

    public final void e() {
        c();
        if (this.f2848e != null) {
            this.f2846c.getViewTreeObserver().removeOnPreDrawListener(this.f2848e);
            this.f2848e = null;
        }
        o oVar = this.f2846c;
        if (oVar != null) {
            oVar.a();
            o oVar2 = this.f2846c;
            oVar2.f2892r.remove(this.f2854k);
        }
    }

    public final void f() {
        if (!this.f2852i) {
            return;
        }
        c();
        this.f2844a.getClass();
        this.f2844a.getClass();
        d dVar = this.f2844a;
        dVar.getClass();
        if (dVar.isChangingConfigurations()) {
            X1.d dVar2 = this.f2845b.f2979d;
            if (dVar2.f()) {
                AbstractC0766a.b("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
                try {
                    dVar2.f3004g = true;
                    for (InterfaceC0257a interfaceC0257a : dVar2.f3001d.values()) {
                        interfaceC0257a.onDetachedFromActivityForConfigChanges();
                    }
                    dVar2.d();
                    Trace.endSection();
                } finally {
                }
            } else {
                Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            }
        } else {
            this.f2845b.f2979d.c();
        }
        R0.j jVar = this.f2847d;
        if (jVar != null) {
            ((B1.a) jVar.f2060o).f51o = null;
            this.f2847d = null;
        }
        this.f2844a.getClass();
        X1.c cVar = this.f2845b;
        if (cVar != null) {
            f2.c cVar2 = cVar.f2982g;
            cVar2.f(1, cVar2.f5561c);
        }
        if (this.f2844a.i()) {
            X1.c cVar3 = this.f2845b;
            Iterator it = cVar3.f2995t.iterator();
            while (it.hasNext()) {
                ((X1.b) it.next()).b();
            }
            X1.d dVar3 = cVar3.f2979d;
            dVar3.e();
            HashMap hashMap = dVar3.f2998a;
            Iterator it2 = new HashSet(hashMap.keySet()).iterator();
            while (it2.hasNext()) {
                Class cls = (Class) it2.next();
                InterfaceC0248b interfaceC0248b = (InterfaceC0248b) hashMap.get(cls);
                if (interfaceC0248b != null) {
                    AbstractC0766a.b("FlutterEngineConnectionRegistry#remove ".concat(cls.getSimpleName()));
                    try {
                        if (interfaceC0248b instanceof InterfaceC0257a) {
                            if (dVar3.f()) {
                                ((InterfaceC0257a) interfaceC0248b).onDetachedFromActivity();
                            }
                            dVar3.f3001d.remove(cls);
                        }
                        interfaceC0248b.onDetachedFromEngine(dVar3.f3000c);
                        hashMap.remove(cls);
                        Trace.endSection();
                    } finally {
                    }
                }
            }
            hashMap.clear();
            while (true) {
                io.flutter.plugin.platform.n nVar = cVar3.f2993r;
                SparseArray sparseArray = nVar.f6247k;
                if (sparseArray.size() <= 0) {
                    break;
                }
                nVar.f6258v.e(sparseArray.keyAt(0));
            }
            while (true) {
                io.flutter.plugin.platform.m mVar = cVar3.f2994s;
                SparseArray sparseArray2 = mVar.f6228i;
                if (sparseArray2.size() <= 0) {
                    break;
                }
                mVar.f6235p.e(sparseArray2.keyAt(0));
            }
            cVar3.f2978c.f3418m.setPlatformMessageHandler(null);
            FlutterJNI flutterJNI = cVar3.f2976a;
            flutterJNI.removeEngineLifecycleListener(cVar3.f2997v);
            flutterJNI.setDeferredComponentManager(null);
            flutterJNI.detachFromNativeAndReleaseResources();
            B1.e.j0().getClass();
            X1.c.x.remove(Long.valueOf(cVar3.f2996u));
            if (this.f2844a.d() != null) {
                if (X1.h.f3015c == null) {
                    X1.h.f3015c = new X1.h(1);
                }
                X1.h hVar = X1.h.f3015c;
                hVar.f3016a.remove(this.f2844a.d());
            }
            this.f2845b = null;
        }
        this.f2852i = false;
    }
}
