package w0;

import R.InterfaceC0107j;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class l implements p {

    /* renamed from: n  reason: collision with root package name */
    public final InterfaceC0107j f9606n;

    /* renamed from: o  reason: collision with root package name */
    public final long f9607o;

    /* renamed from: p  reason: collision with root package name */
    public long f9608p;

    /* renamed from: r  reason: collision with root package name */
    public int f9610r;

    /* renamed from: s  reason: collision with root package name */
    public int f9611s;

    /* renamed from: q  reason: collision with root package name */
    public byte[] f9609q = new byte[65536];

    /* renamed from: m  reason: collision with root package name */
    public final byte[] f9605m = new byte[4096];

    static {
        R.A.a("media3.extractor");
    }

    public l(InterfaceC0107j interfaceC0107j, long j3, long j4) {
        this.f9606n = interfaceC0107j;
        this.f9608p = j3;
        this.f9607o = j4;
    }

    @Override // w0.p
    public final void A(int i3) {
        a(i3, false);
    }

    @Override // w0.p
    public final long D() {
        return this.f9608p;
    }

    public final boolean a(int i3, boolean z3) {
        b(i3);
        int i4 = this.f9611s - this.f9610r;
        while (i4 < i3) {
            i4 = h(this.f9609q, this.f9610r, i3, i4, z3);
            if (i4 == -1) {
                return false;
            }
            this.f9611s = this.f9610r + i4;
        }
        this.f9610r += i3;
        return true;
    }

    public final void b(int i3) {
        int i4 = this.f9610r + i3;
        byte[] bArr = this.f9609q;
        if (i4 > bArr.length) {
            this.f9609q = Arrays.copyOf(this.f9609q, U.A.j(bArr.length * 2, 65536 + i4, i4 + 524288));
        }
    }

    @Override // w0.p
    public final void c() {
        this.f9610r = 0;
    }

    @Override // w0.p
    public final void d(int i3) {
        int min = Math.min(this.f9611s, i3);
        n(min);
        int i4 = min;
        while (i4 < i3 && i4 != -1) {
            byte[] bArr = this.f9605m;
            i4 = h(bArr, -i4, Math.min(i3, bArr.length + i4), i4, false);
        }
        if (i4 != -1) {
            this.f9608p += i4;
        }
    }

    public final int e(byte[] bArr, int i3, int i4) {
        int min;
        b(i4);
        int i5 = this.f9611s;
        int i6 = this.f9610r;
        int i7 = i5 - i6;
        if (i7 == 0) {
            min = h(this.f9609q, i6, i4, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f9611s += min;
        } else {
            min = Math.min(i4, i7);
        }
        System.arraycopy(this.f9609q, this.f9610r, bArr, i3, min);
        this.f9610r += min;
        return min;
    }

    public final int h(byte[] bArr, int i3, int i4, int i5, boolean z3) {
        if (!Thread.interrupted()) {
            int read = this.f9606n.read(bArr, i3 + i5, i4 - i5);
            if (read == -1) {
                if (i5 == 0 && z3) {
                    return -1;
                }
                throw new EOFException();
            }
            return i5 + read;
        }
        throw new InterruptedIOException();
    }

    @Override // w0.p
    public final boolean i(byte[] bArr, int i3, int i4, boolean z3) {
        int min;
        int i5 = this.f9611s;
        if (i5 == 0) {
            min = 0;
        } else {
            min = Math.min(i5, i4);
            System.arraycopy(this.f9609q, 0, bArr, i3, min);
            n(min);
        }
        int i6 = min;
        while (i6 < i4 && i6 != -1) {
            i6 = h(bArr, i3, i4, i6, z3);
        }
        if (i6 != -1) {
            this.f9608p += i6;
        }
        if (i6 == -1) {
            return false;
        }
        return true;
    }

    public final int k(int i3) {
        int min = Math.min(this.f9611s, i3);
        n(min);
        if (min == 0) {
            byte[] bArr = this.f9605m;
            min = h(bArr, 0, Math.min(i3, bArr.length), 0, true);
        }
        if (min != -1) {
            this.f9608p += min;
        }
        return min;
    }

    @Override // w0.p
    public final long m() {
        return this.f9607o;
    }

    public final void n(int i3) {
        byte[] bArr;
        int i4 = this.f9611s - i3;
        this.f9611s = i4;
        this.f9610r = 0;
        byte[] bArr2 = this.f9609q;
        if (i4 < bArr2.length - 524288) {
            bArr = new byte[65536 + i4];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i3, bArr, 0, i4);
        this.f9609q = bArr;
    }

    @Override // w0.p
    public final boolean p(byte[] bArr, int i3, int i4, boolean z3) {
        if (!a(i4, z3)) {
            return false;
        }
        System.arraycopy(this.f9609q, this.f9610r - i4, bArr, i3, i4);
        return true;
    }

    @Override // R.InterfaceC0107j
    public final int read(byte[] bArr, int i3, int i4) {
        int i5 = this.f9611s;
        int i6 = 0;
        if (i5 != 0) {
            int min = Math.min(i5, i4);
            System.arraycopy(this.f9609q, 0, bArr, i3, min);
            n(min);
            i6 = min;
        }
        if (i6 == 0) {
            i6 = h(bArr, i3, i4, 0, true);
        }
        if (i6 != -1) {
            this.f9608p += i6;
        }
        return i6;
    }

    @Override // w0.p
    public final void readFully(byte[] bArr, int i3, int i4) {
        i(bArr, i3, i4, false);
    }

    @Override // w0.p
    public final long u() {
        return this.f9608p + this.f9610r;
    }

    @Override // w0.p
    public final void z(byte[] bArr, int i3, int i4) {
        p(bArr, i3, i4, false);
    }
}
