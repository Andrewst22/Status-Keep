package K2;

import P2.AbstractC0097a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s2.AbstractC0805d;
import t2.C0825b;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* renamed from: K2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0077f extends A implements InterfaceC0076e, w2.c, l0 {

    /* renamed from: r  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f827r = AtomicIntegerFieldUpdater.newUpdater(C0077f.class, "_decisionAndIndex");

    /* renamed from: s  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f828s = AtomicReferenceFieldUpdater.newUpdater(C0077f.class, Object.class, "_state");

    /* renamed from: t  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f829t = AtomicReferenceFieldUpdater.newUpdater(C0077f.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: p  reason: collision with root package name */
    public final InterfaceC0866d f830p;

    /* renamed from: q  reason: collision with root package name */
    public final u2.i f831q;

    public C0077f(int i3, InterfaceC0866d interfaceC0866d) {
        super(i3);
        this.f830p = interfaceC0866d;
        this.f831q = interfaceC0866d.h();
        this._decisionAndIndex = 536870911;
        this._state = C0073b.f822m;
    }

    public static Object D(c0 c0Var, Object obj, int i3, C2.l lVar) {
        D d3;
        if (!(obj instanceof C0085n) && AbstractC0092v.f(i3)) {
            if (lVar != null || (c0Var instanceof D)) {
                if (c0Var instanceof D) {
                    d3 = (D) c0Var;
                } else {
                    d3 = null;
                }
                return new C0084m(obj, d3, lVar, (CancellationException) null, 16);
            }
            return obj;
        }
        return obj;
    }

    public static void z(c0 c0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + c0Var + ", already has " + obj).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        P2.h hVar;
        InterfaceC0866d interfaceC0866d = this.f830p;
        Throwable th = null;
        if (interfaceC0866d instanceof P2.h) {
            hVar = (P2.h) interfaceC0866d;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = P2.h.f1483t;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                C1.f fVar = AbstractC0097a.f1473d;
                if (obj == fVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, fVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != fVar) {
                            break;
                        }
                    }
                    break loop0;
                } else if (obj instanceof Throwable) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                } else {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
            }
            if (th != null) {
                r();
                q(th);
            }
        }
    }

    public final void C(Object obj, int i3, C2.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f828s;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof c0) {
                Object D3 = D((c0) obj2, obj, i3, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D3)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!y()) {
                    r();
                }
                s(i3);
                return;
            }
            if (obj2 instanceof C0078g) {
                C0078g c0078g = (C0078g) obj2;
                c0078g.getClass();
                if (C0078g.f832c.compareAndSet(c0078g, 0, 1)) {
                    if (lVar != null) {
                        o(lVar, c0078g.f845a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // K2.l0
    public final void a(P2.v vVar, int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f827r;
            i4 = atomicIntegerFieldUpdater.get(this);
            if ((i4 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, ((i4 >> 29) << 29) + i3));
        x(vVar);
    }

    @Override // K2.A
    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f828s;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof c0)) {
                if (obj2 instanceof C0085n) {
                    return;
                }
                if (obj2 instanceof C0084m) {
                    C0084m c0084m = (C0084m) obj2;
                    if (c0084m.f843e == null) {
                        C0084m a3 = C0084m.a(c0084m, null, cancellationException, 15);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a3)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        }
                        D d3 = c0084m.f840b;
                        if (d3 != null) {
                            n(d3, cancellationException);
                        }
                        C2.l lVar = c0084m.f841c;
                        if (lVar != null) {
                            o(lVar, cancellationException);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Must be called at most once");
                }
                C0084m c0084m2 = new C0084m(obj2, (D) null, (C2.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0084m2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            throw new IllegalStateException("Not completed");
        }
    }

    @Override // K2.A
    public final InterfaceC0866d c() {
        return this.f830p;
    }

    @Override // K2.A
    public final Throwable d(Object obj) {
        Throwable d3 = super.d(obj);
        if (d3 == null) {
            return null;
        }
        return d3;
    }

    @Override // w2.c
    public final w2.c e() {
        InterfaceC0866d interfaceC0866d = this.f830p;
        if (interfaceC0866d instanceof w2.c) {
            return (w2.c) interfaceC0866d;
        }
        return null;
    }

    @Override // K2.A
    public final Object f(Object obj) {
        if (obj instanceof C0084m) {
            return ((C0084m) obj).f839a;
        }
        return obj;
    }

    @Override // K2.InterfaceC0076e
    public final C1.f g(Object obj, C2.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f828s;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj2 instanceof c0;
            C1.f fVar = AbstractC0092v.f857a;
            if (z3) {
                Object D3 = D((c0) obj2, obj, this.f784o, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D3)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!y()) {
                    r();
                    return fVar;
                }
                return fVar;
            }
            boolean z4 = obj2 instanceof C0084m;
            return null;
        }
    }

    @Override // u2.InterfaceC0866d
    public final u2.i h() {
        return this.f831q;
    }

    @Override // K2.A
    public final Object j() {
        return f828s.get(this);
    }

    @Override // u2.InterfaceC0866d
    public final void k(Object obj) {
        Throwable a3 = AbstractC0805d.a(obj);
        if (a3 != null) {
            obj = new C0085n(a3, false);
        }
        C(obj, this.f784o, null);
    }

    @Override // K2.InterfaceC0076e
    public final void l(Object obj, C2.l lVar) {
        C(obj, this.f784o, lVar);
    }

    @Override // K2.InterfaceC0076e
    public final void m(Object obj) {
        s(this.f784o);
    }

    public final void n(D d3, Throwable th) {
        try {
            d3.a(th);
        } catch (Throwable th2) {
            AbstractC0092v.d(new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2), this.f831q);
        }
    }

    public final void o(C2.l lVar, Throwable th) {
        try {
            lVar.b(th);
        } catch (Throwable th2) {
            AbstractC0092v.d(new RuntimeException("Exception in resume onCancellation handler for " + this, th2), this.f831q);
        }
    }

    public final void p(P2.v vVar, Throwable th) {
        u2.i iVar = this.f831q;
        int i3 = f827r.get(this) & 536870911;
        if (i3 != 536870911) {
            try {
                vVar.g(i3, iVar);
                return;
            } catch (Throwable th2) {
                AbstractC0092v.d(new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2), iVar);
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }

    public final void q(Throwable th) {
        boolean z3;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f828s;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof c0)) {
                return;
            }
            if (!(obj instanceof D) && !(obj instanceof P2.v)) {
                z3 = false;
            } else {
                z3 = true;
            }
            C0078g c0078g = new C0078g(this, th, z3);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0078g)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            c0 c0Var = (c0) obj;
            if (c0Var instanceof D) {
                n((D) obj, th);
            } else if (c0Var instanceof P2.v) {
                p((P2.v) obj, th);
            }
            if (!y()) {
                r();
            }
            s(this.f784o);
            return;
        }
    }

    public final void r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f829t;
        C c3 = (C) atomicReferenceFieldUpdater.get(this);
        if (c3 == null) {
            return;
        }
        c3.d();
        atomicReferenceFieldUpdater.set(this, b0.f823m);
    }

    public final void s(int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        boolean z3;
        do {
            atomicIntegerFieldUpdater = f827r;
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 == 1) {
                    if (i3 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    InterfaceC0866d interfaceC0866d = this.f830p;
                    if (!z3 && (interfaceC0866d instanceof P2.h) && AbstractC0092v.f(i3) == AbstractC0092v.f(this.f784o)) {
                        AbstractC0089s abstractC0089s = ((P2.h) interfaceC0866d).f1484p;
                        u2.i h3 = ((P2.h) interfaceC0866d).f1485q.h();
                        if (abstractC0089s.h()) {
                            abstractC0089s.g(h3, this);
                            return;
                        }
                        H a3 = h0.a();
                        if (a3.f793o >= 4294967296L) {
                            C0825b c0825b = a3.f795q;
                            if (c0825b == null) {
                                c0825b = new C0825b();
                                a3.f795q = c0825b;
                            }
                            c0825b.addLast(this);
                            return;
                        }
                        a3.k(true);
                        try {
                            AbstractC0092v.i(this, interfaceC0866d, true);
                            do {
                            } while (a3.m());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                    AbstractC0092v.i(this, interfaceC0866d, z3);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 1073741824 + (536870911 & i4)));
    }

    public Throwable t(Z z3) {
        return z3.A();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(AbstractC0092v.k(this.f830p));
        sb.append("){");
        Object obj = f828s.get(this);
        if (obj instanceof c0) {
            str = "Active";
        } else if (obj instanceof C0078g) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC0092v.b(this));
        return sb.toString();
    }

    public final Object u() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        boolean y3 = y();
        do {
            atomicIntegerFieldUpdater = f827r;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 == 2) {
                    if (y3) {
                        B();
                    }
                    Object obj = f828s.get(this);
                    if (!(obj instanceof C0085n)) {
                        if (AbstractC0092v.f(this.f784o)) {
                            P p3 = (P) this.f831q.d(C0090t.f856n);
                            if (p3 != null && !p3.a()) {
                                CancellationException A3 = ((Z) p3).A();
                                b(obj, A3);
                                throw A3;
                            }
                        }
                        return f(obj);
                    }
                    throw ((C0085n) obj).f845a;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 536870912 + (536870911 & i3)));
        if (((C) f829t.get(this)) == null) {
            w();
        }
        if (y3) {
            B();
        }
        return EnumC0879a.f9494m;
    }

    public final void v() {
        C w3 = w();
        if (w3 != null && !(f828s.get(this) instanceof c0)) {
            w3.d();
            f829t.set(this, b0.f823m);
        }
    }

    public final C w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        P p3 = (P) this.f831q.d(C0090t.f856n);
        if (p3 == null) {
            return null;
        }
        C e2 = AbstractC0092v.e(p3, true, new C0079h(this), 2);
        do {
            atomicReferenceFieldUpdater = f829t;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, e2)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return e2;
    }

    public final void x(c0 c0Var) {
        boolean z3;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f828s;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0073b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof D) {
                z3 = true;
            } else {
                z3 = obj instanceof P2.v;
            }
            Throwable th = null;
            if (!z3) {
                if (obj instanceof C0085n) {
                    C0085n c0085n = (C0085n) obj;
                    c0085n.getClass();
                    if (C0085n.f844b.compareAndSet(c0085n, 0, 1)) {
                        if (obj instanceof C0078g) {
                            if (!(obj instanceof C0085n)) {
                                c0085n = null;
                            }
                            if (c0085n != null) {
                                th = c0085n.f845a;
                            }
                            if (c0Var instanceof D) {
                                n((D) c0Var, th);
                                return;
                            }
                            D2.i.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            p((P2.v) c0Var, th);
                            return;
                        }
                        return;
                    }
                    z(c0Var, obj);
                    throw null;
                } else if (obj instanceof C0084m) {
                    C0084m c0084m = (C0084m) obj;
                    if (c0084m.f840b == null) {
                        if (c0Var instanceof P2.v) {
                            return;
                        }
                        D2.i.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        D d3 = (D) c0Var;
                        Throwable th2 = c0084m.f843e;
                        if (th2 != null) {
                            n(d3, th2);
                            return;
                        }
                        C0084m a3 = C0084m.a(c0084m, d3, null, 29);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a3)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        return;
                    }
                    z(c0Var, obj);
                    throw null;
                } else if (c0Var instanceof P2.v) {
                    return;
                } else {
                    D2.i.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    C0084m c0084m2 = new C0084m(obj, (D) c0Var, (C2.l) null, (CancellationException) null, 28);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0084m2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    return;
                }
            }
            z(c0Var, obj);
            throw null;
        }
    }

    public final boolean y() {
        if (this.f784o == 2) {
            InterfaceC0866d interfaceC0866d = this.f830p;
            D2.i.c(interfaceC0866d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (P2.h.f1483t.get((P2.h) interfaceC0866d) != null) {
                return true;
            }
        }
        return false;
    }
}
