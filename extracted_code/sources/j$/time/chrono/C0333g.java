package j$.time.chrono;

import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.chrono.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0333g implements InterfaceC0331e, j$.time.temporal.m, j$.time.temporal.o, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* renamed from: a  reason: collision with root package name */
    private final transient InterfaceC0328b f6453a;

    /* renamed from: b  reason: collision with root package name */
    private final transient j$.time.k f6454b;

    @Override // java.lang.Comparable
    /* renamed from: C */
    public final /* synthetic */ int compareTo(InterfaceC0331e interfaceC0331e) {
        return AbstractC0335i.c(this, interfaceC0331e);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object z(j$.time.temporal.t tVar) {
        return AbstractC0335i.l(this, tVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C0333g O(InterfaceC0328b interfaceC0328b, j$.time.k kVar) {
        return new C0333g(interfaceC0328b, kVar);
    }

    static C0333g N(m mVar, j$.time.temporal.m mVar2) {
        C0333g c0333g = (C0333g) mVar2;
        if (mVar.equals(c0333g.f6453a.a())) {
            return c0333g;
        }
        String l3 = mVar.l();
        String l4 = c0333g.f6453a.a().l();
        throw new ClassCastException("Chronology mismatch, required: " + l3 + ", actual: " + l4);
    }

    @Override // j$.time.chrono.InterfaceC0331e
    public final m a() {
        return this.f6453a.a();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(long j3, j$.time.temporal.b bVar) {
        return N(this.f6453a.a(), j$.time.temporal.n.b(this, j3, bVar));
    }

    private C0333g(InterfaceC0328b interfaceC0328b, j$.time.k kVar) {
        Objects.requireNonNull(kVar, "time");
        this.f6453a = interfaceC0328b;
        this.f6454b = kVar;
    }

    private C0333g T(j$.time.temporal.m mVar, j$.time.k kVar) {
        InterfaceC0328b interfaceC0328b = this.f6453a;
        return (interfaceC0328b == mVar && this.f6454b == kVar) ? this : new C0333g(AbstractC0330d.N(interfaceC0328b.a(), mVar), kVar);
    }

    @Override // j$.time.chrono.InterfaceC0331e
    public final InterfaceC0328b c() {
        return this.f6453a;
    }

    @Override // j$.time.chrono.InterfaceC0331e
    public final j$.time.k b() {
        return this.f6454b;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.a)) {
            return sVar != null && sVar.r(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
        return aVar.A() || aVar.P();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w r(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            if (!((j$.time.temporal.a) sVar).P()) {
                return this.f6453a.r(sVar);
            }
            j$.time.k kVar = this.f6454b;
            kVar.getClass();
            return j$.time.temporal.n.d(kVar, sVar);
        }
        return sVar.z(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int o(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) sVar).P() ? this.f6454b.o(sVar) : this.f6453a.o(sVar);
        }
        return r(sVar).a(v(sVar), sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) sVar).P() ? this.f6454b.v(sVar) : this.f6453a.v(sVar);
        }
        return sVar.q(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m q(j$.time.g gVar) {
        return T(gVar, this.f6454b);
    }

    @Override // j$.time.temporal.m
    /* renamed from: S */
    public final C0333g d(long j3, j$.time.temporal.s sVar) {
        boolean z3 = sVar instanceof j$.time.temporal.a;
        InterfaceC0328b interfaceC0328b = this.f6453a;
        if (z3) {
            boolean P3 = ((j$.time.temporal.a) sVar).P();
            j$.time.k kVar = this.f6454b;
            if (P3) {
                return T(interfaceC0328b, kVar.d(j3, sVar));
            }
            return T(interfaceC0328b.d(j3, sVar), kVar);
        }
        return N(interfaceC0328b.a(), sVar.v(this, j3));
    }

    @Override // j$.time.temporal.m
    /* renamed from: P */
    public final C0333g e(long j3, j$.time.temporal.u uVar) {
        boolean z3 = uVar instanceof j$.time.temporal.b;
        InterfaceC0328b interfaceC0328b = this.f6453a;
        if (z3) {
            int i3 = AbstractC0332f.f6452a[((j$.time.temporal.b) uVar).ordinal()];
            j$.time.k kVar = this.f6454b;
            switch (i3) {
                case 1:
                    return R(this.f6453a, 0L, 0L, 0L, j3);
                case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                    C0333g T3 = T(interfaceC0328b.e(j3 / 86400000000L, (j$.time.temporal.u) j$.time.temporal.b.DAYS), kVar);
                    return T3.R(T3.f6453a, 0L, 0L, 0L, (j3 % 86400000000L) * 1000);
                case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                    C0333g T4 = T(interfaceC0328b.e(j3 / 86400000, (j$.time.temporal.u) j$.time.temporal.b.DAYS), kVar);
                    return T4.R(T4.f6453a, 0L, 0L, 0L, (j3 % 86400000) * 1000000);
                case N.k.LONG_FIELD_NUMBER /* 4 */:
                    return Q(j3);
                case N.k.STRING_FIELD_NUMBER /* 5 */:
                    return R(this.f6453a, 0L, j3, 0L, 0L);
                case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    return R(this.f6453a, j3, 0L, 0L, 0L);
                case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    C0333g T5 = T(interfaceC0328b.e(j3 / 256, (j$.time.temporal.u) j$.time.temporal.b.DAYS), kVar);
                    return T5.R(T5.f6453a, (j3 % 256) * 12, 0L, 0L, 0L);
                default:
                    return T(interfaceC0328b.e(j3, uVar), kVar);
            }
        }
        return N(interfaceC0328b.a(), uVar.m(this, j3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C0333g Q(long j3) {
        return R(this.f6453a, 0L, 0L, j3, 0L);
    }

    private C0333g R(InterfaceC0328b interfaceC0328b, long j3, long j4, long j5, long j6) {
        j$.time.k kVar = this.f6454b;
        if ((j3 | j4 | j5 | j6) == 0) {
            return T(interfaceC0328b, kVar);
        }
        long j7 = j4 / 1440;
        long j8 = j3 / 24;
        long j9 = (j4 % 1440) * 60000000000L;
        long j10 = ((j3 % 24) * 3600000000000L) + j9 + ((j5 % 86400) * 1000000000) + (j6 % 86400000000000L);
        long f02 = kVar.f0();
        long j11 = j10 + f02;
        long d3 = j$.com.android.tools.r8.a.d(j11, 86400000000000L) + j8 + j7 + (j5 / 86400) + (j6 / 86400000000000L);
        long i3 = j$.com.android.tools.r8.a.i(j11, 86400000000000L);
        if (i3 != f02) {
            kVar = j$.time.k.X(i3);
        }
        return T(interfaceC0328b.e(d3, (j$.time.temporal.u) j$.time.temporal.b.DAYS), kVar);
    }

    @Override // j$.time.chrono.InterfaceC0331e
    public final ChronoZonedDateTime n(ZoneId zoneId) {
        return l.N(zoneId, null, this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return mVar.d(c().w(), j$.time.temporal.a.EPOCH_DAY).d(b().f0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    private Object writeReplace() {
        return new F((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f6453a);
        objectOutput.writeObject(this.f6454b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0331e) && AbstractC0335i.c(this, (InterfaceC0331e) obj) == 0;
    }

    public final int hashCode() {
        return this.f6453a.hashCode() ^ this.f6454b.hashCode();
    }

    public final String toString() {
        String interfaceC0328b = this.f6453a.toString();
        String kVar = this.f6454b.toString();
        return interfaceC0328b + "T" + kVar;
    }
}
