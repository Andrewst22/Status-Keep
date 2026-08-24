package U;

import D1.M;
import a.AbstractC0155a;
import java.nio.charset.Charset;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class t {

    /* renamed from: d  reason: collision with root package name */
    public static final char[] f2474d = {'\r', '\n'};

    /* renamed from: e  reason: collision with root package name */
    public static final char[] f2475e = {'\n'};

    /* renamed from: f  reason: collision with root package name */
    public static final M f2476f = M.i(5, C1.d.f151a, C1.d.f153c, C1.d.f156f, C1.d.f154d, C1.d.f155e);

    /* renamed from: a  reason: collision with root package name */
    public byte[] f2477a;

    /* renamed from: b  reason: collision with root package name */
    public int f2478b;

    /* renamed from: c  reason: collision with root package name */
    public int f2479c;

    public t() {
        this.f2477a = A.f2410f;
    }

    public final int A() {
        byte[] bArr = this.f2477a;
        int i3 = this.f2478b;
        int i4 = i3 + 1;
        this.f2478b = i4;
        this.f2478b = i3 + 2;
        return (bArr[i4] & 255) | ((bArr[i3] & 255) << 8);
    }

    public final long B() {
        int i3;
        int i4;
        byte b3;
        int i5;
        long j3 = this.f2477a[this.f2478b];
        int i6 = 7;
        while (true) {
            if (i6 < 0) {
                break;
            }
            if (((1 << i6) & j3) != 0) {
                i6--;
            } else if (i6 < 6) {
                j3 &= i5 - 1;
                i4 = 7 - i6;
            } else if (i6 == 7) {
                i4 = 1;
            }
        }
        i4 = 0;
        if (i4 != 0) {
            for (i3 = 1; i3 < i4; i3++) {
                if ((this.f2477a[this.f2478b + i3] & 192) == 128) {
                    j3 = (j3 << 6) | (b3 & 63);
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j3);
                }
            }
            this.f2478b += i4;
            return j3;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j3);
    }

    public final Charset C() {
        if (a() >= 3) {
            byte[] bArr = this.f2477a;
            int i3 = this.f2478b;
            if (bArr[i3] == -17 && bArr[i3 + 1] == -69 && bArr[i3 + 2] == -65) {
                this.f2478b = i3 + 3;
                return C1.d.f153c;
            }
        }
        if (a() >= 2) {
            byte[] bArr2 = this.f2477a;
            int i4 = this.f2478b;
            byte b3 = bArr2[i4];
            if (b3 == -2 && bArr2[i4 + 1] == -1) {
                this.f2478b = i4 + 2;
                return C1.d.f154d;
            } else if (b3 == -1 && bArr2[i4 + 1] == -2) {
                this.f2478b = i4 + 2;
                return C1.d.f155e;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void D(int i3) {
        byte[] bArr = this.f2477a;
        if (bArr.length < i3) {
            bArr = new byte[i3];
        }
        E(bArr, i3);
    }

    public final void E(byte[] bArr, int i3) {
        this.f2477a = bArr;
        this.f2479c = i3;
        this.f2478b = 0;
    }

    public final void F(int i3) {
        boolean z3;
        if (i3 >= 0 && i3 <= this.f2477a.length) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        this.f2479c = i3;
    }

    public final void G(int i3) {
        boolean z3;
        if (i3 >= 0 && i3 <= this.f2479c) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        this.f2478b = i3;
    }

    public final void H(int i3) {
        G(this.f2478b + i3);
    }

    public final int a() {
        return this.f2479c - this.f2478b;
    }

    public final void b(int i3) {
        byte[] bArr = this.f2477a;
        if (i3 > bArr.length) {
            this.f2477a = Arrays.copyOf(bArr, i3);
        }
    }

    public final char c(Charset charset) {
        boolean contains = f2476f.contains(charset);
        AbstractC0123a.d("Unsupported charset: " + charset, contains);
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        boolean z3;
        byte b3;
        int i3;
        byte b4;
        byte b5;
        boolean z4 = false;
        if ((charset.equals(C1.d.f153c) || charset.equals(C1.d.f151a)) && a() >= 1) {
            long j3 = this.f2477a[this.f2478b] & 255;
            char c3 = (char) j3;
            if (c3 == j3) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0155a.k(z3, "Out of range: %s", j3);
            b3 = (byte) c3;
            i3 = 1;
        } else {
            i3 = 2;
            if ((charset.equals(C1.d.f156f) || charset.equals(C1.d.f154d)) && a() >= 2) {
                byte[] bArr = this.f2477a;
                int i4 = this.f2478b;
                b4 = bArr[i4];
                b5 = bArr[i4 + 1];
            } else if (!charset.equals(C1.d.f155e) || a() < 2) {
                return 0;
            } else {
                byte[] bArr2 = this.f2477a;
                int i5 = this.f2478b;
                b4 = bArr2[i5 + 1];
                b5 = bArr2[i5];
            }
            b3 = (byte) ((char) ((b5 & 255) | (b4 << 8)));
        }
        long j4 = b3;
        char c4 = (char) j4;
        if (c4 == j4) {
            z4 = true;
        }
        AbstractC0155a.k(z4, "Out of range: %s", j4);
        return (c4 << 16) + i3;
    }

    public final int e() {
        return this.f2477a[this.f2478b] & 255;
    }

    public final void f(byte[] bArr, int i3, int i4) {
        System.arraycopy(this.f2477a, this.f2478b, bArr, i3, i4);
        this.f2478b += i4;
    }

    public final char g(Charset charset, char[] cArr) {
        int d3 = d(charset);
        if (d3 != 0) {
            char c3 = (char) (d3 >> 16);
            for (char c4 : cArr) {
                if (c4 == c3) {
                    this.f2478b += d3 & 65535;
                    return c3;
                }
            }
        }
        return (char) 0;
    }

    public final int h() {
        byte[] bArr = this.f2477a;
        int i3 = this.f2478b;
        int i4 = i3 + 1;
        this.f2478b = i4;
        int i5 = i3 + 2;
        this.f2478b = i5;
        int i6 = ((bArr[i4] & 255) << 16) | ((bArr[i3] & 255) << 24);
        int i7 = i3 + 3;
        this.f2478b = i7;
        this.f2478b = i3 + 4;
        return (bArr[i7] & 255) | i6 | ((bArr[i5] & 255) << 8);
    }

    public final String i(Charset charset) {
        int i3;
        boolean contains = f2476f.contains(charset);
        AbstractC0123a.d("Unsupported charset: " + charset, contains);
        if (a() == 0) {
            return null;
        }
        Charset charset2 = C1.d.f151a;
        if (!charset.equals(charset2)) {
            C();
        }
        if (!charset.equals(C1.d.f153c) && !charset.equals(charset2)) {
            if (!charset.equals(C1.d.f156f) && !charset.equals(C1.d.f155e) && !charset.equals(C1.d.f154d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i3 = 2;
        } else {
            i3 = 1;
        }
        int i4 = this.f2478b;
        while (true) {
            int i5 = this.f2479c;
            if (i4 < i5 - (i3 - 1)) {
                if ((charset.equals(C1.d.f153c) || charset.equals(C1.d.f151a)) && A.K(this.f2477a[i4])) {
                    break;
                }
                if (charset.equals(C1.d.f156f) || charset.equals(C1.d.f154d)) {
                    byte[] bArr = this.f2477a;
                    if (bArr[i4] == 0 && A.K(bArr[i4 + 1])) {
                        break;
                    }
                }
                if (charset.equals(C1.d.f155e)) {
                    byte[] bArr2 = this.f2477a;
                    if (bArr2[i4 + 1] == 0 && A.K(bArr2[i4])) {
                        break;
                    }
                }
                i4 += i3;
            } else {
                i4 = i5;
                break;
            }
        }
        String s3 = s(i4 - this.f2478b, charset);
        if (this.f2478b == this.f2479c) {
            return s3;
        }
        if (g(charset, f2474d) == '\r') {
            g(charset, f2475e);
        }
        return s3;
    }

    public final int j() {
        byte[] bArr = this.f2477a;
        int i3 = this.f2478b;
        int i4 = i3 + 1;
        this.f2478b = i4;
        int i5 = i3 + 2;
        this.f2478b = i5;
        int i6 = ((bArr[i4] & 255) << 8) | (bArr[i3] & 255);
        int i7 = i3 + 3;
        this.f2478b = i7;
        this.f2478b = i3 + 4;
        return ((bArr[i7] & 255) << 24) | i6 | ((bArr[i5] & 255) << 16);
    }

    public final long k() {
        byte[] bArr = this.f2477a;
        int i3 = this.f2478b;
        int i4 = i3 + 1;
        this.f2478b = i4;
        int i5 = i3 + 2;
        this.f2478b = i5;
        long j3 = (bArr[i3] & 255) | ((bArr[i4] & 255) << 8);
        int i6 = i3 + 3;
        this.f2478b = i6;
        int i7 = i3 + 4;
        this.f2478b = i7;
        long j4 = j3 | ((bArr[i5] & 255) << 16) | ((bArr[i6] & 255) << 24);
        int i8 = i3 + 5;
        this.f2478b = i8;
        int i9 = i3 + 6;
        this.f2478b = i9;
        long j5 = j4 | ((bArr[i7] & 255) << 32) | ((bArr[i8] & 255) << 40);
        int i10 = i3 + 7;
        this.f2478b = i10;
        this.f2478b = i3 + 8;
        return ((bArr[i10] & 255) << 56) | j5 | ((bArr[i9] & 255) << 48);
    }

    public final long l() {
        byte[] bArr = this.f2477a;
        int i3 = this.f2478b;
        int i4 = i3 + 1;
        this.f2478b = i4;
        int i5 = i3 + 2;
        this.f2478b = i5;
        int i6 = i3 + 3;
        this.f2478b = i6;
        this.f2478b = i3 + 4;
        return ((bArr[i6] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i4] & 255) << 8) | ((bArr[i5] & 255) << 16);
    }

    public final int m() {
        int j3 = j();
        if (j3 >= 0) {
            return j3;
        }
        throw new IllegalStateException(D2.h.k("Top bit not zero: ", j3));
    }

    public final int n() {
        byte[] bArr = this.f2477a;
        int i3 = this.f2478b;
        int i4 = i3 + 1;
        this.f2478b = i4;
        this.f2478b = i3 + 2;
        return ((bArr[i4] & 255) << 8) | (bArr[i3] & 255);
    }

    public final long o() {
        byte[] bArr = this.f2477a;
        int i3 = this.f2478b;
        int i4 = i3 + 1;
        this.f2478b = i4;
        int i5 = i3 + 2;
        this.f2478b = i5;
        int i6 = i3 + 3;
        this.f2478b = i6;
        long j3 = ((bArr[i3] & 255) << 56) | ((bArr[i4] & 255) << 48) | ((bArr[i5] & 255) << 40);
        int i7 = i3 + 4;
        this.f2478b = i7;
        int i8 = i3 + 5;
        this.f2478b = i8;
        long j4 = j3 | ((bArr[i6] & 255) << 32) | ((bArr[i7] & 255) << 24);
        int i9 = i3 + 6;
        this.f2478b = i9;
        int i10 = i3 + 7;
        this.f2478b = i10;
        this.f2478b = i3 + 8;
        return (bArr[i10] & 255) | j4 | ((bArr[i8] & 255) << 16) | ((bArr[i9] & 255) << 8);
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i3 = this.f2478b;
        while (i3 < this.f2479c && this.f2477a[i3] != 0) {
            i3++;
        }
        byte[] bArr = this.f2477a;
        int i4 = this.f2478b;
        int i5 = A.f2405a;
        String str = new String(bArr, i4, i3 - i4, C1.d.f153c);
        this.f2478b = i3;
        if (i3 < this.f2479c) {
            this.f2478b = i3 + 1;
        }
        return str;
    }

    public final String q(int i3) {
        int i4;
        if (i3 == 0) {
            return "";
        }
        int i5 = this.f2478b;
        int i6 = (i5 + i3) - 1;
        if (i6 < this.f2479c && this.f2477a[i6] == 0) {
            i4 = i3 - 1;
        } else {
            i4 = i3;
        }
        byte[] bArr = this.f2477a;
        int i7 = A.f2405a;
        String str = new String(bArr, i5, i4, C1.d.f153c);
        this.f2478b += i3;
        return str;
    }

    public final short r() {
        byte[] bArr = this.f2477a;
        int i3 = this.f2478b;
        int i4 = i3 + 1;
        this.f2478b = i4;
        this.f2478b = i3 + 2;
        return (short) ((bArr[i4] & 255) | ((bArr[i3] & 255) << 8));
    }

    public final String s(int i3, Charset charset) {
        String str = new String(this.f2477a, this.f2478b, i3, charset);
        this.f2478b += i3;
        return str;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.f2477a;
        int i3 = this.f2478b;
        this.f2478b = i3 + 1;
        return bArr[i3] & 255;
    }

    public final int v() {
        byte[] bArr = this.f2477a;
        int i3 = this.f2478b;
        int i4 = i3 + 1;
        this.f2478b = i4;
        this.f2478b = i3 + 2;
        int i5 = (bArr[i4] & 255) | ((bArr[i3] & 255) << 8);
        this.f2478b = i3 + 4;
        return i5;
    }

    public final long w() {
        byte[] bArr = this.f2477a;
        int i3 = this.f2478b;
        int i4 = i3 + 1;
        this.f2478b = i4;
        int i5 = i3 + 2;
        this.f2478b = i5;
        int i6 = i3 + 3;
        this.f2478b = i6;
        this.f2478b = i3 + 4;
        return (bArr[i6] & 255) | ((bArr[i3] & 255) << 24) | ((bArr[i4] & 255) << 16) | ((bArr[i5] & 255) << 8);
    }

    public final int x() {
        byte[] bArr = this.f2477a;
        int i3 = this.f2478b;
        int i4 = i3 + 1;
        this.f2478b = i4;
        int i5 = i3 + 2;
        this.f2478b = i5;
        int i6 = (bArr[i4] & 255) << 8;
        this.f2478b = i3 + 3;
        return (bArr[i5] & 255) | i6 | ((bArr[i3] & 255) << 16);
    }

    public final int y() {
        int h3 = h();
        if (h3 >= 0) {
            return h3;
        }
        throw new IllegalStateException(D2.h.k("Top bit not zero: ", h3));
    }

    public final long z() {
        long o3 = o();
        if (o3 >= 0) {
            return o3;
        }
        throw new IllegalStateException("Top bit not zero: " + o3);
    }

    public t(int i3) {
        this.f2477a = new byte[i3];
        this.f2479c = i3;
    }

    public t(byte[] bArr) {
        this.f2477a = bArr;
        this.f2479c = bArr.length;
    }

    public t(byte[] bArr, int i3) {
        this.f2477a = bArr;
        this.f2479c = i3;
    }
}
