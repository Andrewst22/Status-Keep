package androidx.media3.exoplayer.hls;

import B1.a;
import B1.b;
import C1.j;
import R.C0122z;
import W.g;
import Z.c;
import e0.C0262c;
import e0.C0263d;
import e0.k;
import e0.l;
import e0.o;
import f0.p;
import java.util.List;
import o0.AbstractC0677a;
import o0.InterfaceC0700y;
/* loaded from: classes.dex */
public final class HlsMediaSource$Factory implements InterfaceC0700y {

    /* renamed from: a  reason: collision with root package name */
    public final C0262c f4386a;

    /* renamed from: b  reason: collision with root package name */
    public final C0263d f4387b;

    /* renamed from: e  reason: collision with root package name */
    public final l f4390e;

    /* renamed from: g  reason: collision with root package name */
    public final l f4392g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4393h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4394i;

    /* renamed from: j  reason: collision with root package name */
    public final long f4395j;

    /* renamed from: f  reason: collision with root package name */
    public final j f4391f = new j(28);

    /* renamed from: c  reason: collision with root package name */
    public final l f4388c = new l(1);

    /* renamed from: d  reason: collision with root package name */
    public final c f4389d = f0.c.f5419A;

    public HlsMediaSource$Factory(g gVar) {
        this.f4386a = new C0262c(gVar, 0);
        C0263d c0263d = k.f5257a;
        this.f4387b = c0263d;
        this.f4392g = new l(28);
        this.f4390e = new l(25);
        this.f4394i = 1;
        this.f4395j = -9223372036854775807L;
        this.f4393h = true;
        c0263d.f5228c = true;
    }

    @Override // o0.InterfaceC0700y
    public final InterfaceC0700y a(boolean z3) {
        this.f4387b.f5228c = z3;
        return this;
    }

    @Override // o0.InterfaceC0700y
    public final InterfaceC0700y b(b bVar) {
        this.f4387b.f5227b = bVar;
        return this;
    }

    @Override // o0.InterfaceC0700y
    public final AbstractC0677a c(C0122z c0122z) {
        c0122z.f2008b.getClass();
        p pVar = this.f4388c;
        List list = c0122z.f2008b.f2003c;
        if (!list.isEmpty()) {
            pVar = new a(21, pVar, list);
        }
        C0263d c0263d = this.f4387b;
        d0.g y3 = this.f4391f.y(c0122z);
        l lVar = this.f4392g;
        this.f4389d.getClass();
        C0262c c0262c = this.f4386a;
        return new o(c0122z, c0262c, c0263d, this.f4390e, y3, lVar, new f0.c(c0262c, lVar, pVar), this.f4395j, this.f4393h, this.f4394i);
    }
}
