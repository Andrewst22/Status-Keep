package K2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t2.C0825b;
/* loaded from: classes.dex */
public abstract class G extends H implements InterfaceC0095y {

    /* renamed from: s  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f789s = AtomicReferenceFieldUpdater.newUpdater(G.class, Object.class, "_queue");

    /* renamed from: t  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f790t = AtomicReferenceFieldUpdater.newUpdater(G.class, Object.class, "_delayed");

    /* renamed from: u  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f791u = AtomicIntegerFieldUpdater.newUpdater(G.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // K2.AbstractC0089s
    public final void g(u2.i iVar, Runnable runnable) {
        p(runnable);
    }

    @Override // K2.H
    public final long l() {
        Runnable runnable;
        if (m()) {
            return 0L;
        }
        F f3 = (F) f790t.get(this);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f789s;
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            } else if (obj instanceof P2.o) {
                P2.o oVar = (P2.o) obj;
                Object d3 = oVar.d();
                if (d3 != P2.o.f1503g) {
                    runnable = (Runnable) d3;
                    break;
                }
                P2.o c3 = oVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (obj != AbstractC0092v.f858b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                runnable = (Runnable) obj;
                break loop0;
            } else {
                break;
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        return q();
    }

    @Override // K2.H
    public void o() {
        h0.f834a.set(null);
        f791u.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f789s;
            Object obj = atomicReferenceFieldUpdater.get(this);
            C1.f fVar = AbstractC0092v.f858b;
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, fVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else if (obj instanceof P2.o) {
                ((P2.o) obj).b();
                break;
            } else if (obj != fVar) {
                P2.o oVar = new P2.o(8, true);
                oVar.a((Runnable) obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                break loop0;
            } else {
                break;
            }
        }
        do {
        } while (l() <= 0);
        System.nanoTime();
        F f3 = (F) f790t.get(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
        r6 = j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
        if (java.lang.Thread.currentThread() == r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
        java.util.concurrent.locks.LockSupport.unpark(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(java.lang.Runnable r6) {
        /*
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = K2.G.f789s
            java.lang.Object r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = K2.G.f791u
            int r2 = r2.get(r5)
            if (r2 == 0) goto Lf
            goto L4a
        Lf:
            if (r1 != 0) goto L20
        L11:
            r1 = 0
            boolean r1 = r0.compareAndSet(r5, r1, r6)
            if (r1 == 0) goto L19
            goto L66
        L19:
            java.lang.Object r1 = r0.get(r5)
            if (r1 == 0) goto L11
            goto L0
        L20:
            boolean r2 = r1 instanceof P2.o
            r3 = 1
            if (r2 == 0) goto L46
            r2 = r1
            P2.o r2 = (P2.o) r2
            int r4 = r2.a(r6)
            if (r4 == 0) goto L66
            if (r4 == r3) goto L34
            r0 = 2
            if (r4 == r0) goto L4a
            goto L0
        L34:
            P2.o r2 = r2.c()
        L38:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L3f
            goto L0
        L3f:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L38
            goto L0
        L46:
            C1.f r2 = K2.AbstractC0092v.f858b
            if (r1 != r2) goto L50
        L4a:
            K2.w r0 = K2.RunnableC0093w.f866v
            r0.p(r6)
            goto L73
        L50:
            P2.o r2 = new P2.o
            r4 = 8
            r2.<init>(r4, r3)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r6)
        L60:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L74
        L66:
            java.lang.Thread r6 = r5.j()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r0 == r6) goto L73
            java.util.concurrent.locks.LockSupport.unpark(r6)
        L73:
            return
        L74:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L60
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.G.p(java.lang.Runnable):void");
    }

    public final long q() {
        long j3;
        C0825b c0825b = this.f795q;
        if (c0825b == null || c0825b.isEmpty()) {
            j3 = Long.MAX_VALUE;
        } else {
            j3 = 0;
        }
        if (j3 == 0) {
            return 0L;
        }
        Object obj = f789s.get(this);
        if (obj != null) {
            if (obj instanceof P2.o) {
                long j4 = P2.o.f1502f.get((P2.o) obj);
                if (((int) (1073741823 & j4)) != ((int) ((j4 & 1152921503533105152L) >> 30))) {
                    return 0L;
                }
            } else if (obj == AbstractC0092v.f858b) {
                return Long.MAX_VALUE;
            } else {
                return 0L;
            }
        }
        F f3 = (F) f790t.get(this);
        return Long.MAX_VALUE;
    }

    public final boolean r() {
        boolean z3;
        C0825b c0825b = this.f795q;
        if (c0825b != null) {
            z3 = c0825b.isEmpty();
        } else {
            z3 = true;
        }
        if (!z3) {
            return false;
        }
        F f3 = (F) f790t.get(this);
        Object obj = f789s.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof P2.o) {
            long j3 = P2.o.f1502f.get((P2.o) obj);
            if (((int) (1073741823 & j3)) == ((int) ((j3 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0092v.f858b) {
            return true;
        }
        return false;
    }
}
