package w0;

import U.AbstractC0123a;
import android.util.Base64;
import g2.C0276a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k0.C0558m;
/* renamed from: w0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0892b {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f9532a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f9533b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f9534c = {1, 2, 3, 6};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f9535d = {48000, 44100, 32000};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f9536e = {24000, 22050, 16000};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f9537f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f9538g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f9539h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f9540i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f9541j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f9542k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f9543l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f9544m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f9545n = {5, 8, 10, 12};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f9546o = {6, 9, 12, 15};

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f9547p = {2, 4, 6, 8};

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f9548q = {9, 11, 13, 16};

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f9549r = {5, 8, 10, 12};

    /* renamed from: s  reason: collision with root package name */
    public static final String[] f9550s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f9551t = {44100, 48000, 32000};

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f9552u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f9553v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f9554w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f9555y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static byte[] a(int i3, int i4) {
        int i5 = -1;
        for (int i6 = 0; i6 < 13; i6++) {
            if (i3 == f9532a[i6]) {
                i5 = i6;
            }
        }
        int i7 = -1;
        for (int i8 = 0; i8 < 16; i8++) {
            if (i4 == f9533b[i8]) {
                i7 = i8;
            }
        }
        if (i3 != -1 && i7 != -1) {
            return b(2, i5, i7);
        }
        throw new IllegalArgumentException(D2.h.j(i3, i4, "Invalid sample rate or number of channels: ", ", "));
    }

    public static byte[] b(int i3, int i4, int i5) {
        return new byte[]{(byte) (((i3 << 3) & 248) | ((i4 >> 1) & 7)), (byte) (((i4 << 7) & 128) | ((i5 << 3) & 120))};
    }

    public static ArrayList c(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(((((bArr[11] & 255) << 8) | (bArr[10] & 255)) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
        if (r12 == r19.f9629f) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0093, code lost:
        if ((r18.u() * 1000) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a2, code lost:
        if (r6 == r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(U.t r18, w0.t r19, int r20, R.r r21) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.AbstractC0892b.d(U.t, w0.t, int, R.r):boolean");
    }

    public static void e(String str, boolean z3) {
        if (z3) {
            return;
        }
        throw R.H.a(null, str);
    }

    public static void f(long j3, U.t tVar, G[] gArr) {
        int i3;
        int i4;
        boolean z3;
        while (true) {
            boolean z4 = true;
            if (tVar.a() > 1) {
                int i5 = 0;
                while (true) {
                    if (tVar.a() == 0) {
                        i3 = -1;
                        break;
                    }
                    int u3 = tVar.u();
                    i5 += u3;
                    if (u3 != 255) {
                        i3 = i5;
                        break;
                    }
                }
                int i6 = 0;
                while (true) {
                    if (tVar.a() == 0) {
                        i6 = -1;
                        break;
                    }
                    int u4 = tVar.u();
                    i6 += u4;
                    if (u4 != 255) {
                        break;
                    }
                }
                int i7 = tVar.f2478b + i6;
                if (i6 != -1 && i6 <= tVar.a()) {
                    if (i3 == 4 && i6 >= 8) {
                        int u5 = tVar.u();
                        int A3 = tVar.A();
                        if (A3 == 49) {
                            i4 = tVar.h();
                        } else {
                            i4 = 0;
                        }
                        int u6 = tVar.u();
                        if (A3 == 47) {
                            tVar.H(1);
                        }
                        if (u5 == 181 && ((A3 == 49 || A3 == 47) && u6 == 3)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (A3 == 49) {
                            if (i4 != 1195456820) {
                                z4 = false;
                            }
                            z3 &= z4;
                        }
                        if (z3) {
                            g(j3, tVar, gArr);
                        }
                    }
                } else {
                    AbstractC0123a.A("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i7 = tVar.f2479c;
                }
                tVar.G(i7);
            } else {
                return;
            }
        }
    }

    public static void g(long j3, U.t tVar, G[] gArr) {
        boolean z3;
        int u3 = tVar.u();
        if ((u3 & 64) != 0) {
            tVar.H(1);
            int i3 = (u3 & 31) * 3;
            int i4 = tVar.f2478b;
            for (G g3 : gArr) {
                tVar.G(i4);
                g3.f(i3, tVar);
                if (j3 != -9223372036854775807L) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                AbstractC0123a.j(z3);
                g3.b(j3, 1, i3, 0, null);
            }
        }
    }

    public static int h(int i3, int i4) {
        int i5 = i4 / 2;
        if (i3 >= 0 && i3 < 3 && i4 >= 0 && i5 < 19) {
            int i6 = f9535d[i3];
            if (i6 == 44100) {
                return ((i4 % 2) + f9539h[i5]) * 2;
            }
            int i7 = f9538g[i5];
            if (i6 == 32000) {
                return i7 * 6;
            }
            return i7 * 4;
        }
        return -1;
    }

    public static void i(int i3, U.t tVar) {
        tVar.D(7);
        byte[] bArr = tVar.f2477a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i3 >> 16) & 255);
        bArr[5] = (byte) ((i3 >> 8) & 255);
        bArr[6] = (byte) (i3 & 255);
    }

    public static int j(int i3) {
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if ((i3 & (-2097152)) == -2097152) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 || (i4 = (i3 >>> 19) & 3) == 1 || (i5 = (i3 >>> 17) & 3) == 0 || (i6 = (i3 >>> 12) & 15) == 0 || i6 == 15 || (i7 = (i3 >>> 10) & 3) == 3) {
            return -1;
        }
        int i10 = f9551t[i7];
        if (i4 == 2) {
            i10 /= 2;
        } else if (i4 == 0) {
            i10 /= 4;
        }
        int i11 = (i3 >>> 9) & 1;
        if (i5 == 3) {
            if (i4 == 3) {
                i9 = f9552u[i6 - 1];
            } else {
                i9 = f9553v[i6 - 1];
            }
            return (((i9 * 12) / i10) + i11) * 4;
        }
        if (i4 == 3) {
            if (i5 == 2) {
                i8 = f9554w[i6 - 1];
            } else {
                i8 = x[i6 - 1];
            }
        } else {
            i8 = f9555y[i6 - 1];
        }
        int i12 = 144;
        if (i4 == 3) {
            return ((i8 * 144) / i10) + i11;
        }
        if (i5 == 1) {
            i12 = 72;
        }
        return ((i12 * i8) / i10) + i11;
    }

    public static U.s k(byte[] bArr) {
        byte b3 = bArr[0];
        if (b3 != Byte.MAX_VALUE && b3 != 100 && b3 != 64 && b3 != 113) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b4 = copyOf[0];
            if (b4 == -2 || b4 == -1 || b4 == 37 || b4 == -14 || b4 == -24) {
                for (int i3 = 0; i3 < copyOf.length - 1; i3 += 2) {
                    byte b5 = copyOf[i3];
                    int i4 = i3 + 1;
                    copyOf[i3] = copyOf[i4];
                    copyOf[i4] = b5;
                }
            }
            U.s sVar = new U.s(copyOf, copyOf.length);
            if (copyOf[0] == 31) {
                U.s sVar2 = new U.s(copyOf, copyOf.length);
                while (sVar2.b() >= 16) {
                    sVar2.t(2);
                    int i5 = sVar2.i(14) & 16383;
                    int min = Math.min(8 - sVar.f2471c, 14);
                    int i6 = sVar.f2471c;
                    int i7 = (8 - i6) - min;
                    byte[] bArr2 = sVar.f2472d;
                    int i8 = sVar.f2470b;
                    byte b6 = (byte) (((65280 >> i6) | ((1 << i7) - 1)) & bArr2[i8]);
                    bArr2[i8] = b6;
                    int i9 = 14 - min;
                    bArr2[i8] = (byte) (b6 | ((i5 >>> i9) << i7));
                    int i10 = i8 + 1;
                    while (i9 > 8) {
                        sVar.f2472d[i10] = (byte) (i5 >>> (i9 - 8));
                        i9 -= 8;
                        i10++;
                    }
                    int i11 = 8 - i9;
                    byte[] bArr3 = sVar.f2472d;
                    byte b7 = (byte) (bArr3[i10] & ((1 << i11) - 1));
                    bArr3[i10] = b7;
                    bArr3[i10] = (byte) (((i5 & ((1 << i9) - 1)) << i11) | b7);
                    sVar.t(14);
                    sVar.a();
                }
            }
            sVar.p(copyOf, copyOf.length);
            return sVar;
        }
        return new U.s(bArr, bArr.length);
    }

    public static long l(byte b3, byte b4) {
        int i3;
        int i4;
        int i5 = b3 & 255;
        int i6 = b3 & 3;
        if (i6 != 0) {
            i3 = 2;
            if (i6 != 1 && i6 != 2) {
                i3 = b4 & 63;
            }
        } else {
            i3 = 1;
        }
        int i7 = i5 >> 3;
        int i8 = i7 & 3;
        if (i7 >= 16) {
            i4 = 2500 << i8;
        } else if (i7 >= 12) {
            i4 = 10000 << (i7 & 1);
        } else if (i8 == 3) {
            i4 = 60000;
        } else {
            i4 = 10000 << i8;
        }
        return i3 * i4;
    }

    public static int m(U.s sVar) {
        int i3 = sVar.i(4);
        if (i3 == 15) {
            if (sVar.b() >= 24) {
                return sVar.i(24);
            }
            throw R.H.a(null, "AAC header insufficient data");
        } else if (i3 < 13) {
            return f9532a[i3];
        } else {
            throw R.H.a(null, "AAC header wrong Sampling Frequency Index");
        }
    }

    public static int n(int i3) {
        int i4 = 0;
        while (i3 > 0) {
            i4++;
            i3 >>>= 1;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static w0.C0893c o(U.s r21) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.AbstractC0892b.o(U.s):w0.c");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
        if (r9 != 11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
        if (r9 != 11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
        if (r9 != 8) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static i1.C0308g p(U.s r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = 4
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L47
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L47
            r9.t(r1)
        L47:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L57
            r5 = 48000(0xbb80, float:6.7262E-41)
            goto L5a
        L57:
            r5 = 44100(0xac44, float:6.1797E-41)
        L5a:
            int r9 = r9.i(r3)
            int[] r8 = w0.AbstractC0892b.f9540i
            if (r5 != r6) goto L69
            r6 = 13
            if (r9 != r6) goto L69
            r9 = r8[r9]
            goto L97
        L69:
            if (r5 != r7) goto L96
            r6 = 14
            if (r9 >= r6) goto L96
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L8f
            r7 = 11
            if (r2 == r1) goto L8a
            if (r2 == r4) goto L8f
            if (r2 == r3) goto L81
            goto L94
        L81:
            if (r9 == r4) goto L87
            if (r9 == r8) goto L87
            if (r9 != r7) goto L94
        L87:
            int r9 = r6 + 1
            goto L97
        L8a:
            if (r9 == r8) goto L87
            if (r9 != r7) goto L94
            goto L87
        L8f:
            if (r9 == r4) goto L87
            if (r9 != r8) goto L94
            goto L87
        L94:
            r9 = r6
            goto L97
        L96:
            r9 = 0
        L97:
            i1.g r1 = new i1.g
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.AbstractC0892b.p(U.s):i1.g");
    }

    public static C0891a q(U.s sVar, boolean z3) {
        int i3 = sVar.i(5);
        if (i3 == 31) {
            i3 = sVar.i(6) + 32;
        }
        int m3 = m(sVar);
        int i4 = sVar.i(4);
        String k3 = D2.h.k("mp4a.40.", i3);
        if (i3 == 5 || i3 == 29) {
            m3 = m(sVar);
            int i5 = sVar.i(5);
            if (i5 == 31) {
                i5 = sVar.i(6) + 32;
            }
            i3 = i5;
            if (i3 == 22) {
                i4 = sVar.i(4);
            }
        }
        if (z3) {
            if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4 && i3 != 6 && i3 != 7 && i3 != 17) {
                switch (i3) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw R.H.c("Unsupported audio object type: " + i3);
                }
            }
            if (sVar.h()) {
                AbstractC0123a.A("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (sVar.h()) {
                sVar.t(14);
            }
            boolean h3 = sVar.h();
            if (i4 != 0) {
                if (i3 == 6 || i3 == 20) {
                    sVar.t(3);
                }
                if (h3) {
                    if (i3 == 22) {
                        sVar.t(16);
                    }
                    if (i3 == 17 || i3 == 19 || i3 == 20 || i3 == 23) {
                        sVar.t(3);
                    }
                    sVar.t(1);
                }
                switch (i3) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int i6 = sVar.i(2);
                        if (i6 == 2 || i6 == 3) {
                            throw R.H.c("Unsupported epConfig: " + i6);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i7 = f9533b[i4];
        if (i7 != -1) {
            return new C0891a(m3, i7, k3);
        }
        throw R.H.a(null, null);
    }

    public static int r(U.s sVar, int[] iArr) {
        int i3 = 0;
        for (int i4 = 0; i4 < 3 && sVar.h(); i4++) {
            i3++;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            i5 += 1 << iArr[i6];
        }
        return sVar.i(iArr[i3]) + i5;
    }

    public static R.F s(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            String str = (String) list.get(i3);
            int i4 = U.A.f2405a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                AbstractC0123a.A("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(I0.a.d(new U.t(Base64.decode(split[1], 0))));
                } catch (RuntimeException e2) {
                    AbstractC0123a.B("VorbisUtil", "Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new I0.b(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new R.F(arrayList);
    }

    public static int t(int i3, U.t tVar) {
        switch (i3) {
            case 1:
                return 192;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
            case N.k.LONG_FIELD_NUMBER /* 4 */:
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return 576 << (i3 - 2);
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return tVar.u() + 1;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return tVar.A() + 1;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i3 - 8);
            default:
                return -1;
        }
    }

    public static C0276a u(U.t tVar) {
        tVar.H(1);
        int x3 = tVar.x();
        long j3 = tVar.f2478b + x3;
        int i3 = x3 / 18;
        long[] jArr = new long[i3];
        long[] jArr2 = new long[i3];
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                break;
            }
            long o3 = tVar.o();
            if (o3 == -1) {
                jArr = Arrays.copyOf(jArr, i4);
                jArr2 = Arrays.copyOf(jArr2, i4);
                break;
            }
            jArr[i4] = o3;
            jArr2[i4] = tVar.o();
            tVar.H(2);
            i4++;
        }
        tVar.H((int) (j3 - tVar.f2478b));
        return new C0276a((Object) jArr, (Object) jArr2, 18, false);
    }

    public static C0558m v(U.t tVar, boolean z3, boolean z4) {
        if (z3) {
            w(3, tVar, false);
        }
        tVar.s((int) tVar.l(), C1.d.f153c);
        long l3 = tVar.l();
        String[] strArr = new String[(int) l3];
        for (int i3 = 0; i3 < l3; i3++) {
            strArr[i3] = tVar.s((int) tVar.l(), C1.d.f153c);
        }
        if (z4 && (tVar.u() & 1) == 0) {
            throw R.H.a(null, "framing bit expected to be set");
        }
        return new C0558m(strArr, 18);
    }

    public static boolean w(int i3, U.t tVar, boolean z3) {
        if (tVar.a() < 7) {
            if (z3) {
                return false;
            }
            throw R.H.a(null, "too short header: " + tVar.a());
        } else if (tVar.u() != i3) {
            if (z3) {
                return false;
            }
            throw R.H.a(null, "expected header type " + Integer.toHexString(i3));
        } else if (tVar.u() == 118 && tVar.u() == 111 && tVar.u() == 114 && tVar.u() == 98 && tVar.u() == 105 && tVar.u() == 115) {
            return true;
        } else {
            if (z3) {
                return false;
            }
            throw R.H.a(null, "expected characters 'vorbis'");
        }
    }
}
