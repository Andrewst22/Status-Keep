package K2;

import P2.AbstractC0097a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class Y extends P2.b {

    /* renamed from: b  reason: collision with root package name */
    public final U f815b;

    /* renamed from: c  reason: collision with root package name */
    public a0 f816c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Z f817d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ L f818e;

    public Y(U u3, Z z3, L l3) {
        this.f817d = z3;
        this.f818e = l3;
        this.f815b = u3;
    }

    @Override // P2.b
    public final void b(Object obj, Object obj2) {
        boolean z3;
        P2.l lVar;
        P2.l lVar2 = (P2.l) obj;
        if (obj2 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        P2.l lVar3 = this.f815b;
        if (z3) {
            lVar = lVar3;
        } else {
            lVar = this.f816c;
        }
        if (lVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = P2.l.f1496m;
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar2, this, lVar)) {
                if (atomicReferenceFieldUpdater.get(lVar2) != this) {
                    return;
                }
            }
            if (z3) {
                P2.l lVar4 = this.f816c;
                D2.i.b(lVar4);
                lVar3.j(lVar4);
            }
        }
    }

    @Override // P2.b
    public final C1.f c(Object obj) {
        P2.l lVar = (P2.l) obj;
        if (this.f817d.E() == this.f818e) {
            return null;
        }
        return AbstractC0097a.f1474e;
    }
}
