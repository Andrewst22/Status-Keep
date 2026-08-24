package io.flutter.view;

import android.view.Choreographer;
/* loaded from: classes.dex */
public final class s implements Choreographer.FrameCallback {

    /* renamed from: m  reason: collision with root package name */
    public long f6407m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ t f6408n;

    public s(t tVar, long j3) {
        this.f6408n = tVar;
        this.f6407m = j3;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        long j4;
        long nanoTime = System.nanoTime() - j3;
        if (nanoTime < 0) {
            j4 = 0;
        } else {
            j4 = nanoTime;
        }
        t tVar = this.f6408n;
        tVar.f6412b.onVsync(j4, tVar.f6411a, this.f6407m);
        tVar.f6413c = this;
    }
}
