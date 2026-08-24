package b0;

import R.C0099b;
import R.C0118v;
import R.C0122z;
import R.Q;
import R.T;
import U.A;
import U.AbstractC0123a;
import c0.C0223c;
/* loaded from: classes.dex */
public final class e extends T {

    /* renamed from: b  reason: collision with root package name */
    public final long f4545b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4546c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4547d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4548e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4549f;

    /* renamed from: g  reason: collision with root package name */
    public final long f4550g;

    /* renamed from: h  reason: collision with root package name */
    public final long f4551h;

    /* renamed from: i  reason: collision with root package name */
    public final C0223c f4552i;

    /* renamed from: j  reason: collision with root package name */
    public final C0122z f4553j;

    /* renamed from: k  reason: collision with root package name */
    public final C0118v f4554k;

    public e(long j3, long j4, long j5, int i3, long j6, long j7, long j8, C0223c c0223c, C0122z c0122z, C0118v c0118v) {
        boolean z3;
        boolean z4 = c0223c.f4716d;
        if (c0118v != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z4 == z3);
        this.f4545b = j3;
        this.f4546c = j4;
        this.f4547d = j5;
        this.f4548e = i3;
        this.f4549f = j6;
        this.f4550g = j7;
        this.f4551h = j8;
        this.f4552i = c0223c;
        this.f4553j = c0122z;
        this.f4554k = c0118v;
    }

    @Override // R.T
    public final int b(Object obj) {
        int intValue;
        if (!(obj instanceof Integer) || (intValue = ((Integer) obj).intValue() - this.f4548e) < 0 || intValue >= h()) {
            return -1;
        }
        return intValue;
    }

    @Override // R.T
    public final Q f(int i3, Q q3, boolean z3) {
        String str;
        AbstractC0123a.g(i3, h());
        Integer num = null;
        C0223c c0223c = this.f4552i;
        if (z3) {
            str = c0223c.b(i3).f4745a;
        } else {
            str = null;
        }
        if (z3) {
            num = Integer.valueOf(this.f4548e + i3);
        }
        q3.getClass();
        q3.h(str, num, 0, c0223c.d(i3), A.M(c0223c.b(i3).f4746b - c0223c.b(0).f4746b) - this.f4549f, C0099b.f1875c, false);
        return q3;
    }

    @Override // R.T
    public final int h() {
        return this.f4552i.f4725m.size();
    }

    @Override // R.T
    public final Object l(int i3) {
        AbstractC0123a.g(i3, h());
        return Integer.valueOf(this.f4548e + i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r7 > r21.f4550g) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    @Override // R.T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final R.S m(int r22, R.S r23, long r24) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.e.m(int, R.S, long):R.S");
    }

    @Override // R.T
    public final int o() {
        return 1;
    }
}
