package q2;

import Y.InterfaceC0147s;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.p;
import o2.AbstractC0704a;
import o2.AbstractC0715l;
/* loaded from: classes.dex */
public final class b extends AbstractC0715l implements p {

    /* renamed from: d  reason: collision with root package name */
    public boolean f8881d;

    /* JADX WARN: Type inference failed for: r0v0, types: [q2.a, o2.a] */
    @Override // o2.AbstractC0715l
    public final AbstractC0704a a(InterfaceC0147s interfaceC0147s, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer) {
        if (textureRegistry$SurfaceProducer != null) {
            boolean handlesCropAndRotation = textureRegistry$SurfaceProducer.handlesCropAndRotation();
            ?? abstractC0704a = new AbstractC0704a(interfaceC0147s, this.f8705a);
            abstractC0704a.f8880q = handlesCropAndRotation;
            return abstractC0704a;
        }
        throw new IllegalArgumentException("surfaceProducer cannot be null to create an ExoPlayerEventListener for TextureVideoPlayer.");
    }

    @Override // o2.AbstractC0715l
    public final void b() {
        super.b();
        this.f8706b.release();
    }
}
