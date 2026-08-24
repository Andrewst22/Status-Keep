package w0;

import U.AbstractC0123a;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final List f9640a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9641b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9642c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9643d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9644e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9645f;

    /* renamed from: g  reason: collision with root package name */
    public final int f9646g;

    /* renamed from: h  reason: collision with root package name */
    public final float f9647h;

    /* renamed from: i  reason: collision with root package name */
    public final int f9648i;

    /* renamed from: j  reason: collision with root package name */
    public final String f9649j;

    public w(List list, int i3, int i4, int i5, int i6, int i7, int i8, float f3, int i9, String str) {
        this.f9640a = list;
        this.f9641b = i3;
        this.f9642c = i4;
        this.f9643d = i5;
        this.f9644e = i6;
        this.f9645f = i7;
        this.f9646g = i8;
        this.f9647h = f3;
        this.f9648i = i9;
        this.f9649j = str;
    }

    public static w a(U.t tVar) {
        List singletonList;
        int i3;
        int i4;
        try {
            tVar.H(21);
            int u3 = tVar.u() & 3;
            int u4 = tVar.u();
            int i5 = tVar.f2478b;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < u4; i8++) {
                tVar.H(1);
                int A3 = tVar.A();
                for (int i9 = 0; i9 < A3; i9++) {
                    int A4 = tVar.A();
                    i7 += A4 + 4;
                    tVar.H(A4);
                }
            }
            tVar.G(i5);
            byte[] bArr = new byte[i7];
            String str = null;
            int i10 = 0;
            int i11 = 0;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            float f3 = 1.0f;
            int i17 = -1;
            while (i10 < u4) {
                int u5 = tVar.u() & 63;
                int A5 = tVar.A();
                int i18 = 0;
                while (i18 < A5) {
                    int A6 = tVar.A();
                    int i19 = u4;
                    System.arraycopy(V.g.f2652a, i6, bArr, i11, 4);
                    int i20 = i11 + 4;
                    System.arraycopy(tVar.f2477a, tVar.f2478b, bArr, i20, A6);
                    if (u5 == 33 && i18 == 0) {
                        V.d c3 = V.g.c(bArr, i20, i20 + A6);
                        int i21 = c3.f2620e + 8;
                        i13 = c3.f2621f + 8;
                        i14 = c3.f2628m;
                        int i22 = c3.f2629n;
                        int i23 = c3.f2630o;
                        float f4 = c3.f2626k;
                        int i24 = c3.f2627l;
                        i3 = u5;
                        i4 = A5;
                        i12 = i21;
                        str = AbstractC0123a.c(c3.f2616a, c3.f2617b, c3.f2618c, c3.f2619d, c3.f2622g, c3.f2623h);
                        i16 = i23;
                        i15 = i22;
                        i17 = i24;
                        f3 = f4;
                    } else {
                        i3 = u5;
                        i4 = A5;
                    }
                    i11 = i20 + A6;
                    tVar.H(A6);
                    i18++;
                    u4 = i19;
                    u5 = i3;
                    A5 = i4;
                    i6 = 0;
                }
                i10++;
                i6 = 0;
            }
            if (i7 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new w(singletonList, u3 + 1, i12, i13, i14, i15, i16, f3, i17, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw R.H.a(e2, "Error parsing HEVC config");
        }
    }
}
