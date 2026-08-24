package K2;

import u2.AbstractC0863a;
import u2.C0867e;
import u2.InterfaceC0868f;
import u2.InterfaceC0869g;
/* renamed from: K2.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0089s extends AbstractC0863a implements InterfaceC0868f {

    /* renamed from: n  reason: collision with root package name */
    public static final r f854n = new r(C0867e.f9460m, C0088q.f851n);

    public AbstractC0089s() {
        super(C0867e.f9460m);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [C2.l, D2.j] */
    @Override // u2.AbstractC0863a, u2.i
    public final InterfaceC0869g d(u2.h hVar) {
        D2.i.e(hVar, "key");
        if (hVar instanceof r) {
            r rVar = (r) hVar;
            u2.h hVar2 = this.f9456m;
            if (hVar2 != rVar && rVar.f853n != hVar2) {
                return null;
            }
            InterfaceC0869g interfaceC0869g = (InterfaceC0869g) rVar.f852m.b(this);
            if (!(interfaceC0869g instanceof InterfaceC0869g)) {
                return null;
            }
            return interfaceC0869g;
        } else if (C0867e.f9460m != hVar) {
            return null;
        } else {
            return this;
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [C2.l, D2.j] */
    @Override // u2.AbstractC0863a, u2.i
    public final u2.i f(u2.h hVar) {
        D2.i.e(hVar, "key");
        boolean z3 = hVar instanceof r;
        u2.j jVar = u2.j.f9461m;
        if (z3) {
            r rVar = (r) hVar;
            u2.h hVar2 = this.f9456m;
            if ((hVar2 == rVar || rVar.f853n == hVar2) && ((InterfaceC0869g) rVar.f852m.b(this)) != null) {
                return jVar;
            }
        } else if (C0867e.f9460m == hVar) {
            return jVar;
        }
        return this;
    }

    public abstract void g(u2.i iVar, Runnable runnable);

    public boolean h() {
        return !(this instanceof i0);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0092v.b(this);
    }
}
