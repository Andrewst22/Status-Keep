package o0;

import R.C0099b;
import R.C0117u;
import R.C0118v;
import R.C0119w;
import R.C0120x;
import R.C0122z;
import U.AbstractC0123a;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class Y extends R.T {

    /* renamed from: n  reason: collision with root package name */
    public static final Object f8553n = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final long f8554b;

    /* renamed from: c  reason: collision with root package name */
    public final long f8555c;

    /* renamed from: d  reason: collision with root package name */
    public final long f8556d;

    /* renamed from: e  reason: collision with root package name */
    public final long f8557e;

    /* renamed from: f  reason: collision with root package name */
    public final long f8558f;

    /* renamed from: g  reason: collision with root package name */
    public final long f8559g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f8560h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f8561i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f8562j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f8563k;

    /* renamed from: l  reason: collision with root package name */
    public final C0122z f8564l;

    /* renamed from: m  reason: collision with root package name */
    public final C0118v f8565m;

    static {
        R.r rVar = new R.r();
        D1.G g3 = D1.I.f197n;
        D1.b0 b0Var = D1.b0.f231q;
        List emptyList = Collections.emptyList();
        D1.b0 b0Var2 = D1.b0.f231q;
        C0117u c0117u = new C0117u();
        C0120x c0120x = C0120x.f2006a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new C0119w(uri, null, null, emptyList, b0Var2, -9223372036854775807L);
        }
        rVar.a();
        c0117u.a();
        R.C c3 = R.C.f1745y;
    }

    public Y(long j3, boolean z3, boolean z4, C0122z c0122z) {
        this(j3, j3, 0L, 0L, z3, false, z4, null, c0122z);
    }

    @Override // R.T
    public final int b(Object obj) {
        if (f8553n.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override // R.T
    public final R.Q f(int i3, R.Q q3, boolean z3) {
        Object obj;
        AbstractC0123a.g(i3, 1);
        if (z3) {
            obj = f8553n;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        q3.getClass();
        C0099b c0099b = C0099b.f1875c;
        q3.h(null, obj2, 0, this.f8556d, -this.f8558f, c0099b, false);
        return q3;
    }

    @Override // R.T
    public final int h() {
        return 1;
    }

    @Override // R.T
    public final Object l(int i3) {
        AbstractC0123a.g(i3, 1);
        return f8553n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r1 > r5) goto L9;
     */
    @Override // R.T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final R.S m(int r23, R.S r24, long r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = 1
            r2 = r23
            U.AbstractC0123a.g(r2, r1)
            long r1 = r0.f8559g
            boolean r13 = r0.f8561i
            if (r13 == 0) goto L2c
            boolean r3 = r0.f8562j
            if (r3 != 0) goto L2c
            r3 = 0
            int r5 = (r25 > r3 ? 1 : (r25 == r3 ? 0 : -1))
            if (r5 == 0) goto L2c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r5 = r0.f8557e
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L25
        L23:
            r15 = r3
            goto L2d
        L25:
            long r1 = r1 + r25
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L2c
            goto L23
        L2c:
            r15 = r1
        L2d:
            java.lang.Object r1 = R.S.f1802q
            R.v r14 = r0.f8565m
            long r1 = r0.f8557e
            r17 = r1
            R.z r4 = r0.f8564l
            java.lang.Object r5 = r0.f8563k
            long r6 = r0.f8554b
            long r8 = r0.f8555c
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r12 = r0.f8560h
            r19 = 0
            long r1 = r0.f8558f
            r20 = r1
            r3 = r24
            r3.b(r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.Y.m(int, R.S, long):R.S");
    }

    @Override // R.T
    public final int o() {
        return 1;
    }

    public Y(long j3, long j4, long j5, long j6, boolean z3, boolean z4, boolean z5, Object obj, C0122z c0122z) {
        this(-9223372036854775807L, -9223372036854775807L, j3, j4, j5, j6, z3, z4, false, obj, c0122z, z5 ? c0122z.f2009c : null);
    }

    public Y(long j3, long j4, long j5, long j6, long j7, long j8, boolean z3, boolean z4, boolean z5, Object obj, C0122z c0122z, C0118v c0118v) {
        this.f8554b = j3;
        this.f8555c = j4;
        this.f8556d = j5;
        this.f8557e = j6;
        this.f8558f = j7;
        this.f8559g = j8;
        this.f8560h = z3;
        this.f8561i = z4;
        this.f8562j = z5;
        this.f8563k = obj;
        c0122z.getClass();
        this.f8564l = c0122z;
        this.f8565m = c0118v;
    }
}
