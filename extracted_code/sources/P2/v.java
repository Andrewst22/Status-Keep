package P2;

import K2.c0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public abstract class v extends d implements c0 {

    /* renamed from: p  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1514p = AtomicIntegerFieldUpdater.newUpdater(v.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: o  reason: collision with root package name */
    public final long f1515o;

    public v(long j3, v vVar, int i3) {
        super(vVar);
        this.f1515o = j3;
        this.cleanedAndPointers = i3 << 16;
    }

    @Override // P2.d
    public final boolean c() {
        if (f1514p.get(this) == f() && b() != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (f1514p.addAndGet(this, -65536) == f() && b() != null) {
            return true;
        }
        return false;
    }

    public abstract int f();

    public abstract void g(int i3, u2.i iVar);

    public final void h() {
        if (f1514p.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f1514p;
            i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 65536 + i3));
        return true;
    }
}
