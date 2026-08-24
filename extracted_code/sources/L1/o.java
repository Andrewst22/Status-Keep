package L1;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
/* loaded from: classes.dex */
public final class o extends I1.r {

    /* renamed from: a  reason: collision with root package name */
    public final K1.n f919a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f920b;

    public o(K1.n nVar, LinkedHashMap linkedHashMap) {
        this.f919a = nVar;
        this.f920b = linkedHashMap;
    }

    @Override // I1.r
    public final Object a(Q1.b bVar) {
        if (bVar.w() == 9) {
            bVar.s();
            return null;
        }
        Object K3 = this.f919a.K();
        try {
            bVar.b();
            while (bVar.j()) {
                n nVar = (n) this.f920b.get(bVar.q());
                if (nVar != null && nVar.f912c) {
                    Object a3 = nVar.f915f.a(bVar);
                    if (a3 != null || !nVar.f918i) {
                        nVar.f913d.set(K3, a3);
                    }
                }
                bVar.B();
            }
            bVar.g();
            return K3;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (IllegalStateException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // I1.r
    public final void b(Q1.c cVar, Object obj) {
        if (obj == null) {
            cVar.j();
            return;
        }
        cVar.c();
        try {
            for (n nVar : this.f920b.values()) {
                boolean z3 = nVar.f911b;
                Field field = nVar.f913d;
                if (z3 && field.get(obj) != obj) {
                    cVar.h(nVar.f910a);
                    Object obj2 = field.get(obj);
                    boolean z4 = nVar.f914e;
                    I1.r rVar = nVar.f915f;
                    if (!z4) {
                        rVar = new s(nVar.f916g, rVar, nVar.f917h.f1466b);
                    }
                    rVar.b(cVar, obj2);
                }
            }
            cVar.g();
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }
}
