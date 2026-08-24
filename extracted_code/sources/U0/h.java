package U0;
/* loaded from: classes.dex */
public final class h extends T0.i implements Comparable {

    /* renamed from: w  reason: collision with root package name */
    public long f2572w;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        if (c(4) != hVar.c(4)) {
            if (!c(4)) {
                return -1;
            }
        } else {
            long j3 = this.f2936s - hVar.f2936s;
            if (j3 == 0) {
                j3 = this.f2572w - hVar.f2572w;
                if (j3 == 0) {
                    return 0;
                }
            }
            if (j3 <= 0) {
                return -1;
            }
        }
        return 1;
    }
}
