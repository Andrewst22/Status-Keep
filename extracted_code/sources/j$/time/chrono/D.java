package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class D extends AbstractC0330d {
    private static final long serialVersionUID = 1300372329181994526L;

    /* renamed from: a  reason: collision with root package name */
    private final transient j$.time.g f6439a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D(j$.time.g gVar) {
        Objects.requireNonNull(gVar, "isoDate");
        this.f6439a = gVar;
    }

    @Override // j$.time.chrono.InterfaceC0328b
    public final m a() {
        return B.f6437d;
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b
    public final int hashCode() {
        B.f6437d.getClass();
        return this.f6439a.hashCode() ^ (-1990173233);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b
    public final n B() {
        return S() >= 1 ? E.ROC : E.BEFORE_ROC;
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w r(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            if (AbstractC0335i.i(this, sVar)) {
                j$.time.temporal.a aVar = (j$.time.temporal.a) sVar;
                int i3 = C.f6438a[aVar.ordinal()];
                if (i3 == 1 || i3 == 2 || i3 == 3) {
                    return this.f6439a.r(sVar);
                }
                if (i3 == 4) {
                    j$.time.temporal.w m3 = j$.time.temporal.a.YEAR.m();
                    return j$.time.temporal.w.j(1L, S() <= 0 ? (-m3.e()) + 1912 : m3.d() - 1911);
                }
                return B.f6437d.H(aVar);
            }
            throw new RuntimeException(j$.time.d.a("Unsupported field: ", sVar));
        }
        return sVar.z(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long v(j$.time.temporal.s sVar) {
        if (sVar instanceof j$.time.temporal.a) {
            int i3 = C.f6438a[((j$.time.temporal.a) sVar).ordinal()];
            if (i3 == 4) {
                int S3 = S();
                if (S3 < 1) {
                    S3 = 1 - S3;
                }
                return S3;
            }
            j$.time.g gVar = this.f6439a;
            if (i3 != 5) {
                if (i3 != 6) {
                    if (i3 != 7) {
                        return gVar.v(sVar);
                    }
                    return S() < 1 ? 0 : 1;
                }
                return S();
            }
            return ((S() * 12) + gVar.U()) - 1;
        }
        return sVar.q(this);
    }

    private int S() {
        return this.f6439a.V() - 1911;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r2 != 7) goto L13;
     */
    @Override // j$.time.chrono.AbstractC0330d, j$.time.temporal.m
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.chrono.D d(long r9, j$.time.temporal.s r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.a
            if (r0 == 0) goto L9a
            r0 = r11
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r8.v(r0)
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 != 0) goto L10
            return r8
        L10:
            int[] r1 = j$.time.chrono.C.f6438a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            j$.time.g r3 = r8.f6439a
            r4 = 7
            r5 = 6
            r6 = 4
            if (r2 == r6) goto L4c
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L4c
            goto L62
        L27:
            j$.time.chrono.B r11 = j$.time.chrono.B.f6437d
            j$.time.temporal.w r11 = r11.H(r0)
            r11.b(r9, r0)
            int r11 = r8.S()
            long r0 = (long) r11
            r4 = 12
            long r0 = r0 * r4
            int r11 = r3.U()
            long r4 = (long) r11
            long r0 = r0 + r4
            r4 = 1
            long r0 = r0 - r4
            long r9 = r9 - r0
            j$.time.g r9 = r3.g0(r9)
            j$.time.chrono.D r9 = r8.U(r9)
            return r9
        L4c:
            j$.time.chrono.B r2 = j$.time.chrono.B.f6437d
            j$.time.temporal.w r2 = r2.H(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L85
            if (r0 == r5) goto L7a
            if (r0 == r4) goto L6b
        L62:
            j$.time.g r9 = r3.d(r9, r11)
            j$.time.chrono.D r9 = r8.U(r9)
            return r9
        L6b:
            int r9 = r8.S()
            int r9 = 1912 - r9
            j$.time.g r9 = r3.n0(r9)
            j$.time.chrono.D r9 = r8.U(r9)
            return r9
        L7a:
            int r2 = r2 + 1911
            j$.time.g r9 = r3.n0(r2)
            j$.time.chrono.D r9 = r8.U(r9)
            return r9
        L85:
            int r9 = r8.S()
            r10 = 1
            if (r9 < r10) goto L8f
            int r2 = r2 + 1911
            goto L91
        L8f:
            int r2 = 1912 - r2
        L91:
            j$.time.g r9 = r3.n0(r2)
            j$.time.chrono.D r9 = r8.U(r9)
            return r9
        L9a:
            j$.time.chrono.b r9 = super.d(r9, r11)
            j$.time.chrono.D r9 = (j$.time.chrono.D) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.D.d(long, j$.time.temporal.s):j$.time.chrono.D");
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b
    public final InterfaceC0328b j(j$.time.temporal.o oVar) {
        return (D) super.q(oVar);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.temporal.m
    public final j$.time.temporal.m q(j$.time.g gVar) {
        return (D) super.q(gVar);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b
    public final InterfaceC0328b F(j$.time.temporal.r rVar) {
        return (D) super.F(rVar);
    }

    @Override // j$.time.chrono.AbstractC0330d
    final InterfaceC0328b R(long j3) {
        return U(this.f6439a.i0(j3));
    }

    @Override // j$.time.chrono.AbstractC0330d
    final InterfaceC0328b Q(long j3) {
        return U(this.f6439a.g0(j3));
    }

    @Override // j$.time.chrono.AbstractC0330d
    final InterfaceC0328b P(long j3) {
        return U(this.f6439a.f0(j3));
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b, j$.time.temporal.m
    public final InterfaceC0328b e(long j3, j$.time.temporal.u uVar) {
        return (D) super.e(j3, uVar);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.temporal.m
    public final j$.time.temporal.m e(long j3, j$.time.temporal.u uVar) {
        return (D) super.e(j3, uVar);
    }

    @Override // j$.time.chrono.AbstractC0330d
    public final InterfaceC0328b O(long j3, j$.time.temporal.u uVar) {
        return (D) super.m(j3, uVar);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.temporal.m
    public final j$.time.temporal.m m(long j3, j$.time.temporal.b bVar) {
        return (D) super.m(j3, bVar);
    }

    private D U(j$.time.g gVar) {
        return gVar.equals(this.f6439a) ? this : new D(gVar);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b
    public final long w() {
        return this.f6439a.w();
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            return this.f6439a.equals(((D) obj).f6439a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 7, this);
    }

    @Override // j$.time.chrono.AbstractC0330d, j$.time.chrono.InterfaceC0328b
    public final InterfaceC0331e y(j$.time.k kVar) {
        return C0333g.O(this, kVar);
    }
}
