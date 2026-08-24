package U;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2469a;

    /* renamed from: b  reason: collision with root package name */
    public int f2470b;

    /* renamed from: c  reason: collision with root package name */
    public int f2471c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f2472d;

    /* renamed from: e  reason: collision with root package name */
    public int f2473e;

    public s() {
        this.f2469a = 0;
        this.f2472d = A.f2410f;
    }

    public void a() {
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        switch (this.f2469a) {
            case 0:
                int i5 = this.f2470b;
                if (i5 >= 0 && (i5 < (i3 = this.f2473e) || (i5 == i3 && this.f2471c == 0))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                AbstractC0123a.j(z3);
                return;
            default:
                int i6 = this.f2471c;
                if (i6 >= 0 && (i6 < (i4 = this.f2470b) || (i6 == i4 && this.f2473e == 0))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                AbstractC0123a.j(z4);
                return;
        }
    }

    public int b() {
        return ((this.f2473e - this.f2470b) * 8) - this.f2471c;
    }

    public void c() {
        if (this.f2471c == 0) {
            return;
        }
        this.f2471c = 0;
        this.f2470b++;
        a();
    }

    public boolean d(int i3) {
        int i4 = this.f2471c;
        int i5 = i3 / 8;
        int i6 = i4 + i5;
        int i7 = (this.f2473e + i3) - (i5 * 8);
        if (i7 > 7) {
            i6++;
            i7 -= 8;
        }
        while (true) {
            i4++;
            if (i4 > i6 || i6 >= this.f2470b) {
                break;
            } else if (r(i4)) {
                i6++;
                i4 += 2;
            }
        }
        int i8 = this.f2470b;
        if (i6 < i8) {
            return true;
        }
        if (i6 == i8 && i7 == 0) {
            return true;
        }
        return false;
    }

    public boolean e() {
        boolean z3;
        int i3 = this.f2471c;
        int i4 = this.f2473e;
        int i5 = 0;
        while (this.f2471c < this.f2470b && !h()) {
            i5++;
        }
        if (this.f2471c == this.f2470b) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f2471c = i3;
        this.f2473e = i4;
        if (z3 || !d((i5 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public int f() {
        boolean z3;
        if (this.f2471c == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        return this.f2470b;
    }

    public int g() {
        return (this.f2470b * 8) + this.f2471c;
    }

    public boolean h() {
        boolean z3;
        boolean z4;
        boolean z5;
        switch (this.f2469a) {
            case 0:
                if ((this.f2472d[this.f2470b] & (128 >> this.f2471c)) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                s();
                return z3;
            case 1:
            default:
                if ((((this.f2472d[this.f2471c] & 255) >> this.f2473e) & 1) == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                t(1);
                return z5;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                if ((this.f2472d[this.f2471c] & (128 >> this.f2473e)) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                s();
                return z4;
        }
    }

    public int i(int i3) {
        switch (this.f2469a) {
            case 0:
                if (i3 == 0) {
                    return 0;
                }
                this.f2471c += i3;
                int i4 = 0;
                while (true) {
                    int i5 = this.f2471c;
                    if (i5 > 8) {
                        int i6 = i5 - 8;
                        this.f2471c = i6;
                        byte[] bArr = this.f2472d;
                        int i7 = this.f2470b;
                        this.f2470b = i7 + 1;
                        i4 |= (bArr[i7] & 255) << i6;
                    } else {
                        byte[] bArr2 = this.f2472d;
                        int i8 = this.f2470b;
                        int i9 = ((-1) >>> (32 - i3)) & (i4 | ((bArr2[i8] & 255) >> (8 - i5)));
                        if (i5 == 8) {
                            this.f2471c = 0;
                            this.f2470b = i8 + 1;
                        }
                        a();
                        return i9;
                    }
                }
            case 1:
            default:
                int i10 = this.f2471c;
                int min = Math.min(i3, 8 - this.f2473e);
                int i11 = i10 + 1;
                byte[] bArr3 = this.f2472d;
                int i12 = ((bArr3[i10] & 255) >> this.f2473e) & (255 >> (8 - min));
                while (min < i3) {
                    i12 |= (bArr3[i11] & 255) << min;
                    min += 8;
                    i11++;
                }
                int i13 = i12 & ((-1) >>> (32 - i3));
                t(i3);
                return i13;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                this.f2473e += i3;
                int i14 = 0;
                while (true) {
                    int i15 = this.f2473e;
                    int i16 = 2;
                    if (i15 > 8) {
                        int i17 = i15 - 8;
                        this.f2473e = i17;
                        byte[] bArr4 = this.f2472d;
                        int i18 = this.f2471c;
                        i14 |= (bArr4[i18] & 255) << i17;
                        if (!r(i18 + 1)) {
                            i16 = 1;
                        }
                        this.f2471c = i18 + i16;
                    } else {
                        byte[] bArr5 = this.f2472d;
                        int i19 = this.f2471c;
                        int i20 = ((-1) >>> (32 - i3)) & (i14 | ((bArr5[i19] & 255) >> (8 - i15)));
                        if (i15 == 8) {
                            this.f2473e = 0;
                            if (!r(i19 + 1)) {
                                i16 = 1;
                            }
                            this.f2471c = i19 + i16;
                        }
                        a();
                        return i20;
                    }
                }
        }
    }

    public void j(byte[] bArr, int i3) {
        int i4 = i3 >> 3;
        for (int i5 = 0; i5 < i4; i5++) {
            byte[] bArr2 = this.f2472d;
            int i6 = this.f2470b;
            int i7 = i6 + 1;
            this.f2470b = i7;
            byte b3 = bArr2[i6];
            int i8 = this.f2471c;
            byte b4 = (byte) (b3 << i8);
            bArr[i5] = b4;
            bArr[i5] = (byte) (((255 & bArr2[i7]) >> (8 - i8)) | b4);
        }
        int i9 = i3 & 7;
        if (i9 == 0) {
            return;
        }
        byte b5 = (byte) (bArr[i4] & (255 >> i9));
        bArr[i4] = b5;
        int i10 = this.f2471c;
        if (i10 + i9 > 8) {
            byte[] bArr3 = this.f2472d;
            int i11 = this.f2470b;
            this.f2470b = i11 + 1;
            bArr[i4] = (byte) (b5 | ((bArr3[i11] & 255) << i10));
            this.f2471c = i10 - 8;
        }
        int i12 = this.f2471c + i9;
        this.f2471c = i12;
        byte[] bArr4 = this.f2472d;
        int i13 = this.f2470b;
        bArr[i4] = (byte) (((byte) (((255 & bArr4[i13]) >> (8 - i12)) << (8 - i9))) | bArr[i4]);
        if (i12 == 8) {
            this.f2471c = 0;
            this.f2470b = i13 + 1;
        }
        a();
    }

    public long k(int i3) {
        if (i3 <= 32) {
            int i4 = i(i3);
            int i5 = A.f2405a;
            return 4294967295L & i4;
        }
        int i6 = i(i3 - 32);
        int i7 = i(32);
        int i8 = A.f2405a;
        return (4294967295L & i7) | ((i6 & 4294967295L) << 32);
    }

    public void l(byte[] bArr, int i3) {
        boolean z3;
        if (this.f2471c == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        System.arraycopy(this.f2472d, this.f2470b, bArr, 0, i3);
        this.f2470b += i3;
        a();
    }

    public int m() {
        int i3 = 0;
        int i4 = 0;
        while (!h()) {
            i4++;
        }
        int i5 = (1 << i4) - 1;
        if (i4 > 0) {
            i3 = i(i4);
        }
        return i5 + i3;
    }

    public int n() {
        int i3;
        int m3 = m();
        if (m3 % 2 == 0) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        return ((m3 + 1) / 2) * i3;
    }

    public void o(t tVar) {
        p(tVar.f2477a, tVar.f2479c);
        q(tVar.f2478b * 8);
    }

    public void p(byte[] bArr, int i3) {
        this.f2472d = bArr;
        this.f2470b = 0;
        this.f2471c = 0;
        this.f2473e = i3;
    }

    public void q(int i3) {
        int i4 = i3 / 8;
        this.f2470b = i4;
        this.f2471c = i3 - (i4 * 8);
        a();
    }

    public boolean r(int i3) {
        if (2 <= i3 && i3 < this.f2470b) {
            byte[] bArr = this.f2472d;
            if (bArr[i3] == 3 && bArr[i3 - 2] == 0 && bArr[i3 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void s() {
        switch (this.f2469a) {
            case 0:
                int i3 = this.f2471c + 1;
                this.f2471c = i3;
                if (i3 == 8) {
                    this.f2471c = 0;
                    this.f2470b++;
                }
                a();
                return;
            default:
                int i4 = 1;
                int i5 = this.f2473e + 1;
                this.f2473e = i5;
                if (i5 == 8) {
                    this.f2473e = 0;
                    int i6 = this.f2471c;
                    if (r(i6 + 1)) {
                        i4 = 2;
                    }
                    this.f2471c = i6 + i4;
                }
                a();
                return;
        }
    }

    public void t(int i3) {
        int i4;
        switch (this.f2469a) {
            case 0:
                int i5 = i3 / 8;
                int i6 = this.f2470b + i5;
                this.f2470b = i6;
                int i7 = (i3 - (i5 * 8)) + this.f2471c;
                this.f2471c = i7;
                if (i7 > 7) {
                    this.f2470b = i6 + 1;
                    this.f2471c = i7 - 8;
                }
                a();
                return;
            case 1:
            default:
                int i8 = i3 / 8;
                int i9 = this.f2471c + i8;
                this.f2471c = i9;
                int i10 = (i3 - (i8 * 8)) + this.f2473e;
                this.f2473e = i10;
                boolean z3 = true;
                if (i10 > 7) {
                    this.f2471c = i9 + 1;
                    this.f2473e = i10 - 8;
                }
                int i11 = this.f2471c;
                if (i11 < 0 || (i11 >= (i4 = this.f2470b) && (i11 != i4 || this.f2473e != 0))) {
                    z3 = false;
                }
                AbstractC0123a.j(z3);
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                int i12 = this.f2471c;
                int i13 = i3 / 8;
                int i14 = i12 + i13;
                this.f2471c = i14;
                int i15 = (i3 - (i13 * 8)) + this.f2473e;
                this.f2473e = i15;
                if (i15 > 7) {
                    this.f2471c = i14 + 1;
                    this.f2473e = i15 - 8;
                }
                while (true) {
                    i12++;
                    if (i12 <= this.f2471c) {
                        if (r(i12)) {
                            this.f2471c++;
                            i12 += 2;
                        }
                    } else {
                        a();
                        return;
                    }
                }
        }
    }

    public void u(int i3) {
        boolean z3;
        if (this.f2471c == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        this.f2470b += i3;
        a();
    }

    public s(byte[] bArr) {
        this.f2469a = 3;
        this.f2472d = bArr;
        this.f2470b = bArr.length;
    }

    public s(byte[] bArr, int i3, int i4) {
        this.f2469a = 2;
        this.f2472d = bArr;
        this.f2471c = i3;
        this.f2470b = i4;
        this.f2473e = 0;
        a();
    }

    public s(byte[] bArr, int i3) {
        this.f2469a = 0;
        this.f2472d = bArr;
        this.f2473e = i3;
    }

    public s(int i3, int i4) {
        this.f2469a = 1;
        this.f2470b = i3;
        this.f2471c = i4;
        this.f2472d = new byte[(i4 * 2) - 1];
        this.f2473e = 0;
    }
}
