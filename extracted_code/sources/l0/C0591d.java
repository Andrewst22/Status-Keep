package l0;

import R.C0112o;
import R.C0113p;
import U.A;
import U.AbstractC0123a;
import U.t;
import a.AbstractC0155a;
import java.util.Locale;
import k0.C0553h;
import k0.C0555j;
import w0.G;
import w0.q;
/* renamed from: l0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0591d implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7990a;

    /* renamed from: b  reason: collision with root package name */
    public final C0555j f7991b;

    /* renamed from: c  reason: collision with root package name */
    public G f7992c;

    /* renamed from: d  reason: collision with root package name */
    public long f7993d;

    /* renamed from: e  reason: collision with root package name */
    public long f7994e;

    /* renamed from: f  reason: collision with root package name */
    public int f7995f;

    /* renamed from: g  reason: collision with root package name */
    public int f7996g;

    /* renamed from: h  reason: collision with root package name */
    public long f7997h;

    /* renamed from: i  reason: collision with root package name */
    public int f7998i;

    /* renamed from: j  reason: collision with root package name */
    public int f7999j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8000k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f8001l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f8002m;

    public C0591d(C0555j c0555j, int i3) {
        this.f7990a = i3;
        switch (i3) {
            case 1:
                this.f7991b = c0555j;
                this.f7993d = -9223372036854775807L;
                this.f7996g = -1;
                this.f7997h = -9223372036854775807L;
                this.f7994e = 0L;
                this.f7995f = -1;
                this.f7998i = -1;
                this.f7999j = -1;
                return;
            default:
                this.f7991b = c0555j;
                this.f7993d = -9223372036854775807L;
                this.f7996g = -1;
                return;
        }
    }

    @Override // l0.i
    public final void b(long j3, long j4) {
        switch (this.f7990a) {
            case 0:
                this.f7993d = j3;
                this.f7995f = 0;
                this.f7994e = j4;
                return;
            default:
                this.f7993d = j3;
                this.f7996g = -1;
                this.f7994e = j4;
                return;
        }
    }

    @Override // l0.i
    public final void c(t tVar, long j3, int i3, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        int i4;
        int i5;
        boolean z7;
        C0555j c0555j = this.f7991b;
        switch (this.f7990a) {
            case 0:
                AbstractC0123a.k(this.f7992c);
                int i6 = tVar.f2478b;
                int A3 = tVar.A();
                if ((A3 & 1024) > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((A3 & 512) == 0 && (A3 & 504) == 0 && (A3 & 7) == 0) {
                    if (z4) {
                        if (this.f8002m && this.f7995f > 0) {
                            G g3 = this.f7992c;
                            g3.getClass();
                            g3.b(this.f7997h, this.f8000k ? 1 : 0, this.f7995f, 0, null);
                            this.f7995f = 0;
                            this.f7997h = -9223372036854775807L;
                            this.f8000k = false;
                            this.f8002m = false;
                        }
                        this.f8002m = true;
                        if ((tVar.e() & 252) < 128) {
                            AbstractC0123a.A("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                            return;
                        }
                        byte[] bArr = tVar.f2477a;
                        bArr[i6] = 0;
                        bArr[i6 + 1] = 0;
                        tVar.G(i6);
                    } else if (this.f8002m) {
                        int a3 = C0553h.a(this.f7996g);
                        if (i3 < a3) {
                            int i7 = A.f2405a;
                            Locale locale = Locale.US;
                            AbstractC0123a.A("RtpH263Reader", "Received RTP packet with unexpected sequence number. Expected: " + a3 + "; received: " + i3 + ". Dropping packet.");
                            return;
                        }
                    } else {
                        AbstractC0123a.A("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                        return;
                    }
                    if (this.f7995f == 0) {
                        boolean z8 = this.f8001l;
                        int i8 = tVar.f2478b;
                        if (((tVar.w() >> 10) & 63) == 32) {
                            int e2 = tVar.e();
                            int i9 = (e2 >> 1) & 1;
                            if (!z8 && i9 == 0) {
                                int i10 = (e2 >> 2) & 7;
                                if (i10 == 1) {
                                    this.f7998i = 128;
                                    this.f7999j = 96;
                                } else {
                                    int i11 = i10 - 2;
                                    this.f7998i = 176 << i11;
                                    this.f7999j = 144 << i11;
                                }
                            }
                            tVar.G(i8);
                            if (i9 == 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            this.f8000k = z5;
                        } else {
                            tVar.G(i8);
                            this.f8000k = false;
                        }
                        if (!this.f8001l && this.f8000k) {
                            int i12 = this.f7998i;
                            C0113p c0113p = c0555j.f7606c;
                            if (i12 != c0113p.f1980s || this.f7999j != c0113p.f1981t) {
                                G g4 = this.f7992c;
                                C0112o a4 = c0113p.a();
                                a4.f1943r = this.f7998i;
                                a4.f1944s = this.f7999j;
                                D2.h.p(a4, g4);
                            }
                            this.f8001l = true;
                        }
                    }
                    int a5 = tVar.a();
                    this.f7992c.f(a5, tVar);
                    this.f7995f += a5;
                    this.f7997h = AbstractC0155a.M(this.f7994e, j3, this.f7993d, 90000);
                    if (z3) {
                        G g5 = this.f7992c;
                        g5.getClass();
                        g5.b(this.f7997h, this.f8000k ? 1 : 0, this.f7995f, 0, null);
                        this.f7995f = 0;
                        this.f7997h = -9223372036854775807L;
                        this.f8000k = false;
                        this.f8002m = false;
                    }
                    this.f7996g = i3;
                    return;
                }
                AbstractC0123a.A("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
                return;
            default:
                AbstractC0123a.k(this.f7992c);
                int u3 = tVar.u();
                if ((u3 & 8) == 8) {
                    if (this.f8000k && this.f7996g > 0) {
                        G g6 = this.f7992c;
                        g6.getClass();
                        g6.b(this.f7997h, this.f8002m ? 1 : 0, this.f7996g, 0, null);
                        this.f7996g = -1;
                        this.f7997h = -9223372036854775807L;
                        this.f8000k = false;
                    }
                    this.f8000k = true;
                } else if (this.f8000k) {
                    int a6 = C0553h.a(this.f7995f);
                    if (i3 < a6) {
                        int i13 = A.f2405a;
                        Locale locale2 = Locale.US;
                        AbstractC0123a.A("RtpVp9Reader", "Received RTP packet with unexpected sequence number. Expected: " + a6 + "; received: " + i3 + ". Dropping packet.");
                        return;
                    }
                } else {
                    AbstractC0123a.A("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                    return;
                }
                if ((u3 & 128) == 0 || (tVar.u() & 128) == 0 || tVar.a() >= 1) {
                    int i14 = u3 & 16;
                    if (i14 == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    AbstractC0123a.d("VP9 flexible mode is not supported.", z6);
                    if ((u3 & 32) != 0) {
                        tVar.H(1);
                        if (tVar.a() >= 1) {
                            if (i14 == 0) {
                                tVar.H(1);
                            }
                        } else {
                            return;
                        }
                    }
                    if ((u3 & 2) != 0) {
                        int u4 = tVar.u();
                        int i15 = (u4 >> 5) & 7;
                        if ((u4 & 16) != 0) {
                            int i16 = i15 + 1;
                            if (tVar.a() >= i16 * 4) {
                                for (int i17 = 0; i17 < i16; i17++) {
                                    this.f7998i = tVar.A();
                                    this.f7999j = tVar.A();
                                }
                            } else {
                                return;
                            }
                        }
                        if ((u4 & 8) != 0) {
                            int u5 = tVar.u();
                            if (tVar.a() >= u5) {
                                for (int i18 = 0; i18 < u5; i18++) {
                                    int A4 = (tVar.A() & 12) >> 2;
                                    if (tVar.a() >= A4) {
                                        tVar.H(A4);
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                    }
                    if (this.f7996g == -1 && this.f8000k) {
                        if ((tVar.e() & 4) == 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        this.f8002m = z7;
                    }
                    if (!this.f8001l && (i4 = this.f7998i) != -1 && (i5 = this.f7999j) != -1) {
                        C0113p c0113p2 = c0555j.f7606c;
                        if (i4 != c0113p2.f1980s || i5 != c0113p2.f1981t) {
                            G g7 = this.f7992c;
                            C0112o a7 = c0113p2.a();
                            a7.f1943r = this.f7998i;
                            a7.f1944s = this.f7999j;
                            D2.h.p(a7, g7);
                        }
                        this.f8001l = true;
                    }
                    int a8 = tVar.a();
                    this.f7992c.f(a8, tVar);
                    int i19 = this.f7996g;
                    if (i19 == -1) {
                        this.f7996g = a8;
                    } else {
                        this.f7996g = i19 + a8;
                    }
                    this.f7997h = AbstractC0155a.M(this.f7994e, j3, this.f7993d, 90000);
                    if (z3) {
                        G g8 = this.f7992c;
                        g8.getClass();
                        g8.b(this.f7997h, this.f8002m ? 1 : 0, this.f7996g, 0, null);
                        this.f7996g = -1;
                        this.f7997h = -9223372036854775807L;
                        this.f8000k = false;
                    }
                    this.f7995f = i3;
                    return;
                }
                return;
        }
    }

    @Override // l0.i
    public final void d(long j3) {
        boolean z3;
        boolean z4;
        switch (this.f7990a) {
            case 0:
                if (this.f7993d == -9223372036854775807L) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                AbstractC0123a.j(z3);
                this.f7993d = j3;
                return;
            default:
                if (this.f7993d == -9223372036854775807L) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                AbstractC0123a.j(z4);
                this.f7993d = j3;
                return;
        }
    }

    @Override // l0.i
    public final void e(q qVar, int i3) {
        switch (this.f7990a) {
            case 0:
                G w3 = qVar.w(i3, 2);
                this.f7992c = w3;
                w3.c(this.f7991b.f7606c);
                return;
            default:
                G w4 = qVar.w(i3, 2);
                this.f7992c = w4;
                w4.c(this.f7991b.f7606c);
                return;
        }
    }
}
