package T2;

import a.AbstractC0155a;
import java.io.Closeable;
import java.io.Flushable;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class c implements Closeable, Flushable {

    /* renamed from: m  reason: collision with root package name */
    public final h f2358m;

    /* renamed from: n  reason: collision with root package name */
    public long f2359n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2360o;

    public c(h hVar, long j3) {
        D2.i.e(hVar, "fileHandle");
        this.f2358m = hVar;
        this.f2359n = j3;
    }

    public final void a(a aVar, long j3) {
        if (!this.f2360o) {
            h hVar = this.f2358m;
            long j4 = this.f2359n;
            hVar.getClass();
            AbstractC0155a.n(aVar.f2353n, 0L, j3);
            long j5 = j4 + j3;
            while (j4 < j5) {
                q qVar = aVar.f2352m;
                D2.i.b(qVar);
                int min = (int) Math.min(j5 - j4, qVar.f2391c - qVar.f2390b);
                byte[] bArr = qVar.f2389a;
                int i3 = qVar.f2390b;
                synchronized (hVar) {
                    D2.i.e(bArr, "array");
                    hVar.f2377q.seek(j4);
                    hVar.f2377q.write(bArr, i3, min);
                }
                int i4 = qVar.f2390b + min;
                qVar.f2390b = i4;
                long j6 = min;
                j4 += j6;
                aVar.f2353n -= j6;
                if (i4 == qVar.f2391c) {
                    aVar.f2352m = qVar.a();
                    r.a(qVar);
                }
            }
            this.f2359n += j3;
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2360o) {
            return;
        }
        this.f2360o = true;
        h hVar = this.f2358m;
        ReentrantLock reentrantLock = hVar.f2376p;
        reentrantLock.lock();
        try {
            int i3 = hVar.f2375o - 1;
            hVar.f2375o = i3;
            if (i3 == 0) {
                if (hVar.f2374n) {
                    synchronized (hVar) {
                        hVar.f2377q.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (!this.f2360o) {
            h hVar = this.f2358m;
            synchronized (hVar) {
                hVar.f2377q.getFD().sync();
            }
            return;
        }
        throw new IllegalStateException("closed");
    }
}
