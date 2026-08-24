package g;

import android.graphics.drawable.Animatable;
import l1.C0595d;
/* renamed from: g.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269a extends android.support.v4.media.session.a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f5636b;

    /* renamed from: c  reason: collision with root package name */
    public final Animatable f5637c;

    public /* synthetic */ C0269a(Animatable animatable, int i3) {
        this.f5636b = i3;
        this.f5637c = animatable;
    }

    @Override // android.support.v4.media.session.a
    public final void U() {
        switch (this.f5636b) {
            case 0:
                this.f5637c.start();
                return;
            default:
                ((C0595d) this.f5637c).start();
                return;
        }
    }

    @Override // android.support.v4.media.session.a
    public final void W() {
        switch (this.f5636b) {
            case 0:
                this.f5637c.stop();
                return;
            default:
                ((C0595d) this.f5637c).stop();
                return;
        }
    }
}
