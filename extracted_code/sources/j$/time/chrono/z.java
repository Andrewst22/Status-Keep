package j$.time.chrono;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
/* loaded from: classes2.dex */
public final class z implements n, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final z f6493d;

    /* renamed from: e  reason: collision with root package name */
    private static final z[] f6494e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* renamed from: a  reason: collision with root package name */
    private final transient int f6495a;

    /* renamed from: b  reason: collision with root package name */
    private final transient j$.time.g f6496b;

    /* renamed from: c  reason: collision with root package name */
    private final transient String f6497c;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean f(j$.time.temporal.s sVar) {
        return AbstractC0335i.j(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int o(j$.time.temporal.s sVar) {
        return AbstractC0335i.f(this, (j$.time.temporal.a) sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long v(j$.time.temporal.s sVar) {
        return AbstractC0335i.g(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object z(j$.time.temporal.t tVar) {
        return AbstractC0335i.n(this, tVar);
    }

    static {
        z zVar = new z(-1, j$.time.g.a0(1868, 1, 1), "Meiji");
        f6493d = zVar;
        z zVar2 = new z(0, j$.time.g.a0(1912, 7, 30), "Taisho");
        z zVar3 = new z(1, j$.time.g.a0(1926, 12, 25), "Showa");
        z zVar4 = new z(2, j$.time.g.a0(1989, 1, 8), "Heisei");
        z zVar5 = new z(3, j$.time.g.a0(2019, 5, 1), "Reiwa");
        f6494e = r8;
        z[] zVarArr = {zVar, zVar2, zVar3, zVar4, zVar5};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z k() {
        z[] zVarArr = f6494e;
        return zVarArr[zVarArr.length - 1];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long x() {
        int V3 = 1000000000 - k().f6496b.V();
        z[] zVarArr = f6494e;
        int V4 = zVarArr[0].f6496b.V();
        for (int i3 = 1; i3 < zVarArr.length; i3++) {
            z zVar = zVarArr[i3];
            V3 = Math.min(V3, (zVar.f6496b.V() - V4) + 1);
            V4 = zVar.f6496b.V();
        }
        return V3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long u() {
        z[] zVarArr;
        long f3 = j$.time.temporal.a.DAY_OF_YEAR.m().f();
        for (z zVar : f6494e) {
            f3 = Math.min(f3, ((zVar.f6496b.X() ? 366 : 365) - zVar.f6496b.T()) + 1);
            if (zVar.p() != null) {
                f3 = Math.min(f3, zVar.p().f6496b.T() - 1);
            }
        }
        return f3;
    }

    private z(int i3, j$.time.g gVar, String str) {
        this.f6495a = i3;
        this.f6496b = gVar;
        this.f6497c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.time.g l() {
        return this.f6496b;
    }

    public static z s(int i3) {
        int i4 = i3 + 1;
        if (i4 >= 0) {
            z[] zVarArr = f6494e;
            if (i4 < zVarArr.length) {
                return zVarArr[i4];
            }
        }
        throw new RuntimeException("Invalid era: " + i3);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return mVar.d(getValue(), j$.time.temporal.a.ERA);
    }

    public static z[] E() {
        z[] zVarArr = f6494e;
        return (z[]) Arrays.copyOf(zVarArr, zVarArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z g(j$.time.g gVar) {
        if (gVar.W(y.f6489d)) {
            throw new RuntimeException("JapaneseDate before Meiji 6 are not supported");
        }
        z[] zVarArr = f6494e;
        for (int length = zVarArr.length - 1; length >= 0; length--) {
            z zVar = zVarArr[length];
            if (gVar.compareTo(zVar.f6496b) >= 0) {
                return zVar;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return this.f6495a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w r(j$.time.temporal.s sVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (sVar != aVar) {
            return j$.time.temporal.n.d(this, sVar);
        }
        return w.f6487d.H(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final z p() {
        if (this == k()) {
            return null;
        }
        return s(this.f6495a + 1);
    }

    public final String toString() {
        return this.f6497c;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 5, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void G(DataOutput dataOutput) {
        dataOutput.writeByte(this.f6495a);
    }
}
