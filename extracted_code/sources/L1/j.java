package L1;

import java.lang.reflect.Type;
import java.util.Map;
/* loaded from: classes.dex */
public final class j extends I1.r {

    /* renamed from: a  reason: collision with root package name */
    public final s f900a;

    /* renamed from: b  reason: collision with root package name */
    public final s f901b;

    /* renamed from: c  reason: collision with root package name */
    public final K1.n f902c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f903d;

    public j(c cVar, I1.k kVar, Type type, I1.r rVar, Type type2, I1.r rVar2, K1.n nVar) {
        this.f903d = cVar;
        this.f900a = new s(kVar, rVar, type);
        this.f901b = new s(kVar, rVar2, type2);
        this.f902c = nVar;
    }

    @Override // I1.r
    public final Object a(Q1.b bVar) {
        int w3 = bVar.w();
        if (w3 == 9) {
            bVar.s();
            return null;
        }
        Map map = (Map) this.f902c.K();
        s sVar = this.f901b;
        s sVar2 = this.f900a;
        I1.r rVar = (I1.r) sVar.f936c;
        I1.r rVar2 = (I1.r) sVar2.f936c;
        if (w3 == 1) {
            bVar.a();
            while (bVar.j()) {
                bVar.a();
                Object a3 = rVar2.a(bVar);
                if (map.put(a3, rVar.a(bVar)) == null) {
                    bVar.f();
                } else {
                    throw new RuntimeException("duplicate key: " + a3);
                }
            }
            bVar.f();
        } else {
            bVar.b();
            while (bVar.j()) {
                Q1.a.f1695a.getClass();
                Q1.a.a(bVar);
                Object a4 = rVar2.a(bVar);
                if (map.put(a4, rVar.a(bVar)) != null) {
                    throw new RuntimeException("duplicate key: " + a4);
                }
            }
            bVar.g();
        }
        return map;
    }

    @Override // I1.r
    public final void b(Q1.c cVar, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            cVar.j();
            return;
        }
        this.f903d.getClass();
        s sVar = this.f901b;
        cVar.c();
        for (Map.Entry entry : map.entrySet()) {
            cVar.h(String.valueOf(entry.getKey()));
            sVar.b(cVar, entry.getValue());
        }
        cVar.g();
    }
}
