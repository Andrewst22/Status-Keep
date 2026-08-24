package K2;

import java.util.concurrent.locks.LockSupport;
/* renamed from: K2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074c extends AbstractC0072a {

    /* renamed from: p  reason: collision with root package name */
    public final Thread f824p;

    /* renamed from: q  reason: collision with root package name */
    public final H f825q;

    public C0074c(u2.i iVar, Thread thread, H h3) {
        super(iVar, true);
        this.f824p = thread;
        this.f825q = h3;
    }

    @Override // K2.Z
    public final void q(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f824p;
        if (!D2.i.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
