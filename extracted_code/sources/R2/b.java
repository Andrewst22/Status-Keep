package R2;

import K2.AbstractC0092v;
import P2.t;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes.dex */
public final class b implements Executor, Closeable {

    /* renamed from: t  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2116t = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* renamed from: u  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2117u = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* renamed from: v  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2118v = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* renamed from: w  reason: collision with root package name */
    public static final C1.f f2119w = new C1.f("NOT_IN_STACK", 1);
    private volatile int _isTerminated;
    private volatile long controlState;

    /* renamed from: m  reason: collision with root package name */
    public final int f2120m;

    /* renamed from: n  reason: collision with root package name */
    public final int f2121n;

    /* renamed from: o  reason: collision with root package name */
    public final long f2122o;

    /* renamed from: p  reason: collision with root package name */
    public final String f2123p;
    private volatile long parkedWorkersStack;

    /* renamed from: q  reason: collision with root package name */
    public final e f2124q;

    /* renamed from: r  reason: collision with root package name */
    public final e f2125r;

    /* renamed from: s  reason: collision with root package name */
    public final t f2126s;

    /* JADX WARN: Type inference failed for: r4v10, types: [R2.e, P2.m] */
    /* JADX WARN: Type inference failed for: r4v11, types: [R2.e, P2.m] */
    public b(int i3, int i4, long j3, String str) {
        this.f2120m = i3;
        this.f2121n = i4;
        this.f2122o = j3;
        this.f2123p = str;
        if (i3 >= 1) {
            if (i4 >= i3) {
                if (i4 <= 2097150) {
                    if (j3 > 0) {
                        this.f2124q = new P2.m();
                        this.f2125r = new P2.m();
                        this.f2126s = new t((i3 + 1) * 2);
                        this.controlState = i3 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j3 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i4 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(D2.h.j(i4, i3, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i3 + " should be at least 1").toString());
    }

    public final int a() {
        boolean z3;
        synchronized (this.f2126s) {
            try {
                if (f2118v.get(this) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f2117u;
                long j3 = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j3 & 2097151);
                int i4 = i3 - ((int) ((j3 & 4398044413952L) >> 21));
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i4 >= this.f2120m) {
                    return 0;
                }
                if (i3 >= this.f2121n) {
                    return 0;
                }
                int i5 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i5 > 0 && this.f2126s.b(i5) == null) {
                    a aVar = new a(this, i5);
                    this.f2126s.c(i5, aVar);
                    if (i5 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i6 = i4 + 1;
                        aVar.start();
                        return i6;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, i iVar, boolean z3) {
        h jVar;
        boolean z4;
        long j3;
        a aVar;
        boolean a3;
        int i3;
        k.f2141f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof h) {
            jVar = (h) runnable;
            jVar.f2132m = nanoTime;
            jVar.f2133n = iVar;
        } else {
            jVar = new j(runnable, nanoTime, iVar);
        }
        boolean z5 = false;
        if (jVar.f2133n.f2134a == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2117u;
        if (z4) {
            j3 = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j3 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a) {
            aVar = (a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar == null || !D2.i.a(aVar.f2115t, this)) {
            aVar = null;
        }
        if (aVar != null && (i3 = aVar.f2110o) != 5 && (jVar.f2133n.f2134a != 0 || i3 != 2)) {
            aVar.f2114s = true;
            m mVar = aVar.f2108m;
            if (z3) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                h hVar = (h) m.f2145b.getAndSet(mVar, jVar);
                if (hVar == null) {
                    jVar = null;
                } else {
                    jVar = mVar.a(hVar);
                }
            }
        }
        if (jVar != null) {
            if (jVar.f2133n.f2134a == 1) {
                a3 = this.f2125r.a(jVar);
            } else {
                a3 = this.f2124q.a(jVar);
            }
            if (!a3) {
                throw new RejectedExecutionException(this.f2123p + " was terminated");
            }
        }
        if (z3 && aVar != null) {
            z5 = true;
        }
        if (z4) {
            if (!z5 && !f() && !d(j3)) {
                f();
            }
        } else if (!z5 && !f() && !d(atomicLongFieldUpdater.get(this))) {
            f();
        }
    }

    public final void c(a aVar, int i3, int i4) {
        while (true) {
            long j3 = f2116t.get(this);
            int i5 = (int) (2097151 & j3);
            long j4 = (2097152 + j3) & (-2097152);
            if (i5 == i3) {
                if (i4 == 0) {
                    Object c3 = aVar.c();
                    while (true) {
                        if (c3 == f2119w) {
                            i5 = -1;
                            break;
                        } else if (c3 == null) {
                            i5 = 0;
                            break;
                        } else {
                            a aVar2 = (a) c3;
                            i5 = aVar2.b();
                            if (i5 != 0) {
                                break;
                            }
                            c3 = aVar2.c();
                        }
                    }
                } else {
                    i5 = i4;
                }
            }
            if (i5 >= 0) {
                if (f2116t.compareAndSet(this, j3, j4 | i5)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
        if (r1 == null) goto L46;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = R2.b.f2118v
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Laf
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof R2.a
            r3 = 0
            if (r1 == 0) goto L18
            R2.a r0 = (R2.a) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            R2.b r1 = r0.f2115t
            boolean r1 = D2.i.a(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            P2.t r1 = r8.f2126s
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = R2.b.f2117u     // Catch: java.lang.Throwable -> Lc1
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc1
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r1)
            if (r2 > r5) goto L77
            r1 = 1
        L37:
            P2.t r4 = r8.f2126s
            java.lang.Object r4 = r4.b(r1)
            D2.i.b(r4)
            R2.a r4 = (R2.a) r4
            if (r4 == r0) goto L72
        L44:
            boolean r6 = r4.isAlive()
            if (r6 == 0) goto L53
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r6 = 10000(0x2710, double:4.9407E-320)
            r4.join(r6)
            goto L44
        L53:
            R2.m r4 = r4.f2108m
            R2.e r6 = r8.f2125r
            r4.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = R2.m.f2145b
            java.lang.Object r7 = r7.getAndSet(r4, r3)
            R2.h r7 = (R2.h) r7
            if (r7 == 0) goto L67
            r6.a(r7)
        L67:
            R2.h r7 = r4.b()
            if (r7 != 0) goto L6e
            goto L72
        L6e:
            r6.a(r7)
            goto L67
        L72:
            if (r1 == r5) goto L77
            int r1 = r1 + 1
            goto L37
        L77:
            R2.e r1 = r8.f2125r
            r1.b()
            R2.e r1 = r8.f2124q
            r1.b()
        L81:
            if (r0 == 0) goto L89
            R2.h r1 = r0.a(r2)
            if (r1 != 0) goto Lb0
        L89:
            R2.e r1 = r8.f2124q
            java.lang.Object r1 = r1.d()
            R2.h r1 = (R2.h) r1
            if (r1 != 0) goto Lb0
            R2.e r1 = r8.f2125r
            java.lang.Object r1 = r1.d()
            R2.h r1 = (R2.h) r1
            if (r1 != 0) goto Lb0
            if (r0 == 0) goto La3
            r1 = 5
            r0.h(r1)
        La3:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = R2.b.f2116t
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = R2.b.f2117u
            r0.set(r8, r1)
        Laf:
            return
        Lb0:
            r1.run()     // Catch: java.lang.Throwable -> Lb4
            goto L81
        Lb4:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L81
        Lc1:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.b.close():void");
    }

    public final boolean d(long j3) {
        int i3 = ((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21));
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = this.f2120m;
        if (i3 < i4) {
            int a3 = a();
            if (a3 == 1 && i4 > 1) {
                a();
            }
            if (a3 > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, k.f2142g, false);
    }

    public final boolean f() {
        C1.f fVar;
        int i3;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2116t;
            long j3 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f2126s.b((int) (2097151 & j3));
            if (aVar == null) {
                aVar = null;
            } else {
                long j4 = (2097152 + j3) & (-2097152);
                Object c3 = aVar.c();
                while (true) {
                    fVar = f2119w;
                    if (c3 == fVar) {
                        i3 = -1;
                        break;
                    } else if (c3 == null) {
                        i3 = 0;
                        break;
                    } else {
                        a aVar2 = (a) c3;
                        i3 = aVar2.b();
                        if (i3 != 0) {
                            break;
                        }
                        c3 = aVar2.c();
                    }
                }
                if (i3 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j3, j4 | i3)) {
                    aVar.g(fVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f2107u.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        int i3;
        ArrayList arrayList = new ArrayList();
        t tVar = this.f2126s;
        int a3 = tVar.a();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 1; i9 < a3; i9++) {
            a aVar = (a) tVar.b(i9);
            if (aVar != null) {
                m mVar = aVar.f2108m;
                mVar.getClass();
                if (m.f2145b.get(mVar) != null) {
                    i3 = (m.f2146c.get(mVar) - m.f2147d.get(mVar)) + 1;
                } else {
                    i3 = m.f2146c.get(mVar) - m.f2147d.get(mVar);
                }
                int b3 = N.j.b(aVar.f2110o);
                if (b3 != 0) {
                    if (b3 != 1) {
                        if (b3 != 2) {
                            if (b3 != 3) {
                                if (b3 == 4) {
                                    i8++;
                                }
                            } else {
                                i7++;
                                if (i3 > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(i3);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i6++;
                        }
                    } else {
                        i5++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i3);
                        sb2.append('b');
                        arrayList.add(sb2.toString());
                    }
                } else {
                    i4++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i3);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                }
            }
        }
        long j3 = f2117u.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f2123p);
        sb4.append('@');
        sb4.append(AbstractC0092v.b(this));
        sb4.append("[Pool Size {core = ");
        int i10 = this.f2120m;
        sb4.append(i10);
        sb4.append(", max = ");
        sb4.append(this.f2121n);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i4);
        sb4.append(", blocking = ");
        sb4.append(i5);
        sb4.append(", parked = ");
        sb4.append(i6);
        sb4.append(", dormant = ");
        sb4.append(i7);
        sb4.append(", terminated = ");
        sb4.append(i8);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f2124q.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f2125r.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j3));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j3) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i10 - ((int) ((j3 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
