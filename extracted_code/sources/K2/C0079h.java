package K2;

import P2.AbstractC0097a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s2.C0808g;
import u2.InterfaceC0866d;
/* renamed from: K2.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0079h extends S {

    /* renamed from: q  reason: collision with root package name */
    public final C0077f f833q;

    public C0079h(C0077f c0077f) {
        this.f833q = c0077f;
    }

    @Override // C2.l
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        o((Throwable) obj);
        return C0808g.f9229a;
    }

    @Override // K2.U
    public final void o(Throwable th) {
        Z n3 = n();
        C0077f c0077f = this.f833q;
        Throwable t3 = c0077f.t(n3);
        if (c0077f.y()) {
            InterfaceC0866d interfaceC0866d = c0077f.f830p;
            D2.i.c(interfaceC0866d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            P2.h hVar = (P2.h) interfaceC0866d;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = P2.h.f1483t;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                C1.f fVar = AbstractC0097a.f1473d;
                if (D2.i.a(obj, fVar)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, fVar, t3)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != fVar) {
                            break;
                        }
                    }
                    return;
                } else if (!(obj instanceof Throwable)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    return;
                }
            }
        }
        c0077f.q(t3);
        if (!c0077f.y()) {
            c0077f.r();
        }
    }
}
