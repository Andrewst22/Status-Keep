package P2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1478m = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next");

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1479n = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public d(v vVar) {
        this._prev = vVar;
    }

    public final void a() {
        f1479n.lazySet(this, null);
    }

    public final d b() {
        Object obj = f1478m.get(this);
        if (obj == AbstractC0097a.f1471b) {
            return null;
        }
        return (d) obj;
    }

    public abstract boolean c();

    public final void d() {
        d dVar;
        d b3;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1479n;
            d dVar2 = (d) atomicReferenceFieldUpdater.get(this);
            while (dVar2 != null && dVar2.c()) {
                dVar2 = (d) atomicReferenceFieldUpdater.get(dVar2);
            }
            d b4 = b();
            D2.i.b(b4);
            while (b4.c() && (b3 = b4.b()) != null) {
                b4 = b3;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b4);
                if (((d) obj) == null) {
                    dVar = null;
                } else {
                    dVar = dVar2;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(b4, obj, dVar)) {
                    if (atomicReferenceFieldUpdater.get(b4) != obj) {
                        break;
                    }
                }
            }
            if (dVar2 != null) {
                f1478m.set(dVar2, b4);
            }
            if (!b4.c() || b4.b() == null) {
                if (dVar2 == null || !dVar2.c()) {
                    return;
                }
            }
        }
    }
}
