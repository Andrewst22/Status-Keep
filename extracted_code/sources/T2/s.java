package T2;

import a.AbstractC0155a;
import java.util.Arrays;
import n2.AbstractC0664g;
import t2.AbstractC0826c;
/* loaded from: classes.dex */
public final class s extends b {

    /* renamed from: q  reason: collision with root package name */
    public final transient byte[][] f2399q;

    /* renamed from: r  reason: collision with root package name */
    public final transient int[] f2400r;

    public s(byte[][] bArr, int[] iArr) {
        super(b.f2354p.f2355m);
        this.f2399q = bArr;
        this.f2400r = iArr;
    }

    @Override // T2.b
    public final int b() {
        return this.f2400r[this.f2399q.length - 1];
    }

    @Override // T2.b
    public final String c() {
        return new b(p()).c();
    }

    @Override // T2.b
    public final int d(byte[] bArr, int i3) {
        D2.i.e(bArr, "other");
        return new b(p()).d(bArr, i3);
    }

    @Override // T2.b
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.b() == b() && k(0, bVar, b())) {
                return true;
            }
        }
        return false;
    }

    @Override // T2.b
    public final byte[] f() {
        return p();
    }

    @Override // T2.b
    public final byte g(int i3) {
        int i4;
        byte[][] bArr = this.f2399q;
        int[] iArr = this.f2400r;
        AbstractC0155a.n(iArr[bArr.length - 1], i3, 1L);
        int e2 = U2.a.e(this, i3);
        if (e2 == 0) {
            i4 = 0;
        } else {
            i4 = iArr[e2 - 1];
        }
        return bArr[e2][(i3 - i4) + iArr[bArr.length + e2]];
    }

    @Override // T2.b
    public final int h(byte[] bArr, int i3) {
        D2.i.e(bArr, "other");
        return new b(p()).h(bArr, i3);
    }

    @Override // T2.b
    public final int hashCode() {
        int i3 = this.f2356n;
        if (i3 == 0) {
            byte[][] bArr = this.f2399q;
            int length = bArr.length;
            int i4 = 0;
            int i5 = 1;
            int i6 = 0;
            while (i4 < length) {
                int[] iArr = this.f2400r;
                int i7 = iArr[length + i4];
                int i8 = iArr[i4];
                byte[] bArr2 = bArr[i4];
                int i9 = (i8 - i6) + i7;
                while (i7 < i9) {
                    i5 = (i5 * 31) + bArr2[i7];
                    i7++;
                }
                i4++;
                i6 = i8;
            }
            this.f2356n = i5;
            return i5;
        }
        return i3;
    }

    @Override // T2.b
    public final boolean j(int i3, int i4, int i5, byte[] bArr) {
        int i6;
        D2.i.e(bArr, "other");
        if (i3 < 0 || i3 > b() - i5 || i4 < 0 || i4 > bArr.length - i5) {
            return false;
        }
        int i7 = i5 + i3;
        int e2 = U2.a.e(this, i3);
        while (i3 < i7) {
            int[] iArr = this.f2400r;
            if (e2 == 0) {
                i6 = 0;
            } else {
                i6 = iArr[e2 - 1];
            }
            byte[][] bArr2 = this.f2399q;
            int i8 = iArr[bArr2.length + e2];
            int min = Math.min(i7, (iArr[e2] - i6) + i6) - i3;
            if (!AbstractC0155a.e((i3 - i6) + i8, i4, min, bArr2[e2], bArr)) {
                return false;
            }
            i4 += min;
            i3 += min;
            e2++;
        }
        return true;
    }

    @Override // T2.b
    public final boolean k(int i3, b bVar, int i4) {
        int i5;
        D2.i.e(bVar, "other");
        if (i3 < 0 || i3 > b() - i4) {
            return false;
        }
        int i6 = i4 + i3;
        int e2 = U2.a.e(this, i3);
        int i7 = 0;
        while (i3 < i6) {
            int[] iArr = this.f2400r;
            if (e2 == 0) {
                i5 = 0;
            } else {
                i5 = iArr[e2 - 1];
            }
            byte[][] bArr = this.f2399q;
            int i8 = iArr[bArr.length + e2];
            int min = Math.min(i6, (iArr[e2] - i5) + i5) - i3;
            if (!bVar.j(i7, (i3 - i5) + i8, min, bArr[e2])) {
                return false;
            }
            i7 += min;
            i3 += min;
            e2++;
        }
        return true;
    }

    @Override // T2.b
    public final b l(int i3, int i4) {
        if (i4 == -1234567890) {
            i4 = b();
        }
        if (i3 >= 0) {
            if (i4 <= b()) {
                int i5 = i4 - i3;
                if (i5 >= 0) {
                    if (i3 == 0 && i4 == b()) {
                        return this;
                    }
                    if (i3 == i4) {
                        return b.f2354p;
                    }
                    int e2 = U2.a.e(this, i3);
                    int e3 = U2.a.e(this, i4 - 1);
                    int i6 = e3 + 1;
                    byte[][] bArr = this.f2399q;
                    D2.i.e(bArr, "<this>");
                    AbstractC0664g.e(i6, bArr.length);
                    Object[] copyOfRange = Arrays.copyOfRange(bArr, e2, i6);
                    D2.i.d(copyOfRange, "copyOfRange(...)");
                    byte[][] bArr2 = (byte[][]) copyOfRange;
                    int[] iArr = new int[bArr2.length * 2];
                    int i7 = 0;
                    int[] iArr2 = this.f2400r;
                    if (e2 <= e3) {
                        int i8 = e2;
                        int i9 = 0;
                        while (true) {
                            iArr[i9] = Math.min(iArr2[i8] - i3, i5);
                            int i10 = i9 + 1;
                            iArr[i9 + bArr2.length] = iArr2[bArr.length + i8];
                            if (i8 == e3) {
                                break;
                            }
                            i8++;
                            i9 = i10;
                        }
                    }
                    if (e2 != 0) {
                        i7 = iArr2[e2 - 1];
                    }
                    int length = bArr2.length;
                    iArr[length] = (i3 - i7) + iArr[length];
                    return new s(bArr2, iArr);
                }
                throw new IllegalArgumentException(D2.h.j(i4, i3, "endIndex=", " < beginIndex=").toString());
            }
            throw new IllegalArgumentException(("endIndex=" + i4 + " > length(" + b() + ')').toString());
        }
        throw new IllegalArgumentException(("beginIndex=" + i3 + " < 0").toString());
    }

    @Override // T2.b
    public final void o(a aVar, int i3) {
        int i4;
        D2.i.e(aVar, "buffer");
        int e2 = U2.a.e(this, 0);
        int i5 = 0;
        while (i5 < i3) {
            int[] iArr = this.f2400r;
            if (e2 == 0) {
                i4 = 0;
            } else {
                i4 = iArr[e2 - 1];
            }
            byte[][] bArr = this.f2399q;
            int i6 = iArr[bArr.length + e2];
            int min = Math.min(i3, (iArr[e2] - i4) + i4) - i5;
            int i7 = (i5 - i4) + i6;
            q qVar = new q(bArr[e2], i7, i7 + min, true);
            q qVar2 = aVar.f2352m;
            if (qVar2 == null) {
                qVar.f2395g = qVar;
                qVar.f2394f = qVar;
                aVar.f2352m = qVar;
            } else {
                q qVar3 = qVar2.f2395g;
                D2.i.b(qVar3);
                qVar3.b(qVar);
            }
            i5 += min;
            e2++;
        }
        aVar.f2353n += i3;
    }

    public final byte[] p() {
        byte[] bArr = new byte[b()];
        byte[][] bArr2 = this.f2399q;
        int length = bArr2.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < length) {
            int[] iArr = this.f2400r;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            int i8 = i7 - i4;
            AbstractC0826c.z(i5, i6, i6 + i8, bArr2[i3], bArr);
            i5 += i8;
            i3++;
            i4 = i7;
        }
        return bArr;
    }

    @Override // T2.b
    public final String toString() {
        return new b(p()).toString();
    }
}
