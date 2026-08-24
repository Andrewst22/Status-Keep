package f0;

import R.C0112o;
import R.C0113p;
import R.G;
import U.A;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import e0.C0262c;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o0.r;
/* loaded from: classes.dex */
public final class c implements s0.i {

    /* renamed from: A  reason: collision with root package name */
    public static final Z.c f5419A = new Z.c(29);

    /* renamed from: m  reason: collision with root package name */
    public final C0262c f5420m;

    /* renamed from: n  reason: collision with root package name */
    public final p f5421n;

    /* renamed from: o  reason: collision with root package name */
    public final e0.l f5422o;

    /* renamed from: r  reason: collision with root package name */
    public d0.d f5425r;

    /* renamed from: s  reason: collision with root package name */
    public s0.n f5426s;

    /* renamed from: t  reason: collision with root package name */
    public Handler f5427t;

    /* renamed from: u  reason: collision with root package name */
    public e0.o f5428u;

    /* renamed from: v  reason: collision with root package name */
    public l f5429v;

    /* renamed from: w  reason: collision with root package name */
    public Uri f5430w;
    public i x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f5431y;

    /* renamed from: q  reason: collision with root package name */
    public final CopyOnWriteArrayList f5424q = new CopyOnWriteArrayList();

    /* renamed from: p  reason: collision with root package name */
    public final HashMap f5423p = new HashMap();

    /* renamed from: z  reason: collision with root package name */
    public long f5432z = -9223372036854775807L;

    public c(C0262c c0262c, e0.l lVar, p pVar) {
        this.f5420m = c0262c;
        this.f5421n = pVar;
        this.f5422o = lVar;
    }

    public final i a(boolean z3, Uri uri) {
        HashMap hashMap = this.f5423p;
        i iVar = ((b) hashMap.get(uri)).f5411p;
        if (iVar != null && z3) {
            if (!uri.equals(this.f5430w)) {
                List list = this.f5429v.f5484e;
                int i3 = 0;
                while (true) {
                    if (i3 >= list.size()) {
                        break;
                    } else if (uri.equals(((k) list.get(i3)).f5476a)) {
                        i iVar2 = this.x;
                        if (iVar2 == null || !iVar2.f5465o) {
                            this.f5430w = uri;
                            b bVar = (b) hashMap.get(uri);
                            i iVar3 = bVar.f5411p;
                            if (iVar3 != null && iVar3.f5465o) {
                                this.x = iVar3;
                                this.f5428u.x(iVar3);
                            } else {
                                bVar.g(b(uri));
                            }
                        }
                    } else {
                        i3++;
                    }
                }
            }
            b bVar2 = (b) hashMap.get(uri);
            i iVar4 = bVar2.f5411p;
            if (!bVar2.f5418w) {
                bVar2.f5418w = true;
                if (iVar4 != null && !iVar4.f5465o) {
                    bVar2.d(true);
                }
            }
        }
        return iVar;
    }

    public final Uri b(Uri uri) {
        e eVar;
        i iVar = this.x;
        if (iVar != null && iVar.f5472v.f5453e && (eVar = (e) iVar.f5470t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(eVar.f5435b));
            int i3 = eVar.f5436c;
            if (i3 != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i3));
            }
            return buildUpon.build();
        }
        return uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    @Override // s0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final d1.C0255e c(s0.k r5, long r6, long r8, java.io.IOException r10, int r11) {
        /*
            r4 = this;
            r6 = 0
            s0.q r5 = (s0.q) r5
            o0.r r7 = new o0.r
            long r0 = r5.f9204m
            W.A r0 = r5.f9207p
            android.net.Uri r0 = r0.f2724o
            r7.<init>(r8)
            e0.l r8 = r4.f5422o
            r8.getClass()
            boolean r8 = r10 instanceof R.H
            r9 = 1
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 != 0) goto L4c
            boolean r8 = r10 instanceof java.io.FileNotFoundException
            if (r8 != 0) goto L4c
            boolean r8 = r10 instanceof W.t
            if (r8 != 0) goto L4c
            boolean r8 = r10 instanceof s0.m
            if (r8 != 0) goto L4c
            int r8 = W.i.f2752n
            r8 = r10
        L2c:
            if (r8 == 0) goto L41
            boolean r2 = r8 instanceof W.i
            if (r2 == 0) goto L3c
            r2 = r8
            W.i r2 = (W.i) r2
            int r2 = r2.f2753m
            r3 = 2008(0x7d8, float:2.814E-42)
            if (r2 != r3) goto L3c
            goto L4c
        L3c:
            java.lang.Throwable r8 = r8.getCause()
            goto L2c
        L41:
            int r11 = r11 - r9
            int r11 = r11 * 1000
            r8 = 5000(0x1388, float:7.006E-42)
            int r8 = java.lang.Math.min(r11, r8)
            long r2 = (long) r8
            goto L4d
        L4c:
            r2 = r0
        L4d:
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L53
        L52:
            r9 = 0
        L53:
            d0.d r8 = r4.f5425r
            int r5 = r5.f9206o
            r8.i(r7, r5, r10, r9)
            if (r9 == 0) goto L5f
            d1.e r5 = s0.n.f9200r
            goto L64
        L5f:
            d1.e r5 = new d1.e
            r5.<init>(r6, r2, r6)
        L64:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.c.c(s0.k, long, long, java.io.IOException, int):d1.e");
    }

    public final boolean d(Uri uri) {
        int i3;
        b bVar = (b) this.f5423p.get(uri);
        if (bVar.f5411p == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, A.Z(bVar.f5411p.f5471u));
        i iVar = bVar.f5411p;
        if (!iVar.f5465o && (i3 = iVar.f5454d) != 2 && i3 != 1 && bVar.f5412q + max <= elapsedRealtime) {
            return false;
        }
        return true;
    }

    @Override // s0.i
    public final void e(s0.k kVar, long j3, long j4, boolean z3) {
        s0.q qVar = (s0.q) kVar;
        long j5 = qVar.f9204m;
        Uri uri = qVar.f9207p.f2724o;
        r rVar = new r(j4);
        this.f5422o.getClass();
        this.f5425r.c(rVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // s0.i
    public final void j(s0.k kVar, long j3, long j4) {
        l lVar;
        s0.q qVar = (s0.q) kVar;
        m mVar = (m) qVar.f9209r;
        boolean z3 = mVar instanceof i;
        if (z3) {
            String str = mVar.f5491a;
            l lVar2 = l.f5482l;
            Uri parse = Uri.parse(str);
            C0112o c0112o = new C0112o();
            c0112o.f1926a = "0";
            c0112o.f1936k = G.l("application/x-mpegURL");
            lVar = new l("", Collections.emptyList(), Collections.singletonList(new k(parse, new C0113p(c0112o), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            lVar = (l) mVar;
        }
        this.f5429v = lVar;
        this.f5430w = ((k) lVar.f5484e.get(0)).f5476a;
        this.f5424q.add(new C0266a(this));
        List list = lVar.f5483d;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Uri uri = (Uri) list.get(i3);
            this.f5423p.put(uri, new b(this, uri));
        }
        Uri uri2 = qVar.f9207p.f2724o;
        r rVar = new r(j4);
        b bVar = (b) this.f5423p.get(this.f5430w);
        if (z3) {
            bVar.h((i) mVar, rVar);
        } else {
            bVar.d(false);
        }
        this.f5422o.getClass();
        this.f5425r.e(rVar, 4);
    }
}
