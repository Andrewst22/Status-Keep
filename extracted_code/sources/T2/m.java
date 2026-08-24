package T2;

import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public final class m extends OutputStream {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ n f2381m;

    public m(n nVar) {
        this.f2381m = nVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2381m.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        n nVar = this.f2381m;
        if (!nVar.f2384o) {
            nVar.flush();
        }
    }

    public final String toString() {
        return this.f2381m + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i3) {
        n nVar = this.f2381m;
        if (!nVar.f2384o) {
            nVar.f2383n.o((byte) i3);
            nVar.a();
            return;
        }
        throw new IOException("closed");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i3, int i4) {
        D2.i.e(bArr, "data");
        n nVar = this.f2381m;
        if (!nVar.f2384o) {
            nVar.f2383n.n(bArr, i3, i4);
            nVar.a();
            return;
        }
        throw new IOException("closed");
    }
}
