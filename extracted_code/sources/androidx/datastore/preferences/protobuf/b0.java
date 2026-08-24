package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: f  reason: collision with root package name */
    public static final b0 f4227f = new b0(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f4228a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f4229b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f4230c;

    /* renamed from: d  reason: collision with root package name */
    public int f4231d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4232e;

    public b0(int i3, int[] iArr, Object[] objArr, boolean z3) {
        this.f4228a = i3;
        this.f4229b = iArr;
        this.f4230c = objArr;
        this.f4232e = z3;
    }

    public final void a(int i3) {
        int[] iArr = this.f4229b;
        if (i3 > iArr.length) {
            int i4 = this.f4228a;
            int i5 = (i4 / 2) + i4;
            if (i5 >= i3) {
                i3 = i5;
            }
            if (i3 < 8) {
                i3 = 8;
            }
            this.f4229b = Arrays.copyOf(iArr, i3);
            this.f4230c = Arrays.copyOf(this.f4230c, i3);
        }
    }

    public final int b() {
        int B02;
        int i3 = this.f4231d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f4228a; i5++) {
            int i6 = this.f4229b[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 == 5) {
                                ((Integer) this.f4230c[i5]).getClass();
                                B02 = C0188k.m0(i7);
                            } else {
                                throw new IllegalStateException(C0201y.b());
                            }
                        } else {
                            i4 = ((b0) this.f4230c[i5]).b() + (C0188k.y0(i7) * 2) + i4;
                        }
                    } else {
                        B02 = C0188k.j0(i7, (C0184g) this.f4230c[i5]);
                    }
                } else {
                    ((Long) this.f4230c[i5]).getClass();
                    B02 = C0188k.n0(i7);
                }
            } else {
                B02 = C0188k.B0(((Long) this.f4230c[i5]).longValue(), i7);
            }
            i4 = B02 + i4;
        }
        this.f4231d = i4;
        return i4;
    }

    public final void c(int i3, Object obj) {
        if (this.f4232e) {
            a(this.f4228a + 1);
            int[] iArr = this.f4229b;
            int i4 = this.f4228a;
            iArr[i4] = i3;
            this.f4230c[i4] = obj;
            this.f4228a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(D d3) {
        if (this.f4228a == 0) {
            return;
        }
        d3.getClass();
        for (int i3 = 0; i3 < this.f4228a; i3++) {
            int i4 = this.f4229b[i3];
            Object obj = this.f4230c[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 5) {
                                d3.e(i5, ((Integer) obj).intValue());
                            } else {
                                throw new RuntimeException(C0201y.b());
                            }
                        } else {
                            C0188k c0188k = (C0188k) d3.f4168a;
                            c0188k.S0(i5, 3);
                            ((b0) obj).d(d3);
                            c0188k.S0(i5, 4);
                        }
                    } else {
                        d3.b(i5, (C0184g) obj);
                    }
                } else {
                    d3.f(((Long) obj).longValue(), i5);
                }
            } else {
                d3.j(((Long) obj).longValue(), i5);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        int i3 = this.f4228a;
        if (i3 == b0Var.f4228a) {
            int[] iArr = this.f4229b;
            int[] iArr2 = b0Var.f4229b;
            int i4 = 0;
            while (true) {
                if (i4 < i3) {
                    if (iArr[i4] != iArr2[i4]) {
                        break;
                    }
                    i4++;
                } else {
                    Object[] objArr = this.f4230c;
                    Object[] objArr2 = b0Var.f4230c;
                    int i5 = this.f4228a;
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (objArr[i6].equals(objArr2[i6])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.f4228a;
        int i4 = (527 + i3) * 31;
        int[] iArr = this.f4229b;
        int i5 = 17;
        int i6 = 17;
        for (int i7 = 0; i7 < i3; i7++) {
            i6 = (i6 * 31) + iArr[i7];
        }
        int i8 = (i4 + i6) * 31;
        Object[] objArr = this.f4230c;
        int i9 = this.f4228a;
        for (int i10 = 0; i10 < i9; i10++) {
            i5 = (i5 * 31) + objArr[i10].hashCode();
        }
        return i8 + i5;
    }
}
