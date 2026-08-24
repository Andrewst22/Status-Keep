package Q1;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
/* loaded from: classes.dex */
public class c implements Closeable, Flushable {

    /* renamed from: u  reason: collision with root package name */
    public static final String[] f1710u = new String[128];

    /* renamed from: v  reason: collision with root package name */
    public static final String[] f1711v;

    /* renamed from: m  reason: collision with root package name */
    public final Writer f1712m;

    /* renamed from: n  reason: collision with root package name */
    public int[] f1713n;

    /* renamed from: o  reason: collision with root package name */
    public int f1714o;

    /* renamed from: p  reason: collision with root package name */
    public final String f1715p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1716q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1717r;

    /* renamed from: s  reason: collision with root package name */
    public String f1718s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1719t;

    static {
        for (int i3 = 0; i3 <= 31; i3++) {
            f1710u[i3] = String.format("\\u%04x", Integer.valueOf(i3));
        }
        String[] strArr = f1710u;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f1711v = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArr = new int[32];
        this.f1713n = iArr;
        this.f1714o = 0;
        if (iArr.length == 0) {
            this.f1713n = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f1713n;
        int i3 = this.f1714o;
        this.f1714o = i3 + 1;
        iArr2[i3] = 6;
        this.f1715p = ":";
        this.f1719t = true;
        if (writer != null) {
            this.f1712m = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    public final void a() {
        int k3 = k();
        if (k3 != 1) {
            Writer writer = this.f1712m;
            if (k3 != 2) {
                if (k3 != 4) {
                    if (k3 != 6) {
                        if (k3 == 7) {
                            if (!this.f1716q) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    this.f1713n[this.f1714o - 1] = 7;
                    return;
                }
                writer.append((CharSequence) this.f1715p);
                this.f1713n[this.f1714o - 1] = 5;
                return;
            }
            writer.append(',');
            i();
            return;
        }
        this.f1713n[this.f1714o - 1] = 2;
        i();
    }

    public void b() {
        r();
        a();
        int i3 = this.f1714o;
        int[] iArr = this.f1713n;
        if (i3 == iArr.length) {
            this.f1713n = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.f1713n;
        int i4 = this.f1714o;
        this.f1714o = i4 + 1;
        iArr2[i4] = 1;
        this.f1712m.write(91);
    }

    public void c() {
        r();
        a();
        int i3 = this.f1714o;
        int[] iArr = this.f1713n;
        if (i3 == iArr.length) {
            this.f1713n = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.f1713n;
        int i4 = this.f1714o;
        this.f1714o = i4 + 1;
        iArr2[i4] = 3;
        this.f1712m.write(123);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f1712m.close();
        int i3 = this.f1714o;
        if (i3 <= 1 && (i3 != 1 || this.f1713n[i3 - 1] == 7)) {
            this.f1714o = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final void d(int i3, int i4, char c3) {
        int k3 = k();
        if (k3 != i4 && k3 != i3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f1718s == null) {
            this.f1714o--;
            if (k3 == i4) {
                i();
            }
            this.f1712m.write(c3);
            return;
        }
        throw new IllegalStateException("Dangling name: " + this.f1718s);
    }

    public void f() {
        d(1, 2, ']');
    }

    public void flush() {
        if (this.f1714o != 0) {
            this.f1712m.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public void g() {
        d(3, 5, '}');
    }

    public void h(String str) {
        if (str != null) {
            if (this.f1718s == null) {
                if (this.f1714o != 0) {
                    this.f1718s = str;
                    return;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    public c j() {
        if (this.f1718s != null) {
            if (this.f1719t) {
                r();
            } else {
                this.f1718s = null;
                return this;
            }
        }
        a();
        this.f1712m.write("null");
        return this;
    }

    public final int k() {
        int i3 = this.f1714o;
        if (i3 != 0) {
            return this.f1713n[i3 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f1717r
            if (r0 == 0) goto L7
            java.lang.String[] r0 = Q1.c.f1711v
            goto L9
        L7:
            java.lang.String[] r0 = Q1.c.f1710u
        L9:
            java.io.Writer r1 = r8.f1712m
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = 0
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.794E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.c.l(java.lang.String):void");
    }

    public void m(long j3) {
        r();
        a();
        this.f1712m.write(Long.toString(j3));
    }

    public void n(Boolean bool) {
        String str;
        if (bool == null) {
            j();
            return;
        }
        r();
        a();
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        this.f1712m.write(str);
    }

    public void o(Number number) {
        if (number == null) {
            j();
            return;
        }
        r();
        String obj = number.toString();
        if (!this.f1716q && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        a();
        this.f1712m.append((CharSequence) obj);
    }

    public void p(String str) {
        if (str == null) {
            j();
            return;
        }
        r();
        a();
        l(str);
    }

    public void q(boolean z3) {
        String str;
        r();
        a();
        if (z3) {
            str = "true";
        } else {
            str = "false";
        }
        this.f1712m.write(str);
    }

    public final void r() {
        if (this.f1718s != null) {
            int k3 = k();
            if (k3 == 5) {
                this.f1712m.write(44);
            } else if (k3 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            i();
            this.f1713n[this.f1714o - 1] = 4;
            l(this.f1718s);
            this.f1718s = null;
        }
    }

    public final void i() {
    }
}
