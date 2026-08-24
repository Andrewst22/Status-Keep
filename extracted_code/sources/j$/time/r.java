package j$.time;

import j$.time.chrono.AbstractC0335i;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class r implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;

    /* renamed from: a  reason: collision with root package name */
    private final k f6599a;

    /* renamed from: b  reason: collision with root package name */
    private final y f6600b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        r rVar = (r) obj;
        y yVar = rVar.f6600b;
        y yVar2 = this.f6600b;
        boolean equals = yVar2.equals(yVar);
        k kVar = rVar.f6599a;
        k kVar2 = this.f6599a;
        if (equals) {
            return kVar2.compareTo(kVar);
        }
        int c3 = j$.com.android.tools.r8.a.c(kVar2.f0() - (yVar2.T() * 1000000000), kVar.f0() - (rVar.f6600b.T() * 1000000000));
        return c3 == 0 ? kVar2.compareTo(kVar) : c3;
    }

    static {
        k kVar = k.f6582e;
        y yVar = y.f6651h;
        kVar.getClass();
        N(kVar, yVar);
        k kVar2 = k.f6583f;
        y yVar2 = y.f6650g;
        kVar2.getClass();
        N(kVar2, yVar2);
    }

    public static r N(k kVar, y yVar) {
        return new r(kVar, yVar);
    }

    private r(k kVar, y yVar) {
        Objects.requireNonNull(kVar, "time");
        this.f6599a = kVar;
        Objects.requireNonNull(yVar, "offset");
        this.f6600b = yVar;
    }

    private r Q(k kVar, y yVar) {
        return (this.f6599a == kVar && this.f6600b.equals(yVar)) ? this : new r(kVar, yVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.s sVar) {
        return sVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) sVar).P() || sVar == j$.time.temporal.a.OFFSET_SECONDS : sVar != null && sVar.r(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w r(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            if (sVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) sVar).m();
            }
            k kVar = this.f6599a;
            kVar.getClass();
            return j$.time.temporal.n.d(kVar, sVar);
        }
        return sVar.z(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int o(j$.time.temporal.s sVar) {
        return j$.time.temporal.n.a(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            if (sVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f6600b.T();
            }
            return this.f6599a.v(sVar);
        }
        return sVar.q(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j3, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
            k kVar = this.f6599a;
            if (sVar == aVar) {
                return Q(kVar, y.W(((j$.time.temporal.a) sVar).N(j3)));
            }
            return Q(kVar.d(j3, sVar), this.f6600b);
        }
        return (r) sVar.v(this, j3);
    }

    @Override // j$.time.temporal.m
    /* renamed from: O */
    public final r e(long j3, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            return Q(this.f6599a.e(j3, uVar), this.f6600b);
        }
        return (r) uVar.m(this, j3);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m m(long j3, j$.time.temporal.b bVar) {
        return j3 == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j3, bVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.j()) {
            return this.f6600b;
        }
        if (((tVar == j$.time.temporal.n.k()) || (tVar == j$.time.temporal.n.e())) || tVar == j$.time.temporal.n.f()) {
            return null;
        }
        if (tVar == j$.time.temporal.n.g()) {
            return this.f6599a;
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.g(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return mVar.d(this.f6599a.f0(), j$.time.temporal.a.NANO_OF_DAY).d(this.f6600b.T(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return this.f6599a.equals(rVar.f6599a) && this.f6600b.equals(rVar.f6600b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6599a.hashCode() ^ this.f6600b.hashCode();
    }

    public final String toString() {
        String kVar = this.f6599a.toString();
        String yVar = this.f6600b.toString();
        return kVar + yVar;
    }

    private Object writeReplace() {
        return new t((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        this.f6599a.j0(objectOutput);
        this.f6600b.Z(objectOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r P(ObjectInput objectInput) {
        return new r(k.e0(objectInput), y.Y(objectInput));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m q(g gVar) {
        return (r) AbstractC0335i.a(gVar, this);
    }
}
