package j$.time.temporal;

import j$.time.ZoneId;
import j$.time.y;
/* loaded from: classes2.dex */
public final /* synthetic */ class q implements t, o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6634a;

    public /* synthetic */ q(int i3) {
        this.f6634a = i3;
    }

    @Override // j$.time.temporal.o
    public m A(m mVar) {
        a aVar = a.DAY_OF_MONTH;
        return mVar.d(mVar.r(aVar).d(), aVar);
    }

    @Override // j$.time.temporal.t
    public Object g(TemporalAccessor temporalAccessor) {
        switch (this.f6634a) {
            case 1:
                return (ZoneId) temporalAccessor.z(n.f6625a);
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return (j$.time.chrono.m) temporalAccessor.z(n.f6626b);
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                return (u) temporalAccessor.z(n.f6627c);
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                a aVar = a.OFFSET_SECONDS;
                if (temporalAccessor.f(aVar)) {
                    return y.W(temporalAccessor.o(aVar));
                }
                return null;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                ZoneId zoneId = (ZoneId) temporalAccessor.z(n.f6625a);
                return zoneId != null ? zoneId : (ZoneId) temporalAccessor.z(n.f6628d);
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                a aVar2 = a.EPOCH_DAY;
                if (temporalAccessor.f(aVar2)) {
                    return j$.time.g.c0(temporalAccessor.v(aVar2));
                }
                return null;
            default:
                a aVar3 = a.NANO_OF_DAY;
                if (temporalAccessor.f(aVar3)) {
                    return j$.time.k.X(temporalAccessor.v(aVar3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f6634a) {
            case 1:
                return "ZoneId";
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return "Chronology";
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                return "Precision";
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                return "ZoneOffset";
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return "Zone";
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return "LocalDate";
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
