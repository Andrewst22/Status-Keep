package V;

import U.AbstractC0123a;
import U.s;
import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f2652a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f2653b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c  reason: collision with root package name */
    public static final Object f2654c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static int[] f2655d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i3, int i4, boolean[] zArr) {
        boolean z3;
        boolean z4;
        boolean z5;
        int i5 = i4 - i3;
        boolean z6 = false;
        if (i5 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        if (i5 == 0) {
            return i4;
        }
        if (zArr[0]) {
            a(zArr);
            return i3 - 3;
        } else if (i5 > 1 && zArr[1] && bArr[i3] == 1) {
            a(zArr);
            return i3 - 2;
        } else if (i5 > 2 && zArr[2] && bArr[i3] == 0 && bArr[i3 + 1] == 1) {
            a(zArr);
            return i3 - 1;
        } else {
            int i6 = i4 - 1;
            int i7 = i3 + 2;
            while (i7 < i6) {
                byte b3 = bArr[i7];
                if ((b3 & 254) == 0) {
                    int i8 = i7 - 2;
                    if (bArr[i8] == 0 && bArr[i7 - 1] == 0 && b3 == 1) {
                        a(zArr);
                        return i8;
                    }
                    i7 -= 2;
                }
                i7 += 3;
            }
            if (i5 <= 2 ? !(i5 != 2 ? !zArr[1] || bArr[i6] != 1 : !zArr[2] || bArr[i4 - 2] != 0 || bArr[i6] != 1) : !(bArr[i4 - 3] != 0 || bArr[i4 - 2] != 0 || bArr[i6] != 1)) {
                z4 = true;
            } else {
                z4 = false;
            }
            zArr[0] = z4;
            if (i5 <= 1 ? !(!zArr[2] || bArr[i6] != 0) : !(bArr[i4 - 2] != 0 || bArr[i6] != 0)) {
                z5 = true;
            } else {
                z5 = false;
            }
            zArr[1] = z5;
            if (bArr[i6] == 0) {
                z6 = true;
            }
            zArr[2] = z6;
            return i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0348  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static V.d c(byte[] r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V.g.c(byte[], int, int):V.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static V.f d(byte[] r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V.g.d(byte[], int, int):V.f");
    }

    public static void e(s sVar) {
        int m3 = sVar.m() + 1;
        sVar.t(8);
        for (int i3 = 0; i3 < m3; i3++) {
            sVar.m();
            sVar.m();
            sVar.s();
        }
        sVar.t(20);
    }

    public static int f(byte[] bArr, int i3) {
        int i4;
        synchronized (f2654c) {
            int i5 = 0;
            int i6 = 0;
            while (i5 < i3) {
                while (true) {
                    if (i5 < i3 - 2) {
                        try {
                            if (bArr[i5] == 0 && bArr[i5 + 1] == 0 && bArr[i5 + 2] == 3) {
                                break;
                            }
                            i5++;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        i5 = i3;
                        break;
                    }
                }
                if (i5 < i3) {
                    int[] iArr = f2655d;
                    if (iArr.length <= i6) {
                        f2655d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f2655d[i6] = i5;
                    i5 += 3;
                    i6++;
                }
            }
            i4 = i3 - i6;
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < i6; i9++) {
                int i10 = f2655d[i9] - i8;
                System.arraycopy(bArr, i8, bArr, i7, i10);
                int i11 = i7 + i10;
                int i12 = i11 + 1;
                bArr[i11] = 0;
                i7 = i11 + 2;
                bArr[i12] = 0;
                i8 += i10 + 3;
            }
            System.arraycopy(bArr, i8, bArr, i7, i4 - i7);
        }
        return i4;
    }
}
