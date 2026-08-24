package h0;

import Y.H;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
/* loaded from: classes.dex */
public final class g extends MediaCodec.Callback {

    /* renamed from: b  reason: collision with root package name */
    public final HandlerThread f5830b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f5831c;

    /* renamed from: h  reason: collision with root package name */
    public MediaFormat f5836h;

    /* renamed from: i  reason: collision with root package name */
    public MediaFormat f5837i;

    /* renamed from: j  reason: collision with root package name */
    public MediaCodec.CodecException f5838j;

    /* renamed from: k  reason: collision with root package name */
    public MediaCodec.CryptoException f5839k;

    /* renamed from: l  reason: collision with root package name */
    public long f5840l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5841m;

    /* renamed from: n  reason: collision with root package name */
    public IllegalStateException f5842n;

    /* renamed from: o  reason: collision with root package name */
    public t f5843o;

    /* renamed from: a  reason: collision with root package name */
    public final Object f5829a = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final U.m f5832d = new U.m();

    /* renamed from: e  reason: collision with root package name */
    public final U.m f5833e = new U.m();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque f5834f = new ArrayDeque();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque f5835g = new ArrayDeque();

    public g(HandlerThread handlerThread) {
        this.f5830b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f5835g;
        if (!arrayDeque.isEmpty()) {
            this.f5837i = (MediaFormat) arrayDeque.getLast();
        }
        U.m mVar = this.f5832d;
        mVar.f2455b = mVar.f2454a;
        U.m mVar2 = this.f5833e;
        mVar2.f2455b = mVar2.f2454a;
        this.f5834f.clear();
        arrayDeque.clear();
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f5829a) {
            this.f5842n = illegalStateException;
        }
    }

    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f5829a) {
            this.f5839k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f5829a) {
            this.f5838j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i3) {
        H h3;
        synchronized (this.f5829a) {
            this.f5832d.a(i3);
            t tVar = this.f5843o;
            if (tVar != null && (h3 = tVar.f5865a.f5900R) != null) {
                h3.a();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i3, MediaCodec.BufferInfo bufferInfo) {
        H h3;
        synchronized (this.f5829a) {
            try {
                MediaFormat mediaFormat = this.f5837i;
                if (mediaFormat != null) {
                    this.f5833e.a(-2);
                    this.f5835g.add(mediaFormat);
                    this.f5837i = null;
                }
                this.f5833e.a(i3);
                this.f5834f.add(bufferInfo);
                t tVar = this.f5843o;
                if (tVar != null && (h3 = tVar.f5865a.f5900R) != null) {
                    h3.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f5829a) {
            this.f5833e.a(-2);
            this.f5835g.add(mediaFormat);
            this.f5837i = null;
        }
    }
}
