package W1;

import android.os.Build;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class e implements io.flutter.embedding.engine.renderer.m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2840a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2841b;

    public /* synthetic */ e(Object obj, int i3) {
        this.f2840a = i3;
        this.f2841b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a() {
        switch (this.f2840a) {
            case 0:
                g gVar = (g) this.f2841b;
                gVar.f2844a.getClass();
                gVar.f2850g = false;
                return;
            case 1:
                return;
            default:
                o oVar = (o) this.f2841b;
                oVar.f2893s = false;
                Iterator it = oVar.f2892r.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.m) it.next()).a();
                }
                return;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        switch (this.f2840a) {
            case 0:
                g gVar = (g) this.f2841b;
                d dVar = gVar.f2844a;
                if (Build.VERSION.SDK_INT >= 29) {
                    dVar.reportFullyDrawn();
                } else {
                    dVar.getClass();
                }
                gVar.f2850g = true;
                gVar.f2851h = true;
                return;
            case 1:
                j jVar = (j) this.f2841b;
                jVar.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.l lVar = jVar.f2865o;
                if (lVar != null) {
                    lVar.f6109a.removeIsDisplayingFlutterUiListener(this);
                    return;
                }
                return;
            default:
                o oVar = (o) this.f2841b;
                oVar.f2893s = true;
                Iterator it = oVar.f2892r.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.m) it.next()).b();
                }
                return;
        }
    }

    private final void c() {
    }
}
