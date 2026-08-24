package Y;

import R.C0112o;
import R.C0113p;
/* loaded from: classes.dex */
public final /* synthetic */ class C implements U.i {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f3019m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ R.c0 f3020n;

    public /* synthetic */ C(R.c0 c0Var) {
        this.f3020n = c0Var;
    }

    @Override // U.i
    public final void b(Object obj) {
        switch (this.f3019m) {
            case 0:
                ((R.L) obj).n(this.f3020n);
                return;
            default:
                Z.k kVar = (Z.k) obj;
                B0.b bVar = kVar.f3516o;
                R.c0 c0Var = this.f3020n;
                if (bVar != null) {
                    C0113p c0113p = (C0113p) bVar.f28o;
                    if (c0113p.f1981t == -1) {
                        C0112o a3 = c0113p.a();
                        a3.f1943r = c0Var.f1880a;
                        a3.f1944s = c0Var.f1881b;
                        kVar.f3516o = new B0.b(new C0113p(a3), bVar.f27n, (String) bVar.f29p);
                    }
                }
                int i3 = c0Var.f1880a;
                return;
        }
    }

    public /* synthetic */ C(Z.a aVar, R.c0 c0Var) {
        this.f3020n = c0Var;
    }
}
