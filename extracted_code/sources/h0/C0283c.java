package h0;

import D1.b0;
import U.AbstractC0123a;
import a.AbstractC0155a;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Locale;
/* renamed from: h0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283c implements l {

    /* renamed from: m  reason: collision with root package name */
    public int f5810m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5811n;

    /* renamed from: o  reason: collision with root package name */
    public final Object f5812o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f5813p;

    /* renamed from: q  reason: collision with root package name */
    public final Object f5814q;

    public C0283c(Context context) {
        String N3;
        TelephonyManager telephonyManager;
        this.f5812o = context == null ? null : context.getApplicationContext();
        int i3 = U.A.f2405a;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                N3 = AbstractC0155a.N(networkCountryIso);
                int[] a3 = s0.g.a(N3);
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                b0 b0Var = s0.g.f9164n;
                hashMap.put(2, (Long) b0Var.get(a3[0]));
                hashMap.put(3, (Long) s0.g.f9165o.get(a3[1]));
                hashMap.put(4, (Long) s0.g.f9166p.get(a3[2]));
                hashMap.put(5, (Long) s0.g.f9167q.get(a3[3]));
                hashMap.put(10, (Long) s0.g.f9168r.get(a3[4]));
                hashMap.put(9, (Long) s0.g.f9169s.get(a3[5]));
                hashMap.put(7, (Long) b0Var.get(a3[0]));
                this.f5813p = hashMap;
                this.f5810m = 2000;
                this.f5814q = U.v.f2483a;
                this.f5811n = true;
            }
        }
        N3 = AbstractC0155a.N(Locale.getDefault().getCountry());
        int[] a32 = s0.g.a(N3);
        HashMap hashMap2 = new HashMap(8);
        hashMap2.put(0, 1000000L);
        b0 b0Var2 = s0.g.f9164n;
        hashMap2.put(2, (Long) b0Var2.get(a32[0]));
        hashMap2.put(3, (Long) s0.g.f9165o.get(a32[1]));
        hashMap2.put(4, (Long) s0.g.f9166p.get(a32[2]));
        hashMap2.put(5, (Long) s0.g.f9167q.get(a32[3]));
        hashMap2.put(10, (Long) s0.g.f9168r.get(a32[4]));
        hashMap2.put(9, (Long) s0.g.f9169s.get(a32[5]));
        hashMap2.put(7, (Long) b0Var2.get(a32[0]));
        this.f5813p = hashMap2;
        this.f5810m = 2000;
        this.f5814q = U.v.f2483a;
        this.f5811n = true;
    }

    public static void c(C0283c c0283c, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i3) {
        boolean z3;
        g gVar = (g) c0283c.f5813p;
        if (gVar.f5831c == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        HandlerThread handlerThread = gVar.f5830b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = (MediaCodec) c0283c.f5812o;
        mediaCodec.setCallback(gVar, handler);
        gVar.f5831c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i3);
        Trace.endSection();
        ((m) c0283c.f5814q).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        c0283c.f5810m = 1;
    }

    public static String d(String str, int i3) {
        StringBuilder sb = new StringBuilder(str);
        if (i3 == 1) {
            sb.append("Audio");
        } else if (i3 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i3);
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030 A[Catch: all -> 0x0032, DONT_GENERATE, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:19:0x0030, B:23:0x0034, B:30:0x004e, B:29:0x0042, B:32:0x0050, B:33:0x0055, B:34:0x0056, B:35:0x0058, B:36:0x0059, B:37:0x005b, B:38:0x005c, B:39:0x005e), top: B:42:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:19:0x0030, B:23:0x0034, B:30:0x004e, B:29:0x0042, B:32:0x0050, B:33:0x0055, B:34:0x0056, B:35:0x0058, B:36:0x0059, B:37:0x005b, B:38:0x005c, B:39:0x005e), top: B:42:0x000e }] */
    @Override // h0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int B() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f5814q
            h0.m r0 = (h0.m) r0
            r0.k()
            java.lang.Object r0 = r9.f5813p
            h0.g r0 = (h0.g) r0
            java.lang.Object r1 = r0.f5829a
            monitor-enter(r1)
            java.lang.IllegalStateException r2 = r0.f5842n     // Catch: java.lang.Throwable -> L32
            r3 = 0
            if (r2 != 0) goto L5c
            android.media.MediaCodec$CodecException r2 = r0.f5838j     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L59
            android.media.MediaCodec$CryptoException r2 = r0.f5839k     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L56
            long r2 = r0.f5840l     // Catch: java.lang.Throwable -> L32
            r4 = 0
            r6 = 0
            r7 = 1
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 > 0) goto L2c
            boolean r2 = r0.f5841m     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L2a
            goto L2c
        L2a:
            r2 = 0
            goto L2d
        L2c:
            r2 = 1
        L2d:
            r3 = -1
            if (r2 == 0) goto L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            goto L4f
        L32:
            r0 = move-exception
            goto L5f
        L34:
            U.m r0 = r0.f5832d     // Catch: java.lang.Throwable -> L32
            int r2 = r0.f2454a     // Catch: java.lang.Throwable -> L32
            int r4 = r0.f2455b     // Catch: java.lang.Throwable -> L32
            if (r2 != r4) goto L3d
            r6 = 1
        L3d:
            if (r6 == 0) goto L40
            goto L4e
        L40:
            if (r2 == r4) goto L50
            java.lang.Object r3 = r0.f2457d     // Catch: java.lang.Throwable -> L32
            int[] r3 = (int[]) r3     // Catch: java.lang.Throwable -> L32
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L32
            int r2 = r2 + r7
            int r4 = r0.f2456c     // Catch: java.lang.Throwable -> L32
            r2 = r2 & r4
            r0.f2454a = r2     // Catch: java.lang.Throwable -> L32
        L4e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
        L4f:
            return r3
        L50:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L32
            r0.<init>()     // Catch: java.lang.Throwable -> L32
            throw r0     // Catch: java.lang.Throwable -> L32
        L56:
            r0.f5839k = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L59:
            r0.f5838j = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L5c:
            r0.f5842n = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L5f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.C0283c.B():int");
    }

    @Override // h0.l
    public void C(int i3) {
        ((MediaCodec) this.f5812o).setVideoScalingMode(i3);
    }

    @Override // h0.l
    public void H(u0.k kVar, Handler handler) {
        ((MediaCodec) this.f5812o).setOnFrameRenderedListener(new C0281a(this, kVar, 0), handler);
    }

    @Override // h0.l
    public MediaFormat L() {
        MediaFormat mediaFormat;
        g gVar = (g) this.f5813p;
        synchronized (gVar.f5829a) {
            try {
                mediaFormat = gVar.f5836h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // h0.l
    public void a(Bundle bundle) {
        ((m) this.f5814q).a(bundle);
    }

    @Override // h0.l
    public void b(int i3, X.b bVar, long j3, int i4) {
        ((m) this.f5814q).b(i3, bVar, j3, i4);
    }

    @Override // h0.l
    public void e(int i3, int i4, long j3, int i5) {
        ((m) this.f5814q).e(i3, i4, j3, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030 A[Catch: all -> 0x0032, DONT_GENERATE, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:19:0x0030, B:23:0x0034, B:27:0x003f, B:30:0x0043, B:32:0x0051, B:36:0x0078, B:35:0x006e, B:38:0x007a, B:39:0x007f, B:40:0x0080, B:41:0x0082, B:42:0x0083, B:43:0x0085, B:44:0x0086, B:45:0x0088), top: B:48:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:19:0x0030, B:23:0x0034, B:27:0x003f, B:30:0x0043, B:32:0x0051, B:36:0x0078, B:35:0x006e, B:38:0x007a, B:39:0x007f, B:40:0x0080, B:41:0x0082, B:42:0x0083, B:43:0x0085, B:44:0x0086, B:45:0x0088), top: B:48:0x000e }] */
    @Override // h0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int f(android.media.MediaCodec.BufferInfo r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f5814q
            h0.m r0 = (h0.m) r0
            r0.k()
            java.lang.Object r0 = r10.f5813p
            h0.g r0 = (h0.g) r0
            java.lang.Object r1 = r0.f5829a
            monitor-enter(r1)
            java.lang.IllegalStateException r2 = r0.f5842n     // Catch: java.lang.Throwable -> L32
            r3 = 0
            if (r2 != 0) goto L86
            android.media.MediaCodec$CodecException r2 = r0.f5838j     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L83
            android.media.MediaCodec$CryptoException r2 = r0.f5839k     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L80
            long r2 = r0.f5840l     // Catch: java.lang.Throwable -> L32
            r4 = 0
            r6 = 0
            r7 = 1
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 > 0) goto L2c
            boolean r2 = r0.f5841m     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L2a
            goto L2c
        L2a:
            r2 = 0
            goto L2d
        L2c:
            r2 = 1
        L2d:
            r3 = -1
            if (r2 == 0) goto L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            goto L79
        L32:
            r11 = move-exception
            goto L89
        L34:
            U.m r2 = r0.f5833e     // Catch: java.lang.Throwable -> L32
            int r4 = r2.f2454a     // Catch: java.lang.Throwable -> L32
            int r5 = r2.f2455b     // Catch: java.lang.Throwable -> L32
            if (r4 != r5) goto L3d
            r6 = 1
        L3d:
            if (r6 == 0) goto L41
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            goto L79
        L41:
            if (r4 == r5) goto L7a
            java.lang.Object r3 = r2.f2457d     // Catch: java.lang.Throwable -> L32
            int[] r3 = (int[]) r3     // Catch: java.lang.Throwable -> L32
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L32
            int r4 = r4 + r7
            int r5 = r2.f2456c     // Catch: java.lang.Throwable -> L32
            r4 = r4 & r5
            r2.f2454a = r4     // Catch: java.lang.Throwable -> L32
            if (r3 < 0) goto L6b
            android.media.MediaFormat r2 = r0.f5836h     // Catch: java.lang.Throwable -> L32
            U.AbstractC0123a.k(r2)     // Catch: java.lang.Throwable -> L32
            java.util.ArrayDeque r0 = r0.f5834f     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L32
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.lang.Throwable -> L32
            int r5 = r0.offset     // Catch: java.lang.Throwable -> L32
            int r6 = r0.size     // Catch: java.lang.Throwable -> L32
            long r7 = r0.presentationTimeUs     // Catch: java.lang.Throwable -> L32
            int r9 = r0.flags     // Catch: java.lang.Throwable -> L32
            r4 = r11
            r4.set(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L32
            goto L78
        L6b:
            r11 = -2
            if (r3 != r11) goto L78
            java.util.ArrayDeque r11 = r0.f5835g     // Catch: java.lang.Throwable -> L32
            java.lang.Object r11 = r11.remove()     // Catch: java.lang.Throwable -> L32
            android.media.MediaFormat r11 = (android.media.MediaFormat) r11     // Catch: java.lang.Throwable -> L32
            r0.f5836h = r11     // Catch: java.lang.Throwable -> L32
        L78:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
        L79:
            return r3
        L7a:
            java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException     // Catch: java.lang.Throwable -> L32
            r11.<init>()     // Catch: java.lang.Throwable -> L32
            throw r11     // Catch: java.lang.Throwable -> L32
        L80:
            r0.f5839k = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L83:
            r0.f5838j = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L86:
            r0.f5842n = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L89:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.C0283c.f(android.media.MediaCodec$BufferInfo):int");
    }

    @Override // h0.l
    public void flush() {
        ((m) this.f5814q).flush();
        ((MediaCodec) this.f5812o).flush();
        g gVar = (g) this.f5813p;
        synchronized (gVar.f5829a) {
            gVar.f5840l++;
            Handler handler = gVar.f5831c;
            int i3 = U.A.f2405a;
            handler.post(new Z.d(gVar, 5));
        }
        ((MediaCodec) this.f5812o).start();
    }

    @Override // h0.l
    public void j(long j3, int i3) {
        ((MediaCodec) this.f5812o).releaseOutputBuffer(i3, j3);
    }

    @Override // h0.l
    public ByteBuffer l(int i3) {
        return ((MediaCodec) this.f5812o).getInputBuffer(i3);
    }

    @Override // h0.l
    public void m(Surface surface) {
        ((MediaCodec) this.f5812o).setOutputSurface(surface);
    }

    @Override // h0.l
    public void r(int i3, boolean z3) {
        ((MediaCodec) this.f5812o).releaseOutputBuffer(i3, z3);
    }

    @Override // h0.l
    public void release() {
        try {
            if (this.f5810m == 1) {
                ((m) this.f5814q).g();
                g gVar = (g) this.f5813p;
                synchronized (gVar.f5829a) {
                    gVar.f5841m = true;
                    gVar.f5830b.quit();
                    gVar.a();
                }
            }
            this.f5810m = 2;
            if (!this.f5811n) {
                try {
                    int i3 = U.A.f2405a;
                    if (i3 >= 30 && i3 < 33) {
                        ((MediaCodec) this.f5812o).stop();
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (!this.f5811n) {
                try {
                    int i4 = U.A.f2405a;
                    if (i4 >= 30 && i4 < 33) {
                        ((MediaCodec) this.f5812o).stop();
                    }
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // h0.l
    public ByteBuffer v(int i3) {
        return ((MediaCodec) this.f5812o).getOutputBuffer(i3);
    }

    @Override // h0.l
    public boolean z(t tVar) {
        g gVar = (g) this.f5813p;
        synchronized (gVar.f5829a) {
            gVar.f5843o = tVar;
        }
        return true;
    }

    public C0283c(MediaCodec mediaCodec, HandlerThread handlerThread, m mVar) {
        this.f5812o = mediaCodec;
        this.f5813p = new g(handlerThread);
        this.f5814q = mVar;
        this.f5810m = 0;
    }
}
