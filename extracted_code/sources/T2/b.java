package T2;

import a.AbstractC0155a;
import java.io.Serializable;
import java.util.Arrays;
import n2.AbstractC0664g;
/* loaded from: classes.dex */
public class b implements Serializable, Comparable {

    /* renamed from: p  reason: collision with root package name */
    public static final b f2354p = new b(new byte[0]);

    /* renamed from: m  reason: collision with root package name */
    public final byte[] f2355m;

    /* renamed from: n  reason: collision with root package name */
    public transient int f2356n;

    /* renamed from: o  reason: collision with root package name */
    public transient String f2357o;

    public b(byte[] bArr) {
        D2.i.e(bArr, "data");
        this.f2355m = bArr;
    }

    public static int e(b bVar, b bVar2) {
        bVar.getClass();
        D2.i.e(bVar2, "other");
        return bVar.d(bVar2.f2355m, 0);
    }

    public static int i(b bVar, b bVar2) {
        bVar.getClass();
        D2.i.e(bVar2, "other");
        return bVar.h(bVar2.f2355m, -1234567890);
    }

    public static /* synthetic */ b m(b bVar, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i3 = 0;
        }
        if ((i5 & 2) != 0) {
            i4 = -1234567890;
        }
        return bVar.l(i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(T2.b r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            D2.i.e(r10, r0)
            int r0 = r9.b()
            int r1 = r10.b()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.g(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.g(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = -1
            goto L34
        L2c:
            r3 = 1
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.b.compareTo(T2.b):int");
    }

    public int b() {
        return this.f2355m.length;
    }

    public String c() {
        byte[] bArr = this.f2355m;
        char[] cArr = new char[bArr.length * 2];
        int i3 = 0;
        for (byte b3 : bArr) {
            int i4 = i3 + 1;
            char[] cArr2 = U2.a.f2581a;
            cArr[i3] = cArr2[(b3 >> 4) & 15];
            i3 += 2;
            cArr[i4] = cArr2[b3 & 15];
        }
        return new String(cArr);
    }

    public int d(byte[] bArr, int i3) {
        D2.i.e(bArr, "other");
        byte[] bArr2 = this.f2355m;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i3, 0);
        if (max <= length) {
            while (!AbstractC0155a.e(max, 0, bArr.length, bArr2, bArr)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int b3 = bVar.b();
            byte[] bArr = this.f2355m;
            if (b3 == bArr.length && bVar.j(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public byte[] f() {
        return this.f2355m;
    }

    public byte g(int i3) {
        return this.f2355m[i3];
    }

    public int h(byte[] bArr, int i3) {
        D2.i.e(bArr, "other");
        if (i3 == -1234567890) {
            i3 = b();
        }
        byte[] bArr2 = this.f2355m;
        for (int min = Math.min(i3, bArr2.length - bArr.length); -1 < min; min--) {
            if (AbstractC0155a.e(min, 0, bArr.length, bArr2, bArr)) {
                return min;
            }
        }
        return -1;
    }

    public int hashCode() {
        int i3 = this.f2356n;
        if (i3 == 0) {
            int hashCode = Arrays.hashCode(this.f2355m);
            this.f2356n = hashCode;
            return hashCode;
        }
        return i3;
    }

    public boolean j(int i3, int i4, int i5, byte[] bArr) {
        D2.i.e(bArr, "other");
        if (i3 >= 0) {
            byte[] bArr2 = this.f2355m;
            if (i3 <= bArr2.length - i5 && i4 >= 0 && i4 <= bArr.length - i5 && AbstractC0155a.e(i3, i4, i5, bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public boolean k(int i3, b bVar, int i4) {
        D2.i.e(bVar, "other");
        return bVar.j(0, i3, i4, this.f2355m);
    }

    public b l(int i3, int i4) {
        if (i4 == -1234567890) {
            i4 = b();
        }
        if (i3 >= 0) {
            byte[] bArr = this.f2355m;
            if (i4 <= bArr.length) {
                if (i4 - i3 >= 0) {
                    if (i3 == 0 && i4 == bArr.length) {
                        return this;
                    }
                    AbstractC0664g.e(i4, bArr.length);
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, i3, i4);
                    D2.i.d(copyOfRange, "copyOfRange(...)");
                    return new b(copyOfRange);
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public final String n() {
        String str = this.f2357o;
        if (str == null) {
            byte[] f3 = f();
            D2.i.e(f3, "<this>");
            String str2 = new String(f3, J2.a.f495a);
            this.f2357o = str2;
            return str2;
        }
        return str;
    }

    public void o(a aVar, int i3) {
        D2.i.e(aVar, "buffer");
        aVar.n(this.f2355m, 0, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0120, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0124, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0130, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x015c, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0163, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x016a, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x019b, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x019e, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x01a1, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x01a4, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007a, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008b, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00b6, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00c8, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00e8, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f0, code lost:
        if (r6 == 64) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.b.toString():java.lang.String");
    }
}
