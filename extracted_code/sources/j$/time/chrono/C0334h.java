package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
/* renamed from: j$.time.chrono.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0334h implements j$.time.temporal.r, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f6455e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* renamed from: a  reason: collision with root package name */
    private final m f6456a;

    /* renamed from: b  reason: collision with root package name */
    final int f6457b;

    /* renamed from: c  reason: collision with root package name */
    final int f6458c;

    /* renamed from: d  reason: collision with root package name */
    final int f6459d;

    static {
        j$.com.android.tools.r8.a.e(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0334h(m mVar, int i3, int i4, int i5) {
        this.f6456a = mVar;
        this.f6457b = i3;
        this.f6458c = i4;
        this.f6459d = i5;
    }

    public final String toString() {
        m mVar = this.f6456a;
        int i3 = this.f6459d;
        int i4 = this.f6458c;
        int i5 = this.f6457b;
        if (i5 == 0 && i4 == 0 && i3 == 0) {
            String mVar2 = mVar.toString();
            return mVar2 + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mVar.toString());
        sb.append(" P");
        if (i5 != 0) {
            sb.append(i5);
            sb.append('Y');
        }
        if (i4 != 0) {
            sb.append(i4);
            sb.append('M');
        }
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.r
    public final j$.time.temporal.m m(j$.time.temporal.m mVar) {
        m mVar2 = (m) mVar.z(j$.time.temporal.n.e());
        m mVar3 = this.f6456a;
        if (mVar2 == null || mVar3.equals(mVar2)) {
            int i3 = this.f6457b;
            int i4 = this.f6458c;
            if (i4 != 0) {
                j$.time.temporal.w H3 = mVar3.H(j$.time.temporal.a.MONTH_OF_YEAR);
                long d3 = (H3.g() && H3.h()) ? (H3.d() - H3.e()) + 1 : -1L;
                if (d3 > 0) {
                    mVar = mVar.e((i3 * d3) + i4, j$.time.temporal.b.MONTHS);
                } else {
                    if (i3 != 0) {
                        mVar = mVar.e(i3, j$.time.temporal.b.YEARS);
                    }
                    mVar = mVar.e(i4, j$.time.temporal.b.MONTHS);
                }
            } else if (i3 != 0) {
                mVar = mVar.e(i3, j$.time.temporal.b.YEARS);
            }
            int i5 = this.f6459d;
            return i5 != 0 ? mVar.e(i5, j$.time.temporal.b.DAYS) : mVar;
        }
        String l3 = mVar3.l();
        String l4 = mVar2.l();
        throw new RuntimeException("Chronology mismatch, expected: " + l3 + ", actual: " + l4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0334h) {
            C0334h c0334h = (C0334h) obj;
            return this.f6457b == c0334h.f6457b && this.f6458c == c0334h.f6458c && this.f6459d == c0334h.f6459d && this.f6456a.equals(c0334h.f6456a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6456a.hashCode() ^ (Integer.rotateLeft(this.f6459d, 16) + (Integer.rotateLeft(this.f6458c, 8) + this.f6457b));
    }

    protected Object writeReplace() {
        return new F((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.f6456a.l());
        objectOutput.writeInt(this.f6457b);
        objectOutput.writeInt(this.f6458c);
        objectOutput.writeInt(this.f6459d);
    }
}
