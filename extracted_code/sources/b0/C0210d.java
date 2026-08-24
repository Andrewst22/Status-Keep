package b0;

import R.H;
import U.A;
import U.AbstractC0123a;
import android.net.Uri;
import c0.C0223c;
import c0.t;
import java.io.IOException;
import o0.r;
import s0.q;
import t0.AbstractC0817b;
/* renamed from: b0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210d implements s0.i, s0.o {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f4543m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ g f4544n;

    public /* synthetic */ C0210d(g gVar, int i3) {
        this.f4543m = i3;
        this.f4544n = gVar;
    }

    @Override // s0.o
    public void a() {
        g gVar = this.f4544n;
        gVar.f4567M.a();
        A2.b bVar = gVar.f4569O;
        if (bVar == null) {
            return;
        }
        throw bVar;
    }

    public void b() {
        long j3;
        g gVar = this.f4544n;
        synchronized (AbstractC0817b.f9240b) {
            try {
                if (AbstractC0817b.f9241c) {
                    j3 = AbstractC0817b.f9242d;
                } else {
                    j3 = -9223372036854775807L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gVar.f4578X = j3;
        gVar.A(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    @Override // s0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d1.C0255e c(s0.k r6, long r7, long r9, java.io.IOException r11, int r12) {
        /*
            r5 = this;
            r7 = 0
            r8 = 1
            b0.g r0 = r5.f4544n
            int r1 = r5.f4543m
            switch(r1) {
                case 2: goto L2b;
                default: goto L9;
            }
        L9:
            s0.q r6 = (s0.q) r6
            r0.getClass()
            o0.r r7 = new o0.r
            long r1 = r6.f9204m
            W.A r12 = r6.f9207p
            android.net.Uri r12 = r12.f2724o
            r7.<init>(r9)
            int r6 = r6.f9206o
            d0.d r9 = r0.f4558C
            r9.i(r7, r6, r11, r8)
            e0.l r6 = r0.f4587y
            r6.getClass()
            r0.z(r11)
            d1.e r6 = s0.n.f9199q
            return r6
        L2b:
            s0.q r6 = (s0.q) r6
            r0.getClass()
            o0.r r1 = new o0.r
            long r2 = r6.f9204m
            W.A r2 = r6.f9207p
            android.net.Uri r2 = r2.f2724o
            r1.<init>(r9)
            e0.l r9 = r0.f4587y
            r9.getClass()
            boolean r9 = r11 instanceof R.H
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 != 0) goto L78
            boolean r9 = r11 instanceof java.io.FileNotFoundException
            if (r9 != 0) goto L78
            boolean r9 = r11 instanceof W.t
            if (r9 != 0) goto L78
            boolean r9 = r11 instanceof s0.m
            if (r9 != 0) goto L78
            int r9 = W.i.f2752n
            r9 = r11
        L58:
            if (r9 == 0) goto L6d
            boolean r10 = r9 instanceof W.i
            if (r10 == 0) goto L68
            r10 = r9
            W.i r10 = (W.i) r10
            int r10 = r10.f2753m
            r4 = 2008(0x7d8, float:2.814E-42)
            if (r10 != r4) goto L68
            goto L78
        L68:
            java.lang.Throwable r9 = r9.getCause()
            goto L58
        L6d:
            int r12 = r12 - r8
            int r12 = r12 * 1000
            r9 = 5000(0x1388, float:7.006E-42)
            int r9 = java.lang.Math.min(r12, r9)
            long r9 = (long) r9
            goto L79
        L78:
            r9 = r2
        L79:
            int r12 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r12 != 0) goto L80
            d1.e r7 = s0.n.f9200r
            goto L86
        L80:
            d1.e r12 = new d1.e
            r12.<init>(r7, r9, r7)
            r7 = r12
        L86:
            boolean r9 = r7.a()
            r8 = r8 ^ r9
            d0.d r9 = r0.f4558C
            int r6 = r6.f9206o
            r9.i(r1, r6, r11, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.C0210d.c(s0.k, long, long, java.io.IOException, int):d1.e");
    }

    @Override // s0.i
    public void e(s0.k kVar, long j3, long j4, boolean z3) {
        switch (this.f4543m) {
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                this.f4544n.y((q) kVar, j3, j4);
                return;
            default:
                this.f4544n.y((q) kVar, j3, j4);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.io.IOException, A2.b] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, s0.p] */
    @Override // s0.i
    public void j(s0.k kVar, long j3, long j4) {
        int size;
        switch (this.f4543m) {
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                q qVar = (q) kVar;
                g gVar = this.f4544n;
                gVar.getClass();
                long j5 = qVar.f9204m;
                Uri uri = qVar.f9207p.f2724o;
                r rVar = new r(j4);
                gVar.f4587y.getClass();
                gVar.f4558C.e(rVar, qVar.f9206o);
                C0223c c0223c = (C0223c) qVar.f9209r;
                C0223c c0223c2 = gVar.f4574T;
                if (c0223c2 == null) {
                    size = 0;
                } else {
                    size = c0223c2.f4725m.size();
                }
                long j6 = c0223c.b(0).f4746b;
                int i3 = 0;
                while (i3 < size && gVar.f4574T.b(i3).f4746b < j6) {
                    i3++;
                }
                if (c0223c.f4716d) {
                    if (size - i3 > c0223c.f4725m.size()) {
                        AbstractC0123a.A("DashMediaSource", "Loaded out of sync manifest");
                    } else {
                        long j7 = gVar.f4580Z;
                        if (j7 != -9223372036854775807L && c0223c.f4720h * 1000 <= j7) {
                            AbstractC0123a.A("DashMediaSource", "Loaded stale dynamic manifest: " + c0223c.f4720h + ", " + gVar.f4580Z);
                        } else {
                            gVar.f4579Y = 0;
                        }
                    }
                    int i4 = gVar.f4579Y;
                    gVar.f4579Y = i4 + 1;
                    if (i4 < gVar.f4587y.u(qVar.f9206o)) {
                        gVar.f4570P.postDelayed(gVar.f4563H, Math.min((gVar.f4579Y - 1) * 1000, 5000));
                        return;
                    }
                    gVar.f4569O = new IOException();
                    return;
                }
                gVar.f4574T = c0223c;
                gVar.f4575U = c0223c.f4716d & gVar.f4575U;
                gVar.f4576V = j3 - j4;
                gVar.f4577W = j3;
                gVar.f4581a0 += i3;
                synchronized (gVar.f4561F) {
                    try {
                        if (qVar.f9205n.f2767a == gVar.f4572R) {
                            Uri uri2 = gVar.f4574T.f4723k;
                            if (uri2 == null) {
                                uri2 = qVar.f9207p.f2724o;
                            }
                            gVar.f4572R = uri2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C0223c c0223c3 = gVar.f4574T;
                if (c0223c3.f4716d && gVar.f4578X == -9223372036854775807L) {
                    t tVar = c0223c3.f4721i;
                    if (tVar != null) {
                        String str = tVar.f4784b;
                        if (!A.a(str, "urn:mpeg:dash:utc:direct:2014") && !A.a(str, "urn:mpeg:dash:utc:direct:2012")) {
                            if (!A.a(str, "urn:mpeg:dash:utc:http-iso:2014") && !A.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                                if (!A.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !A.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                                    if (!A.a(str, "urn:mpeg:dash:utc:ntp:2014") && !A.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                        gVar.z(new IOException("Unsupported UTC timing scheme"));
                                        return;
                                    } else {
                                        gVar.x();
                                        return;
                                    }
                                }
                                q qVar2 = new q(gVar.L, Uri.parse(tVar.f4785c), 5, new B1.b(27));
                                gVar.f4558C.k(new r(qVar2.f9204m, qVar2.f9205n, gVar.f4567M.f(qVar2, new C0210d(gVar, 4), 1)), qVar2.f9206o, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                                return;
                            }
                            q qVar3 = new q(gVar.L, Uri.parse(tVar.f4785c), 5, new Object());
                            gVar.f4558C.k(new r(qVar3.f9204m, qVar3.f9205n, gVar.f4567M.f(qVar3, new C0210d(gVar, 4), 1)), qVar3.f9206o, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                            return;
                        }
                        try {
                            gVar.f4578X = A.P(tVar.f4785c) - gVar.f4577W;
                            gVar.A(true);
                            return;
                        } catch (H e2) {
                            gVar.z(e2);
                            return;
                        }
                    }
                    gVar.x();
                    return;
                }
                gVar.A(true);
                return;
            default:
                q qVar4 = (q) kVar;
                g gVar2 = this.f4544n;
                gVar2.getClass();
                long j8 = qVar4.f9204m;
                Uri uri3 = qVar4.f9207p.f2724o;
                r rVar2 = new r(j4);
                gVar2.f4587y.getClass();
                gVar2.f4558C.e(rVar2, qVar4.f9206o);
                gVar2.f4578X = ((Long) qVar4.f9209r).longValue() - j3;
                gVar2.A(true);
                return;
        }
    }
}
