package T2;

import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class d implements t {

    /* renamed from: m  reason: collision with root package name */
    public final h f2361m;

    /* renamed from: n  reason: collision with root package name */
    public long f2362n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2363o;

    public d(h hVar, long j3) {
        D2.i.e(hVar, "fileHandle");
        this.f2361m = hVar;
        this.f2362n = j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2363o) {
            return;
        }
        this.f2363o = true;
        h hVar = this.f2361m;
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

    @Override // T2.t
    public final long e(a aVar, long j3) {
        long j4;
        long j5;
        int i3;
        D2.i.e(aVar, "sink");
        if (!this.f2363o) {
            h hVar = this.f2361m;
            long j6 = this.f2362n;
            hVar.getClass();
            if (j3 >= 0) {
                long j7 = j3 + j6;
                long j8 = j6;
                while (true) {
                    if (j8 >= j7) {
                        break;
                    }
                    q k3 = aVar.k(1);
                    byte[] bArr = k3.f2389a;
                    int i4 = k3.f2391c;
                    int min = (int) Math.min(j7 - j8, 8192 - i4);
                    synchronized (hVar) {
                        D2.i.e(bArr, "array");
                        hVar.f2377q.seek(j8);
                        i3 = 0;
                        while (true) {
                            if (i3 >= min) {
                                break;
                            }
                            int read = hVar.f2377q.read(bArr, i4, min - i3);
                            if (read == -1) {
                                if (i3 == 0) {
                                    i3 = -1;
                                }
                            } else {
                                i3 += read;
                            }
                        }
                    }
                    if (i3 == -1) {
                        if (k3.f2390b == k3.f2391c) {
                            aVar.f2352m = k3.a();
                            r.a(k3);
                        }
                        if (j6 == j8) {
                            j5 = -1;
                            j4 = -1;
                        }
                    } else {
                        k3.f2391c += i3;
                        long j9 = i3;
                        j8 += j9;
                        aVar.f2353n += j9;
                    }
                }
                j4 = j8 - j6;
                j5 = -1;
                if (j4 != j5) {
                    this.f2362n += j4;
                }
                return j4;
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        throw new IllegalStateException("closed");
    }
}
