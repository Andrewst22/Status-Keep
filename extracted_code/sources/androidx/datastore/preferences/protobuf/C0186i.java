package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: androidx.datastore.preferences.protobuf.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186i extends AbstractC0187j {

    /* renamed from: c  reason: collision with root package name */
    public final InputStream f4261c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f4262d;

    /* renamed from: e  reason: collision with root package name */
    public int f4263e;

    /* renamed from: f  reason: collision with root package name */
    public int f4264f;

    /* renamed from: g  reason: collision with root package name */
    public int f4265g;

    /* renamed from: h  reason: collision with root package name */
    public int f4266h;

    /* renamed from: i  reason: collision with root package name */
    public int f4267i;

    /* renamed from: j  reason: collision with root package name */
    public int f4268j = Integer.MAX_VALUE;

    public C0186i(InputStream inputStream) {
        Charset charset = AbstractC0199w.f4313a;
        this.f4261c = inputStream;
        this.f4262d = new byte[4096];
        this.f4263e = 0;
        this.f4265g = 0;
        this.f4267i = 0;
    }

    public final byte[] A(int i3) {
        if (i3 == 0) {
            return AbstractC0199w.f4314b;
        }
        if (i3 >= 0) {
            int i4 = this.f4267i;
            int i5 = this.f4265g;
            int i6 = i4 + i5 + i3;
            if (i6 - Integer.MAX_VALUE <= 0) {
                int i7 = this.f4268j;
                if (i6 <= i7) {
                    int i8 = this.f4263e - i5;
                    int i9 = i3 - i8;
                    InputStream inputStream = this.f4261c;
                    if (i9 >= 4096) {
                        try {
                            if (i9 > inputStream.available()) {
                                return null;
                            }
                        } catch (C0201y e2) {
                            e2.f4315m = true;
                            throw e2;
                        }
                    }
                    byte[] bArr = new byte[i3];
                    System.arraycopy(this.f4262d, this.f4265g, bArr, 0, i8);
                    this.f4267i += this.f4263e;
                    this.f4265g = 0;
                    this.f4263e = 0;
                    while (i8 < i3) {
                        try {
                            int read = inputStream.read(bArr, i8, i3 - i8);
                            if (read != -1) {
                                this.f4267i += read;
                                i8 += read;
                            } else {
                                throw C0201y.e();
                            }
                        } catch (C0201y e3) {
                            e3.f4315m = true;
                            throw e3;
                        }
                    }
                    return bArr;
                }
                J((i7 - i4) - i5);
                throw C0201y.e();
            }
            throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw C0201y.d();
    }

    public final ArrayList B(int i3) {
        ArrayList arrayList = new ArrayList();
        while (i3 > 0) {
            int min = Math.min(i3, 4096);
            byte[] bArr = new byte[min];
            int i4 = 0;
            while (i4 < min) {
                int read = this.f4261c.read(bArr, i4, min - i4);
                if (read != -1) {
                    this.f4267i += read;
                    i4 += read;
                } else {
                    throw C0201y.e();
                }
            }
            i3 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int C() {
        int i3 = this.f4265g;
        if (this.f4263e - i3 < 4) {
            I(4);
            i3 = this.f4265g;
        }
        this.f4265g = i3 + 4;
        byte[] bArr = this.f4262d;
        return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
    }

    public final long D() {
        int i3 = this.f4265g;
        if (this.f4263e - i3 < 8) {
            I(8);
            i3 = this.f4265g;
        }
        this.f4265g = i3 + 8;
        byte[] bArr = this.f4262d;
        return ((bArr[i3 + 7] & 255) << 56) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48);
    }

    public final int E() {
        int i3;
        int i4 = this.f4265g;
        int i5 = this.f4263e;
        if (i5 != i4) {
            int i6 = i4 + 1;
            byte[] bArr = this.f4262d;
            byte b3 = bArr[i4];
            if (b3 >= 0) {
                this.f4265g = i6;
                return b3;
            } else if (i5 - i6 >= 9) {
                int i7 = i4 + 2;
                int i8 = (bArr[i6] << 7) ^ b3;
                if (i8 < 0) {
                    i3 = i8 ^ (-128);
                } else {
                    int i9 = i4 + 3;
                    int i10 = (bArr[i7] << 14) ^ i8;
                    if (i10 >= 0) {
                        i3 = i10 ^ 16256;
                    } else {
                        int i11 = i4 + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            i3 = (-2080896) ^ i12;
                        } else {
                            i9 = i4 + 5;
                            byte b4 = bArr[i11];
                            int i13 = (i12 ^ (b4 << 28)) ^ 266354560;
                            if (b4 < 0) {
                                i11 = i4 + 6;
                                if (bArr[i9] < 0) {
                                    i9 = i4 + 7;
                                    if (bArr[i11] < 0) {
                                        i11 = i4 + 8;
                                        if (bArr[i9] < 0) {
                                            i9 = i4 + 9;
                                            if (bArr[i11] < 0) {
                                                int i14 = i4 + 10;
                                                if (bArr[i9] >= 0) {
                                                    i7 = i14;
                                                    i3 = i13;
                                                }
                                            }
                                        }
                                    }
                                }
                                i3 = i13;
                            }
                            i3 = i13;
                        }
                        i7 = i11;
                    }
                    i7 = i9;
                }
                this.f4265g = i7;
                return i3;
            }
        }
        return (int) G();
    }

    public final long F() {
        long j3;
        long j4;
        long j5;
        long j6;
        int i3 = this.f4265g;
        int i4 = this.f4263e;
        if (i4 != i3) {
            int i5 = i3 + 1;
            byte[] bArr = this.f4262d;
            byte b3 = bArr[i3];
            if (b3 >= 0) {
                this.f4265g = i5;
                return b3;
            } else if (i4 - i5 >= 9) {
                int i6 = i3 + 2;
                int i7 = (bArr[i5] << 7) ^ b3;
                if (i7 < 0) {
                    j3 = i7 ^ (-128);
                } else {
                    int i8 = i3 + 3;
                    int i9 = (bArr[i6] << 14) ^ i7;
                    if (i9 >= 0) {
                        j3 = i9 ^ 16256;
                        i6 = i8;
                    } else {
                        int i10 = i3 + 4;
                        int i11 = i9 ^ (bArr[i8] << 21);
                        if (i11 < 0) {
                            j6 = (-2080896) ^ i11;
                        } else {
                            long j7 = i11;
                            i6 = i3 + 5;
                            long j8 = j7 ^ (bArr[i10] << 28);
                            if (j8 >= 0) {
                                j5 = 266354560;
                            } else {
                                i10 = i3 + 6;
                                long j9 = j8 ^ (bArr[i6] << 35);
                                if (j9 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    i6 = i3 + 7;
                                    j8 = j9 ^ (bArr[i10] << 42);
                                    if (j8 >= 0) {
                                        j5 = 4363953127296L;
                                    } else {
                                        i10 = i3 + 8;
                                        j9 = j8 ^ (bArr[i6] << 49);
                                        if (j9 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            i6 = i3 + 9;
                                            long j10 = (j9 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                int i12 = i3 + 10;
                                                if (bArr[i6] >= 0) {
                                                    i6 = i12;
                                                }
                                            }
                                            j3 = j10;
                                        }
                                    }
                                }
                                j6 = j4 ^ j9;
                            }
                            j3 = j5 ^ j8;
                        }
                        i6 = i10;
                        j3 = j6;
                    }
                }
                this.f4265g = i6;
                return j3;
            }
        }
        return G();
    }

    public final long G() {
        long j3 = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            if (this.f4265g == this.f4263e) {
                I(1);
            }
            int i4 = this.f4265g;
            this.f4265g = i4 + 1;
            byte b3 = this.f4262d[i4];
            j3 |= (b3 & Byte.MAX_VALUE) << i3;
            if ((b3 & 128) == 0) {
                return j3;
            }
        }
        throw C0201y.c();
    }

    public final void H() {
        int i3 = this.f4263e + this.f4264f;
        this.f4263e = i3;
        int i4 = this.f4267i + i3;
        int i5 = this.f4268j;
        if (i4 > i5) {
            int i6 = i4 - i5;
            this.f4264f = i6;
            this.f4263e = i3 - i6;
            return;
        }
        this.f4264f = 0;
    }

    public final void I(int i3) {
        if (!K(i3)) {
            if (i3 > (Integer.MAX_VALUE - this.f4267i) - this.f4265g) {
                throw new IOException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            throw C0201y.e();
        }
    }

    public final void J(int i3) {
        int i4 = this.f4263e;
        int i5 = this.f4265g;
        if (i3 <= i4 - i5 && i3 >= 0) {
            this.f4265g = i5 + i3;
            return;
        }
        InputStream inputStream = this.f4261c;
        if (i3 >= 0) {
            int i6 = this.f4267i;
            int i7 = i6 + i5;
            int i8 = i7 + i3;
            int i9 = this.f4268j;
            if (i8 <= i9) {
                this.f4267i = i7;
                int i10 = i4 - i5;
                this.f4263e = 0;
                this.f4265g = 0;
                while (i10 < i3) {
                    long j3 = i3 - i10;
                    try {
                        try {
                            long skip = inputStream.skip(j3);
                            int i11 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                            if (i11 >= 0 && skip <= j3) {
                                if (i11 == 0) {
                                    break;
                                }
                                i10 += (int) skip;
                            } else {
                                throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                            }
                        } catch (C0201y e2) {
                            e2.f4315m = true;
                            throw e2;
                        }
                    } catch (Throwable th) {
                        this.f4267i += i10;
                        H();
                        throw th;
                    }
                }
                this.f4267i += i10;
                H();
                if (i10 < i3) {
                    int i12 = this.f4263e;
                    int i13 = i12 - this.f4265g;
                    this.f4265g = i12;
                    I(1);
                    while (true) {
                        int i14 = i3 - i13;
                        int i15 = this.f4263e;
                        if (i14 > i15) {
                            i13 += i15;
                            this.f4265g = i15;
                            I(1);
                        } else {
                            this.f4265g = i14;
                            return;
                        }
                    }
                }
            } else {
                J((i9 - i6) - i5);
                throw C0201y.e();
            }
        } else {
            throw C0201y.d();
        }
    }

    public final boolean K(int i3) {
        InputStream inputStream;
        int i4 = this.f4265g;
        int i5 = i4 + i3;
        int i6 = this.f4263e;
        if (i5 > i6) {
            int i7 = this.f4267i;
            if (i3 > (Integer.MAX_VALUE - i7) - i4 || i7 + i4 + i3 > this.f4268j) {
                return false;
            }
            byte[] bArr = this.f4262d;
            if (i4 > 0) {
                if (i6 > i4) {
                    System.arraycopy(bArr, i4, bArr, 0, i6 - i4);
                }
                this.f4267i += i4;
                this.f4263e -= i4;
                this.f4265g = 0;
            }
            int i8 = this.f4263e;
            int min = Math.min(bArr.length - i8, (Integer.MAX_VALUE - this.f4267i) - i8);
            try {
                int read = this.f4261c.read(bArr, i8, min);
                if (read != 0 && read >= -1 && read <= bArr.length) {
                    if (read <= 0) {
                        return false;
                    }
                    this.f4263e += read;
                    H();
                    if (this.f4263e >= i3) {
                        return true;
                    }
                    return K(i3);
                }
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            } catch (C0201y e2) {
                e2.f4315m = true;
                throw e2;
            }
        }
        throw new IllegalStateException("refillBuffer() called when " + i3 + " bytes were already available in buffer");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final void a(int i3) {
        if (this.f4266h == i3) {
            return;
        }
        throw new IOException("Protocol message end-group tag did not match expected tag.");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final int b() {
        return this.f4267i + this.f4265g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final boolean c() {
        if (this.f4265g == this.f4263e && !K(1)) {
            return true;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final void d(int i3) {
        this.f4268j = i3;
        H();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final int e(int i3) {
        if (i3 >= 0) {
            int i4 = this.f4267i + this.f4265g + i3;
            if (i4 >= 0) {
                int i5 = this.f4268j;
                if (i4 <= i5) {
                    this.f4268j = i4;
                    H();
                    return i5;
                }
                throw C0201y.e();
            }
            throw new IOException("Failed to parse the message.");
        }
        throw C0201y.d();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final boolean f() {
        if (F() != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final C0184g g() {
        int E3 = E();
        int i3 = this.f4263e;
        int i4 = this.f4265g;
        int i5 = i3 - i4;
        byte[] bArr = this.f4262d;
        if (E3 <= i5 && E3 > 0) {
            C0184g c3 = C0184g.c(bArr, i4, E3);
            this.f4265g += E3;
            return c3;
        } else if (E3 == 0) {
            return C0184g.f4242o;
        } else {
            if (E3 >= 0) {
                byte[] A3 = A(E3);
                if (A3 != null) {
                    return C0184g.c(A3, 0, A3.length);
                }
                int i6 = this.f4265g;
                int i7 = this.f4263e;
                int i8 = i7 - i6;
                this.f4267i += i7;
                this.f4265g = 0;
                this.f4263e = 0;
                ArrayList B3 = B(E3 - i8);
                byte[] bArr2 = new byte[E3];
                System.arraycopy(bArr, i6, bArr2, 0, i8);
                Iterator it = B3.iterator();
                while (it.hasNext()) {
                    byte[] bArr3 = (byte[]) it.next();
                    System.arraycopy(bArr3, 0, bArr2, i8, bArr3.length);
                    i8 += bArr3.length;
                }
                C0184g c0184g = C0184g.f4242o;
                return new C0184g(bArr2);
            }
            throw C0201y.d();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final double h() {
        return Double.longBitsToDouble(D());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final int i() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final int j() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final long k() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final float l() {
        return Float.intBitsToFloat(C());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final int m() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final long n() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final int o() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final long p() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final int q() {
        int E3 = E();
        return (-(E3 & 1)) ^ (E3 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final long r() {
        long F3 = F();
        return (-(F3 & 1)) ^ (F3 >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final String s() {
        int E3 = E();
        byte[] bArr = this.f4262d;
        if (E3 > 0) {
            int i3 = this.f4263e;
            int i4 = this.f4265g;
            if (E3 <= i3 - i4) {
                String str = new String(bArr, i4, E3, AbstractC0199w.f4313a);
                this.f4265g += E3;
                return str;
            }
        }
        if (E3 == 0) {
            return "";
        }
        if (E3 >= 0) {
            if (E3 <= this.f4263e) {
                I(E3);
                String str2 = new String(bArr, this.f4265g, E3, AbstractC0199w.f4313a);
                this.f4265g += E3;
                return str2;
            }
            return new String(z(E3), AbstractC0199w.f4313a);
        }
        throw C0201y.d();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final String t() {
        int E3 = E();
        int i3 = this.f4265g;
        int i4 = this.f4263e;
        int i5 = i4 - i3;
        byte[] bArr = this.f4262d;
        if (E3 <= i5 && E3 > 0) {
            this.f4265g = i3 + E3;
        } else if (E3 == 0) {
            return "";
        } else {
            if (E3 >= 0) {
                i3 = 0;
                if (E3 <= i4) {
                    I(E3);
                    this.f4265g = E3;
                } else {
                    bArr = z(E3);
                }
            } else {
                throw C0201y.d();
            }
        }
        return k0.f4279a.v(bArr, i3, E3);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final int u() {
        if (c()) {
            this.f4266h = 0;
            return 0;
        }
        int E3 = E();
        this.f4266h = E3;
        if ((E3 >>> 3) != 0) {
            return E3;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final int v() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final long w() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0187j
    public final boolean x(int i3) {
        int i4 = i3 & 7;
        int i5 = 0;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            return false;
                        }
                        if (i4 == 5) {
                            J(4);
                            return true;
                        }
                        throw C0201y.b();
                    }
                    y();
                    a(((i3 >>> 3) << 3) | 4);
                    return true;
                }
                J(E());
                return true;
            }
            J(8);
            return true;
        }
        int i6 = this.f4263e - this.f4265g;
        byte[] bArr = this.f4262d;
        if (i6 >= 10) {
            while (i5 < 10) {
                int i7 = this.f4265g;
                this.f4265g = i7 + 1;
                if (bArr[i7] < 0) {
                    i5++;
                }
            }
            throw C0201y.c();
        }
        while (i5 < 10) {
            if (this.f4265g == this.f4263e) {
                I(1);
            }
            int i8 = this.f4265g;
            this.f4265g = i8 + 1;
            if (bArr[i8] < 0) {
                i5++;
            }
        }
        throw C0201y.c();
        return true;
    }

    public final byte[] z(int i3) {
        byte[] A3 = A(i3);
        if (A3 != null) {
            return A3;
        }
        int i4 = this.f4265g;
        int i5 = this.f4263e;
        int i6 = i5 - i4;
        this.f4267i += i5;
        this.f4265g = 0;
        this.f4263e = 0;
        ArrayList B3 = B(i3 - i6);
        byte[] bArr = new byte[i3];
        System.arraycopy(this.f4262d, i4, bArr, 0, i6);
        Iterator it = B3.iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            System.arraycopy(bArr2, 0, bArr, i6, bArr2.length);
            i6 += bArr2.length;
        }
        return bArr;
    }
}
