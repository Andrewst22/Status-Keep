package Q1;

import D2.h;
import N.k;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
/* loaded from: classes.dex */
public class b implements Closeable {

    /* renamed from: A  reason: collision with root package name */
    public int[] f1696A;

    /* renamed from: m  reason: collision with root package name */
    public final Reader f1697m;

    /* renamed from: u  reason: collision with root package name */
    public long f1705u;

    /* renamed from: v  reason: collision with root package name */
    public int f1706v;

    /* renamed from: w  reason: collision with root package name */
    public String f1707w;
    public int[] x;

    /* renamed from: z  reason: collision with root package name */
    public String[] f1709z;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1698n = false;

    /* renamed from: o  reason: collision with root package name */
    public final char[] f1699o = new char[1024];

    /* renamed from: p  reason: collision with root package name */
    public int f1700p = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f1701q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f1702r = 0;

    /* renamed from: s  reason: collision with root package name */
    public int f1703s = 0;

    /* renamed from: t  reason: collision with root package name */
    public int f1704t = 0;

    /* renamed from: y  reason: collision with root package name */
    public int f1708y = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [Q1.a, java.lang.Object] */
    static {
        a.f1695a = new Object();
    }

    public b(Reader reader) {
        int[] iArr = new int[32];
        this.x = iArr;
        iArr[0] = 6;
        this.f1709z = new String[32];
        this.f1696A = new int[32];
        if (reader != null) {
            this.f1697m = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    public final void A() {
        char c3;
        do {
            if (this.f1700p < this.f1701q || h(1)) {
                int i3 = this.f1700p;
                int i4 = i3 + 1;
                this.f1700p = i4;
                c3 = this.f1699o[i3];
                if (c3 == '\n') {
                    this.f1702r++;
                    this.f1703s = i4;
                    return;
                }
            } else {
                return;
            }
        } while (c3 != '\r');
    }

    public void B() {
        int i3 = 0;
        do {
            int i4 = this.f1704t;
            if (i4 == 0) {
                i4 = d();
            }
            if (i4 == 3) {
                x(1);
            } else if (i4 == 1) {
                x(3);
            } else {
                if (i4 == 4) {
                    this.f1708y--;
                } else if (i4 == 2) {
                    this.f1708y--;
                } else {
                    if (i4 != 14 && i4 != 10) {
                        if (i4 != 8 && i4 != 12) {
                            if (i4 != 9 && i4 != 13) {
                                if (i4 == 16) {
                                    this.f1700p += this.f1706v;
                                }
                            } else {
                                z('\"');
                            }
                        } else {
                            z('\'');
                        }
                    } else {
                        do {
                            int i5 = 0;
                            while (true) {
                                int i6 = this.f1700p + i5;
                                if (i6 < this.f1701q) {
                                    char c3 = this.f1699o[i6];
                                    if (c3 != '\t' && c3 != '\n' && c3 != '\f' && c3 != '\r' && c3 != ' ') {
                                        if (c3 != '#') {
                                            if (c3 != ',') {
                                                if (c3 != '/' && c3 != '=') {
                                                    if (c3 != '{' && c3 != '}' && c3 != ':') {
                                                        if (c3 != ';') {
                                                            switch (c3) {
                                                                case '[':
                                                                case ']':
                                                                    break;
                                                                case '\\':
                                                                    break;
                                                                default:
                                                                    i5++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    this.f1700p = i6;
                                }
                            }
                            c();
                            this.f1700p += i5;
                        } while (h(1));
                    }
                    this.f1704t = 0;
                }
                i3--;
                this.f1704t = 0;
            }
            i3++;
            this.f1704t = 0;
        } while (i3 != 0);
        int[] iArr = this.f1696A;
        int i7 = this.f1708y;
        int i8 = i7 - 1;
        iArr[i8] = iArr[i8] + 1;
        this.f1709z[i7 - 1] = "null";
    }

    public final void C(String str) {
        throw new IOException(str + l());
    }

    public void a() {
        int i3 = this.f1704t;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 3) {
            x(1);
            this.f1696A[this.f1708y - 1] = 0;
            this.f1704t = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + h.v(w()) + l());
    }

    public void b() {
        int i3 = this.f1704t;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 1) {
            x(3);
            this.f1704t = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + h.v(w()) + l());
    }

    public final void c() {
        if (this.f1698n) {
            return;
        }
        C("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1704t = 0;
        this.x[0] = 8;
        this.f1708y = 1;
        this.f1697m.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0198, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0211, code lost:
        if (k(r1) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0214, code lost:
        if (r8 != 2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0216, code lost:
        if (r11 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x021c, code lost:
        if (r14 != Long.MIN_VALUE) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x021e, code lost:
        if (r16 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0221, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0225, code lost:
        if (r14 != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0227, code lost:
        if (r16 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0229, code lost:
        if (r16 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x022c, code lost:
        r14 = -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x022d, code lost:
        r20.f1705u = r14;
        r20.f1700p += r10;
        r10 = 15;
        r20.f1704t = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0239, code lost:
        if (r8 == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x023c, code lost:
        if (r8 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x023f, code lost:
        if (r8 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0241, code lost:
        r20.f1706v = r10;
        r10 = 16;
        r20.f1704t = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0279 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d() {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.b.d():int");
    }

    public void f() {
        int i3 = this.f1704t;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 4) {
            int i4 = this.f1708y;
            this.f1708y = i4 - 1;
            int[] iArr = this.f1696A;
            int i5 = i4 - 2;
            iArr[i5] = iArr[i5] + 1;
            this.f1704t = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + h.v(w()) + l());
    }

    public void g() {
        int i3 = this.f1704t;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 2) {
            int i4 = this.f1708y;
            int i5 = i4 - 1;
            this.f1708y = i5;
            this.f1709z[i5] = null;
            int[] iArr = this.f1696A;
            int i6 = i4 - 2;
            iArr[i6] = iArr[i6] + 1;
            this.f1704t = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + h.v(w()) + l());
    }

    public final boolean h(int i3) {
        int i4;
        int i5;
        int i6 = this.f1703s;
        int i7 = this.f1700p;
        this.f1703s = i6 - i7;
        int i8 = this.f1701q;
        char[] cArr = this.f1699o;
        if (i8 != i7) {
            int i9 = i8 - i7;
            this.f1701q = i9;
            System.arraycopy(cArr, i7, cArr, 0, i9);
        } else {
            this.f1701q = 0;
        }
        this.f1700p = 0;
        do {
            int i10 = this.f1701q;
            int read = this.f1697m.read(cArr, i10, cArr.length - i10);
            if (read == -1) {
                return false;
            }
            i4 = this.f1701q + read;
            this.f1701q = i4;
            if (this.f1702r == 0 && (i5 = this.f1703s) == 0 && i4 > 0 && cArr[0] == 65279) {
                this.f1700p++;
                this.f1703s = i5 + 1;
                i3++;
                continue;
            }
        } while (i4 < i3);
        return true;
    }

    public String i() {
        StringBuilder sb = new StringBuilder("$");
        int i3 = this.f1708y;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = this.x[i4];
            if (i5 != 1 && i5 != 2) {
                if (i5 == 3 || i5 == 4 || i5 == 5) {
                    sb.append('.');
                    String str = this.f1709z[i4];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            } else {
                sb.append('[');
                sb.append(this.f1696A[i4]);
                sb.append(']');
            }
        }
        return sb.toString();
    }

    public boolean j() {
        int i3 = this.f1704t;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 != 2 && i3 != 4) {
            return true;
        }
        return false;
    }

    public final boolean k(char c3) {
        if (c3 != '\t' && c3 != '\n' && c3 != '\f' && c3 != '\r' && c3 != ' ') {
            if (c3 != '#') {
                if (c3 != ',') {
                    if (c3 != '/' && c3 != '=') {
                        if (c3 != '{' && c3 != '}' && c3 != ':') {
                            if (c3 != ';') {
                                switch (c3) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            c();
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String l() {
        return " at line " + (this.f1702r + 1) + " column " + ((this.f1700p - this.f1703s) + 1) + " path " + i();
    }

    public boolean m() {
        int i3 = this.f1704t;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 5) {
            this.f1704t = 0;
            int[] iArr = this.f1696A;
            int i4 = this.f1708y - 1;
            iArr[i4] = iArr[i4] + 1;
            return true;
        } else if (i3 == 6) {
            this.f1704t = 0;
            int[] iArr2 = this.f1696A;
            int i5 = this.f1708y - 1;
            iArr2[i5] = iArr2[i5] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + h.v(w()) + l());
        }
    }

    public double n() {
        char c3;
        int i3 = this.f1704t;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 15) {
            this.f1704t = 0;
            int[] iArr = this.f1696A;
            int i4 = this.f1708y - 1;
            iArr[i4] = iArr[i4] + 1;
            return this.f1705u;
        }
        if (i3 == 16) {
            this.f1707w = new String(this.f1699o, this.f1700p, this.f1706v);
            this.f1700p += this.f1706v;
        } else if (i3 != 8 && i3 != 9) {
            if (i3 == 10) {
                this.f1707w = v();
            } else if (i3 != 11) {
                throw new IllegalStateException("Expected a double but was " + h.v(w()) + l());
            }
        } else {
            if (i3 == 8) {
                c3 = '\'';
            } else {
                c3 = '\"';
            }
            this.f1707w = t(c3);
        }
        this.f1704t = 11;
        double parseDouble = Double.parseDouble(this.f1707w);
        if (!this.f1698n && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new IOException("JSON forbids NaN and infinities: " + parseDouble + l());
        }
        this.f1707w = null;
        this.f1704t = 0;
        int[] iArr2 = this.f1696A;
        int i5 = this.f1708y - 1;
        iArr2[i5] = iArr2[i5] + 1;
        return parseDouble;
    }

    public int o() {
        char c3;
        int i3 = this.f1704t;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 15) {
            long j3 = this.f1705u;
            int i4 = (int) j3;
            if (j3 == i4) {
                this.f1704t = 0;
                int[] iArr = this.f1696A;
                int i5 = this.f1708y - 1;
                iArr[i5] = iArr[i5] + 1;
                return i4;
            }
            throw new NumberFormatException("Expected an int but was " + this.f1705u + l());
        }
        if (i3 == 16) {
            this.f1707w = new String(this.f1699o, this.f1700p, this.f1706v);
            this.f1700p += this.f1706v;
        } else if (i3 != 8 && i3 != 9 && i3 != 10) {
            throw new IllegalStateException("Expected an int but was " + h.v(w()) + l());
        } else {
            if (i3 == 10) {
                this.f1707w = v();
            } else {
                if (i3 == 8) {
                    c3 = '\'';
                } else {
                    c3 = '\"';
                }
                this.f1707w = t(c3);
            }
            try {
                int parseInt = Integer.parseInt(this.f1707w);
                this.f1704t = 0;
                int[] iArr2 = this.f1696A;
                int i6 = this.f1708y - 1;
                iArr2[i6] = iArr2[i6] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f1704t = 11;
        double parseDouble = Double.parseDouble(this.f1707w);
        int i7 = (int) parseDouble;
        if (i7 == parseDouble) {
            this.f1707w = null;
            this.f1704t = 0;
            int[] iArr3 = this.f1696A;
            int i8 = this.f1708y - 1;
            iArr3[i8] = iArr3[i8] + 1;
            return i7;
        }
        throw new NumberFormatException("Expected an int but was " + this.f1707w + l());
    }

    public long p() {
        char c3;
        int i3 = this.f1704t;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 15) {
            this.f1704t = 0;
            int[] iArr = this.f1696A;
            int i4 = this.f1708y - 1;
            iArr[i4] = iArr[i4] + 1;
            return this.f1705u;
        }
        if (i3 == 16) {
            this.f1707w = new String(this.f1699o, this.f1700p, this.f1706v);
            this.f1700p += this.f1706v;
        } else if (i3 != 8 && i3 != 9 && i3 != 10) {
            throw new IllegalStateException("Expected a long but was " + h.v(w()) + l());
        } else {
            if (i3 == 10) {
                this.f1707w = v();
            } else {
                if (i3 == 8) {
                    c3 = '\'';
                } else {
                    c3 = '\"';
                }
                this.f1707w = t(c3);
            }
            try {
                long parseLong = Long.parseLong(this.f1707w);
                this.f1704t = 0;
                int[] iArr2 = this.f1696A;
                int i5 = this.f1708y - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f1704t = 11;
        double parseDouble = Double.parseDouble(this.f1707w);
        long j3 = (long) parseDouble;
        if (j3 == parseDouble) {
            this.f1707w = null;
            this.f1704t = 0;
            int[] iArr3 = this.f1696A;
            int i6 = this.f1708y - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return j3;
        }
        throw new NumberFormatException("Expected a long but was " + this.f1707w + l());
    }

    public String q() {
        String t3;
        int i3 = this.f1704t;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 14) {
            t3 = v();
        } else if (i3 == 12) {
            t3 = t('\'');
        } else if (i3 == 13) {
            t3 = t('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + h.v(w()) + l());
        }
        this.f1704t = 0;
        this.f1709z[this.f1708y - 1] = t3;
        return t3;
    }

    public final int r(boolean z3) {
        int i3 = this.f1700p;
        int i4 = this.f1701q;
        while (true) {
            if (i3 == i4) {
                this.f1700p = i3;
                if (!h(1)) {
                    if (!z3) {
                        return -1;
                    }
                    throw new EOFException("End of input" + l());
                }
                i3 = this.f1700p;
                i4 = this.f1701q;
            }
            int i5 = i3 + 1;
            char[] cArr = this.f1699o;
            char c3 = cArr[i3];
            if (c3 == '\n') {
                this.f1702r++;
                this.f1703s = i5;
            } else if (c3 != ' ' && c3 != '\r' && c3 != '\t') {
                if (c3 == '/') {
                    this.f1700p = i5;
                    if (i5 == i4) {
                        this.f1700p = i3;
                        boolean h3 = h(2);
                        this.f1700p++;
                        if (!h3) {
                            return c3;
                        }
                    }
                    c();
                    int i6 = this.f1700p;
                    char c4 = cArr[i6];
                    if (c4 != '*') {
                        if (c4 != '/') {
                            return c3;
                        }
                        this.f1700p = i6 + 1;
                        A();
                        i3 = this.f1700p;
                        i4 = this.f1701q;
                    } else {
                        this.f1700p = i6 + 1;
                        while (true) {
                            if (this.f1700p + 2 > this.f1701q && !h(2)) {
                                C("Unterminated comment");
                                throw null;
                            }
                            int i7 = this.f1700p;
                            if (cArr[i7] == '\n') {
                                this.f1702r++;
                                this.f1703s = i7 + 1;
                            } else {
                                for (int i8 = 0; i8 < 2; i8++) {
                                    if (cArr[this.f1700p + i8] != "*/".charAt(i8)) {
                                        break;
                                    }
                                }
                                i3 = this.f1700p + 2;
                                i4 = this.f1701q;
                                break;
                            }
                            this.f1700p++;
                        }
                    }
                } else if (c3 == '#') {
                    this.f1700p = i5;
                    c();
                    A();
                    i3 = this.f1700p;
                    i4 = this.f1701q;
                } else {
                    this.f1700p = i5;
                    return c3;
                }
            }
            i3 = i5;
        }
    }

    public void s() {
        int i3 = this.f1704t;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 7) {
            this.f1704t = 0;
            int[] iArr = this.f1696A;
            int i4 = this.f1708y - 1;
            iArr[i4] = iArr[i4] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + h.v(w()) + l());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
        r10.f1700p = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r1 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
        r1.append(r5, r3, r2 - r3);
        r10.f1700p = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String t(char r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r10.f1700p
            int r3 = r10.f1701q
        L6:
            r4 = r3
            r3 = r2
        L8:
            char[] r5 = r10.f1699o
            r6 = 1
            r7 = 16
            if (r2 >= r4) goto L5b
            int r8 = r2 + 1
            char r2 = r5[r2]
            if (r2 != r11) goto L29
            r10.f1700p = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L21
            java.lang.String r11 = new java.lang.String
            r11.<init>(r5, r3, r8)
            return r11
        L21:
            r1.append(r5, r3, r8)
            java.lang.String r11 = r1.toString()
            return r11
        L29:
            r9 = 92
            if (r2 != r9) goto L4e
            r10.f1700p = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L3f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r7)
            r1.<init>(r4)
        L3f:
            r1.append(r5, r3, r2)
            char r2 = r10.y()
            r1.append(r2)
            int r2 = r10.f1700p
            int r3 = r10.f1701q
            goto L6
        L4e:
            r5 = 10
            if (r2 != r5) goto L59
            int r2 = r10.f1702r
            int r2 = r2 + r6
            r10.f1702r = r2
            r10.f1703s = r8
        L59:
            r2 = r8
            goto L8
        L5b:
            if (r1 != 0) goto L6b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r7)
            r4.<init>(r1)
            r1 = r4
        L6b:
            int r4 = r2 - r3
            r1.append(r5, r3, r4)
            r10.f1700p = r2
            boolean r2 = r10.h(r6)
            if (r2 == 0) goto L79
            goto L2
        L79:
            java.lang.String r11 = "Unterminated string"
            r10.C(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.b.t(char):java.lang.String");
    }

    public String toString() {
        return getClass().getSimpleName() + l();
    }

    public String u() {
        String str;
        int i3 = this.f1704t;
        if (i3 == 0) {
            i3 = d();
        }
        if (i3 == 10) {
            str = v();
        } else if (i3 == 8) {
            str = t('\'');
        } else if (i3 == 9) {
            str = t('\"');
        } else if (i3 == 11) {
            str = this.f1707w;
            this.f1707w = null;
        } else if (i3 == 15) {
            str = Long.toString(this.f1705u);
        } else if (i3 == 16) {
            str = new String(this.f1699o, this.f1700p, this.f1706v);
            this.f1700p += this.f1706v;
        } else {
            throw new IllegalStateException("Expected a string but was " + h.v(w()) + l());
        }
        this.f1704t = 0;
        int[] iArr = this.f1696A;
        int i4 = this.f1708y - 1;
        iArr[i4] = iArr[i4] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        c();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String v() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r7.f1700p
            int r4 = r3 + r2
            int r5 = r7.f1701q
            char[] r6 = r7.f1699o
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.c()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.h(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f1700p
            r0.append(r6, r3, r2)
            int r3 = r7.f1700p
            int r3 = r3 + r2
            r7.f1700p = r3
            r2 = 1
            boolean r2 = r7.h(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f1700p
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f1700p
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f1700p
            int r2 = r2 + r1
            r7.f1700p = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.b.v():java.lang.String");
    }

    public int w() {
        int i3 = this.f1704t;
        if (i3 == 0) {
            i3 = d();
        }
        switch (i3) {
            case 1:
                return 3;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                return 4;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return 1;
            case k.LONG_FIELD_NUMBER /* 4 */:
                return 2;
            case k.STRING_FIELD_NUMBER /* 5 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                return 8;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                return 9;
            case k.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void x(int i3) {
        int i4 = this.f1708y;
        int[] iArr = this.x;
        if (i4 == iArr.length) {
            int i5 = i4 * 2;
            this.x = Arrays.copyOf(iArr, i5);
            this.f1696A = Arrays.copyOf(this.f1696A, i5);
            this.f1709z = (String[]) Arrays.copyOf(this.f1709z, i5);
        }
        int[] iArr2 = this.x;
        int i6 = this.f1708y;
        this.f1708y = i6 + 1;
        iArr2[i6] = i3;
    }

    public final char y() {
        int i3;
        if (this.f1700p == this.f1701q && !h(1)) {
            C("Unterminated escape sequence");
            throw null;
        }
        int i4 = this.f1700p;
        int i5 = i4 + 1;
        this.f1700p = i5;
        char[] cArr = this.f1699o;
        char c3 = cArr[i4];
        if (c3 != '\n') {
            if (c3 != '\"' && c3 != '\'' && c3 != '/' && c3 != '\\') {
                if (c3 != 'b') {
                    if (c3 != 'f') {
                        if (c3 == 'n') {
                            return '\n';
                        }
                        if (c3 != 'r') {
                            if (c3 != 't') {
                                if (c3 == 'u') {
                                    if (i4 + 5 > this.f1701q && !h(4)) {
                                        C("Unterminated escape sequence");
                                        throw null;
                                    }
                                    int i6 = this.f1700p;
                                    int i7 = i6 + 4;
                                    char c4 = 0;
                                    while (i6 < i7) {
                                        char c5 = cArr[i6];
                                        char c6 = (char) (c4 << 4);
                                        if (c5 >= '0' && c5 <= '9') {
                                            i3 = c5 - '0';
                                        } else if (c5 >= 'a' && c5 <= 'f') {
                                            i3 = c5 - 'W';
                                        } else if (c5 >= 'A' && c5 <= 'F') {
                                            i3 = c5 - '7';
                                        } else {
                                            throw new NumberFormatException("\\u".concat(new String(cArr, this.f1700p, 4)));
                                        }
                                        c4 = (char) (i3 + c6);
                                        i6++;
                                    }
                                    this.f1700p += 4;
                                    return c4;
                                }
                                C("Invalid escape sequence");
                                throw null;
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
        } else {
            this.f1702r++;
            this.f1703s = i5;
        }
        return c3;
    }

    public final void z(char c3) {
        do {
            int i3 = this.f1700p;
            int i4 = this.f1701q;
            while (i3 < i4) {
                int i5 = i3 + 1;
                char c4 = this.f1699o[i3];
                if (c4 == c3) {
                    this.f1700p = i5;
                    return;
                } else if (c4 == '\\') {
                    this.f1700p = i5;
                    y();
                    i3 = this.f1700p;
                    i4 = this.f1701q;
                } else {
                    if (c4 == '\n') {
                        this.f1702r++;
                        this.f1703s = i5;
                    }
                    i3 = i5;
                }
            }
            this.f1700p = i3;
        } while (h(1));
        C("Unterminated string");
        throw null;
    }
}
