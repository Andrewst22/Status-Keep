package io.flutter.embedding.engine.renderer;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f6074m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ io.flutter.view.o f6075n;

    public /* synthetic */ d(io.flutter.view.o oVar, int i3) {
        this.f6074m = i3;
        this.f6075n = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6074m) {
            case 0:
                FlutterRenderer$ImageReaderSurfaceProducer.a((FlutterRenderer$ImageReaderSurfaceProducer) this.f6075n);
                return;
            default:
                ((i) this.f6075n).getClass();
                return;
        }
    }
}
