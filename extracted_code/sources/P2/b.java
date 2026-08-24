package P2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public abstract class b extends r {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1476a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC0097a.f1470a;

    @Override // P2.r
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1476a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        C1.f fVar = AbstractC0097a.f1470a;
        if (obj2 == fVar) {
            C1.f c3 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == fVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, fVar, c3)) {
                        obj2 = c3;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != fVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract C1.f c(Object obj);
}
