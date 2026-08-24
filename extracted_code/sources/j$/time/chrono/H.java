package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class H extends AbstractC0327a implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final H f6444d = new H();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // j$.time.chrono.m
    public final n L(int i3) {
        if (i3 != 0) {
            if (i3 == 1) {
                return K.BE;
            }
            throw new RuntimeException("Invalid era: " + i3);
        }
        return K.BEFORE_BE;
    }

    private H() {
    }

    @Override // j$.time.chrono.m
    public final String l() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.m
    public final String u() {
        return "buddhist";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0328b E(int i3, int i4, int i5) {
        return new J(j$.time.g.a0(i3 - 543, i4, i5));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0328b x(int i3, int i4) {
        return new J(j$.time.g.d0(i3 - 543, i4));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0328b k(long j3) {
        return new J(j$.time.g.c0(j3));
    }

    @Override // j$.time.chrono.AbstractC0327a
    public final InterfaceC0328b o() {
        return new J(j$.time.g.P(j$.time.g.Z(j$.time.b.b())));
    }

    @Override // j$.time.chrono.m
    public final InterfaceC0328b p(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof J) {
            return (J) temporalAccessor;
        }
        return new J(j$.time.g.P(temporalAccessor));
    }

    @Override // j$.time.chrono.m
    public final int g(n nVar, int i3) {
        if (nVar instanceof K) {
            return nVar == K.BE ? i3 : 1 - i3;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    @Override // j$.time.chrono.m
    public final List J() {
        return j$.com.android.tools.r8.a.e(K.values());
    }

    @Override // j$.time.chrono.m
    public final j$.time.temporal.w H(j$.time.temporal.a aVar) {
        int i3 = G.f6443a[aVar.ordinal()];
        if (i3 == 1) {
            j$.time.temporal.w m3 = j$.time.temporal.a.PROLEPTIC_MONTH.m();
            return j$.time.temporal.w.j(m3.e() + 6516, m3.d() + 6516);
        } else if (i3 == 2) {
            j$.time.temporal.w m4 = j$.time.temporal.a.YEAR.m();
            return j$.time.temporal.w.k((-(m4.e() + 543)) + 1, m4.d() + 543);
        } else if (i3 == 3) {
            j$.time.temporal.w m5 = j$.time.temporal.a.YEAR.m();
            return j$.time.temporal.w.j(m5.e() + 543, m5.d() + 543);
        } else {
            return aVar.m();
        }
    }

    @Override // j$.time.chrono.AbstractC0327a, j$.time.chrono.m
    public final InterfaceC0328b G(Map map, j$.time.format.y yVar) {
        return (J) super.G(map, yVar);
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
