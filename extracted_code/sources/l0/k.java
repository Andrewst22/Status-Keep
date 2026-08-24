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
/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: a  reason: collision with root package name */
    public final C0555j f8040a;

    /* renamed from: b  reason: collision with root package name */
    public G f8041b;

    /* renamed from: c  reason: collision with root package name */
    public long f8042c = -9223372036854775807L;

    /* renamed from: d  reason: collision with root package name */
    public int f8043d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f8044e = -1;

    /* renamed from: f  reason: collision with root package name */
    public long f8045f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    public long f8046g = 0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8047h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f8048i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f8049j;

    public k(C0555j c0555j) {
        this.f8040a = c0555j;
    }

    @Override // l0.i
    public final void b(long j3, long j4) {
        this.f8042c = j3;
        this.f8044e = -1;
        this.f8046g = j4;
    }

    @Override // l0.i
    public final void c(t tVar, long j3, int i3, boolean z3) {
        boolean z4;
        AbstractC0123a.k(this.f8041b);
        int u3 = tVar.u();
        if ((u3 & 16) == 16 && (u3 & 7) == 0) {
            if (this.f8047h && this.f8044e > 0) {
                G g3 = this.f8041b;
                g3.getClass();
                long j4 = this.f8045f;
                boolean z5 = this.f8048i;
                g3.b(j4, z5 ? 1 : 0, this.f8044e, 0, null);
                this.f8044e = -1;
                this.f8045f = -9223372036854775807L;
                this.f8047h = false;
            }
            this.f8047h = true;
        } else if (this.f8047h) {
            int a3 = C0553h.a(this.f8043d);
            if (i3 < a3) {
                int i4 = A.f2405a;
                Locale locale = Locale.US;
                AbstractC0123a.A("RtpVP8Reader", "Received RTP packet with unexpected sequence number. Expected: " + a3 + "; received: " + i3 + ". Dropping packet.");
                return;
            }
        } else {
            AbstractC0123a.A("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
            return;
        }
        if ((u3 & 128) != 0) {
            int u4 = tVar.u();
            if ((u4 & 128) != 0 && (tVar.u() & 128) != 0) {
                tVar.H(1);
            }
            if ((u4 & 64) != 0) {
                tVar.H(1);
            }
            if ((u4 & 32) != 0 || (16 & u4) != 0) {
                tVar.H(1);
            }
        }
        if (this.f8044e == -1 && this.f8047h) {
            if ((tVar.e() & 1) == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f8048i = z4;
        }
        if (!this.f8049j) {
            int i5 = tVar.f2478b;
            tVar.G(i5 + 6);
            int n3 = tVar.n() & 16383;
            int n4 = tVar.n() & 16383;
            tVar.G(i5);
            C0113p c0113p = this.f8040a.f7606c;
            if (n3 != c0113p.f1980s || n4 != c0113p.f1981t) {
                G g4 = this.f8041b;
                C0112o a4 = c0113p.a();
                a4.f1943r = n3;
                a4.f1944s = n4;
                D2.h.p(a4, g4);
            }
            this.f8049j = true;
        }
        int a5 = tVar.a();
        this.f8041b.f(a5, tVar);
        int i6 = this.f8044e;
        if (i6 == -1) {
            this.f8044e = a5;
        } else {
            this.f8044e = i6 + a5;
        }
        this.f8045f = AbstractC0155a.M(this.f8046g, j3, this.f8042c, 90000);
        if (z3) {
            G g5 = this.f8041b;
            g5.getClass();
            long j5 = this.f8045f;
            boolean z6 = this.f8048i;
            g5.b(j5, z6 ? 1 : 0, this.f8044e, 0, null);
            this.f8044e = -1;
            this.f8045f = -9223372036854775807L;
            this.f8047h = false;
        }
        this.f8043d = i3;
    }

    @Override // l0.i
    public final void d(long j3) {
        boolean z3;
        if (this.f8042c == -9223372036854775807L) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        this.f8042c = j3;
    }

    @Override // l0.i
    public final void e(q qVar, int i3) {
        G w3 = qVar.w(i3, 2);
        this.f8041b = w3;
        w3.c(this.f8040a.f7606c);
    }
}
