package h0;

import android.os.HandlerThread;
/* renamed from: h0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0282b implements C1.k {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f5808m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f5809n;

    public /* synthetic */ C0282b(int i3, int i4) {
        this.f5808m = i4;
        this.f5809n = i3;
    }

    @Override // C1.k
    public final Object get() {
        switch (this.f5808m) {
            case 0:
                return new HandlerThread(C0283c.d("ExoPlayer:MediaCodecAsyncAdapter:", this.f5809n));
            default:
                return new HandlerThread(C0283c.d("ExoPlayer:MediaCodecQueueingThread:", this.f5809n));
        }
    }
}
