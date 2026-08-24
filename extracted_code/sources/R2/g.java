package R2;

import K2.I;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
/* loaded from: classes.dex */
public abstract class g extends I {

    /* renamed from: o  reason: collision with root package name */
    public b f2131o;

    @Override // K2.AbstractC0089s
    public final void g(u2.i iVar, Runnable runnable) {
        b bVar = this.f2131o;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f2116t;
        bVar.b(runnable, k.f2142g, false);
    }
}
