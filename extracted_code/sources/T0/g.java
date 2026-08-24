package T0;
/* loaded from: classes.dex */
public final class g implements Comparable {

    /* renamed from: m  reason: collision with root package name */
    public final long f2308m;

    /* renamed from: n  reason: collision with root package name */
    public final byte[] f2309n;

    public g(long j3, byte[] bArr) {
        this.f2308m = j3;
        this.f2309n = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f2308m, ((g) obj).f2308m);
    }
}
