package w0;
/* loaded from: classes.dex */
public final class B {

    /* renamed from: c  reason: collision with root package name */
    public static final B f9508c = new B(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f9509a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9510b;

    public B(long j3, long j4) {
        this.f9509a = j3;
        this.f9510b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || B.class != obj.getClass()) {
            return false;
        }
        B b3 = (B) obj;
        if (this.f9509a == b3.f9509a && this.f9510b == b3.f9510b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f9509a) * 31) + ((int) this.f9510b);
    }

    public final String toString() {
        return "[timeUs=" + this.f9509a + ", position=" + this.f9510b + "]";
    }
}
