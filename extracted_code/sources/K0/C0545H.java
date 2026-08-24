package k0;

import U.AbstractC0123a;
import android.net.Uri;
import java.net.DatagramSocket;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
/* renamed from: k0.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0545H implements InterfaceC0549d {

    /* renamed from: m  reason: collision with root package name */
    public final W.D f7540m = new W.D(android.support.v4.media.session.a.i(8000));

    /* renamed from: n  reason: collision with root package name */
    public C0545H f7541n;

    @Override // W.h
    public final void close() {
        this.f7540m.close();
        C0545H c0545h = this.f7541n;
        if (c0545h != null) {
            c0545h.close();
        }
    }

    @Override // k0.InterfaceC0549d
    public final String f() {
        boolean z3;
        int l3 = l();
        if (l3 != -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        int i3 = U.A.f2405a;
        Locale locale = Locale.US;
        return D2.h.j(l3, 1 + l3, "RTP/AVP;unicast;client_port=", "-");
    }

    @Override // k0.InterfaceC0549d
    public final boolean g() {
        return true;
    }

    @Override // W.h
    public final long j(W.l lVar) {
        this.f7540m.j(lVar);
        return -1L;
    }

    @Override // k0.InterfaceC0549d
    public final int l() {
        int localPort;
        DatagramSocket datagramSocket = this.f7540m.f2729u;
        if (datagramSocket == null) {
            localPort = -1;
        } else {
            localPort = datagramSocket.getLocalPort();
        }
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // W.h
    public final Uri o() {
        return this.f7540m.f2728t;
    }

    @Override // R.InterfaceC0107j
    public final int read(byte[] bArr, int i3, int i4) {
        try {
            return this.f7540m.read(bArr, i3, i4);
        } catch (W.C e2) {
            if (e2.f2753m == 2002) {
                return -1;
            }
            throw e2;
        }
    }

    @Override // k0.InterfaceC0549d
    public final C0544G v() {
        return null;
    }

    @Override // W.h
    public final Map x() {
        return Collections.emptyMap();
    }

    @Override // W.h
    public final void y(W.B b3) {
        this.f7540m.y(b3);
    }
}
