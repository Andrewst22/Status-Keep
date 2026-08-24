package androidx.media3.exoplayer.dash;

import A.i;
import B0.b;
import C1.j;
import R.C0122z;
import W.g;
import c0.C0225e;
import e0.l;
import g2.C0276a;
import java.util.List;
import o0.AbstractC0677a;
import o0.InterfaceC0700y;
import s0.p;
/* loaded from: classes.dex */
public final class DashMediaSource$Factory implements InterfaceC0700y {

    /* renamed from: a  reason: collision with root package name */
    public final b f4379a;

    /* renamed from: b  reason: collision with root package name */
    public final g f4380b;

    /* renamed from: c  reason: collision with root package name */
    public final j f4381c;

    /* renamed from: d  reason: collision with root package name */
    public final l f4382d;

    /* renamed from: e  reason: collision with root package name */
    public final l f4383e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4384f;

    /* renamed from: g  reason: collision with root package name */
    public final long f4385g;

    public DashMediaSource$Factory(g gVar) {
        b bVar = new b(gVar);
        this.f4379a = bVar;
        this.f4380b = gVar;
        this.f4381c = new j(28);
        this.f4383e = new l(28);
        this.f4384f = 30000L;
        this.f4385g = 5000000L;
        this.f4382d = new l(25);
        ((i) bVar.f29p).f15a = true;
    }

    @Override // o0.InterfaceC0700y
    public final InterfaceC0700y a(boolean z3) {
        ((i) this.f4379a.f29p).f15a = z3;
        return this;
    }

    @Override // o0.InterfaceC0700y
    public final InterfaceC0700y b(B1.b bVar) {
        i iVar = (i) this.f4379a.f29p;
        iVar.getClass();
        iVar.f16b = bVar;
        return this;
    }

    @Override // o0.InterfaceC0700y
    public final AbstractC0677a c(C0122z c0122z) {
        p pVar;
        c0122z.f2008b.getClass();
        C0225e c0225e = new C0225e();
        List list = c0122z.f2008b.f2003c;
        if (!list.isEmpty()) {
            pVar = new C0276a((Object) c0225e, (Object) list, 7, false);
        } else {
            pVar = c0225e;
        }
        d0.g y3 = this.f4381c.y(c0122z);
        l lVar = this.f4383e;
        long j3 = this.f4384f;
        return new b0.g(c0122z, this.f4380b, pVar, this.f4379a, this.f4382d, y3, lVar, j3, this.f4385g);
    }
}
