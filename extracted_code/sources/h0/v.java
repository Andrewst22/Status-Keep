package h0;

import R.C0113p;
import U.AbstractC0123a;
import Y.AbstractC0135f;
import Y.C0136g;
import Y.C0137h;
import Y.C0142m;
import Y.H;
import a0.P;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o0.U;
/* loaded from: classes.dex */
public abstract class v extends AbstractC0135f {

    /* renamed from: P0  reason: collision with root package name */
    public static final byte[] f5871P0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A0  reason: collision with root package name */
    public int f5872A0;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f5873B0;

    /* renamed from: C0  reason: collision with root package name */
    public boolean f5874C0;

    /* renamed from: D  reason: collision with root package name */
    public final k f5875D;

    /* renamed from: D0  reason: collision with root package name */
    public boolean f5876D0;

    /* renamed from: E  reason: collision with root package name */
    public final w f5877E;

    /* renamed from: E0  reason: collision with root package name */
    public long f5878E0;

    /* renamed from: F  reason: collision with root package name */
    public final float f5879F;

    /* renamed from: F0  reason: collision with root package name */
    public long f5880F0;

    /* renamed from: G  reason: collision with root package name */
    public final X.f f5881G;

    /* renamed from: G0  reason: collision with root package name */
    public boolean f5882G0;

    /* renamed from: H  reason: collision with root package name */
    public final X.f f5883H;

    /* renamed from: H0  reason: collision with root package name */
    public boolean f5884H0;

    /* renamed from: I  reason: collision with root package name */
    public final X.f f5885I;

    /* renamed from: I0  reason: collision with root package name */
    public boolean f5886I0;

    /* renamed from: J  reason: collision with root package name */
    public final h f5887J;

    /* renamed from: J0  reason: collision with root package name */
    public boolean f5888J0;

    /* renamed from: K  reason: collision with root package name */
    public final MediaCodec.BufferInfo f5889K;

    /* renamed from: K0  reason: collision with root package name */
    public C0142m f5890K0;
    public final ArrayDeque L;

    /* renamed from: L0  reason: collision with root package name */
    public C0136g f5891L0;

    /* renamed from: M  reason: collision with root package name */
    public final P f5892M;

    /* renamed from: M0  reason: collision with root package name */
    public u f5893M0;

    /* renamed from: N  reason: collision with root package name */
    public C0113p f5894N;

    /* renamed from: N0  reason: collision with root package name */
    public long f5895N0;

    /* renamed from: O  reason: collision with root package name */
    public C0113p f5896O;

    /* renamed from: O0  reason: collision with root package name */
    public boolean f5897O0;

    /* renamed from: P  reason: collision with root package name */
    public C1.j f5898P;

    /* renamed from: Q  reason: collision with root package name */
    public C1.j f5899Q;

    /* renamed from: R  reason: collision with root package name */
    public H f5900R;

    /* renamed from: S  reason: collision with root package name */
    public MediaCrypto f5901S;

    /* renamed from: T  reason: collision with root package name */
    public final long f5902T;

    /* renamed from: U  reason: collision with root package name */
    public float f5903U;

    /* renamed from: V  reason: collision with root package name */
    public float f5904V;

    /* renamed from: W  reason: collision with root package name */
    public l f5905W;

    /* renamed from: X  reason: collision with root package name */
    public C0113p f5906X;

    /* renamed from: Y  reason: collision with root package name */
    public MediaFormat f5907Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f5908Z;

    /* renamed from: a0  reason: collision with root package name */
    public float f5909a0;

    /* renamed from: b0  reason: collision with root package name */
    public ArrayDeque f5910b0;

    /* renamed from: c0  reason: collision with root package name */
    public s f5911c0;

    /* renamed from: d0  reason: collision with root package name */
    public o f5912d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f5913e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f5914f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f5915g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f5916h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f5917i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f5918j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f5919k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f5920l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f5921m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f5922n0;

    /* renamed from: o0  reason: collision with root package name */
    public long f5923o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f5924p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f5925q0;

    /* renamed from: r0  reason: collision with root package name */
    public ByteBuffer f5926r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f5927s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f5928t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f5929u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f5930v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f5931w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f5932x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f5933y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.f, h0.h] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, a0.P] */
    /* JADX WARN: Type inference failed for: r4v9, types: [Y.g, java.lang.Object] */
    public v(int i3, k kVar, float f3) {
        super(i3);
        w wVar = w.f5934n;
        this.f5875D = kVar;
        this.f5877E = wVar;
        this.f5879F = f3;
        this.f5881G = new X.f(0);
        this.f5883H = new X.f(0);
        this.f5885I = new X.f(2);
        ?? fVar = new X.f(2);
        fVar.x = 32;
        this.f5887J = fVar;
        this.f5889K = new MediaCodec.BufferInfo();
        this.f5903U = 1.0f;
        this.f5904V = 1.0f;
        this.f5902T = -9223372036854775807L;
        this.L = new ArrayDeque();
        this.f5893M0 = u.f5866e;
        fVar.h(0);
        fVar.f2934q.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.f3713a = S.d.f2159a;
        obj.f3715c = 0;
        obj.f3714b = 2;
        this.f5892M = obj;
        this.f5909a0 = -1.0f;
        this.f5913e0 = 0;
        this.f5933y0 = 0;
        this.f5924p0 = -1;
        this.f5925q0 = -1;
        this.f5923o0 = -9223372036854775807L;
        this.f5878E0 = -9223372036854775807L;
        this.f5880F0 = -9223372036854775807L;
        this.f5895N0 = -9223372036854775807L;
        this.z0 = 0;
        this.f5872A0 = 0;
        this.f5891L0 = new Object();
    }

    @Override // Y.AbstractC0135f
    public final int A() {
        return 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0327, code lost:
        r26.f5930v0 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0323 A[LOOP:0: B:27:0x0096->B:125:0x0323, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0321 A[EDGE_INSN: B:143:0x0321->B:124:0x0321 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(long r27, long r29) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.v.B(long, long):boolean");
    }

    public abstract C0137h C(o oVar, C0113p c0113p, C0113p c0113p2);

    public n D(IllegalStateException illegalStateException, o oVar) {
        return new n(illegalStateException, oVar);
    }

    public final void E() {
        this.f5931w0 = false;
        this.f5887J.e();
        this.f5885I.e();
        this.f5930v0 = false;
        this.f5929u0 = false;
        P p3 = this.f5892M;
        p3.getClass();
        p3.f3713a = S.d.f2159a;
        p3.f3715c = 0;
        p3.f3714b = 2;
    }

    public final boolean F() {
        if (this.f5873B0) {
            this.z0 = 1;
            if (!this.f5915g0 && !this.f5917i0) {
                this.f5872A0 = 2;
            } else {
                this.f5872A0 = 3;
                return false;
            }
        } else {
            s0();
        }
        return true;
    }

    public final boolean G(long j3, long j4) {
        boolean z3;
        boolean z4;
        boolean z5;
        MediaCodec.BufferInfo bufferInfo;
        boolean g02;
        boolean z6;
        ByteBuffer byteBuffer;
        int i3;
        int i4;
        long j5;
        boolean z7;
        boolean z8;
        C0113p c0113p;
        int f3;
        boolean z9;
        boolean z10;
        l lVar = this.f5905W;
        lVar.getClass();
        if (this.f5925q0 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        MediaCodec.BufferInfo bufferInfo2 = this.f5889K;
        if (!z3) {
            if (this.f5918j0 && this.f5874C0) {
                try {
                    f3 = lVar.f(bufferInfo2);
                } catch (IllegalStateException unused) {
                    f0();
                    if (this.f5884H0) {
                        i0();
                    }
                    return false;
                }
            } else {
                f3 = lVar.f(bufferInfo2);
            }
            if (f3 < 0) {
                if (f3 == -2) {
                    this.f5876D0 = true;
                    l lVar2 = this.f5905W;
                    lVar2.getClass();
                    MediaFormat L = lVar2.L();
                    if (this.f5913e0 != 0 && L.getInteger("width") == 32 && L.getInteger("height") == 32) {
                        this.f5921m0 = true;
                    } else {
                        this.f5907Y = L;
                        this.f5908Z = true;
                    }
                    return true;
                }
                if (this.f5922n0 && (this.f5882G0 || this.z0 == 2)) {
                    f0();
                }
                return false;
            } else if (this.f5921m0) {
                this.f5921m0 = false;
                lVar.r(f3, false);
                return true;
            } else if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                f0();
                return false;
            } else {
                this.f5925q0 = f3;
                ByteBuffer v3 = lVar.v(f3);
                this.f5926r0 = v3;
                if (v3 != null) {
                    v3.position(bufferInfo2.offset);
                    this.f5926r0.limit(bufferInfo2.offset + bufferInfo2.size);
                }
                if (this.f5919k0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0 && this.f5878E0 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = this.f5880F0;
                }
                long j6 = bufferInfo2.presentationTimeUs;
                if (j6 < this.x) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f5927s0 = z9;
                long j7 = this.f5880F0;
                if (j7 != -9223372036854775807L && j7 <= j6) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f5928t0 = z10;
                t0(j6);
            }
        }
        if (this.f5918j0 && this.f5874C0) {
            try {
                byteBuffer = this.f5926r0;
                i3 = this.f5925q0;
                i4 = bufferInfo2.flags;
                j5 = bufferInfo2.presentationTimeUs;
                z7 = this.f5927s0;
                z8 = this.f5928t0;
                c0113p = this.f5896O;
                c0113p.getClass();
                z4 = true;
                z5 = false;
            } catch (IllegalStateException unused2) {
                z5 = false;
            }
            try {
                g02 = g0(j3, j4, lVar, byteBuffer, i3, i4, 1, j5, z7, z8, c0113p);
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused3) {
                f0();
                if (this.f5884H0) {
                    i0();
                }
                return z5;
            }
        } else {
            z4 = true;
            z5 = false;
            ByteBuffer byteBuffer2 = this.f5926r0;
            int i5 = this.f5925q0;
            int i6 = bufferInfo2.flags;
            long j8 = bufferInfo2.presentationTimeUs;
            boolean z11 = this.f5927s0;
            boolean z12 = this.f5928t0;
            C0113p c0113p2 = this.f5896O;
            c0113p2.getClass();
            bufferInfo = bufferInfo2;
            g02 = g0(j3, j4, lVar, byteBuffer2, i5, i6, 1, j8, z11, z12, c0113p2);
        }
        if (g02) {
            b0(bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 4) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.f5925q0 = -1;
            this.f5926r0 = null;
            if (!z6) {
                return z4;
            }
            f0();
        }
        return z5;
    }

    public final boolean H() {
        l lVar = this.f5905W;
        if (lVar == null || this.z0 == 2 || this.f5882G0) {
            return false;
        }
        int i3 = this.f5924p0;
        X.f fVar = this.f5883H;
        if (i3 < 0) {
            int B3 = lVar.B();
            this.f5924p0 = B3;
            if (B3 < 0) {
                return false;
            }
            fVar.f2934q = lVar.l(B3);
            fVar.e();
        }
        if (this.z0 == 1) {
            if (!this.f5922n0) {
                this.f5874C0 = true;
                lVar.e(this.f5924p0, 0, 0L, 4);
                this.f5924p0 = -1;
                fVar.f2934q = null;
            }
            this.z0 = 2;
            return false;
        } else if (this.f5920l0) {
            this.f5920l0 = false;
            ByteBuffer byteBuffer = fVar.f2934q;
            byteBuffer.getClass();
            byteBuffer.put(f5871P0);
            lVar.e(this.f5924p0, 38, 0L, 0);
            this.f5924p0 = -1;
            fVar.f2934q = null;
            this.f5873B0 = true;
            return true;
        } else {
            if (this.f5933y0 == 1) {
                int i4 = 0;
                while (true) {
                    C0113p c0113p = this.f5906X;
                    c0113p.getClass();
                    if (i4 >= c0113p.f1977p.size()) {
                        break;
                    }
                    ByteBuffer byteBuffer2 = fVar.f2934q;
                    byteBuffer2.getClass();
                    byteBuffer2.put((byte[]) this.f5906X.f1977p.get(i4));
                    i4++;
                }
                this.f5933y0 = 2;
            }
            ByteBuffer byteBuffer3 = fVar.f2934q;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            B1.a aVar = this.f3278o;
            aVar.y();
            try {
                int u3 = u(aVar, fVar, 0);
                if (u3 == -3) {
                    if (j()) {
                        this.f5880F0 = this.f5878E0;
                    }
                    return false;
                } else if (u3 == -5) {
                    if (this.f5933y0 == 2) {
                        fVar.e();
                        this.f5933y0 = 1;
                    }
                    Y(aVar);
                    return true;
                } else if (fVar.c(4)) {
                    this.f5880F0 = this.f5878E0;
                    if (this.f5933y0 == 2) {
                        fVar.e();
                        this.f5933y0 = 1;
                    }
                    this.f5882G0 = true;
                    if (!this.f5873B0) {
                        f0();
                        return false;
                    }
                    try {
                        if (!this.f5922n0) {
                            this.f5874C0 = true;
                            lVar.e(this.f5924p0, 0, 0L, 4);
                            this.f5924p0 = -1;
                            fVar.f2934q = null;
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e2) {
                        throw f(e2, this.f5894N, false, U.A.w(e2.getErrorCode()));
                    }
                } else if (!this.f5873B0 && !fVar.c(1)) {
                    fVar.e();
                    if (this.f5933y0 == 2) {
                        this.f5933y0 = 1;
                    }
                    return true;
                } else {
                    boolean c3 = fVar.c(1073741824);
                    if (c3) {
                        X.b bVar = fVar.f2933p;
                        if (position == 0) {
                            bVar.getClass();
                        } else {
                            if (bVar.f2925d == null) {
                                int[] iArr = new int[1];
                                bVar.f2925d = iArr;
                                bVar.f2930i.numBytesOfClearData = iArr;
                            }
                            int[] iArr2 = bVar.f2925d;
                            iArr2[0] = iArr2[0] + position;
                        }
                    }
                    if (this.f5914f0 && !c3) {
                        ByteBuffer byteBuffer4 = fVar.f2934q;
                        byteBuffer4.getClass();
                        int position2 = byteBuffer4.position();
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            int i7 = i5 + 1;
                            if (i7 < position2) {
                                int i8 = byteBuffer4.get(i5) & 255;
                                if (i6 == 3) {
                                    if (i8 == 1 && (byteBuffer4.get(i7) & 31) == 7) {
                                        ByteBuffer duplicate = byteBuffer4.duplicate();
                                        duplicate.position(i5 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer4.position(0);
                                        byteBuffer4.put(duplicate);
                                        break;
                                    }
                                } else if (i8 == 0) {
                                    i6++;
                                }
                                if (i8 != 0) {
                                    i6 = 0;
                                }
                                i5 = i7;
                            } else {
                                byteBuffer4.clear();
                                break;
                            }
                        }
                        ByteBuffer byteBuffer5 = fVar.f2934q;
                        byteBuffer5.getClass();
                        if (byteBuffer5.position() == 0) {
                            return true;
                        }
                        this.f5914f0 = false;
                    }
                    long j3 = fVar.f2936s;
                    if (this.f5886I0) {
                        ArrayDeque arrayDeque = this.L;
                        if (!arrayDeque.isEmpty()) {
                            Q0.g gVar = ((u) arrayDeque.peekLast()).f5870d;
                            C0113p c0113p2 = this.f5894N;
                            c0113p2.getClass();
                            gVar.a(j3, c0113p2);
                        } else {
                            Q0.g gVar2 = this.f5893M0.f5870d;
                            C0113p c0113p3 = this.f5894N;
                            c0113p3.getClass();
                            gVar2.a(j3, c0113p3);
                        }
                        this.f5886I0 = false;
                    }
                    this.f5878E0 = Math.max(this.f5878E0, j3);
                    if (j() || fVar.c(536870912)) {
                        this.f5880F0 = this.f5878E0;
                    }
                    fVar.i();
                    if (fVar.c(268435456)) {
                        Q(fVar);
                    }
                    d0(fVar);
                    int L = L(fVar);
                    try {
                        if (c3) {
                            lVar.b(this.f5924p0, fVar.f2933p, j3, L);
                        } else {
                            int i9 = this.f5924p0;
                            ByteBuffer byteBuffer6 = fVar.f2934q;
                            byteBuffer6.getClass();
                            lVar.e(i9, byteBuffer6.limit(), j3, L);
                        }
                        this.f5924p0 = -1;
                        fVar.f2934q = null;
                        this.f5873B0 = true;
                        this.f5933y0 = 0;
                        this.f5891L0.f3291c++;
                        return true;
                    } catch (MediaCodec.CryptoException e3) {
                        throw f(e3, this.f5894N, false, U.A.w(e3.getErrorCode()));
                    }
                }
            } catch (X.e e4) {
                V(e4);
                h0(0);
                I();
                return true;
            }
        }
    }

    public final void I() {
        try {
            l lVar = this.f5905W;
            AbstractC0123a.k(lVar);
            lVar.flush();
        } finally {
            k0();
        }
    }

    public final boolean J() {
        boolean z3;
        if (this.f5905W == null) {
            return false;
        }
        int i3 = this.f5872A0;
        if (i3 != 3 && !this.f5915g0 && ((!this.f5916h0 || this.f5876D0) && (!this.f5917i0 || !this.f5874C0))) {
            if (i3 == 2) {
                int i4 = U.A.f2405a;
                if (i4 >= 23) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                AbstractC0123a.j(z3);
                if (i4 >= 23) {
                    try {
                        s0();
                    } catch (C0142m e2) {
                        AbstractC0123a.B("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e2);
                        i0();
                        return true;
                    }
                }
            }
            I();
            return false;
        }
        i0();
        return true;
    }

    public final List K(boolean z3) {
        C0113p c0113p = this.f5894N;
        c0113p.getClass();
        w wVar = this.f5877E;
        ArrayList O3 = O(wVar, c0113p, z3);
        if (O3.isEmpty() && z3) {
            O3 = O(wVar, c0113p, false);
            if (!O3.isEmpty()) {
                AbstractC0123a.A("MediaCodecRenderer", "Drm session requires secure decoder for " + c0113p.f1974m + ", but no secure decoder available. Trying to proceed with " + O3 + ".");
            }
        }
        return O3;
    }

    public int L(X.f fVar) {
        return 0;
    }

    public boolean M() {
        return false;
    }

    public abstract float N(float f3, C0113p[] c0113pArr);

    public abstract ArrayList O(w wVar, C0113p c0113p, boolean z3);

    public abstract j P(o oVar, C0113p c0113p, MediaCrypto mediaCrypto, float f3);

    public abstract void Q(X.f fVar);

    /* JADX WARN: Code restructure failed: missing block: B:212:0x0435, code lost:
        if ("stvm8".equals(r4) == false) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0445, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r6) == false) goto L261;
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0514  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(h0.o r19, android.media.MediaCrypto r20) {
        /*
            Method dump skipped, instructions count: 1335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.v.R(h0.o, android.media.MediaCrypto):void");
    }

    public final boolean S(long j3, long j4) {
        C0113p c0113p;
        if (j4 < j3 && ((c0113p = this.f5896O) == null || !Objects.equals(c0113p.f1974m, "audio/opus") || j3 - j4 > 80000)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0076, code lost:
        if (r6 != 4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
        if (r1.G() != null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T() {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.v.T():void");
    }

    public final void U(MediaCrypto mediaCrypto, boolean z3) {
        String str;
        String str2;
        C0113p c0113p = this.f5894N;
        c0113p.getClass();
        if (this.f5910b0 == null) {
            try {
                List K3 = K(z3);
                this.f5910b0 = new ArrayDeque();
                if (!K3.isEmpty()) {
                    this.f5910b0.add((o) K3.get(0));
                }
                this.f5911c0 = null;
            } catch (C0280A e2) {
                throw new s(c0113p, e2, z3, -49998);
            }
        }
        if (!this.f5910b0.isEmpty()) {
            ArrayDeque arrayDeque = this.f5910b0;
            arrayDeque.getClass();
            while (this.f5905W == null) {
                o oVar = (o) arrayDeque.peekFirst();
                oVar.getClass();
                if (!o0(oVar)) {
                    return;
                }
                try {
                    R(oVar, mediaCrypto);
                } catch (Exception e3) {
                    AbstractC0123a.B("MediaCodecRenderer", "Failed to initialize decoder: " + oVar, e3);
                    arrayDeque.removeFirst();
                    String str3 = "Decoder init failed: " + oVar.f5853a + ", " + c0113p;
                    if (U.A.f2405a >= 21) {
                        if (e3 instanceof MediaCodec.CodecException) {
                            str2 = ((MediaCodec.CodecException) e3).getDiagnosticInfo();
                        } else {
                            str2 = null;
                        }
                        str = str2;
                    } else {
                        str = null;
                    }
                    s sVar = new s(str3, e3, c0113p.f1974m, z3, oVar, str);
                    V(sVar);
                    s sVar2 = this.f5911c0;
                    if (sVar2 == null) {
                        this.f5911c0 = sVar;
                    } else {
                        this.f5911c0 = new s(sVar2.getMessage(), sVar2.getCause(), sVar2.f5861m, sVar2.f5862n, sVar2.f5863o, sVar2.f5864p);
                    }
                    if (arrayDeque.isEmpty()) {
                        throw this.f5911c0;
                    }
                }
            }
            this.f5910b0 = null;
            return;
        }
        throw new s(c0113p, null, z3, -49999);
    }

    public abstract void V(Exception exc);

    public abstract void W(long j3, long j4, String str);

    public abstract void X(String str);

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0151, code lost:
        if (F() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cf, code lost:
        if (r4.O(r3) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010c, code lost:
        if (F() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x013f, code lost:
        if (F() == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Y.C0137h Y(B1.a r13) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.v.Y(B1.a):Y.h");
    }

    public abstract void Z(C0113p c0113p, MediaFormat mediaFormat);

    public void b0(long j3) {
        this.f5895N0 = j3;
        while (true) {
            ArrayDeque arrayDeque = this.L;
            if (!arrayDeque.isEmpty() && j3 >= ((u) arrayDeque.peek()).f5867a) {
                u uVar = (u) arrayDeque.poll();
                uVar.getClass();
                n0(uVar);
                c0();
            } else {
                return;
            }
        }
    }

    public abstract void c0();

    public final void f0() {
        int i3 = this.f5872A0;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    this.f5884H0 = true;
                    j0();
                    return;
                }
                i0();
                T();
                return;
            }
            I();
            s0();
            return;
        }
        I();
    }

    public abstract boolean g0(long j3, long j4, l lVar, ByteBuffer byteBuffer, int i3, int i4, int i5, long j5, boolean z3, boolean z4, C0113p c0113p);

    public final boolean h0(int i3) {
        B1.a aVar = this.f3278o;
        aVar.y();
        X.f fVar = this.f5881G;
        fVar.e();
        int u3 = u(aVar, fVar, i3 | 4);
        if (u3 == -5) {
            Y(aVar);
            return true;
        } else if (u3 == -4 && fVar.c(4)) {
            this.f5882G0 = true;
            f0();
            return false;
        } else {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [C1.j, android.media.MediaCrypto] */
    public final void i0() {
        try {
            l lVar = this.f5905W;
            if (lVar != null) {
                lVar.release();
                this.f5891L0.f3290b++;
                o oVar = this.f5912d0;
                oVar.getClass();
                X(oVar.f5853a);
            }
            this.f5905W = null;
            try {
                MediaCrypto mediaCrypto = this.f5901S;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f5905W = null;
            try {
                MediaCrypto mediaCrypto2 = this.f5901S;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void k0() {
        this.f5924p0 = -1;
        this.f5883H.f2934q = null;
        this.f5925q0 = -1;
        this.f5926r0 = null;
        this.f5923o0 = -9223372036854775807L;
        this.f5874C0 = false;
        this.f5873B0 = false;
        this.f5920l0 = false;
        this.f5921m0 = false;
        this.f5927s0 = false;
        this.f5928t0 = false;
        this.f5878E0 = -9223372036854775807L;
        this.f5880F0 = -9223372036854775807L;
        this.f5895N0 = -9223372036854775807L;
        this.z0 = 0;
        this.f5872A0 = 0;
        this.f5933y0 = this.f5932x0 ? 1 : 0;
    }

    @Override // Y.AbstractC0135f
    public boolean l() {
        boolean f3;
        boolean z3;
        if (this.f5894N == null) {
            return false;
        }
        if (j()) {
            f3 = this.f3288z;
        } else {
            U u3 = this.f3284u;
            u3.getClass();
            f3 = u3.f();
        }
        if (!f3) {
            if (this.f5925q0 >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                if (this.f5923o0 == -9223372036854775807L) {
                    return false;
                }
                this.f3282s.getClass();
                if (SystemClock.elapsedRealtime() >= this.f5923o0) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void l0() {
        k0();
        this.f5890K0 = null;
        this.f5910b0 = null;
        this.f5912d0 = null;
        this.f5906X = null;
        this.f5907Y = null;
        this.f5908Z = false;
        this.f5876D0 = false;
        this.f5909a0 = -1.0f;
        this.f5913e0 = 0;
        this.f5914f0 = false;
        this.f5915g0 = false;
        this.f5916h0 = false;
        this.f5917i0 = false;
        this.f5918j0 = false;
        this.f5919k0 = false;
        this.f5922n0 = false;
        this.f5932x0 = false;
        this.f5933y0 = 0;
    }

    @Override // Y.AbstractC0135f
    public void m() {
        this.f5894N = null;
        n0(u.f5866e);
        this.L.clear();
        J();
    }

    public final void m0(C1.j jVar) {
        C1.j jVar2 = this.f5898P;
        if (jVar2 != jVar) {
            if (jVar != null) {
                jVar.n(null);
            }
            if (jVar2 != null) {
                jVar2.N(null);
            }
        }
        this.f5898P = jVar;
    }

    public final void n0(u uVar) {
        this.f5893M0 = uVar;
        if (uVar.f5869c != -9223372036854775807L) {
            this.f5897O0 = true;
            a0();
        }
    }

    @Override // Y.AbstractC0135f
    public void o(long j3, boolean z3) {
        this.f5882G0 = false;
        this.f5884H0 = false;
        this.f5888J0 = false;
        if (this.f5929u0) {
            this.f5887J.e();
            this.f5885I.e();
            this.f5930v0 = false;
            P p3 = this.f5892M;
            p3.getClass();
            p3.f3713a = S.d.f2159a;
            p3.f3715c = 0;
            p3.f3714b = 2;
        } else if (J()) {
            T();
        }
        if (this.f5893M0.f5870d.g() > 0) {
            this.f5886I0 = true;
        }
        this.f5893M0.f5870d.b();
        this.L.clear();
    }

    public boolean o0(o oVar) {
        return true;
    }

    public boolean p0(C0113p c0113p) {
        return false;
    }

    public abstract int q0(w wVar, C0113p c0113p);

    public final boolean r0(C0113p c0113p) {
        if (U.A.f2405a >= 23 && this.f5905W != null && this.f5872A0 != 3 && this.f3283t != 0) {
            float f3 = this.f5904V;
            c0113p.getClass();
            C0113p[] c0113pArr = this.f3285v;
            c0113pArr.getClass();
            float N3 = N(f3, c0113pArr);
            float f4 = this.f5909a0;
            if (f4 == N3) {
                return true;
            }
            if (N3 == -1.0f) {
                if (this.f5873B0) {
                    this.z0 = 1;
                    this.f5872A0 = 3;
                    return false;
                }
                i0();
                T();
                return false;
            } else if (f4 == -1.0f && N3 <= this.f5879F) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", N3);
                l lVar = this.f5905W;
                lVar.getClass();
                lVar.a(bundle);
                this.f5909a0 = N3;
            }
        }
        return true;
    }

    public final void s0() {
        C1.j jVar = this.f5899Q;
        jVar.getClass();
        X.a z3 = jVar.z();
        if (z3 instanceof d0.h) {
            try {
                MediaCrypto mediaCrypto = this.f5901S;
                mediaCrypto.getClass();
                ((d0.h) z3).getClass();
                mediaCrypto.setMediaDrmSession(null);
            } catch (MediaCryptoException e2) {
                throw f(e2, this.f5894N, false, 6006);
            }
        }
        m0(this.f5899Q);
        this.z0 = 0;
        this.f5872A0 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r7 >= r5) goto L14;
     */
    @Override // Y.AbstractC0135f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(R.C0113p[] r14, long r15, long r17) {
        /*
            r13 = this;
            r0 = r13
            h0.u r1 = r0.f5893M0
            long r1 = r1.f5869c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L20
            h0.u r1 = new h0.u
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r1
            r9 = r15
            r11 = r17
            r6.<init>(r7, r9, r11)
            r13.n0(r1)
            goto L63
        L20:
            java.util.ArrayDeque r1 = r0.L
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L55
            long r5 = r0.f5878E0
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L38
            long r7 = r0.f5895N0
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L55
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L55
        L38:
            h0.u r1 = new h0.u
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r15
            r10 = r17
            r5.<init>(r6, r8, r10)
            r13.n0(r1)
            h0.u r1 = r0.f5893M0
            long r1 = r1.f5869c
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L63
            r13.c0()
            goto L63
        L55:
            h0.u r2 = new h0.u
            long r7 = r0.f5878E0
            r6 = r2
            r9 = r15
            r11 = r17
            r6.<init>(r7, r9, r11)
            r1.add(r2)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.v.t(R.p[], long, long):void");
    }

    public final void t0(long j3) {
        C0113p c0113p = (C0113p) this.f5893M0.f5870d.e(j3);
        if (c0113p == null && this.f5897O0 && this.f5907Y != null) {
            c0113p = (C0113p) this.f5893M0.f5870d.d();
        }
        if (c0113p != null) {
            this.f5896O = c0113p;
        } else if (!this.f5908Z || this.f5896O == null) {
            return;
        }
        C0113p c0113p2 = this.f5896O;
        c0113p2.getClass();
        Z(c0113p2, this.f5907Y);
        this.f5908Z = false;
        this.f5897O0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0075 A[LOOP:1: B:29:0x0050->B:39:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096 A[LOOP:2: B:40:0x0076->B:50:0x0096, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0076 A[EDGE_INSN: B:87:0x0076->B:91:0x0076 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0097 A[EDGE_INSN: B:89:0x0097->B:51:0x0097 ?: BREAK  , SYNTHETIC] */
    @Override // Y.AbstractC0135f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(long r12, long r14) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.v.v(long, long):void");
    }

    @Override // Y.AbstractC0135f
    public void y(float f3, float f4) {
        this.f5903U = f3;
        this.f5904V = f4;
        r0(this.f5906X);
    }

    @Override // Y.AbstractC0135f
    public final int z(C0113p c0113p) {
        try {
            return q0(this.f5877E, c0113p);
        } catch (C0280A e2) {
            throw f(e2, c0113p, false, 4002);
        }
    }

    public void a0() {
    }

    public void j0() {
    }

    public void d0(X.f fVar) {
    }

    public void e0(C0113p c0113p) {
    }
}
