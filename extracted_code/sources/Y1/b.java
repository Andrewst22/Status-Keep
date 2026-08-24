package Y1;

import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import r2.AbstractC0766a;
/* loaded from: classes.dex */
public final class b implements g2.g {

    /* renamed from: m  reason: collision with root package name */
    public final FlutterJNI f3418m;

    /* renamed from: n  reason: collision with root package name */
    public final AssetManager f3419n;

    /* renamed from: o  reason: collision with root package name */
    public final long f3420o;

    /* renamed from: p  reason: collision with root package name */
    public final j f3421p;

    /* renamed from: q  reason: collision with root package name */
    public final C1.j f3422q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3423r;

    public b(FlutterJNI flutterJNI, AssetManager assetManager, long j3) {
        this.f3423r = false;
        C1.j jVar = new C1.j(this, 21);
        this.f3418m = flutterJNI;
        this.f3419n = assetManager;
        this.f3420o = j3;
        j jVar2 = new j(flutterJNI);
        this.f3421p = jVar2;
        jVar2.l("flutter/isolate", jVar, null);
        this.f3422q = new C1.j(jVar2, 22);
        if (flutterJNI.isAttached()) {
            this.f3423r = true;
        }
    }

    public final void a(a aVar, List list) {
        if (this.f3423r) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        AbstractC0766a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(aVar);
            this.f3418m.runBundleAndSnapshotFromLibrary(aVar.f3415a, aVar.f3417c, aVar.f3416b, this.f3419n, list, this.f3420o);
            this.f3423r = true;
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

    @Override // g2.g
    public final void c(String str, ByteBuffer byteBuffer, g2.f fVar) {
        this.f3422q.c(str, byteBuffer, fVar);
    }

    @Override // g2.g
    public final void f(String str, ByteBuffer byteBuffer) {
        this.f3422q.f(str, byteBuffer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [g2.m, java.lang.Object] */
    @Override // g2.g
    public final B1.b i() {
        return ((j) this.f3422q.f168n).b(new Object());
    }

    @Override // g2.g
    public final void j(String str, g2.e eVar) {
        this.f3422q.j(str, eVar);
    }

    @Override // g2.g
    public final void l(String str, g2.e eVar, B1.b bVar) {
        this.f3422q.l(str, eVar, bVar);
    }
}
