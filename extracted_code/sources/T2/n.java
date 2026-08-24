package T2;

import java.io.Closeable;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* loaded from: classes.dex */
public final class n implements Closeable, Flushable, WritableByteChannel {

    /* renamed from: m  reason: collision with root package name */
    public final c f2382m;

    /* renamed from: n  reason: collision with root package name */
    public final a f2383n = new Object();

    /* renamed from: o  reason: collision with root package name */
    public boolean f2384o;

    /* JADX WARN: Type inference failed for: r1v1, types: [T2.a, java.lang.Object] */
    public n(c cVar) {
        this.f2382m = cVar;
    }

    public final void a() {
        int i3;
        if (!this.f2384o) {
            a aVar = this.f2383n;
            long j3 = aVar.f2353n;
            if (j3 == 0) {
                j3 = 0;
            } else {
                q qVar = aVar.f2352m;
                D2.i.b(qVar);
                q qVar2 = qVar.f2395g;
                D2.i.b(qVar2);
                if (qVar2.f2391c < 8192 && qVar2.f2393e) {
                    j3 -= i3 - qVar2.f2390b;
                }
            }
            if (j3 > 0) {
                this.f2382m.a(aVar, j3);
                return;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        c cVar = this.f2382m;
        if (!this.f2384o) {
            try {
                a aVar = this.f2383n;
                long j3 = aVar.f2353n;
                if (j3 > 0) {
                    cVar.a(aVar, j3);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                cVar.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f2384o = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (!this.f2384o) {
            a aVar = this.f2383n;
            long j3 = aVar.f2353n;
            c cVar = this.f2382m;
            if (j3 > 0) {
                cVar.a(aVar, j3);
            }
            cVar.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f2384o;
    }

    public final String toString() {
        return "buffer(" + this.f2382m + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        D2.i.e(byteBuffer, "source");
        if (!this.f2384o) {
            int write = this.f2383n.write(byteBuffer);
            a();
            return write;
        }
        throw new IllegalStateException("closed");
    }
}
