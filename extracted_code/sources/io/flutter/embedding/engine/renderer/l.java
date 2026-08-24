package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.lifecycle.y;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f6109a;

    /* renamed from: c  reason: collision with root package name */
    public Surface f6111c;

    /* renamed from: h  reason: collision with root package name */
    public final a f6116h;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicLong f6110b = new AtomicLong(0);

    /* renamed from: d  reason: collision with root package name */
    public boolean f6112d = false;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f6113e = new Handler();

    /* renamed from: f  reason: collision with root package name */
    public final HashSet f6114f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f6115g = new ArrayList();

    public l(FlutterJNI flutterJNI) {
        a aVar = new a(this);
        this.f6116h = aVar;
        this.f6109a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
        y.f4362u.f4368r.a(new b(this));
    }

    public final void a(io.flutter.view.o oVar) {
        HashSet hashSet = this.f6114f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((io.flutter.view.o) ((WeakReference) it.next()).get()) == null) {
                it.remove();
            }
        }
        hashSet.add(new WeakReference(oVar));
    }

    public final TextureRegistry$ImageTextureEntry b() {
        FlutterRenderer$ImageTextureRegistryEntry flutterRenderer$ImageTextureRegistryEntry = new FlutterRenderer$ImageTextureRegistryEntry(this, this.f6110b.getAndIncrement());
        flutterRenderer$ImageTextureRegistryEntry.id();
        this.f6109a.registerImageTexture(flutterRenderer$ImageTextureRegistryEntry.id(), flutterRenderer$ImageTextureRegistryEntry, false);
        return flutterRenderer$ImageTextureRegistryEntry;
    }

    public final TextureRegistry$SurfaceProducer c(int i3) {
        boolean z3;
        if (Build.VERSION.SDK_INT >= 29) {
            long andIncrement = this.f6110b.getAndIncrement();
            FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = new FlutterRenderer$ImageReaderSurfaceProducer(this, andIncrement);
            if (i3 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f6109a.registerImageTexture(andIncrement, flutterRenderer$ImageReaderSurfaceProducer, z3);
            if (z3) {
                a(flutterRenderer$ImageReaderSurfaceProducer);
            }
            this.f6115g.add(flutterRenderer$ImageReaderSurfaceProducer);
            return flutterRenderer$ImageReaderSurfaceProducer;
        }
        i d3 = d();
        return new o(d3.f6084a, this.f6113e, this.f6109a, d3);
    }

    public final i d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        long andIncrement = this.f6110b.getAndIncrement();
        surfaceTexture.detachFromGLContext();
        i iVar = new i(this, andIncrement, surfaceTexture);
        this.f6109a.registerTexture(iVar.f6084a, iVar.f6085b);
        a(iVar);
        return iVar;
    }

    public final void e(int i3) {
        Iterator it = this.f6114f.iterator();
        while (it.hasNext()) {
            io.flutter.view.o oVar = (io.flutter.view.o) ((WeakReference) it.next()).get();
            if (oVar != null) {
                oVar.onTrimMemory(i3);
            } else {
                it.remove();
            }
        }
    }

    public final void f(io.flutter.view.o oVar) {
        HashSet hashSet = this.f6114f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == oVar) {
                hashSet.remove(weakReference);
                return;
            }
        }
    }

    public final void g() {
        if (this.f6111c != null) {
            this.f6109a.onSurfaceDestroyed();
            if (this.f6112d) {
                this.f6116h.a();
            }
            this.f6112d = false;
            this.f6111c = null;
        }
    }
}
