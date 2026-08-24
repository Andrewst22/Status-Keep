package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
/* loaded from: classes2.dex */
public final class r extends AbstractC0330d {
    private static final long serialVersionUID = -5207853542612002020L;

    /* renamed from: a  reason: collision with root package name */
    private final transient p f6479a;

    /* renamed from: b  reason: collision with root package name */
    private final transient int f6480b;

    /* renamed from: c  reason: collision with root package name */
    private final transient int f6481c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f6482d;

    @Override // j$.time.chrono.InterfaceC0328b
    public final m a() {
        return this.f6479a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r U(p pVar, int i3, int i4, int i5) {
        return new r(pVar, i3, i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r V(p pVar, long j3) {
        return new r(pVar, j3);
    }

    private r(p pVar, int i3, int i4, int i5) {
        pVar.S(i3, i4, i5);
        this.f6479a = pVar;
        this.f6480b = i3;
        this.f6481c = i4;
        this.f6482d = i5;
    }

    private r(p pVar, long j3) {
        int[] T3 = pVar.T((int) j3);
        this.f6479a = pVar;
        this.f6480b = T3[0];
        this.f6481c = T3[1];
        this.f6482d = T3[2];
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b
    public final n B() {
        return s.AH;
    }

    public final int T() {
        return this.f6479a.V(this.f6480b);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w r(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            if (AbstractC0335i.i(this, sVar)) {
                j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
                int i3 = q.f6478a[aVar.ordinal()];
                p pVar = this.f6479a;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            return j$.time.temporal.w.j(1L, 5L);
                        }
                        return pVar.H(aVar);
                    }
                    return j$.time.temporal.w.j(1L, T());
                }
                return j$.time.temporal.w.j(1L, pVar.U(this.f6480b, this.f6481c));
            }
            throw new RuntimeException(j$.time.d.a("Unsupported field: ", sVar));
        }
        return sVar.z(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            int i3 = q.f6478a[((j$.time.temporal.a) sVar).ordinal()];
            int i4 = this.f6481c;
            int i5 = this.f6482d;
            int i6 = this.f6480b;
            switch (i3) {
                case 1:
                    return i5;
                case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                    return S();
                case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                    return ((i5 - 1) / 7) + 1;
                case N.k.LONG_FIELD_NUMBER /* 4 */:
                    return ((int) j$.com.android.tools.r8.a.i(w() + 3, 7)) + 1;
                case N.k.STRING_FIELD_NUMBER /* 5 */:
                    return ((i5 - 1) % 7) + 1;
                case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    return ((S() - 1) % 7) + 1;
                case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    return w();
                case N.k.BYTES_FIELD_NUMBER /* 8 */:
                    return ((S() - 1) / 7) + 1;
                case 9:
                    return i4;
                case 10:
                    return ((i6 * 12) + i4) - 1;
                case 11:
                    return i6;
                case 12:
                    return i6;
                case 13:
                    return i6 <= 1 ? 0 : 1;
                default:
                    throw new RuntimeException(j$.time.d.a("Unsupported field: ", sVar));
            }
        }
        return sVar.q(this);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.temporal.m
    /* renamed from: Z */
    public final r d(long j3, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
            p pVar = this.f6479a;
            pVar.H(aVar).b(j3, aVar);
            int i3 = (int) j3;
            int i4 = q.f6478a[aVar.ordinal()];
            int i5 = this.f6482d;
            int i6 = this.f6481c;
            int i7 = this.f6480b;
            switch (i4) {
                case 1:
                    return Y(i7, i6, i3);
                case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                    return P(Math.min(i3, T()) - S());
                case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                    return P((j3 - v(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
                case N.k.LONG_FIELD_NUMBER /* 4 */:
                    return P(j3 - (((int) j$.com.android.tools.r8.a.i(w() + 3, 7)) + 1));
                case N.k.STRING_FIELD_NUMBER /* 5 */:
                    return P(j3 - v(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
                case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    return P(j3 - v(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
                case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    return new r(pVar, j3);
                case N.k.BYTES_FIELD_NUMBER /* 8 */:
                    return P((j3 - v(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
                case 9:
                    return Y(i7, i3, i5);
                case 10:
                    return Q(j3 - (((i7 * 12) + i6) - 1));
                case 11:
                    if (i7 < 1) {
                        i3 = 1 - i3;
                    }
                    return Y(i3, i6, i5);
                case 12:
                    return Y(i3, i6, i5);
                case 13:
                    return Y(1 - i7, i6, i5);
                default:
                    throw new RuntimeException(j$.time.d.a("Unsupported field: ", sVar));
            }
        }
        return (r) super.d(j3, sVar);
    }

    private r Y(int i3, int i4, int i5) {
        p pVar = this.f6479a;
        int U3 = pVar.U(i3, i4);
        if (i5 > U3) {
            i5 = U3;
        }
        return new r(pVar, i3, i4, i5);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b
    public final InterfaceC0328b j(j$.time.temporal.o oVar) {
        return (r) super.q(oVar);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.temporal.m
    public final j$.time.temporal.m q(j$.time.g gVar) {
        return (r) super.q(gVar);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b
    public final InterfaceC0328b F(j$.time.temporal.r rVar) {
        return (r) super.F(rVar);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b
    public final long w() {
        return this.f6479a.S(this.f6480b, this.f6481c, this.f6482d);
    }

    private int S() {
        return this.f6479a.R(this.f6480b, this.f6481c) + this.f6482d;
    }

    @Override // j$.time.chrono.AbstractC0330d
    final InterfaceC0328b R(long j3) {
        if (j3 == 0) {
            return this;
        }
        long j4 = this.f6480b + ((int) j3);
        int i3 = (int) j4;
        if (j4 == i3) {
            return Y(i3, this.f6481c, this.f6482d);
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC0330d
    /* renamed from: X */
    public final r Q(long j3) {
        if (j3 == 0) {
            return this;
        }
        long j4 = (this.f6480b * 12) + (this.f6481c - 1) + j3;
        return Y(this.f6479a.P(j$.com.android.tools.r8.a.d(j4, 12L)), ((int) j$.com.android.tools.r8.a.i(j4, 12L)) + 1, this.f6482d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC0330d
    /* renamed from: W */
    public final r P(long j3) {
        return new r(this.f6479a, w() + j3);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b, j$.time.temporal.m
    public final InterfaceC0328b e(long j3, j$.time.temporal.u uVar) {
        return (r) super.e(j3, uVar);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j3, j$.time.temporal.u uVar) {
        return (r) super.e(j3, uVar);
    }

    @Override // j$.time.chrono.AbstractC0330d
    public final InterfaceC0328b O(long j3, j$.time.temporal.u uVar) {
        return (r) super.m(j3, uVar);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.temporal.m
    public final j$.time.temporal.m m(long j3, j$.time.temporal.b bVar) {
        return (r) super.m(j3, bVar);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return this.f6480b == rVar.f6480b && this.f6481c == rVar.f6481c && this.f6482d == rVar.f6482d && this.f6479a.equals(rVar.f6479a);
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b
    public final int hashCode() {
        int hashCode = this.f6479a.l().hashCode();
        int i3 = this.f6480b;
        return (hashCode ^ (i3 & (-2048))) ^ (((i3 << 11) + (this.f6481c << 6)) + this.f6482d);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b
    public final InterfaceC0331e y(j$.time.k kVar) {
        return C0333g.O(this, kVar);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 6, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f6479a);
        objectOutput.writeInt(j$.time.temporal.n.a(this, j$.time.temporal.a.YEAR));
        objectOutput.writeByte(j$.time.temporal.n.a(this, j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(j$.time.temporal.n.a(this, j$.time.temporal.a.DAY_OF_MONTH));
    }
}
