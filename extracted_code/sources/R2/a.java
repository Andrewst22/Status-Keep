package R2;

import D2.q;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: u  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2107u = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");
    private volatile int indexInArray;

    /* renamed from: m  reason: collision with root package name */
    public final m f2108m;

    /* renamed from: n  reason: collision with root package name */
    public final q f2109n;
    private volatile Object nextParkedWorker;

    /* renamed from: o  reason: collision with root package name */
    public int f2110o;

    /* renamed from: p  reason: collision with root package name */
    public long f2111p;

    /* renamed from: q  reason: collision with root package name */
    public long f2112q;

    /* renamed from: r  reason: collision with root package name */
    public int f2113r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2114s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ b f2115t;
    private volatile int workerCtl;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, D2.q] */
    public a(b bVar, int i3) {
        this.f2115t = bVar;
        setDaemon(true);
        this.f2108m = new m();
        this.f2109n = new Object();
        this.f2110o = 4;
        this.nextParkedWorker = b.f2119w;
        E2.e.f366m.getClass();
        this.f2113r = E2.e.f367n.a().nextInt();
        f(i3);
    }

    public final h a(boolean z3) {
        h e2;
        h e3;
        b bVar;
        long j3;
        int i3 = this.f2110o;
        boolean z4 = true;
        h hVar = null;
        m mVar = this.f2108m;
        b bVar2 = this.f2115t;
        if (i3 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f2117u;
            do {
                bVar = this.f2115t;
                j3 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f2145b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(mVar);
                        if (hVar2 != null && hVar2.f2133n.f2134a == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, hVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != hVar2) {
                                    break;
                                }
                            }
                            hVar = hVar2;
                            break loop1;
                        }
                    }
                    int i4 = m.f2147d.get(mVar);
                    int i5 = m.f2146c.get(mVar);
                    while (true) {
                        if (i4 != i5 && m.f2148e.get(mVar) != 0) {
                            i5--;
                            h c3 = mVar.c(i5, true);
                            if (c3 != null) {
                                hVar = c3;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (hVar == null) {
                        h hVar3 = (h) bVar2.f2125r.d();
                        if (hVar3 == null) {
                            return i(1);
                        }
                        return hVar3;
                    }
                    return hVar;
                }
            } while (!b.f2117u.compareAndSet(bVar, j3, j3 - 4398046511104L));
            this.f2110o = 1;
        }
        if (z3) {
            if (d(bVar2.f2120m * 2) != 0) {
                z4 = false;
            }
            if (!z4 || (e3 = e()) == null) {
                mVar.getClass();
                h hVar4 = (h) m.f2145b.getAndSet(mVar, null);
                if (hVar4 == null) {
                    hVar4 = mVar.b();
                }
                if (hVar4 == null) {
                    if (!z4 && (e2 = e()) != null) {
                        return e2;
                    }
                } else {
                    return hVar4;
                }
            } else {
                return e3;
            }
        } else {
            h e4 = e();
            if (e4 != null) {
                return e4;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i3) {
        int i4 = this.f2113r;
        int i5 = i4 ^ (i4 << 13);
        int i6 = i5 ^ (i5 >> 17);
        int i7 = i6 ^ (i6 << 5);
        this.f2113r = i7;
        int i8 = i3 - 1;
        if ((i8 & i3) == 0) {
            return i7 & i8;
        }
        return (i7 & Integer.MAX_VALUE) % i3;
    }

    public final h e() {
        int d3 = d(2);
        b bVar = this.f2115t;
        if (d3 == 0) {
            h hVar = (h) bVar.f2124q.d();
            if (hVar != null) {
                return hVar;
            }
            return (h) bVar.f2125r.d();
        }
        h hVar2 = (h) bVar.f2125r.d();
        if (hVar2 != null) {
            return hVar2;
        }
        return (h) bVar.f2124q.d();
    }

    public final void f(int i3) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2115t.f2123p);
        sb.append("-worker-");
        if (i3 == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i3);
        }
        sb.append(valueOf);
        setName(sb.toString());
        this.indexInArray = i3;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i3) {
        int i4 = this.f2110o;
        boolean z3 = true;
        if (i4 != 1) {
            z3 = false;
        }
        if (z3) {
            b.f2117u.addAndGet(this.f2115t, 4398046511104L);
        }
        if (i4 != i3) {
            this.f2110o = i3;
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final R2.h i(int r24) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.a.i(int):R2.h");
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0004, code lost:
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.a.run():void");
    }
}
