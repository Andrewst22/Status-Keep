package j$.time.chrono;

import j$.time.temporal.TemporalAccessor;
import java.util.Objects;
/* renamed from: j$.time.chrono.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0335i {
    public static boolean j(n nVar, j$.time.temporal.s sVar) {
        return sVar instanceof j$.time.temporal.a ? sVar == j$.time.temporal.a.ERA : sVar != null && sVar.r(nVar);
    }

    public static m q(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        m mVar = (m) temporalAccessor.z(j$.time.temporal.n.e());
        t tVar = t.f6484d;
        if (mVar != null) {
            return mVar;
        }
        Objects.requireNonNull(tVar, "defaultObj");
        return tVar;
    }

    public static int e(ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            int i3 = AbstractC0336j.f6460a[((j$.time.temporal.a) sVar).ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    return chronoZonedDateTime.h().T();
                }
                return chronoZonedDateTime.D().o(sVar);
            }
            throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return j$.time.temporal.n.a(chronoZonedDateTime, sVar);
    }

    public static int f(n nVar, j$.time.temporal.a aVar) {
        if (aVar == j$.time.temporal.a.ERA) {
            return nVar.getValue();
        }
        return j$.time.temporal.n.a(nVar, aVar);
    }

    public static long g(n nVar, j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.ERA) {
            return nVar.getValue();
        }
        if (sVar instanceof j$.time.temporal.a) {
            throw new RuntimeException(j$.time.d.a("Unsupported field: ", sVar));
        }
        return sVar.q(nVar);
    }

    public static Object n(n nVar, j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.ERAS;
        }
        return j$.time.temporal.n.c(nVar, tVar);
    }

    public static Object l(InterfaceC0331e interfaceC0331e, j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.k() || tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.h()) {
            return null;
        }
        if (tVar == j$.time.temporal.n.g()) {
            return interfaceC0331e.b();
        }
        if (tVar == j$.time.temporal.n.e()) {
            return interfaceC0331e.a();
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.g(interfaceC0331e);
    }

    public static boolean i(InterfaceC0328b interfaceC0328b, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) sVar).A();
        }
        return sVar != null && sVar.r(interfaceC0328b);
    }

    public static long o(InterfaceC0331e interfaceC0331e, j$.time.y yVar) {
        Objects.requireNonNull(yVar, "offset");
        return ((interfaceC0331e.c().w() * 86400) + interfaceC0331e.b().g0()) - yVar.T();
    }

    public static Object m(ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.k()) {
            return chronoZonedDateTime.t();
        }
        if (tVar == j$.time.temporal.n.h()) {
            return chronoZonedDateTime.h();
        }
        if (tVar == j$.time.temporal.n.g()) {
            return chronoZonedDateTime.b();
        }
        if (tVar == j$.time.temporal.n.e()) {
            return chronoZonedDateTime.a();
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.g(chronoZonedDateTime);
    }

    public static int c(InterfaceC0331e interfaceC0331e, InterfaceC0331e interfaceC0331e2) {
        int K3 = interfaceC0331e.c().K(interfaceC0331e2.c());
        if (K3 == 0) {
            int compareTo = interfaceC0331e.b().compareTo(interfaceC0331e2.b());
            if (compareTo == 0) {
                return ((AbstractC0327a) interfaceC0331e.a()).l().compareTo(interfaceC0331e2.a().l());
            }
            return compareTo;
        }
        return K3;
    }

    public static Object k(InterfaceC0328b interfaceC0328b, j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.k() || tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.g()) {
            return null;
        }
        if (tVar == j$.time.temporal.n.e()) {
            return interfaceC0328b.a();
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.DAYS;
        }
        return tVar.g(interfaceC0328b);
    }

    public static j$.time.temporal.m a(InterfaceC0328b interfaceC0328b, j$.time.temporal.m mVar) {
        return mVar.d(interfaceC0328b.w(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static long p(ChronoZonedDateTime chronoZonedDateTime) {
        return ((chronoZonedDateTime.c().w() * 86400) + chronoZonedDateTime.b().g0()) - chronoZonedDateTime.h().T();
    }

    public static int d(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        int c3 = j$.com.android.tools.r8.a.c(chronoZonedDateTime.M(), chronoZonedDateTime2.M());
        if (c3 == 0) {
            int T3 = chronoZonedDateTime.b().T() - chronoZonedDateTime2.b().T();
            if (T3 == 0) {
                int C3 = chronoZonedDateTime.D().C(chronoZonedDateTime2.D());
                if (C3 == 0) {
                    int compareTo = chronoZonedDateTime.t().l().compareTo(chronoZonedDateTime2.t().l());
                    if (compareTo == 0) {
                        return ((AbstractC0327a) chronoZonedDateTime.a()).l().compareTo(chronoZonedDateTime2.a().l());
                    }
                    return compareTo;
                }
                return C3;
            }
            return T3;
        }
        return c3;
    }

    public static boolean h(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        int i3 = (chronoZonedDateTime.M() > chronoZonedDateTime2.M() ? 1 : (chronoZonedDateTime.M() == chronoZonedDateTime2.M() ? 0 : -1));
        return i3 < 0 || (i3 == 0 && chronoZonedDateTime.b().T() < chronoZonedDateTime2.b().T());
    }

    public static int b(InterfaceC0328b interfaceC0328b, InterfaceC0328b interfaceC0328b2) {
        int c3 = j$.com.android.tools.r8.a.c(interfaceC0328b.w(), interfaceC0328b2.w());
        if (c3 == 0) {
            return ((AbstractC0327a) interfaceC0328b.a()).l().compareTo(interfaceC0328b2.a().l());
        }
        return c3;
    }
}
