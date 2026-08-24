package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
/* loaded from: classes2.dex */
public final class y extends AbstractC0330d {

    /* renamed from: d  reason: collision with root package name */
    static final j$.time.g f6489d = j$.time.g.a0(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* renamed from: a  reason: collision with root package name */
    private final transient j$.time.g f6490a;

    /* renamed from: b  reason: collision with root package name */
    private transient z f6491b;

    /* renamed from: c  reason: collision with root package name */
    private transient int f6492c;

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b
    public final n B() {
        return this.f6491b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(j$.time.g gVar) {
        if (gVar.W(f6489d)) {
            throw new RuntimeException("JapaneseDate before Meiji 6 is not supported");
        }
        z g3 = z.g(gVar);
        this.f6491b = g3;
        this.f6492c = (gVar.V() - g3.l().V()) + 1;
        this.f6490a = gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(z zVar, int i3, j$.time.g gVar) {
        if (gVar.W(f6489d)) {
            throw new RuntimeException("JapaneseDate before Meiji 6 is not supported");
        }
        this.f6491b = zVar;
        this.f6492c = i3;
        this.f6490a = gVar;
    }

    @Override // j$.time.chrono.InterfaceC0328b
    public final m a() {
        return w.f6487d;
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b
    public final int hashCode() {
        w.f6487d.getClass();
        return this.f6490a.hashCode() ^ (-688086063);
    }

    public final z S() {
        return this.f6491b;
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b, j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || sVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || sVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || sVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (sVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) sVar).A();
        }
        return sVar != null && sVar.r(this);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w r(j$.time.temporal.s sVar) {
        int i3;
        if (sVar instanceof j$.time.temporal.a) {
            if (f(sVar)) {
                j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
                int i4 = x.f6488a[aVar.ordinal()];
                j$.time.g gVar = this.f6490a;
                if (i4 != 1) {
                    z zVar = this.f6491b;
                    if (i4 != 2) {
                        if (i4 == 3) {
                            int V3 = zVar.l().V();
                            z p3 = zVar.p();
                            if (p3 != null) {
                                return j$.time.temporal.w.j(1L, (p3.l().V() - V3) + 1);
                            }
                            return j$.time.temporal.w.j(1L, 999999999 - V3);
                        }
                        return w.f6487d.H(aVar);
                    }
                    z p4 = zVar.p();
                    if (p4 != null && p4.l().V() == gVar.V()) {
                        i3 = p4.l().T() - 1;
                    } else {
                        i3 = gVar.X() ? 366 : 365;
                    }
                    if (this.f6492c == 1) {
                        i3 -= zVar.l().T() - 1;
                    }
                    return j$.time.temporal.w.j(1L, i3);
                }
                return j$.time.temporal.w.j(1L, gVar.Y());
            }
            throw new RuntimeException(j$.time.d.a("Unsupported field: ", sVar));
        }
        return sVar.z(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            int i3 = x.f6488a[((j$.time.temporal.a) sVar).ordinal()];
            int i4 = this.f6492c;
            z zVar = this.f6491b;
            j$.time.g gVar = this.f6490a;
            switch (i3) {
                case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                    if (i4 == 1) {
                        return (gVar.T() - zVar.l().T()) + 1;
                    }
                    return gVar.T();
                case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                    return i4;
                case N.k.LONG_FIELD_NUMBER /* 4 */:
                case N.k.STRING_FIELD_NUMBER /* 5 */:
                case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    throw new RuntimeException(j$.time.d.a("Unsupported field: ", sVar));
                case N.k.BYTES_FIELD_NUMBER /* 8 */:
                    return zVar.getValue();
                default:
                    return gVar.v(sVar);
            }
        }
        return sVar.q(this);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.temporal.m
    /* renamed from: U */
    public final y d(long j3, j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
            if (v(aVar) == j3) {
                return this;
            }
            int[] iArr = x.f6488a;
            int i3 = iArr[aVar.ordinal()];
            j$.time.g gVar = this.f6490a;
            if (i3 == 3 || i3 == 8 || i3 == 9) {
                w wVar = w.f6487d;
                int a3 = wVar.H(aVar).a(j3, aVar);
                int i4 = iArr[aVar.ordinal()];
                if (i4 == 3) {
                    return V(gVar.n0(wVar.g(this.f6491b, a3)));
                }
                if (i4 == 8) {
                    return V(gVar.n0(wVar.g(z.s(a3), this.f6492c)));
                }
                if (i4 == 9) {
                    return V(gVar.n0(a3));
                }
            }
            return V(gVar.d(j3, sVar));
        }
        return (y) super.d(j3, sVar);
    }

    public final y W(j$.time.temporal.q qVar) {
        return (y) super.q(qVar);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b
    public final InterfaceC0328b j(j$.time.temporal.o oVar) {
        return (y) super.q(oVar);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.temporal.m
    public final j$.time.temporal.m q(j$.time.g gVar) {
        return (y) super.q(gVar);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b
    public final InterfaceC0328b F(j$.time.temporal.r rVar) {
        return (y) super.F(rVar);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b
    public final InterfaceC0331e y(j$.time.k kVar) {
        return C0333g.O(this, kVar);
    }

    @Override // j$.time.chrono.AbstractC0330d
    final InterfaceC0328b R(long j3) {
        return V(this.f6490a.i0(j3));
    }

    @Override // j$.time.chrono.AbstractC0330d
    final InterfaceC0328b Q(long j3) {
        return V(this.f6490a.g0(j3));
    }

    @Override // j$.time.chrono.AbstractC0330d
    final InterfaceC0328b P(long j3) {
        return V(this.f6490a.f0(j3));
    }

    public final y T(long j3, j$.time.temporal.b bVar) {
        return (y) super.e(j3, (j$.time.temporal.u) bVar);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b, j$.time.temporal.m
    public final InterfaceC0328b e(long j3, j$.time.temporal.u uVar) {
        return (y) super.e(j3, uVar);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j3, j$.time.temporal.u uVar) {
        return (y) super.e(j3, uVar);
    }

    @Override // j$.time.chrono.AbstractC0330d
    public final InterfaceC0328b O(long j3, j$.time.temporal.u uVar) {
        return (y) super.m(j3, uVar);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.temporal.m
    public final j$.time.temporal.m m(long j3, j$.time.temporal.b bVar) {
        return (y) super.m(j3, bVar);
    }

    private y V(j$.time.g gVar) {
        return gVar.equals(this.f6490a) ? this : new y(gVar);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b
    public final long w() {
        return this.f6490a.w();
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.f6490a.equals(((y) obj).f6490a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 4, this);
    }
}
