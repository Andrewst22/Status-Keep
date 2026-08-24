package j$.time;

import j$.time.chrono.AbstractC0335i;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class q implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;

    /* renamed from: a  reason: collision with root package name */
    private final LocalDateTime f6597a;

    /* renamed from: b  reason: collision with root package name */
    private final y f6598b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int c3;
        q qVar = (q) obj;
        y yVar = qVar.f6598b;
        y yVar2 = this.f6598b;
        boolean equals = yVar2.equals(yVar);
        LocalDateTime localDateTime = qVar.f6597a;
        LocalDateTime localDateTime2 = this.f6597a;
        if (equals) {
            c3 = localDateTime2.compareTo(localDateTime);
        } else {
            localDateTime2.getClass();
            long o3 = AbstractC0335i.o(localDateTime2, yVar2);
            localDateTime.getClass();
            c3 = j$.com.android.tools.r8.a.c(o3, AbstractC0335i.o(localDateTime, qVar.f6598b));
            if (c3 == 0) {
                c3 = localDateTime2.b().T() - localDateTime.b().T();
            }
        }
        return c3 == 0 ? localDateTime2.compareTo(localDateTime) : c3;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.f6426c;
        y yVar = y.f6651h;
        localDateTime.getClass();
        N(localDateTime, yVar);
        LocalDateTime localDateTime2 = LocalDateTime.f6427d;
        y yVar2 = y.f6650g;
        localDateTime2.getClass();
        N(localDateTime2, yVar2);
    }

    public static q N(LocalDateTime localDateTime, y yVar) {
        return new q(localDateTime, yVar);
    }

    private q(LocalDateTime localDateTime, y yVar) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.f6597a = localDateTime;
        Objects.requireNonNull(yVar, "offset");
        this.f6598b = yVar;
    }

    private q R(LocalDateTime localDateTime, y yVar) {
        return (this.f6597a == localDateTime && this.f6598b.equals(yVar)) ? this : new q(localDateTime, yVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.s sVar) {
        return (sVar instanceof j$.time.temporal.a) || (sVar != null && sVar.r(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w r(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            if (sVar == j$.time.temporal.a.INSTANT_SECONDS || sVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) sVar).m();
            }
            return this.f6597a.r(sVar);
        }
        return sVar.z(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int o(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            int i3 = p.f6596a[((j$.time.temporal.a) sVar).ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    return this.f6598b.T();
                }
                return this.f6597a.o(sVar);
            }
            throw new RuntimeException("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        }
        return j$.time.temporal.n.a(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            int i3 = p.f6596a[((j$.time.temporal.a) sVar).ordinal()];
            y yVar = this.f6598b;
            LocalDateTime localDateTime = this.f6597a;
            if (i3 == 1) {
                localDateTime.getClass();
                return AbstractC0335i.o(localDateTime, yVar);
            } else if (i3 == 2) {
                return yVar.T();
            } else {
                return localDateTime.v(sVar);
            }
        }
        return sVar.q(this);
    }

    public final LocalDateTime Q() {
        return this.f6597a;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m q(g gVar) {
        return R(this.f6597a.i0(gVar), this.f6598b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j3, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
            int i3 = p.f6596a[aVar.ordinal()];
            y yVar = this.f6598b;
            LocalDateTime localDateTime = this.f6597a;
            if (i3 != 1) {
                if (i3 == 2) {
                    return R(localDateTime, y.W(aVar.N(j3)));
                }
                return R(localDateTime.d(j3, sVar), yVar);
            }
            Instant S3 = Instant.S(j3, localDateTime.U());
            Objects.requireNonNull(S3, "instant");
            Objects.requireNonNull(yVar, "zone");
            y d3 = yVar.N().d(S3);
            return new q(LocalDateTime.c0(S3.O(), S3.P(), d3), d3);
        }
        return (q) sVar.v(this, j3);
    }

    @Override // j$.time.temporal.m
    /* renamed from: O */
    public final q e(long j3, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            return R(this.f6597a.e(j3, uVar), this.f6598b);
        }
        return (q) uVar.m(this, j3);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(long j3, j$.time.temporal.b bVar) {
        return j3 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j3, bVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.j()) {
            return this.f6598b;
        }
        if (tVar == j$.time.temporal.n.k()) {
            return null;
        }
        j$.time.temporal.t f3 = j$.time.temporal.n.f();
        LocalDateTime localDateTime = this.f6597a;
        if (tVar == f3) {
            return localDateTime.g0();
        }
        if (tVar == j$.time.temporal.n.g()) {
            return localDateTime.b();
        }
        if (tVar == j$.time.temporal.n.e()) {
            return j$.time.chrono.t.f6484d;
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.g(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.f6597a;
        return mVar.d(localDateTime.g0().w(), aVar).d(localDateTime.b().f0(), j$.time.temporal.a.NANO_OF_DAY).d(this.f6598b.T(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return this.f6597a.equals(qVar.f6597a) && this.f6598b.equals(qVar.f6598b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6597a.hashCode() ^ this.f6598b.hashCode();
    }

    public final String toString() {
        String localDateTime = this.f6597a.toString();
        String yVar = this.f6598b.toString();
        return localDateTime + yVar;
    }

    private Object writeReplace() {
        return new t((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        this.f6597a.k0(objectOutput);
        this.f6598b.Z(objectOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q P(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.f6426c;
        g gVar = g.f6574d;
        return new q(LocalDateTime.b0(g.a0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.e0(objectInput)), y.Y(objectInput));
    }
}
