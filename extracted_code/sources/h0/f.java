package h0;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class f implements m {

    /* renamed from: s  reason: collision with root package name */
    public static final ArrayDeque f5821s = new ArrayDeque();

    /* renamed from: t  reason: collision with root package name */
    public static final Object f5822t = new Object();

    /* renamed from: m  reason: collision with root package name */
    public final MediaCodec f5823m;

    /* renamed from: n  reason: collision with root package name */
    public final HandlerThread f5824n;

    /* renamed from: o  reason: collision with root package name */
    public HandlerC0284d f5825o;

    /* renamed from: p  reason: collision with root package name */
    public final AtomicReference f5826p;

    /* renamed from: q  reason: collision with root package name */
    public final U.c f5827q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5828r;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, U.c] */
    public f(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ?? obj = new Object();
        this.f5823m = mediaCodec;
        this.f5824n = handlerThread;
        this.f5827q = obj;
        this.f5826p = new AtomicReference();
    }

    public static e c() {
        ArrayDeque arrayDeque = f5821s;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new e();
                }
                return (e) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void d(e eVar) {
        ArrayDeque arrayDeque = f5821s;
        synchronized (arrayDeque) {
            arrayDeque.add(eVar);
        }
    }

    @Override // h0.m
    public final void a(Bundle bundle) {
        k();
        HandlerC0284d handlerC0284d = this.f5825o;
        int i3 = U.A.f2405a;
        handlerC0284d.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // h0.m
    public final void b(int i3, X.b bVar, long j3, int i4) {
        k();
        e c3 = c();
        c3.f5816a = i3;
        c3.f5817b = 0;
        c3.f5819d = j3;
        c3.f5820e = i4;
        int i5 = bVar.f2927f;
        MediaCodec.CryptoInfo cryptoInfo = c3.f5818c;
        cryptoInfo.numSubSamples = i5;
        int[] iArr = bVar.f2925d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 != null && iArr2.length >= iArr.length) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = bVar.f2926e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 != null && iArr4.length >= iArr3.length) {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            } else {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = bVar.f2923b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 != null && bArr2.length >= bArr.length) {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = bVar.f2922a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 != null && bArr4.length >= bArr3.length) {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            } else {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = bVar.f2924c;
        if (U.A.f2405a >= 24) {
            A.c.s();
            cryptoInfo.setPattern(A.c.h(bVar.f2928g, bVar.f2929h));
        }
        this.f5825o.obtainMessage(2, c3).sendToTarget();
    }

    @Override // h0.m
    public final void e(int i3, int i4, long j3, int i5) {
        k();
        e c3 = c();
        c3.f5816a = i3;
        c3.f5817b = i4;
        c3.f5819d = j3;
        c3.f5820e = i5;
        HandlerC0284d handlerC0284d = this.f5825o;
        int i6 = U.A.f2405a;
        handlerC0284d.obtainMessage(1, c3).sendToTarget();
    }

    @Override // h0.m
    public final void flush() {
        if (this.f5828r) {
            try {
                HandlerC0284d handlerC0284d = this.f5825o;
                handlerC0284d.getClass();
                handlerC0284d.removeCallbacksAndMessages(null);
                U.c cVar = this.f5827q;
                cVar.a();
                HandlerC0284d handlerC0284d2 = this.f5825o;
                handlerC0284d2.getClass();
                handlerC0284d2.obtainMessage(3).sendToTarget();
                synchronized (cVar) {
                    while (!cVar.f2428a) {
                        cVar.wait();
                    }
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }

    @Override // h0.m
    public final void g() {
        if (this.f5828r) {
            flush();
            this.f5824n.quit();
        }
        this.f5828r = false;
    }

    @Override // h0.m
    public final void k() {
        RuntimeException runtimeException = (RuntimeException) this.f5826p.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    @Override // h0.m
    public final void start() {
        if (!this.f5828r) {
            HandlerThread handlerThread = this.f5824n;
            handlerThread.start();
            this.f5825o = new HandlerC0284d(this, handlerThread.getLooper());
            this.f5828r = true;
        }
    }
}
