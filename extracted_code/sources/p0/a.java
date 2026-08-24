package P0;

import w0.k;
/* loaded from: classes.dex */
public final class a extends k implements f {

    /* renamed from: h  reason: collision with root package name */
    public final int f1422h;

    /* renamed from: i  reason: collision with root package name */
    public final long f1423i;

    public a(long j3, long j4, int i3, int i4, boolean z3) {
        super(j3, j4, i3, i4, z3);
        this.f1422h = i3;
        this.f1423i = j3 == -1 ? -1L : j3;
    }

    @Override // P0.f
    public final long a(long j3) {
        return (Math.max(0L, j3 - this.f9599b) * 8000000) / this.f9602e;
    }

    @Override // P0.f
    public final long g() {
        return this.f1423i;
    }

    @Override // P0.f
    public final int j() {
        return this.f1422h;
    }
}
