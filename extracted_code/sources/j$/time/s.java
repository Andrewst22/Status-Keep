package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class s implements j$.time.temporal.r, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final s f6601d = new s(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* renamed from: a  reason: collision with root package name */
    private final int f6602a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6603b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6604c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.com.android.tools.r8.a.e(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    public static s b(int i3) {
        if (i3 == 0) {
            return f6601d;
        }
        return new s(0, 0, i3);
    }

    private s(int i3, int i4, int i5) {
        this.f6602a = i3;
        this.f6603b = i4;
        this.f6604c = i5;
    }

    public final int a() {
        return this.f6604c;
    }

    public final long d() {
        return (this.f6602a * 12) + this.f6603b;
    }

    @Override // j$.time.temporal.r
    public final j$.time.temporal.m m(j$.time.temporal.m mVar) {
        j$.time.chrono.m mVar2 = (j$.time.chrono.m) mVar.z(j$.time.temporal.n.e());
        if (mVar2 == null || j$.time.chrono.t.f6484d.equals(mVar2)) {
            if (this.f6603b == 0) {
                int i3 = this.f6602a;
                if (i3 != 0) {
                    mVar = mVar.e(i3, j$.time.temporal.b.YEARS);
                }
            } else {
                long d3 = d();
                if (d3 != 0) {
                    mVar = mVar.e(d3, j$.time.temporal.b.MONTHS);
                }
            }
            int i4 = this.f6604c;
            return i4 != 0 ? mVar.e(i4, j$.time.temporal.b.DAYS) : mVar;
        }
        String l3 = mVar2.l();
        throw new RuntimeException("Chronology mismatch, expected: ISO, actual: " + l3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return this.f6602a == sVar.f6602a && this.f6603b == sVar.f6603b && this.f6604c == sVar.f6604c;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f6604c, 16) + Integer.rotateLeft(this.f6603b, 8) + this.f6602a;
    }

    public final String toString() {
        if (this == f6601d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i3 = this.f6602a;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('Y');
        }
        int i4 = this.f6603b;
        if (i4 != 0) {
            sb.append(i4);
            sb.append('M');
        }
        int i5 = this.f6604c;
        if (i5 != 0) {
            sb.append(i5);
            sb.append('D');
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new t((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeInt(this.f6602a);
        objectOutput.writeInt(this.f6603b);
        objectOutput.writeInt(this.f6604c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s c(ObjectInput objectInput) {
        int readInt = objectInput.readInt();
        int readInt2 = objectInput.readInt();
        int readInt3 = objectInput.readInt();
        if ((readInt | readInt2 | readInt3) == 0) {
            return f6601d;
        }
        return new s(readInt, readInt2, readInt3);
    }
}
