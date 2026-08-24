package P;

import android.media.MediaDataSource;
import java.io.IOException;
/* loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* renamed from: m  reason: collision with root package name */
    public long f1366m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ f f1367n;

    public a(f fVar) {
        this.f1367n = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j3, byte[] bArr, int i3, int i4) {
        if (i4 == 0) {
            return 0;
        }
        if (j3 < 0) {
            return -1;
        }
        try {
            long j4 = this.f1366m;
            if (j4 != j3) {
                if (j4 >= 0 && j3 >= j4 + this.f1367n.f1370m.available()) {
                    return -1;
                }
                this.f1367n.b(j3);
                this.f1366m = j3;
            }
            if (i4 > this.f1367n.f1370m.available()) {
                i4 = this.f1367n.f1370m.available();
            }
            int read = this.f1367n.read(bArr, i3, i4);
            if (read >= 0) {
                this.f1366m += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f1366m = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
