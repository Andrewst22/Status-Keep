package M2;

import K.L;
import K2.AbstractC0072a;
import K2.AbstractC0092v;
import K2.C0085n;
import K2.Q;
import K2.X;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s2.C0808g;
import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public final class o extends AbstractC0072a implements p, f {

    /* renamed from: p  reason: collision with root package name */
    public final b f1099p;

    public o(u2.i iVar, b bVar) {
        super(iVar, true);
        this.f1099p = bVar;
    }

    @Override // K2.AbstractC0072a
    public final void U(Throwable th, boolean z3) {
        if (!this.f1099p.f(th, false) && !z3) {
            AbstractC0092v.d(th, this.f821o);
        }
    }

    @Override // K2.AbstractC0072a
    public final void V(Object obj) {
        C0808g c0808g = (C0808g) obj;
        this.f1099p.f(null, false);
    }

    public final void X(L l3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        b bVar = this.f1099p;
        bVar.getClass();
        do {
            atomicReferenceFieldUpdater = b.f1066w;
            if (atomicReferenceFieldUpdater.compareAndSet(bVar, null, l3)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(bVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(bVar);
            C1.f fVar = d.f1086q;
            if (obj == fVar) {
                C1.f fVar2 = d.f1087r;
                while (!atomicReferenceFieldUpdater.compareAndSet(bVar, fVar, fVar2)) {
                    if (atomicReferenceFieldUpdater.get(bVar) != fVar) {
                        break;
                    }
                }
                l3.b(bVar.l());
                return;
            } else if (obj == d.f1087r) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            } else {
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        }
    }

    @Override // K2.Z, K2.P
    public final void b(CancellationException cancellationException) {
        Object E3 = E();
        if (!(E3 instanceof C0085n)) {
            if (!(E3 instanceof X) || !((X) E3).d()) {
                if (cancellationException == null) {
                    cancellationException = new Q(v(), null, this);
                }
                t(cancellationException);
            }
        }
    }

    @Override // M2.r
    public final Object i(Object obj) {
        return this.f1099p.i(obj);
    }

    @Override // M2.r
    public final Object o(Object obj, InterfaceC0866d interfaceC0866d) {
        return this.f1099p.o(obj, interfaceC0866d);
    }

    @Override // K2.Z
    public final void t(CancellationException cancellationException) {
        this.f1099p.f(cancellationException, true);
        s(cancellationException);
    }
}
