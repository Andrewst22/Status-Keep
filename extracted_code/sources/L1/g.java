package L1;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class g extends Q1.b {

    /* renamed from: F  reason: collision with root package name */
    public static final f f890F = new f();

    /* renamed from: G  reason: collision with root package name */
    public static final Object f891G = new Object();

    /* renamed from: B  reason: collision with root package name */
    public Object[] f892B;

    /* renamed from: C  reason: collision with root package name */
    public int f893C;

    /* renamed from: D  reason: collision with root package name */
    public String[] f894D;

    /* renamed from: E  reason: collision with root package name */
    public int[] f895E;

    @Override // Q1.b
    public final void B() {
        if (w() == 5) {
            q();
            this.f894D[this.f893C - 2] = "null";
        } else {
            G();
            int i3 = this.f893C;
            if (i3 > 0) {
                this.f894D[i3 - 1] = "null";
            }
        }
        int i4 = this.f893C;
        if (i4 > 0) {
            int[] iArr = this.f895E;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
        }
    }

    public final void D(int i3) {
        if (w() == i3) {
            return;
        }
        throw new IllegalStateException("Expected " + D2.h.v(i3) + " but was " + D2.h.v(w()) + E());
    }

    public final String E() {
        return " at path " + i();
    }

    public final Object F() {
        return this.f892B[this.f893C - 1];
    }

    public final Object G() {
        Object[] objArr = this.f892B;
        int i3 = this.f893C - 1;
        this.f893C = i3;
        Object obj = objArr[i3];
        objArr[i3] = null;
        return obj;
    }

    public final void H(Object obj) {
        int i3 = this.f893C;
        Object[] objArr = this.f892B;
        if (i3 == objArr.length) {
            int i4 = i3 * 2;
            this.f892B = Arrays.copyOf(objArr, i4);
            this.f895E = Arrays.copyOf(this.f895E, i4);
            this.f894D = (String[]) Arrays.copyOf(this.f894D, i4);
        }
        Object[] objArr2 = this.f892B;
        int i5 = this.f893C;
        this.f893C = i5 + 1;
        objArr2[i5] = obj;
    }

    @Override // Q1.b
    public final void a() {
        D(1);
        H(((I1.l) F()).f474m.iterator());
        this.f895E[this.f893C - 1] = 0;
    }

    @Override // Q1.b
    public final void b() {
        D(3);
        H(((K1.k) ((I1.p) F()).f476m.entrySet()).iterator());
    }

    @Override // Q1.b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f892B = new Object[]{f891G};
        this.f893C = 1;
    }

    @Override // Q1.b
    public final void f() {
        D(2);
        G();
        G();
        int i3 = this.f893C;
        if (i3 > 0) {
            int[] iArr = this.f895E;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    @Override // Q1.b
    public final void g() {
        D(4);
        G();
        G();
        int i3 = this.f893C;
        if (i3 > 0) {
            int[] iArr = this.f895E;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    @Override // Q1.b
    public final String i() {
        StringBuilder sb = new StringBuilder("$");
        int i3 = 0;
        while (true) {
            int i4 = this.f893C;
            if (i3 < i4) {
                Object[] objArr = this.f892B;
                Object obj = objArr[i3];
                if (obj instanceof I1.l) {
                    i3++;
                    if (i3 < i4 && (objArr[i3] instanceof Iterator)) {
                        sb.append('[');
                        sb.append(this.f895E[i3]);
                        sb.append(']');
                    }
                } else if ((obj instanceof I1.p) && (i3 = i3 + 1) < i4 && (objArr[i3] instanceof Iterator)) {
                    sb.append('.');
                    String str = this.f894D[i3];
                    if (str != null) {
                        sb.append(str);
                    }
                }
                i3++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override // Q1.b
    public final boolean j() {
        int w3 = w();
        if (w3 != 4 && w3 != 2) {
            return true;
        }
        return false;
    }

    @Override // Q1.b
    public final boolean m() {
        D(8);
        boolean a3 = ((I1.q) G()).a();
        int i3 = this.f893C;
        if (i3 > 0) {
            int[] iArr = this.f895E;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
        return a3;
    }

    @Override // Q1.b
    public final double n() {
        double parseDouble;
        int w3 = w();
        if (w3 != 7 && w3 != 6) {
            throw new IllegalStateException("Expected " + D2.h.v(7) + " but was " + D2.h.v(w3) + E());
        }
        I1.q qVar = (I1.q) F();
        if (qVar.f477m instanceof Number) {
            parseDouble = qVar.d().doubleValue();
        } else {
            parseDouble = Double.parseDouble(qVar.c());
        }
        if (!this.f1698n && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + parseDouble);
        }
        G();
        int i3 = this.f893C;
        if (i3 > 0) {
            int[] iArr = this.f895E;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
        return parseDouble;
    }

    @Override // Q1.b
    public final int o() {
        int parseInt;
        int w3 = w();
        if (w3 != 7 && w3 != 6) {
            throw new IllegalStateException("Expected " + D2.h.v(7) + " but was " + D2.h.v(w3) + E());
        }
        I1.q qVar = (I1.q) F();
        if (qVar.f477m instanceof Number) {
            parseInt = qVar.d().intValue();
        } else {
            parseInt = Integer.parseInt(qVar.c());
        }
        G();
        int i3 = this.f893C;
        if (i3 > 0) {
            int[] iArr = this.f895E;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
        return parseInt;
    }

    @Override // Q1.b
    public final long p() {
        long parseLong;
        int w3 = w();
        if (w3 != 7 && w3 != 6) {
            throw new IllegalStateException("Expected " + D2.h.v(7) + " but was " + D2.h.v(w3) + E());
        }
        I1.q qVar = (I1.q) F();
        if (qVar.f477m instanceof Number) {
            parseLong = qVar.d().longValue();
        } else {
            parseLong = Long.parseLong(qVar.c());
        }
        G();
        int i3 = this.f893C;
        if (i3 > 0) {
            int[] iArr = this.f895E;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
        return parseLong;
    }

    @Override // Q1.b
    public final String q() {
        D(5);
        Map.Entry entry = (Map.Entry) ((Iterator) F()).next();
        String str = (String) entry.getKey();
        this.f894D[this.f893C - 1] = str;
        H(entry.getValue());
        return str;
    }

    @Override // Q1.b
    public final void s() {
        D(9);
        G();
        int i3 = this.f893C;
        if (i3 > 0) {
            int[] iArr = this.f895E;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    @Override // Q1.b
    public final String toString() {
        return g.class.getSimpleName() + E();
    }

    @Override // Q1.b
    public final String u() {
        int w3 = w();
        if (w3 != 6 && w3 != 7) {
            throw new IllegalStateException("Expected " + D2.h.v(6) + " but was " + D2.h.v(w3) + E());
        }
        String c3 = ((I1.q) G()).c();
        int i3 = this.f893C;
        if (i3 > 0) {
            int[] iArr = this.f895E;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
        return c3;
    }

    @Override // Q1.b
    public final int w() {
        if (this.f893C == 0) {
            return 10;
        }
        Object F3 = F();
        if (F3 instanceof Iterator) {
            boolean z3 = this.f892B[this.f893C - 2] instanceof I1.p;
            Iterator it = (Iterator) F3;
            if (it.hasNext()) {
                if (z3) {
                    return 5;
                }
                H(it.next());
                return w();
            } else if (!z3) {
                return 2;
            } else {
                return 4;
            }
        } else if (F3 instanceof I1.p) {
            return 3;
        } else {
            if (F3 instanceof I1.l) {
                return 1;
            }
            if (F3 instanceof I1.q) {
                Serializable serializable = ((I1.q) F3).f477m;
                if (serializable instanceof String) {
                    return 6;
                }
                if (serializable instanceof Boolean) {
                    return 8;
                }
                if (serializable instanceof Number) {
                    return 7;
                }
                throw new AssertionError();
            } else if (F3 instanceof I1.o) {
                return 9;
            } else {
                if (F3 == f891G) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }
}
