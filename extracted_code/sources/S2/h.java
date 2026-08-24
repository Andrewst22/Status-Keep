package S2;

import C2.l;
import K.L;
import P2.AbstractC0097a;
import P2.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s2.C0808g;
/* loaded from: classes.dex */
public class h {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2215b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2216c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2217d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2218e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2219f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a  reason: collision with root package name */
    public final L f2220a;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public h(int i3) {
        if (i3 >= 0 && i3 <= 1) {
            j jVar = new j(0L, null, 2);
            this.head = jVar;
            this.tail = jVar;
            this._availablePermits = 1 - i3;
            this.f2220a = new L(this, 2);
            return;
        }
        throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
    }

    public final void a(c cVar) {
        Object c3;
        f fVar;
        long j3;
        while (true) {
            int andDecrement = f2219f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Object obj = C0808g.f9229a;
                l lVar = this.f2220a;
                if (andDecrement > 0) {
                    cVar.l(obj, lVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2217d;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f2218e.getAndIncrement(this);
                f fVar2 = f.f2213u;
                long j4 = andIncrement / i.f2226f;
                while (true) {
                    c3 = AbstractC0097a.c(jVar, j4, fVar2);
                    if (!AbstractC0097a.f(c3)) {
                        v d3 = AbstractC0097a.d(c3);
                        while (true) {
                            v vVar = (v) atomicReferenceFieldUpdater.get(this);
                            fVar = fVar2;
                            j3 = j4;
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
                                        fVar2 = fVar;
                                        j4 = j3;
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
                    fVar2 = fVar;
                    j4 = j3;
                }
                j jVar2 = (j) AbstractC0097a.d(c3);
                int i3 = (int) (andIncrement % i.f2226f);
                AtomicReferenceArray atomicReferenceArray = jVar2.f2227q;
                while (!atomicReferenceArray.compareAndSet(i3, null, cVar)) {
                    if (atomicReferenceArray.get(i3) != null) {
                        C1.f fVar3 = i.f2222b;
                        C1.f fVar4 = i.f2223c;
                        while (!atomicReferenceArray.compareAndSet(i3, fVar3, fVar4)) {
                            if (atomicReferenceArray.get(i3) != fVar3) {
                                break;
                            }
                        }
                        cVar.l(obj, lVar);
                        return;
                    }
                }
                cVar.a(jVar2, i3);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c5, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.h.b():void");
    }
}
