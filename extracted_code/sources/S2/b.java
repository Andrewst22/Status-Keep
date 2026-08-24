package S2;

import C2.l;
import K.C0059m;
import K.L;
import K.M;
import K2.l0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s2.C0808g;
/* loaded from: classes.dex */
public final class b extends D2.j implements l {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f2206n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f2207o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f2208p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i3, Object obj, Object obj2) {
        super(1);
        this.f2206n = i3;
        this.f2207o = obj;
        this.f2208p = obj2;
    }

    @Override // C2.l
    public final Object b(Object obj) {
        Object gVar;
        M2.j jVar;
        l0 l0Var;
        C0808g c0808g;
        C0808g c0808g2;
        switch (this.f2206n) {
            case 0:
                Throwable th = (Throwable) obj;
                ((c) this.f2208p).getClass();
                ((d) this.f2207o).e(null);
                return C0808g.f9229a;
            case 1:
                Throwable th2 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f2211g;
                ((c) this.f2208p).getClass();
                d dVar = (d) this.f2207o;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return C0808g.f9229a;
            default:
                Throwable th3 = (Throwable) obj;
                ((L) this.f2207o).b(th3);
                C0059m c0059m = (C0059m) this.f2208p;
                ((M2.b) c0059m.f652o).f(th3, false);
                do {
                    M2.b bVar = (M2.b) c0059m.f652o;
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = M2.b.f1059p;
                    long j3 = atomicLongFieldUpdater.get(bVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = M2.b.f1058o;
                    long j4 = atomicLongFieldUpdater2.get(bVar);
                    if (bVar.r(j4, true)) {
                        gVar = new M2.g(bVar.l());
                    } else {
                        Object obj2 = M2.i.f1093a;
                        if (j3 < (j4 & 1152921504606846975L)) {
                            C1.f fVar = M2.d.f1080k;
                            M2.j jVar2 = (M2.j) M2.b.f1063t.get(bVar);
                            for (boolean z3 = true; !bVar.r(atomicLongFieldUpdater2.get(bVar), z3); z3 = true) {
                                long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar);
                                long j5 = M2.d.f1071b;
                                Object obj3 = obj2;
                                long j6 = andIncrement / j5;
                                int i3 = (int) (andIncrement % j5);
                                if (jVar2.f1515o != j6) {
                                    M2.j k3 = bVar.k(j6, jVar2);
                                    if (k3 == null) {
                                        continue;
                                        obj2 = obj3;
                                    } else {
                                        jVar = k3;
                                    }
                                } else {
                                    jVar = jVar2;
                                }
                                Object A3 = bVar.A(jVar, i3, andIncrement, fVar);
                                if (A3 == M2.d.f1082m) {
                                    if (fVar instanceof l0) {
                                        l0Var = (l0) fVar;
                                    } else {
                                        l0Var = null;
                                    }
                                    if (l0Var != null) {
                                        l0Var.a(jVar, i3);
                                    }
                                    bVar.C(andIncrement);
                                    jVar.h();
                                    obj2 = obj3;
                                } else if (A3 == M2.d.f1084o) {
                                    if (andIncrement < bVar.p()) {
                                        jVar.a();
                                    }
                                    jVar2 = jVar;
                                    obj2 = obj3;
                                } else if (A3 != M2.d.f1083n) {
                                    jVar.a();
                                    obj2 = A3;
                                } else {
                                    throw new IllegalStateException("unexpected");
                                }
                            }
                            gVar = new M2.g(bVar.l());
                        }
                        gVar = obj2;
                    }
                    c0808g = null;
                    if (gVar instanceof M2.h) {
                        gVar = null;
                    }
                    c0808g2 = C0808g.f9229a;
                    if (gVar != null) {
                        M.f552n.i(gVar, th3);
                        c0808g = c0808g2;
                        continue;
                    }
                } while (c0808g != null);
                return c0808g2;
        }
    }
}
