package a0;

import U.AbstractC0123a;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class Q extends S.e {

    /* renamed from: n  reason: collision with root package name */
    public int f3721n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3722o;

    /* renamed from: p  reason: collision with root package name */
    public int f3723p;

    /* renamed from: q  reason: collision with root package name */
    public long f3724q;

    /* renamed from: s  reason: collision with root package name */
    public byte[] f3726s;

    /* renamed from: v  reason: collision with root package name */
    public byte[] f3729v;

    /* renamed from: r  reason: collision with root package name */
    public int f3725r = 0;

    /* renamed from: t  reason: collision with root package name */
    public int f3727t = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f3728u = 0;

    /* renamed from: l  reason: collision with root package name */
    public final long f3719l = 100000;

    /* renamed from: i  reason: collision with root package name */
    public final float f3716i = 0.2f;

    /* renamed from: m  reason: collision with root package name */
    public final long f3720m = 2000000;

    /* renamed from: k  reason: collision with root package name */
    public final int f3718k = 10;

    /* renamed from: j  reason: collision with root package name */
    public final short f3717j = 1024;

    public Q() {
        byte[] bArr = U.A.f2410f;
        this.f3726s = bArr;
        this.f3729v = bArr;
    }

    @Override // S.e, S.d
    public final boolean a() {
        if (super.a() && this.f3722o) {
            return true;
        }
        return false;
    }

    @Override // S.d
    public final void g(ByteBuffer byteBuffer) {
        boolean z3;
        int limit;
        boolean z4;
        boolean z5;
        int position;
        while (byteBuffer.hasRemaining() && !this.f2165g.hasRemaining()) {
            int i3 = this.f3723p;
            short s3 = this.f3717j;
            boolean z6 = true;
            if (i3 != 0) {
                if (i3 == 1) {
                    if (this.f3727t < this.f3726s.length) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    AbstractC0123a.j(z3);
                    int limit2 = byteBuffer.limit();
                    int position2 = byteBuffer.position() + 1;
                    while (true) {
                        if (position2 < byteBuffer.limit()) {
                            if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s3) {
                                int i4 = this.f3721n;
                                limit = (position2 / i4) * i4;
                                break;
                            }
                            position2 += 2;
                        } else {
                            limit = byteBuffer.limit();
                            break;
                        }
                    }
                    int position3 = limit - byteBuffer.position();
                    int i5 = this.f3727t;
                    int i6 = this.f3728u;
                    int i7 = i5 + i6;
                    byte[] bArr = this.f3726s;
                    if (i7 < bArr.length) {
                        i5 = bArr.length;
                    } else {
                        i7 = i6 - (bArr.length - i5);
                    }
                    int i8 = i5 - i7;
                    if (limit < limit2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int min = Math.min(position3, i8);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f3726s, i7, min);
                    int i9 = this.f3728u + min;
                    this.f3728u = i9;
                    if (i9 <= this.f3726s.length) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    AbstractC0123a.j(z5);
                    z6 = (!z4 || position3 >= i8) ? false : false;
                    n(z6);
                    if (z6) {
                        this.f3723p = 0;
                        this.f3725r = 0;
                    }
                    byteBuffer.limit(limit2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f3726s.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((byteBuffer.get(limit4) << 8) | (byteBuffer.get(limit4 - 1) & 255)) > s3) {
                            int i10 = this.f3721n;
                            position = ((limit4 / i10) * i10) + i10;
                            break;
                        }
                        limit4 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f3723p = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    l(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // S.e
    public final S.b h(S.b bVar) {
        if (bVar.f2157c == 2) {
            if (bVar.f2155a == -1) {
                return S.b.f2154e;
            }
            return bVar;
        }
        throw new S.c(bVar);
    }

    @Override // S.e
    public final void i() {
        if (a()) {
            S.b bVar = this.f2160b;
            int i3 = bVar.f2156b * 2;
            this.f3721n = i3;
            int i4 = ((((int) ((this.f3719l * bVar.f2155a) / 1000000)) / 2) / i3) * i3 * 2;
            if (this.f3726s.length != i4) {
                this.f3726s = new byte[i4];
                this.f3729v = new byte[i4];
            }
        }
        this.f3723p = 0;
        this.f3724q = 0L;
        this.f3725r = 0;
        this.f3727t = 0;
        this.f3728u = 0;
    }

    @Override // S.e
    public final void j() {
        if (this.f3728u > 0) {
            n(true);
            this.f3725r = 0;
        }
    }

    @Override // S.e
    public final void k() {
        this.f3722o = false;
        byte[] bArr = U.A.f2410f;
        this.f3726s = bArr;
        this.f3729v = bArr;
    }

    public final int m(int i3) {
        boolean z3;
        int length = ((((int) ((this.f3720m * this.f2160b.f2155a) / 1000000)) - this.f3725r) * this.f3721n) - (this.f3726s.length / 2);
        if (length >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        int i4 = this.f3721n;
        return (((int) Math.min((i3 * this.f3716i) + 0.5f, length)) / i4) * i4;
    }

    public final void n(boolean z3) {
        int length;
        int m3;
        boolean z4;
        int i3;
        boolean z5;
        int i4 = this.f3728u;
        byte[] bArr = this.f3726s;
        if (i4 == bArr.length || z3) {
            boolean z6 = false;
            if (this.f3725r == 0) {
                if (z3) {
                    o(i4, 3);
                    length = i4;
                } else {
                    if (i4 >= bArr.length / 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    AbstractC0123a.j(z5);
                    length = this.f3726s.length / 2;
                    o(length, 0);
                }
                m3 = length;
            } else if (z3) {
                int length2 = i4 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int m4 = m(length2) + (this.f3726s.length / 2);
                o(m4, 2);
                m3 = m4;
                length = length3;
            } else {
                length = i4 - (bArr.length / 2);
                m3 = m(length);
                o(m3, 1);
            }
            if (length % this.f3721n == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            AbstractC0123a.i("bytesConsumed is not aligned to frame size: %s" + length, z4);
            if (i4 >= m3) {
                z6 = true;
            }
            AbstractC0123a.j(z6);
            this.f3728u -= length;
            int i5 = this.f3727t + length;
            this.f3727t = i5;
            this.f3727t = i5 % this.f3726s.length;
            this.f3725r = (m3 / this.f3721n) + this.f3725r;
            this.f3724q += (length - m3) / i3;
        }
    }

    public final void o(int i3, int i4) {
        boolean z3;
        boolean z4;
        boolean z5;
        if (i3 == 0) {
            return;
        }
        boolean z6 = true;
        if (this.f3728u >= i3) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        if (i4 == 2) {
            int i5 = this.f3727t;
            int i6 = this.f3728u;
            int i7 = i5 + i6;
            byte[] bArr = this.f3726s;
            if (i7 <= bArr.length) {
                System.arraycopy(bArr, i7 - i3, this.f3729v, 0, i3);
            } else {
                int length = i6 - (bArr.length - i5);
                if (length >= i3) {
                    System.arraycopy(bArr, length - i3, this.f3729v, 0, i3);
                } else {
                    int i8 = i3 - length;
                    System.arraycopy(bArr, bArr.length - i8, this.f3729v, 0, i8);
                    System.arraycopy(this.f3726s, 0, this.f3729v, i8, length);
                }
            }
        } else {
            int i9 = this.f3727t;
            int i10 = i9 + i3;
            byte[] bArr2 = this.f3726s;
            if (i10 <= bArr2.length) {
                System.arraycopy(bArr2, i9, this.f3729v, 0, i3);
            } else {
                int length2 = bArr2.length - i9;
                System.arraycopy(bArr2, i9, this.f3729v, 0, length2);
                System.arraycopy(this.f3726s, 0, this.f3729v, length2, i3 - length2);
            }
        }
        if (i3 % this.f3721n == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        AbstractC0123a.d("sizeToOutput is not aligned to frame size: " + i3, z4);
        if (this.f3727t < this.f3726s.length) {
            z5 = true;
        } else {
            z5 = false;
        }
        AbstractC0123a.j(z5);
        byte[] bArr3 = this.f3729v;
        if (i3 % this.f3721n != 0) {
            z6 = false;
        }
        AbstractC0123a.d("byteOutput size is not aligned to frame size " + i3, z6);
        if (i4 != 3) {
            for (int i11 = 0; i11 < i3; i11 += 2) {
                int i12 = i11 + 1;
                int i13 = (bArr3[i12] << 8) | (bArr3[i11] & 255);
                int i14 = this.f3718k;
                if (i4 == 0) {
                    i14 = ((((i11 * 1000) / (i3 - 1)) * (i14 - 100)) / 1000) + 100;
                } else if (i4 == 2) {
                    i14 += (((i11 * 1000) * (100 - i14)) / (i3 - 1)) / 1000;
                }
                int i15 = (i13 * i14) / 100;
                if (i15 >= 32767) {
                    bArr3[i11] = -1;
                    bArr3[i12] = Byte.MAX_VALUE;
                } else if (i15 <= -32768) {
                    bArr3[i11] = 0;
                    bArr3[i12] = Byte.MIN_VALUE;
                } else {
                    bArr3[i11] = (byte) (i15 & 255);
                    bArr3[i12] = (byte) (i15 >> 8);
                }
            }
        }
        l(i3).put(bArr3, 0, i3).flip();
    }
}
