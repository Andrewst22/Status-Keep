package K2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import s2.C0808g;
/* loaded from: classes.dex */
public final class N extends S {

    /* renamed from: r  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f799r = AtomicIntegerFieldUpdater.newUpdater(N.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: q  reason: collision with root package name */
    public final C2.l f800q;

    public N(C2.l lVar) {
        this.f800q = lVar;
    }

    @Override // C2.l
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        o((Throwable) obj);
        return C0808g.f9229a;
    }

    @Override // K2.U
    public final void o(Throwable th) {
        if (f799r.compareAndSet(this, 0, 1)) {
            this.f800q.b(th);
        }
    }
}
