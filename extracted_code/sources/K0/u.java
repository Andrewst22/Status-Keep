package k0;

import R.C0119w;
import R.C0122z;
import R.T;
import android.net.Uri;
import java.util.ArrayList;
import javax.net.SocketFactory;
import o0.AbstractC0677a;
import o0.C0701z;
import o0.InterfaceC0699x;
import o0.Y;
/* loaded from: classes.dex */
public final class u extends AbstractC0677a {

    /* renamed from: A  reason: collision with root package name */
    public boolean f7668A;

    /* renamed from: B  reason: collision with root package name */
    public C0122z f7669B;

    /* renamed from: t  reason: collision with root package name */
    public final e0.l f7670t;

    /* renamed from: u  reason: collision with root package name */
    public final String f7671u = "AndroidXMedia3/1.4.1";

    /* renamed from: v  reason: collision with root package name */
    public final Uri f7672v;

    /* renamed from: w  reason: collision with root package name */
    public final SocketFactory f7673w;
    public long x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f7674y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f7675z;

    static {
        R.A.a("media3.exoplayer.rtsp");
    }

    public u(C0122z c0122z, e0.l lVar, SocketFactory socketFactory) {
        this.f7669B = c0122z;
        this.f7670t = lVar;
        C0119w c0119w = c0122z.f2008b;
        c0119w.getClass();
        this.f7672v = c0119w.f2001a;
        this.f7673w = socketFactory;
        this.x = -9223372036854775807L;
        this.f7668A = true;
    }

    @Override // o0.AbstractC0677a
    public final InterfaceC0699x b(C0701z c0701z, s0.e eVar, long j3) {
        C0558m c0558m = new C0558m(this, 2);
        return new r(eVar, this.f7670t, this.f7672v, c0558m, this.f7671u, this.f7673w);
    }

    @Override // o0.AbstractC0677a
    public final synchronized C0122z k() {
        return this.f7669B;
    }

    @Override // o0.AbstractC0677a
    public final void o(W.B b3) {
        w();
    }

    @Override // o0.AbstractC0677a
    public final void q(InterfaceC0699x interfaceC0699x) {
        r rVar = (r) interfaceC0699x;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = rVar.f7658q;
            if (i3 < arrayList.size()) {
                q qVar = (q) arrayList.get(i3);
                if (!qVar.f7644e) {
                    qVar.f7641b.e(null);
                    qVar.f7642c.C();
                    qVar.f7644e = true;
                }
                i3++;
            } else {
                U.A.h(rVar.f7657p);
                rVar.f7649D = true;
                return;
            }
        }
    }

    @Override // o0.AbstractC0677a
    public final synchronized void v(C0122z c0122z) {
        this.f7669B = c0122z;
    }

    public final void w() {
        T y3 = new Y(this.x, this.f7674y, this.f7675z, k());
        if (this.f7668A) {
            y3 = new s(y3, 0);
        }
        p(y3);
    }

    @Override // o0.AbstractC0677a
    public final void m() {
    }

    @Override // o0.AbstractC0677a
    public final void s() {
    }
}
