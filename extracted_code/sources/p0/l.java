package p0;

import R.C0113p;
/* loaded from: classes.dex */
public abstract class l extends AbstractC0732e {

    /* renamed from: v  reason: collision with root package name */
    public final long f8823v;

    public l(W.h hVar, W.l lVar, C0113p c0113p, int i3, Object obj, long j3, long j4, long j5) {
        super(hVar, lVar, 1, c0113p, i3, obj, j3, j4);
        c0113p.getClass();
        this.f8823v = j5;
    }

    public long a() {
        long j3 = this.f8823v;
        if (j3 == -1) {
            return -1L;
        }
        return 1 + j3;
    }

    public abstract boolean d();
}
