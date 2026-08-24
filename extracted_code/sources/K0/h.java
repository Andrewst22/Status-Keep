package K0;

import C.C0002c;
import D1.F;
import D1.I;
import D1.b0;
import R.G;
import U.A;
import U.s;
import U.t;
import a.AbstractC0155a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
/* loaded from: classes.dex */
public final class h extends android.support.v4.media.session.a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0002c f719c = new C0002c(2);

    /* renamed from: b  reason: collision with root package name */
    public final C0002c f720b;

    public h(C0002c c0002c) {
        this.f720b = c0002c;
    }

    public static a e0(t tVar, int i3, int i4) {
        int w02;
        String str;
        byte[] copyOfRange;
        int u3 = tVar.u();
        Charset t02 = t0(u3);
        int i5 = i3 - 1;
        byte[] bArr = new byte[i5];
        tVar.f(bArr, 0, i5);
        if (i4 == 2) {
            str = "image/" + AbstractC0155a.L(new String(bArr, 0, 3, C1.d.f152b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            w02 = 2;
        } else {
            w02 = w0(bArr, 0);
            String L = AbstractC0155a.L(new String(bArr, 0, w02, C1.d.f152b));
            if (L.indexOf(47) == -1) {
                str = "image/".concat(L);
            } else {
                str = L;
            }
        }
        int i6 = bArr[w02 + 1] & 255;
        int i7 = w02 + 2;
        int v02 = v0(bArr, i7, u3);
        String str2 = new String(bArr, i7, v02 - i7, t02);
        int s02 = s0(u3) + v02;
        if (i5 <= s02) {
            copyOfRange = A.f2410f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, s02, i5);
        }
        return new a(str, str2, i6, copyOfRange);
    }

    public static c f0(t tVar, int i3, int i4, boolean z3, int i5, C0002c c0002c) {
        long j3;
        long j4;
        int i6 = tVar.f2478b;
        int w02 = w0(tVar.f2477a, i6);
        String str = new String(tVar.f2477a, i6, w02 - i6, C1.d.f152b);
        tVar.G(w02 + 1);
        int h3 = tVar.h();
        int h4 = tVar.h();
        long w3 = tVar.w();
        if (w3 == 4294967295L) {
            j3 = -1;
        } else {
            j3 = w3;
        }
        long w4 = tVar.w();
        if (w4 == 4294967295L) {
            j4 = -1;
        } else {
            j4 = w4;
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i6 + i3;
        while (tVar.f2478b < i7) {
            i i02 = i0(i4, tVar, z3, i5, c0002c);
            if (i02 != null) {
                arrayList.add(i02);
            }
        }
        return new c(str, h3, h4, j3, j4, (i[]) arrayList.toArray(new i[0]));
    }

    public static d g0(t tVar, int i3, int i4, boolean z3, int i5, C0002c c0002c) {
        boolean z4;
        boolean z5;
        int i6 = tVar.f2478b;
        int w02 = w0(tVar.f2477a, i6);
        String str = new String(tVar.f2477a, i6, w02 - i6, C1.d.f152b);
        tVar.G(w02 + 1);
        int u3 = tVar.u();
        if ((u3 & 2) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((u3 & 1) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        int u4 = tVar.u();
        String[] strArr = new String[u4];
        for (int i7 = 0; i7 < u4; i7++) {
            int i8 = tVar.f2478b;
            int w03 = w0(tVar.f2477a, i8);
            strArr[i7] = new String(tVar.f2477a, i8, w03 - i8, C1.d.f152b);
            tVar.G(w03 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i9 = i6 + i3;
        while (tVar.f2478b < i9) {
            i i02 = i0(i4, tVar, z3, i5, c0002c);
            if (i02 != null) {
                arrayList.add(i02);
            }
        }
        return new d(str, z4, z5, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e h0(int i3, t tVar) {
        if (i3 < 4) {
            return null;
        }
        int u3 = tVar.u();
        Charset t02 = t0(u3);
        byte[] bArr = new byte[3];
        tVar.f(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i4 = i3 - 4;
        byte[] bArr2 = new byte[i4];
        tVar.f(bArr2, 0, i4);
        int v02 = v0(bArr2, 0, u3);
        String str2 = new String(bArr2, 0, v02, t02);
        int s02 = s0(u3) + v02;
        return new e(str, str2, m0(bArr2, s02, v0(bArr2, s02, u3), t02));
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0199, code lost:
        if (r12 == 67) goto L115;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static K0.i i0(int r18, U.t r19, boolean r20, int r21, C.C0002c r22) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.h.i0(int, U.t, boolean, int, C.c):K0.i");
    }

    public static f j0(int i3, t tVar) {
        byte[] copyOfRange;
        int u3 = tVar.u();
        Charset t02 = t0(u3);
        int i4 = i3 - 1;
        byte[] bArr = new byte[i4];
        tVar.f(bArr, 0, i4);
        int w02 = w0(bArr, 0);
        String l3 = G.l(new String(bArr, 0, w02, C1.d.f152b));
        int i5 = w02 + 1;
        int v02 = v0(bArr, i5, u3);
        String m02 = m0(bArr, i5, v02, t02);
        int s02 = s0(u3) + v02;
        int v03 = v0(bArr, s02, u3);
        String m03 = m0(bArr, s02, v03, t02);
        int s03 = s0(u3) + v03;
        if (i4 <= s03) {
            copyOfRange = A.f2410f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, s03, i4);
        }
        return new f(l3, m02, m03, copyOfRange);
    }

    public static l k0(int i3, t tVar) {
        int A3 = tVar.A();
        int x = tVar.x();
        int x3 = tVar.x();
        int u3 = tVar.u();
        int u4 = tVar.u();
        s sVar = new s();
        sVar.o(tVar);
        int i4 = ((i3 - 10) * 8) / (u3 + u4);
        int[] iArr = new int[i4];
        int[] iArr2 = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = sVar.i(u3);
            int i7 = sVar.i(u4);
            iArr[i5] = i6;
            iArr2[i5] = i7;
        }
        return new l(A3, x, x3, iArr, iArr2);
    }

    public static m l0(int i3, t tVar) {
        byte[] copyOfRange;
        byte[] bArr = new byte[i3];
        tVar.f(bArr, 0, i3);
        int w02 = w0(bArr, 0);
        String str = new String(bArr, 0, w02, C1.d.f152b);
        int i4 = w02 + 1;
        if (i3 <= i4) {
            copyOfRange = A.f2410f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, i4, i3);
        }
        return new m(str, copyOfRange);
    }

    public static String m0(byte[] bArr, int i3, int i4, Charset charset) {
        if (i4 > i3 && i4 <= bArr.length) {
            return new String(bArr, i3, i4 - i3, charset);
        }
        return "";
    }

    public static n n0(int i3, t tVar, String str) {
        if (i3 < 1) {
            return null;
        }
        int u3 = tVar.u();
        int i4 = i3 - 1;
        byte[] bArr = new byte[i4];
        tVar.f(bArr, 0, i4);
        return new n(str, null, o0(bArr, u3, 0));
    }

    public static b0 o0(byte[] bArr, int i3, int i4) {
        if (i4 >= bArr.length) {
            return I.o("");
        }
        F i5 = I.i();
        int v02 = v0(bArr, i4, i3);
        while (i4 < v02) {
            i5.a(new String(bArr, i4, v02 - i4, t0(i3)));
            i4 = s0(i3) + v02;
            v02 = v0(bArr, i4, i3);
        }
        b0 g3 = i5.g();
        if (g3.isEmpty()) {
            return I.o("");
        }
        return g3;
    }

    public static n p0(int i3, t tVar) {
        if (i3 < 1) {
            return null;
        }
        int u3 = tVar.u();
        int i4 = i3 - 1;
        byte[] bArr = new byte[i4];
        tVar.f(bArr, 0, i4);
        int v02 = v0(bArr, 0, u3);
        return new n("TXXX", new String(bArr, 0, v02, t0(u3)), o0(bArr, u3, s0(u3) + v02));
    }

    public static o q0(int i3, t tVar, String str) {
        byte[] bArr = new byte[i3];
        tVar.f(bArr, 0, i3);
        return new o(str, null, new String(bArr, 0, w0(bArr, 0), C1.d.f152b));
    }

    public static o r0(int i3, t tVar) {
        if (i3 < 1) {
            return null;
        }
        int u3 = tVar.u();
        int i4 = i3 - 1;
        byte[] bArr = new byte[i4];
        tVar.f(bArr, 0, i4);
        int v02 = v0(bArr, 0, u3);
        String str = new String(bArr, 0, v02, t0(u3));
        int s02 = s0(u3) + v02;
        return new o("WXXX", str, m0(bArr, s02, w0(bArr, s02), C1.d.f152b));
    }

    public static int s0(int i3) {
        if (i3 != 0 && i3 != 3) {
            return 2;
        }
        return 1;
    }

    public static Charset t0(int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    return C1.d.f152b;
                }
                return C1.d.f153c;
            }
            return C1.d.f154d;
        }
        return C1.d.f156f;
    }

    public static String u0(int i3, int i4, int i5, int i6, int i7) {
        if (i3 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7));
    }

    public static int v0(byte[] bArr, int i3, int i4) {
        int w02 = w0(bArr, i3);
        if (i4 != 0 && i4 != 3) {
            while (w02 < bArr.length - 1) {
                if ((w02 - i3) % 2 == 0 && bArr[w02 + 1] == 0) {
                    return w02;
                }
                w02 = w0(bArr, w02 + 1);
            }
            return bArr.length;
        }
        return w02;
    }

    public static int w0(byte[] bArr, int i3) {
        while (i3 < bArr.length) {
            if (bArr[i3] == 0) {
                return i3;
            }
            i3++;
        }
        return bArr.length;
    }

    public static int x0(int i3, t tVar) {
        byte[] bArr = tVar.f2477a;
        int i4 = tVar.f2478b;
        int i5 = i4;
        while (true) {
            int i6 = i5 + 1;
            if (i6 < i4 + i3) {
                if ((bArr[i5] & 255) == 255 && bArr[i6] == 0) {
                    System.arraycopy(bArr, i5 + 2, bArr, i6, (i3 - (i5 - i4)) - 2);
                    i3--;
                }
                i5 = i6;
            } else {
                return i3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0085, code lost:
        if ((r10 & 128) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean y0(U.t r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f2478b
        L6:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Laa
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r18.h()     // Catch: java.lang.Throwable -> L20
            long r8 = r18.w()     // Catch: java.lang.Throwable -> L20
            int r10 = r18.A()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lae
        L23:
            int r7 = r18.x()     // Catch: java.lang.Throwable -> L20
            int r8 = r18.x()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = 0
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.G(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L4c
            r1.G(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7a
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = 1
            goto L75
        L74:
            r3 = 0
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L89
            goto L8a
        L7a:
            if (r0 != r3) goto L88
            r3 = r10 & 32
            if (r3 == 0) goto L82
            r3 = 1
            goto L83
        L82:
            r3 = 0
        L83:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L89
            goto L8a
        L88:
            r3 = 0
        L89:
            r4 = 0
        L8a:
            if (r4 == 0) goto L8e
            int r3 = r3 + 4
        L8e:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L97
            r1.G(r2)
            return r6
        L97:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La4
            r1.G(r2)
            return r6
        La4:
            int r3 = (int) r8
            r1.H(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Laa:
            r1.G(r2)
            return r4
        Lae:
            r1.G(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.h.y0(U.t, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final R.F d0(byte[] r13, int r14) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.h.d0(byte[], int):R.F");
    }

    @Override // android.support.v4.media.session.a
    public final R.F n(F0.a aVar, ByteBuffer byteBuffer) {
        return d0(byteBuffer.array(), byteBuffer.limit());
    }
}
