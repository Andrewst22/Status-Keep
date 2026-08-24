package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class B extends AbstractC0327a implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final B f6437d = new B();
    private static final long serialVersionUID = 1039765215346859963L;

    private B() {
    }

    @Override // j$.time.chrono.m
    public final String l() {
        return "Minguo";
    }

    @Override // j$.time.chrono.m
    public final n L(int i3) {
        if (i3 != 0) {
            if (i3 == 1) {
                return E.ROC;
            }
            throw new RuntimeException("Invalid era: " + i3);
        }
        return E.BEFORE_ROC;
    }

    @Override // j$.time.chrono.m
    public final String u() {
        return "roc";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0328b E(int i3, int i4, int i5) {
        return new D(j$.time.g.a0(i3 + 1911, i4, i5));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0328b x(int i3, int i4) {
        return new D(j$.time.g.d0(i3 + 1911, i4));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0328b k(long j3) {
        return new D(j$.time.g.c0(j3));
    }

    @Override // j$.time.chrono.AbstractC0327a
    public final InterfaceC0328b o() {
        return new D(j$.time.g.P(j$.time.g.Z(j$.time.b.b())));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0328b p(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof D) {
            return (D) temporalAccessor;
        }
        return new D(j$.time.g.P(temporalAccessor));
    }

    @Override // j$.time.chrono.m
    public final int g(n nVar, int i3) {
        if (nVar instanceof E) {
            return nVar == E.ROC ? i3 : 1 - i3;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.m
    public final List J() {
        return j$.com.android.tools.r8.a.e(E.values());
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.w H(j$.time.temporal.a aVar) {
        int i3 = A.f6436a[aVar.ordinal()];
        if (i3 == 1) {
            j$.time.temporal.w m3 = j$.time.temporal.a.PROLEPTIC_MONTH.m();
            return j$.time.temporal.w.j(m3.e() - 22932, m3.d() - 22932);
        } else if (i3 == 2) {
            j$.time.temporal.w m4 = j$.time.temporal.a.YEAR.m();
            return j$.time.temporal.w.k(m4.d() - 1911, (-m4.e()) + 1912);
        } else if (i3 == 3) {
            j$.time.temporal.w m5 = j$.time.temporal.a.YEAR.m();
            return j$.time.temporal.w.j(m5.e() - 1911, m5.d() - 1911);
        } else {
            return aVar.m();
        }
    }

    @Override // j$.time.chrono.AbstractC0327a, j$.time.chrono.m
    public final InterfaceC0328b G(Map map, j$.time.format.y yVar) {
        return (D) super.G(map, yVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.m
    public final ChronoZonedDateTime I(Instant instant, ZoneId zoneId) {
        return l.O(this, instant, zoneId);
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }
}
