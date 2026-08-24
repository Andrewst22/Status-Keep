package K2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public abstract class U extends P2.l implements C, L, C2.l {

    /* renamed from: p  reason: collision with root package name */
    public Z f805p;

    @Override // K2.L
    public final boolean a() {
        return true;
    }

    @Override // K2.C
    public final void d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        Z n3 = n();
        while (true) {
            Object E3 = n3.E();
            if (E3 instanceof U) {
                if (E3 == this) {
                    E e2 = AbstractC0092v.f865i;
                    do {
                        atomicReferenceFieldUpdater2 = Z.f819m;
                        if (atomicReferenceFieldUpdater2.compareAndSet(n3, E3, e2)) {
                            return;
                        }
                    } while (atomicReferenceFieldUpdater2.get(n3) == E3);
                } else {
                    return;
                }
            } else if (!(E3 instanceof L) || ((L) E3).g() == null) {
                return;
            } else {
                while (true) {
                    Object k3 = k();
                    if (k3 instanceof P2.s) {
                        P2.l lVar = ((P2.s) k3).f1512a;
                        return;
                    } else if (k3 == this) {
                        P2.l lVar2 = (P2.l) k3;
                        return;
                    } else {
                        D2.i.c(k3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        P2.l lVar3 = (P2.l) k3;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = P2.l.f1498o;
                        P2.s sVar = (P2.s) atomicReferenceFieldUpdater3.get(lVar3);
                        if (sVar == null) {
                            sVar = new P2.s(lVar3);
                            atomicReferenceFieldUpdater3.lazySet(lVar3, sVar);
                        }
                        do {
                            atomicReferenceFieldUpdater = P2.l.f1496m;
                            if (atomicReferenceFieldUpdater.compareAndSet(this, k3, sVar)) {
                                lVar3.h();
                                return;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == k3);
                    }
                }
            }
        }
    }

    @Override // K2.L
    public final a0 g() {
        return null;
    }

    public P getParent() {
        return n();
    }

    public final Z n() {
        Z z3 = this.f805p;
        if (z3 != null) {
            return z3;
        }
        D2.i.g("job");
        throw null;
    }

    public abstract void o(Throwable th);

    @Override // P2.l
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0092v.b(this) + "[job@" + AbstractC0092v.b(n()) + ']';
    }
}
