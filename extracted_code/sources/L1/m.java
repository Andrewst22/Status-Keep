package L1;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class m extends I1.r {

    /* renamed from: b  reason: collision with root package name */
    public static final a f908b = new a(2);

    /* renamed from: a  reason: collision with root package name */
    public final I1.k f909a;

    public m(I1.k kVar) {
        this.f909a = kVar;
    }

    @Override // I1.r
    public final Object a(Q1.b bVar) {
        int b3 = N.j.b(bVar.w());
        if (b3 != 0) {
            if (b3 != 2) {
                if (b3 != 5) {
                    if (b3 != 6) {
                        if (b3 != 7) {
                            if (b3 == 8) {
                                bVar.s();
                                return null;
                            }
                            throw new IllegalStateException();
                        }
                        return Boolean.valueOf(bVar.m());
                    }
                    return Double.valueOf(bVar.n());
                }
                return bVar.u();
            }
            K1.m mVar = new K1.m();
            bVar.b();
            while (bVar.j()) {
                mVar.put(bVar.q(), a(bVar));
            }
            bVar.g();
            return mVar;
        }
        ArrayList arrayList = new ArrayList();
        bVar.a();
        while (bVar.j()) {
            arrayList.add(a(bVar));
        }
        bVar.f();
        return arrayList;
    }

    @Override // I1.r
    public final void b(Q1.c cVar, Object obj) {
        if (obj == null) {
            cVar.j();
            return;
        }
        Class<?> cls = obj.getClass();
        I1.k kVar = this.f909a;
        kVar.getClass();
        I1.r c3 = kVar.c(new P1.a(cls));
        if (c3 instanceof m) {
            cVar.c();
            cVar.g();
            return;
        }
        c3.b(cVar, obj);
    }
}
