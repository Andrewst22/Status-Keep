package Z;

import R.Q;
import R.S;
import R.T;
import Y.C0145p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import o0.C0701z;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: h  reason: collision with root package name */
    public static final C0145p f3492h = new C0145p(1);

    /* renamed from: i  reason: collision with root package name */
    public static final Random f3493i = new Random();

    /* renamed from: d  reason: collision with root package name */
    public k f3497d;

    /* renamed from: f  reason: collision with root package name */
    public String f3499f;

    /* renamed from: a  reason: collision with root package name */
    public final S f3494a = new S();

    /* renamed from: b  reason: collision with root package name */
    public final Q f3495b = new Q();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f3496c = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public T f3498e = T.f1820a;

    /* renamed from: g  reason: collision with root package name */
    public long f3500g = -1;

    public final void a(g gVar) {
        long j3 = gVar.f3487c;
        if (j3 != -1) {
            this.f3500g = j3;
        }
        this.f3499f = null;
    }

    public final synchronized void b(a aVar) {
        k kVar;
        try {
            String str = this.f3499f;
            if (str != null) {
                g gVar = (g) this.f3496c.get(str);
                gVar.getClass();
                a(gVar);
            }
            Iterator it = this.f3496c.values().iterator();
            while (it.hasNext()) {
                g gVar2 = (g) it.next();
                it.remove();
                if (gVar2.f3489e && (kVar = this.f3497d) != null) {
                    kVar.d(aVar, gVar2.f3485a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        if (r13 != (-1)) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0098 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Z.g c(int r17, o0.C0701z r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.util.HashMap r3 = r0.f3496c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9c
            java.lang.Object r8 = r4.next()
            Z.g r8 = (Z.g) r8
            long r9 = r8.f3487c
            r11 = -1
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L52
            int r9 = r8.f3486b
            if (r1 != r9) goto L52
            if (r2 == 0) goto L52
            Z.h r9 = r8.f3491g
            java.util.HashMap r10 = r9.f3496c
            java.lang.String r13 = r9.f3499f
            java.lang.Object r10 = r10.get(r13)
            Z.g r10 = (Z.g) r10
            if (r10 == 0) goto L45
            long r13 = r10.f3487c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L45
            goto L4a
        L45:
            long r9 = r9.f3500g
            r13 = 1
            long r13 = r13 + r9
        L4a:
            long r9 = r2.f8656d
            int r15 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r15 < 0) goto L52
            r8.f3487c = r9
        L52:
            o0.z r9 = r8.f3488d
            if (r2 != 0) goto L5b
            int r10 = r8.f3486b
            if (r1 != r10) goto L16
            goto L7e
        L5b:
            long r13 = r2.f8656d
            if (r9 != 0) goto L6c
            boolean r10 = r18.b()
            if (r10 != 0) goto L16
            long r11 = r8.f3487c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L16
            goto L7e
        L6c:
            long r10 = r9.f8656d
            int r12 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r12 != 0) goto L16
            int r10 = r2.f8654b
            int r11 = r9.f8654b
            if (r10 != r11) goto L16
            int r10 = r2.f8655c
            int r11 = r9.f8655c
            if (r10 != r11) goto L16
        L7e:
            long r10 = r8.f3487c
            r12 = -1
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L98
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L8b
            goto L98
        L8b:
            if (r12 != 0) goto L16
            int r10 = U.A.f2405a
            o0.z r10 = r5.f3488d
            if (r10 == 0) goto L16
            if (r9 == 0) goto L16
            r5 = r8
            goto L16
        L98:
            r5 = r8
            r6 = r10
            goto L16
        L9c:
            if (r5 != 0) goto Lae
            Y.p r4 = Z.h.f3492h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            Z.g r5 = new Z.g
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
        Lae:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.h.c(int, o0.z):Z.g");
    }

    public final synchronized String d(T t3, C0701z c0701z) {
        return c(t3.g(c0701z.f8653a, this.f3495b).f1797c, c0701z).f3485a;
    }

    public final void e(a aVar) {
        C0701z c0701z;
        boolean p3 = aVar.f3455b.p();
        HashMap hashMap = this.f3496c;
        if (p3) {
            String str = this.f3499f;
            if (str != null) {
                g gVar = (g) hashMap.get(str);
                gVar.getClass();
                a(gVar);
                return;
            }
            return;
        }
        g gVar2 = (g) hashMap.get(this.f3499f);
        int i3 = aVar.f3456c;
        C0701z c0701z2 = aVar.f3457d;
        this.f3499f = c(i3, c0701z2).f3485a;
        f(aVar);
        if (c0701z2 != null && c0701z2.b()) {
            long j3 = c0701z2.f8656d;
            if (gVar2 == null || gVar2.f3487c != j3 || (c0701z = gVar2.f3488d) == null || c0701z.f8654b != c0701z2.f8654b || c0701z.f8655c != c0701z2.f8655c) {
                c(i3, new C0701z(j3, c0701z2.f8653a));
                this.f3497d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b2, B:42:0x00b6, B:43:0x00bd, B:45:0x00c7, B:47:0x00cb, B:49:0x00d8, B:52:0x00df), top: B:57:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void f(Z.a r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.h.f(Z.a):void");
    }

    public final synchronized void g(a aVar, int i3) {
        boolean z3;
        try {
            this.f3497d.getClass();
            if (i3 == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            Iterator it = this.f3496c.values().iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                if (gVar.a(aVar)) {
                    it.remove();
                    if (gVar.f3489e) {
                        boolean equals = gVar.f3485a.equals(this.f3499f);
                        if (z3 && equals) {
                            boolean z4 = gVar.f3490f;
                        }
                        if (equals) {
                            a(gVar);
                        }
                        this.f3497d.d(aVar, gVar.f3485a);
                    }
                }
            }
            e(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
