package P2;

import K2.AbstractC0089s;
import K2.AbstractC0094x;
import K2.InterfaceC0095y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public final class j extends AbstractC0089s implements InterfaceC0095y {

    /* renamed from: s  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1491s = AtomicIntegerFieldUpdater.newUpdater(j.class, "runningWorkers");

    /* renamed from: o  reason: collision with root package name */
    public final R2.l f1492o;

    /* renamed from: p  reason: collision with root package name */
    public final int f1493p;

    /* renamed from: q  reason: collision with root package name */
    public final m f1494q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f1495r;
    private volatile int runningWorkers;

    public j(R2.l lVar, int i3) {
        InterfaceC0095y interfaceC0095y;
        this.f1492o = lVar;
        this.f1493p = i3;
        if (lVar instanceof InterfaceC0095y) {
            interfaceC0095y = (InterfaceC0095y) lVar;
        } else {
            interfaceC0095y = null;
        }
        if (interfaceC0095y == null) {
            int i4 = AbstractC0094x.f868a;
        }
        this.f1494q = new m();
        this.f1495r = new Object();
    }

    @Override // K2.AbstractC0089s
    public final void g(u2.i iVar, Runnable runnable) {
        this.f1494q.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1491s;
        if (atomicIntegerFieldUpdater.get(this) < this.f1493p) {
            synchronized (this.f1495r) {
                if (atomicIntegerFieldUpdater.get(this) < this.f1493p) {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    Runnable i3 = i();
                    if (i3 != null) {
                        this.f1492o.g(this, new i(0, this, i3));
                    }
                }
            }
        }
    }

    public final Runnable i() {
        while (true) {
            Runnable runnable = (Runnable) this.f1494q.d();
            if (runnable == null) {
                synchronized (this.f1495r) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1491s;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f1494q.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }
}
