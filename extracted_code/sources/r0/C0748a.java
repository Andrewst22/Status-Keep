package r0;
/* renamed from: r0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0748a {

    /* renamed from: a  reason: collision with root package name */
    public final long f8887a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8888b;

    public C0748a(long j3, long j4) {
        this.f8887a = j3;
        this.f8888b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0748a)) {
            return false;
        }
        C0748a c0748a = (C0748a) obj;
        if (this.f8887a == c0748a.f8887a && this.f8888b == c0748a.f8888b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f8887a) * 31) + ((int) this.f8888b);
    }
}
