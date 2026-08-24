package w0;

import U.AbstractC0123a;
import java.util.ArrayList;
/* renamed from: w0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0894d {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f9562a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9563b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9564c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9565d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9566e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9567f;

    /* renamed from: g  reason: collision with root package name */
    public final int f9568g;

    /* renamed from: h  reason: collision with root package name */
    public final int f9569h;

    /* renamed from: i  reason: collision with root package name */
    public final int f9570i;

    /* renamed from: j  reason: collision with root package name */
    public final int f9571j;

    /* renamed from: k  reason: collision with root package name */
    public final float f9572k;

    /* renamed from: l  reason: collision with root package name */
    public final String f9573l;

    public C0894d(ArrayList arrayList, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, float f3, String str) {
        this.f9562a = arrayList;
        this.f9563b = i3;
        this.f9564c = i4;
        this.f9565d = i5;
        this.f9566e = i6;
        this.f9567f = i7;
        this.f9568g = i8;
        this.f9569h = i9;
        this.f9570i = i10;
        this.f9571j = i11;
        this.f9572k = f3;
        this.f9573l = str;
    }

    public static C0894d a(U.t tVar) {
        byte[] bArr;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f3;
        try {
            tVar.H(4);
            int u3 = (tVar.u() & 3) + 1;
            if (u3 != 3) {
                ArrayList arrayList = new ArrayList();
                int u4 = tVar.u() & 31;
                int i11 = 0;
                while (true) {
                    bArr = AbstractC0123a.f2421a;
                    if (i11 >= u4) {
                        break;
                    }
                    int A3 = tVar.A();
                    int i12 = tVar.f2478b;
                    tVar.H(A3);
                    byte[] bArr2 = tVar.f2477a;
                    byte[] bArr3 = new byte[A3 + 4];
                    System.arraycopy(bArr, 0, bArr3, 0, 4);
                    System.arraycopy(bArr2, i12, bArr3, 4, A3);
                    arrayList.add(bArr3);
                    i11++;
                }
                int u5 = tVar.u();
                for (int i13 = 0; i13 < u5; i13++) {
                    int A4 = tVar.A();
                    int i14 = tVar.f2478b;
                    tVar.H(A4);
                    byte[] bArr4 = tVar.f2477a;
                    byte[] bArr5 = new byte[A4 + 4];
                    System.arraycopy(bArr, 0, bArr5, 0, 4);
                    System.arraycopy(bArr4, i14, bArr5, 4, A4);
                    arrayList.add(bArr5);
                }
                if (u4 > 0) {
                    V.f d3 = V.g.d((byte[]) arrayList.get(0), u3, ((byte[]) arrayList.get(0)).length);
                    int i15 = d3.f2637e;
                    int i16 = d3.f2638f;
                    int i17 = d3.f2648p;
                    int i18 = d3.f2649q;
                    int i19 = d3.f2650r;
                    int i20 = d3.f2651s;
                    float f4 = d3.f2639g;
                    str = AbstractC0123a.b(d3.f2633a, d3.f2634b, d3.f2635c);
                    i8 = i18;
                    i9 = i19;
                    i10 = i20;
                    f3 = f4;
                    i4 = i16;
                    i5 = d3.f2640h + 8;
                    i6 = d3.f2641i + 8;
                    i7 = i17;
                    i3 = i15;
                } else {
                    str = null;
                    i3 = -1;
                    i4 = -1;
                    i5 = -1;
                    i6 = -1;
                    i7 = -1;
                    i8 = -1;
                    i9 = -1;
                    i10 = 16;
                    f3 = 1.0f;
                }
                return new C0894d(arrayList, u3, i3, i4, i5, i6, i7, i8, i9, i10, f3, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw R.H.a(e2, "Error parsing AVC config");
        }
    }
}
