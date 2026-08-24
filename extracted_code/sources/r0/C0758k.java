package r0;

import D1.a0;
import android.media.Spatializer;
/* renamed from: r0.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0758k implements Spatializer.OnSpatializerStateChangedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f8954a;

    public C0758k(q qVar) {
        this.f8954a = qVar;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z3) {
        q qVar = this.f8954a;
        a0 a0Var = q.f8985i;
        qVar.e();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z3) {
        q qVar = this.f8954a;
        a0 a0Var = q.f8985i;
        qVar.e();
    }
}
