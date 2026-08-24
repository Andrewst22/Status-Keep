package l0;

import R.C0112o;
import U.A;
import U.AbstractC0123a;
import U.t;
import a.AbstractC0155a;
import java.util.ArrayList;
import java.util.Locale;
import k0.C0553h;
import k0.C0555j;
import w0.AbstractC0892b;
import w0.G;
import w0.q;
/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: a  reason: collision with root package name */
    public final C0555j f8028a;

    /* renamed from: b  reason: collision with root package name */
    public G f8029b;

    /* renamed from: d  reason: collision with root package name */
    public long f8031d;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8033f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8034g;

    /* renamed from: c  reason: collision with root package name */
    public long f8030c = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f8032e = -1;

    public h(C0555j c0555j) {
        this.f8028a = c0555j;
    }

    @Override // l0.i
    public final void b(long j3, long j4) {
        this.f8030c = j3;
        this.f8031d = j4;
    }

    @Override // l0.i
    public final void c(t tVar, long j3, int i3, boolean z3) {
        boolean z4;
        AbstractC0123a.k(this.f8029b);
        boolean z5 = false;
        if (!this.f8033f) {
            int i4 = tVar.f2478b;
            if (tVar.f2479c > 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            AbstractC0123a.d("ID Header has insufficient data", z4);
            AbstractC0123a.d("ID Header missing", tVar.s(8, C1.d.f153c).equals("OpusHead"));
            if (tVar.u() == 1) {
                z5 = true;
            }
            AbstractC0123a.d("version number must always be 1", z5);
            tVar.G(i4);
            ArrayList c3 = AbstractC0892b.c(tVar.f2477a);
            C0112o a3 = this.f8028a.f7606c.a();
            a3.f1940o = c3;
            D2.h.p(a3, this.f8029b);
            this.f8033f = true;
        } else if (!this.f8034g) {
            if (tVar.f2479c >= 8) {
                z5 = true;
            }
            AbstractC0123a.d("Comment Header has insufficient data", z5);
            AbstractC0123a.d("Comment Header should follow ID Header", tVar.s(8, C1.d.f153c).equals("OpusTags"));
            this.f8034g = true;
        } else {
            int a4 = C0553h.a(this.f8032e);
            if (i3 != a4) {
                int i5 = A.f2405a;
                Locale locale = Locale.US;
                AbstractC0123a.A("RtpOpusReader", "Received RTP packet with unexpected sequence number. Expected: " + a4 + "; received: " + i3 + ".");
            }
            int a5 = tVar.a();
            this.f8029b.f(a5, tVar);
            this.f8029b.b(AbstractC0155a.M(this.f8031d, j3, this.f8030c, 48000), 1, a5, 0, null);
        }
        this.f8032e = i3;
    }

    @Override // l0.i
    public final void d(long j3) {
        this.f8030c = j3;
    }

    @Override // l0.i
    public final void e(q qVar, int i3) {
        G w3 = qVar.w(i3, 1);
        this.f8029b = w3;
        w3.c(this.f8028a.f7606c);
    }
}
