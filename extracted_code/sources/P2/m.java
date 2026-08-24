package P2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1499a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_cur");
    private volatile Object _cur = new o(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1499a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            int a3 = oVar.a(runnable);
            if (a3 == 0) {
                return true;
            }
            if (a3 != 1) {
                if (a3 == 2) {
                    return false;
                }
            } else {
                o c3 = oVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, c3) && atomicReferenceFieldUpdater.get(this) == oVar) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1499a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            if (oVar.b()) {
                return;
            }
            o c3 = oVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, c3) && atomicReferenceFieldUpdater.get(this) == oVar) {
            }
        }
    }

    public final int c() {
        o oVar = (o) f1499a.get(this);
        oVar.getClass();
        long j3 = o.f1502f.get(oVar);
        return 1073741823 & (((int) ((j3 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j3)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1499a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            Object d3 = oVar.d();
            if (d3 != o.f1503g) {
                return d3;
            }
            o c3 = oVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, c3) && atomicReferenceFieldUpdater.get(this) == oVar) {
            }
        }
    }
}
