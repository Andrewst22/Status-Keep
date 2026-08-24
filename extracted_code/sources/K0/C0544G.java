package k0;

import U.AbstractC0123a;
import W.AbstractC0126c;
import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* renamed from: k0.G  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0544G extends AbstractC0126c implements InterfaceC0549d {

    /* renamed from: q  reason: collision with root package name */
    public final LinkedBlockingQueue f7536q;

    /* renamed from: r  reason: collision with root package name */
    public final long f7537r;

    /* renamed from: s  reason: collision with root package name */
    public byte[] f7538s;

    /* renamed from: t  reason: collision with root package name */
    public int f7539t;

    public C0544G() {
        super(true);
        this.f7537r = 8000L;
        this.f7536q = new LinkedBlockingQueue();
        this.f7538s = new byte[0];
        this.f7539t = -1;
    }

    @Override // k0.InterfaceC0549d
    public final String f() {
        boolean z3;
        if (this.f7539t != -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        int i3 = U.A.f2405a;
        Locale locale = Locale.US;
        return D2.h.j(this.f7539t, this.f7539t + 1, "RTP/AVP/TCP;unicast;interleaved=", "-");
    }

    @Override // k0.InterfaceC0549d
    public final boolean g() {
        return false;
    }

    @Override // W.h
    public final long j(W.l lVar) {
        this.f7539t = lVar.f2767a.getPort();
        return -1L;
    }

    @Override // k0.InterfaceC0549d
    public final int l() {
        return this.f7539t;
    }

    @Override // W.h
    public final Uri o() {
        return null;
    }

    @Override // R.InterfaceC0107j
    public final int read(byte[] bArr, int i3, int i4) {
        if (i4 == 0) {
            return 0;
        }
        int min = Math.min(i4, this.f7538s.length);
        System.arraycopy(this.f7538s, 0, bArr, i3, min);
        byte[] bArr2 = this.f7538s;
        this.f7538s = Arrays.copyOfRange(bArr2, min, bArr2.length);
        if (min == i4) {
            return min;
        }
        try {
            byte[] bArr3 = (byte[]) this.f7536q.poll(this.f7537r, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int min2 = Math.min(i4 - min, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i3 + min, min2);
            if (min2 < bArr3.length) {
                this.f7538s = Arrays.copyOfRange(bArr3, min2, bArr3.length);
            }
            return min + min2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // W.h
    public final void close() {
    }

    @Override // k0.InterfaceC0549d
    public final C0544G v() {
        return this;
    }
}
