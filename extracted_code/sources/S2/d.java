package S2;

import K2.AbstractC0092v;
import K2.C0077f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n2.AbstractC0664g;
import s2.C0808g;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public final class d extends h implements a {

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2211g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner;

    public d(boolean z3) {
        super(z3 ? 1 : 0);
        C1.f fVar;
        if (z3) {
            fVar = null;
        } else {
            fVar = e.f2212a;
        }
        this.owner = fVar;
    }

    public final Object c(w2.b bVar) {
        boolean d3 = d(null);
        C0808g c0808g = C0808g.f9229a;
        if (!d3) {
            C0077f c3 = AbstractC0092v.c(AbstractC0664g.p(bVar));
            try {
                a(new c(this, c3));
                Object u3 = c3.u();
                EnumC0879a enumC0879a = EnumC0879a.f9494m;
                if (u3 != enumC0879a) {
                    u3 = c0808g;
                }
                if (u3 == enumC0879a) {
                    return u3;
                }
                return c0808g;
            } catch (Throwable th) {
                c3.B();
                throw th;
            }
        }
        return c0808g;
    }

    public final boolean d(Object obj) {
        int i3;
        char c3;
        char c4;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f2219f;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 > 1) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2211g;
                if (i4 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (Math.max(atomicIntegerFieldUpdater.get(this), 0) == 0) {
                                Object obj2 = atomicReferenceFieldUpdater.get(this);
                                if (obj2 != e.f2212a) {
                                    if (obj2 == obj) {
                                        c4 = 1;
                                    } else {
                                        c4 = 2;
                                    }
                                }
                            } else {
                                c4 = 0;
                                break;
                            }
                        }
                        if (c4 != 1) {
                            if (c4 == 2) {
                                break;
                            }
                        } else {
                            c3 = 2;
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    c3 = 0;
                    break;
                }
            }
        }
        c3 = 1;
        if (c3 == 0) {
            return true;
        }
        if (c3 != 1) {
            if (c3 != 2) {
                throw new IllegalStateException("unexpected");
            }
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
        }
        return false;
    }

    public final void e(Object obj) {
        while (Math.max(h.f2219f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2211g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C1.f fVar = e.f2212a;
            if (obj2 != fVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, fVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                b();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC0092v.b(this));
        sb.append("[isLocked=");
        boolean z3 = false;
        if (Math.max(h.f2219f.get(this), 0) == 0) {
            z3 = true;
        }
        sb.append(z3);
        sb.append(",owner=");
        sb.append(f2211g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
