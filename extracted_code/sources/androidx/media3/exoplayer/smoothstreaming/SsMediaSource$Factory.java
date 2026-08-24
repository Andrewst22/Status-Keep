package androidx.media3.exoplayer.smoothstreaming;

import B1.b;
import C1.j;
import R.C0122z;
import W.g;
import Y.C0131b;
import e0.l;
import g2.C0276a;
import java.util.List;
import k0.C0558m;
import m0.C0616c;
import o0.AbstractC0677a;
import o0.InterfaceC0700y;
import s0.p;
/* loaded from: classes.dex */
public final class SsMediaSource$Factory implements InterfaceC0700y {

    /* renamed from: a  reason: collision with root package name */
    public final C0131b f4397a;

    /* renamed from: b  reason: collision with root package name */
    public final g f4398b;

    /* renamed from: c  reason: collision with root package name */
    public final l f4399c;

    /* renamed from: d  reason: collision with root package name */
    public final j f4400d;

    /* renamed from: e  reason: collision with root package name */
    public final l f4401e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4402f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Y.b] */
    public SsMediaSource$Factory(g gVar) {
        ?? obj = new Object();
        obj.f3217b = gVar;
        obj.f3218c = new b(18);
        this.f4397a = obj;
        this.f4398b = gVar;
        this.f4400d = new j(28);
        this.f4401e = new l(28);
        this.f4402f = 30000L;
        this.f4399c = new l(25);
        obj.f3216a = true;
    }

    @Override // o0.InterfaceC0700y
    public final InterfaceC0700y a(boolean z3) {
        this.f4397a.f3216a = z3;
        return this;
    }

    @Override // o0.InterfaceC0700y
    public final InterfaceC0700y b(b bVar) {
        this.f4397a.f3218c = bVar;
        return this;
    }

    @Override // o0.InterfaceC0700y
    public final AbstractC0677a c(C0122z c0122z) {
        p pVar;
        c0122z.f2008b.getClass();
        C0558m c0558m = new C0558m(10);
        List list = c0122z.f2008b.f2003c;
        if (!list.isEmpty()) {
            pVar = new C0276a((Object) c0558m, (Object) list, 7, false);
        } else {
            pVar = c0558m;
        }
        d0.g y3 = this.f4400d.y(c0122z);
        l lVar = this.f4401e;
        l lVar2 = this.f4399c;
        return new C0616c(c0122z, this.f4398b, pVar, this.f4397a, lVar2, y3, lVar, this.f4402f);
    }
}
