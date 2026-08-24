package Q0;

import R.G;
import U.A;
import android.util.Pair;
import w0.AbstractC0892b;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f1556a;

    static {
        int i3 = A.f2405a;
        f1556a = "OpusHead".getBytes(C1.d.f153c);
    }

    public static e a(int i3, U.t tVar) {
        long j3;
        tVar.G(i3 + 12);
        tVar.H(1);
        b(tVar);
        tVar.H(2);
        int u3 = tVar.u();
        if ((u3 & 128) != 0) {
            tVar.H(2);
        }
        if ((u3 & 64) != 0) {
            tVar.H(tVar.u());
        }
        if ((u3 & 32) != 0) {
            tVar.H(2);
        }
        tVar.H(1);
        b(tVar);
        String d3 = G.d(tVar.u());
        if (!"audio/mpeg".equals(d3) && !"audio/vnd.dts".equals(d3) && !"audio/vnd.dts.hd".equals(d3)) {
            tVar.H(4);
            long w3 = tVar.w();
            long w4 = tVar.w();
            tVar.H(1);
            int b3 = b(tVar);
            byte[] bArr = new byte[b3];
            tVar.f(bArr, 0, b3);
            long j4 = -1;
            if (w4 > 0) {
                j3 = w4;
            } else {
                j3 = -1;
            }
            if (w3 > 0) {
                j4 = w3;
            }
            return new e(d3, bArr, j3, j4);
        }
        return new e(d3, null, -1L, -1L);
    }

    public static int b(U.t tVar) {
        int u3 = tVar.u();
        int i3 = u3 & 127;
        while ((u3 & 128) == 128) {
            u3 = tVar.u();
            i3 = (i3 << 7) | (u3 & 127);
        }
        return i3;
    }

    public static V.c c(U.t tVar) {
        long o3;
        long o4;
        tVar.G(8);
        if (c.d(tVar.h()) == 0) {
            o3 = tVar.w();
            o4 = tVar.w();
        } else {
            o3 = tVar.o();
            o4 = tVar.o();
        }
        return new V.c(o3, o4, tVar.w());
    }

    public static Pair d(U.t tVar, int i3, int i4) {
        boolean z3;
        boolean z4;
        boolean z5;
        Integer num;
        v vVar;
        Pair create;
        int i5;
        int i6;
        boolean z6;
        byte[] bArr;
        int i7 = tVar.f2478b;
        while (i7 - i3 < i4) {
            tVar.G(i7);
            int h3 = tVar.h();
            boolean z7 = false;
            if (h3 > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0892b.e("childAtomSize must be positive", z3);
            if (tVar.h() == 1936289382) {
                int i8 = i7 + 8;
                int i9 = -1;
                int i10 = 0;
                String str = null;
                Integer num2 = null;
                while (i8 - i7 < h3) {
                    tVar.G(i8);
                    int h4 = tVar.h();
                    int h5 = tVar.h();
                    if (h5 == 1718775137) {
                        num2 = Integer.valueOf(tVar.h());
                    } else if (h5 == 1935894637) {
                        tVar.H(4);
                        str = tVar.s(4, C1.d.f153c);
                    } else if (h5 == 1935894633) {
                        i9 = i8;
                        i10 = h4;
                    }
                    i8 += h4;
                }
                if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
                    create = null;
                } else {
                    if (num2 != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    AbstractC0892b.e("frma atom is mandatory", z4);
                    if (i9 != -1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    AbstractC0892b.e("schi atom is mandatory", z5);
                    int i11 = i9 + 8;
                    while (true) {
                        if (i11 - i9 < i10) {
                            tVar.G(i11);
                            int h6 = tVar.h();
                            if (tVar.h() == 1952804451) {
                                int d3 = c.d(tVar.h());
                                tVar.H(1);
                                if (d3 == 0) {
                                    tVar.H(1);
                                    i5 = 0;
                                    i6 = 0;
                                } else {
                                    int u3 = tVar.u();
                                    i5 = u3 & 15;
                                    i6 = (u3 & 240) >> 4;
                                }
                                if (tVar.u() == 1) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                int u4 = tVar.u();
                                byte[] bArr2 = new byte[16];
                                tVar.f(bArr2, 0, 16);
                                if (z6 && u4 == 0) {
                                    int u5 = tVar.u();
                                    byte[] bArr3 = new byte[u5];
                                    tVar.f(bArr3, 0, u5);
                                    bArr = bArr3;
                                } else {
                                    bArr = null;
                                }
                                num = num2;
                                vVar = new v(z6, str, u4, bArr2, i6, i5, bArr);
                            } else {
                                i11 += h6;
                            }
                        } else {
                            num = num2;
                            vVar = null;
                            break;
                        }
                    }
                    if (vVar != null) {
                        z7 = true;
                    }
                    AbstractC0892b.e("tenc atom is mandatory", z7);
                    int i12 = A.f2405a;
                    create = Pair.create(num, vVar);
                }
                if (create != null) {
                    return create;
                }
            }
            i7 += h3;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:512:0x0b95  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0bbc  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0d1a  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0d1c  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, Q0.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Q0.g e(U.t r64, int r65, int r66, java.lang.String r67, R.C0110m r68, boolean r69) {
        /*
            Method dump skipped, instructions count: 4073
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.j.e(U.t, int, int, java.lang.String, R.m, boolean):Q0.g");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dc, code lost:
        if (r6 == 0) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00de, code lost:
        r6 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06eb A[LOOP:5: B:287:0x06e8->B:289:0x06eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x08ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0552 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList f(Q0.a r45, w0.v r46, long r47, R.C0110m r49, boolean r50, boolean r51, C1.e r52) {
        /*
            Method dump skipped, instructions count: 2230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.j.f(Q0.a, w0.v, long, R.m, boolean, boolean, C1.e):java.util.ArrayList");
    }
}
