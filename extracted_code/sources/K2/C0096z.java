package K2;

import P2.AbstractC0097a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import n2.AbstractC0664g;
/* renamed from: K2.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096z extends P2.u {

    /* renamed from: q  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f869q = AtomicIntegerFieldUpdater.newUpdater(C0096z.class, "_decision");
    private volatile int _decision;

    @Override // P2.u, K2.Z
    public final void q(Object obj) {
        r(obj);
    }

    @Override // P2.u, K2.Z
    public final void r(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f869q;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 == 1) {
                    AbstractC0097a.i(AbstractC0664g.p(this.f1513p), AbstractC0092v.h(obj), null);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
