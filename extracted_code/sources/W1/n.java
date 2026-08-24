package W1;
/* loaded from: classes.dex */
public final class n implements io.flutter.embedding.engine.renderer.m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.l f2874a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Z.d f2875b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o f2876c;

    public n(o oVar, io.flutter.embedding.engine.renderer.l lVar, Z.d dVar) {
        this.f2876c = oVar;
        this.f2874a = lVar;
        this.f2875b = dVar;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        h hVar;
        this.f2874a.f6109a.removeIsDisplayingFlutterUiListener(this);
        this.f2875b.run();
        o oVar = this.f2876c;
        if (!(oVar.f2890p instanceof h) && (hVar = oVar.f2889o) != null) {
            hVar.c();
            h hVar2 = oVar.f2889o;
            if (hVar2 != null) {
                hVar2.f2855m.close();
                oVar.removeView(oVar.f2889o);
                oVar.f2889o = null;
            }
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a() {
    }
}
