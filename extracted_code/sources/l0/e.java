package l0;

import R.H;
import U.A;
import U.AbstractC0123a;
import U.t;
import a.AbstractC0155a;
import java.util.Locale;
import java.util.TreeMap;
import k0.C0553h;
import k0.C0555j;
import w0.G;
import w0.q;
/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8003a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8004b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8005c;

    /* renamed from: d  reason: collision with root package name */
    public Object f8006d;

    /* renamed from: e  reason: collision with root package name */
    public Object f8007e;

    /* renamed from: f  reason: collision with root package name */
    public int f8008f;

    /* renamed from: g  reason: collision with root package name */
    public long f8009g;

    /* renamed from: h  reason: collision with root package name */
    public int f8010h;

    /* renamed from: i  reason: collision with root package name */
    public int f8011i;

    /* renamed from: j  reason: collision with root package name */
    public long f8012j;

    public e(String str, String str2, long j3, int i3, int i4, int i5, int[] iArr, TreeMap treeMap) {
        this.f8003a = 2;
        this.f8004b = str;
        this.f8005c = str2;
        this.f8009g = j3;
        this.f8012j = 0L;
        this.f8008f = i3;
        this.f8010h = i4;
        this.f8011i = i5;
        this.f8006d = iArr;
        this.f8007e = treeMap;
    }

    @Override // l0.i
    public void b(long j3, long j4) {
        switch (this.f8003a) {
            case 0:
                this.f8009g = j3;
                this.f8011i = 0;
                this.f8012j = j4;
                return;
            default:
                this.f8009g = j3;
                this.f8011i = 0;
                this.f8012j = j4;
                return;
        }
    }

    @Override // l0.i
    public void c(t tVar, long j3, int i3, boolean z3) {
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        boolean z6;
        boolean z7;
        int i6;
        Object obj = this.f8004b;
        int i7 = 1;
        switch (this.f8003a) {
            case 0:
                try {
                    int i8 = tVar.f2477a[0] & 31;
                    AbstractC0123a.k((G) this.f8007e);
                    if (i8 > 0 && i8 < 24) {
                        int a3 = tVar.a();
                        this.f8011i = g() + this.f8011i;
                        ((G) this.f8007e).f(a3, tVar);
                        this.f8011i += a3;
                        if ((tVar.f2477a[0] & 31) == 5) {
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                        this.f8008f = i5;
                    } else if (i8 == 24) {
                        tVar.u();
                        while (tVar.a() > 4) {
                            int A3 = tVar.A();
                            this.f8011i = g() + this.f8011i;
                            ((G) this.f8007e).f(A3, tVar);
                            this.f8011i += A3;
                        }
                        this.f8008f = 0;
                    } else if (i8 == 28) {
                        byte[] bArr = tVar.f2477a;
                        byte b3 = bArr[0];
                        byte b4 = bArr[1];
                        int i9 = (b3 & 224) | (b4 & 31);
                        if ((b4 & 128) > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if ((b4 & 64) > 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        t tVar2 = (t) obj;
                        if (z4) {
                            this.f8011i = g() + this.f8011i;
                            byte[] bArr2 = tVar.f2477a;
                            bArr2[1] = (byte) i9;
                            tVar2.getClass();
                            tVar2.E(bArr2, bArr2.length);
                            tVar2.G(1);
                        } else {
                            int a4 = C0553h.a(this.f8010h);
                            if (i3 != a4) {
                                int i10 = A.f2405a;
                                Locale locale = Locale.US;
                                AbstractC0123a.A("RtpH264Reader", "Received RTP packet with unexpected sequence number. Expected: " + a4 + "; received: " + i3 + ". Dropping packet.");
                            } else {
                                byte[] bArr3 = tVar.f2477a;
                                tVar2.getClass();
                                tVar2.E(bArr3, bArr3.length);
                                tVar2.G(2);
                            }
                        }
                        int a5 = tVar2.a();
                        ((G) this.f8007e).f(a5, tVar2);
                        this.f8011i += a5;
                        if (z5) {
                            if ((i9 & 31) == 5) {
                                i4 = 1;
                            } else {
                                i4 = 0;
                            }
                            this.f8008f = i4;
                        }
                    } else {
                        throw H.b(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i8)), null);
                    }
                    if (z3) {
                        if (this.f8009g == -9223372036854775807L) {
                            this.f8009g = j3;
                        }
                        ((G) this.f8007e).b(AbstractC0155a.M(this.f8012j, j3, this.f8009g, 90000), this.f8008f, this.f8011i, 0, null);
                        this.f8011i = 0;
                    }
                    this.f8010h = i3;
                    return;
                } catch (IndexOutOfBoundsException e2) {
                    throw H.b(null, e2);
                }
            default:
                byte[] bArr4 = tVar.f2477a;
                if (bArr4.length != 0) {
                    int i11 = (bArr4[0] >> 1) & 63;
                    AbstractC0123a.k((G) this.f8007e);
                    t tVar3 = (t) this.f8005c;
                    if (i11 >= 0 && i11 < 48) {
                        int a6 = tVar.a();
                        int i12 = this.f8011i;
                        tVar3.G(0);
                        int a7 = tVar3.a();
                        G g3 = (G) this.f8007e;
                        g3.getClass();
                        g3.f(a7, tVar3);
                        this.f8011i = a7 + i12;
                        ((G) this.f8007e).f(a6, tVar);
                        this.f8011i += a6;
                        int i13 = (tVar.f2477a[0] >> 1) & 63;
                        if (i13 != 19 && i13 != 20) {
                            i7 = 0;
                        }
                        this.f8008f = i7;
                    } else if (i11 != 48) {
                        if (i11 == 49) {
                            byte[] bArr5 = tVar.f2477a;
                            if (bArr5.length >= 3) {
                                int i14 = bArr5[1] & 7;
                                byte b5 = bArr5[2];
                                int i15 = b5 & 63;
                                if ((b5 & 128) > 0) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if ((b5 & 64) > 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                t tVar4 = (t) obj;
                                if (z6) {
                                    int i16 = this.f8011i;
                                    tVar3.G(0);
                                    int a8 = tVar3.a();
                                    G g4 = (G) this.f8007e;
                                    g4.getClass();
                                    g4.f(a8, tVar3);
                                    this.f8011i = a8 + i16;
                                    byte[] bArr6 = tVar.f2477a;
                                    bArr6[1] = (byte) ((i15 << 1) & 127);
                                    bArr6[2] = (byte) i14;
                                    tVar4.getClass();
                                    tVar4.E(bArr6, bArr6.length);
                                    tVar4.G(1);
                                } else {
                                    int i17 = (this.f8010h + 1) % 65535;
                                    if (i3 != i17) {
                                        int i18 = A.f2405a;
                                        Locale locale2 = Locale.US;
                                        AbstractC0123a.A("RtpH265Reader", "Received RTP packet with unexpected sequence number. Expected: " + i17 + "; received: " + i3 + ". Dropping packet.");
                                    } else {
                                        tVar4.getClass();
                                        tVar4.E(bArr5, bArr5.length);
                                        tVar4.G(3);
                                    }
                                }
                                int a9 = tVar4.a();
                                ((G) this.f8007e).f(a9, tVar4);
                                this.f8011i += a9;
                                if (z7) {
                                    if (i15 != 19 && i15 != 20) {
                                        i6 = 0;
                                    } else {
                                        i6 = 1;
                                    }
                                    this.f8008f = i6;
                                }
                            } else {
                                throw H.b("Malformed FU header.", null);
                            }
                        } else {
                            throw H.b(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i11)), null);
                        }
                    } else {
                        throw new UnsupportedOperationException("need to implement processAggregationPacket");
                    }
                    if (z3) {
                        if (this.f8009g == -9223372036854775807L) {
                            this.f8009g = j3;
                        }
                        ((G) this.f8007e).b(AbstractC0155a.M(this.f8012j, j3, this.f8009g, 90000), this.f8008f, this.f8011i, 0, null);
                        this.f8011i = 0;
                    }
                    this.f8010h = i3;
                    return;
                }
                throw H.b("Empty RTP data packet.", null);
        }
    }

    @Override // l0.i
    public void d(long j3) {
        int i3 = this.f8003a;
    }

    @Override // l0.i
    public void e(q qVar, int i3) {
        switch (this.f8003a) {
            case 0:
                G w3 = qVar.w(i3, 2);
                this.f8007e = w3;
                int i4 = A.f2405a;
                w3.c(((C0555j) this.f8006d).f7606c);
                return;
            default:
                G w4 = qVar.w(i3, 2);
                this.f8007e = w4;
                w4.c(((C0555j) this.f8006d).f7606c);
                return;
        }
    }

    public int g() {
        t tVar = (t) this.f8005c;
        tVar.G(0);
        int a3 = tVar.a();
        G g3 = (G) this.f8007e;
        g3.getClass();
        g3.f(a3, tVar);
        return a3;
    }

    public e(C0555j c0555j, int i3) {
        this.f8003a = i3;
        switch (i3) {
            case 1:
                this.f8004b = new t();
                this.f8005c = new t(V.g.f2652a);
                this.f8006d = c0555j;
                this.f8009g = -9223372036854775807L;
                this.f8010h = -1;
                return;
            default:
                this.f8005c = new t(V.g.f2652a);
                this.f8006d = c0555j;
                this.f8004b = new t();
                this.f8009g = -9223372036854775807L;
                this.f8010h = -1;
                return;
        }
    }

    private final void a(long j3) {
    }

    private final void f(long j3) {
    }
}
