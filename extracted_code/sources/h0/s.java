package h0;

import R.C0113p;
/* loaded from: classes.dex */
public final class s extends Exception {

    /* renamed from: m  reason: collision with root package name */
    public final String f5861m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f5862n;

    /* renamed from: o  reason: collision with root package name */
    public final o f5863o;

    /* renamed from: p  reason: collision with root package name */
    public final String f5864p;

    public s(C0113p c0113p, C0280A c0280a, boolean z3, int i3) {
        this("Decoder init failed: [" + i3 + "], " + c0113p, c0280a, c0113p.f1974m, z3, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i3 < 0 ? "neg_" : "") + Math.abs(i3));
    }

    public s(String str, Throwable th, String str2, boolean z3, o oVar, String str3) {
        super(str, th);
        this.f5861m = str2;
        this.f5862n = z3;
        this.f5863o = oVar;
        this.f5864p = str3;
    }
}
