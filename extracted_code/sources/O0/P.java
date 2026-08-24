package o0;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class P {

    /* renamed from: a  reason: collision with root package name */
    public final s0.e f8509a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8510b;

    /* renamed from: c  reason: collision with root package name */
    public final U.t f8511c;

    /* renamed from: d  reason: collision with root package name */
    public Q0.e f8512d;

    /* renamed from: e  reason: collision with root package name */
    public Q0.e f8513e;

    /* renamed from: f  reason: collision with root package name */
    public Q0.e f8514f;

    /* renamed from: g  reason: collision with root package name */
    public long f8515g;

    public P(s0.e eVar) {
        this.f8509a = eVar;
        int i3 = eVar.f9158b;
        this.f8510b = i3;
        this.f8511c = new U.t(32);
        Q0.e eVar2 = new Q0.e(0L, i3);
        this.f8512d = eVar2;
        this.f8513e = eVar2;
        this.f8514f = eVar2;
    }

    public static Q0.e d(Q0.e eVar, long j3, ByteBuffer byteBuffer, int i3) {
        while (j3 >= eVar.f1540n) {
            eVar = (Q0.e) eVar.f1542p;
        }
        while (i3 > 0) {
            int min = Math.min(i3, (int) (eVar.f1540n - j3));
            s0.a aVar = (s0.a) eVar.f1541o;
            byteBuffer.put(aVar.f9148a, ((int) (j3 - eVar.f1539m)) + aVar.f9149b, min);
            i3 -= min;
            j3 += min;
            if (j3 == eVar.f1540n) {
                eVar = (Q0.e) eVar.f1542p;
            }
        }
        return eVar;
    }

    public static Q0.e e(Q0.e eVar, long j3, byte[] bArr, int i3) {
        while (j3 >= eVar.f1540n) {
            eVar = (Q0.e) eVar.f1542p;
        }
        int i4 = i3;
        while (i4 > 0) {
            int min = Math.min(i4, (int) (eVar.f1540n - j3));
            s0.a aVar = (s0.a) eVar.f1541o;
            System.arraycopy(aVar.f9148a, ((int) (j3 - eVar.f1539m)) + aVar.f9149b, bArr, i3 - i4, min);
            i4 -= min;
            j3 += min;
            if (j3 == eVar.f1540n) {
                eVar = (Q0.e) eVar.f1542p;
            }
        }
        return eVar;
    }

    public static Q0.e f(Q0.e eVar, X.f fVar, g0.h hVar, U.t tVar) {
        boolean z3;
        int i3;
        if (fVar.c(1073741824)) {
            long j3 = hVar.f5723b;
            tVar.D(1);
            Q0.e e2 = e(eVar, j3, tVar.f2477a, 1);
            long j4 = j3 + 1;
            byte b3 = tVar.f2477a[0];
            if ((b3 & 128) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i4 = b3 & Byte.MAX_VALUE;
            X.b bVar = fVar.f2933p;
            byte[] bArr = bVar.f2922a;
            if (bArr == null) {
                bVar.f2922a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            eVar = e(e2, j4, bVar.f2922a, i4);
            long j5 = j4 + i4;
            if (z3) {
                tVar.D(2);
                eVar = e(eVar, j5, tVar.f2477a, 2);
                j5 += 2;
                i3 = tVar.A();
            } else {
                i3 = 1;
            }
            int[] iArr = bVar.f2925d;
            if (iArr == null || iArr.length < i3) {
                iArr = new int[i3];
            }
            int[] iArr2 = bVar.f2926e;
            if (iArr2 == null || iArr2.length < i3) {
                iArr2 = new int[i3];
            }
            if (z3) {
                int i5 = i3 * 6;
                tVar.D(i5);
                eVar = e(eVar, j5, tVar.f2477a, i5);
                j5 += i5;
                tVar.G(0);
                for (int i6 = 0; i6 < i3; i6++) {
                    iArr[i6] = tVar.A();
                    iArr2[i6] = tVar.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = hVar.f5722a - ((int) (j5 - hVar.f5723b));
            }
            w0.F f3 = (w0.F) hVar.f5724c;
            int i7 = U.A.f2405a;
            byte[] bArr2 = f3.f9519b;
            byte[] bArr3 = bVar.f2922a;
            bVar.f2927f = i3;
            bVar.f2925d = iArr;
            bVar.f2926e = iArr2;
            bVar.f2923b = bArr2;
            bVar.f2922a = bArr3;
            int i8 = f3.f9518a;
            bVar.f2924c = i8;
            int i9 = f3.f9520c;
            bVar.f2928g = i9;
            int i10 = f3.f9521d;
            bVar.f2929h = i10;
            MediaCodec.CryptoInfo cryptoInfo = bVar.f2930i;
            cryptoInfo.numSubSamples = i3;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i8;
            if (U.A.f2405a >= 24) {
                B1.a aVar = bVar.f2931j;
                aVar.getClass();
                ((MediaCodec.CryptoInfo.Pattern) aVar.f51o).set(i9, i10);
                ((MediaCodec.CryptoInfo) aVar.f50n).setPattern((MediaCodec.CryptoInfo.Pattern) aVar.f51o);
            }
            long j6 = hVar.f5723b;
            int i11 = (int) (j5 - j6);
            hVar.f5723b = j6 + i11;
            hVar.f5722a -= i11;
        }
        if (fVar.c(268435456)) {
            tVar.D(4);
            Q0.e e3 = e(eVar, hVar.f5723b, tVar.f2477a, 4);
            int y3 = tVar.y();
            hVar.f5723b += 4;
            hVar.f5722a -= 4;
            fVar.h(y3);
            Q0.e d3 = d(e3, hVar.f5723b, fVar.f2934q, y3);
            hVar.f5723b += y3;
            int i12 = hVar.f5722a - y3;
            hVar.f5722a = i12;
            ByteBuffer byteBuffer = fVar.f2937t;
            if (byteBuffer != null && byteBuffer.capacity() >= i12) {
                fVar.f2937t.clear();
            } else {
                fVar.f2937t = ByteBuffer.allocate(i12);
            }
            return d(d3, hVar.f5723b, fVar.f2937t, hVar.f5722a);
        }
        fVar.h(hVar.f5722a);
        return d(eVar, hVar.f5723b, fVar.f2934q, hVar.f5722a);
    }

    public final void a(Q0.e eVar) {
        if (((s0.a) eVar.f1541o) == null) {
            return;
        }
        s0.e eVar2 = this.f8509a;
        synchronized (eVar2) {
            Q0.e eVar3 = eVar;
            while (eVar3 != null) {
                try {
                    s0.a[] aVarArr = eVar2.f9162f;
                    int i3 = eVar2.f9161e;
                    eVar2.f9161e = i3 + 1;
                    s0.a aVar = (s0.a) eVar3.f1541o;
                    aVar.getClass();
                    aVarArr[i3] = aVar;
                    eVar2.f9160d--;
                    eVar3 = (Q0.e) eVar3.f1542p;
                    if (eVar3 == null || ((s0.a) eVar3.f1541o) == null) {
                        eVar3 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            eVar2.notifyAll();
        }
        eVar.f1541o = null;
        eVar.f1542p = null;
    }

    public final void b(long j3) {
        Q0.e eVar;
        if (j3 == -1) {
            return;
        }
        while (true) {
            eVar = this.f8512d;
            if (j3 < eVar.f1540n) {
                break;
            }
            s0.e eVar2 = this.f8509a;
            s0.a aVar = (s0.a) eVar.f1541o;
            synchronized (eVar2) {
                s0.a[] aVarArr = eVar2.f9162f;
                int i3 = eVar2.f9161e;
                eVar2.f9161e = i3 + 1;
                aVarArr[i3] = aVar;
                eVar2.f9160d--;
                eVar2.notifyAll();
            }
            Q0.e eVar3 = this.f8512d;
            eVar3.f1541o = null;
            eVar3.f1542p = null;
            this.f8512d = (Q0.e) eVar3.f1542p;
        }
        if (this.f8513e.f1539m < eVar.f1539m) {
            this.f8513e = eVar;
        }
    }

    public final int c(int i3) {
        s0.a aVar;
        Q0.e eVar = this.f8514f;
        if (((s0.a) eVar.f1541o) == null) {
            s0.e eVar2 = this.f8509a;
            synchronized (eVar2) {
                try {
                    int i4 = eVar2.f9160d + 1;
                    eVar2.f9160d = i4;
                    int i5 = eVar2.f9161e;
                    if (i5 > 0) {
                        s0.a[] aVarArr = eVar2.f9162f;
                        int i6 = i5 - 1;
                        eVar2.f9161e = i6;
                        aVar = aVarArr[i6];
                        aVar.getClass();
                        eVar2.f9162f[eVar2.f9161e] = null;
                    } else {
                        s0.a aVar2 = new s0.a(new byte[eVar2.f9158b], 0);
                        s0.a[] aVarArr2 = eVar2.f9162f;
                        if (i4 > aVarArr2.length) {
                            eVar2.f9162f = (s0.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Q0.e eVar3 = new Q0.e(this.f8514f.f1540n, this.f8510b);
            eVar.f1541o = aVar;
            eVar.f1542p = eVar3;
        }
        return Math.min(i3, (int) (this.f8514f.f1540n - this.f8515g));
    }
}
