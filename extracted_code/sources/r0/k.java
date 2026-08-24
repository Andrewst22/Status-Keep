package R0;

import D1.I;
import R.C0112o;
import R.C0113p;
import R.F;
import R.G;
import R.H;
import U.AbstractC0123a;
import U.s;
import U.t;
import java.util.ArrayList;
import java.util.Arrays;
import k0.C0558m;
import w0.AbstractC0892b;
import w0.y;
/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: n  reason: collision with root package name */
    public j f2063n;

    /* renamed from: o  reason: collision with root package name */
    public int f2064o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2065p;

    /* renamed from: q  reason: collision with root package name */
    public y f2066q;

    /* renamed from: r  reason: collision with root package name */
    public C0558m f2067r;

    @Override // R0.i
    public final void a(long j3) {
        boolean z3;
        this.f2051g = j3;
        int i3 = 0;
        if (j3 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f2065p = z3;
        y yVar = this.f2066q;
        if (yVar != null) {
            i3 = yVar.f9658e;
        }
        this.f2064o = i3;
    }

    @Override // R0.i
    public final long b(t tVar) {
        int i3;
        int i4 = 0;
        byte b3 = tVar.f2477a[0];
        if ((b3 & 1) == 1) {
            return -1L;
        }
        j jVar = this.f2063n;
        AbstractC0123a.k(jVar);
        boolean z3 = ((U.c[]) jVar.f2062q)[(b3 >> 1) & (255 >>> (8 - jVar.f2058m))].f2428a;
        y yVar = (y) jVar.f2059n;
        if (!z3) {
            i3 = yVar.f9658e;
        } else {
            i3 = yVar.f9659f;
        }
        if (this.f2065p) {
            i4 = (this.f2064o + i3) / 4;
        }
        long j3 = i4;
        byte[] bArr = tVar.f2477a;
        int length = bArr.length;
        int i5 = tVar.f2479c + 4;
        if (length < i5) {
            byte[] copyOf = Arrays.copyOf(bArr, i5);
            tVar.E(copyOf, copyOf.length);
        } else {
            tVar.F(i5);
        }
        byte[] bArr2 = tVar.f2477a;
        int i6 = tVar.f2479c;
        bArr2[i6 - 4] = (byte) (j3 & 255);
        bArr2[i6 - 3] = (byte) ((j3 >>> 8) & 255);
        bArr2[i6 - 2] = (byte) ((j3 >>> 16) & 255);
        bArr2[i6 - 1] = (byte) ((j3 >>> 24) & 255);
        this.f2065p = true;
        this.f2064o = i3;
        return j3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, U.c] */
    /* JADX WARN: Type inference failed for: r1v49, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v8, types: [w0.y, java.lang.Object] */
    @Override // R0.i
    public final boolean c(t tVar, long j3, B1.a aVar) {
        j jVar;
        int i3;
        y yVar;
        int i4;
        y yVar2;
        byte[] bArr;
        long j4;
        int i5;
        if (this.f2063n != null) {
            ((C0113p) aVar.f50n).getClass();
            return false;
        }
        y yVar3 = this.f2066q;
        int i6 = 4;
        if (yVar3 == null) {
            AbstractC0892b.w(1, tVar, false);
            tVar.m();
            int u3 = tVar.u();
            int m3 = tVar.m();
            int j5 = tVar.j();
            if (j5 <= 0) {
                j5 = -1;
            }
            int j6 = tVar.j();
            if (j6 <= 0) {
                i5 = -1;
            } else {
                i5 = j6;
            }
            tVar.j();
            int u4 = tVar.u();
            int pow = (int) Math.pow(2.0d, (u4 & 240) >> 4);
            tVar.u();
            ?? copyOf = Arrays.copyOf(tVar.f2477a, tVar.f2479c);
            ?? obj = new Object();
            obj.f9654a = u3;
            obj.f9655b = m3;
            obj.f9656c = j5;
            obj.f9657d = i5;
            obj.f9658e = (int) Math.pow(2.0d, u4 & 15);
            obj.f9659f = pow;
            obj.f9660g = copyOf;
            this.f2066q = obj;
        } else {
            C0558m c0558m = this.f2067r;
            if (c0558m == null) {
                this.f2067r = AbstractC0892b.v(tVar, true, true);
            } else {
                int i7 = tVar.f2479c;
                byte[] bArr2 = new byte[i7];
                System.arraycopy(tVar.f2477a, 0, bArr2, 0, i7);
                int i8 = 5;
                AbstractC0892b.w(5, tVar, false);
                int u5 = tVar.u() + 1;
                s sVar = new s(tVar.f2477a);
                sVar.t(tVar.f2478b * 8);
                int i9 = 0;
                while (true) {
                    int i10 = 2;
                    int i11 = 16;
                    if (i9 < u5) {
                        if (sVar.i(24) == 5653314) {
                            int i12 = sVar.i(16);
                            int i13 = sVar.i(24);
                            if (!sVar.h()) {
                                boolean h3 = sVar.h();
                                for (int i14 = 0; i14 < i13; i14++) {
                                    if (h3) {
                                        if (sVar.h()) {
                                            sVar.t(i8);
                                        }
                                    } else {
                                        sVar.t(i8);
                                    }
                                }
                            } else {
                                sVar.t(i8);
                                for (int i15 = 0; i15 < i13; i15 += sVar.i(AbstractC0892b.n(i13 - i15))) {
                                }
                            }
                            int i16 = sVar.i(i6);
                            if (i16 <= 2) {
                                if (i16 != 1 && i16 != 2) {
                                    yVar2 = yVar3;
                                    bArr = bArr2;
                                } else {
                                    sVar.t(32);
                                    sVar.t(32);
                                    int i17 = sVar.i(i6) + 1;
                                    sVar.t(1);
                                    if (i16 == 1) {
                                        if (i12 != 0) {
                                            yVar2 = yVar3;
                                            bArr = bArr2;
                                            j4 = (long) Math.floor(Math.pow(i13, 1.0d / i12));
                                        } else {
                                            yVar2 = yVar3;
                                            bArr = bArr2;
                                            j4 = 0;
                                        }
                                    } else {
                                        yVar2 = yVar3;
                                        bArr = bArr2;
                                        j4 = i13 * i12;
                                    }
                                    sVar.t((int) (j4 * i17));
                                }
                                i9++;
                                yVar3 = yVar2;
                                bArr2 = bArr;
                                i6 = 4;
                                i8 = 5;
                            } else {
                                throw H.a(null, "lookup type greater than 2 not decodable: " + i16);
                            }
                        } else {
                            throw H.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((sVar.f2471c * 8) + sVar.f2473e));
                        }
                    } else {
                        y yVar4 = yVar3;
                        byte[] bArr3 = bArr2;
                        int i18 = 6;
                        int i19 = sVar.i(6) + 1;
                        for (int i20 = 0; i20 < i19; i20++) {
                            if (sVar.i(16) != 0) {
                                throw H.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i21 = sVar.i(6) + 1;
                        int i22 = 0;
                        while (true) {
                            int i23 = 3;
                            if (i22 < i21) {
                                int i24 = sVar.i(i11);
                                if (i24 != 0) {
                                    if (i24 == 1) {
                                        int i25 = sVar.i(5);
                                        int[] iArr = new int[i25];
                                        int i26 = -1;
                                        for (int i27 = 0; i27 < i25; i27++) {
                                            int i28 = sVar.i(4);
                                            iArr[i27] = i28;
                                            if (i28 > i26) {
                                                i26 = i28;
                                            }
                                        }
                                        int i29 = i26 + 1;
                                        int[] iArr2 = new int[i29];
                                        int i30 = 0;
                                        while (i30 < i29) {
                                            iArr2[i30] = sVar.i(i23) + 1;
                                            int i31 = sVar.i(i10);
                                            int i32 = 8;
                                            if (i31 > 0) {
                                                sVar.t(8);
                                            }
                                            int i33 = 0;
                                            while (i33 < (1 << i31)) {
                                                sVar.t(i32);
                                                i33++;
                                                i32 = 8;
                                            }
                                            i30++;
                                            i23 = 3;
                                            i10 = 2;
                                        }
                                        sVar.t(2);
                                        int i34 = sVar.i(4);
                                        int i35 = 0;
                                        int i36 = 0;
                                        for (int i37 = 0; i37 < i25; i37++) {
                                            i35 += iArr2[iArr[i37]];
                                            while (i36 < i35) {
                                                sVar.t(i34);
                                                i36++;
                                            }
                                        }
                                    } else {
                                        throw H.a(null, "floor type greater than 1 not decodable: " + i24);
                                    }
                                } else {
                                    int i38 = 8;
                                    sVar.t(8);
                                    sVar.t(16);
                                    sVar.t(16);
                                    sVar.t(6);
                                    sVar.t(8);
                                    int i39 = sVar.i(4) + 1;
                                    int i40 = 0;
                                    while (i40 < i39) {
                                        sVar.t(i38);
                                        i40++;
                                        i38 = 8;
                                    }
                                }
                                i22++;
                                i18 = 6;
                                i11 = 16;
                                i10 = 2;
                            } else {
                                int i41 = sVar.i(i18) + 1;
                                int i42 = 0;
                                while (i42 < i41) {
                                    if (sVar.i(16) <= 2) {
                                        sVar.t(24);
                                        sVar.t(24);
                                        sVar.t(24);
                                        int i43 = sVar.i(i18) + 1;
                                        int i44 = 8;
                                        sVar.t(8);
                                        int[] iArr3 = new int[i43];
                                        for (int i45 = 0; i45 < i43; i45++) {
                                            int i46 = sVar.i(3);
                                            if (sVar.h()) {
                                                i4 = sVar.i(5);
                                            } else {
                                                i4 = 0;
                                            }
                                            iArr3[i45] = (i4 * 8) + i46;
                                        }
                                        int i47 = 0;
                                        while (i47 < i43) {
                                            int i48 = 0;
                                            while (i48 < i44) {
                                                if ((iArr3[i47] & (1 << i48)) != 0) {
                                                    sVar.t(i44);
                                                }
                                                i48++;
                                                i44 = 8;
                                            }
                                            i47++;
                                            i44 = 8;
                                        }
                                        i42++;
                                        i18 = 6;
                                    } else {
                                        throw H.a(null, "residueType greater than 2 is not decodable");
                                    }
                                }
                                int i49 = sVar.i(i18) + 1;
                                int i50 = 0;
                                while (i50 < i49) {
                                    int i51 = sVar.i(16);
                                    if (i51 != 0) {
                                        AbstractC0123a.n("VorbisUtil", "mapping type other than 0 not supported: " + i51);
                                        yVar = yVar4;
                                    } else {
                                        if (sVar.h()) {
                                            i3 = sVar.i(4) + 1;
                                        } else {
                                            i3 = 1;
                                        }
                                        boolean h4 = sVar.h();
                                        yVar = yVar4;
                                        int i52 = yVar.f9654a;
                                        if (h4) {
                                            int i53 = sVar.i(8) + 1;
                                            for (int i54 = 0; i54 < i53; i54++) {
                                                int i55 = i52 - 1;
                                                sVar.t(AbstractC0892b.n(i55));
                                                sVar.t(AbstractC0892b.n(i55));
                                            }
                                        }
                                        if (sVar.i(2) == 0) {
                                            if (i3 > 1) {
                                                for (int i56 = 0; i56 < i52; i56++) {
                                                    sVar.t(4);
                                                }
                                            }
                                            for (int i57 = 0; i57 < i3; i57++) {
                                                sVar.t(8);
                                                sVar.t(8);
                                                sVar.t(8);
                                            }
                                        } else {
                                            throw H.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                    }
                                    i50++;
                                    yVar4 = yVar;
                                }
                                y yVar5 = yVar4;
                                int i58 = sVar.i(6);
                                int i59 = i58 + 1;
                                U.c[] cVarArr = new U.c[i59];
                                for (int i60 = 0; i60 < i59; i60++) {
                                    boolean h5 = sVar.h();
                                    sVar.i(16);
                                    sVar.i(16);
                                    sVar.i(8);
                                    ?? obj2 = new Object();
                                    obj2.f2428a = h5;
                                    cVarArr[i60] = obj2;
                                }
                                if (sVar.h()) {
                                    jVar = new j(yVar5, c0558m, bArr3, cVarArr, AbstractC0892b.n(i58));
                                } else {
                                    throw H.a(null, "framing bit after modes not set as expected");
                                }
                            }
                        }
                    }
                }
            }
        }
        jVar = null;
        this.f2063n = jVar;
        if (jVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        y yVar6 = (y) jVar.f2059n;
        arrayList.add((byte[]) yVar6.f9660g);
        arrayList.add((byte[]) jVar.f2061p);
        F s3 = AbstractC0892b.s(I.k((String[]) ((C0558m) jVar.f2060o).f7632n));
        C0112o c0112o = new C0112o();
        c0112o.f1937l = G.l("audio/vorbis");
        c0112o.f1932g = yVar6.f9657d;
        c0112o.f1933h = yVar6.f9656c;
        c0112o.f1950z = yVar6.f9654a;
        c0112o.f1917A = yVar6.f9655b;
        c0112o.f1940o = arrayList;
        c0112o.f1935j = s3;
        aVar.f50n = new C0113p(c0112o);
        return true;
    }

    @Override // R0.i
    public final void d(boolean z3) {
        super.d(z3);
        if (z3) {
            this.f2063n = null;
            this.f2066q = null;
            this.f2067r = null;
        }
        this.f2064o = 0;
        this.f2065p = false;
    }
}
