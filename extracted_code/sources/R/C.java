package R;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class C {

    /* renamed from: y  reason: collision with root package name */
    public static final C f1745y = new C(new Object());

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f1746a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f1747b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f1748c;

    /* renamed from: d  reason: collision with root package name */
    public final CharSequence f1749d;

    /* renamed from: e  reason: collision with root package name */
    public final CharSequence f1750e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f1751f;

    /* renamed from: g  reason: collision with root package name */
    public final Integer f1752g;

    /* renamed from: h  reason: collision with root package name */
    public final Integer f1753h;

    /* renamed from: i  reason: collision with root package name */
    public final Integer f1754i;

    /* renamed from: j  reason: collision with root package name */
    public final Integer f1755j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f1756k;

    /* renamed from: l  reason: collision with root package name */
    public final Integer f1757l;

    /* renamed from: m  reason: collision with root package name */
    public final Integer f1758m;

    /* renamed from: n  reason: collision with root package name */
    public final Integer f1759n;

    /* renamed from: o  reason: collision with root package name */
    public final Integer f1760o;

    /* renamed from: p  reason: collision with root package name */
    public final Integer f1761p;

    /* renamed from: q  reason: collision with root package name */
    public final Integer f1762q;

    /* renamed from: r  reason: collision with root package name */
    public final Integer f1763r;

    /* renamed from: s  reason: collision with root package name */
    public final CharSequence f1764s;

    /* renamed from: t  reason: collision with root package name */
    public final CharSequence f1765t;

    /* renamed from: u  reason: collision with root package name */
    public final CharSequence f1766u;

    /* renamed from: v  reason: collision with root package name */
    public final CharSequence f1767v;

    /* renamed from: w  reason: collision with root package name */
    public final CharSequence f1768w;
    public final Integer x;

    /* JADX WARN: Type inference failed for: r0v0, types: [R.B, java.lang.Object] */
    static {
        D2.h.m(0, 1, 2, 3, 4);
        D2.h.m(5, 6, 8, 9, 10);
        D2.h.m(11, 12, 13, 14, 15);
        D2.h.m(16, 17, 18, 19, 20);
        D2.h.m(21, 22, 23, 24, 25);
        D2.h.m(26, 27, 28, 29, 30);
        U.A.H(31);
        U.A.H(32);
        U.A.H(33);
        U.A.H(1000);
    }

    public C(B b3) {
        Boolean bool = b3.f1732k;
        Integer num = b3.f1731j;
        Integer num2 = b3.f1744w;
        int i3 = 1;
        int i4 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i3 = 0;
                            break;
                        case 21:
                            i3 = 2;
                            break;
                        case 22:
                            i3 = 3;
                            break;
                        case 23:
                            i3 = 4;
                            break;
                        case 24:
                            i3 = 5;
                            break;
                        case 25:
                            i3 = 6;
                            break;
                    }
                    i4 = i3;
                }
                num = Integer.valueOf(i4);
            }
        } else if (num != null) {
            boolean z3 = num.intValue() != -1;
            bool = Boolean.valueOf(z3);
            if (z3 && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                        i4 = 21;
                        break;
                    case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                        i4 = 22;
                        break;
                    case N.k.LONG_FIELD_NUMBER /* 4 */:
                        i4 = 23;
                        break;
                    case N.k.STRING_FIELD_NUMBER /* 5 */:
                        i4 = 24;
                        break;
                    case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        i4 = 25;
                        break;
                    default:
                        i4 = 20;
                        break;
                }
                num2 = Integer.valueOf(i4);
            }
        }
        this.f1746a = b3.f1722a;
        this.f1747b = b3.f1723b;
        this.f1748c = b3.f1724c;
        this.f1749d = b3.f1725d;
        this.f1750e = b3.f1726e;
        this.f1751f = b3.f1727f;
        this.f1752g = b3.f1728g;
        this.f1753h = b3.f1729h;
        this.f1754i = b3.f1730i;
        this.f1755j = num;
        this.f1756k = bool;
        Integer num3 = b3.f1733l;
        this.f1757l = num3;
        this.f1758m = num3;
        this.f1759n = b3.f1734m;
        this.f1760o = b3.f1735n;
        this.f1761p = b3.f1736o;
        this.f1762q = b3.f1737p;
        this.f1763r = b3.f1738q;
        this.f1764s = b3.f1739r;
        this.f1765t = b3.f1740s;
        this.f1766u = b3.f1741t;
        this.f1767v = b3.f1742u;
        this.f1768w = b3.f1743v;
        this.x = num2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R.B, java.lang.Object] */
    public final B a() {
        ?? obj = new Object();
        obj.f1722a = this.f1746a;
        obj.f1723b = this.f1747b;
        obj.f1724c = this.f1748c;
        obj.f1725d = this.f1749d;
        obj.f1726e = this.f1750e;
        obj.f1727f = this.f1751f;
        obj.f1728g = this.f1752g;
        obj.f1729h = this.f1753h;
        obj.f1730i = this.f1754i;
        obj.f1731j = this.f1755j;
        obj.f1732k = this.f1756k;
        obj.f1733l = this.f1758m;
        obj.f1734m = this.f1759n;
        obj.f1735n = this.f1760o;
        obj.f1736o = this.f1761p;
        obj.f1737p = this.f1762q;
        obj.f1738q = this.f1763r;
        obj.f1739r = this.f1764s;
        obj.f1740s = this.f1765t;
        obj.f1741t = this.f1766u;
        obj.f1742u = this.f1767v;
        obj.f1743v = this.f1768w;
        obj.f1744w = this.x;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C.class != obj.getClass()) {
            return false;
        }
        C c3 = (C) obj;
        if (U.A.a(this.f1746a, c3.f1746a) && U.A.a(this.f1747b, c3.f1747b) && U.A.a(this.f1748c, c3.f1748c) && U.A.a(this.f1749d, c3.f1749d) && U.A.a(null, null) && U.A.a(null, null) && U.A.a(this.f1750e, c3.f1750e) && U.A.a(null, null) && U.A.a(null, null) && U.A.a(null, null) && Arrays.equals(this.f1751f, c3.f1751f) && U.A.a(this.f1752g, c3.f1752g) && U.A.a(null, null) && U.A.a(this.f1753h, c3.f1753h) && U.A.a(this.f1754i, c3.f1754i) && U.A.a(this.f1755j, c3.f1755j) && U.A.a(this.f1756k, c3.f1756k) && U.A.a(null, null) && U.A.a(this.f1758m, c3.f1758m) && U.A.a(this.f1759n, c3.f1759n) && U.A.a(this.f1760o, c3.f1760o) && U.A.a(this.f1761p, c3.f1761p) && U.A.a(this.f1762q, c3.f1762q) && U.A.a(this.f1763r, c3.f1763r) && U.A.a(this.f1764s, c3.f1764s) && U.A.a(this.f1765t, c3.f1765t) && U.A.a(this.f1766u, c3.f1766u) && U.A.a(null, null) && U.A.a(null, null) && U.A.a(this.f1767v, c3.f1767v) && U.A.a(null, null) && U.A.a(this.f1768w, c3.f1768w) && U.A.a(this.x, c3.x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1746a, this.f1747b, this.f1748c, this.f1749d, null, null, this.f1750e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f1751f)), this.f1752g, null, this.f1753h, this.f1754i, this.f1755j, this.f1756k, null, this.f1758m, this.f1759n, this.f1760o, this.f1761p, this.f1762q, this.f1763r, this.f1764s, this.f1765t, this.f1766u, null, null, this.f1767v, null, this.f1768w, this.x, true});
    }
}
