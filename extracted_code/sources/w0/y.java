package w0;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public int f9654a;

    /* renamed from: b  reason: collision with root package name */
    public int f9655b;

    /* renamed from: c  reason: collision with root package name */
    public int f9656c;

    /* renamed from: d  reason: collision with root package name */
    public int f9657d;

    /* renamed from: e  reason: collision with root package name */
    public int f9658e;

    /* renamed from: f  reason: collision with root package name */
    public int f9659f;

    /* renamed from: g  reason: collision with root package name */
    public Serializable f9660g;

    public boolean a(int i3) {
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
            return false;
        }
        this.f9654a = i4;
        this.f9660g = AbstractC0892b.f9550s[3 - i5];
        int i10 = AbstractC0892b.f9551t[i7];
        this.f9656c = i10;
        int i11 = 2;
        if (i4 == 2) {
            this.f9656c = i10 / 2;
        } else if (i4 == 0) {
            this.f9656c = i10 / 4;
        }
        int i12 = (i3 >>> 9) & 1;
        int i13 = 1152;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    i13 = 384;
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } else if (i4 != 3) {
            i13 = 576;
        }
        this.f9659f = i13;
        if (i5 == 3) {
            if (i4 == 3) {
                i9 = AbstractC0892b.f9552u[i6 - 1];
            } else {
                i9 = AbstractC0892b.f9553v[i6 - 1];
            }
            this.f9658e = i9;
            this.f9655b = (((i9 * 12) / this.f9656c) + i12) * 4;
        } else {
            int i14 = 144;
            if (i4 == 3) {
                if (i5 == 2) {
                    i8 = AbstractC0892b.f9554w[i6 - 1];
                } else {
                    i8 = AbstractC0892b.x[i6 - 1];
                }
                this.f9658e = i8;
                this.f9655b = ((i8 * 144) / this.f9656c) + i12;
            } else {
                int i15 = AbstractC0892b.f9555y[i6 - 1];
                this.f9658e = i15;
                if (i5 == 1) {
                    i14 = 72;
                }
                this.f9655b = ((i14 * i15) / this.f9656c) + i12;
            }
        }
        if (((i3 >> 6) & 3) == 3) {
            i11 = 1;
        }
        this.f9657d = i11;
        return true;
    }
}
