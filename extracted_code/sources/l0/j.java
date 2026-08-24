package l0;

import U.A;
import U.t;
import a.AbstractC0155a;
import android.util.Log;
import java.util.Locale;
import k0.C0553h;
import k0.C0555j;
import w0.G;
import w0.q;
/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: a  reason: collision with root package name */
    public final C0555j f8035a;

    /* renamed from: b  reason: collision with root package name */
    public G f8036b;

    /* renamed from: c  reason: collision with root package name */
    public long f8037c = -9223372036854775807L;

    /* renamed from: d  reason: collision with root package name */
    public long f8038d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f8039e = -1;

    public j(C0555j c0555j) {
        this.f8035a = c0555j;
    }

    @Override // l0.i
    public final void b(long j3, long j4) {
        this.f8037c = j3;
        this.f8038d = j4;
    }

    @Override // l0.i
    public final void c(t tVar, long j3, int i3, boolean z3) {
        int a3;
        this.f8036b.getClass();
        int i4 = this.f8039e;
        if (i4 != -1 && i3 != (a3 = C0553h.a(i4))) {
            int i5 = A.f2405a;
            Locale locale = Locale.US;
            Log.w("RtpPcmReader", "Received RTP packet with unexpected sequence number. Expected: " + a3 + "; received: " + i3 + ".");
        }
        long M3 = AbstractC0155a.M(this.f8038d, j3, this.f8037c, this.f8035a.f7605b);
        int a4 = tVar.a();
        this.f8036b.f(a4, tVar);
        this.f8036b.b(M3, 1, a4, 0, null);
        this.f8039e = i3;
    }

    @Override // l0.i
    public final void d(long j3) {
        this.f8037c = j3;
    }

    @Override // l0.i
    public final void e(q qVar, int i3) {
        G w3 = qVar.w(i3, 1);
        this.f8036b = w3;
        w3.c(this.f8035a.f7606c);
    }
}
