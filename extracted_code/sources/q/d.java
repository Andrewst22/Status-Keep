package q;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n2.AbstractC0664g;
/* loaded from: classes.dex */
public final class d extends AbstractC0664g {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8843a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8844b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8845c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8846d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f8847e;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f8843a = atomicReferenceFieldUpdater;
        this.f8844b = atomicReferenceFieldUpdater2;
        this.f8845c = atomicReferenceFieldUpdater3;
        this.f8846d = atomicReferenceFieldUpdater4;
        this.f8847e = atomicReferenceFieldUpdater5;
    }

    @Override // n2.AbstractC0664g
    public final boolean a(g gVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8846d;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // n2.AbstractC0664g
    public final boolean b(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8847e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // n2.AbstractC0664g
    public final boolean c(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8845c;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // n2.AbstractC0664g
    public final void s(f fVar, f fVar2) {
        this.f8844b.lazySet(fVar, fVar2);
    }

    @Override // n2.AbstractC0664g
    public final void t(f fVar, Thread thread) {
        this.f8843a.lazySet(fVar, thread);
    }
}
