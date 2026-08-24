package o0;

import U.AbstractC0123a;
import android.net.Uri;
import java.util.Map;
/* renamed from: o0.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0693q implements W.h {

    /* renamed from: m  reason: collision with root package name */
    public final W.h f8628m;

    /* renamed from: n  reason: collision with root package name */
    public final int f8629n;

    /* renamed from: o  reason: collision with root package name */
    public final J f8630o;

    /* renamed from: p  reason: collision with root package name */
    public final byte[] f8631p;

    /* renamed from: q  reason: collision with root package name */
    public int f8632q;

    public C0693q(W.h hVar, int i3, J j3) {
        boolean z3;
        if (i3 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.e(z3);
        this.f8628m = hVar;
        this.f8629n = i3;
        this.f8630o = j3;
        this.f8631p = new byte[1];
        this.f8632q = i3;
    }

    @Override // W.h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // W.h
    public final long j(W.l lVar) {
        throw new UnsupportedOperationException();
    }

    @Override // W.h
    public final Uri o() {
        return this.f8628m.o();
    }

    @Override // R.InterfaceC0107j
    public final int read(byte[] bArr, int i3, int i4) {
        long max;
        int i5 = this.f8632q;
        W.h hVar = this.f8628m;
        if (i5 == 0) {
            byte[] bArr2 = this.f8631p;
            int i6 = 0;
            if (hVar.read(bArr2, 0, 1) != -1) {
                int i7 = (bArr2[0] & 255) << 4;
                if (i7 != 0) {
                    byte[] bArr3 = new byte[i7];
                    int i8 = i7;
                    while (i8 > 0) {
                        int read = hVar.read(bArr3, i6, i8);
                        if (read != -1) {
                            i6 += read;
                            i8 -= read;
                        }
                    }
                    while (i7 > 0 && bArr3[i7 - 1] == 0) {
                        i7--;
                    }
                    if (i7 > 0) {
                        U.t tVar = new U.t(bArr3, i7);
                        J j3 = this.f8630o;
                        if (!j3.f8449y) {
                            max = j3.f8447v;
                        } else {
                            max = Math.max(j3.f8450z.x(true), j3.f8447v);
                        }
                        long j4 = max;
                        int a3 = tVar.a();
                        w0.G g3 = j3.x;
                        g3.getClass();
                        g3.f(a3, tVar);
                        g3.b(j4, 1, a3, 0, null);
                        j3.f8449y = true;
                    }
                }
                this.f8632q = this.f8629n;
            }
            return -1;
        }
        int read2 = hVar.read(bArr, i3, Math.min(this.f8632q, i4));
        if (read2 != -1) {
            this.f8632q -= read2;
        }
        return read2;
    }

    @Override // W.h
    public final Map x() {
        return this.f8628m.x();
    }

    @Override // W.h
    public final void y(W.B b3) {
        b3.getClass();
        this.f8628m.y(b3);
    }
}
