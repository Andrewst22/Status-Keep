package Y;

import k0.C0544G;
import k0.C0550e;
import k0.C0557l;
import k0.InterfaceC0549d;
import o0.C0701z;
/* loaded from: classes.dex */
public final /* synthetic */ class U implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f3177m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Object f3178n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f3179o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f3180p;

    public /* synthetic */ U(Object obj, Object obj2, Object obj3, int i3) {
        this.f3177m = i3;
        this.f3178n = obj;
        this.f3179o = obj2;
        this.f3180p = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [o0.D, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3177m) {
            case 0:
                V v3 = (V) this.f3178n;
                v3.getClass();
                D1.b0 g3 = ((D1.F) this.f3179o).g();
                Z.f fVar = v3.f3183c;
                R.N n3 = fVar.f3482s;
                n3.getClass();
                Z.e eVar = fVar.f3479p;
                eVar.getClass();
                eVar.f3471b = D1.I.j(g3);
                if (!g3.isEmpty()) {
                    eVar.f3474e = (C0701z) g3.get(0);
                    C0701z c0701z = (C0701z) this.f3180p;
                    c0701z.getClass();
                    eVar.f3475f = c0701z;
                }
                if (((C0701z) eVar.f3473d) == null) {
                    eVar.f3473d = Z.e.d(n3, (D1.I) eVar.f3471b, (C0701z) eVar.f3474e, (R.Q) eVar.f3470a);
                }
                eVar.h(((G) n3).r());
                return;
            case 1:
                k0.p pVar = (k0.p) ((C0550e) this.f3178n).f7567o.f25n;
                pVar.f7638c = (String) this.f3179o;
                InterfaceC0549d interfaceC0549d = (InterfaceC0549d) this.f3180p;
                C0544G v4 = interfaceC0549d.v();
                k0.r rVar = pVar.f7639d;
                if (v4 != null) {
                    C0557l c0557l = rVar.f7657p;
                    int l3 = interfaceC0549d.l();
                    k0.y yVar = c0557l.f7626u;
                    yVar.f7689o.put(Integer.valueOf(l3), v4);
                    rVar.f7653H = true;
                }
                rVar.z();
                return;
            default:
                d0.d dVar = (d0.d) this.f3178n;
                this.f3179o.i(dVar.f5148a, dVar.f5149b, (l0.g) this.f3180p);
                return;
        }
    }
}
