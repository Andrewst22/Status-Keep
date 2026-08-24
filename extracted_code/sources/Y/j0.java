package Y;

import android.util.Pair;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class j0 extends R.T {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f3333k = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f3334b;

    /* renamed from: c  reason: collision with root package name */
    public final o0.X f3335c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3336d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3337e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f3338f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f3339g;

    /* renamed from: h  reason: collision with root package name */
    public final R.T[] f3340h;

    /* renamed from: i  reason: collision with root package name */
    public final Object[] f3341i;

    /* renamed from: j  reason: collision with root package name */
    public final HashMap f3342j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j0(java.util.List r7, o0.X r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            R.T[] r0 = new R.T[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = 0
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            Y.W r4 = (Y.W) r4
            int r5 = r3 + 1
            R.T r4 = r4.b()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            Y.W r3 = (Y.W) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.a()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.j0.<init>(java.util.List, o0.X):void");
    }

    @Override // R.T
    public final int a(boolean z3) {
        if (this.f3334b == 0) {
            return -1;
        }
        int i3 = 0;
        if (z3) {
            int[] iArr = this.f3335c.f8551b;
            if (iArr.length > 0) {
                i3 = iArr[0];
            } else {
                i3 = -1;
            }
        }
        do {
            R.T[] tArr = this.f3340h;
            if (tArr[i3].p()) {
                i3 = q(i3, z3);
            } else {
                return tArr[i3].a(z3) + this.f3339g[i3];
            }
        } while (i3 != -1);
        return -1;
    }

    @Override // R.T
    public final int b(Object obj) {
        int intValue;
        int b3;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f3342j.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        if (intValue == -1 || (b3 = this.f3340h[intValue].b(obj3)) == -1) {
            return -1;
        }
        return this.f3338f[intValue] + b3;
    }

    @Override // R.T
    public final int c(boolean z3) {
        int i3;
        int i4 = this.f3334b;
        if (i4 == 0) {
            return -1;
        }
        if (z3) {
            int[] iArr = this.f3335c.f8551b;
            if (iArr.length > 0) {
                i3 = iArr[iArr.length - 1];
            } else {
                i3 = -1;
            }
        } else {
            i3 = i4 - 1;
        }
        do {
            R.T[] tArr = this.f3340h;
            if (tArr[i3].p()) {
                i3 = r(i3, z3);
            } else {
                return tArr[i3].c(z3) + this.f3339g[i3];
            }
        } while (i3 != -1);
        return -1;
    }

    @Override // R.T
    public final int e(int i3, int i4, boolean z3) {
        int[] iArr = this.f3339g;
        int i5 = 0;
        int e2 = U.A.e(iArr, i3 + 1, false, false);
        int i6 = iArr[e2];
        R.T[] tArr = this.f3340h;
        R.T t3 = tArr[e2];
        int i7 = i3 - i6;
        if (i4 != 2) {
            i5 = i4;
        }
        int e3 = t3.e(i7, i5, z3);
        if (e3 != -1) {
            return i6 + e3;
        }
        int q3 = q(e2, z3);
        while (q3 != -1 && tArr[q3].p()) {
            q3 = q(q3, z3);
        }
        if (q3 != -1) {
            return tArr[q3].a(z3) + iArr[q3];
        } else if (i4 != 2) {
            return -1;
        } else {
            return a(z3);
        }
    }

    @Override // R.T
    public final R.Q f(int i3, R.Q q3, boolean z3) {
        int[] iArr = this.f3338f;
        int e2 = U.A.e(iArr, i3 + 1, false, false);
        int i4 = this.f3339g[e2];
        this.f3340h[e2].f(i3 - iArr[e2], q3, z3);
        q3.f1797c += i4;
        if (z3) {
            Object obj = this.f3341i[e2];
            Object obj2 = q3.f1796b;
            obj2.getClass();
            q3.f1796b = Pair.create(obj, obj2);
        }
        return q3;
    }

    @Override // R.T
    public final R.Q g(Object obj, R.Q q3) {
        int intValue;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f3342j.get(obj2);
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        int i3 = this.f3339g[intValue];
        this.f3340h[intValue].g(obj3, q3);
        q3.f1797c += i3;
        q3.f1796b = obj;
        return q3;
    }

    @Override // R.T
    public final int h() {
        return this.f3337e;
    }

    @Override // R.T
    public final int k(int i3, int i4, boolean z3) {
        int[] iArr = this.f3339g;
        int i5 = 0;
        int e2 = U.A.e(iArr, i3 + 1, false, false);
        int i6 = iArr[e2];
        R.T[] tArr = this.f3340h;
        R.T t3 = tArr[e2];
        int i7 = i3 - i6;
        if (i4 != 2) {
            i5 = i4;
        }
        int k3 = t3.k(i7, i5, z3);
        if (k3 != -1) {
            return i6 + k3;
        }
        int r3 = r(e2, z3);
        while (r3 != -1 && tArr[r3].p()) {
            r3 = r(r3, z3);
        }
        if (r3 != -1) {
            return tArr[r3].c(z3) + iArr[r3];
        } else if (i4 != 2) {
            return -1;
        } else {
            return c(z3);
        }
    }

    @Override // R.T
    public final Object l(int i3) {
        int[] iArr = this.f3338f;
        int e2 = U.A.e(iArr, i3 + 1, false, false);
        return Pair.create(this.f3341i[e2], this.f3340h[e2].l(i3 - iArr[e2]));
    }

    @Override // R.T
    public final R.S m(int i3, R.S s3, long j3) {
        int[] iArr = this.f3339g;
        int e2 = U.A.e(iArr, i3 + 1, false, false);
        int i4 = iArr[e2];
        int i5 = this.f3338f[e2];
        this.f3340h[e2].m(i3 - i4, s3, j3);
        Object obj = this.f3341i[e2];
        if (!R.S.f1802q.equals(s3.f1804a)) {
            obj = Pair.create(obj, s3.f1804a);
        }
        s3.f1804a = obj;
        s3.f1817n += i5;
        s3.f1818o += i5;
        return s3;
    }

    @Override // R.T
    public final int o() {
        return this.f3336d;
    }

    public final int q(int i3, boolean z3) {
        if (z3) {
            o0.X x = this.f3335c;
            int i4 = x.f8552c[i3] + 1;
            int[] iArr = x.f8551b;
            if (i4 >= iArr.length) {
                return -1;
            }
            return iArr[i4];
        } else if (i3 >= this.f3334b - 1) {
            return -1;
        } else {
            return i3 + 1;
        }
    }

    public final int r(int i3, boolean z3) {
        if (z3) {
            o0.X x = this.f3335c;
            int i4 = x.f8552c[i3] - 1;
            if (i4 < 0) {
                return -1;
            }
            return x.f8551b[i4];
        } else if (i3 <= 0) {
            return -1;
        } else {
            return i3 - 1;
        }
    }

    public j0(R.T[] tArr, Object[] objArr, o0.X x) {
        this.f3335c = x;
        this.f3334b = x.f8551b.length;
        int length = tArr.length;
        this.f3340h = tArr;
        this.f3338f = new int[length];
        this.f3339g = new int[length];
        this.f3341i = objArr;
        this.f3342j = new HashMap();
        int length2 = tArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 < length2) {
            R.T t3 = tArr[i3];
            this.f3340h[i6] = t3;
            this.f3339g[i6] = i4;
            this.f3338f[i6] = i5;
            i4 += t3.o();
            i5 += this.f3340h[i6].h();
            this.f3342j.put(objArr[i6], Integer.valueOf(i6));
            i3++;
            i6++;
        }
        this.f3336d = i4;
        this.f3337e = i5;
    }
}
