package X1;

import io.flutter.plugin.platform.n;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3013a = new ArrayList();

    public g(W1.d dVar, String[] strArr) {
        a2.e eVar = (a2.e) B1.e.j0().f56n;
        if (!eVar.f3857a) {
            eVar.c(dVar.getApplicationContext());
            eVar.a(dVar.getApplicationContext(), strArr);
        }
    }

    public final c a(f fVar) {
        c cVar;
        W1.d dVar = (W1.d) fVar.f3009o;
        Y1.a aVar = (Y1.a) fVar.f3010p;
        String str = (String) fVar.f3011q;
        List<String> list = (List) fVar.f3012r;
        n nVar = new n();
        boolean z3 = fVar.f3007m;
        boolean z4 = fVar.f3008n;
        if (aVar == null) {
            a2.e eVar = (a2.e) B1.e.j0().f56n;
            if (eVar.f3857a) {
                aVar = new Y1.a(eVar.f3860d.f3849b, "main");
            } else {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
        }
        ArrayList arrayList = this.f3013a;
        if (arrayList.size() == 0) {
            cVar = new c(dVar, null, nVar, z3, z4);
            if (str != null) {
                cVar.f2984i.f5557a.a("setInitialRoute", str, null);
            }
            cVar.f2978c.a(aVar, list);
        } else {
            c cVar2 = (c) arrayList.get(0);
            if (cVar2.f2976a.isAttached()) {
                long j3 = c.f2975w;
                cVar = new c(dVar, cVar2.f2976a.spawn(aVar.f3417c, aVar.f3416b, str, list, j3), nVar, z3, z4);
            } else {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
        }
        arrayList.add(cVar);
        cVar.f2995t.add(new e(this, cVar));
        return cVar;
    }
}
