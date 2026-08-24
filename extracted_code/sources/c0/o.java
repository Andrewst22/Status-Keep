package c0;

import java.util.List;
/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: j  reason: collision with root package name */
    public final List f4772j;

    public o(j jVar, long j3, long j4, long j5, long j6, List list, long j7, List list2, long j8, long j9) {
        super(jVar, j3, j4, j5, j6, list, j7, j8, j9);
        this.f4772j = list2;
    }

    @Override // c0.n
    public final long d(long j3) {
        return this.f4772j.size();
    }

    @Override // c0.n
    public final j h(k kVar, long j3) {
        return (j) this.f4772j.get((int) (j3 - this.f4766d));
    }

    @Override // c0.n
    public final boolean i() {
        return true;
    }
}
