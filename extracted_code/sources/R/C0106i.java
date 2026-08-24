package R;

import java.util.Arrays;
/* renamed from: R.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106i {

    /* renamed from: h  reason: collision with root package name */
    public static final C0106i f1897h = new C0106i(1, 2, 3, -1, -1, null);

    /* renamed from: a  reason: collision with root package name */
    public final int f1898a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1899b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1900c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f1901d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1902e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1903f;

    /* renamed from: g  reason: collision with root package name */
    public int f1904g;

    static {
        D2.h.m(0, 1, 2, 3, 4);
        U.A.H(5);
    }

    public C0106i(int i3, int i4, int i5, int i6, int i7, byte[] bArr) {
        this.f1898a = i3;
        this.f1899b = i4;
        this.f1900c = i5;
        this.f1901d = bArr;
        this.f1902e = i6;
        this.f1903f = i7;
    }

    public static String a(int i3) {
        if (i3 != -1) {
            if (i3 != 1) {
                if (i3 != 2) {
                    return D2.h.k("Undefined color range ", i3);
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    public static String b(int i3) {
        if (i3 != -1) {
            if (i3 != 6) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        return D2.h.k("Undefined color space ", i3);
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    public static String c(int i3) {
        if (i3 != -1) {
            if (i3 != 10) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 6) {
                                if (i3 != 7) {
                                    return D2.h.k("Undefined color transfer ", i3);
                                }
                                return "HLG";
                            }
                            return "ST2084 PQ";
                        }
                        return "SDR SMPTE 170M";
                    }
                    return "sRGB";
                }
                return "Linear";
            }
            return "Gamma 2.2";
        }
        return "Unset color transfer";
    }

    public static boolean e(C0106i c0106i) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (c0106i == null) {
            return true;
        }
        int i7 = c0106i.f1898a;
        if ((i7 == -1 || i7 == 1 || i7 == 2) && (((i3 = c0106i.f1899b) == -1 || i3 == 2) && (((i4 = c0106i.f1900c) == -1 || i4 == 3) && c0106i.f1901d == null && (((i5 = c0106i.f1903f) == -1 || i5 == 8) && ((i6 = c0106i.f1902e) == -1 || i6 == 8))))) {
            return true;
        }
        return false;
    }

    public static int f(int i3) {
        if (i3 == 1) {
            return 1;
        }
        if (i3 == 9) {
            return 6;
        }
        if (i3 != 4 && i3 != 5 && i3 != 6 && i3 != 7) {
            return -1;
        }
        return 2;
    }

    public static int g(int i3) {
        if (i3 != 1) {
            if (i3 != 4) {
                if (i3 != 13) {
                    if (i3 == 16) {
                        return 6;
                    }
                    if (i3 == 18) {
                        return 7;
                    }
                    if (i3 != 6 && i3 != 7) {
                        return -1;
                    }
                    return 3;
                }
                return 2;
            }
            return 10;
        }
        return 3;
    }

    public final boolean d() {
        if (this.f1898a != -1 && this.f1899b != -1 && this.f1900c != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0106i.class != obj.getClass()) {
            return false;
        }
        C0106i c0106i = (C0106i) obj;
        if (this.f1898a == c0106i.f1898a && this.f1899b == c0106i.f1899b && this.f1900c == c0106i.f1900c && Arrays.equals(this.f1901d, c0106i.f1901d) && this.f1902e == c0106i.f1902e && this.f1903f == c0106i.f1903f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f1904g == 0) {
            this.f1904g = ((((Arrays.hashCode(this.f1901d) + ((((((527 + this.f1898a) * 31) + this.f1899b) * 31) + this.f1900c) * 31)) * 31) + this.f1902e) * 31) + this.f1903f;
        }
        return this.f1904g;
    }

    public final String toString() {
        boolean z3;
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.f1898a));
        sb.append(", ");
        sb.append(a(this.f1899b));
        sb.append(", ");
        sb.append(c(this.f1900c));
        sb.append(", ");
        if (this.f1901d != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        sb.append(z3);
        sb.append(", ");
        String str2 = "NA";
        int i3 = this.f1902e;
        if (i3 == -1) {
            str = "NA";
        } else {
            str = i3 + "bit Luma";
        }
        sb.append(str);
        sb.append(", ");
        int i4 = this.f1903f;
        if (i4 != -1) {
            str2 = i4 + "bit Chroma";
        }
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
