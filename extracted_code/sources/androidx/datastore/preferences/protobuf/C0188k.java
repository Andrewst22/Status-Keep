package androidx.datastore.preferences.protobuf;

import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: androidx.datastore.preferences.protobuf.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188k extends android.support.v4.media.session.a {

    /* renamed from: g  reason: collision with root package name */
    public static final Logger f4272g = Logger.getLogger(C0188k.class.getName());

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f4273h = h0.f4258e;

    /* renamed from: b  reason: collision with root package name */
    public D f4274b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f4275c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4276d;

    /* renamed from: e  reason: collision with root package name */
    public int f4277e;

    /* renamed from: f  reason: collision with root package name */
    public final OutputStream f4278f;

    public C0188k(OutputStream outputStream, int i3) {
        if (i3 >= 0) {
            int max = Math.max(i3, 20);
            this.f4275c = new byte[max];
            this.f4276d = max;
            if (outputStream != null) {
                this.f4278f = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public static int A0(int i3) {
        return (352 - (Integer.numberOfLeadingZeros(i3) * 9)) >>> 6;
    }

    public static int B0(long j3, int i3) {
        return C0(j3) + y0(i3);
    }

    public static int C0(long j3) {
        return (640 - (Long.numberOfLeadingZeros(j3) * 9)) >>> 6;
    }

    public static int i0(int i3) {
        return y0(i3) + 1;
    }

    public static int j0(int i3, C0184g c0184g) {
        int y02 = y0(i3);
        int size = c0184g.size();
        return A0(size) + size + y02;
    }

    public static int k0(int i3) {
        return y0(i3) + 8;
    }

    public static int l0(int i3, int i4) {
        return C0(i4) + y0(i3);
    }

    public static int m0(int i3) {
        return y0(i3) + 4;
    }

    public static int n0(int i3) {
        return y0(i3) + 8;
    }

    public static int o0(int i3) {
        return y0(i3) + 4;
    }

    public static int p0(int i3, AbstractC0178a abstractC0178a, U u3) {
        return abstractC0178a.a(u3) + (y0(i3) * 2);
    }

    public static int q0(int i3, int i4) {
        return C0(i4) + y0(i3);
    }

    public static int r0(long j3, int i3) {
        return C0(j3) + y0(i3);
    }

    public static int s0(int i3) {
        return y0(i3) + 4;
    }

    public static int t0(int i3) {
        return y0(i3) + 8;
    }

    public static int u0(int i3, int i4) {
        return A0((i4 >> 31) ^ (i4 << 1)) + y0(i3);
    }

    public static int v0(long j3, int i3) {
        return C0((j3 >> 63) ^ (j3 << 1)) + y0(i3);
    }

    public static int w0(String str, int i3) {
        return x0(str) + y0(i3);
    }

    public static int x0(String str) {
        int length;
        try {
            length = k0.a(str);
        } catch (j0 unused) {
            length = str.getBytes(AbstractC0199w.f4313a).length;
        }
        return A0(length) + length;
    }

    public static int y0(int i3) {
        return A0(i3 << 3);
    }

    public static int z0(int i3, int i4) {
        return A0(i4) + y0(i3);
    }

    public final void D0() {
        this.f4278f.write(this.f4275c, 0, this.f4277e);
        this.f4277e = 0;
    }

    public final void E0(int i3) {
        if (this.f4276d - this.f4277e < i3) {
            D0();
        }
    }

    public final void F0(byte b3) {
        if (this.f4277e == this.f4276d) {
            D0();
        }
        int i3 = this.f4277e;
        this.f4277e = i3 + 1;
        this.f4275c[i3] = b3;
    }

    public final void G0(byte[] bArr, int i3, int i4) {
        int i5 = this.f4277e;
        int i6 = this.f4276d;
        int i7 = i6 - i5;
        byte[] bArr2 = this.f4275c;
        if (i7 >= i4) {
            System.arraycopy(bArr, i3, bArr2, i5, i4);
            this.f4277e += i4;
            return;
        }
        System.arraycopy(bArr, i3, bArr2, i5, i7);
        int i8 = i3 + i7;
        int i9 = i4 - i7;
        this.f4277e = i6;
        D0();
        if (i9 <= i6) {
            System.arraycopy(bArr, i8, bArr2, 0, i9);
            this.f4277e = i9;
            return;
        }
        this.f4278f.write(bArr, i8, i9);
    }

    public final void H0(int i3, boolean z3) {
        E0(11);
        f0(i3, 0);
        byte b3 = z3 ? (byte) 1 : (byte) 0;
        int i4 = this.f4277e;
        this.f4277e = i4 + 1;
        this.f4275c[i4] = b3;
    }

    public final void I0(int i3, C0184g c0184g) {
        S0(i3, 2);
        J0(c0184g);
    }

    public final void J0(C0184g c0184g) {
        U0(c0184g.size());
        c0(c0184g.f4245n, c0184g.e(), c0184g.size());
    }

    public final void K0(int i3, int i4) {
        E0(14);
        f0(i3, 5);
        d0(i4);
    }

    public final void L0(int i3) {
        E0(4);
        d0(i3);
    }

    public final void M0(long j3, int i3) {
        E0(18);
        f0(i3, 1);
        e0(j3);
    }

    public final void N0(long j3) {
        E0(8);
        e0(j3);
    }

    public final void O0(int i3, int i4) {
        E0(20);
        f0(i3, 0);
        if (i4 >= 0) {
            g0(i4);
        } else {
            h0(i4);
        }
    }

    public final void P0(int i3) {
        if (i3 >= 0) {
            U0(i3);
        } else {
            W0(i3);
        }
    }

    public final void Q0(String str, int i3) {
        S0(i3, 2);
        R0(str);
    }

    public final void R0(String str) {
        try {
            int length = str.length() * 3;
            int A02 = A0(length);
            int i3 = A02 + length;
            int i4 = this.f4276d;
            if (i3 > i4) {
                byte[] bArr = new byte[length];
                int w3 = k0.f4279a.w(str, bArr, 0, length);
                U0(w3);
                G0(bArr, 0, w3);
                return;
            }
            if (i3 > i4 - this.f4277e) {
                D0();
            }
            int A03 = A0(str.length());
            int i5 = this.f4277e;
            byte[] bArr2 = this.f4275c;
            try {
                try {
                    if (A03 == A02) {
                        int i6 = i5 + A03;
                        this.f4277e = i6;
                        int w4 = k0.f4279a.w(str, bArr2, i6, i4 - i6);
                        this.f4277e = i5;
                        g0((w4 - i5) - A03);
                        this.f4277e = w4;
                    } else {
                        int a3 = k0.a(str);
                        g0(a3);
                        this.f4277e = k0.f4279a.w(str, bArr2, this.f4277e, a3);
                    }
                } catch (j0 e2) {
                    this.f4277e = i5;
                    throw e2;
                }
            } catch (ArrayIndexOutOfBoundsException e3) {
                throw new A2.b(e3);
            }
        } catch (j0 e4) {
            f4272g.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
            byte[] bytes = str.getBytes(AbstractC0199w.f4313a);
            try {
                U0(bytes.length);
                c0(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e5) {
                throw new A2.b(e5);
            }
        }
    }

    public final void S0(int i3, int i4) {
        U0((i3 << 3) | i4);
    }

    public final void T0(int i3, int i4) {
        E0(20);
        f0(i3, 0);
        g0(i4);
    }

    public final void U0(int i3) {
        E0(5);
        g0(i3);
    }

    public final void V0(long j3, int i3) {
        E0(20);
        f0(i3, 0);
        h0(j3);
    }

    public final void W0(long j3) {
        E0(10);
        h0(j3);
    }

    @Override // android.support.v4.media.session.a
    public final void c0(byte[] bArr, int i3, int i4) {
        G0(bArr, i3, i4);
    }

    public final void d0(int i3) {
        int i4 = this.f4277e;
        int i5 = i4 + 1;
        this.f4277e = i5;
        byte[] bArr = this.f4275c;
        bArr[i4] = (byte) (i3 & 255);
        int i6 = i4 + 2;
        this.f4277e = i6;
        bArr[i5] = (byte) ((i3 >> 8) & 255);
        int i7 = i4 + 3;
        this.f4277e = i7;
        bArr[i6] = (byte) ((i3 >> 16) & 255);
        this.f4277e = i4 + 4;
        bArr[i7] = (byte) ((i3 >> 24) & 255);
    }

    public final void e0(long j3) {
        int i3 = this.f4277e;
        int i4 = i3 + 1;
        this.f4277e = i4;
        byte[] bArr = this.f4275c;
        bArr[i3] = (byte) (j3 & 255);
        int i5 = i3 + 2;
        this.f4277e = i5;
        bArr[i4] = (byte) ((j3 >> 8) & 255);
        int i6 = i3 + 3;
        this.f4277e = i6;
        bArr[i5] = (byte) ((j3 >> 16) & 255);
        int i7 = i3 + 4;
        this.f4277e = i7;
        bArr[i6] = (byte) (255 & (j3 >> 24));
        int i8 = i3 + 5;
        this.f4277e = i8;
        bArr[i7] = (byte) (((int) (j3 >> 32)) & 255);
        int i9 = i3 + 6;
        this.f4277e = i9;
        bArr[i8] = (byte) (((int) (j3 >> 40)) & 255);
        int i10 = i3 + 7;
        this.f4277e = i10;
        bArr[i9] = (byte) (((int) (j3 >> 48)) & 255);
        this.f4277e = i3 + 8;
        bArr[i10] = (byte) (((int) (j3 >> 56)) & 255);
    }

    public final void f0(int i3, int i4) {
        g0((i3 << 3) | i4);
    }

    public final void g0(int i3) {
        boolean z3 = f4273h;
        byte[] bArr = this.f4275c;
        if (z3) {
            while ((i3 & (-128)) != 0) {
                int i4 = this.f4277e;
                this.f4277e = i4 + 1;
                h0.j(bArr, i4, (byte) ((i3 | 128) & 255));
                i3 >>>= 7;
            }
            int i5 = this.f4277e;
            this.f4277e = i5 + 1;
            h0.j(bArr, i5, (byte) i3);
            return;
        }
        while ((i3 & (-128)) != 0) {
            int i6 = this.f4277e;
            this.f4277e = i6 + 1;
            bArr[i6] = (byte) ((i3 | 128) & 255);
            i3 >>>= 7;
        }
        int i7 = this.f4277e;
        this.f4277e = i7 + 1;
        bArr[i7] = (byte) i3;
    }

    public final void h0(long j3) {
        boolean z3 = f4273h;
        byte[] bArr = this.f4275c;
        if (z3) {
            while ((j3 & (-128)) != 0) {
                int i3 = this.f4277e;
                this.f4277e = i3 + 1;
                h0.j(bArr, i3, (byte) ((((int) j3) | 128) & 255));
                j3 >>>= 7;
            }
            int i4 = this.f4277e;
            this.f4277e = i4 + 1;
            h0.j(bArr, i4, (byte) j3);
            return;
        }
        while ((j3 & (-128)) != 0) {
            int i5 = this.f4277e;
            this.f4277e = i5 + 1;
            bArr[i5] = (byte) ((((int) j3) | 128) & 255);
            j3 >>>= 7;
        }
        int i6 = this.f4277e;
        this.f4277e = i6 + 1;
        bArr[i6] = (byte) j3;
    }
}
