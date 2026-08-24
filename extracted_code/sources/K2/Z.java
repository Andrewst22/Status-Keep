package K2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m2.AbstractC0635d;
import n2.AbstractC0664g;
import u2.C0864b;
import u2.InterfaceC0869g;
/* loaded from: classes.dex */
public class Z implements P, d0 {

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f819m = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_state");

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f820n = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public Z(boolean z3) {
        E e2;
        if (z3) {
            e2 = AbstractC0092v.f865i;
        } else {
            e2 = AbstractC0092v.f864h;
        }
        this._state = e2;
    }

    public static C0081j M(P2.l lVar) {
        while (lVar.m()) {
            P2.l h3 = lVar.h();
            if (h3 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = P2.l.f1497n;
                Object obj = atomicReferenceFieldUpdater.get(lVar);
                while (true) {
                    lVar = (P2.l) obj;
                    if (!lVar.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lVar);
                }
            } else {
                lVar = h3;
            }
        }
        while (true) {
            lVar = lVar.l();
            if (!lVar.m()) {
                if (lVar instanceof C0081j) {
                    return (C0081j) lVar;
                }
                if (lVar instanceof a0) {
                    return null;
                }
            }
        }
    }

    public static String S(Object obj) {
        if (obj instanceof X) {
            X x = (X) obj;
            if (x.d()) {
                return "Cancelling";
            }
            if (!x.e()) {
                return "Active";
            }
            return "Completing";
        } else if (obj instanceof L) {
            if (((L) obj).a()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof C0085n) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    public final CancellationException A() {
        Object E3 = E();
        CancellationException cancellationException = null;
        if (E3 instanceof X) {
            Throwable c3 = ((X) E3).c();
            if (c3 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (c3 instanceof CancellationException) {
                    cancellationException = (CancellationException) c3;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = v();
                    }
                    return new Q(concat, c3, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(E3 instanceof L)) {
            if (E3 instanceof C0085n) {
                Throwable th = ((C0085n) E3).f845a;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new Q(v(), th, this);
                }
                return cancellationException;
            }
            return new Q(getClass().getSimpleName().concat(" has completed normally"), null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    public boolean B() {
        return true;
    }

    public boolean C() {
        return this instanceof C0083l;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [P2.l, K2.a0] */
    public final a0 D(L l3) {
        a0 g3 = l3.g();
        if (g3 == null) {
            if (l3 instanceof E) {
                return new P2.l();
            }
            if (l3 instanceof U) {
                Q((U) l3);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + l3).toString());
        }
        return g3;
    }

    public final Object E() {
        while (true) {
            Object obj = f819m.get(this);
            if (!(obj instanceof P2.r)) {
                return obj;
            }
            ((P2.r) obj).a(this);
        }
    }

    public boolean F(Throwable th) {
        return false;
    }

    public final void H(P p3) {
        int R3;
        b0 b0Var = b0.f823m;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f820n;
        if (p3 == null) {
            atomicReferenceFieldUpdater.set(this, b0Var);
            return;
        }
        Z z3 = (Z) p3;
        do {
            R3 = z3.R(z3.E());
            if (R3 == 0) {
                break;
            }
        } while (R3 != 1);
        InterfaceC0080i interfaceC0080i = (InterfaceC0080i) AbstractC0092v.e(z3, true, new C0081j(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0080i);
        if (!(E() instanceof L)) {
            interfaceC0080i.d();
            atomicReferenceFieldUpdater.set(this, b0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [P2.l, K2.a0] */
    public final C I(boolean z3, boolean z4, C2.l lVar) {
        U u3;
        K k3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0085n c0085n;
        Throwable th;
        Throwable th2 = null;
        if (z3) {
            if (lVar instanceof S) {
                u3 = (S) lVar;
            } else {
                u3 = null;
            }
            if (u3 == null) {
                u3 = new N(lVar);
            }
        } else {
            if (lVar instanceof U) {
                u3 = (U) lVar;
            } else {
                u3 = null;
            }
            if (u3 == null) {
                u3 = new O(lVar, 0);
            }
        }
        u3.f805p = this;
        while (true) {
            Object E3 = E();
            if (E3 instanceof E) {
                E e2 = (E) E3;
                if (e2.f788m) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f819m;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, E3, u3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != E3) {
                            break;
                        }
                    }
                    return u3;
                }
                ?? lVar2 = new P2.l();
                if (e2.f788m) {
                    k3 = lVar2;
                } else {
                    k3 = new K(lVar2);
                }
                do {
                    atomicReferenceFieldUpdater = f819m;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, e2, k3)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == e2);
            } else if (E3 instanceof L) {
                a0 g3 = ((L) E3).g();
                if (g3 == null) {
                    D2.i.c(E3, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    Q((U) E3);
                } else {
                    C c3 = b0.f823m;
                    if (z3 && (E3 instanceof X)) {
                        synchronized (E3) {
                            try {
                                th = ((X) E3).c();
                                if (th != null) {
                                    if ((lVar instanceof C0081j) && !((X) E3).e()) {
                                    }
                                }
                                if (p((L) E3, g3, u3)) {
                                    if (th == null) {
                                        return u3;
                                    }
                                    c3 = u3;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z4) {
                            lVar.b(th);
                        }
                        return c3;
                    } else if (p((L) E3, g3, u3)) {
                        return u3;
                    }
                }
            } else {
                if (z4) {
                    if (E3 instanceof C0085n) {
                        c0085n = (C0085n) E3;
                    } else {
                        c0085n = null;
                    }
                    if (c0085n != null) {
                        th2 = c0085n.f845a;
                    }
                    lVar.b(th2);
                }
                return b0.f823m;
            }
        }
    }

    public boolean J() {
        return this instanceof C0074c;
    }

    public final boolean K(Object obj) {
        Object T3;
        do {
            T3 = T(E(), obj);
            if (T3 == AbstractC0092v.f859c) {
                return false;
            }
            if (T3 == AbstractC0092v.f860d) {
                return true;
            }
        } while (T3 == AbstractC0092v.f861e);
        q(T3);
        return true;
    }

    public final Object L(Object obj) {
        Object T3;
        C0085n c0085n;
        do {
            T3 = T(E(), obj);
            if (T3 == AbstractC0092v.f859c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof C0085n) {
                    c0085n = (C0085n) obj;
                } else {
                    c0085n = null;
                }
                if (c0085n != null) {
                    th = c0085n.f845a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (T3 == AbstractC0092v.f861e);
        return T3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, B1.c] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r6v0, types: [K2.Z, java.lang.Object] */
    public final void N(a0 a0Var, Throwable th) {
        Object k3 = a0Var.k();
        D2.i.c(k3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        P2.l lVar = (P2.l) k3;
        ?? r12 = 0;
        while (!lVar.equals(a0Var)) {
            if (lVar instanceof S) {
                U u3 = (U) lVar;
                try {
                    u3.o(th);
                } catch (Throwable th2) {
                    if (r12 != 0) {
                        AbstractC0635d.b(r12, th2);
                    } else {
                        r12 = new RuntimeException("Exception in completion handler " + u3 + " for " + ((Object) this), th2);
                    }
                }
            }
            lVar = lVar.l();
            r12 = r12;
        }
        if (r12 != 0) {
            G(r12);
        }
        u(th);
    }

    public final void Q(U u3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        P2.l lVar = new P2.l();
        u3.getClass();
        P2.l.f1497n.lazySet(lVar, u3);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = P2.l.f1496m;
        atomicReferenceFieldUpdater2.lazySet(lVar, u3);
        loop0: while (true) {
            if (u3.k() == u3) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(u3, u3, lVar)) {
                    if (atomicReferenceFieldUpdater2.get(u3) != u3) {
                        break;
                    }
                }
                lVar.j(u3);
                break loop0;
            }
            break;
        }
        P2.l l3 = u3.l();
        do {
            atomicReferenceFieldUpdater = f819m;
            if (atomicReferenceFieldUpdater.compareAndSet(this, u3, l3)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == u3);
    }

    public final int R(Object obj) {
        boolean z3 = obj instanceof E;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f819m;
        if (z3) {
            if (((E) obj).f788m) {
                return 0;
            }
            E e2 = AbstractC0092v.f865i;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        } else if (!(obj instanceof K)) {
            return 0;
        } else {
            a0 a0Var = ((K) obj).f797m;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
    }

    public final Object T(Object obj, Object obj2) {
        M m3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        X x;
        C0085n c0085n;
        C0081j c0081j;
        if (!(obj instanceof L)) {
            return AbstractC0092v.f859c;
        }
        if (((obj instanceof E) || (obj instanceof U)) && !(obj instanceof C0081j) && !(obj2 instanceof C0085n)) {
            L l3 = (L) obj;
            if (obj2 instanceof L) {
                m3 = new M((L) obj2);
            } else {
                m3 = obj2;
            }
            do {
                atomicReferenceFieldUpdater = f819m;
                if (atomicReferenceFieldUpdater.compareAndSet(this, l3, m3)) {
                    O(obj2);
                    x(l3, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == l3);
            return AbstractC0092v.f861e;
        }
        L l4 = (L) obj;
        a0 D3 = D(l4);
        if (D3 == null) {
            return AbstractC0092v.f861e;
        }
        C0081j c0081j2 = null;
        if (l4 instanceof X) {
            x = (X) l4;
        } else {
            x = null;
        }
        if (x == null) {
            x = new X(D3, null);
        }
        synchronized (x) {
            if (x.e()) {
                return AbstractC0092v.f859c;
            }
            X.f811n.set(x, 1);
            if (x != l4) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f819m;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, l4, x)) {
                    if (atomicReferenceFieldUpdater2.get(this) != l4) {
                        return AbstractC0092v.f861e;
                    }
                }
            }
            boolean d3 = x.d();
            if (obj2 instanceof C0085n) {
                c0085n = (C0085n) obj2;
            } else {
                c0085n = null;
            }
            if (c0085n != null) {
                x.b(c0085n.f845a);
            }
            Throwable c3 = x.c();
            if (d3) {
                c3 = null;
            }
            if (c3 != null) {
                N(D3, c3);
            }
            if (l4 instanceof C0081j) {
                c0081j = (C0081j) l4;
            } else {
                c0081j = null;
            }
            if (c0081j == null) {
                a0 g3 = l4.g();
                if (g3 != null) {
                    c0081j2 = M(g3);
                }
            } else {
                c0081j2 = c0081j;
            }
            if (c0081j2 != null) {
                while (AbstractC0092v.e(c0081j2.f836q, false, new W(this, x, c0081j2, obj2), 1) == b0.f823m) {
                    c0081j2 = M(c0081j2);
                    if (c0081j2 == null) {
                        return z(x, obj2);
                    }
                }
                return AbstractC0092v.f860d;
            }
            return z(x, obj2);
        }
    }

    @Override // K2.P
    public boolean a() {
        Object E3 = E();
        if ((E3 instanceof L) && ((L) E3).a()) {
            return true;
        }
        return false;
    }

    @Override // K2.P
    public void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new Q(v(), null, this);
        }
        t(cancellationException);
    }

    @Override // u2.i
    public final Object c(Object obj, C2.p pVar) {
        return pVar.i(obj, this);
    }

    @Override // u2.i
    public final InterfaceC0869g d(u2.h hVar) {
        return AbstractC0664g.m(this, hVar);
    }

    @Override // u2.i
    public final u2.i f(u2.h hVar) {
        return AbstractC0664g.r(this, hVar);
    }

    @Override // u2.InterfaceC0869g
    public final u2.h getKey() {
        return C0090t.f856n;
    }

    @Override // u2.i
    public final u2.i n(u2.i iVar) {
        D2.i.e(iVar, "context");
        if (iVar == u2.j.f9461m) {
            return this;
        }
        return (u2.i) iVar.c(this, new C0864b(1));
    }

    public final boolean p(L l3, a0 a0Var, U u3) {
        char c3;
        Y y3 = new Y(u3, this, l3);
        do {
            P2.l h3 = a0Var.h();
            if (h3 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = P2.l.f1497n;
                Object obj = atomicReferenceFieldUpdater.get(a0Var);
                while (true) {
                    h3 = (P2.l) obj;
                    if (!h3.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(h3);
                }
            }
            P2.l.f1497n.lazySet(u3, h3);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = P2.l.f1496m;
            atomicReferenceFieldUpdater2.lazySet(u3, a0Var);
            y3.f816c = a0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(h3, a0Var, y3)) {
                    if (y3.a(h3) == null) {
                        c3 = 1;
                    } else {
                        c3 = 2;
                    }
                } else if (atomicReferenceFieldUpdater2.get(h3) != a0Var) {
                    c3 = 0;
                    break;
                }
            }
            if (c3 == 1) {
                return true;
            }
        } while (c3 != 2);
        return false;
    }

    public void r(Object obj) {
        q(obj);
    }

    public final boolean s(Object obj) {
        boolean z3;
        C1.f fVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1.f fVar2 = AbstractC0092v.f859c;
        if (C()) {
            do {
                Object E3 = E();
                if ((E3 instanceof L) && (!(E3 instanceof X) || !((X) E3).e())) {
                    fVar2 = T(E3, new C0085n(y(obj), false));
                } else {
                    fVar2 = AbstractC0092v.f859c;
                    break;
                }
            } while (fVar2 == AbstractC0092v.f861e);
            if (fVar2 == AbstractC0092v.f860d) {
                return true;
            }
        }
        if (fVar2 == AbstractC0092v.f859c) {
            Throwable th = null;
            Throwable th2 = null;
            loop1: while (true) {
                Object E4 = E();
                if (E4 instanceof X) {
                    synchronized (E4) {
                        try {
                            X x = (X) E4;
                            x.getClass();
                            if (X.f813p.get(x) == AbstractC0092v.f863g) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                fVar = AbstractC0092v.f862f;
                            } else {
                                boolean d3 = ((X) E4).d();
                                if (th2 == null) {
                                    th2 = y(obj);
                                }
                                ((X) E4).b(th2);
                                Throwable c3 = ((X) E4).c();
                                if (!d3) {
                                    th = c3;
                                }
                                if (th != null) {
                                    N(((X) E4).f814m, th);
                                }
                                fVar = AbstractC0092v.f859c;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } else if (E4 instanceof L) {
                    if (th2 == null) {
                        th2 = y(obj);
                    }
                    L l3 = (L) E4;
                    if (l3.a()) {
                        a0 D3 = D(l3);
                        if (D3 == null) {
                            continue;
                        } else {
                            X x3 = new X(D3, th2);
                            do {
                                atomicReferenceFieldUpdater = f819m;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, l3, x3)) {
                                    N(D3, th2);
                                    fVar = AbstractC0092v.f859c;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == l3);
                        }
                    } else {
                        Object T3 = T(E4, new C0085n(th2, false));
                        if (T3 != AbstractC0092v.f859c) {
                            if (T3 != AbstractC0092v.f861e) {
                                fVar2 = T3;
                                break;
                            }
                        } else {
                            throw new IllegalStateException(("Cannot happen in " + E4).toString());
                        }
                    }
                } else {
                    fVar = AbstractC0092v.f862f;
                    break;
                }
            }
            fVar2 = fVar;
        }
        if (fVar2 != AbstractC0092v.f859c && fVar2 != AbstractC0092v.f860d) {
            if (fVar2 == AbstractC0092v.f862f) {
                return false;
            }
            q(fVar2);
        }
        return true;
    }

    public void t(CancellationException cancellationException) {
        s(cancellationException);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + S(E()) + '}');
        sb.append('@');
        sb.append(AbstractC0092v.b(this));
        return sb.toString();
    }

    public final boolean u(Throwable th) {
        if (J()) {
            return true;
        }
        boolean z3 = th instanceof CancellationException;
        InterfaceC0080i interfaceC0080i = (InterfaceC0080i) f820n.get(this);
        if (interfaceC0080i != null && interfaceC0080i != b0.f823m) {
            if (interfaceC0080i.e(th) || z3) {
                return true;
            }
            return false;
        }
        return z3;
    }

    public String v() {
        return "Job was cancelled";
    }

    public boolean w(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (s(th) && B()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [B1.c, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, B1.c] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [K2.Z, java.lang.Object] */
    public final void x(L l3, Object obj) {
        C0085n c0085n;
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f820n;
        InterfaceC0080i interfaceC0080i = (InterfaceC0080i) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0080i != null) {
            interfaceC0080i.d();
            atomicReferenceFieldUpdater.set(this, b0.f823m);
        }
        ?? r12 = 0;
        if (obj instanceof C0085n) {
            c0085n = (C0085n) obj;
        } else {
            c0085n = null;
        }
        if (c0085n != null) {
            th = c0085n.f845a;
        } else {
            th = null;
        }
        if (l3 instanceof U) {
            try {
                ((U) l3).o(th);
                return;
            } catch (Throwable th2) {
                G(new RuntimeException("Exception in completion handler " + l3 + " for " + ((Object) this), th2));
                return;
            }
        }
        a0 g3 = l3.g();
        if (g3 != null) {
            Object k3 = g3.k();
            D2.i.c(k3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            P2.l lVar = (P2.l) k3;
            while (!lVar.equals(g3)) {
                if (lVar instanceof U) {
                    U u3 = (U) lVar;
                    try {
                        u3.o(th);
                    } catch (Throwable th3) {
                        if (r12 != 0) {
                            AbstractC0635d.b(r12, th3);
                        } else {
                            r12 = new RuntimeException("Exception in completion handler " + u3 + " for " + ((Object) this), th3);
                        }
                    }
                }
                lVar = lVar.l();
                r12 = r12;
            }
            if (r12 != 0) {
                G(r12);
            }
        }
    }

    public final Throwable y(Object obj) {
        Throwable th;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        Z z3 = (Z) ((d0) obj);
        Object E3 = z3.E();
        CancellationException cancellationException = null;
        if (E3 instanceof X) {
            th = ((X) E3).c();
        } else if (E3 instanceof C0085n) {
            th = ((C0085n) E3).f845a;
        } else if (!(E3 instanceof L)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + E3).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        if (cancellationException == null) {
            cancellationException = new Q("Parent job is ".concat(S(E3)), th, z3);
        }
        return cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object z(X x, Object obj) {
        C0085n c0085n;
        Throwable th;
        Object obj2;
        Throwable th2 = null;
        if (obj instanceof C0085n) {
            c0085n = (C0085n) obj;
        } else {
            c0085n = null;
        }
        if (c0085n != null) {
            th = c0085n.f845a;
        } else {
            th = null;
        }
        synchronized (x) {
            x.d();
            ArrayList<Throwable> f3 = x.f(th);
            if (f3.isEmpty()) {
                if (x.d()) {
                    th2 = new Q(v(), null, this);
                }
            } else {
                Iterator it = f3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        th2 = next;
                        break;
                    }
                }
                th2 = th2;
                if (th2 == null) {
                    th2 = (Throwable) f3.get(0);
                }
            }
            if (th2 != null && f3.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f3.size()));
                for (Throwable th3 : f3) {
                    if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        AbstractC0635d.b(th2, th3);
                    }
                }
            }
        }
        if (th2 != null && th2 != th) {
            obj = new C0085n(th2, false);
        }
        if (th2 != null && (u(th2) || F(th2))) {
            D2.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0085n.f844b.compareAndSet((C0085n) obj, 0, 1);
        }
        O(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f819m;
        if (obj instanceof L) {
            obj2 = new M((L) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, x, obj2) && atomicReferenceFieldUpdater.get(this) == x) {
        }
        x(x, obj);
        return obj;
    }

    public void P() {
    }

    public void G(B1.c cVar) {
        throw cVar;
    }

    public void O(Object obj) {
    }

    public void q(Object obj) {
    }
}
