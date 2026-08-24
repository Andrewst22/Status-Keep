package j$.time.temporal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
/* loaded from: classes2.dex */
public final class w implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* renamed from: a  reason: collision with root package name */
    private final long f6635a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6636b;

    /* renamed from: c  reason: collision with root package name */
    private final long f6637c;

    /* renamed from: d  reason: collision with root package name */
    private final long f6638d;

    public static w j(long j3, long j4) {
        if (j3 > j4) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new w(j3, j3, j4, j4);
    }

    public static w k(long j3, long j4) {
        if (j3 <= j4) {
            if (1 > j4) {
                throw new IllegalArgumentException("Minimum value must be less than maximum value");
            }
            return new w(1L, 1L, j3, j4);
        }
        throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
    }

    private w(long j3, long j4, long j5, long j6) {
        this.f6635a = j3;
        this.f6636b = j4;
        this.f6637c = j5;
        this.f6638d = j6;
    }

    public final boolean g() {
        return this.f6635a == this.f6636b && this.f6637c == this.f6638d;
    }

    public final long e() {
        return this.f6635a;
    }

    public final long f() {
        return this.f6637c;
    }

    public final long d() {
        return this.f6638d;
    }

    public final boolean h() {
        return this.f6635a >= -2147483648L && this.f6638d <= 2147483647L;
    }

    public final boolean i(long j3) {
        return j3 >= this.f6635a && j3 <= this.f6638d;
    }

    public final int a(long j3, s sVar) {
        if (h() && i(j3)) {
            return (int) j3;
        }
        throw new RuntimeException(c(j3, sVar));
    }

    public final void b(long j3, s sVar) {
        if (!i(j3)) {
            throw new RuntimeException(c(j3, sVar));
        }
    }

    private String c(long j3, s sVar) {
        if (sVar != null) {
            return "Invalid value for " + sVar + " (valid values " + this + "): " + j3;
        }
        return "Invalid value (valid values " + this + "): " + j3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        long j3 = this.f6635a;
        long j4 = this.f6636b;
        if (j3 > j4) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j5 = this.f6637c;
        long j6 = this.f6638d;
        if (j5 > j6) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j4 > j6) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            return this.f6635a == wVar.f6635a && this.f6636b == wVar.f6636b && this.f6637c == wVar.f6637c && this.f6638d == wVar.f6638d;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f6636b;
        long j4 = this.f6635a + (j3 << 16) + (j3 >> 48);
        long j5 = this.f6637c;
        long j6 = j4 + (j5 << 32) + (j5 >> 32);
        long j7 = this.f6638d;
        long j8 = j6 + (j7 << 48) + (j7 >> 16);
        return (int) ((j8 >>> 32) ^ j8);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j3 = this.f6635a;
        sb.append(j3);
        long j4 = this.f6636b;
        if (j3 != j4) {
            sb.append('/');
            sb.append(j4);
        }
        sb.append(" - ");
        long j5 = this.f6637c;
        sb.append(j5);
        long j6 = this.f6638d;
        if (j5 != j6) {
            sb.append('/');
            sb.append(j6);
        }
        return sb.toString();
    }
}
