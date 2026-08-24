package T2;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class p implements t, ReadableByteChannel {

    /* renamed from: m  reason: collision with root package name */
    public final t f2386m;

    /* renamed from: n  reason: collision with root package name */
    public final a f2387n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2388o;

    /* JADX WARN: Type inference failed for: r2v1, types: [T2.a, java.lang.Object] */
    public p(t tVar) {
        D2.i.e(tVar, "source");
        this.f2386m = tVar;
        this.f2387n = new Object();
    }

    public final int a() {
        f(4L);
        int h3 = this.f2387n.h();
        return ((h3 & 255) << 24) | (((-16777216) & h3) >>> 24) | ((16711680 & h3) >>> 8) | ((65280 & h3) << 8);
    }

    public final long b() {
        long j3;
        f(8L);
        a aVar = this.f2387n;
        if (aVar.f2353n >= 8) {
            q qVar = aVar.f2352m;
            D2.i.b(qVar);
            int i3 = qVar.f2390b;
            int i4 = qVar.f2391c;
            if (i4 - i3 < 8) {
                j3 = ((aVar.h() & 4294967295L) << 32) | (4294967295L & aVar.h());
            } else {
                byte[] bArr = qVar.f2389a;
                long j4 = ((bArr[i3] & 255) << 56) | ((bArr[i3 + 1] & 255) << 48) | ((bArr[i3 + 2] & 255) << 40);
                int i5 = i3 + 7;
                int i6 = i3 + 8;
                long j5 = j4 | ((bArr[i3 + 3] & 255) << 32) | ((bArr[i3 + 4] & 255) << 24) | ((bArr[i3 + 5] & 255) << 16) | ((bArr[i3 + 6] & 255) << 8) | (bArr[i5] & 255);
                aVar.f2353n -= 8;
                if (i6 == i4) {
                    aVar.f2352m = qVar.a();
                    r.a(qVar);
                } else {
                    qVar.f2390b = i6;
                }
                j3 = j5;
            }
            return ((j3 & 255) << 56) | (((-72057594037927936L) & j3) >>> 56) | ((71776119061217280L & j3) >>> 40) | ((280375465082880L & j3) >>> 24) | ((1095216660480L & j3) >>> 8) | ((4278190080L & j3) << 8) | ((16711680 & j3) << 24) | ((65280 & j3) << 40);
        }
        throw new EOFException();
    }

    public final short c() {
        short s3;
        f(2L);
        a aVar = this.f2387n;
        if (aVar.f2353n >= 2) {
            q qVar = aVar.f2352m;
            D2.i.b(qVar);
            int i3 = qVar.f2390b;
            int i4 = qVar.f2391c;
            if (i4 - i3 < 2) {
                s3 = (short) ((aVar.d() & 255) | ((aVar.d() & 255) << 8));
            } else {
                int i5 = i3 + 1;
                byte[] bArr = qVar.f2389a;
                int i6 = i3 + 2;
                int i7 = (bArr[i5] & 255) | ((bArr[i3] & 255) << 8);
                aVar.f2353n -= 2;
                if (i6 == i4) {
                    aVar.f2352m = qVar.a();
                    r.a(qVar);
                } else {
                    qVar.f2390b = i6;
                }
                s3 = (short) i7;
            }
            return (short) (((s3 & 255) << 8) | ((65280 & s3) >>> 8));
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.f2388o) {
            this.f2388o = true;
            this.f2386m.close();
            a aVar = this.f2387n;
            aVar.i(aVar.f2353n);
        }
    }

    public final String d(long j3) {
        f(j3);
        a aVar = this.f2387n;
        aVar.getClass();
        Charset charset = J2.a.f495a;
        D2.i.e(charset, "charset");
        int i3 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i3 >= 0 && j3 <= 2147483647L) {
            if (aVar.f2353n >= j3) {
                if (i3 == 0) {
                    return "";
                }
                q qVar = aVar.f2352m;
                D2.i.b(qVar);
                int i4 = qVar.f2390b;
                if (i4 + j3 > qVar.f2391c) {
                    return new String(aVar.f(j3), charset);
                }
                int i5 = (int) j3;
                String str = new String(qVar.f2389a, i4, i5, charset);
                int i6 = qVar.f2390b + i5;
                qVar.f2390b = i6;
                aVar.f2353n -= j3;
                if (i6 == qVar.f2391c) {
                    aVar.f2352m = qVar.a();
                    r.a(qVar);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j3).toString());
    }

    @Override // T2.t
    public final long e(a aVar, long j3) {
        D2.i.e(aVar, "sink");
        if (j3 >= 0) {
            if (!this.f2388o) {
                a aVar2 = this.f2387n;
                if (aVar2.f2353n == 0 && this.f2386m.e(aVar2, 8192L) == -1) {
                    return -1L;
                }
                return aVar2.e(aVar, Math.min(j3, aVar2.f2353n));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
    }

    public final void f(long j3) {
        a aVar;
        if (j3 >= 0) {
            if (!this.f2388o) {
                do {
                    aVar = this.f2387n;
                    if (aVar.f2353n >= j3) {
                        return;
                    }
                } while (this.f2386m.e(aVar, 8192L) != -1);
                throw new EOFException();
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
    }

    public final void g(long j3) {
        if (!this.f2388o) {
            while (j3 > 0) {
                a aVar = this.f2387n;
                if (aVar.f2353n == 0 && this.f2386m.e(aVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j3, aVar.f2353n);
                aVar.i(min);
                j3 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f2388o;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        D2.i.e(byteBuffer, "sink");
        a aVar = this.f2387n;
        if (aVar.f2353n == 0 && this.f2386m.e(aVar, 8192L) == -1) {
            return -1;
        }
        return aVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f2386m + ')';
    }
}
