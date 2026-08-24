package R2;

import K2.AbstractC0089s;
import K2.I;
import P2.AbstractC0097a;
import P2.x;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class c extends I implements Executor {

    /* renamed from: o  reason: collision with root package name */
    public static final c f2127o = new AbstractC0089s();

    /* renamed from: p  reason: collision with root package name */
    public static final AbstractC0089s f2128p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [R2.c, K2.s] */
    /* JADX WARN: Type inference failed for: r2v3, types: [P2.j] */
    static {
        l lVar = l.f2144o;
        int i3 = x.f1517a;
        if (64 >= i3) {
            i3 = 64;
        }
        int l3 = AbstractC0097a.l("kotlinx.coroutines.io.parallelism", i3, 0, 0, 12);
        lVar.getClass();
        if (l3 >= 1) {
            if (l3 < k.f2139d) {
                if (l3 >= 1) {
                    lVar = new P2.j(lVar, l3);
                } else {
                    throw new IllegalArgumentException(D2.h.k("Expected positive parallelism level, but got ", l3).toString());
                }
            }
            f2128p = lVar;
            return;
        }
        throw new IllegalArgumentException(D2.h.k("Expected positive parallelism level, but got ", l3).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g(u2.j.f9461m, runnable);
    }

    @Override // K2.AbstractC0089s
    public final void g(u2.i iVar, Runnable runnable) {
        f2128p.g(iVar, runnable);
    }

    @Override // K2.AbstractC0089s
    public final String toString() {
        return "Dispatchers.IO";
    }
}
