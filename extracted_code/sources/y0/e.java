package y0;

import U.A;
import U.AbstractC0123a;
import w0.B;
import w0.G;
import w0.z;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final G f9725a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9726b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9727c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9728d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9729e;

    /* renamed from: f  reason: collision with root package name */
    public int f9730f;

    /* renamed from: g  reason: collision with root package name */
    public int f9731g;

    /* renamed from: h  reason: collision with root package name */
    public int f9732h;

    /* renamed from: i  reason: collision with root package name */
    public int f9733i;

    /* renamed from: j  reason: collision with root package name */
    public int f9734j;

    /* renamed from: k  reason: collision with root package name */
    public long[] f9735k;

    /* renamed from: l  reason: collision with root package name */
    public int[] f9736l;

    public e(int i3, int i4, long j3, int i5, G g3) {
        int i6;
        int i7;
        boolean z3 = true;
        if (i4 != 1 && i4 != 2) {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        this.f9728d = j3;
        this.f9729e = i5;
        this.f9725a = g3;
        if (i4 == 2) {
            i6 = 1667497984;
        } else {
            i6 = 1651965952;
        }
        int i8 = (((i3 % 10) + 48) << 8) | ((i3 / 10) + 48);
        this.f9726b = i6 | i8;
        if (i4 == 2) {
            i7 = i8 | 1650720768;
        } else {
            i7 = -1;
        }
        this.f9727c = i7;
        this.f9735k = new long[512];
        this.f9736l = new int[512];
    }

    public final B a(int i3) {
        return new B(((this.f9728d * 1) / this.f9729e) * this.f9736l[i3], this.f9735k[i3]);
    }

    public final z b(long j3) {
        int i3 = (int) (j3 / ((this.f9728d * 1) / this.f9729e));
        int e2 = A.e(this.f9736l, i3, true, true);
        if (this.f9736l[e2] == i3) {
            B a3 = a(e2);
            return new z(a3, a3);
        }
        B a4 = a(e2);
        int i4 = e2 + 1;
        if (i4 < this.f9735k.length) {
            return new z(a4, a(i4));
        }
        return new z(a4, a4);
    }
}
