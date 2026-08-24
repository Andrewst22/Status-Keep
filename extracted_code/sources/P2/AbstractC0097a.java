package P2;

import K2.AbstractC0089s;
import K2.AbstractC0092v;
import K2.C0085n;
import K2.C0086o;
import K2.C0090t;
import K2.H;
import K2.P;
import K2.Z;
import K2.g0;
import K2.h0;
import K2.j0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m2.AbstractC0635d;
import n2.AbstractC0664g;
import s2.AbstractC0805d;
import t2.C0825b;
import u2.InterfaceC0866d;
/* renamed from: P2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0097a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1.f f1470a = new C1.f("NO_DECISION", 1);

    /* renamed from: b  reason: collision with root package name */
    public static final C1.f f1471b = new C1.f("CLOSED", 1);

    /* renamed from: c  reason: collision with root package name */
    public static final C1.f f1472c = new C1.f("UNDEFINED", 1);

    /* renamed from: d  reason: collision with root package name */
    public static final C1.f f1473d = new C1.f("REUSABLE_CLAIMED", 1);

    /* renamed from: e  reason: collision with root package name */
    public static final C1.f f1474e = new C1.f("CONDITION_FALSE", 1);

    /* renamed from: f  reason: collision with root package name */
    public static final C1.f f1475f = new C1.f("NO_THREAD_ELEMENTS", 1);

    public static final void a(C2.l lVar, Object obj, u2.i iVar) {
        B1.c b3 = b(lVar, obj, null);
        if (b3 != null) {
            AbstractC0092v.d(b3, iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [B1.c, java.lang.RuntimeException] */
    public static final B1.c b(C2.l lVar, Object obj, B1.c cVar) {
        try {
            lVar.b(obj);
        } catch (Throwable th) {
            if (cVar != null && cVar.getCause() != th) {
                AbstractC0635d.b(cVar, th);
            } else {
                return new RuntimeException("Exception in undelivered element handler for " + obj, th);
            }
        }
        return cVar;
    }

    public static final Object c(v vVar, long j3, C2.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (vVar.f1515o >= j3 && !vVar.c()) {
                return vVar;
            }
            Object obj = d.f1478m.get(vVar);
            C1.f fVar = f1471b;
            if (obj == fVar) {
                return fVar;
            }
            v vVar2 = (v) ((d) obj);
            if (vVar2 == null) {
                vVar2 = (v) pVar.i(Long.valueOf(vVar.f1515o + 1), vVar);
                do {
                    atomicReferenceFieldUpdater = d.f1478m;
                    if (atomicReferenceFieldUpdater.compareAndSet(vVar, null, vVar2)) {
                        if (vVar.c()) {
                            vVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(vVar) == null);
            }
            vVar = vVar2;
        }
    }

    public static final v d(Object obj) {
        if (obj != f1471b) {
            return (v) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void e(Throwable th, u2.i iVar) {
        Throwable runtimeException;
        for (L2.b bVar : f.f1481a) {
            try {
                bVar.g(th, iVar);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC0635d.b(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            AbstractC0635d.b(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean f(Object obj) {
        if (obj == f1471b) {
            return true;
        }
        return false;
    }

    public static final Object g(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void h(u2.i iVar, Object obj) {
        if (obj == f1475f) {
            return;
        }
        if (obj instanceof A) {
            A a3 = (A) obj;
            g0[] g0VarArr = a3.f1469b;
            int length = g0VarArr.length - 1;
            if (length < 0) {
                return;
            }
            g0 g0Var = g0VarArr[length];
            D2.i.b(null);
            Object obj2 = a3.f1468a[length];
            throw null;
        }
        Object c3 = iVar.c(null, y.f1519p);
        D2.i.c(c3, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        D2.h.q(c3);
        throw null;
    }

    public static final void i(InterfaceC0866d interfaceC0866d, Object obj, C2.l lVar) {
        Object c0085n;
        j0 j0Var;
        if (interfaceC0866d instanceof h) {
            h hVar = (h) interfaceC0866d;
            Throwable a3 = AbstractC0805d.a(obj);
            if (a3 == null) {
                if (lVar != null) {
                    c0085n = new C0086o(obj, lVar);
                } else {
                    c0085n = obj;
                }
            } else {
                c0085n = new C0085n(a3, false);
            }
            AbstractC0089s abstractC0089s = hVar.f1484p;
            w2.b bVar = hVar.f1485q;
            bVar.h();
            if (abstractC0089s.h()) {
                hVar.f1486r = c0085n;
                hVar.f784o = 1;
                hVar.f1484p.g(bVar.h(), hVar);
                return;
            }
            H a4 = h0.a();
            if (a4.f793o >= 4294967296L) {
                hVar.f1486r = c0085n;
                hVar.f784o = 1;
                C0825b c0825b = a4.f795q;
                if (c0825b == null) {
                    c0825b = new C0825b();
                    a4.f795q = c0825b;
                }
                c0825b.addLast(hVar);
                return;
            }
            a4.k(true);
            try {
                P p3 = (P) bVar.h().d(C0090t.f856n);
                if (p3 != null && !p3.a()) {
                    CancellationException A3 = ((Z) p3).A();
                    hVar.b(c0085n, A3);
                    hVar.k(AbstractC0664g.f(A3));
                } else {
                    Object obj2 = hVar.f1487s;
                    u2.i h3 = bVar.h();
                    Object n3 = n(h3, obj2);
                    if (n3 != f1475f) {
                        j0Var = AbstractC0092v.m(bVar, h3, n3);
                    } else {
                        j0Var = null;
                    }
                    bVar.k(obj);
                    if (j0Var == null || j0Var.X()) {
                        h(h3, n3);
                    }
                }
                do {
                } while (a4.m());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        interfaceC0866d.k(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long k(java.lang.String r22, long r23, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.AbstractC0097a.k(java.lang.String, long, long, long):long");
    }

    public static int l(String str, int i3, int i4, int i5, int i6) {
        if ((i6 & 4) != 0) {
            i4 = 1;
        }
        if ((i6 & 8) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        return (int) k(str, i3, i4, i5);
    }

    public static final Object m(u2.i iVar) {
        Object c3 = iVar.c(0, y.f1518o);
        D2.i.b(c3);
        return c3;
    }

    public static final Object n(u2.i iVar, Object obj) {
        if (obj == null) {
            obj = m(iVar);
        }
        if (obj == 0) {
            return f1475f;
        }
        if (obj instanceof Integer) {
            return iVar.c(new A(((Number) obj).intValue(), iVar), y.f1520q);
        }
        D2.h.q(obj);
        throw null;
    }
}
