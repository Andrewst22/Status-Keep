package T0;

import C.C0002c;
import D1.C0038q;
import D1.I;
import D1.Z;
import U.A;
import U.AbstractC0123a;
import java.util.List;
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: o  reason: collision with root package name */
    public static final C0038q f2301o;

    /* renamed from: m  reason: collision with root package name */
    public final I f2302m;

    /* renamed from: n  reason: collision with root package name */
    public final long[] f2303n;

    static {
        Z z3 = Z.f224m;
        C0002c c0002c = new C0002c(7);
        z3.getClass();
        f2301o = new C0038q(c0002c, z3);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(D1.b0 r20) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.b.<init>(D1.b0):void");
    }

    @Override // T0.d
    public final List A(long j3) {
        int f3 = A.f(this.f2303n, j3, false);
        if (f3 == -1) {
            return I.m();
        }
        return (I) this.f2302m.get(f3);
    }

    @Override // T0.d
    public final long F(int i3) {
        boolean z3;
        if (i3 < this.f2302m.size()) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        return this.f2303n[i3];
    }

    @Override // T0.d
    public final int P() {
        return this.f2302m.size();
    }

    @Override // T0.d
    public final int g(long j3) {
        int b3 = A.b(this.f2303n, j3, false);
        if (b3 >= this.f2302m.size()) {
            return -1;
        }
        return b3;
    }
}
