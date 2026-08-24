package d1;

import Q0.i;
import R.C0112o;
import R.C0113p;
import R.H;
import U.A;
import java.math.RoundingMode;
import w0.G;
import w0.l;
import w0.q;
/* renamed from: d1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0253c implements InterfaceC0252b {

    /* renamed from: a  reason: collision with root package name */
    public final q f5168a;

    /* renamed from: b  reason: collision with root package name */
    public final G f5169b;

    /* renamed from: c  reason: collision with root package name */
    public final i f5170c;

    /* renamed from: d  reason: collision with root package name */
    public final C0113p f5171d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5172e;

    /* renamed from: f  reason: collision with root package name */
    public long f5173f;

    /* renamed from: g  reason: collision with root package name */
    public int f5174g;

    /* renamed from: h  reason: collision with root package name */
    public long f5175h;

    public C0253c(q qVar, G g3, i iVar, String str, int i3) {
        this.f5168a = qVar;
        this.f5169b = g3;
        this.f5170c = iVar;
        int i4 = iVar.f1554e;
        int i5 = iVar.f1551b;
        int i6 = (i4 * i5) / 8;
        int i7 = iVar.f1553d;
        if (i7 == i6) {
            int i8 = iVar.f1552c;
            int i9 = i8 * i6;
            int i10 = i9 * 8;
            int max = Math.max(i6, i9 / 10);
            this.f5172e = max;
            C0112o c0112o = new C0112o();
            c0112o.f1937l = R.G.l(str);
            c0112o.f1932g = i10;
            c0112o.f1933h = i10;
            c0112o.f1938m = max;
            c0112o.f1950z = i5;
            c0112o.f1917A = i8;
            c0112o.f1918B = i3;
            this.f5171d = new C0113p(c0112o);
            return;
        }
        throw H.a(null, "Expected block size: " + i6 + "; got: " + i7);
    }

    @Override // d1.InterfaceC0252b
    public final void a(long j3) {
        this.f5173f = j3;
        this.f5174g = 0;
        this.f5175h = 0L;
    }

    @Override // d1.InterfaceC0252b
    public final void b(long j3, int i3) {
        this.f5168a.n(new C0256f(this.f5170c, 1, i3, j3));
        this.f5169b.c(this.f5171d);
    }

    @Override // d1.InterfaceC0252b
    public final boolean c(l lVar, long j3) {
        int i3;
        int i4;
        int i5;
        long j4 = j3;
        while (true) {
            i3 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
            if (i3 <= 0 || (i4 = this.f5174g) >= (i5 = this.f5172e)) {
                break;
            }
            int d3 = this.f5169b.d(lVar, (int) Math.min(i5 - i4, j4), true);
            if (d3 == -1) {
                j4 = 0;
            } else {
                this.f5174g += d3;
                j4 -= d3;
            }
        }
        i iVar = this.f5170c;
        int i6 = this.f5174g;
        int i7 = iVar.f1553d;
        int i8 = i6 / i7;
        if (i8 > 0) {
            long j5 = this.f5173f;
            long j6 = this.f5175h;
            long j7 = iVar.f1552c;
            int i9 = A.f2405a;
            int i10 = i8 * i7;
            int i11 = this.f5174g - i10;
            this.f5169b.b(j5 + A.U(j6, 1000000L, j7, RoundingMode.FLOOR), 1, i10, i11, null);
            this.f5175h += i8;
            this.f5174g = i11;
        }
        if (i3 <= 0) {
            return true;
        }
        return false;
    }
}
