package S;

import U.AbstractC0123a;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f2167a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2168b;

    /* renamed from: c  reason: collision with root package name */
    public final float f2169c;

    /* renamed from: d  reason: collision with root package name */
    public final float f2170d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2171e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2172f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2173g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2174h;

    /* renamed from: i  reason: collision with root package name */
    public final short[] f2175i;

    /* renamed from: j  reason: collision with root package name */
    public short[] f2176j;

    /* renamed from: k  reason: collision with root package name */
    public int f2177k;

    /* renamed from: l  reason: collision with root package name */
    public short[] f2178l;

    /* renamed from: m  reason: collision with root package name */
    public int f2179m;

    /* renamed from: n  reason: collision with root package name */
    public short[] f2180n;

    /* renamed from: o  reason: collision with root package name */
    public int f2181o;

    /* renamed from: p  reason: collision with root package name */
    public int f2182p;

    /* renamed from: q  reason: collision with root package name */
    public int f2183q;

    /* renamed from: r  reason: collision with root package name */
    public int f2184r;

    /* renamed from: s  reason: collision with root package name */
    public int f2185s;

    /* renamed from: t  reason: collision with root package name */
    public int f2186t;

    /* renamed from: u  reason: collision with root package name */
    public int f2187u;

    /* renamed from: v  reason: collision with root package name */
    public int f2188v;

    public f(int i3, int i4, float f3, float f4, int i5) {
        this.f2167a = i3;
        this.f2168b = i4;
        this.f2169c = f3;
        this.f2170d = f4;
        this.f2171e = i3 / i5;
        this.f2172f = i3 / 400;
        int i6 = i3 / 65;
        this.f2173g = i6;
        int i7 = i6 * 2;
        this.f2174h = i7;
        this.f2175i = new short[i7];
        this.f2176j = new short[i7 * i4];
        this.f2178l = new short[i7 * i4];
        this.f2180n = new short[i7 * i4];
    }

    public static void e(int i3, int i4, short[] sArr, int i5, short[] sArr2, int i6, short[] sArr3, int i7) {
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = (i5 * i4) + i8;
            int i10 = (i7 * i4) + i8;
            int i11 = (i6 * i4) + i8;
            for (int i12 = 0; i12 < i3; i12++) {
                sArr[i9] = (short) (((sArr3[i10] * i12) + ((i3 - i12) * sArr2[i11])) / i3);
                i9 += i4;
                i11 += i4;
                i10 += i4;
            }
        }
    }

    public final void a(short[] sArr, int i3, int i4) {
        short[] c3 = c(this.f2178l, this.f2179m, i4);
        this.f2178l = c3;
        int i5 = this.f2168b;
        System.arraycopy(sArr, i3 * i5, c3, this.f2179m * i5, i5 * i4);
        this.f2179m += i4;
    }

    public final void b(short[] sArr, int i3, int i4) {
        int i5 = this.f2174h / i4;
        int i6 = this.f2168b;
        int i7 = i4 * i6;
        int i8 = i3 * i6;
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                i10 += sArr[(i9 * i7) + i8 + i11];
            }
            this.f2175i[i9] = (short) (i10 / i7);
        }
    }

    public final short[] c(short[] sArr, int i3, int i4) {
        int length = sArr.length;
        int i5 = this.f2168b;
        int i6 = length / i5;
        if (i3 + i4 <= i6) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i6 * 3) / 2) + i4) * i5);
    }

    public final int d(short[] sArr, int i3, int i4, int i5) {
        int i6 = i3 * this.f2168b;
        int i7 = 255;
        int i8 = 1;
        int i9 = 0;
        int i10 = 0;
        while (i4 <= i5) {
            int i11 = 0;
            for (int i12 = 0; i12 < i4; i12++) {
                i11 += Math.abs(sArr[i6 + i12] - sArr[(i6 + i4) + i12]);
            }
            if (i11 * i9 < i8 * i4) {
                i9 = i4;
                i8 = i11;
            }
            if (i11 * i7 > i10 * i4) {
                i7 = i4;
                i10 = i11;
            }
            i4++;
        }
        this.f2187u = i8 / i9;
        this.f2188v = i10 / i7;
        return i9;
    }

    public final void f() {
        int i3;
        int i4;
        int i5;
        float f3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z3;
        int i15 = this.f2179m;
        float f4 = this.f2169c;
        float f5 = this.f2170d;
        float f6 = f4 / f5;
        float f7 = this.f2171e * f5;
        double d3 = f6;
        int i16 = this.f2167a;
        int i17 = this.f2168b;
        int i18 = 1;
        if (d3 <= 1.00001d && d3 >= 0.99999d) {
            a(this.f2176j, 0, this.f2177k);
            this.f2177k = 0;
        } else {
            int i19 = this.f2177k;
            int i20 = this.f2174h;
            if (i19 >= i20) {
                int i21 = 0;
                while (true) {
                    int i22 = this.f2184r;
                    if (i22 > 0) {
                        int min = Math.min(i20, i22);
                        a(this.f2176j, i21, min);
                        this.f2184r -= min;
                        i21 += min;
                        i5 = i15;
                        f3 = f7;
                        i4 = i16;
                    } else {
                        short[] sArr = this.f2176j;
                        if (i16 > 4000) {
                            i3 = i16 / 4000;
                        } else {
                            i3 = 1;
                        }
                        int i23 = this.f2173g;
                        int i24 = this.f2172f;
                        if (i17 == i18 && i3 == i18) {
                            i6 = d(sArr, i21, i24, i23);
                            i5 = i15;
                            f3 = f7;
                            i4 = i16;
                        } else {
                            b(sArr, i21, i3);
                            i4 = i16;
                            i5 = i15;
                            short[] sArr2 = this.f2175i;
                            f3 = f7;
                            int d4 = d(sArr2, 0, i24 / i3, i23 / i3);
                            if (i3 != 1) {
                                int i25 = d4 * i3;
                                int i26 = i3 * 4;
                                int i27 = i25 - i26;
                                int i28 = i25 + i26;
                                if (i27 >= i24) {
                                    i24 = i27;
                                }
                                if (i28 <= i23) {
                                    i23 = i28;
                                }
                                if (i17 == 1) {
                                    i6 = d(sArr, i21, i24, i23);
                                } else {
                                    b(sArr, i21, 1);
                                    i6 = d(sArr2, 0, i24, i23);
                                }
                            } else {
                                i6 = d4;
                            }
                        }
                        int i29 = this.f2187u;
                        int i30 = this.f2188v;
                        if (i29 == 0 || (i7 = this.f2185s) == 0 || i30 > i29 * 3 || i29 * 2 <= this.f2186t * 3) {
                            i7 = i6;
                        }
                        this.f2186t = i29;
                        this.f2185s = i6;
                        if (d3 > 1.0d) {
                            short[] sArr3 = this.f2176j;
                            if (f6 >= 2.0f) {
                                i9 = (int) (i7 / (f6 - 1.0f));
                            } else {
                                this.f2184r = (int) (((2.0f - f6) * i7) / (f6 - 1.0f));
                                i9 = i7;
                            }
                            short[] c3 = c(this.f2178l, this.f2179m, i9);
                            this.f2178l = c3;
                            int i31 = i21;
                            e(i9, this.f2168b, c3, this.f2179m, sArr3, i31, sArr3, i21 + i7);
                            this.f2179m += i9;
                            i21 = i7 + i9 + i31;
                        } else {
                            int i32 = i21;
                            short[] sArr4 = this.f2176j;
                            if (f6 < 0.5f) {
                                i8 = (int) ((i7 * f6) / (1.0f - f6));
                            } else {
                                this.f2184r = (int) ((((2.0f * f6) - 1.0f) * i7) / (1.0f - f6));
                                i8 = i7;
                            }
                            int i33 = i7 + i8;
                            short[] c4 = c(this.f2178l, this.f2179m, i33);
                            this.f2178l = c4;
                            System.arraycopy(sArr4, i32 * i17, c4, this.f2179m * i17, i7 * i17);
                            e(i8, this.f2168b, this.f2178l, this.f2179m + i7, sArr4, i32 + i7, sArr4, i32);
                            this.f2179m += i33;
                            i21 = i32 + i8;
                        }
                    }
                    if (i21 + i20 > i19) {
                        break;
                    }
                    i16 = i4;
                    i15 = i5;
                    f7 = f3;
                    i18 = 1;
                }
                int i34 = this.f2177k - i21;
                short[] sArr5 = this.f2176j;
                System.arraycopy(sArr5, i21 * i17, sArr5, 0, i34 * i17);
                this.f2177k = i34;
                if (f3 == 1.0f && this.f2179m != (i10 = i5)) {
                    int i35 = i4;
                    int i36 = (int) (i35 / f3);
                    int i37 = i35;
                    while (true) {
                        if (i36 <= 16384 && i37 <= 16384) {
                            break;
                        }
                        i36 /= 2;
                        i37 /= 2;
                    }
                    int i38 = this.f2179m - i10;
                    short[] c5 = c(this.f2180n, this.f2181o, i38);
                    this.f2180n = c5;
                    System.arraycopy(this.f2178l, i10 * i17, c5, this.f2181o * i17, i38 * i17);
                    this.f2179m = i10;
                    this.f2181o += i38;
                    int i39 = 0;
                    while (true) {
                        i11 = this.f2181o;
                        i12 = i11 - 1;
                        if (i39 >= i12) {
                            break;
                        }
                        while (true) {
                            i13 = this.f2182p + 1;
                            int i40 = i13 * i36;
                            i14 = this.f2183q;
                            if (i40 <= i14 * i37) {
                                break;
                            }
                            this.f2178l = c(this.f2178l, this.f2179m, 1);
                            for (int i41 = 0; i41 < i17; i41++) {
                                short[] sArr6 = this.f2180n;
                                int i42 = (i39 * i17) + i41;
                                short s3 = sArr6[i42];
                                short s4 = sArr6[i42 + i17];
                                int i43 = this.f2182p;
                                int i44 = i43 * i36;
                                int i45 = (i43 + 1) * i36;
                                int i46 = i45 - (this.f2183q * i37);
                                int i47 = i45 - i44;
                                this.f2178l[(this.f2179m * i17) + i41] = (short) ((((i47 - i46) * s4) + (s3 * i46)) / i47);
                            }
                            this.f2183q++;
                            this.f2179m++;
                        }
                        this.f2182p = i13;
                        if (i13 == i37) {
                            this.f2182p = 0;
                            if (i14 == i36) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            AbstractC0123a.j(z3);
                            this.f2183q = 0;
                        }
                        i39++;
                    }
                    if (i12 != 0) {
                        short[] sArr7 = this.f2180n;
                        System.arraycopy(sArr7, i12 * i17, sArr7, 0, (i11 - i12) * i17);
                        this.f2181o -= i12;
                        return;
                    }
                    return;
                }
            }
        }
        i5 = i15;
        f3 = f7;
        i4 = i16;
        if (f3 == 1.0f) {
        }
    }
}
