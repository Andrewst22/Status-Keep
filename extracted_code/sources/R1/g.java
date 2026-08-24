package R1;

import C1.j;
import android.app.Application;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import c2.C0247a;
import c2.InterfaceC0248b;
import d2.InterfaceC0257a;
import d2.InterfaceC0258b;
import g2.p;
import g2.r;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashSet;
import java.util.WeakHashMap;
import l.v0;
import n.AbstractC0655e;
import n.C0651a;
import n.C0653c;
/* loaded from: classes.dex */
public class g implements p, InterfaceC0248b, InterfaceC0257a {

    /* renamed from: u  reason: collision with root package name */
    public static String f2095u = null;

    /* renamed from: v  reason: collision with root package name */
    public static boolean f2096v = false;

    /* renamed from: w  reason: collision with root package name */
    public static boolean f2097w = false;
    public static int x;

    /* renamed from: y  reason: collision with root package name */
    public static boolean f2098y;

    /* renamed from: m  reason: collision with root package name */
    public InterfaceC0258b f2099m;

    /* renamed from: n  reason: collision with root package name */
    public c f2100n;

    /* renamed from: o  reason: collision with root package name */
    public Application f2101o;

    /* renamed from: p  reason: collision with root package name */
    public C0247a f2102p;

    /* renamed from: q  reason: collision with root package name */
    public m f2103q;

    /* renamed from: r  reason: collision with root package name */
    public d f2104r;

    /* renamed from: s  reason: collision with root package name */
    public W1.d f2105s;

    /* renamed from: t  reason: collision with root package name */
    public r f2106t;

    @Override // d2.InterfaceC0257a
    public final void onAttachedToActivity(InterfaceC0258b interfaceC0258b) {
        this.f2099m = interfaceC0258b;
        C0247a c0247a = this.f2102p;
        g2.g gVar = c0247a.f5124b;
        v0 v0Var = (v0) interfaceC0258b;
        W1.d dVar = (W1.d) v0Var.f7950a;
        this.f2105s = dVar;
        this.f2101o = (Application) c0247a.f5123a;
        this.f2100n = new c(dVar);
        r rVar = new r(gVar, "miguelruivo.flutter.plugins.filepicker");
        this.f2106t = rVar;
        rVar.b(this);
        new B1.e(gVar, "miguelruivo.flutter.plugins.filepickerevent").t0(new j(this, 16));
        this.f2104r = new d(dVar);
        v0Var.a(this.f2100n);
        m lifecycle = ((HiddenLifecycleReference) v0Var.f7951b).getLifecycle();
        this.f2103q = lifecycle;
        lifecycle.a(this.f2104r);
    }

    @Override // c2.InterfaceC0248b
    public final void onAttachedToEngine(C0247a c0247a) {
        this.f2102p = c0247a;
    }

    @Override // d2.InterfaceC0257a
    public final void onDetachedFromActivity() {
        ((HashSet) ((v0) this.f2099m).f7953d).remove(this.f2100n);
        this.f2099m = null;
        d dVar = this.f2104r;
        if (dVar != null) {
            t tVar = (t) this.f2103q;
            tVar.getClass();
            tVar.c("removeObserver");
            C0651a c0651a = tVar.f4352b;
            C0653c c0653c = (C0653c) c0651a.f8329q.get(dVar);
            if (c0653c != null) {
                c0651a.f8328p--;
                WeakHashMap weakHashMap = c0651a.f8327o;
                if (!weakHashMap.isEmpty()) {
                    for (AbstractC0655e abstractC0655e : weakHashMap.keySet()) {
                        abstractC0655e.a(c0653c);
                    }
                }
                C0653c c0653c2 = c0653c.f8336p;
                if (c0653c2 != null) {
                    c0653c2.f8335o = c0653c.f8335o;
                } else {
                    c0651a.f8325m = c0653c.f8335o;
                }
                C0653c c0653c3 = c0653c.f8335o;
                if (c0653c3 != null) {
                    c0653c3.f8336p = c0653c2;
                } else {
                    c0651a.f8326n = c0653c2;
                }
                c0653c.f8335o = null;
                c0653c.f8336p = null;
            }
            c0651a.f8329q.remove(dVar);
            this.f2101o.unregisterActivityLifecycleCallbacks(this.f2104r);
        }
        this.f2103q = null;
        this.f2100n.f2084u = null;
        this.f2100n = null;
        this.f2106t.b(null);
        this.f2106t = null;
        this.f2101o = null;
    }

    @Override // d2.InterfaceC0257a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // c2.InterfaceC0248b
    public final void onDetachedFromEngine(C0247a c0247a) {
        this.f2102p = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02cc  */
    @Override // g2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMethodCall(g2.o r33, g2.q r34) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.g.onMethodCall(g2.o, g2.q):void");
    }

    @Override // d2.InterfaceC0257a
    public final void onReattachedToActivityForConfigChanges(InterfaceC0258b interfaceC0258b) {
        onAttachedToActivity(interfaceC0258b);
    }
}
