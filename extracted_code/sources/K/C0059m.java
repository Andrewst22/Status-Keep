package K;

import K2.C0090t;
import K2.InterfaceC0091u;
import R.C0113p;
import android.os.SystemClock;
import android.util.Pair;
import c0.C0222b;
import g2.C0276a;
import g2.C0277b;
import g2.InterfaceC0278c;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import o0.AbstractC0686j;
import o0.C0701z;
import o0.InterfaceC0675D;
import t2.AbstractC0827d;
/* renamed from: K.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059m implements T0.l, InterfaceC0675D, d0.e {

    /* renamed from: m  reason: collision with root package name */
    public final Object f650m;

    /* renamed from: n  reason: collision with root package name */
    public Object f651n;

    /* renamed from: o  reason: collision with root package name */
    public Object f652o;

    /* renamed from: p  reason: collision with root package name */
    public Object f653p;

    public C0059m(InterfaceC0091u interfaceC0091u, L l3, N n3) {
        this.f650m = interfaceC0091u;
        this.f651n = n3;
        this.f652o = M2.i.a(Integer.MAX_VALUE, 0, 6);
        this.f653p = new C1.j(5);
        K2.P p3 = (K2.P) interfaceC0091u.j().d(C0090t.f856n);
        if (p3 != null) {
            ((K2.Z) p3).I(false, true, new S2.b(2, l3, this));
        }
    }

    public static void j(long j3, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j3) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            hashMap.remove(arrayList.get(i3));
        }
    }

    @Override // o0.InterfaceC0675D
    public void B(int i3, C0701z c0701z, o0.r rVar, l0.g gVar) {
        if (d(i3, c0701z)) {
            ((d0.d) this.f651n).l(rVar, f(gVar, c0701z));
        }
    }

    @Override // o0.InterfaceC0675D
    public void C(int i3, C0701z c0701z, o0.r rVar, l0.g gVar) {
        if (d(i3, c0701z)) {
            ((d0.d) this.f651n).g(rVar, f(gVar, c0701z));
        }
    }

    public ArrayList a(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.f650m;
        j(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.f651n;
        j(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            C0222b c0222b = (C0222b) list.get(i3);
            if (!hashMap.containsKey(c0222b.f4710b) && !hashMap2.containsKey(Integer.valueOf(c0222b.f4711c))) {
                arrayList.add(c0222b);
            }
        }
        return arrayList;
    }

    @Override // T0.l
    public /* synthetic */ void b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(w2.b r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof K.C0055i
            if (r0 == 0) goto L13
            r0 = r7
            K.i r0 = (K.C0055i) r0
            int r1 = r0.f629s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f629s = r1
            goto L18
        L13:
            K.i r0 = new K.i
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f627q
            v2.a r1 = v2.EnumC0879a.f9494m
            int r2 = r0.f629s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            K.m r0 = r0.f626p
            n2.AbstractC0664g.w(r7)
            goto L64
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            K.m r0 = r0.f626p
            n2.AbstractC0664g.w(r7)
            goto L74
        L3a:
            n2.AbstractC0664g.w(r7)
            java.lang.Object r7 = r6.f652o
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r2 = r6.f653p
            K.Q r2 = (K.Q) r2
            if (r7 == 0) goto L67
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4e
            goto L67
        L4e:
            K.a0 r7 = r2.g()
            K.l r4 = new K.l
            r5 = 0
            r4.<init>(r2, r6, r5)
            r0.f626p = r6
            r0.f629s = r3
            java.lang.Object r7 = r7.b(r4, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            r0 = r6
        L64:
            K.c r7 = (K.C0049c) r7
            goto L76
        L67:
            r0.f626p = r6
            r0.f629s = r4
            r7 = 0
            java.lang.Object r7 = K.Q.f(r2, r7, r0)
            if (r7 != r1) goto L73
            return r1
        L73:
            r0 = r6
        L74:
            K.c r7 = (K.C0049c) r7
        L76:
            java.lang.Object r0 = r0.f653p
            K.Q r0 = (K.Q) r0
            C1.j r0 = r0.f574t
            r0.R(r7)
            s2.g r7 = s2.C0808g.f9229a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: K.C0059m.c(w2.b):java.lang.Object");
    }

    public boolean d(int i3, C0701z c0701z) {
        C0701z c0701z2;
        Object obj = this.f650m;
        AbstractC0686j abstractC0686j = (AbstractC0686j) this.f653p;
        if (c0701z != null) {
            c0701z2 = abstractC0686j.w(obj, c0701z);
            if (c0701z2 == null) {
                return false;
            }
        } else {
            c0701z2 = null;
        }
        int y3 = abstractC0686j.y(i3, obj);
        d0.d dVar = (d0.d) this.f651n;
        if (dVar.f5148a != y3 || !U.A.a(dVar.f5149b, c0701z2)) {
            this.f651n = new d0.d(abstractC0686j.f8570o.f5150c, y3, c0701z2);
        }
        d0.d dVar2 = (d0.d) this.f652o;
        if (dVar2.f5148a != y3 || !U.A.a(dVar2.f5149b, c0701z2)) {
            this.f652o = new d0.d(abstractC0686j.f8571p.f5150c, y3, c0701z2);
            return true;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
        r8.F(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
        r9.reset();
        r6.E(r8.f2477a, r8.f2479c);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    @Override // T0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(byte[] r34, int r35, int r36, T0.k r37, U.d r38) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K.C0059m.e(byte[], int, int, T0.k, U.d):void");
    }

    public l0.g f(l0.g gVar, C0701z c0701z) {
        AbstractC0686j abstractC0686j = (AbstractC0686j) this.f653p;
        Object obj = this.f650m;
        long j3 = gVar.f8024d;
        long x = abstractC0686j.x(j3, obj);
        long j4 = gVar.f8025e;
        long x3 = abstractC0686j.x(j4, obj);
        if (x == j3 && x3 == j4) {
            return gVar;
        }
        return new l0.g(gVar.f8021a, gVar.f8022b, (C0113p) gVar.f8026f, gVar.f8023c, gVar.f8027g, x, x3);
    }

    @Override // o0.InterfaceC0675D
    public void g(int i3, C0701z c0701z, l0.g gVar) {
        if (d(i3, c0701z)) {
            ((d0.d) this.f651n).m(f(gVar, c0701z));
        }
    }

    @Override // o0.InterfaceC0675D
    public void h(int i3, C0701z c0701z, o0.r rVar, l0.g gVar) {
        if (d(i3, c0701z)) {
            ((d0.d) this.f651n).d(rVar, f(gVar, c0701z));
        }
    }

    @Override // o0.InterfaceC0675D
    public void i(int i3, C0701z c0701z, l0.g gVar) {
        if (d(i3, c0701z)) {
            ((d0.d) this.f651n).b(f(gVar, c0701z));
        }
    }

    @Override // T0.l
    public int k() {
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[Catch: all -> 0x0097, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0097, blocks: (B:27:0x0066, B:31:0x0078), top: B:45:0x0066 }] */
    /* JADX WARN: Type inference failed for: r2v6, types: [S2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(w2.b r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof K.V
            if (r0 == 0) goto L13
            r0 = r8
            K.V r0 = (K.V) r0
            int r1 = r0.f588t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f588t = r1
            goto L18
        L13:
            K.V r0 = new K.V
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f586r
            v2.a r1 = v2.EnumC0879a.f9494m
            int r2 = r0.f588t
            s2.g r3 = s2.C0808g.f9229a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            S2.a r1 = r0.f585q
            K.m r0 = r0.f584p
            n2.AbstractC0664g.w(r8)     // Catch: java.lang.Throwable -> L31
            goto L87
        L31:
            r8 = move-exception
            goto L99
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            S2.a r2 = r0.f585q
            K.m r5 = r0.f584p
            n2.AbstractC0664g.w(r8)
            r8 = r2
            goto L66
        L44:
            n2.AbstractC0664g.w(r8)
            java.lang.Object r8 = r7.f651n
            K2.l r8 = (K2.C0083l) r8
            java.lang.Object r8 = r8.E()
            boolean r8 = r8 instanceof K2.L
            if (r8 != 0) goto L54
            return r3
        L54:
            r0.f584p = r7
            java.lang.Object r8 = r7.f650m
            S2.d r8 = (S2.d) r8
            r0.f585q = r8
            r0.f588t = r5
            java.lang.Object r2 = r8.c(r0)
            if (r2 != r1) goto L65
            return r1
        L65:
            r5 = r7
        L66:
            java.lang.Object r2 = r5.f651n     // Catch: java.lang.Throwable -> L97
            K2.l r2 = (K2.C0083l) r2     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r2.E()     // Catch: java.lang.Throwable -> L97
            boolean r2 = r2 instanceof K2.L     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto L78
            S2.d r8 = (S2.d) r8
            r8.e(r6)
            return r3
        L78:
            r0.f584p = r5     // Catch: java.lang.Throwable -> L97
            r0.f585q = r8     // Catch: java.lang.Throwable -> L97
            r0.f588t = r4     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = r5.c(r0)     // Catch: java.lang.Throwable -> L97
            if (r0 != r1) goto L85
            return r1
        L85:
            r1 = r8
            r0 = r5
        L87:
            java.lang.Object r8 = r0.f651n     // Catch: java.lang.Throwable -> L31
            K2.l r8 = (K2.C0083l) r8     // Catch: java.lang.Throwable -> L31
            r8.K(r3)     // Catch: java.lang.Throwable -> L31
            S2.d r1 = (S2.d) r1
            r1.e(r6)
            return r3
        L94:
            r1 = r8
            r8 = r0
            goto L99
        L97:
            r0 = move-exception
            goto L94
        L99:
            S2.d r1 = (S2.d) r1
            r1.e(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: K.C0059m.l(w2.b):java.lang.Object");
    }

    public C0222b m(List list) {
        ArrayList a3 = a(list);
        if (a3.size() < 2) {
            return (C0222b) D1.r.k(a3, null);
        }
        Collections.sort(a3, new U0.d(1));
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = ((C0222b) a3.get(0)).f4711c;
        int i5 = 0;
        while (true) {
            if (i5 >= a3.size()) {
                break;
            }
            C0222b c0222b = (C0222b) a3.get(i5);
            if (i4 != c0222b.f4711c) {
                if (arrayList.size() == 1) {
                    return (C0222b) a3.get(0);
                }
            } else {
                arrayList.add(new Pair(c0222b.f4710b, Integer.valueOf(c0222b.f4712d)));
                i5++;
            }
        }
        HashMap hashMap = (HashMap) this.f652o;
        C0222b c0222b2 = (C0222b) hashMap.get(arrayList);
        if (c0222b2 == null) {
            List subList = a3.subList(0, arrayList.size());
            int i6 = 0;
            for (int i7 = 0; i7 < subList.size(); i7++) {
                i6 += ((C0222b) subList.get(i7)).f4712d;
            }
            int nextInt = ((Random) this.f653p).nextInt(i6);
            int i8 = 0;
            while (true) {
                if (i3 < subList.size()) {
                    C0222b c0222b3 = (C0222b) subList.get(i3);
                    i8 += c0222b3.f4712d;
                    if (nextInt < i8) {
                        c0222b2 = c0222b3;
                        break;
                    }
                    i3++;
                } else {
                    c0222b2 = (C0222b) D1.r.l(subList);
                    break;
                }
            }
            hashMap.put(arrayList, c0222b2);
        }
        return c0222b2;
    }

    public void n(Serializable serializable, g2.d dVar) {
        C0277b c0277b;
        ByteBuffer b3 = ((g2.n) this.f652o).b(serializable);
        if (dVar == null) {
            c0277b = null;
        } else {
            c0277b = new C0277b(0, this, dVar);
        }
        ((g2.g) this.f650m).c((String) this.f651n, b3, c0277b);
    }

    public void o(InterfaceC0278c interfaceC0278c) {
        String str = (String) this.f651n;
        g2.g gVar = (g2.g) this.f650m;
        C0276a c0276a = null;
        B1.b bVar = (B1.b) this.f653p;
        if (bVar != null) {
            if (interfaceC0278c != null) {
                c0276a = new C0276a(1, this, interfaceC0278c);
            }
            gVar.l(str, c0276a, bVar);
            return;
        }
        if (interfaceC0278c != null) {
            c0276a = new C0276a(1, this, interfaceC0278c);
        }
        gVar.j(str, c0276a);
    }

    @Override // o0.InterfaceC0675D
    public void q(int i3, C0701z c0701z, o0.r rVar, l0.g gVar, IOException iOException, boolean z3) {
        if (d(i3, c0701z)) {
            ((d0.d) this.f651n).j(rVar, f(gVar, c0701z), iOException, z3);
        }
    }

    @Override // T0.l
    public /* synthetic */ T0.d r(byte[] bArr, int i3, int i4) {
        return D2.h.a(this, bArr, i4);
    }

    public C0059m(int i3) {
        switch (i3) {
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                Random random = new Random();
                this.f652o = new HashMap();
                this.f653p = random;
                this.f650m = new HashMap();
                this.f651n = new HashMap();
                return;
            default:
                this.f650m = new U.t();
                this.f651n = new U.t();
                this.f652o = new W0.a();
                return;
        }
    }

    public C0059m(g2.g gVar, String str, g2.n nVar, B1.b bVar) {
        this.f650m = gVar;
        this.f651n = str;
        this.f652o = nVar;
        this.f653p = bVar;
    }

    public C0059m(AbstractC0686j abstractC0686j, Object obj) {
        this.f653p = abstractC0686j;
        this.f651n = abstractC0686j.a(null);
        this.f652o = new d0.d(abstractC0686j.f8571p.f5150c, 0, null);
        this.f650m = obj;
    }

    public C0059m(Q q3, List list) {
        this.f653p = q3;
        this.f650m = S2.e.a();
        K2.Z z3 = new K2.Z(true);
        z3.H(null);
        this.f651n = z3;
        this.f652o = AbstractC0827d.H(list);
    }

    public C0059m(String str, String[] strArr, String str2, f2.p pVar) {
        this.f650m = str;
        this.f651n = strArr;
        this.f653p = str2;
        this.f652o = pVar;
    }

    public C0059m(o0.b0 b0Var, boolean[] zArr) {
        this.f650m = b0Var;
        this.f651n = zArr;
        int i3 = b0Var.f8579a;
        this.f652o = new boolean[i3];
        this.f653p = new boolean[i3];
    }
}
