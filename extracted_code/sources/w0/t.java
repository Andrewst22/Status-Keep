package w0;

import R.C0112o;
import R.C0113p;
import g2.C0276a;
import java.util.Collections;
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final int f9624a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9625b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9626c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9627d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9628e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9629f;

    /* renamed from: g  reason: collision with root package name */
    public final int f9630g;

    /* renamed from: h  reason: collision with root package name */
    public final int f9631h;

    /* renamed from: i  reason: collision with root package name */
    public final int f9632i;

    /* renamed from: j  reason: collision with root package name */
    public final long f9633j;

    /* renamed from: k  reason: collision with root package name */
    public final C0276a f9634k;

    /* renamed from: l  reason: collision with root package name */
    public final R.F f9635l;

    public t(byte[] bArr, int i3) {
        U.s sVar = new U.s(bArr, bArr.length);
        sVar.q(i3 * 8);
        this.f9624a = sVar.i(16);
        this.f9625b = sVar.i(16);
        this.f9626c = sVar.i(24);
        this.f9627d = sVar.i(24);
        int i4 = sVar.i(20);
        this.f9628e = i4;
        this.f9629f = d(i4);
        this.f9630g = sVar.i(3) + 1;
        int i5 = sVar.i(5) + 1;
        this.f9631h = i5;
        this.f9632i = a(i5);
        this.f9633j = sVar.k(36);
        this.f9634k = null;
        this.f9635l = null;
    }

    public static int a(int i3) {
        if (i3 != 8) {
            if (i3 != 12) {
                if (i3 != 16) {
                    if (i3 != 20) {
                        if (i3 != 24) {
                            return -1;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int d(int i3) {
        switch (i3) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j3 = this.f9633j;
        if (j3 == 0) {
            return -9223372036854775807L;
        }
        return (j3 * 1000000) / this.f9628e;
    }

    public final C0113p c(byte[] bArr, R.F f3) {
        bArr[4] = Byte.MIN_VALUE;
        int i3 = this.f9627d;
        if (i3 <= 0) {
            i3 = -1;
        }
        R.F f4 = this.f9635l;
        if (f4 != null) {
            f3 = f4.e(f3);
        }
        C0112o c0112o = new C0112o();
        c0112o.f1937l = R.G.l("audio/flac");
        c0112o.f1938m = i3;
        c0112o.f1950z = this.f9630g;
        c0112o.f1917A = this.f9628e;
        c0112o.f1918B = U.A.A(this.f9631h);
        c0112o.f1940o = Collections.singletonList(bArr);
        c0112o.f1935j = f3;
        return new C0113p(c0112o);
    }

    public t(int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j3, C0276a c0276a, R.F f3) {
        this.f9624a = i3;
        this.f9625b = i4;
        this.f9626c = i5;
        this.f9627d = i6;
        this.f9628e = i7;
        this.f9629f = d(i7);
        this.f9630g = i8;
        this.f9631h = i9;
        this.f9632i = a(i9);
        this.f9633j = j3;
        this.f9634k = c0276a;
        this.f9635l = f3;
    }
}
