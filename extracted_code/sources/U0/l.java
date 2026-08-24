package u0;

import D1.b0;
import R.C0106i;
import R.C0112o;
import R.C0113p;
import R.G;
import R.c0;
import U.A;
import U.AbstractC0123a;
import U.x;
import Y.C0136g;
import Y.C0137h;
import Y.D;
import Y.E;
import Y.H;
import Y.k0;
import a0.C;
import a0.C0171o;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import h0.C0280A;
import h0.y;
import i1.C0308g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import k0.C0558m;
/* loaded from: classes.dex */
public final class l extends h0.v {
    public static final int[] w1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: x1  reason: collision with root package name */
    public static boolean f9349x1;
    public static boolean y1;

    /* renamed from: Q0  reason: collision with root package name */
    public final Context f9350Q0;

    /* renamed from: R0  reason: collision with root package name */
    public final boolean f9351R0;
    public final C0171o S0;

    /* renamed from: T0  reason: collision with root package name */
    public final int f9352T0;

    /* renamed from: U0  reason: collision with root package name */
    public final boolean f9353U0;

    /* renamed from: V0  reason: collision with root package name */
    public final o f9354V0;

    /* renamed from: W0  reason: collision with root package name */
    public final U2.c f9355W0;

    /* renamed from: X0  reason: collision with root package name */
    public C0308g f9356X0;

    /* renamed from: Y0  reason: collision with root package name */
    public boolean f9357Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public boolean f9358Z0;

    /* renamed from: a1  reason: collision with root package name */
    public C0855d f9359a1;

    /* renamed from: b1  reason: collision with root package name */
    public boolean f9360b1;

    /* renamed from: c1  reason: collision with root package name */
    public List f9361c1;

    /* renamed from: d1  reason: collision with root package name */
    public Surface f9362d1;
    public n e1;

    /* renamed from: f1  reason: collision with root package name */
    public U.u f9363f1;

    /* renamed from: g1  reason: collision with root package name */
    public boolean f9364g1;

    /* renamed from: h1  reason: collision with root package name */
    public int f9365h1;

    /* renamed from: i1  reason: collision with root package name */
    public long f9366i1;

    /* renamed from: j1  reason: collision with root package name */
    public int f9367j1;

    /* renamed from: k1  reason: collision with root package name */
    public int f9368k1;

    /* renamed from: l1  reason: collision with root package name */
    public int f9369l1;

    /* renamed from: m1  reason: collision with root package name */
    public long f9370m1;

    /* renamed from: n1  reason: collision with root package name */
    public int f9371n1;

    /* renamed from: o1  reason: collision with root package name */
    public long f9372o1;

    /* renamed from: p1  reason: collision with root package name */
    public c0 f9373p1;
    public c0 q1;

    /* renamed from: r1  reason: collision with root package name */
    public int f9374r1;

    /* renamed from: s1  reason: collision with root package name */
    public boolean f9375s1;

    /* renamed from: t1  reason: collision with root package name */
    public int f9376t1;

    /* renamed from: u1  reason: collision with root package name */
    public k f9377u1;

    /* renamed from: v1  reason: collision with root package name */
    public E f9378v1;

    public l(Context context, h0.k kVar, Handler handler, D d3) {
        super(2, kVar, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f9350Q0 = applicationContext;
        this.f9352T0 = 50;
        this.S0 = new C0171o(handler, d3, 1);
        this.f9351R0 = true;
        this.f9354V0 = new o(applicationContext, this);
        this.f9355W0 = new U2.c();
        this.f9353U0 = "NVIDIA".equals(A.f2407c);
        this.f9363f1 = U.u.f2480c;
        this.f9365h1 = 1;
        this.f9373p1 = c0.f1879e;
        this.f9376t1 = 0;
        this.q1 = null;
        this.f9374r1 = -1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0751, code lost:
        if (r14.equals("A10-70L") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x08b9, code lost:
        if (r1.equals("JSN-L21") == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean u0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 3208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.l.u0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
        if (r9.equals("video/hevc") == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int v0(h0.o r11, R.C0113p r12) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.l.v0(h0.o, R.p):int");
    }

    public static List w0(Context context, h0.w wVar, C0113p c0113p, boolean z3, boolean z4) {
        List e2;
        String str = c0113p.f1974m;
        if (str == null) {
            return b0.f231q;
        }
        if (A.f2405a >= 26 && "video/dolby-vision".equals(str) && !j.a(context)) {
            String b3 = h0.D.b(c0113p);
            if (b3 == null) {
                e2 = b0.f231q;
            } else {
                wVar.getClass();
                e2 = h0.D.e(b3, z3, z4);
            }
            if (!e2.isEmpty()) {
                return e2;
            }
        }
        return h0.D.g(wVar, c0113p, z3, z4);
    }

    public static int x0(h0.o oVar, C0113p c0113p) {
        if (c0113p.f1975n != -1) {
            List list = c0113p.f1977p;
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                i3 += ((byte[]) list.get(i4)).length;
            }
            return c0113p.f1975n + i3;
        }
        return v0(oVar, c0113p);
    }

    public final void A0() {
        int i3;
        h0.l lVar;
        if (!this.f9375s1 || (i3 = A.f2405a) < 23 || (lVar = this.f5905W) == null) {
            return;
        }
        this.f9377u1 = new k(this, lVar);
        if (i3 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            lVar.a(bundle);
        }
    }

    public final void B0() {
        Surface surface = this.f9362d1;
        n nVar = this.e1;
        if (surface == nVar) {
            this.f9362d1 = null;
        }
        if (nVar != null) {
            nVar.release();
            this.e1 = null;
        }
    }

    @Override // h0.v
    public final C0137h C(h0.o oVar, C0113p c0113p, C0113p c0113p2) {
        int i3;
        C0137h b3 = oVar.b(c0113p, c0113p2);
        C0308g c0308g = this.f9356X0;
        c0308g.getClass();
        int i4 = c0113p2.f1980s;
        int i5 = c0308g.f6023a;
        int i6 = b3.f3305e;
        if (i4 > i5 || c0113p2.f1981t > c0308g.f6024b) {
            i6 |= 256;
        }
        if (x0(oVar, c0113p2) > c0308g.f6025c) {
            i6 |= 64;
        }
        int i7 = i6;
        if (i7 != 0) {
            i3 = 0;
        } else {
            i3 = b3.f3304d;
        }
        return new C0137h(oVar.f5853a, c0113p, c0113p2, i3, i7);
    }

    public final void C0(h0.l lVar, int i3) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        lVar.r(i3, true);
        Trace.endSection();
        this.f5891L0.f3293e++;
        boolean z3 = false;
        this.f9368k1 = 0;
        if (this.f9359a1 == null) {
            z0(this.f9373p1);
            o oVar = this.f9354V0;
            if (oVar.f9392d != 3) {
                z3 = true;
            }
            oVar.f9392d = 3;
            oVar.f9399k.getClass();
            oVar.f9394f = A.M(SystemClock.elapsedRealtime());
            if (z3 && (surface = this.f9362d1) != null) {
                C0171o c0171o = this.S0;
                Handler handler = c0171o.f3774b;
                if (handler != null) {
                    handler.post(new u(c0171o, surface, SystemClock.elapsedRealtime()));
                }
                this.f9364g1 = true;
            }
        }
    }

    @Override // h0.v
    public final h0.n D(IllegalStateException illegalStateException, h0.o oVar) {
        Surface surface = this.f9362d1;
        h0.n nVar = new h0.n(illegalStateException, oVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return nVar;
    }

    public final void D0(h0.l lVar, int i3, long j3) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        lVar.j(j3, i3);
        Trace.endSection();
        this.f5891L0.f3293e++;
        boolean z3 = false;
        this.f9368k1 = 0;
        if (this.f9359a1 == null) {
            z0(this.f9373p1);
            o oVar = this.f9354V0;
            if (oVar.f9392d != 3) {
                z3 = true;
            }
            oVar.f9392d = 3;
            oVar.f9399k.getClass();
            oVar.f9394f = A.M(SystemClock.elapsedRealtime());
            if (z3 && (surface = this.f9362d1) != null) {
                C0171o c0171o = this.S0;
                Handler handler = c0171o.f3774b;
                if (handler != null) {
                    handler.post(new u(c0171o, surface, SystemClock.elapsedRealtime()));
                }
                this.f9364g1 = true;
            }
        }
    }

    public final boolean E0(h0.o oVar) {
        if (A.f2405a >= 23 && !this.f9375s1 && !u0(oVar.f5853a) && (!oVar.f5858f || n.d(this.f9350Q0))) {
            return true;
        }
        return false;
    }

    public final void F0(h0.l lVar, int i3) {
        Trace.beginSection("skipVideoBuffer");
        lVar.r(i3, false);
        Trace.endSection();
        this.f5891L0.f3294f++;
    }

    public final void G0(int i3, int i4) {
        C0136g c0136g = this.f5891L0;
        c0136g.f3296h += i3;
        int i5 = i3 + i4;
        c0136g.f3295g += i5;
        this.f9367j1 += i5;
        int i6 = this.f9368k1 + i5;
        this.f9368k1 = i6;
        c0136g.f3297i = Math.max(i6, c0136g.f3297i);
        int i7 = this.f9352T0;
        if (i7 > 0 && this.f9367j1 >= i7) {
            y0();
        }
    }

    public final void H0(long j3) {
        C0136g c0136g = this.f5891L0;
        c0136g.f3299k += j3;
        c0136g.f3300l++;
        this.f9370m1 += j3;
        this.f9371n1++;
    }

    @Override // h0.v
    public final int L(X.f fVar) {
        if (A.f2405a >= 34 && this.f9375s1 && fVar.f2936s < this.x) {
            return 32;
        }
        return 0;
    }

    @Override // h0.v
    public final boolean M() {
        if (this.f9375s1 && A.f2405a < 23) {
            return true;
        }
        return false;
    }

    @Override // h0.v
    public final float N(float f3, C0113p[] c0113pArr) {
        float f4 = -1.0f;
        for (C0113p c0113p : c0113pArr) {
            float f5 = c0113p.f1982u;
            if (f5 != -1.0f) {
                f4 = Math.max(f4, f5);
            }
        }
        if (f4 == -1.0f) {
            return -1.0f;
        }
        return f4 * f3;
    }

    @Override // h0.v
    public final ArrayList O(h0.w wVar, C0113p c0113p, boolean z3) {
        List w02 = w0(this.f9350Q0, wVar, c0113p, z3, this.f9375s1);
        Pattern pattern = h0.D.f5802a;
        ArrayList arrayList = new ArrayList(w02);
        Collections.sort(arrayList, new y(new B0.a(c0113p, 19)));
        return arrayList;
    }

    @Override // h0.v
    public final h0.j P(h0.o oVar, C0113p c0113p, MediaCrypto mediaCrypto, float f3) {
        boolean z3;
        int i3;
        int i4;
        C0106i c0106i;
        int i5;
        C0308g c0308g;
        boolean z4;
        int i6;
        int i7;
        Point point;
        float f4;
        int i8;
        int i9;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Point point2;
        boolean z5;
        int i10;
        boolean z6;
        int i11;
        boolean z7;
        Pair d3;
        int v02;
        n nVar = this.e1;
        boolean z8 = oVar.f5858f;
        if (nVar != null && nVar.f9386m != z8) {
            B0();
        }
        String str = oVar.f5855c;
        C0113p[] c0113pArr = this.f3285v;
        c0113pArr.getClass();
        int i12 = c0113p.f1980s;
        int x02 = x0(oVar, c0113p);
        int length = c0113pArr.length;
        float f5 = c0113p.f1982u;
        int i13 = c0113p.f1980s;
        C0106i c0106i2 = c0113p.f1986z;
        int i14 = c0113p.f1981t;
        if (length == 1) {
            if (x02 != -1 && (v02 = v0(oVar, c0113p)) != -1) {
                x02 = Math.min((int) (x02 * 1.5f), v02);
            }
            c0308g = new C0308g(i12, i14, x02);
            z3 = z8;
            i3 = i14;
            i4 = i13;
            c0106i = c0106i2;
        } else {
            int length2 = c0113pArr.length;
            int i15 = i14;
            int i16 = 0;
            boolean z9 = false;
            while (i16 < length2) {
                C0113p c0113p2 = c0113pArr[i16];
                C0113p[] c0113pArr2 = c0113pArr;
                if (c0106i2 != null && c0113p2.f1986z == null) {
                    C0112o a3 = c0113p2.a();
                    a3.f1949y = c0106i2;
                    c0113p2 = new C0113p(a3);
                }
                if (oVar.b(c0113p, c0113p2).f3304d != 0) {
                    int i17 = c0113p2.f1981t;
                    i10 = length2;
                    int i18 = c0113p2.f1980s;
                    z5 = z8;
                    if (i18 != -1 && i17 != -1) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    z9 |= z6;
                    i12 = Math.max(i12, i18);
                    i15 = Math.max(i15, i17);
                    x02 = Math.max(x02, x0(oVar, c0113p2));
                } else {
                    z5 = z8;
                    i10 = length2;
                }
                i16++;
                c0113pArr = c0113pArr2;
                length2 = i10;
                z8 = z5;
            }
            z3 = z8;
            int i19 = i15;
            if (z9) {
                AbstractC0123a.A("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i12 + "x" + i19);
                if (i14 > i13) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    i6 = i14;
                } else {
                    i6 = i13;
                }
                if (z4) {
                    i7 = i13;
                } else {
                    i7 = i14;
                }
                c0106i = c0106i2;
                float f6 = i7 / i6;
                int[] iArr = w1;
                i3 = i14;
                i4 = i13;
                int i20 = 0;
                while (i20 < 9) {
                    int i21 = iArr[i20];
                    int[] iArr2 = iArr;
                    int i22 = (int) (i21 * f6);
                    if (i21 <= i6 || i22 <= i7) {
                        break;
                    }
                    int i23 = i7;
                    int i24 = i6;
                    if (A.f2405a >= 21) {
                        if (z4) {
                            i9 = i22;
                        } else {
                            i9 = i21;
                        }
                        if (!z4) {
                            i21 = i22;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.f5856d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            f4 = f6;
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            f4 = f6;
                            point2 = new Point(A.g(i9, widthAlignment) * widthAlignment, A.g(i21, heightAlignment) * heightAlignment);
                        }
                        if (point2 != null) {
                            Point point3 = point2;
                            if (oVar.f(point2.x, point2.y, f5)) {
                                point = point3;
                                break;
                            }
                        } else {
                            continue;
                        }
                        i20++;
                        iArr = iArr2;
                        i7 = i23;
                        i6 = i24;
                        f6 = f4;
                    } else {
                        f4 = f6;
                        try {
                            int g3 = A.g(i21, 16) * 16;
                            int g4 = A.g(i22, 16) * 16;
                            if (g3 * g4 <= h0.D.j()) {
                                if (z4) {
                                    i8 = g4;
                                } else {
                                    i8 = g3;
                                }
                                if (!z4) {
                                    g3 = g4;
                                }
                                point = new Point(i8, g3);
                            } else {
                                i20++;
                                iArr = iArr2;
                                i7 = i23;
                                i6 = i24;
                                f6 = f4;
                            }
                        } catch (C0280A unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    i12 = Math.max(i12, point.x);
                    i5 = Math.max(i19, point.y);
                    C0112o a4 = c0113p.a();
                    a4.f1943r = i12;
                    a4.f1944s = i5;
                    x02 = Math.max(x02, v0(oVar, new C0113p(a4)));
                    AbstractC0123a.A("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i12 + "x" + i5);
                    c0308g = new C0308g(i12, i5, x02);
                }
            } else {
                i3 = i14;
                i4 = i13;
                c0106i = c0106i2;
            }
            i5 = i19;
            c0308g = new C0308g(i12, i5, x02);
        }
        this.f9356X0 = c0308g;
        if (this.f9375s1) {
            i11 = this.f9376t1;
        } else {
            i11 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i4);
        mediaFormat.setInteger("height", i3);
        AbstractC0123a.z(mediaFormat, c0113p.f1977p);
        if (f5 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f5);
        }
        AbstractC0123a.v(mediaFormat, "rotation-degrees", c0113p.f1983v);
        if (c0106i != null) {
            C0106i c0106i3 = c0106i;
            AbstractC0123a.v(mediaFormat, "color-transfer", c0106i3.f1900c);
            AbstractC0123a.v(mediaFormat, "color-standard", c0106i3.f1898a);
            AbstractC0123a.v(mediaFormat, "color-range", c0106i3.f1899b);
            byte[] bArr = c0106i3.f1901d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c0113p.f1974m) && (d3 = h0.D.d(c0113p)) != null) {
            AbstractC0123a.v(mediaFormat, "profile", ((Integer) d3.first).intValue());
        }
        mediaFormat.setInteger("max-width", c0308g.f6023a);
        mediaFormat.setInteger("max-height", c0308g.f6024b);
        AbstractC0123a.v(mediaFormat, "max-input-size", c0308g.f6025c);
        int i25 = A.f2405a;
        if (i25 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f3 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f3);
            }
        }
        if (this.f9353U0) {
            z7 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z7 = true;
        }
        if (i11 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z7);
            mediaFormat.setInteger("audio-session-id", i11);
        }
        if (i25 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f9374r1));
        }
        if (this.f9362d1 == null) {
            if (E0(oVar)) {
                if (this.e1 == null) {
                    this.e1 = n.e(this.f9350Q0, z3);
                }
                this.f9362d1 = this.e1;
            } else {
                throw new IllegalStateException();
            }
        }
        C0855d c0855d = this.f9359a1;
        if (c0855d != null && !A.J(c0855d.f9311a)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        if (this.f9359a1 == null) {
            return new h0.j(oVar, mediaFormat, c0113p, this.f9362d1, mediaCrypto);
        }
        AbstractC0123a.j(false);
        AbstractC0123a.k(null);
        throw null;
    }

    @Override // h0.v
    public final void Q(X.f fVar) {
        if (!this.f9358Z0) {
            return;
        }
        ByteBuffer byteBuffer = fVar.f2937t;
        byteBuffer.getClass();
        if (byteBuffer.remaining() >= 7) {
            byte b3 = byteBuffer.get();
            short s3 = byteBuffer.getShort();
            short s4 = byteBuffer.getShort();
            byte b4 = byteBuffer.get();
            byte b5 = byteBuffer.get();
            byteBuffer.position(0);
            if (b3 == -75 && s3 == 60 && s4 == 1 && b4 == 4) {
                if (b5 == 0 || b5 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    h0.l lVar = this.f5905W;
                    lVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    lVar.a(bundle);
                }
            }
        }
    }

    @Override // h0.v
    public final void V(Exception exc) {
        AbstractC0123a.o("MediaCodecVideoRenderer", "Video codec error", exc);
        C0171o c0171o = this.S0;
        Handler handler = c0171o.f3774b;
        if (handler != null) {
            handler.post(new t(c0171o, exc, 3));
        }
    }

    @Override // h0.v
    public final void W(long j3, long j4, String str) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C0171o c0171o = this.S0;
        Handler handler = c0171o.f3774b;
        if (handler != null) {
            handler.post(new t(c0171o, str, j3, j4));
        }
        this.f9357Y0 = u0(str);
        h0.o oVar = this.f5912d0;
        oVar.getClass();
        boolean z3 = false;
        if (A.f2405a >= 29 && "video/x-vnd.on2.vp9".equals(oVar.f5854b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.f5856d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (codecProfileLevelArr[i3].profile == 16384) {
                    z3 = true;
                    break;
                } else {
                    i3++;
                }
            }
        }
        this.f9358Z0 = z3;
        A0();
    }

    @Override // h0.v
    public final void X(String str) {
        C0171o c0171o = this.S0;
        Handler handler = c0171o.f3774b;
        if (handler != null) {
            handler.post(new t(c0171o, str, 5));
        }
    }

    @Override // h0.v
    public final C0137h Y(B1.a aVar) {
        C0137h Y2 = super.Y(aVar);
        C0113p c0113p = (C0113p) aVar.f51o;
        c0113p.getClass();
        C0171o c0171o = this.S0;
        Handler handler = c0171o.f3774b;
        if (handler != null) {
            handler.post(new U.n(c0171o, c0113p, Y2, 13));
        }
        return Y2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
        if (r9.f9359a1 == null) goto L14;
     */
    @Override // h0.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(R.C0113p r10, android.media.MediaFormat r11) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.l.Z(R.p, android.media.MediaFormat):void");
    }

    @Override // h0.v
    public final void b0(long j3) {
        super.b0(j3);
        if (!this.f9375s1) {
            this.f9369l1--;
        }
    }

    @Override // h0.v
    public final void c0() {
        if (this.f9359a1 != null) {
            long j3 = this.f5893M0.f5869c;
        } else {
            this.f9354V0.c(2);
        }
        A0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v13, types: [android.view.Surface] */
    @Override // Y.AbstractC0135f, Y.g0
    public final void d(int i3, Object obj) {
        n nVar;
        Handler handler;
        n nVar2;
        o oVar = this.f9354V0;
        if (i3 != 1) {
            if (i3 != 7) {
                if (i3 != 10) {
                    if (i3 != 16) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                if (i3 != 13) {
                                    if (i3 != 14) {
                                        if (i3 == 11) {
                                            this.f5900R = (H) obj;
                                            return;
                                        }
                                        return;
                                    }
                                    obj.getClass();
                                    U.u uVar = (U.u) obj;
                                    if (uVar.f2481a != 0 && uVar.f2482b != 0) {
                                        this.f9363f1 = uVar;
                                        C0855d c0855d = this.f9359a1;
                                        if (c0855d != null) {
                                            Surface surface = this.f9362d1;
                                            AbstractC0123a.k(surface);
                                            c0855d.e(surface, uVar);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                obj.getClass();
                                List list = (List) obj;
                                this.f9361c1 = list;
                                C0855d c0855d2 = this.f9359a1;
                                if (c0855d2 != null) {
                                    ArrayList arrayList = c0855d2.f9313c;
                                    if (!arrayList.equals(list)) {
                                        arrayList.clear();
                                        arrayList.addAll(list);
                                        c0855d2.c();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            int intValue = ((Integer) obj).intValue();
                            r rVar = oVar.f9390b;
                            if (rVar.f9414j != intValue) {
                                rVar.f9414j = intValue;
                                rVar.d(true);
                                return;
                            }
                            return;
                        }
                        obj.getClass();
                        int intValue2 = ((Integer) obj).intValue();
                        this.f9365h1 = intValue2;
                        h0.l lVar = this.f5905W;
                        if (lVar != null) {
                            lVar.C(intValue2);
                            return;
                        }
                        return;
                    }
                    obj.getClass();
                    this.f9374r1 = ((Integer) obj).intValue();
                    h0.l lVar2 = this.f5905W;
                    if (lVar2 != null && A.f2405a >= 35) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("importance", Math.max(0, -this.f9374r1));
                        lVar2.a(bundle);
                        return;
                    }
                    return;
                }
                obj.getClass();
                int intValue3 = ((Integer) obj).intValue();
                if (this.f9376t1 != intValue3) {
                    this.f9376t1 = intValue3;
                    if (this.f9375s1) {
                        i0();
                        return;
                    }
                    return;
                }
                return;
            }
            obj.getClass();
            E e2 = (E) obj;
            this.f9378v1 = e2;
            C0855d c0855d3 = this.f9359a1;
            if (c0855d3 != null) {
                c0855d3.f9320j.f9329h = e2;
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            nVar = (Surface) obj;
        } else {
            nVar = null;
        }
        if (nVar == null) {
            n nVar3 = this.e1;
            if (nVar3 != null) {
                nVar = nVar3;
            } else {
                h0.o oVar2 = this.f5912d0;
                if (oVar2 != null && E0(oVar2)) {
                    nVar = n.e(this.f9350Q0, oVar2.f5858f);
                    this.e1 = nVar;
                }
            }
        }
        Surface surface2 = this.f9362d1;
        C0171o c0171o = this.S0;
        if (surface2 != nVar) {
            this.f9362d1 = nVar;
            if (this.f9359a1 == null) {
                r rVar2 = oVar.f9390b;
                rVar2.getClass();
                if (nVar instanceof n) {
                    nVar2 = null;
                } else {
                    nVar2 = nVar;
                }
                if (rVar2.f9409e != nVar2) {
                    rVar2.b();
                    rVar2.f9409e = nVar2;
                    rVar2.d(true);
                }
                oVar.c(1);
            }
            this.f9364g1 = false;
            int i4 = this.f3283t;
            h0.l lVar3 = this.f5905W;
            if (lVar3 != null && this.f9359a1 == null) {
                if (A.f2405a >= 23 && nVar != null && !this.f9357Y0) {
                    lVar3.m(nVar);
                } else {
                    i0();
                    T();
                }
            }
            if (nVar != null && nVar != this.e1) {
                c0 c0Var = this.q1;
                if (c0Var != null) {
                    c0171o.c(c0Var);
                }
                if (i4 == 2) {
                    oVar.b(true);
                }
            } else {
                this.q1 = null;
                C0855d c0855d4 = this.f9359a1;
                if (c0855d4 != null) {
                    C0856e c0856e = c0855d4.f9320j;
                    c0856e.getClass();
                    int i5 = U.u.f2480c.f2481a;
                    c0856e.f9331j = null;
                }
            }
            A0();
        } else if (nVar != null && nVar != this.e1) {
            c0 c0Var2 = this.q1;
            if (c0Var2 != null) {
                c0171o.c(c0Var2);
            }
            Surface surface3 = this.f9362d1;
            if (surface3 != null && this.f9364g1 && (handler = c0171o.f3774b) != null) {
                handler.post(new u(c0171o, surface3, SystemClock.elapsedRealtime()));
            }
        }
    }

    @Override // h0.v
    public final void d0(X.f fVar) {
        boolean z3;
        Surface surface;
        boolean z4 = this.f9375s1;
        if (!z4) {
            this.f9369l1++;
        }
        if (A.f2405a < 23 && z4) {
            long j3 = fVar.f2936s;
            t0(j3);
            z0(this.f9373p1);
            this.f5891L0.f3293e++;
            o oVar = this.f9354V0;
            if (oVar.f9392d != 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            oVar.f9392d = 3;
            oVar.f9399k.getClass();
            oVar.f9394f = A.M(SystemClock.elapsedRealtime());
            if (z3 && (surface = this.f9362d1) != null) {
                C0171o c0171o = this.S0;
                Handler handler = c0171o.f3774b;
                if (handler != null) {
                    handler.post(new u(c0171o, surface, SystemClock.elapsedRealtime()));
                }
                this.f9364g1 = true;
            }
            b0(j3);
        }
    }

    @Override // h0.v
    public final void e0(C0113p c0113p) {
        C0855d c0855d = this.f9359a1;
        if (c0855d == null) {
            return;
        }
        try {
            c0855d.b(c0113p);
            throw null;
        } catch (w e2) {
            throw f(e2, c0113p, false, 7000);
        }
    }

    @Override // Y.AbstractC0135f
    public final void g() {
        C0855d c0855d = this.f9359a1;
        if (c0855d != null) {
            o oVar = c0855d.f9320j.f9323b;
            if (oVar.f9392d == 0) {
                oVar.f9392d = 1;
                return;
            }
            return;
        }
        o oVar2 = this.f9354V0;
        if (oVar2.f9392d == 0) {
            oVar2.f9392d = 1;
        }
    }

    @Override // h0.v
    public final boolean g0(long j3, long j4, h0.l lVar, ByteBuffer byteBuffer, int i3, int i4, int i5, long j5, boolean z3, boolean z4, C0113p c0113p) {
        lVar.getClass();
        h0.u uVar = this.f5893M0;
        long j6 = j5 - uVar.f5869c;
        int a3 = this.f9354V0.a(j5, j3, j4, uVar.f5868b, z4, this.f9355W0);
        if (a3 == 4) {
            return false;
        }
        boolean z5 = true;
        if (z3 && !z4) {
            F0(lVar, i3);
            return true;
        }
        Surface surface = this.f9362d1;
        n nVar = this.e1;
        U2.c cVar = this.f9355W0;
        if (surface == nVar && this.f9359a1 == null) {
            if (cVar.f2587a >= 30000) {
                return false;
            }
            F0(lVar, i3);
            H0(cVar.f2587a);
            return true;
        }
        C0855d c0855d = this.f9359a1;
        if (c0855d != null) {
            try {
                c0855d.d(j3, j4);
                C0855d c0855d2 = this.f9359a1;
                c0855d2.getClass();
                AbstractC0123a.j(false);
                if (c0855d2.f9312b == -1) {
                    z5 = false;
                }
                AbstractC0123a.j(z5);
                long j7 = c0855d2.f9317g;
                if (j7 != -9223372036854775807L) {
                    C0856e c0856e = c0855d2.f9320j;
                    if (c0856e.f9332k == 0) {
                        long j8 = c0856e.f9324c.f9431j;
                        if (j8 != -9223372036854775807L && j8 >= j7) {
                            c0855d2.c();
                            c0855d2.f9317g = -9223372036854775807L;
                        }
                    }
                    return false;
                }
                AbstractC0123a.k(null);
                throw null;
            } catch (w e2) {
                throw f(e2, e2.f9438m, false, 7001);
            }
        } else if (a3 != 0) {
            if (a3 != 1) {
                if (a3 != 2) {
                    if (a3 != 3) {
                        if (a3 == 5) {
                            return false;
                        }
                        throw new IllegalStateException(String.valueOf(a3));
                    }
                    F0(lVar, i3);
                    H0(cVar.f2587a);
                    return true;
                }
                Trace.beginSection("dropVideoBuffer");
                lVar.r(i3, false);
                Trace.endSection();
                G0(0, 1);
                H0(cVar.f2587a);
                return true;
            }
            long j9 = cVar.f2588b;
            long j10 = cVar.f2587a;
            if (A.f2405a >= 21) {
                if (j9 == this.f9372o1) {
                    F0(lVar, i3);
                } else {
                    E e3 = this.f9378v1;
                    if (e3 != null) {
                        e3.c(j6, j9);
                    }
                    D0(lVar, i3, j9);
                }
                H0(j10);
                this.f9372o1 = j9;
            } else if (j10 >= 30000) {
                return false;
            } else {
                if (j10 > 11000) {
                    try {
                        Thread.sleep((j10 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                E e4 = this.f9378v1;
                if (e4 != null) {
                    e4.c(j6, j9);
                }
                C0(lVar, i3);
                H0(j10);
            }
            return true;
        } else {
            this.f3282s.getClass();
            long nanoTime = System.nanoTime();
            E e5 = this.f9378v1;
            if (e5 != null) {
                e5.c(j6, nanoTime);
            }
            if (A.f2405a >= 21) {
                D0(lVar, i3, nanoTime);
            } else {
                C0(lVar, i3);
            }
            H0(cVar.f2587a);
            return true;
        }
    }

    @Override // Y.AbstractC0135f
    public final String i() {
        return "MediaCodecVideoRenderer";
    }

    @Override // Y.AbstractC0135f
    public final boolean k() {
        if (this.f5884H0 && this.f9359a1 == null) {
            return true;
        }
        return false;
    }

    @Override // h0.v
    public final void k0() {
        super.k0();
        this.f9369l1 = 0;
    }

    @Override // h0.v, Y.AbstractC0135f
    public final boolean l() {
        boolean z3;
        n nVar;
        if (super.l() && this.f9359a1 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && (((nVar = this.e1) != null && this.f9362d1 == nVar) || this.f5905W == null || this.f9375s1)) {
            return true;
        }
        o oVar = this.f9354V0;
        if (z3 && oVar.f9392d == 3) {
            oVar.f9396h = -9223372036854775807L;
        } else if (oVar.f9396h == -9223372036854775807L) {
            return false;
        } else {
            oVar.f9399k.getClass();
            if (SystemClock.elapsedRealtime() >= oVar.f9396h) {
                oVar.f9396h = -9223372036854775807L;
                return false;
            }
        }
        return true;
    }

    @Override // h0.v, Y.AbstractC0135f
    public final void m() {
        C0171o c0171o = this.S0;
        this.q1 = null;
        C0855d c0855d = this.f9359a1;
        if (c0855d != null) {
            c0855d.f9320j.f9323b.c(0);
        } else {
            this.f9354V0.c(0);
        }
        A0();
        this.f9364g1 = false;
        this.f9377u1 = null;
        try {
            super.m();
            C0136g c0136g = this.f5891L0;
            c0171o.getClass();
            synchronized (c0136g) {
            }
            Handler handler = c0171o.f3774b;
            if (handler != null) {
                handler.post(new U.n(14, c0171o, c0136g));
            }
            c0171o.c(c0.f1879e);
        } catch (Throwable th) {
            c0171o.a(this.f5891L0);
            c0171o.c(c0.f1879e);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [Y.g, java.lang.Object] */
    @Override // Y.AbstractC0135f
    public final void n(boolean z3, boolean z4) {
        boolean z5;
        this.f5891L0 = new Object();
        k0 k0Var = this.f3279p;
        k0Var.getClass();
        boolean z6 = true;
        boolean z7 = k0Var.f3354b;
        if (z7 && this.f9376t1 == 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        AbstractC0123a.j(z5);
        if (this.f9375s1 != z7) {
            this.f9375s1 = z7;
            i0();
        }
        C0136g c0136g = this.f5891L0;
        C0171o c0171o = this.S0;
        Handler handler = c0171o.f3774b;
        if (handler != null) {
            handler.post(new t(c0171o, c0136g, 4));
        }
        boolean z8 = this.f9360b1;
        o oVar = this.f9354V0;
        if (!z8) {
            if ((this.f9361c1 != null || !this.f9351R0) && this.f9359a1 == null) {
                C c3 = new C(this.f9350Q0, oVar);
                U.v vVar = this.f3282s;
                vVar.getClass();
                c3.f3608f = vVar;
                AbstractC0123a.j(!c3.f3603a);
                if (((C0853b) c3.f3607e) == null) {
                    if (((C0852a) c3.f3606d) == null) {
                        c3.f3606d = new Object();
                    }
                    c3.f3607e = new C0853b((C0852a) c3.f3606d);
                }
                C0856e c0856e = new C0856e(c3);
                c3.f3603a = true;
                this.f9359a1 = c0856e.f9322a;
            }
            this.f9360b1 = true;
        }
        C0855d c0855d = this.f9359a1;
        if (c0855d != null) {
            C0558m c0558m = new C0558m(this, 15);
            H1.a aVar = H1.a.f437m;
            c0855d.f9318h = c0558m;
            c0855d.f9319i = aVar;
            E e2 = this.f9378v1;
            if (e2 != null) {
                c0855d.f9320j.f9329h = e2;
            }
            if (this.f9362d1 != null && !this.f9363f1.equals(U.u.f2480c)) {
                this.f9359a1.e(this.f9362d1, this.f9363f1);
            }
            C0855d c0855d2 = this.f9359a1;
            float f3 = this.f5903U;
            s sVar = c0855d2.f9320j.f9324c;
            sVar.getClass();
            if (f3 <= 0.0f) {
                z6 = false;
            }
            AbstractC0123a.e(z6);
            o oVar2 = sVar.f9423b;
            if (f3 != oVar2.f9398j) {
                oVar2.f9398j = f3;
                r rVar = oVar2.f9390b;
                rVar.f9413i = f3;
                rVar.f9417m = 0L;
                rVar.f9420p = -1L;
                rVar.f9418n = -1L;
                rVar.d(false);
            }
            List list = this.f9361c1;
            if (list != null) {
                C0855d c0855d3 = this.f9359a1;
                ArrayList arrayList = c0855d3.f9313c;
                if (!arrayList.equals(list)) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    c0855d3.c();
                }
            }
            this.f9359a1.f9320j.f9323b.f9392d = z4 ? 1 : 0;
            return;
        }
        U.v vVar2 = this.f3282s;
        vVar2.getClass();
        oVar.f9399k = vVar2;
        oVar.f9392d = z4 ? 1 : 0;
    }

    @Override // h0.v, Y.AbstractC0135f
    public final void o(long j3, boolean z3) {
        C0855d c0855d = this.f9359a1;
        if (c0855d != null) {
            c0855d.a(true);
            C0855d c0855d2 = this.f9359a1;
            long j4 = this.f5893M0.f5869c;
            c0855d2.getClass();
        }
        super.o(j3, z3);
        C0855d c0855d3 = this.f9359a1;
        o oVar = this.f9354V0;
        if (c0855d3 == null) {
            r rVar = oVar.f9390b;
            rVar.f9417m = 0L;
            rVar.f9420p = -1L;
            rVar.f9418n = -1L;
            oVar.f9395g = -9223372036854775807L;
            oVar.f9393e = -9223372036854775807L;
            oVar.c(1);
            oVar.f9396h = -9223372036854775807L;
        }
        if (z3) {
            oVar.b(false);
        }
        A0();
        this.f9368k1 = 0;
    }

    @Override // h0.v
    public final boolean o0(h0.o oVar) {
        if (this.f9362d1 == null && !E0(oVar)) {
            return false;
        }
        return true;
    }

    @Override // Y.AbstractC0135f
    public final void p() {
        C0855d c0855d = this.f9359a1;
        if (c0855d != null && this.f9351R0) {
            C0856e c0856e = c0855d.f9320j;
            if (c0856e.f9333l != 2) {
                x xVar = c0856e.f9330i;
                if (xVar != null) {
                    xVar.f2486a.removeCallbacksAndMessages(null);
                }
                c0856e.f9331j = null;
                c0856e.f9333l = 2;
            }
        }
    }

    @Override // Y.AbstractC0135f
    public final void q() {
        try {
            E();
            i0();
            C1.j jVar = this.f5899Q;
            if (jVar != null) {
                jVar.N(null);
            }
            this.f5899Q = null;
        } finally {
            this.f9360b1 = false;
            if (this.e1 != null) {
                B0();
            }
        }
    }

    @Override // h0.v
    public final int q0(h0.w wVar, C0113p c0113p) {
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (!G.k(c0113p.f1974m)) {
            return D2.h.e(0, 0, 0, 0);
        }
        if (c0113p.f1978q != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        Context context = this.f9350Q0;
        List w02 = w0(context, wVar, c0113p, z3, false);
        if (z3 && w02.isEmpty()) {
            w02 = w0(context, wVar, c0113p, false, false);
        }
        if (w02.isEmpty()) {
            return D2.h.e(1, 0, 0, 0);
        }
        int i8 = c0113p.f1960J;
        if (i8 != 0 && i8 != 2) {
            return D2.h.e(2, 0, 0, 0);
        }
        h0.o oVar = (h0.o) w02.get(0);
        boolean d3 = oVar.d(c0113p);
        if (!d3) {
            for (int i9 = 1; i9 < w02.size(); i9++) {
                h0.o oVar2 = (h0.o) w02.get(i9);
                if (oVar2.d(c0113p)) {
                    oVar = oVar2;
                    z4 = false;
                    d3 = true;
                    break;
                }
            }
        }
        z4 = true;
        if (d3) {
            i3 = 4;
        } else {
            i3 = 3;
        }
        if (oVar.e(c0113p)) {
            i4 = 16;
        } else {
            i4 = 8;
        }
        if (oVar.f5859g) {
            i5 = 64;
        } else {
            i5 = 0;
        }
        if (z4) {
            i6 = 128;
        } else {
            i6 = 0;
        }
        if (A.f2405a >= 26 && "video/dolby-vision".equals(c0113p.f1974m) && !j.a(context)) {
            i6 = 256;
        }
        if (d3) {
            List w03 = w0(context, wVar, c0113p, z3, true);
            if (!w03.isEmpty()) {
                Pattern pattern = h0.D.f5802a;
                ArrayList arrayList = new ArrayList(w03);
                Collections.sort(arrayList, new y(new B0.a(c0113p, 19)));
                h0.o oVar3 = (h0.o) arrayList.get(0);
                if (oVar3.d(c0113p) && oVar3.e(c0113p)) {
                    i7 = 32;
                }
            }
        }
        return i3 | i4 | i7 | i5 | i6;
    }

    @Override // Y.AbstractC0135f
    public final void r() {
        this.f9367j1 = 0;
        this.f3282s.getClass();
        this.f9366i1 = SystemClock.elapsedRealtime();
        this.f9370m1 = 0L;
        this.f9371n1 = 0;
        C0855d c0855d = this.f9359a1;
        if (c0855d != null) {
            c0855d.f9320j.f9323b.d();
        } else {
            this.f9354V0.d();
        }
    }

    @Override // Y.AbstractC0135f
    public final void s() {
        y0();
        int i3 = this.f9371n1;
        if (i3 != 0) {
            long j3 = this.f9370m1;
            C0171o c0171o = this.S0;
            Handler handler = c0171o.f3774b;
            if (handler != null) {
                handler.post(new t(c0171o, j3, i3));
            }
            this.f9370m1 = 0L;
            this.f9371n1 = 0;
        }
        C0855d c0855d = this.f9359a1;
        if (c0855d != null) {
            c0855d.f9320j.f9323b.e();
        } else {
            this.f9354V0.e();
        }
    }

    @Override // h0.v, Y.AbstractC0135f
    public final void v(long j3, long j4) {
        super.v(j3, j4);
        C0855d c0855d = this.f9359a1;
        if (c0855d != null) {
            try {
                c0855d.d(j3, j4);
            } catch (w e2) {
                throw f(e2, e2.f9438m, false, 7001);
            }
        }
    }

    @Override // h0.v, Y.AbstractC0135f
    public final void y(float f3, float f4) {
        boolean z3;
        super.y(f3, f4);
        C0855d c0855d = this.f9359a1;
        if (c0855d != null) {
            s sVar = c0855d.f9320j.f9324c;
            sVar.getClass();
            if (f3 > 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0123a.e(z3);
            o oVar = sVar.f9423b;
            if (f3 != oVar.f9398j) {
                oVar.f9398j = f3;
                r rVar = oVar.f9390b;
                rVar.f9413i = f3;
                rVar.f9417m = 0L;
                rVar.f9420p = -1L;
                rVar.f9418n = -1L;
                rVar.d(false);
                return;
            }
            return;
        }
        o oVar2 = this.f9354V0;
        if (f3 != oVar2.f9398j) {
            oVar2.f9398j = f3;
            r rVar2 = oVar2.f9390b;
            rVar2.f9413i = f3;
            rVar2.f9417m = 0L;
            rVar2.f9420p = -1L;
            rVar2.f9418n = -1L;
            rVar2.d(false);
        }
    }

    public final void y0() {
        if (this.f9367j1 > 0) {
            this.f3282s.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f9366i1;
            int i3 = this.f9367j1;
            C0171o c0171o = this.S0;
            Handler handler = c0171o.f3774b;
            if (handler != null) {
                handler.post(new t(c0171o, i3, j3));
            }
            this.f9367j1 = 0;
            this.f9366i1 = elapsedRealtime;
        }
    }

    public final void z0(c0 c0Var) {
        if (!c0Var.equals(c0.f1879e) && !c0Var.equals(this.q1)) {
            this.q1 = c0Var;
            this.S0.c(c0Var);
        }
    }
}
