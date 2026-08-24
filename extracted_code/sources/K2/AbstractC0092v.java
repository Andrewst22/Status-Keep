package K2;

import P2.AbstractC0097a;
import a.AbstractC0155a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import m2.AbstractC0635d;
import n2.AbstractC0664g;
import s2.AbstractC0805d;
import u2.C0867e;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* renamed from: K2.v */
/* loaded from: classes.dex */
public abstract class AbstractC0092v {

    /* renamed from: a */
    public static final C1.f f857a = new C1.f("RESUME_TOKEN", 1);

    /* renamed from: b */
    public static final C1.f f858b = new C1.f("CLOSED_EMPTY", 1);

    /* renamed from: c */
    public static final C1.f f859c = new C1.f("COMPLETING_ALREADY", 1);

    /* renamed from: d */
    public static final C1.f f860d = new C1.f("COMPLETING_WAITING_CHILDREN", 1);

    /* renamed from: e */
    public static final C1.f f861e = new C1.f("COMPLETING_RETRY", 1);

    /* renamed from: f */
    public static final C1.f f862f = new C1.f("TOO_LATE_TO_CANCEL", 1);

    /* renamed from: g */
    public static final C1.f f863g = new C1.f("SEALED", 1);

    /* renamed from: h */
    public static final E f864h = new E(false);

    /* renamed from: i */
    public static final E f865i = new E(true);

    public static final u2.i a(u2.i iVar, u2.i iVar2, boolean z3) {
        Boolean bool = Boolean.FALSE;
        C0087p c0087p = C0087p.f849p;
        boolean booleanValue = ((Boolean) iVar.c(bool, c0087p)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.c(bool, c0087p)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.n(iVar2);
        }
        u2.j jVar = u2.j.f9461m;
        u2.i iVar3 = (u2.i) iVar.c(jVar, new C0087p(2, 2));
        u2.i iVar4 = iVar2;
        if (booleanValue2) {
            iVar4 = iVar2.c(jVar, C0087p.f848o);
        }
        return iVar3.n(iVar4);
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0077f c(InterfaceC0866d interfaceC0866d) {
        C0077f c0077f;
        C0077f c0077f2;
        if (!(interfaceC0866d instanceof P2.h)) {
            return new C0077f(1, interfaceC0866d);
        }
        P2.h hVar = (P2.h) interfaceC0866d;
        hVar.getClass();
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = P2.h.f1483t;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C1.f fVar = AbstractC0097a.f1473d;
            c0077f = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, fVar);
                c0077f2 = null;
                break;
            } else if (obj instanceof C0077f) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, fVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0077f2 = (C0077f) obj;
                break loop0;
            } else if (obj != fVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0077f2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0077f.f828s;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0077f2);
            if ((obj2 instanceof C0084m) && ((C0084m) obj2).f842d != null) {
                c0077f2.r();
            } else {
                C0077f.f827r.set(c0077f2, 536870911);
                atomicReferenceFieldUpdater2.set(c0077f2, C0073b.f822m);
                c0077f = c0077f2;
            }
            if (c0077f != null) {
                return c0077f;
            }
        }
        return new C0077f(2, interfaceC0866d);
    }

    public static final void d(Throwable th, u2.i iVar) {
        try {
            L2.b bVar = (L2.b) iVar.d(C0090t.f855m);
            if (bVar != null) {
                bVar.g(th, iVar);
            } else {
                AbstractC0097a.e(th, iVar);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC0635d.b(runtimeException, th);
                th = runtimeException;
            }
            AbstractC0097a.e(th, iVar);
        }
    }

    public static /* synthetic */ C e(P p3, boolean z3, U u3, int i3) {
        boolean z4 = false;
        if ((i3 & 1) != 0) {
            z3 = false;
        }
        if ((i3 & 2) != 0) {
            z4 = true;
        }
        return ((Z) p3).I(z3, z4, u3);
    }

    public static final boolean f(int i3) {
        if (i3 == 1 || i3 == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [K2.a, K2.e0] */
    public static e0 g(InterfaceC0091u interfaceC0091u, C2.p pVar) {
        u2.i a3 = a(interfaceC0091u.j(), u2.j.f9461m, true);
        R2.d dVar = B.f785a;
        if (a3 != dVar && a3.d(C0867e.f9460m) == null) {
            a3 = a3.n(dVar);
        }
        ?? abstractC0072a = new AbstractC0072a(a3, true);
        abstractC0072a.W(1, abstractC0072a, pVar);
        return abstractC0072a;
    }

    public static final Object h(Object obj) {
        if (obj instanceof C0085n) {
            return AbstractC0664g.f(((C0085n) obj).f845a);
        }
        return obj;
    }

    public static final void i(C0077f c0077f, InterfaceC0866d interfaceC0866d, boolean z3) {
        Object f3;
        j0 j0Var;
        boolean X2;
        Object obj = C0077f.f828s.get(c0077f);
        Throwable d3 = c0077f.d(obj);
        if (d3 != null) {
            f3 = AbstractC0664g.f(d3);
        } else {
            f3 = c0077f.f(obj);
        }
        if (z3) {
            D2.i.c(interfaceC0866d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            P2.h hVar = (P2.h) interfaceC0866d;
            w2.b bVar = hVar.f1485q;
            u2.i h3 = bVar.h();
            Object n3 = AbstractC0097a.n(h3, hVar.f1487s);
            if (n3 != AbstractC0097a.f1475f) {
                j0Var = m(bVar, h3, n3);
            } else {
                j0Var = null;
            }
            try {
                bVar.k(f3);
                if (j0Var != null) {
                    if (!X2) {
                        return;
                    }
                }
                return;
            } finally {
                if (j0Var == null || j0Var.X()) {
                    AbstractC0097a.h(h3, n3);
                }
            }
        }
        interfaceC0866d.k(f3);
    }

    public static Object j(C2.p pVar) {
        long j3;
        C0085n c0085n;
        u2.j jVar = u2.j.f9461m;
        Thread currentThread = Thread.currentThread();
        C0867e c0867e = C0867e.f9460m;
        H a3 = h0.a();
        u2.i a4 = a(jVar, a3, true);
        R2.d dVar = B.f785a;
        if (a4 != dVar && a4.d(c0867e) == null) {
            a4 = a4.n(dVar);
        }
        C0074c c0074c = new C0074c(a4, currentThread, a3);
        c0074c.W(1, c0074c, pVar);
        H h3 = c0074c.f825q;
        if (h3 != null) {
            int i3 = H.f792r;
            h3.k(false);
        }
        while (!Thread.interrupted()) {
            try {
                if (h3 != null) {
                    j3 = h3.l();
                } else {
                    j3 = Long.MAX_VALUE;
                }
                if (c0074c.E() instanceof L) {
                    LockSupport.parkNanos(c0074c, j3);
                } else {
                    if (h3 != null) {
                        int i4 = H.f792r;
                        h3.i(false);
                    }
                    Object l3 = l(c0074c.E());
                    if (l3 instanceof C0085n) {
                        c0085n = (C0085n) l3;
                    } else {
                        c0085n = null;
                    }
                    if (c0085n == null) {
                        return l3;
                    }
                    throw c0085n.f845a;
                }
            } catch (Throwable th) {
                if (h3 != null) {
                    int i5 = H.f792r;
                    h3.i(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0074c.s(interruptedException);
        throw interruptedException;
    }

    public static final String k(InterfaceC0866d interfaceC0866d) {
        String str;
        if (interfaceC0866d instanceof P2.h) {
            return interfaceC0866d.toString();
        }
        try {
            str = interfaceC0866d + '@' + b(interfaceC0866d);
        } catch (Throwable th) {
            str = AbstractC0664g.f(th);
        }
        Throwable a3 = AbstractC0805d.a(str);
        String str2 = str;
        if (a3 != null) {
            str2 = interfaceC0866d.getClass().getName() + '@' + b(interfaceC0866d);
        }
        return (String) str2;
    }

    public static final Object l(Object obj) {
        M m3;
        L l3;
        if (obj instanceof M) {
            m3 = (M) obj;
        } else {
            m3 = null;
        }
        if (m3 != null && (l3 = m3.f798a) != null) {
            return l3;
        }
        return obj;
    }

    public static final j0 m(InterfaceC0866d interfaceC0866d, u2.i iVar, Object obj) {
        j0 j0Var = null;
        if (!(interfaceC0866d instanceof w2.c)) {
            return null;
        }
        if (iVar.d(k0.f838m) != null) {
            w2.c cVar = (w2.c) interfaceC0866d;
            while (true) {
                if (!(cVar instanceof C0096z) && (cVar = cVar.e()) != null) {
                    if (cVar instanceof j0) {
                        j0Var = (j0) cVar;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (j0Var != null) {
                j0Var.Y(iVar, obj);
            }
        }
        return j0Var;
    }

    public static final Object n(u2.i iVar, C2.p pVar, w2.f fVar) {
        u2.i a3;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        u2.i iVar2 = fVar.f9665n;
        D2.i.b(iVar2);
        if (!((Boolean) iVar.c(Boolean.FALSE, C0087p.f849p)).booleanValue()) {
            a3 = iVar2.n(iVar);
        } else {
            a3 = a(iVar2, iVar, false);
        }
        P p3 = (P) a3.d(C0090t.f856n);
        if (p3 != null && !p3.a()) {
            throw ((Z) p3).A();
        }
        if (a3 == iVar2) {
            P2.u uVar = new P2.u(fVar, a3);
            return AbstractC0155a.K(uVar, uVar, pVar);
        }
        C0867e c0867e = C0867e.f9460m;
        if (D2.i.a(a3.d(c0867e), iVar2.d(c0867e))) {
            j0 j0Var = new j0(a3, fVar);
            u2.i iVar3 = j0Var.f821o;
            Object n3 = AbstractC0097a.n(iVar3, null);
            try {
                return AbstractC0155a.K(j0Var, j0Var, pVar);
            } finally {
                AbstractC0097a.h(iVar3, n3);
            }
        }
        P2.u uVar2 = new P2.u(fVar, a3);
        android.support.v4.media.session.a.V(pVar, uVar2, uVar2);
        do {
            atomicIntegerFieldUpdater = C0096z.f869q;
            int i3 = atomicIntegerFieldUpdater.get(uVar2);
            if (i3 != 0) {
                if (i3 == 2) {
                    Object l3 = l(uVar2.E());
                    if (l3 instanceof C0085n) {
                        throw ((C0085n) l3).f845a;
                    }
                    return l3;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(uVar2, 0, 1));
        return EnumC0879a.f9494m;
    }
}
