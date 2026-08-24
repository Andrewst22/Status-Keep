package S2;

import C2.l;
import K2.C0077f;
import K2.InterfaceC0076e;
import K2.l0;
import P2.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s2.C0808g;
/* loaded from: classes.dex */
public final class c implements InterfaceC0076e, l0 {

    /* renamed from: m  reason: collision with root package name */
    public final C0077f f2209m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ d f2210n;

    public c(d dVar, C0077f c0077f) {
        this.f2210n = dVar;
        this.f2209m = c0077f;
    }

    @Override // K2.l0
    public final void a(v vVar, int i3) {
        this.f2209m.a(vVar, i3);
    }

    @Override // K2.InterfaceC0076e
    public final C1.f g(Object obj, l lVar) {
        d dVar = this.f2210n;
        b bVar = new b(1, dVar, this);
        C1.f g3 = this.f2209m.g((C0808g) obj, bVar);
        if (g3 != null) {
            d.f2211g.set(dVar, null);
        }
        return g3;
    }

    @Override // u2.InterfaceC0866d
    public final u2.i h() {
        return this.f2209m.f831q;
    }

    @Override // u2.InterfaceC0866d
    public final void k(Object obj) {
        this.f2209m.k(obj);
    }

    @Override // K2.InterfaceC0076e
    public final void l(Object obj, l lVar) {
        C0808g c0808g = C0808g.f9229a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f2211g;
        d dVar = this.f2210n;
        atomicReferenceFieldUpdater.set(dVar, null);
        this.f2209m.l(c0808g, new b(0, dVar, this));
    }

    @Override // K2.InterfaceC0076e
    public final void m(Object obj) {
        this.f2209m.m(obj);
    }
}
