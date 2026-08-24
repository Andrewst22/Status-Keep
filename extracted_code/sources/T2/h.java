package T2;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class h implements Closeable {

    /* renamed from: m  reason: collision with root package name */
    public final boolean f2373m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2374n;

    /* renamed from: o  reason: collision with root package name */
    public int f2375o;

    /* renamed from: p  reason: collision with root package name */
    public final ReentrantLock f2376p = new ReentrantLock();

    /* renamed from: q  reason: collision with root package name */
    public final RandomAccessFile f2377q;

    public h(boolean z3, RandomAccessFile randomAccessFile) {
        this.f2373m = z3;
        this.f2377q = randomAccessFile;
    }

    public static c b(h hVar) {
        if (hVar.f2373m) {
            ReentrantLock reentrantLock = hVar.f2376p;
            reentrantLock.lock();
            try {
                if (!hVar.f2374n) {
                    hVar.f2375o++;
                    reentrantLock.unlock();
                    return new c(hVar, 0L);
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only");
    }

    public final void a() {
        if (this.f2373m) {
            ReentrantLock reentrantLock = this.f2376p;
            reentrantLock.lock();
            try {
                if (!this.f2374n) {
                    synchronized (this) {
                        this.f2377q.getFD().sync();
                    }
                    return;
                }
                throw new IllegalStateException("closed");
            } finally {
                reentrantLock.unlock();
            }
        }
        throw new IllegalStateException("file handle is read-only");
    }

    public final long c() {
        long length;
        ReentrantLock reentrantLock = this.f2376p;
        reentrantLock.lock();
        try {
            if (!this.f2374n) {
                synchronized (this) {
                    length = this.f2377q.length();
                }
                return length;
            }
            throw new IllegalStateException("closed");
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f2376p;
        reentrantLock.lock();
        try {
            if (this.f2374n) {
                return;
            }
            this.f2374n = true;
            if (this.f2375o != 0) {
                return;
            }
            synchronized (this) {
                this.f2377q.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final d d(long j3) {
        ReentrantLock reentrantLock = this.f2376p;
        reentrantLock.lock();
        try {
            if (!this.f2374n) {
                this.f2375o++;
                reentrantLock.unlock();
                return new d(this, j3);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
