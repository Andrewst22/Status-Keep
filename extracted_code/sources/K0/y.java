package k0;

import D1.b0;
import U.AbstractC0123a;
import g2.C0276a;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class y implements Closeable {

    /* renamed from: s  reason: collision with root package name */
    public static final Charset f7686s = C1.d.f153c;

    /* renamed from: m  reason: collision with root package name */
    public final C0276a f7687m;

    /* renamed from: n  reason: collision with root package name */
    public final s0.n f7688n = new s0.n("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* renamed from: o  reason: collision with root package name */
    public final Map f7689o = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: p  reason: collision with root package name */
    public x f7690p;

    /* renamed from: q  reason: collision with root package name */
    public Socket f7691q;

    /* renamed from: r  reason: collision with root package name */
    public volatile boolean f7692r;

    public y(C0276a c0276a) {
        this.f7687m = c0276a;
    }

    public final void a(Socket socket) {
        this.f7691q = socket;
        this.f7690p = new x(this, socket.getOutputStream());
        this.f7688n.f(new w(this, socket.getInputStream()), new C0558m(this, 3), 0);
    }

    public final void b(b0 b0Var) {
        AbstractC0123a.k(this.f7690p);
        x xVar = this.f7690p;
        xVar.getClass();
        xVar.f7684o.post(new U.n(xVar, new C1.f(z.f7700h).b(b0Var).getBytes(f7686s), b0Var, 9));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7692r) {
            return;
        }
        try {
            x xVar = this.f7690p;
            if (xVar != null) {
                xVar.close();
            }
            this.f7688n.e(null);
            Socket socket = this.f7691q;
            if (socket != null) {
                socket.close();
            }
            this.f7692r = true;
        } catch (Throwable th) {
            this.f7692r = true;
            throw th;
        }
    }
}
