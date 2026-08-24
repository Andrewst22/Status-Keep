package X;

import U.A;
import android.media.MediaCodec;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f2922a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f2923b;

    /* renamed from: c  reason: collision with root package name */
    public int f2924c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f2925d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f2926e;

    /* renamed from: f  reason: collision with root package name */
    public int f2927f;

    /* renamed from: g  reason: collision with root package name */
    public int f2928g;

    /* renamed from: h  reason: collision with root package name */
    public int f2929h;

    /* renamed from: i  reason: collision with root package name */
    public final MediaCodec.CryptoInfo f2930i;

    /* renamed from: j  reason: collision with root package name */
    public final B1.a f2931j;

    public b() {
        B1.a aVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f2930i = cryptoInfo;
        if (A.f2405a >= 24) {
            aVar = new B1.a(cryptoInfo);
        } else {
            aVar = null;
        }
        this.f2931j = aVar;
    }
}
