package io.flutter.plugin.platform;

import W1.C0128a;
import android.app.Activity;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import p2.C0737a;
/* loaded from: classes.dex */
public final class m implements h {

    /* renamed from: a  reason: collision with root package name */
    public l f6220a;

    /* renamed from: b  reason: collision with root package name */
    public C0128a f6221b;

    /* renamed from: c  reason: collision with root package name */
    public Activity f6222c;

    /* renamed from: d  reason: collision with root package name */
    public W1.o f6223d;

    /* renamed from: f  reason: collision with root package name */
    public io.flutter.plugin.editing.i f6225f;

    /* renamed from: g  reason: collision with root package name */
    public B1.a f6226g;

    /* renamed from: k  reason: collision with root package name */
    public final B1.a f6230k;

    /* renamed from: e  reason: collision with root package name */
    public FlutterJNI f6224e = null;

    /* renamed from: n  reason: collision with root package name */
    public Surface f6233n = null;

    /* renamed from: o  reason: collision with root package name */
    public SurfaceControl f6234o = null;

    /* renamed from: p  reason: collision with root package name */
    public final l f6235p = new l(this, 3);

    /* renamed from: h  reason: collision with root package name */
    public final C0322a f6227h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public final SparseArray f6228i = new SparseArray();

    /* renamed from: j  reason: collision with root package name */
    public final SparseArray f6229j = new SparseArray();

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f6231l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f6232m = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v2, types: [io.flutter.plugin.platform.a, java.lang.Object] */
    public m() {
        if (B1.a.f48p == null) {
            B1.a.f48p = new B1.a(11);
        }
        this.f6230k = B1.a.f48p;
    }

    @Override // io.flutter.plugin.platform.h
    public final void a() {
        this.f6227h.f6196a = null;
    }

    @Override // io.flutter.plugin.platform.h
    public final void b(io.flutter.view.k kVar) {
        this.f6227h.f6196a = kVar;
    }

    @Override // io.flutter.plugin.platform.h
    public final boolean c(int i3) {
        return false;
    }

    @Override // io.flutter.plugin.platform.h
    public final SurfaceView d(int i3) {
        e eVar = (e) this.f6228i.get(i3);
        if (eVar == null) {
            return null;
        }
        return ((C0737a) eVar).f8832a;
    }
}
