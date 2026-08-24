package j$.time.chrono;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.chrono.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0330d implements InterfaceC0328b, j$.time.temporal.m, j$.time.temporal.o, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    @Override // j$.time.temporal.o
    public final /* synthetic */ j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return AbstractC0335i.a(this, mVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: K */
    public final /* synthetic */ int compareTo(InterfaceC0328b interfaceC0328b) {
        return AbstractC0335i.b(this, interfaceC0328b);
    }

    abstract InterfaceC0328b P(long j3);

    abstract InterfaceC0328b Q(long j3);

    abstract InterfaceC0328b R(long j3);

    @Override // j$.time.chrono.InterfaceC0328b, j$.time.temporal.TemporalAccessor
    public /* synthetic */ boolean f(j$.time.temporal.s sVar) {
        return AbstractC0335i.i(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int o(j$.time.temporal.s sVar) {
        return j$.time.temporal.n.a(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public /* synthetic */ j$.time.temporal.w r(j$.time.temporal.s sVar) {
        return j$.time.temporal.n.d(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object z(j$.time.temporal.t tVar) {
        return AbstractC0335i.k(this, tVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC0328b N(m mVar, j$.time.temporal.m mVar2) {
        InterfaceC0328b interfaceC0328b = (InterfaceC0328b) mVar2;
        if (mVar.equals(interfaceC0328b.a())) {
            return interfaceC0328b;
        }
        String l3 = mVar.l();
        String l4 = interfaceC0328b.a().l();
        throw new ClassCastException("Chronology mismatch, expected: " + l3 + ", actual: " + l4);
    }

    @Override // j$.time.temporal.m
    public InterfaceC0328b e(long j3, j$.time.temporal.u uVar) {
        boolean z3 = uVar instanceof j$.time.temporal.b;
        if (!z3) {
            if (z3) {
                throw new RuntimeException("Unsupported unit: " + uVar);
            }
            return N(a(), uVar.m(this, j3));
        }
        switch (AbstractC0329c.f6451a[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return P(j3);
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return P(j$.com.android.tools.r8.a.g(j3, 7));
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                return Q(j3);
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                return R(j3);
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return R(j$.com.android.tools.r8.a.g(j3, 10));
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return R(j$.com.android.tools.r8.a.g(j3, 100));
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return R(j$.com.android.tools.r8.a.g(j3, 1000));
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.h(v(aVar), j3), (j$.time.temporal.s) aVar);
            default:
                throw new RuntimeException("Unsupported unit: " + uVar);
        }
    }

    @Override // j$.time.chrono.InterfaceC0328b
    public n B() {
        return a().L(j$.time.temporal.n.a(this, j$.time.temporal.a.ERA));
    }

    @Override // j$.time.chrono.InterfaceC0328b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0328b) && AbstractC0335i.b(this, (InterfaceC0328b) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC0328b
    public int hashCode() {
        long w3 = w();
        return a().hashCode() ^ ((int) (w3 ^ (w3 >>> 32)));
    }

    @Override // j$.time.temporal.m
    /* renamed from: j */
    public InterfaceC0328b q(j$.time.temporal.o oVar) {
        return N(a(), oVar.A(this));
    }

    @Override // j$.time.chrono.InterfaceC0328b
    public String toString() {
        long v3 = v(j$.time.temporal.a.YEAR_OF_ERA);
        long v4 = v(j$.time.temporal.a.MONTH_OF_YEAR);
        long v5 = v(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(a().toString());
        sb.append(" ");
        sb.append(B());
        sb.append(" ");
        sb.append(v3);
        sb.append(v4 < 10 ? "-0" : "-");
        sb.append(v4);
        sb.append(v5 < 10 ? "-0" : "-");
        sb.append(v5);
        return sb.toString();
    }

    @Override // j$.time.temporal.m
    public InterfaceC0328b d(long j3, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            throw new RuntimeException(j$.time.d.a("Unsupported field: ", sVar));
        }
        return N(a(), sVar.v(this, j3));
    }

    @Override // j$.time.chrono.InterfaceC0328b
    public InterfaceC0328b F(j$.time.temporal.r rVar) {
        return N(a(), rVar.m(this));
    }

    @Override // j$.time.temporal.m
    /* renamed from: O */
    public InterfaceC0328b m(long j3, j$.time.temporal.u uVar) {
        return N(a(), j$.time.temporal.n.b(this, j3, uVar));
    }

    @Override // j$.time.chrono.InterfaceC0328b
    public InterfaceC0331e y(j$.time.k kVar) {
        return C0333g.O(this, kVar);
    }

    @Override // j$.time.chrono.InterfaceC0328b
    public long w() {
        return v(j$.time.temporal.a.EPOCH_DAY);
    }
}
