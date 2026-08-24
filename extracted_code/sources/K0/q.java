package k0;

import o0.T;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final p f7640a;

    /* renamed from: b  reason: collision with root package name */
    public final s0.n f7641b;

    /* renamed from: c  reason: collision with root package name */
    public final T f7642c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7643d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7644e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ r f7645f;

    public q(r rVar, v vVar, int i3, e0.l lVar) {
        this.f7645f = rVar;
        this.f7641b = new s0.n(D2.h.k("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper ", i3));
        T t3 = new T(rVar.f7654m, null, null);
        this.f7642c = t3;
        this.f7640a = new p(rVar, vVar, i3, t3, lVar);
        t3.f8530f = rVar.f7656o;
    }

    public final void a() {
        if (!this.f7643d) {
            this.f7640a.f7637b.f7574v = true;
            this.f7643d = true;
            r.w(this.f7645f);
        }
    }

    public final void b() {
        this.f7641b.f(this.f7640a.f7637b, this.f7645f.f7656o, 0);
    }
}
