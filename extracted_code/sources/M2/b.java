package M2;

import D2.t;
import K2.C0077f;
import K2.InterfaceC0076e;
import K2.l0;
import P2.AbstractC0097a;
import P2.v;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m2.AbstractC0635d;
import n2.AbstractC0664g;
import s2.C0808g;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public class b implements f {

    /* renamed from: o  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1058o = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: p  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1059p = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: q  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1060q = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: r  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1061r = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: s  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1062s = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: t  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1063t = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: u  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1064u = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: v  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1065v = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: w  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1066w = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: m  reason: collision with root package name */
    public final int f1067m;

    /* renamed from: n  reason: collision with root package name */
    public final C2.l f1068n;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public b(int i3, C2.l lVar) {
        long j3;
        this.f1067m = i3;
        this.f1068n = lVar;
        if (i3 >= 0) {
            j jVar = d.f1070a;
            if (i3 != 0) {
                if (i3 != Integer.MAX_VALUE) {
                    j3 = i3;
                } else {
                    j3 = Long.MAX_VALUE;
                }
            } else {
                j3 = 0;
            }
            this.bufferEnd = j3;
            this.completedExpandBuffersAndPauseFlag = f1060q.get(this);
            j jVar2 = new j(0L, null, this, 3);
            this.sendSegment = jVar2;
            this.receiveSegment = jVar2;
            if (u()) {
                jVar2 = d.f1070a;
                D2.i.c(jVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = jVar2;
            this._closeCause = d.f1088s;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i3 + ", should be >=0").toString());
    }

    public static final j a(b bVar, long j3, j jVar) {
        Object c3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        long j5;
        bVar.getClass();
        j jVar2 = d.f1070a;
        c cVar = c.f1069u;
        loop0: while (true) {
            c3 = AbstractC0097a.c(jVar, j3, cVar);
            if (!AbstractC0097a.f(c3)) {
                v d3 = AbstractC0097a.d(c3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1062s;
                    v vVar = (v) atomicReferenceFieldUpdater.get(bVar);
                    if (vVar.f1515o >= d3.f1515o) {
                        break loop0;
                    } else if (!d3.i()) {
                        break;
                    } else {
                        while (!atomicReferenceFieldUpdater.compareAndSet(bVar, vVar, d3)) {
                            if (atomicReferenceFieldUpdater.get(bVar) != vVar) {
                                if (d3.e()) {
                                    d3.d();
                                }
                            }
                        }
                        if (vVar.e()) {
                            vVar.d();
                        }
                    }
                }
            } else {
                break;
            }
        }
        boolean f3 = AbstractC0097a.f(c3);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1059p;
        if (f3) {
            bVar.s();
            if (jVar.f1515o * d.f1071b >= atomicLongFieldUpdater2.get(bVar)) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) AbstractC0097a.d(c3);
        long j6 = jVar3.f1515o;
        if (j6 > j3) {
            long j7 = d.f1071b * j6;
            do {
                atomicLongFieldUpdater = f1058o;
                j4 = atomicLongFieldUpdater.get(bVar);
                j5 = 1152921504606846975L & j4;
                if (j5 >= j7) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(bVar, j4, j5 + (((int) (j4 >> 60)) << 60)));
            if (j6 * d.f1071b >= atomicLongFieldUpdater2.get(bVar)) {
                return null;
            }
            jVar3.a();
            return null;
        }
        return jVar3;
    }

    public static final void c(b bVar, Object obj, C0077f c0077f) {
        C2.l lVar = bVar.f1068n;
        if (lVar != null) {
            AbstractC0097a.a(lVar, obj, c0077f.f831q);
        }
        c0077f.k(AbstractC0664g.f(bVar.n()));
    }

    public static final int d(b bVar, j jVar, int i3, Object obj, long j3, Object obj2, boolean z3) {
        bVar.getClass();
        jVar.m(i3, obj);
        if (z3) {
            return bVar.B(jVar, i3, obj, j3, obj2, z3);
        }
        Object k3 = jVar.k(i3);
        if (k3 == null) {
            if (bVar.e(j3)) {
                if (jVar.j(i3, null, d.f1073d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (jVar.j(i3, null, obj2)) {
                    return 2;
                }
            }
        } else if (k3 instanceof l0) {
            jVar.m(i3, null);
            if (bVar.y(k3, obj)) {
                jVar.n(i3, d.f1078i);
                return 0;
            }
            C1.f fVar = d.f1080k;
            if (jVar.f1095r.getAndSet((i3 * 2) + 1, fVar) != fVar) {
                jVar.l(i3, true);
            }
            return 5;
        }
        return bVar.B(jVar, i3, obj, j3, obj2, z3);
    }

    public static void q(b bVar) {
        bVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1061r;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0);
        }
    }

    public static boolean z(Object obj) {
        if (obj instanceof InterfaceC0076e) {
            D2.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return d.a((InterfaceC0076e) obj, C0808g.f9229a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final Object A(j jVar, int i3, long j3, Object obj) {
        Object k3 = jVar.k(i3);
        AtomicReferenceArray atomicReferenceArray = jVar.f1095r;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1058o;
        if (k3 == null) {
            if (j3 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f1083n;
                }
                if (jVar.j(i3, k3, obj)) {
                    j();
                    return d.f1082m;
                }
            }
        } else if (k3 == d.f1073d && jVar.j(i3, k3, d.f1078i)) {
            j();
            Object obj2 = atomicReferenceArray.get(i3 * 2);
            jVar.m(i3, null);
            return obj2;
        }
        while (true) {
            Object k4 = jVar.k(i3);
            if (k4 != null && k4 != d.f1074e) {
                if (k4 == d.f1073d) {
                    if (jVar.j(i3, k4, d.f1078i)) {
                        j();
                        Object obj3 = atomicReferenceArray.get(i3 * 2);
                        jVar.m(i3, null);
                        return obj3;
                    }
                } else {
                    C1.f fVar = d.f1079j;
                    if (k4 == fVar) {
                        return d.f1084o;
                    }
                    if (k4 == d.f1077h) {
                        return d.f1084o;
                    }
                    if (k4 == d.f1081l) {
                        j();
                        return d.f1084o;
                    } else if (k4 != d.f1076g && jVar.j(i3, k4, d.f1075f)) {
                        boolean z3 = k4 instanceof s;
                        if (z3) {
                            k4 = ((s) k4).f1100a;
                        }
                        if (z(k4)) {
                            jVar.n(i3, d.f1078i);
                            j();
                            Object obj4 = atomicReferenceArray.get(i3 * 2);
                            jVar.m(i3, null);
                            return obj4;
                        }
                        jVar.n(i3, fVar);
                        jVar.h();
                        if (z3) {
                            j();
                        }
                        return d.f1084o;
                    }
                }
            } else if (j3 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (jVar.j(i3, k4, d.f1077h)) {
                    j();
                    return d.f1084o;
                }
            } else if (obj == null) {
                return d.f1083n;
            } else {
                if (jVar.j(i3, k4, obj)) {
                    j();
                    return d.f1082m;
                }
            }
        }
    }

    public final int B(j jVar, int i3, Object obj, long j3, Object obj2, boolean z3) {
        while (true) {
            Object k3 = jVar.k(i3);
            if (k3 == null) {
                if (e(j3) && !z3) {
                    if (jVar.j(i3, null, d.f1073d)) {
                        return 1;
                    }
                } else if (z3) {
                    if (jVar.j(i3, null, d.f1079j)) {
                        jVar.h();
                        return 4;
                    }
                } else if (obj2 == null) {
                    return 3;
                } else {
                    if (jVar.j(i3, null, obj2)) {
                        return 2;
                    }
                }
            } else if (k3 == d.f1074e) {
                if (jVar.j(i3, k3, d.f1073d)) {
                    return 1;
                }
            } else {
                C1.f fVar = d.f1080k;
                if (k3 == fVar) {
                    jVar.m(i3, null);
                    return 5;
                } else if (k3 == d.f1077h) {
                    jVar.m(i3, null);
                    return 5;
                } else if (k3 == d.f1081l) {
                    jVar.m(i3, null);
                    s();
                    return 4;
                } else {
                    jVar.m(i3, null);
                    if (k3 instanceof s) {
                        k3 = ((s) k3).f1100a;
                    }
                    if (y(k3, obj)) {
                        jVar.n(i3, d.f1078i);
                        return 0;
                    } else if (jVar.f1095r.getAndSet((i3 * 2) + 1, fVar) == fVar) {
                        return 5;
                    } else {
                        jVar.l(i3, true);
                        return 5;
                    }
                }
            }
        }
    }

    public final void C(long j3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        boolean z3;
        long j5;
        if (u()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f1060q;
        } while (atomicLongFieldUpdater.get(this) <= j3);
        int i3 = d.f1072c;
        int i4 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1061r;
            if (i4 < i3) {
                long j6 = atomicLongFieldUpdater.get(this);
                if (j6 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j6 == atomicLongFieldUpdater.get(this)) {
                    return;
                }
                i4++;
            } else {
                do {
                    j4 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j4, 4611686018427387904L + (j4 & 4611686018427387903L)));
                while (true) {
                    long j7 = atomicLongFieldUpdater.get(this);
                    long j8 = atomicLongFieldUpdater2.get(this);
                    long j9 = j8 & 4611686018427387903L;
                    if ((j8 & 4611686018427387904L) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (j7 == j9 && j7 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z3) {
                        atomicLongFieldUpdater2.compareAndSet(this, j8, j9 + 4611686018427387904L);
                    }
                }
                do {
                    j5 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j5, j5 & 4611686018427387903L));
                return;
            }
        }
    }

    @Override // M2.q
    public final void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        f(cancellationException, true);
    }

    public final boolean e(long j3) {
        if (j3 >= f1060q.get(this) && j3 >= f1059p.get(this) + this.f1067m) {
            return false;
        }
        return true;
    }

    public final boolean f(Throwable th, boolean z3) {
        boolean z4;
        long j3;
        long j4;
        long j5;
        Object obj;
        C1.f fVar;
        long j6;
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1058o;
        if (z3) {
            do {
                j7 = atomicLongFieldUpdater.get(this);
                if (((int) (j7 >> 60)) != 0) {
                    break;
                }
                j jVar = d.f1070a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j7, (1 << 60) + (j7 & 1152921504606846975L)));
        }
        C1.f fVar2 = d.f1088s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1065v;
            if (atomicReferenceFieldUpdater.compareAndSet(this, fVar2, th)) {
                z4 = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != fVar2) {
                z4 = false;
                break;
            }
        }
        if (z3) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, (3 << 60) + (j6 & 1152921504606846975L)));
        } else {
            do {
                j3 = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j3 >> 60);
                if (i3 != 0) {
                    if (i3 != 1) {
                        break;
                    }
                    j4 = j3 & 1152921504606846975L;
                    j5 = 3;
                } else {
                    j4 = j3 & 1152921504606846975L;
                    j5 = 2;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j3, (j5 << 60) + j4));
        }
        s();
        if (z4) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1066w;
                obj = atomicReferenceFieldUpdater2.get(this);
                if (obj == null) {
                    fVar = d.f1086q;
                } else {
                    fVar = d.f1087r;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, fVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                t.a(1, obj);
                ((C2.l) obj).b(l());
            }
        }
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
        r1 = (M2.j) ((P2.d) P2.d.f1479n.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final M2.j g(long r14) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.b.g(long):M2.j");
    }

    public final void h(long j3) {
        B1.c b3;
        j jVar = (j) f1063t.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1059p;
            long j4 = atomicLongFieldUpdater.get(this);
            if (j3 < Math.max(this.f1067m + j4, f1060q.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j4, j4 + 1)) {
                long j5 = d.f1071b;
                long j6 = j4 / j5;
                int i3 = (int) (j4 % j5);
                if (jVar.f1515o != j6) {
                    j k3 = k(j6, jVar);
                    if (k3 == null) {
                        continue;
                    } else {
                        jVar = k3;
                    }
                }
                Object A3 = A(jVar, i3, j4, null);
                if (A3 == d.f1084o) {
                    if (j4 < p()) {
                        jVar.a();
                    }
                } else {
                    jVar.a();
                    C2.l lVar = this.f1068n;
                    if (lVar != null && (b3 = AbstractC0097a.b(lVar, A3, null)) != null) {
                        throw b3;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
        return r1;
     */
    @Override // M2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.b.i(java.lang.Object):java.lang.Object");
    }

    public final void j() {
        Object c3;
        if (u()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1064u;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f1060q.getAndIncrement(this);
            long j3 = andIncrement / d.f1071b;
            if (p() <= andIncrement) {
                if (jVar.f1515o < j3 && jVar.b() != null) {
                    v(j3, jVar);
                }
                q(this);
                return;
            }
            if (jVar.f1515o != j3) {
                c cVar = c.f1069u;
                while (true) {
                    c3 = AbstractC0097a.c(jVar, j3, cVar);
                    if (!AbstractC0097a.f(c3)) {
                        v d3 = AbstractC0097a.d(c3);
                        while (true) {
                            v vVar = (v) atomicReferenceFieldUpdater.get(this);
                            if (vVar.f1515o >= d3.f1515o) {
                                break;
                            } else if (!d3.i()) {
                                break;
                            } else {
                                while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, d3)) {
                                    if (atomicReferenceFieldUpdater.get(this) != vVar) {
                                        if (d3.e()) {
                                            d3.d();
                                        }
                                    }
                                }
                                if (vVar.e()) {
                                    vVar.d();
                                }
                            }
                        }
                    } else {
                        break;
                    }
                }
                j jVar2 = null;
                if (AbstractC0097a.f(c3)) {
                    s();
                    v(j3, jVar);
                    q(this);
                } else {
                    j jVar3 = (j) AbstractC0097a.d(c3);
                    long j4 = jVar3.f1515o;
                    if (j4 > j3) {
                        long j5 = j4 * d.f1071b;
                        if (f1060q.compareAndSet(this, andIncrement + 1, j5)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f1061r;
                            if ((atomicLongFieldUpdater.addAndGet(this, j5 - andIncrement) & 4611686018427387904L) != 0) {
                                do {
                                } while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0);
                            }
                        } else {
                            q(this);
                        }
                    } else {
                        jVar2 = jVar3;
                    }
                }
                if (jVar2 == null) {
                    continue;
                } else {
                    jVar = jVar2;
                }
            }
            int i3 = (int) (andIncrement % d.f1071b);
            Object k3 = jVar.k(i3);
            boolean z3 = k3 instanceof l0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1059p;
            if (!z3 || andIncrement < atomicLongFieldUpdater2.get(this) || !jVar.j(i3, k3, d.f1076g)) {
                while (true) {
                    Object k4 = jVar.k(i3);
                    if (k4 instanceof l0) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (jVar.j(i3, k4, new s((l0) k4))) {
                                break loop0;
                            }
                        } else if (jVar.j(i3, k4, d.f1076g)) {
                            if (z(k4)) {
                                jVar.n(i3, d.f1073d);
                                break;
                            } else {
                                jVar.n(i3, d.f1079j);
                                jVar.h();
                            }
                        }
                    } else if (k4 != d.f1079j) {
                        if (k4 == null) {
                            if (jVar.j(i3, k4, d.f1074e)) {
                                break loop0;
                            }
                        } else if (k4 == d.f1073d || k4 == d.f1077h || k4 == d.f1078i || k4 == d.f1080k || k4 == d.f1081l) {
                            break loop0;
                        } else if (k4 != d.f1075f) {
                            throw new IllegalStateException(("Unexpected cell state: " + k4).toString());
                        }
                    } else {
                        break;
                    }
                }
            } else if (z(k3)) {
                jVar.n(i3, d.f1073d);
                break;
            } else {
                jVar.n(i3, d.f1079j);
                jVar.h();
                q(this);
            }
        }
        q(this);
    }

    public final j k(long j3, j jVar) {
        Object c3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        j jVar2 = d.f1070a;
        c cVar = c.f1069u;
        loop0: while (true) {
            c3 = AbstractC0097a.c(jVar, j3, cVar);
            if (!AbstractC0097a.f(c3)) {
                v d3 = AbstractC0097a.d(c3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1063t;
                    v vVar = (v) atomicReferenceFieldUpdater.get(this);
                    if (vVar.f1515o >= d3.f1515o) {
                        break loop0;
                    } else if (!d3.i()) {
                        break;
                    } else {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, d3)) {
                            if (atomicReferenceFieldUpdater.get(this) != vVar) {
                                if (d3.e()) {
                                    d3.d();
                                }
                            }
                        }
                        if (vVar.e()) {
                            vVar.d();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC0097a.f(c3)) {
            s();
            if (jVar.f1515o * d.f1071b >= p()) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) AbstractC0097a.d(c3);
        boolean u3 = u();
        long j5 = jVar3.f1515o;
        if (!u3 && j3 <= f1060q.get(this) / d.f1071b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1064u;
                v vVar2 = (v) atomicReferenceFieldUpdater2.get(this);
                if (vVar2.f1515o >= j5 || !jVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, vVar2, jVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != vVar2) {
                        if (jVar3.e()) {
                            jVar3.d();
                        }
                    }
                }
                if (vVar2.e()) {
                    vVar2.d();
                }
            }
        }
        if (j5 > j3) {
            long j6 = d.f1071b * j5;
            do {
                atomicLongFieldUpdater = f1059p;
                j4 = atomicLongFieldUpdater.get(this);
                if (j4 >= j6) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j4, j6));
            if (j5 * d.f1071b >= p()) {
                return null;
            }
            jVar3.a();
            return null;
        }
        return jVar3;
    }

    public final Throwable l() {
        return (Throwable) f1065v.get(this);
    }

    public final Throwable m() {
        Throwable l3 = l();
        if (l3 == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return l3;
    }

    public final Throwable n() {
        Throwable l3 = l();
        if (l3 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return l3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01bb, code lost:
        if (r0 == r13) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bf, code lost:
        r2.B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c2, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d0, code lost:
        if (r0 == r13) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01dc, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r0 == r13) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f1, code lost:
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f3, code lost:
        c(r26, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f6, code lost:
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fb, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fc, code lost:
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0145, code lost:
        if (r20 >= r5.get(r26)) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0147, code lost:
        r22.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014a, code lost:
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x014c, code lost:
        c(r26, r27, r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ba  */
    /* JADX WARN: Type inference failed for: r2v34 */
    @Override // M2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(java.lang.Object r27, u2.InterfaceC0866d r28) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.b.o(java.lang.Object, u2.d):java.lang.Object");
    }

    public final long p() {
        return f1058o.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c7, code lost:
        r0 = (M2.j) ((P2.d) P2.d.f1479n.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.b.r(long, boolean):boolean");
    }

    public final boolean s() {
        return r(f1058o.get(this), false);
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x019b, code lost:
        r3 = (M2.j) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a2, code lost:
        if (r3 != null) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019b A[EDGE_INSN: B:97:0x019b->B:75:0x019b ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.b.toString():java.lang.String");
    }

    public final boolean u() {
        long j3 = f1060q.get(this);
        if (j3 != 0 && j3 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(long r6, M2.j r8) {
        /*
            r5 = this;
        L0:
            long r0 = r8.f1515o
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L11
            P2.d r0 = r8.b()
            M2.j r0 = (M2.j) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r8 = r0
            goto L0
        L11:
            boolean r6 = r8.c()
            if (r6 == 0) goto L22
            P2.d r6 = r8.b()
            M2.j r6 = (M2.j) r6
            if (r6 != 0) goto L20
            goto L22
        L20:
            r8 = r6
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = M2.b.f1064u
            java.lang.Object r7 = r6.get(r5)
            P2.v r7 = (P2.v) r7
            long r0 = r7.f1515o
            long r2 = r8.f1515o
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r8.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r6.compareAndSet(r5, r7, r8)
            if (r0 == 0) goto L4a
            boolean r6 = r7.e()
            if (r6 == 0) goto L49
            r7.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r6.get(r5)
            if (r0 == r7) goto L3a
            boolean r6 = r8.e()
            if (r6 == 0) goto L22
            r8.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.b.v(long, M2.j):void");
    }

    public final Object w(Object obj, InterfaceC0866d interfaceC0866d) {
        B1.c b3;
        C0077f c0077f = new C0077f(1, AbstractC0664g.p(interfaceC0866d));
        c0077f.v();
        C2.l lVar = this.f1068n;
        if (lVar != null && (b3 = AbstractC0097a.b(lVar, obj, null)) != null) {
            AbstractC0635d.b(b3, n());
            c0077f.k(AbstractC0664g.f(b3));
        } else {
            c0077f.k(AbstractC0664g.f(n()));
        }
        Object u3 = c0077f.u();
        if (u3 == EnumC0879a.f9494m) {
            return u3;
        }
        return C0808g.f9229a;
    }

    public final void x(l0 l0Var, boolean z3) {
        Throwable n3;
        if (l0Var instanceof InterfaceC0076e) {
            InterfaceC0866d interfaceC0866d = (InterfaceC0866d) l0Var;
            if (z3) {
                n3 = m();
            } else {
                n3 = n();
            }
            interfaceC0866d.k(AbstractC0664g.f(n3));
        } else if (l0Var instanceof a) {
            a aVar = (a) l0Var;
            C0077f c0077f = aVar.f1056n;
            D2.i.b(c0077f);
            aVar.f1056n = null;
            aVar.f1055m = d.f1081l;
            Throwable l3 = aVar.f1057o.l();
            if (l3 == null) {
                c0077f.k(Boolean.FALSE);
            } else {
                c0077f.k(AbstractC0664g.f(l3));
            }
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + l0Var).toString());
        }
    }

    public final boolean y(Object obj, Object obj2) {
        P2.q qVar = null;
        if (obj instanceof a) {
            D2.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            a aVar = (a) obj;
            C0077f c0077f = aVar.f1056n;
            D2.i.b(c0077f);
            aVar.f1056n = null;
            aVar.f1055m = obj2;
            Boolean bool = Boolean.TRUE;
            C2.l lVar = aVar.f1057o.f1068n;
            if (lVar != null) {
                qVar = new P2.q(lVar, obj2, c0077f.f831q);
            }
            return d.a(c0077f, bool, qVar);
        } else if (obj instanceof InterfaceC0076e) {
            D2.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0076e interfaceC0076e = (InterfaceC0076e) obj;
            C2.l lVar2 = this.f1068n;
            if (lVar2 != null) {
                qVar = new P2.q(lVar2, obj2, interfaceC0076e.h());
            }
            return d.a(interfaceC0076e, obj2, qVar);
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }
}
