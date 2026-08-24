package T2;

import a.AbstractC0155a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import t2.AbstractC0826c;
/* loaded from: classes.dex */
public final class a implements t, ReadableByteChannel, Closeable, Flushable, WritableByteChannel, Cloneable, ByteChannel {

    /* renamed from: m  reason: collision with root package name */
    public q f2352m;

    /* renamed from: n  reason: collision with root package name */
    public long f2353n;

    public final byte a(long j3) {
        AbstractC0155a.n(this.f2353n, j3, 1L);
        q qVar = this.f2352m;
        if (qVar != null) {
            long j4 = this.f2353n;
            if (j4 - j3 < j3) {
                while (j4 > j3) {
                    qVar = qVar.f2395g;
                    D2.i.b(qVar);
                    j4 -= qVar.f2391c - qVar.f2390b;
                }
                return qVar.f2389a[(int) ((qVar.f2390b + j3) - j4)];
            }
            long j5 = 0;
            while (true) {
                int i3 = qVar.f2391c;
                int i4 = qVar.f2390b;
                long j6 = (i3 - i4) + j5;
                if (j6 <= j3) {
                    qVar = qVar.f2394f;
                    D2.i.b(qVar);
                    j5 = j6;
                } else {
                    return qVar.f2389a[(int) ((i4 + j3) - j5)];
                }
            }
        } else {
            D2.i.b(null);
            throw null;
        }
    }

    public final long b(b bVar) {
        int i3;
        int i4;
        D2.i.e(bVar, "targetBytes");
        q qVar = this.f2352m;
        if (qVar == null) {
            return -1L;
        }
        long j3 = this.f2353n;
        byte[] bArr = bVar.f2355m;
        long j4 = 0;
        if (j3 < 0) {
            while (j3 > 0) {
                qVar = qVar.f2395g;
                D2.i.b(qVar);
                j3 -= qVar.f2391c - qVar.f2390b;
            }
            if (bArr.length == 2) {
                byte b3 = bArr[0];
                byte b4 = bArr[1];
                while (j3 < this.f2353n) {
                    i3 = (int) ((qVar.f2390b + j4) - j3);
                    int i5 = qVar.f2391c;
                    while (i3 < i5) {
                        byte b5 = qVar.f2389a[i3];
                        if (b5 != b3 && b5 != b4) {
                            i3++;
                        }
                        i4 = qVar.f2390b;
                    }
                    j4 = j3 + (qVar.f2391c - qVar.f2390b);
                    qVar = qVar.f2394f;
                    D2.i.b(qVar);
                    j3 = j4;
                }
                return -1L;
            }
            while (j3 < this.f2353n) {
                i3 = (int) ((qVar.f2390b + j4) - j3);
                int i6 = qVar.f2391c;
                while (i3 < i6) {
                    byte b6 = qVar.f2389a[i3];
                    for (byte b7 : bArr) {
                        if (b6 == b7) {
                            i4 = qVar.f2390b;
                        }
                    }
                    i3++;
                }
                j4 = j3 + (qVar.f2391c - qVar.f2390b);
                qVar = qVar.f2394f;
                D2.i.b(qVar);
                j3 = j4;
            }
            return -1L;
        }
        j3 = 0;
        while (true) {
            long j5 = (qVar.f2391c - qVar.f2390b) + j3;
            if (j5 > 0) {
                break;
            }
            qVar = qVar.f2394f;
            D2.i.b(qVar);
            j3 = j5;
        }
        if (bArr.length == 2) {
            byte b8 = bArr[0];
            byte b9 = bArr[1];
            while (j3 < this.f2353n) {
                i3 = (int) ((qVar.f2390b + j4) - j3);
                int i7 = qVar.f2391c;
                while (i3 < i7) {
                    byte b10 = qVar.f2389a[i3];
                    if (b10 != b8 && b10 != b9) {
                        i3++;
                    }
                    i4 = qVar.f2390b;
                }
                j4 = j3 + (qVar.f2391c - qVar.f2390b);
                qVar = qVar.f2394f;
                D2.i.b(qVar);
                j3 = j4;
            }
            return -1L;
        }
        while (j3 < this.f2353n) {
            i3 = (int) ((qVar.f2390b + j4) - j3);
            int i8 = qVar.f2391c;
            while (i3 < i8) {
                byte b11 = qVar.f2389a[i3];
                for (byte b12 : bArr) {
                    if (b11 == b12) {
                        i4 = qVar.f2390b;
                    }
                }
                i3++;
            }
            j4 = j3 + (qVar.f2391c - qVar.f2390b);
            qVar = qVar.f2394f;
            D2.i.b(qVar);
            j3 = j4;
        }
        return -1L;
        return (i3 - i4) + j3;
    }

    public final boolean c(b bVar) {
        D2.i.e(bVar, "bytes");
        byte[] bArr = bVar.f2355m;
        int length = bArr.length;
        if (length < 0 || this.f2353n < length || bArr.length < length) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            if (a(i3) != bArr[i3]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T2.a, java.lang.Object] */
    public final Object clone() {
        ?? obj = new Object();
        if (this.f2353n != 0) {
            q qVar = this.f2352m;
            D2.i.b(qVar);
            q c3 = qVar.c();
            obj.f2352m = c3;
            c3.f2395g = c3;
            c3.f2394f = c3;
            for (q qVar2 = qVar.f2394f; qVar2 != qVar; qVar2 = qVar2.f2394f) {
                q qVar3 = c3.f2395g;
                D2.i.b(qVar3);
                D2.i.b(qVar2);
                qVar3.b(qVar2.c());
            }
            obj.f2353n = this.f2353n;
        }
        return obj;
    }

    public final byte d() {
        if (this.f2353n != 0) {
            q qVar = this.f2352m;
            D2.i.b(qVar);
            int i3 = qVar.f2390b;
            int i4 = qVar.f2391c;
            int i5 = i3 + 1;
            byte b3 = qVar.f2389a[i3];
            this.f2353n--;
            if (i5 == i4) {
                this.f2352m = qVar.a();
                r.a(qVar);
            } else {
                qVar.f2390b = i5;
            }
            return b3;
        }
        throw new EOFException();
    }

    @Override // T2.t
    public final long e(a aVar, long j3) {
        D2.i.e(aVar, "sink");
        if (j3 >= 0) {
            long j4 = this.f2353n;
            if (j4 == 0) {
                return -1L;
            }
            if (j3 > j4) {
                j3 = j4;
            }
            aVar.l(this, j3);
            return j3;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                long j3 = this.f2353n;
                a aVar = (a) obj;
                if (j3 == aVar.f2353n) {
                    if (j3 != 0) {
                        q qVar = this.f2352m;
                        D2.i.b(qVar);
                        q qVar2 = aVar.f2352m;
                        D2.i.b(qVar2);
                        int i3 = qVar.f2390b;
                        int i4 = qVar2.f2390b;
                        long j4 = 0;
                        while (j4 < this.f2353n) {
                            long min = Math.min(qVar.f2391c - i3, qVar2.f2391c - i4);
                            long j5 = 0;
                            while (j5 < min) {
                                int i5 = i3 + 1;
                                byte b3 = qVar.f2389a[i3];
                                int i6 = i4 + 1;
                                if (b3 == qVar2.f2389a[i4]) {
                                    j5++;
                                    i4 = i6;
                                    i3 = i5;
                                }
                            }
                            if (i3 == qVar.f2391c) {
                                q qVar3 = qVar.f2394f;
                                D2.i.b(qVar3);
                                i3 = qVar3.f2390b;
                                qVar = qVar3;
                            }
                            if (i4 == qVar2.f2391c) {
                                qVar2 = qVar2.f2394f;
                                D2.i.b(qVar2);
                                i4 = qVar2.f2390b;
                            }
                            j4 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final byte[] f(long j3) {
        if (j3 >= 0 && j3 <= 2147483647L) {
            if (this.f2353n >= j3) {
                int i3 = (int) j3;
                byte[] bArr = new byte[i3];
                int i4 = 0;
                while (i4 < i3) {
                    int read = read(bArr, i4, i3 - i4);
                    if (read != -1) {
                        i4 += read;
                    } else {
                        throw new EOFException();
                    }
                }
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j3).toString());
    }

    public final b g(long j3) {
        if (j3 >= 0 && j3 <= 2147483647L) {
            if (this.f2353n >= j3) {
                if (j3 >= 4096) {
                    b j4 = j((int) j3);
                    i(j3);
                    return j4;
                }
                return new b(f(j3));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j3).toString());
    }

    public final int h() {
        if (this.f2353n >= 4) {
            q qVar = this.f2352m;
            D2.i.b(qVar);
            int i3 = qVar.f2390b;
            int i4 = qVar.f2391c;
            if (i4 - i3 < 4) {
                return ((d() & 255) << 24) | ((d() & 255) << 16) | ((d() & 255) << 8) | (d() & 255);
            }
            byte[] bArr = qVar.f2389a;
            int i5 = ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3] & 255) << 24);
            int i6 = i3 + 3;
            int i7 = i3 + 4;
            int i8 = i5 | ((bArr[i3 + 2] & 255) << 8) | (bArr[i6] & 255);
            this.f2353n -= 4;
            if (i7 == i4) {
                this.f2352m = qVar.a();
                r.a(qVar);
            } else {
                qVar.f2390b = i7;
            }
            return i8;
        }
        throw new EOFException();
    }

    public final int hashCode() {
        q qVar = this.f2352m;
        if (qVar == null) {
            return 0;
        }
        int i3 = 1;
        do {
            int i4 = qVar.f2391c;
            for (int i5 = qVar.f2390b; i5 < i4; i5++) {
                i3 = (i3 * 31) + qVar.f2389a[i5];
            }
            qVar = qVar.f2394f;
            D2.i.b(qVar);
        } while (qVar != this.f2352m);
        return i3;
    }

    public final void i(long j3) {
        while (j3 > 0) {
            q qVar = this.f2352m;
            if (qVar != null) {
                int min = (int) Math.min(j3, qVar.f2391c - qVar.f2390b);
                long j4 = min;
                this.f2353n -= j4;
                j3 -= j4;
                int i3 = qVar.f2390b + min;
                qVar.f2390b = i3;
                if (i3 == qVar.f2391c) {
                    this.f2352m = qVar.a();
                    r.a(qVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final b j(int i3) {
        if (i3 == 0) {
            return b.f2354p;
        }
        AbstractC0155a.n(this.f2353n, 0L, i3);
        q qVar = this.f2352m;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            D2.i.b(qVar);
            int i7 = qVar.f2391c;
            int i8 = qVar.f2390b;
            if (i7 != i8) {
                i5 += i7 - i8;
                i6++;
                qVar = qVar.f2394f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i6];
        int[] iArr = new int[i6 * 2];
        q qVar2 = this.f2352m;
        int i9 = 0;
        while (i4 < i3) {
            D2.i.b(qVar2);
            bArr[i9] = qVar2.f2389a;
            i4 += qVar2.f2391c - qVar2.f2390b;
            iArr[i9] = Math.min(i4, i3);
            iArr[i9 + i6] = qVar2.f2390b;
            qVar2.f2392d = true;
            i9++;
            qVar2 = qVar2.f2394f;
        }
        return new s(bArr, iArr);
    }

    public final q k(int i3) {
        if (i3 >= 1 && i3 <= 8192) {
            q qVar = this.f2352m;
            if (qVar == null) {
                q b3 = r.b();
                this.f2352m = b3;
                b3.f2395g = b3;
                b3.f2394f = b3;
                return b3;
            }
            q qVar2 = qVar.f2395g;
            D2.i.b(qVar2);
            if (qVar2.f2391c + i3 <= 8192 && qVar2.f2393e) {
                return qVar2;
            }
            q b4 = r.b();
            qVar2.b(b4);
            return b4;
        }
        throw new IllegalArgumentException("unexpected capacity");
    }

    public final void l(a aVar, long j3) {
        q qVar;
        q qVar2;
        q b3;
        int i3;
        D2.i.e(aVar, "source");
        if (aVar != this) {
            AbstractC0155a.n(aVar.f2353n, 0L, j3);
            while (j3 > 0) {
                q qVar3 = aVar.f2352m;
                D2.i.b(qVar3);
                int i4 = qVar3.f2391c;
                D2.i.b(aVar.f2352m);
                int i5 = 0;
                if (j3 < i4 - qVar.f2390b) {
                    q qVar4 = this.f2352m;
                    if (qVar4 != null) {
                        qVar2 = qVar4.f2395g;
                    } else {
                        qVar2 = null;
                    }
                    if (qVar2 != null && qVar2.f2393e) {
                        long j4 = qVar2.f2391c + j3;
                        if (qVar2.f2392d) {
                            i3 = 0;
                        } else {
                            i3 = qVar2.f2390b;
                        }
                        if (j4 - i3 <= 8192) {
                            q qVar5 = aVar.f2352m;
                            D2.i.b(qVar5);
                            qVar5.d(qVar2, (int) j3);
                            aVar.f2353n -= j3;
                            this.f2353n += j3;
                            return;
                        }
                    }
                    q qVar6 = aVar.f2352m;
                    D2.i.b(qVar6);
                    int i6 = (int) j3;
                    if (i6 > 0 && i6 <= qVar6.f2391c - qVar6.f2390b) {
                        if (i6 >= 1024) {
                            b3 = qVar6.c();
                        } else {
                            b3 = r.b();
                            int i7 = qVar6.f2390b;
                            AbstractC0826c.z(0, i7, i7 + i6, qVar6.f2389a, b3.f2389a);
                        }
                        b3.f2391c = b3.f2390b + i6;
                        qVar6.f2390b += i6;
                        q qVar7 = qVar6.f2395g;
                        D2.i.b(qVar7);
                        qVar7.b(b3);
                        aVar.f2352m = b3;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range");
                    }
                }
                q qVar8 = aVar.f2352m;
                D2.i.b(qVar8);
                long j5 = qVar8.f2391c - qVar8.f2390b;
                aVar.f2352m = qVar8.a();
                q qVar9 = this.f2352m;
                if (qVar9 == null) {
                    this.f2352m = qVar8;
                    qVar8.f2395g = qVar8;
                    qVar8.f2394f = qVar8;
                } else {
                    q qVar10 = qVar9.f2395g;
                    D2.i.b(qVar10);
                    qVar10.b(qVar8);
                    q qVar11 = qVar8.f2395g;
                    if (qVar11 != qVar8) {
                        D2.i.b(qVar11);
                        if (qVar11.f2393e) {
                            int i8 = qVar8.f2391c - qVar8.f2390b;
                            q qVar12 = qVar8.f2395g;
                            D2.i.b(qVar12);
                            int i9 = 8192 - qVar12.f2391c;
                            q qVar13 = qVar8.f2395g;
                            D2.i.b(qVar13);
                            if (!qVar13.f2392d) {
                                q qVar14 = qVar8.f2395g;
                                D2.i.b(qVar14);
                                i5 = qVar14.f2390b;
                            }
                            if (i8 <= i9 + i5) {
                                q qVar15 = qVar8.f2395g;
                                D2.i.b(qVar15);
                                qVar8.d(qVar15, i8);
                                qVar8.a();
                                r.a(qVar8);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact");
                    }
                }
                aVar.f2353n -= j5;
                this.f2353n += j5;
                j3 -= j5;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public final void m(b bVar) {
        D2.i.e(bVar, "byteString");
        bVar.o(this, bVar.b());
    }

    public final void n(byte[] bArr, int i3, int i4) {
        D2.i.e(bArr, "source");
        long j3 = i4;
        AbstractC0155a.n(bArr.length, i3, j3);
        int i5 = i4 + i3;
        while (i3 < i5) {
            q k3 = k(1);
            int min = Math.min(i5 - i3, 8192 - k3.f2391c);
            int i6 = i3 + min;
            AbstractC0826c.z(k3.f2391c, i3, i6, bArr, k3.f2389a);
            k3.f2391c += min;
            i3 = i6;
        }
        this.f2353n += j3;
    }

    public final void o(int i3) {
        q k3 = k(1);
        int i4 = k3.f2391c;
        k3.f2391c = i4 + 1;
        k3.f2389a[i4] = (byte) i3;
        this.f2353n++;
    }

    public final void p(String str) {
        char charAt;
        char c3;
        D2.i.e(str, "string");
        int length = str.length();
        if (length >= 0) {
            if (length <= str.length()) {
                int i3 = 0;
                while (i3 < length) {
                    char charAt2 = str.charAt(i3);
                    if (charAt2 < 128) {
                        q k3 = k(1);
                        int i4 = k3.f2391c - i3;
                        int min = Math.min(length, 8192 - i4);
                        int i5 = i3 + 1;
                        byte[] bArr = k3.f2389a;
                        bArr[i3 + i4] = (byte) charAt2;
                        while (true) {
                            i3 = i5;
                            if (i3 >= min || (charAt = str.charAt(i3)) >= 128) {
                                break;
                            }
                            i5 = i3 + 1;
                            bArr[i3 + i4] = (byte) charAt;
                        }
                        int i6 = k3.f2391c;
                        int i7 = (i4 + i3) - i6;
                        k3.f2391c = i6 + i7;
                        this.f2353n += i7;
                    } else {
                        if (charAt2 < 2048) {
                            q k4 = k(2);
                            int i8 = k4.f2391c;
                            byte[] bArr2 = k4.f2389a;
                            bArr2[i8] = (byte) ((charAt2 >> 6) | 192);
                            bArr2[i8 + 1] = (byte) ((charAt2 & '?') | 128);
                            k4.f2391c = i8 + 2;
                            this.f2353n += 2;
                        } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                            int i9 = i3 + 1;
                            if (i9 < length) {
                                c3 = str.charAt(i9);
                            } else {
                                c3 = 0;
                            }
                            if (charAt2 <= 56319 && 56320 <= c3 && c3 < 57344) {
                                int i10 = (((charAt2 & 1023) << 10) | (c3 & 1023)) + 65536;
                                q k5 = k(4);
                                int i11 = k5.f2391c;
                                byte[] bArr3 = k5.f2389a;
                                bArr3[i11] = (byte) ((i10 >> 18) | 240);
                                bArr3[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                                bArr3[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                                bArr3[i11 + 3] = (byte) ((i10 & 63) | 128);
                                k5.f2391c = i11 + 4;
                                this.f2353n += 4;
                                i3 += 2;
                            } else {
                                o(63);
                                i3 = i9;
                            }
                        } else {
                            q k6 = k(3);
                            int i12 = k6.f2391c;
                            byte[] bArr4 = k6.f2389a;
                            bArr4[i12] = (byte) ((charAt2 >> '\f') | 224);
                            bArr4[i12 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                            bArr4[i12 + 2] = (byte) ((charAt2 & '?') | 128);
                            k6.f2391c = i12 + 3;
                            this.f2353n += 3;
                        }
                        i3++;
                    }
                }
                return;
            }
            throw new IllegalArgumentException(("endIndex > string.length: " + length + " > " + str.length()).toString());
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + length + " < 0").toString());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        D2.i.e(byteBuffer, "sink");
        q qVar = this.f2352m;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), qVar.f2391c - qVar.f2390b);
        byteBuffer.put(qVar.f2389a, qVar.f2390b, min);
        int i3 = qVar.f2390b + min;
        qVar.f2390b = i3;
        this.f2353n -= min;
        if (i3 == qVar.f2391c) {
            this.f2352m = qVar.a();
            r.a(qVar);
        }
        return min;
    }

    public final String toString() {
        long j3 = this.f2353n;
        if (j3 <= 2147483647L) {
            return j((int) j3).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f2353n).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        D2.i.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i3 = remaining;
        while (i3 > 0) {
            q k3 = k(1);
            int min = Math.min(i3, 8192 - k3.f2391c);
            byteBuffer.get(k3.f2389a, k3.f2391c, min);
            i3 -= min;
            k3.f2391c += min;
        }
        this.f2353n += remaining;
        return remaining;
    }

    public final int read(byte[] bArr, int i3, int i4) {
        D2.i.e(bArr, "sink");
        AbstractC0155a.n(bArr.length, i3, i4);
        q qVar = this.f2352m;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(i4, qVar.f2391c - qVar.f2390b);
        int i5 = qVar.f2390b;
        AbstractC0826c.z(i3, i5, i5 + min, qVar.f2389a, bArr);
        int i6 = qVar.f2390b + min;
        qVar.f2390b = i6;
        this.f2353n -= min;
        if (i6 == qVar.f2391c) {
            this.f2352m = qVar.a();
            r.a(qVar);
        }
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
    }

    @Override // java.io.Flushable
    public final void flush() {
    }
}
