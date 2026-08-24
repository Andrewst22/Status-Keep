package io.flutter.embedding.engine.renderer;

import Y.G;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.r;
import io.flutter.view.p;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class b implements DefaultLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f6070a;

    public b(l lVar) {
        this.f6070a = lVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void a() {
        p pVar;
        boolean z3;
        p pVar2;
        Iterator it = this.f6070a.f6115g.iterator();
        while (it.hasNext()) {
            FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = (FlutterRenderer$ImageReaderSurfaceProducer) it.next();
            pVar = flutterRenderer$ImageReaderSurfaceProducer.callback;
            if (pVar != null) {
                z3 = flutterRenderer$ImageReaderSurfaceProducer.notifiedDestroy;
                if (z3) {
                    flutterRenderer$ImageReaderSurfaceProducer.notifiedDestroy = false;
                    pVar2 = flutterRenderer$ImageReaderSurfaceProducer.callback;
                    q2.b bVar = (q2.b) pVar2;
                    if (bVar.f8881d) {
                        ((G) bVar.f8707c).E(bVar.f8706b.getSurface());
                        bVar.f8881d = false;
                    }
                }
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void b(r rVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void c(r rVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void e(r rVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void f(r rVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void g(r rVar) {
    }
}
