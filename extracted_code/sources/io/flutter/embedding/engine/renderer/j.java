package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;
/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final long f6089m;

    /* renamed from: n  reason: collision with root package name */
    public final FlutterJNI f6090n;

    public j(long j3, FlutterJNI flutterJNI) {
        this.f6089m = j3;
        this.f6090n = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterJNI flutterJNI = this.f6090n;
        if (!flutterJNI.isAttached()) {
            return;
        }
        flutterJNI.unregisterTexture(this.f6089m);
    }
}
