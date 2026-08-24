package X1;

import android.content.Context;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.lifecycle.t;
import c2.C0247a;
import c2.InterfaceC0248b;
import d2.InterfaceC0257a;
import io.flutter.plugin.platform.m;
import io.flutter.plugin.platform.n;
import java.util.HashMap;
import l.v0;
import r2.AbstractC0766a;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public final c f2999b;

    /* renamed from: c  reason: collision with root package name */
    public final C0247a f3000c;

    /* renamed from: e  reason: collision with root package name */
    public W1.g f3002e;

    /* renamed from: f  reason: collision with root package name */
    public v0 f3003f;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f2998a = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f3001d = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public boolean f3004g = false;

    public d(Context context, c cVar) {
        new HashMap();
        new HashMap();
        new HashMap();
        this.f2999b = cVar;
        this.f3000c = new C0247a(context, cVar.f2978c, cVar.f2977b, cVar.f2993r.f6237a);
    }

    public final void a(InterfaceC0248b interfaceC0248b) {
        AbstractC0766a.b("FlutterEngineConnectionRegistry#add ".concat(interfaceC0248b.getClass().getSimpleName()));
        try {
            Class<?> cls = interfaceC0248b.getClass();
            HashMap hashMap = this.f2998a;
            if (hashMap.containsKey(cls)) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + interfaceC0248b + ") but it was already registered with this FlutterEngine (" + this.f2999b + ").");
                Trace.endSection();
                return;
            }
            interfaceC0248b.toString();
            hashMap.put(interfaceC0248b.getClass(), interfaceC0248b);
            interfaceC0248b.onAttachedToEngine(this.f3000c);
            if (interfaceC0248b instanceof InterfaceC0257a) {
                InterfaceC0257a interfaceC0257a = (InterfaceC0257a) interfaceC0248b;
                this.f3001d.put(interfaceC0248b.getClass(), interfaceC0257a);
                if (f()) {
                    interfaceC0257a.onAttachedToActivity(this.f3003f);
                }
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
    }

    public final void b(W1.d dVar, t tVar) {
        boolean z3;
        this.f3003f = new v0(dVar, tVar);
        if (dVar.getIntent() != null) {
            z3 = dVar.getIntent().getBooleanExtra("enable-software-rendering", false);
        } else {
            z3 = false;
        }
        c cVar = this.f2999b;
        n nVar = cVar.f2993r;
        nVar.f6257u = z3;
        if (nVar.f6239c == null) {
            nVar.f6239c = dVar;
            nVar.f6241e = cVar.f2977b;
            Y1.b bVar = cVar.f2978c;
            B1.a aVar = new B1.a(bVar, 26);
            nVar.f6243g = aVar;
            aVar.f51o = nVar.f6258v;
            m mVar = cVar.f2994s;
            if (mVar.f6222c == null) {
                mVar.f6222c = dVar;
                B1.a aVar2 = new B1.a(bVar, 25);
                mVar.f6226g = aVar2;
                aVar2.f51o = mVar.f6235p;
                for (InterfaceC0257a interfaceC0257a : this.f3001d.values()) {
                    if (this.f3004g) {
                        interfaceC0257a.onReattachedToActivityForConfigChanges(this.f3003f);
                    } else {
                        interfaceC0257a.onAttachedToActivity(this.f3003f);
                    }
                }
                this.f3004g = false;
                return;
            }
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
    }

    public final void c() {
        if (f()) {
            AbstractC0766a.b("FlutterEngineConnectionRegistry#detachFromActivity");
            try {
                for (InterfaceC0257a interfaceC0257a : this.f3001d.values()) {
                    interfaceC0257a.onDetachedFromActivity();
                }
                d();
                Trace.endSection();
                return;
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
    }

    public final void d() {
        c cVar = this.f2999b;
        n nVar = cVar.f2993r;
        B1.a aVar = nVar.f6243g;
        if (aVar != null) {
            aVar.f51o = null;
        }
        nVar.g();
        nVar.f6243g = null;
        nVar.f6239c = null;
        nVar.f6241e = null;
        m mVar = cVar.f2994s;
        B1.a aVar2 = mVar.f6226g;
        if (aVar2 != null) {
            aVar2.f51o = null;
        }
        Surface surface = mVar.f6233n;
        if (surface != null) {
            surface.release();
            mVar.f6233n = null;
            mVar.f6234o = null;
        }
        mVar.f6226g = null;
        mVar.f6222c = null;
        this.f3002e = null;
        this.f3003f = null;
    }

    public final void e() {
        if (f()) {
            c();
        }
    }

    public final boolean f() {
        if (this.f3002e != null) {
            return true;
        }
        return false;
    }
}
