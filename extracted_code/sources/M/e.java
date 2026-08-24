package M;

import T2.l;
import s2.C0808g;
/* loaded from: classes.dex */
public final class e extends D2.j implements C2.a {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f984n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ f f985o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i3) {
        super(0);
        this.f984n = i3;
        this.f985o = fVar;
    }

    @Override // C2.a
    public final Object c() {
        switch (this.f984n) {
            case 0:
                f fVar = this.f985o;
                l lVar = (l) fVar.f990c.c();
                if (U2.b.a(lVar) != -1) {
                    return B1.b.q(lVar.f2380m.n(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + fVar.f990c + ", instead got " + lVar).toString());
            default:
                B1.b bVar = f.f987f;
                f fVar2 = this.f985o;
                synchronized (bVar) {
                    f.f986e.remove(((l) fVar2.f991d.a()).f2380m.n());
                }
                return C0808g.f9229a;
        }
    }
}
