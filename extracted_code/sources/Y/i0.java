package Y;

import R.C0099b;
import R.C0119w;
import R.C0122z;
import o0.AbstractC0692p;
/* loaded from: classes.dex */
public final class i0 extends AbstractC0692p {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3329c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final Object f3330d;

    public i0(R.T t3, C0122z c0122z) {
        super(t3);
        this.f3330d = c0122z;
    }

    @Override // o0.AbstractC0692p, R.T
    public R.Q f(int i3, R.Q q3, boolean z3) {
        switch (this.f3329c) {
            case 0:
                R.T t3 = this.f8627b;
                R.Q f3 = t3.f(i3, q3, z3);
                if (t3.m(f3.f1797c, (R.S) this.f3330d, 0L).a()) {
                    f3.h(q3.f1795a, q3.f1796b, q3.f1797c, q3.f1798d, q3.f1799e, C0099b.f1875c, true);
                } else {
                    f3.f1800f = true;
                }
                return f3;
            default:
                return super.f(i3, q3, z3);
        }
    }

    @Override // o0.AbstractC0692p, R.T
    public R.S m(int i3, R.S s3, long j3) {
        switch (this.f3329c) {
            case 1:
                super.m(i3, s3, j3);
                C0122z c0122z = (C0122z) this.f3330d;
                s3.f1806c = c0122z;
                C0119w c0119w = c0122z.f2008b;
                s3.getClass();
                return s3;
            default:
                return super.m(i3, s3, j3);
        }
    }

    public i0(R.T t3) {
        super(t3);
        this.f3330d = new R.S();
    }
}
