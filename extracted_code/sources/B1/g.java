package b1;
/* loaded from: classes.dex */
public final class g implements Comparable {

    /* renamed from: m  reason: collision with root package name */
    public final int f4666m;

    /* renamed from: n  reason: collision with root package name */
    public final C0213c f4667n;

    public g(int i3, C0213c c0213c) {
        this.f4666m = i3;
        this.f4667n = c0213c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f4666m, ((g) obj).f4666m);
    }
}
