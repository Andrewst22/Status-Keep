package T0;

import g0.C0272c;
import java.util.List;
/* loaded from: classes.dex */
public final class c extends X.g implements d {

    /* renamed from: q  reason: collision with root package name */
    public d f2304q;

    /* renamed from: r  reason: collision with root package name */
    public long f2305r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f2306s = 1;

    /* renamed from: t  reason: collision with root package name */
    public Object f2307t;

    public /* synthetic */ c() {
    }

    @Override // T0.d
    public final List A(long j3) {
        d dVar = this.f2304q;
        dVar.getClass();
        return dVar.A(j3 - this.f2305r);
    }

    @Override // T0.d
    public final long F(int i3) {
        d dVar = this.f2304q;
        dVar.getClass();
        return dVar.F(i3) + this.f2305r;
    }

    @Override // T0.d
    public final int P() {
        d dVar = this.f2304q;
        dVar.getClass();
        return dVar.P();
    }

    @Override // X.g
    public final void e() {
        super.e();
        this.f2304q = null;
    }

    @Override // X.g
    public final void f() {
        switch (this.f2306s) {
            case 0:
                ((C0272c) this.f2307t).l(this);
                return;
            default:
                B0.a aVar = (B0.a) this.f2307t;
                aVar.getClass();
                U0.i iVar = (U0.i) aVar.f25n;
                iVar.getClass();
                e();
                iVar.f2574b.add(this);
                return;
        }
    }

    @Override // T0.d
    public final int g(long j3) {
        d dVar = this.f2304q;
        dVar.getClass();
        return dVar.g(j3 - this.f2305r);
    }

    public c(C0272c c0272c) {
        this.f2307t = c0272c;
    }
}
