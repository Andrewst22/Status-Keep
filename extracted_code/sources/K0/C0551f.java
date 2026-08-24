package k0;

import D1.I;
import D1.b0;
import U.AbstractC0123a;
import android.os.SystemClock;
import java.util.List;
import l0.C0588a;
import l0.C0589b;
import l0.C0590c;
import l0.C0591d;
/* renamed from: k0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0551f implements w0.o {

    /* renamed from: a  reason: collision with root package name */
    public final l0.i f7576a;

    /* renamed from: b  reason: collision with root package name */
    public final U.t f7577b;

    /* renamed from: c  reason: collision with root package name */
    public final U.t f7578c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7579d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f7580e;

    /* renamed from: f  reason: collision with root package name */
    public final f2.c f7581f;

    /* renamed from: g  reason: collision with root package name */
    public w0.q f7582g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7583h;

    /* renamed from: i  reason: collision with root package name */
    public volatile long f7584i;

    /* renamed from: j  reason: collision with root package name */
    public volatile int f7585j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7586k;

    /* renamed from: l  reason: collision with root package name */
    public long f7587l;

    /* renamed from: m  reason: collision with root package name */
    public long f7588m;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C0551f(C0555j c0555j, int i3) {
        char c3;
        l0.i c0591d;
        l0.i iVar;
        this.f7579d = i3;
        String str = c0555j.f7606c.f1974m;
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case -1606874997:
                if (str.equals("audio/amr-wb")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 1503095341:
                if (str.equals("audio/3gpp")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c3 = '\n';
                    break;
                }
                c3 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c3 = 11;
                    break;
                }
                c3 = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c3 = '\f';
                    break;
                }
                c3 = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c3 = '\r';
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
                c0591d = new C0591d(c0555j, 0);
                iVar = c0591d;
                break;
            case 1:
                c0591d = new l0.e(c0555j, 1);
                iVar = c0591d;
                break;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                c0591d = new C0590c(c0555j);
                iVar = c0591d;
                break;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                if (c0555j.f7608e.equals("MP4A-LATM")) {
                    c0591d = new l0.f(c0555j);
                } else {
                    c0591d = new C0588a(c0555j);
                }
                iVar = c0591d;
                break;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                c0591d = new C0589b(c0555j);
                iVar = c0591d;
                break;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
            case '\f':
            case '\r':
                c0591d = new l0.j(c0555j);
                iVar = c0591d;
                break;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                c0591d = new l0.g(c0555j);
                iVar = c0591d;
                break;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                c0591d = new l0.e(c0555j, 0);
                iVar = c0591d;
                break;
            case '\t':
                c0591d = new l0.h(c0555j);
                iVar = c0591d;
                break;
            case '\n':
                c0591d = new l0.k(c0555j);
                iVar = c0591d;
                break;
            case 11:
                c0591d = new C0591d(c0555j, 1);
                iVar = c0591d;
                break;
            default:
                iVar = null;
                break;
        }
        iVar.getClass();
        this.f7576a = iVar;
        this.f7577b = new U.t(65507);
        this.f7578c = new U.t();
        this.f7580e = new Object();
        this.f7581f = new f2.c();
        this.f7584i = -9223372036854775807L;
        this.f7585j = -1;
        this.f7587l = -9223372036854775807L;
        this.f7588m = -9223372036854775807L;
    }

    @Override // w0.o
    public final void b(long j3, long j4) {
        synchronized (this.f7580e) {
            try {
                if (!this.f7586k) {
                    this.f7586k = true;
                }
                this.f7587l = j3;
                this.f7588m = j4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w0.o
    public final w0.o d() {
        return this;
    }

    @Override // w0.o
    public final boolean e(w0.p pVar) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, k0.g] */
    @Override // w0.o
    public final int f(w0.p pVar, R.r rVar) {
        boolean z3;
        boolean z4;
        this.f7582g.getClass();
        int read = pVar.read(this.f7577b.f2477a, 0, 65507);
        if (read == -1) {
            return -1;
        }
        if (read == 0) {
            return 0;
        }
        this.f7577b.G(0);
        this.f7577b.F(read);
        U.t tVar = this.f7577b;
        C0553h c0553h = null;
        if (tVar.a() >= 12) {
            int u3 = tVar.u();
            byte b3 = (byte) (u3 >> 6);
            byte b4 = (byte) (u3 & 15);
            if (b3 == 2) {
                int u4 = tVar.u();
                if (((u4 >> 7) & 1) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                byte b5 = (byte) (u4 & 127);
                int A3 = tVar.A();
                long w3 = tVar.w();
                int h3 = tVar.h();
                byte[] bArr = C0553h.f7595g;
                if (b4 > 0) {
                    byte[] bArr2 = new byte[b4 * 4];
                    for (int i3 = 0; i3 < b4; i3++) {
                        tVar.f(bArr2, i3 * 4, 4);
                    }
                }
                byte[] bArr3 = new byte[tVar.a()];
                tVar.f(bArr3, 0, tVar.a());
                ?? obj = new Object();
                obj.f7594f = bArr;
                obj.f7589a = z3;
                obj.f7590b = b5;
                if (A3 >= 0 && A3 <= 65535) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                AbstractC0123a.e(z4);
                obj.f7591c = 65535 & A3;
                obj.f7592d = w3;
                obj.f7593e = h3;
                obj.f7594f = bArr3;
                c0553h = new C0553h(obj);
            }
        }
        if (c0553h == null) {
            return 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - 30;
        this.f7581f.c(c0553h, elapsedRealtime);
        C0553h d3 = this.f7581f.d(j3);
        if (d3 == null) {
            return 0;
        }
        if (!this.f7583h) {
            if (this.f7584i == -9223372036854775807L) {
                this.f7584i = d3.f7599d;
            }
            if (this.f7585j == -1) {
                this.f7585j = d3.f7598c;
            }
            this.f7576a.d(this.f7584i);
            this.f7583h = true;
        }
        synchronized (this.f7580e) {
            try {
                if (this.f7586k) {
                    if (this.f7587l != -9223372036854775807L && this.f7588m != -9223372036854775807L) {
                        this.f7581f.e();
                        this.f7576a.b(this.f7587l, this.f7588m);
                        this.f7586k = false;
                        this.f7587l = -9223372036854775807L;
                        this.f7588m = -9223372036854775807L;
                    }
                } else {
                    do {
                        U.t tVar2 = this.f7578c;
                        byte[] bArr4 = d3.f7601f;
                        tVar2.getClass();
                        tVar2.E(bArr4, bArr4.length);
                        this.f7576a.c(this.f7578c, d3.f7599d, d3.f7598c, d3.f7596a);
                        d3 = this.f7581f.d(j3);
                    } while (d3 != null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    @Override // w0.o
    public final void h(w0.q qVar) {
        this.f7576a.e(qVar, this.f7579d);
        qVar.s();
        qVar.n(new w0.s(-9223372036854775807L));
        this.f7582g = qVar;
    }

    @Override // w0.o
    public final List l() {
        D1.G g3 = I.f197n;
        return b0.f231q;
    }

    @Override // w0.o
    public final void release() {
    }
}
