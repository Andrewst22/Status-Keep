package E1;

import a.AbstractC0155a;
import java.io.OutputStream;
/* loaded from: classes.dex */
public final class a extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i3) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i3, int i4) {
        bArr.getClass();
        AbstractC0155a.p(i3, i4 + i3, bArr.length);
    }
}
