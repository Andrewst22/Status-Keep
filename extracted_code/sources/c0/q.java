package c0;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final long f4776a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4777b;

    public q(long j3, long j4) {
        this.f4776a = j3;
        this.f4777b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f4776a == qVar.f4776a && this.f4777b == qVar.f4777b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f4776a) * 31) + ((int) this.f4777b);
    }
}
