package V0;

import D1.G;
import D1.I;
import D1.b0;
import T0.k;
import T0.l;
import U.A;
import U.AbstractC0123a;
import U.s;
import U.t;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class h implements l {

    /* renamed from: t  reason: collision with root package name */
    public static final byte[] f2693t = {0, 7, 8, 15};

    /* renamed from: u  reason: collision with root package name */
    public static final byte[] f2694u = {0, 119, -120, -1};

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f2695v = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: m  reason: collision with root package name */
    public final Paint f2696m;

    /* renamed from: n  reason: collision with root package name */
    public final Paint f2697n;

    /* renamed from: o  reason: collision with root package name */
    public final Canvas f2698o;

    /* renamed from: p  reason: collision with root package name */
    public final b f2699p;

    /* renamed from: q  reason: collision with root package name */
    public final a f2700q;

    /* renamed from: r  reason: collision with root package name */
    public final g f2701r;

    /* renamed from: s  reason: collision with root package name */
    public Bitmap f2702s;

    public h(List list) {
        t tVar = new t((byte[]) list.get(0));
        int A3 = tVar.A();
        int A4 = tVar.A();
        Paint paint = new Paint();
        this.f2696m = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f2697n = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f2698o = new Canvas();
        this.f2699p = new b(719, 575, 0, 719, 0, 575);
        this.f2700q = new a(0, new int[]{0, -1, -16777216, -8421505}, c(), d());
        this.f2701r = new g(A3, A4);
    }

    public static byte[] a(int i3, int i4, s sVar) {
        byte[] bArr = new byte[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            bArr[i5] = (byte) sVar.i(i4);
        }
        return bArr;
    }

    public static int[] c() {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i8 = 1; i8 < 16; i8++) {
            if (i8 < 8) {
                if ((i8 & 1) != 0) {
                    i5 = 255;
                } else {
                    i5 = 0;
                }
                if ((i8 & 2) != 0) {
                    i6 = 255;
                } else {
                    i6 = 0;
                }
                if ((i8 & 4) != 0) {
                    i7 = 255;
                } else {
                    i7 = 0;
                }
                iArr[i8] = f(255, i5, i6, i7);
            } else {
                int i9 = 127;
                if ((i8 & 1) != 0) {
                    i3 = 127;
                } else {
                    i3 = 0;
                }
                if ((i8 & 2) != 0) {
                    i4 = 127;
                } else {
                    i4 = 0;
                }
                if ((i8 & 4) == 0) {
                    i9 = 0;
                }
                iArr[i8] = f(255, i3, i4, i9);
            }
        }
        return iArr;
    }

    public static int[] d() {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i21 = 0; i21 < 256; i21++) {
            int i22 = 255;
            if (i21 < 8) {
                if ((i21 & 1) != 0) {
                    i19 = 255;
                } else {
                    i19 = 0;
                }
                if ((i21 & 2) != 0) {
                    i20 = 255;
                } else {
                    i20 = 0;
                }
                if ((i21 & 4) == 0) {
                    i22 = 0;
                }
                iArr[i21] = f(63, i19, i20, i22);
            } else {
                int i23 = i21 & 136;
                int i24 = 170;
                int i25 = 85;
                if (i23 != 0) {
                    if (i23 != 8) {
                        int i26 = 43;
                        if (i23 != 128) {
                            if (i23 == 136) {
                                if ((i21 & 1) != 0) {
                                    i15 = 43;
                                } else {
                                    i15 = 0;
                                }
                                if ((i21 & 16) != 0) {
                                    i16 = 85;
                                } else {
                                    i16 = 0;
                                }
                                int i27 = i15 + i16;
                                if ((i21 & 2) != 0) {
                                    i17 = 43;
                                } else {
                                    i17 = 0;
                                }
                                if ((i21 & 32) != 0) {
                                    i18 = 85;
                                } else {
                                    i18 = 0;
                                }
                                int i28 = i17 + i18;
                                if ((i21 & 4) == 0) {
                                    i26 = 0;
                                }
                                if ((i21 & 64) == 0) {
                                    i25 = 0;
                                }
                                iArr[i21] = f(255, i27, i28, i26 + i25);
                            }
                        } else {
                            if ((i21 & 1) != 0) {
                                i11 = 43;
                            } else {
                                i11 = 0;
                            }
                            int i29 = i11 + 127;
                            if ((i21 & 16) != 0) {
                                i12 = 85;
                            } else {
                                i12 = 0;
                            }
                            int i30 = i29 + i12;
                            if ((i21 & 2) != 0) {
                                i13 = 43;
                            } else {
                                i13 = 0;
                            }
                            int i31 = i13 + 127;
                            if ((i21 & 32) != 0) {
                                i14 = 85;
                            } else {
                                i14 = 0;
                            }
                            int i32 = i31 + i14;
                            if ((i21 & 4) == 0) {
                                i26 = 0;
                            }
                            int i33 = i26 + 127;
                            if ((i21 & 64) == 0) {
                                i25 = 0;
                            }
                            iArr[i21] = f(255, i30, i32, i33 + i25);
                        }
                    } else {
                        if ((i21 & 1) != 0) {
                            i7 = 85;
                        } else {
                            i7 = 0;
                        }
                        if ((i21 & 16) != 0) {
                            i8 = 170;
                        } else {
                            i8 = 0;
                        }
                        int i34 = i7 + i8;
                        if ((i21 & 2) != 0) {
                            i9 = 85;
                        } else {
                            i9 = 0;
                        }
                        if ((i21 & 32) != 0) {
                            i10 = 170;
                        } else {
                            i10 = 0;
                        }
                        int i35 = i9 + i10;
                        if ((i21 & 4) == 0) {
                            i25 = 0;
                        }
                        if ((i21 & 64) == 0) {
                            i24 = 0;
                        }
                        iArr[i21] = f(127, i34, i35, i25 + i24);
                    }
                } else {
                    if ((i21 & 1) != 0) {
                        i3 = 85;
                    } else {
                        i3 = 0;
                    }
                    if ((i21 & 16) != 0) {
                        i4 = 170;
                    } else {
                        i4 = 0;
                    }
                    int i36 = i3 + i4;
                    if ((i21 & 2) != 0) {
                        i5 = 85;
                    } else {
                        i5 = 0;
                    }
                    if ((i21 & 32) != 0) {
                        i6 = 170;
                    } else {
                        i6 = 0;
                    }
                    int i37 = i5 + i6;
                    if ((i21 & 4) == 0) {
                        i25 = 0;
                    }
                    if ((i21 & 64) == 0) {
                        i24 = 0;
                    }
                    iArr[i21] = f(255, i36, i37, i25 + i24);
                }
            }
        }
        return iArr;
    }

    public static int f(int i3, int i4, int i5, int i6) {
        return (i3 << 24) | (i4 << 16) | (i5 << 8) | i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x021d A[LOOP:3: B:89:0x016c->B:119:0x021d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014a A[LOOP:2: B:41:0x00aa->B:76:0x014a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017b  */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.h.g(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a h(s sVar, int i3) {
        int[] iArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 8;
        int i10 = sVar.i(8);
        sVar.t(8);
        int i11 = 2;
        int i12 = i3 - 2;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] c3 = c();
        int[] d3 = d();
        while (i12 > 0) {
            int i13 = sVar.i(i9);
            int i14 = sVar.i(i9);
            if ((i14 & 128) != 0) {
                iArr = iArr2;
            } else if ((i14 & 64) != 0) {
                iArr = c3;
            } else {
                iArr = d3;
            }
            if ((i14 & 1) != 0) {
                i7 = sVar.i(i9);
                i8 = sVar.i(i9);
                i4 = sVar.i(i9);
                i6 = sVar.i(i9);
                i5 = i12 - 6;
            } else {
                int i15 = sVar.i(4) << 4;
                i4 = sVar.i(4) << 4;
                i5 = i12 - 4;
                i6 = sVar.i(i11) << 6;
                i7 = sVar.i(6) << i11;
                i8 = i15;
            }
            if (i7 == 0) {
                i8 = 0;
                i4 = 0;
                i6 = 255;
            }
            double d4 = i7;
            double d5 = i8 - 128;
            double d6 = i4 - 128;
            iArr[i13] = f((byte) (255 - (i6 & 255)), A.j((int) ((1.402d * d5) + d4), 0, 255), A.j((int) ((d4 - (0.34414d * d6)) - (d5 * 0.71414d)), 0, 255), A.j((int) ((d6 * 1.772d) + d4), 0, 255));
            i12 = i5;
            i10 = i10;
            d3 = d3;
            i9 = 8;
            i11 = 2;
        }
        return new a(i10, iArr2, c3, d3);
    }

    public static c i(s sVar) {
        byte[] bArr;
        int i3 = sVar.i(16);
        sVar.t(4);
        int i4 = sVar.i(2);
        boolean h3 = sVar.h();
        sVar.t(1);
        byte[] bArr2 = A.f2410f;
        if (i4 == 1) {
            sVar.t(sVar.i(8) * 16);
        } else if (i4 == 0) {
            int i5 = sVar.i(16);
            int i6 = sVar.i(16);
            if (i5 > 0) {
                bArr2 = new byte[i5];
                sVar.l(bArr2, i5);
            }
            if (i6 > 0) {
                bArr = new byte[i6];
                sVar.l(bArr, i6);
                return new c(i3, h3, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(i3, h3, bArr2, bArr);
    }

    @Override // T0.l
    public final void b() {
        g gVar = this.f2701r;
        gVar.f2686c.clear();
        gVar.f2687d.clear();
        gVar.f2688e.clear();
        gVar.f2689f.clear();
        gVar.f2690g.clear();
        gVar.f2691h = null;
        gVar.f2692i = null;
    }

    @Override // T0.l
    public final void e(byte[] bArr, int i3, int i4, k kVar, U.d dVar) {
        g gVar;
        T0.a aVar;
        int i5;
        int i6;
        b bVar;
        ArrayList arrayList;
        int i7;
        g gVar2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        e eVar;
        Paint paint;
        int[] iArr;
        e eVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 8;
        s sVar = new s(bArr, i3 + i4);
        sVar.q(i3);
        while (true) {
            int b3 = sVar.b();
            gVar = this.f2701r;
            if (b3 >= 48 && sVar.i(i17) == 15) {
                int i18 = sVar.i(i17);
                int i19 = 16;
                int i20 = sVar.i(16);
                int i21 = sVar.i(16);
                int f3 = sVar.f() + i21;
                if (i21 * 8 > sVar.b()) {
                    AbstractC0123a.A("DvbParser", "Data field length exceeds limit");
                    sVar.t(sVar.b());
                } else {
                    switch (i18) {
                        case 16:
                            if (i20 == gVar.f2684a) {
                                Q0.h hVar = gVar.f2692i;
                                sVar.i(i17);
                                int i22 = sVar.i(4);
                                int i23 = sVar.i(2);
                                sVar.t(2);
                                int i24 = i21 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i24 > 0) {
                                    int i25 = sVar.i(i17);
                                    sVar.t(i17);
                                    i24 -= 6;
                                    sparseArray.put(i25, new d(sVar.i(16), sVar.i(16)));
                                    i17 = 8;
                                }
                                Q0.h hVar2 = new Q0.h(i22, i23, sparseArray);
                                if (i23 != 0) {
                                    gVar.f2692i = hVar2;
                                    gVar.f2686c.clear();
                                    gVar.f2687d.clear();
                                    gVar.f2688e.clear();
                                    break;
                                } else if (hVar != null && hVar.f1547a != i22) {
                                    gVar.f2692i = hVar2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            Q0.h hVar3 = gVar.f2692i;
                            if (i20 == gVar.f2684a && hVar3 != null) {
                                int i26 = sVar.i(i17);
                                sVar.t(4);
                                boolean h3 = sVar.h();
                                sVar.t(3);
                                int i27 = sVar.i(16);
                                int i28 = sVar.i(16);
                                sVar.i(3);
                                int i29 = sVar.i(3);
                                sVar.t(2);
                                int i30 = sVar.i(i17);
                                int i31 = sVar.i(i17);
                                int i32 = sVar.i(4);
                                int i33 = sVar.i(2);
                                sVar.t(2);
                                int i34 = i21 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i34 > 0) {
                                    int i35 = sVar.i(i19);
                                    int i36 = sVar.i(2);
                                    sVar.i(2);
                                    int i37 = sVar.i(12);
                                    sVar.t(4);
                                    int i38 = sVar.i(12);
                                    int i39 = i34 - 6;
                                    if (i36 != 1 && i36 != 2) {
                                        i34 = i39;
                                    } else {
                                        sVar.i(i17);
                                        sVar.i(i17);
                                        i34 -= 8;
                                    }
                                    sparseArray2.put(i35, new f(i37, i38));
                                    i19 = 16;
                                }
                                e eVar3 = new e(i26, h3, i27, i28, i29, i30, i31, i32, i33, sparseArray2);
                                SparseArray sparseArray3 = gVar.f2686c;
                                if (hVar3.f1548b == 0 && (eVar2 = (e) sparseArray3.get(i26)) != null) {
                                    int i40 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = eVar2.f2681j;
                                        if (i40 < sparseArray4.size()) {
                                            eVar3.f2681j.put(sparseArray4.keyAt(i40), (f) sparseArray4.valueAt(i40));
                                            i40++;
                                        }
                                    }
                                }
                                sparseArray3.put(eVar3.f2672a, eVar3);
                                break;
                            }
                            break;
                        case 18:
                            if (i20 == gVar.f2684a) {
                                a h4 = h(sVar, i21);
                                gVar.f2687d.put(h4.f2656a, h4);
                                break;
                            } else if (i20 == gVar.f2685b) {
                                a h5 = h(sVar, i21);
                                gVar.f2689f.put(h5.f2656a, h5);
                                break;
                            }
                            break;
                        case 19:
                            if (i20 == gVar.f2684a) {
                                c i41 = i(sVar);
                                gVar.f2688e.put(i41.f2666a, i41);
                                break;
                            } else if (i20 == gVar.f2685b) {
                                c i42 = i(sVar);
                                gVar.f2690g.put(i42.f2666a, i42);
                                break;
                            }
                            break;
                        case 20:
                            if (i20 == gVar.f2684a) {
                                sVar.t(4);
                                boolean h6 = sVar.h();
                                sVar.t(3);
                                int i43 = sVar.i(16);
                                int i44 = sVar.i(16);
                                if (h6) {
                                    int i45 = sVar.i(16);
                                    int i46 = sVar.i(16);
                                    int i47 = sVar.i(16);
                                    i13 = i46;
                                    i14 = sVar.i(16);
                                    i16 = i47;
                                    i15 = i45;
                                } else {
                                    i13 = i43;
                                    i14 = i44;
                                    i15 = 0;
                                    i16 = 0;
                                }
                                gVar.f2691h = new b(i43, i44, i15, i13, i16, i14);
                                break;
                            }
                            break;
                    }
                    sVar.u(f3 - sVar.f());
                }
                i17 = 8;
            }
        }
        Q0.h hVar4 = gVar.f2692i;
        if (hVar4 == null) {
            G g3 = I.f197n;
            aVar = new T0.a(b0.f231q, -9223372036854775807L, -9223372036854775807L);
        } else {
            b bVar2 = gVar.f2691h;
            if (bVar2 == null) {
                bVar2 = this.f2699p;
            }
            Bitmap bitmap = this.f2702s;
            Canvas canvas = this.f2698o;
            if (bitmap == null || bVar2.f2660a + 1 != bitmap.getWidth() || bVar2.f2661b + 1 != this.f2702s.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(bVar2.f2660a + 1, bVar2.f2661b + 1, Bitmap.Config.ARGB_8888);
                this.f2702s = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            int i48 = 0;
            while (true) {
                SparseArray sparseArray5 = (SparseArray) hVar4.f1549c;
                if (i48 < sparseArray5.size()) {
                    canvas.save();
                    d dVar2 = (d) sparseArray5.valueAt(i48);
                    e eVar4 = (e) gVar.f2686c.get(sparseArray5.keyAt(i48));
                    int i49 = dVar2.f2670a + bVar2.f2662c;
                    int i50 = dVar2.f2671b + bVar2.f2664e;
                    int min = Math.min(eVar4.f2674c + i49, bVar2.f2663d);
                    int i51 = eVar4.f2675d;
                    int i52 = i50 + i51;
                    canvas.clipRect(i49, i50, min, Math.min(i52, bVar2.f2665f));
                    SparseArray sparseArray6 = gVar.f2687d;
                    int i53 = eVar4.f2677f;
                    a aVar2 = (a) sparseArray6.get(i53);
                    if (aVar2 == null && (aVar2 = (a) gVar.f2689f.get(i53)) == null) {
                        aVar2 = this.f2700q;
                    }
                    int i54 = 0;
                    while (true) {
                        SparseArray sparseArray7 = eVar4.f2681j;
                        if (i54 < sparseArray7.size()) {
                            int keyAt = sparseArray7.keyAt(i54);
                            f fVar = (f) sparseArray7.valueAt(i54);
                            Q0.h hVar5 = hVar4;
                            c cVar = (c) gVar.f2688e.get(keyAt);
                            if (cVar == null) {
                                cVar = (c) gVar.f2690g.get(keyAt);
                            }
                            if (cVar != null) {
                                if (cVar.f2667b) {
                                    paint = null;
                                } else {
                                    paint = this.f2696m;
                                }
                                gVar2 = gVar;
                                int i55 = fVar.f2682a + i49;
                                int i56 = fVar.f2683b + i50;
                                i7 = i48;
                                int i57 = eVar4.f2676e;
                                int i58 = i54;
                                if (i57 == 3) {
                                    iArr = aVar2.f2659d;
                                } else if (i57 == 2) {
                                    iArr = aVar2.f2658c;
                                } else {
                                    iArr = aVar2.f2657b;
                                }
                                int[] iArr2 = iArr;
                                i8 = i58;
                                arrayList = arrayList2;
                                bVar = bVar2;
                                i10 = i51;
                                i9 = i52;
                                i12 = i49;
                                i11 = i50;
                                eVar = eVar4;
                                Paint paint2 = paint;
                                g(cVar.f2668c, iArr2, i57, i55, i56, paint2, canvas);
                                g(cVar.f2669d, iArr2, i57, i55, i56 + 1, paint2, canvas);
                            } else {
                                bVar = bVar2;
                                arrayList = arrayList2;
                                i7 = i48;
                                gVar2 = gVar;
                                i8 = i54;
                                i9 = i52;
                                i10 = i51;
                                i11 = i50;
                                i12 = i49;
                                eVar = eVar4;
                            }
                            i54 = i8 + 1;
                            eVar4 = eVar;
                            i49 = i12;
                            hVar4 = hVar5;
                            gVar = gVar2;
                            i48 = i7;
                            bVar2 = bVar;
                            i51 = i10;
                            i52 = i9;
                            i50 = i11;
                            arrayList2 = arrayList;
                        } else {
                            Q0.h hVar6 = hVar4;
                            b bVar3 = bVar2;
                            ArrayList arrayList3 = arrayList2;
                            int i59 = i48;
                            g gVar3 = gVar;
                            int i60 = i52;
                            int i61 = i51;
                            int i62 = i50;
                            int i63 = i49;
                            e eVar5 = eVar4;
                            boolean z3 = eVar5.f2673b;
                            int i64 = eVar5.f2674c;
                            if (z3) {
                                int i65 = eVar5.f2676e;
                                if (i65 == 3) {
                                    i6 = aVar2.f2659d[eVar5.f2678g];
                                } else if (i65 == 2) {
                                    i6 = aVar2.f2658c[eVar5.f2679h];
                                } else {
                                    i6 = aVar2.f2657b[eVar5.f2680i];
                                }
                                Paint paint3 = this.f2697n;
                                paint3.setColor(i6);
                                i5 = i62;
                                canvas.drawRect(i63, i5, i63 + i64, i60, paint3);
                            } else {
                                i5 = i62;
                            }
                            Bitmap createBitmap2 = Bitmap.createBitmap(this.f2702s, i63, i5, i64, i61);
                            float f4 = bVar3.f2660a;
                            float f5 = bVar3.f2661b;
                            arrayList3.add(new T.b(null, null, null, createBitmap2, i5 / f5, 0, 0, i63 / f4, 0, Integer.MIN_VALUE, -3.4028235E38f, i64 / f4, i61 / f5, false, -16777216, Integer.MIN_VALUE, 0.0f));
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas.restore();
                            i48 = i59 + 1;
                            hVar4 = hVar6;
                            gVar = gVar3;
                            arrayList2 = arrayList3;
                            bVar2 = bVar3;
                        }
                    }
                } else {
                    aVar = new T0.a(arrayList2, -9223372036854775807L, -9223372036854775807L);
                }
            }
        }
        dVar.accept(aVar);
    }

    @Override // T0.l
    public final int k() {
        return 2;
    }

    @Override // T0.l
    public final /* synthetic */ T0.d r(byte[] bArr, int i3, int i4) {
        return D2.h.a(this, bArr, i4);
    }
}
