package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.math.BigInteger;
/* loaded from: classes2.dex */
public final class Duration implements j$.time.temporal.r, Comparable<Duration>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final Duration f6420c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* renamed from: a  reason: collision with root package name */
    private final long f6421a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6422b;

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int c3 = j$.com.android.tools.r8.a.c(this.f6421a, duration2.f6421a);
        return c3 != 0 ? c3 : this.f6422b - duration2.f6422b;
    }

    static {
        BigInteger.valueOf(1000000000L);
    }

    public static Duration v(long j3) {
        return o(j3, 0);
    }

    public static Duration z(long j3, long j4) {
        return o(j$.com.android.tools.r8.a.h(j3, j$.com.android.tools.r8.a.d(j4, 1000000000L)), (int) j$.com.android.tools.r8.a.i(j4, 1000000000L));
    }

    public static Duration ofMillis(long j3) {
        long j4 = j3 / 1000;
        int i3 = (int) (j3 % 1000);
        if (i3 < 0) {
            i3 += 1000;
            j4--;
        }
        return o(j4, i3 * 1000000);
    }

    private static Duration o(long j3, int i3) {
        if ((i3 | j3) == 0) {
            return f6420c;
        }
        return new Duration(j3, i3);
    }

    private Duration(long j3, int i3) {
        this.f6421a = j3;
        this.f6422b = i3;
    }

    public final long r() {
        return this.f6421a;
    }

    public final int q() {
        return this.f6422b;
    }

    @Override // j$.time.temporal.r
    public final j$.time.temporal.m m(j$.time.temporal.m mVar) {
        long j3 = this.f6421a;
        if (j3 != 0) {
            mVar = mVar.e(j3, j$.time.temporal.b.SECONDS);
        }
        int i3 = this.f6422b;
        return i3 != 0 ? mVar.e(i3, j$.time.temporal.b.NANOS) : mVar;
    }

    public long toMillis() {
        long j3 = this.f6422b;
        long j4 = this.f6421a;
        if (j4 < 0) {
            j4++;
            j3 -= 1000000000;
        }
        return j$.com.android.tools.r8.a.h(j$.com.android.tools.r8.a.g(j4, 1000), j3 / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            return this.f6421a == duration.f6421a && this.f6422b == duration.f6422b;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f6421a;
        return (this.f6422b * 51) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        if (this == f6420c) {
            return "PT0S";
        }
        long j3 = this.f6421a;
        int i3 = this.f6422b;
        long j4 = (j3 >= 0 || i3 <= 0) ? j3 : 1 + j3;
        long j5 = j4 / 3600;
        int i4 = (int) ((j4 % 3600) / 60);
        int i5 = (int) (j4 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j5 != 0) {
            sb.append(j5);
            sb.append('H');
        }
        if (i4 != 0) {
            sb.append(i4);
            sb.append('M');
        }
        if (i5 == 0 && i3 == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j3 >= 0 || i3 <= 0) {
            sb.append(i5);
        } else if (i5 == 0) {
            sb.append("-0");
        } else {
            sb.append(i5);
        }
        if (i3 > 0) {
            int length = sb.length();
            if (j3 < 0) {
                sb.append(2000000000 - i3);
            } else {
                sb.append(i3 + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    private Object writeReplace() {
        return new t((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeLong(this.f6421a);
        objectOutput.writeInt(this.f6422b);
    }
}
