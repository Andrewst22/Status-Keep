package l0;

import U.A;
import U.AbstractC0123a;
import U.t;
import a.AbstractC0155a;
import java.util.Locale;
import k0.C0553h;
import k0.C0555j;
import w0.G;
import w0.q;
/* renamed from: l0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0590c implements i {

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f7981h = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f7982i = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: a  reason: collision with root package name */
    public final C0555j f7983a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f7984b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7985c;

    /* renamed from: d  reason: collision with root package name */
    public G f7986d;

    /* renamed from: e  reason: collision with root package name */
    public long f7987e;

    /* renamed from: f  reason: collision with root package name */
    public long f7988f;

    /* renamed from: g  reason: collision with root package name */
    public int f7989g;

    public C0590c(C0555j c0555j) {
        this.f7983a = c0555j;
        String str = c0555j.f7606c.f1974m;
        str.getClass();
        this.f7984b = "audio/amr-wb".equals(str);
        this.f7985c = c0555j.f7605b;
        this.f7987e = -9223372036854775807L;
        this.f7989g = -1;
        this.f7988f = 0L;
    }

    @Override // l0.i
    public final void b(long j3, long j4) {
        this.f7987e = j3;
        this.f7988f = j4;
    }

    @Override // l0.i
    public final void c(t tVar, long j3, int i3, boolean z3) {
        boolean z4;
        String str;
        int i4;
        int a3;
        AbstractC0123a.k(this.f7986d);
        int i5 = this.f7989g;
        if (i5 != -1 && i3 != (a3 = C0553h.a(i5))) {
            int i6 = A.f2405a;
            Locale locale = Locale.US;
            AbstractC0123a.A("RtpAmrReader", "Received RTP packet with unexpected sequence number. Expected: " + a3 + "; received: " + i3 + ".");
        }
        boolean z5 = true;
        tVar.H(1);
        int e2 = (tVar.e() >> 3) & 15;
        if ((e2 >= 0 && e2 <= 8) || e2 == 15) {
            z4 = true;
        } else {
            z4 = false;
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        boolean z6 = this.f7984b;
        if (z6) {
            str = "WB";
        } else {
            str = "NB";
        }
        sb.append(str);
        sb.append(" frame type ");
        sb.append(e2);
        AbstractC0123a.d(sb.toString(), z4);
        if (z6) {
            i4 = f7982i[e2];
        } else {
            i4 = f7981h[e2];
        }
        int a4 = tVar.a();
        if (a4 != i4) {
            z5 = false;
        }
        AbstractC0123a.d("compound payload not supported currently", z5);
        this.f7986d.f(a4, tVar);
        this.f7986d.b(AbstractC0155a.M(this.f7988f, j3, this.f7987e, this.f7985c), 1, a4, 0, null);
        this.f7989g = i3;
    }

    @Override // l0.i
    public final void d(long j3) {
        this.f7987e = j3;
    }

    @Override // l0.i
    public final void e(q qVar, int i3) {
        G w3 = qVar.w(i3, 1);
        this.f7986d = w3;
        w3.c(this.f7983a.f7606c);
    }
}
