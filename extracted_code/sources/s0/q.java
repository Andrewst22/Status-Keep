package s0;

import U.AbstractC0123a;
import W.A;
import android.net.Uri;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class q implements k {

    /* renamed from: m  reason: collision with root package name */
    public final long f9204m;

    /* renamed from: n  reason: collision with root package name */
    public final W.l f9205n;

    /* renamed from: o  reason: collision with root package name */
    public final int f9206o;

    /* renamed from: p  reason: collision with root package name */
    public final A f9207p;

    /* renamed from: q  reason: collision with root package name */
    public final p f9208q;

    /* renamed from: r  reason: collision with root package name */
    public volatile Object f9209r;

    public q(W.h hVar, Uri uri, int i3, p pVar) {
        Map emptyMap = Collections.emptyMap();
        AbstractC0123a.l(uri, "The uri must be set.");
        W.l lVar = new W.l(uri, 1, null, emptyMap, 0L, -1L, null, 1);
        this.f9207p = new A(hVar);
        this.f9205n = lVar;
        this.f9206o = i3;
        this.f9208q = pVar;
        this.f9204m = o0.r.f8633b.getAndIncrement();
    }

    @Override // s0.k
    public final void b() {
        this.f9207p.f2723n = 0L;
        W.j jVar = new W.j(this.f9207p, this.f9205n);
        try {
            jVar.a();
            Uri o3 = this.f9207p.f2722m.o();
            o3.getClass();
            this.f9209r = this.f9208q.k(o3, jVar);
        } finally {
            U.A.h(jVar);
        }
    }

    @Override // s0.k
    public final void c() {
    }
}
