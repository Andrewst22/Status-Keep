package W;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
/* loaded from: classes.dex */
public final class D extends AbstractC0126c {

    /* renamed from: q  reason: collision with root package name */
    public final int f2725q;

    /* renamed from: r  reason: collision with root package name */
    public final byte[] f2726r;

    /* renamed from: s  reason: collision with root package name */
    public final DatagramPacket f2727s;

    /* renamed from: t  reason: collision with root package name */
    public Uri f2728t;

    /* renamed from: u  reason: collision with root package name */
    public DatagramSocket f2729u;

    /* renamed from: v  reason: collision with root package name */
    public MulticastSocket f2730v;

    /* renamed from: w  reason: collision with root package name */
    public InetAddress f2731w;
    public boolean x;

    /* renamed from: y  reason: collision with root package name */
    public int f2732y;

    public D(int i3) {
        super(true);
        this.f2725q = i3;
        byte[] bArr = new byte[2000];
        this.f2726r = bArr;
        this.f2727s = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // W.h
    public final void close() {
        this.f2728t = null;
        MulticastSocket multicastSocket = this.f2730v;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f2731w;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f2730v = null;
        }
        DatagramSocket datagramSocket = this.f2729u;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f2729u = null;
        }
        this.f2731w = null;
        this.f2732y = 0;
        if (this.x) {
            this.x = false;
            b();
        }
    }

    @Override // W.h
    public final long j(l lVar) {
        Uri uri = lVar.f2767a;
        this.f2728t = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f2728t.getPort();
        e();
        try {
            this.f2731w = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f2731w, port);
            if (this.f2731w.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f2730v = multicastSocket;
                multicastSocket.joinGroup(this.f2731w);
                this.f2729u = this.f2730v;
            } else {
                this.f2729u = new DatagramSocket(inetSocketAddress);
            }
            this.f2729u.setSoTimeout(this.f2725q);
            this.x = true;
            h(lVar);
            return -1L;
        } catch (IOException e2) {
            throw new i(e2, 2001);
        } catch (SecurityException e3) {
            throw new i(e3, 2006);
        }
    }

    @Override // W.h
    public final Uri o() {
        return this.f2728t;
    }

    @Override // R.InterfaceC0107j
    public final int read(byte[] bArr, int i3, int i4) {
        if (i4 == 0) {
            return 0;
        }
        int i5 = this.f2732y;
        DatagramPacket datagramPacket = this.f2727s;
        if (i5 == 0) {
            try {
                DatagramSocket datagramSocket = this.f2729u;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f2732y = length;
                a(length);
            } catch (SocketTimeoutException e2) {
                throw new i(e2, 2002);
            } catch (IOException e3) {
                throw new i(e3, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i6 = this.f2732y;
        int min = Math.min(i6, i4);
        System.arraycopy(this.f2726r, length2 - i6, bArr, i3, min);
        this.f2732y -= min;
        return min;
    }
}
