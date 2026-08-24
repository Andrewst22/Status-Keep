package X1;

import a.AbstractC0155a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import e0.C0262c;
import f2.C0268a;
import f2.m;
import h2.C0286a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.n;
import j2.C0518a;
import java.util.HashMap;
import java.util.HashSet;
import m2.AbstractC0635d;
import r2.InterfaceC0767b;
/* loaded from: classes.dex */
public final class c implements InterfaceC0767b {

    /* renamed from: w  reason: collision with root package name */
    public static long f2975w = 1;
    public static final HashMap x = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f2976a;

    /* renamed from: b  reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.l f2977b;

    /* renamed from: c  reason: collision with root package name */
    public final Y1.b f2978c;

    /* renamed from: d  reason: collision with root package name */
    public final d f2979d;

    /* renamed from: e  reason: collision with root package name */
    public final C0286a f2980e;

    /* renamed from: f  reason: collision with root package name */
    public final B1.e f2981f;

    /* renamed from: g  reason: collision with root package name */
    public final f2.c f2982g;

    /* renamed from: h  reason: collision with root package name */
    public final C0262c f2983h;

    /* renamed from: i  reason: collision with root package name */
    public final C0268a f2984i;

    /* renamed from: j  reason: collision with root package name */
    public final C0268a f2985j;

    /* renamed from: k  reason: collision with root package name */
    public final f2.k f2986k;

    /* renamed from: l  reason: collision with root package name */
    public final B1.a f2987l;

    /* renamed from: m  reason: collision with root package name */
    public final C0262c f2988m;

    /* renamed from: n  reason: collision with root package name */
    public final m f2989n;

    /* renamed from: o  reason: collision with root package name */
    public final C0262c f2990o;

    /* renamed from: p  reason: collision with root package name */
    public final f2.b f2991p;

    /* renamed from: q  reason: collision with root package name */
    public final B1.a f2992q;

    /* renamed from: r  reason: collision with root package name */
    public final n f2993r;

    /* renamed from: s  reason: collision with root package name */
    public final io.flutter.plugin.platform.m f2994s;

    /* renamed from: u  reason: collision with root package name */
    public final long f2996u;

    /* renamed from: t  reason: collision with root package name */
    public final HashSet f2995t = new HashSet();

    /* renamed from: v  reason: collision with root package name */
    public final a f2997v = new a(this);

    public c(Context context, FlutterJNI flutterJNI, n nVar, boolean z3, boolean z4) {
        AssetManager assets;
        long j3 = f2975w;
        f2975w = 1 + j3;
        this.f2996u = j3;
        x.put(Long.valueOf(j3), this);
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        B1.e j02 = B1.e.j0();
        if (flutterJNI == null) {
            Object obj = j02.f57o;
            flutterJNI = new FlutterJNI();
        }
        this.f2976a = flutterJNI;
        Y1.b bVar = new Y1.b(flutterJNI, assets, this.f2996u);
        this.f2978c = bVar;
        flutterJNI.setPlatformMessageHandler(bVar.f3421p);
        B1.e.j0().getClass();
        this.f2981f = new B1.e(bVar, flutterJNI);
        new e0.l(bVar);
        this.f2982g = new f2.c(bVar);
        B1.a aVar = new B1.a(bVar, 23);
        this.f2983h = new C0262c(bVar, 9);
        this.f2984i = new C0268a(bVar, 1);
        this.f2985j = new C0268a(bVar, 0);
        this.f2987l = new B1.a(bVar, 24);
        B1.a aVar2 = new B1.a(bVar, context.getPackageManager());
        this.f2986k = new f2.k(bVar, z4);
        this.f2988m = new C0262c(bVar, 16);
        this.f2989n = new m(bVar);
        this.f2990o = new C0262c(bVar, 18);
        this.f2991p = new f2.b(bVar);
        this.f2992q = new B1.a(bVar, 29);
        C0286a c0286a = new C0286a(context, aVar);
        this.f2980e = c0286a;
        a2.e eVar = (a2.e) j02.f56n;
        if (!flutterJNI.isAttached()) {
            eVar.c(context.getApplicationContext());
            eVar.a(context, null);
        }
        io.flutter.plugin.platform.m mVar = new io.flutter.plugin.platform.m();
        mVar.f6220a = nVar.f6237a;
        mVar.f6224e = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.f2997v);
        flutterJNI.setPlatformViewsController(nVar);
        flutterJNI.setPlatformViewsController2(mVar);
        flutterJNI.setLocalizationPlugin(c0286a);
        j02.getClass();
        flutterJNI.setDeferredComponentManager(null);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f2977b = new io.flutter.embedding.engine.renderer.l(flutterJNI);
        this.f2993r = nVar;
        this.f2994s = mVar;
        d dVar = new d(context.getApplicationContext(), this);
        this.f2979d = dVar;
        c0286a.b(context.getResources().getConfiguration());
        if (z3 && eVar.f3860d.f3852e) {
            AbstractC0155a.F(this);
        }
        AbstractC0635d.c(context, this);
        dVar.a(new C0518a(aVar2));
    }
}
