package T2;

import a.AbstractC0155a;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class o extends InputStream {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ p f2385m;

    public o(p pVar) {
        this.f2385m = pVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        p pVar = this.f2385m;
        if (!pVar.f2388o) {
            return (int) Math.min(pVar.f2387n.f2353n, Integer.MAX_VALUE);
        }
        throw new IOException("closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2385m.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        p pVar = this.f2385m;
        if (!pVar.f2388o) {
            a aVar = pVar.f2387n;
            if (aVar.f2353n == 0 && pVar.f2386m.e(aVar, 8192L) == -1) {
                return -1;
            }
            return aVar.d() & 255;
        }
        throw new IOException("closed");
    }

    public final String toString() {
        return this.f2385m + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i3, int i4) {
        D2.i.e(bArr, "data");
        p pVar = this.f2385m;
        if (!pVar.f2388o) {
            AbstractC0155a.n(bArr.length, i3, i4);
            a aVar = pVar.f2387n;
            if (aVar.f2353n == 0 && pVar.f2386m.e(aVar, 8192L) == -1) {
                return -1;
            }
            return aVar.read(bArr, i3, i4);
        }
        throw new IOException("closed");
    }
}
