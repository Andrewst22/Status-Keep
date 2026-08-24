package h0;

import R.G;
import U.AbstractC0123a;
import android.content.Context;
import g2.C0276a;
/* loaded from: classes.dex */
public final class i implements k {

    /* renamed from: m  reason: collision with root package name */
    public final Context f5846m;

    public /* synthetic */ i(Context context) {
        this.f5846m = context;
    }

    @Override // h0.k
    public l j(j jVar) {
        Context context;
        int i3 = U.A.f2405a;
        if (i3 >= 23 && (i3 >= 31 || ((context = this.f5846m) != null && i3 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int g3 = G.g(jVar.f5849c.f1974m);
            AbstractC0123a.r("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + U.A.F(g3));
            return new C0276a(g3).j(jVar);
        }
        return new e0.l(12).j(jVar);
    }
}
