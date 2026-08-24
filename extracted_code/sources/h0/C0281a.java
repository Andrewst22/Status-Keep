package h0;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
/* renamed from: h0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0281a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5805a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u0.k f5806b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l f5807c;

    public /* synthetic */ C0281a(l lVar, u0.k kVar, int i3) {
        this.f5805a = i3;
        this.f5807c = lVar;
        this.f5806b = kVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j3, long j4) {
        switch (this.f5805a) {
            case 0:
                u0.k kVar = this.f5806b;
                ((C0283c) this.f5807c).getClass();
                kVar.getClass();
                if (U.A.f2405a < 30) {
                    Handler handler = kVar.f9347m;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j3 >> 32), (int) j3));
                    return;
                }
                kVar.a(j3);
                return;
            default:
                u0.k kVar2 = this.f5806b;
                ((B1.e) this.f5807c).getClass();
                kVar2.getClass();
                if (U.A.f2405a < 30) {
                    Handler handler2 = kVar2.f9347m;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j3 >> 32), (int) j3));
                    return;
                }
                kVar2.a(j3);
                return;
        }
    }
}
