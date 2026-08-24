package f0;

import D1.I;
import D1.r;
import R.H;
import U.A;
import W.w;
import android.net.Uri;
import android.os.SystemClock;
import d1.C0255e;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class b implements s0.i {

    /* renamed from: m  reason: collision with root package name */
    public final Uri f5408m;

    /* renamed from: n  reason: collision with root package name */
    public final s0.n f5409n = new s0.n("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* renamed from: o  reason: collision with root package name */
    public final W.h f5410o;

    /* renamed from: p  reason: collision with root package name */
    public i f5411p;

    /* renamed from: q  reason: collision with root package name */
    public long f5412q;

    /* renamed from: r  reason: collision with root package name */
    public long f5413r;

    /* renamed from: s  reason: collision with root package name */
    public long f5414s;

    /* renamed from: t  reason: collision with root package name */
    public long f5415t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5416u;

    /* renamed from: v  reason: collision with root package name */
    public IOException f5417v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f5418w;
    public final /* synthetic */ c x;

    public b(c cVar, Uri uri) {
        this.x = cVar;
        this.f5408m = uri;
        this.f5410o = ((W.g) cVar.f5420m.f5225n).a();
    }

    public static boolean a(b bVar, long j3) {
        bVar.f5415t = SystemClock.elapsedRealtime() + j3;
        c cVar = bVar.x;
        if (!bVar.f5408m.equals(cVar.f5430w)) {
            return false;
        }
        List list = cVar.f5429v.f5484e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar2 = (b) cVar.f5423p.get(((k) list.get(i3)).f5476a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.f5415t) {
                Uri uri = bVar2.f5408m;
                cVar.f5430w = uri;
                bVar2.g(cVar.b(uri));
                return false;
            }
        }
        return true;
    }

    public final Uri b() {
        String str;
        i iVar = this.f5411p;
        Uri uri = this.f5408m;
        if (iVar != null) {
            h hVar = iVar.f5472v;
            if (hVar.f5449a != -9223372036854775807L || hVar.f5453e) {
                Uri.Builder buildUpon = uri.buildUpon();
                i iVar2 = this.f5411p;
                if (iVar2.f5472v.f5453e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar2.f5461k + iVar2.f5468r.size()));
                    i iVar3 = this.f5411p;
                    if (iVar3.f5464n != -9223372036854775807L) {
                        I i3 = iVar3.f5469s;
                        int size = i3.size();
                        if (!i3.isEmpty() && ((d) r.l(i3)).f5433y) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                h hVar2 = this.f5411p.f5472v;
                if (hVar2.f5449a != -9223372036854775807L) {
                    if (hVar2.f5450b) {
                        str = "v2";
                    } else {
                        str = "YES";
                    }
                    buildUpon.appendQueryParameter("_HLS_skip", str);
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    @Override // s0.i
    public final C0255e c(s0.k kVar, long j3, long j4, IOException iOException, int i3) {
        boolean z3;
        int i4;
        s0.q qVar = (s0.q) kVar;
        long j5 = qVar.f9204m;
        Uri uri = qVar.f9207p.f2724o;
        o0.r rVar = new o0.r(j4);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z4 = iOException instanceof n;
        C0255e c0255e = s0.n.f9199q;
        c cVar = this.x;
        int i5 = qVar.f9206o;
        if (z3 || z4) {
            if (iOException instanceof w) {
                i4 = ((w) iOException).f2804p;
            } else {
                i4 = Integer.MAX_VALUE;
            }
            if (z4 || i4 == 400 || i4 == 503) {
                this.f5414s = SystemClock.elapsedRealtime();
                d(false);
                d0.d dVar = cVar.f5425r;
                int i6 = A.f2405a;
                dVar.i(rVar, i5, iOException, true);
                return c0255e;
            }
        }
        B.b bVar = new B.b(iOException, i3);
        Iterator it = cVar.f5424q.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            z5 |= !((q) it.next()).c(this.f5408m, bVar, false);
        }
        e0.l lVar = cVar.f5422o;
        if (z5) {
            lVar.getClass();
            long v3 = e0.l.v(bVar);
            if (v3 != -9223372036854775807L) {
                c0255e = new C0255e(0, v3, false);
            } else {
                c0255e = s0.n.f9200r;
            }
        }
        boolean a3 = c0255e.a();
        cVar.f5425r.i(rVar, i5, iOException, true ^ a3);
        if (!a3) {
            lVar.getClass();
        }
        return c0255e;
    }

    public final void d(boolean z3) {
        Uri uri;
        if (z3) {
            uri = b();
        } else {
            uri = this.f5408m;
        }
        g(uri);
    }

    @Override // s0.i
    public final void e(s0.k kVar, long j3, long j4, boolean z3) {
        s0.q qVar = (s0.q) kVar;
        long j5 = qVar.f9204m;
        Uri uri = qVar.f9207p.f2724o;
        o0.r rVar = new o0.r(j4);
        c cVar = this.x;
        cVar.f5422o.getClass();
        cVar.f5425r.c(rVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void f(Uri uri) {
        c cVar = this.x;
        s0.q qVar = new s0.q(this.f5410o, uri, 4, cVar.f5421n.f(cVar.f5429v, this.f5411p));
        e0.l lVar = cVar.f5422o;
        int i3 = qVar.f9206o;
        cVar.f5425r.k(new o0.r(qVar.f9204m, qVar.f9205n, this.f5409n.f(qVar, this, lVar.u(i3))), i3, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void g(Uri uri) {
        this.f5415t = 0L;
        if (!this.f5416u) {
            s0.n nVar = this.f5409n;
            if (!nVar.d() && !nVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = this.f5414s;
                if (elapsedRealtime < j3) {
                    this.f5416u = true;
                    this.x.f5427t.postDelayed(new U.n(6, this, uri), j3 - elapsedRealtime);
                    return;
                }
                f(uri);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0218  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(f0.i r47, o0.r r48) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.b.h(f0.i, o0.r):void");
    }

    @Override // s0.i
    public final void j(s0.k kVar, long j3, long j4) {
        s0.q qVar = (s0.q) kVar;
        m mVar = (m) qVar.f9209r;
        Uri uri = qVar.f9207p.f2724o;
        o0.r rVar = new o0.r(j4);
        if (mVar instanceof i) {
            h((i) mVar, rVar);
            this.x.f5425r.e(rVar, 4);
        } else {
            H b3 = H.b("Loaded playlist has unexpected type.", null);
            this.f5417v = b3;
            this.x.f5425r.i(rVar, 4, b3, true);
        }
        this.x.f5422o.getClass();
    }
}
