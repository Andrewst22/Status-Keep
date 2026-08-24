package j$.time;

import j$.time.chrono.AbstractC0335i;
import j$.time.temporal.TemporalAccessor;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class o implements TemporalAccessor, j$.time.temporal.o, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;

    /* renamed from: a  reason: collision with root package name */
    private final int f6594a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6595b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        int i3 = this.f6594a - oVar.f6594a;
        return i3 == 0 ? this.f6595b - oVar.f6595b : i3;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.f("--");
        pVar.k(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        pVar.e('-');
        pVar.k(j$.time.temporal.a.DAY_OF_MONTH, 2);
        pVar.t();
    }

    private o(int i3, int i4) {
        this.f6594a = i3;
        this.f6595b = i4;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.s sVar) {
        return sVar instanceof j$.time.temporal.a ? sVar == j$.time.temporal.a.MONTH_OF_YEAR || sVar == j$.time.temporal.a.DAY_OF_MONTH : sVar != null && sVar.r(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w r(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return sVar.m();
        }
        if (sVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.n.d(this, sVar);
        }
        int i3 = this.f6594a;
        m Q2 = m.Q(i3);
        Q2.getClass();
        int i4 = l.f6590a[Q2.ordinal()];
        return j$.time.temporal.w.k(i4 != 1 ? (i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) ? 30 : 31 : 28, m.Q(i3).P());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int o(j$.time.temporal.s sVar) {
        return r(sVar).a(v(sVar), sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.s sVar) {
        int i3;
        if (sVar instanceof j$.time.temporal.a) {
            int i4 = n.f6593a[((j$.time.temporal.a) sVar).ordinal()];
            if (i4 == 1) {
                i3 = this.f6595b;
            } else if (i4 == 2) {
                i3 = this.f6594a;
            } else {
                throw new RuntimeException(d.a("Unsupported field: ", sVar));
            }
            return i3;
        }
        return sVar.q(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.e()) {
            return j$.time.chrono.t.f6484d;
        }
        return j$.time.temporal.n.c(this, tVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        if (!AbstractC0335i.q(mVar).equals(j$.time.chrono.t.f6484d)) {
            throw new RuntimeException("Adjustment only supported on ISO date-time");
        }
        j$.time.temporal.m d3 = mVar.d(this.f6594a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return d3.d(Math.min(d3.r(aVar).d(), this.f6595b), aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.f6594a == oVar.f6594a && this.f6595b == oVar.f6595b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f6594a << 6) + this.f6595b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i3 = this.f6594a;
        sb.append(i3 < 10 ? "0" : "");
        sb.append(i3);
        int i4 = this.f6595b;
        sb.append(i4 < 10 ? "-0" : "-");
        sb.append(i4);
        return sb.toString();
    }

    private Object writeReplace() {
        return new t((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void O(DataOutput dataOutput) {
        dataOutput.writeByte(this.f6594a);
        dataOutput.writeByte(this.f6595b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o N(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        byte readByte2 = objectInput.readByte();
        m Q2 = m.Q(readByte);
        Objects.requireNonNull(Q2, "month");
        j$.time.temporal.a.DAY_OF_MONTH.O(readByte2);
        if (readByte2 > Q2.P()) {
            String name = Q2.name();
            throw new RuntimeException("Illegal value for DayOfMonth field, value " + ((int) readByte2) + " is not valid for month " + name);
        }
        return new o(Q2.getValue(), readByte2);
    }
}
