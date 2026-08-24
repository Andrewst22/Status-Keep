package w0;

import D1.I;
import D1.b0;
import c1.C0230D;
import c1.C0234a;
import c1.C0236c;
import c1.C0237d;
import g0.C0271b;
import g2.C0276a;
import java.util.ArrayList;
import x0.C0899a;
/* loaded from: classes.dex */
public final class m implements r {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f9612e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: f  reason: collision with root package name */
    public static final C0276a f9613f = new C0276a(new C0271b(9));

    /* renamed from: g  reason: collision with root package name */
    public static final C0276a f9614g = new C0276a(new C0271b(10));

    /* renamed from: a  reason: collision with root package name */
    public b0 f9615a;

    /* renamed from: d  reason: collision with root package name */
    public int f9618d;

    /* renamed from: c  reason: collision with root package name */
    public B1.b f9617c = new B1.b(18);

    /* renamed from: b  reason: collision with root package name */
    public boolean f9616b = true;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:10:0x0024, B:12:0x002b, B:13:0x002e, B:16:0x0036, B:19:0x003c, B:22:0x0042, B:23:0x0045, B:26:0x004a, B:27:0x0050, B:29:0x0056, B:31:0x0060, B:33:0x0068, B:35:0x0070, B:37:0x0078, B:39:0x0080, B:41:0x0088, B:42:0x0090), top: B:48:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:10:0x0024, B:12:0x002b, B:13:0x002e, B:16:0x0036, B:19:0x003c, B:22:0x0042, B:23:0x0045, B:26:0x004a, B:27:0x0050, B:29:0x0056, B:31:0x0060, B:33:0x0068, B:35:0x0070, B:37:0x0078, B:39:0x0080, B:41:0x0088, B:42:0x0090), top: B:48:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:5:0x0015, B:8:0x001c, B:10:0x0024, B:12:0x002b, B:13:0x002e, B:16:0x0036, B:19:0x003c, B:22:0x0042, B:23:0x0045, B:26:0x004a, B:27:0x0050, B:29:0x0056, B:31:0x0060, B:33:0x0068, B:35:0x0070, B:37:0x0078, B:39:0x0080, B:41:0x0088, B:42:0x0090), top: B:48:0x0001 }] */
    @Override // w0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized w0.o[] a(android.net.Uri r7, java.util.Map r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L48
            int[] r1 = w0.m.f9612e     // Catch: java.lang.Throwable -> L48
            r2 = 21
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "Content-Type"
            java.lang.Object r8 = r8.get(r3)     // Catch: java.lang.Throwable -> L48
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L48
            r3 = 0
            if (r8 == 0) goto L23
            boolean r4 = r8.isEmpty()     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L1c
            goto L23
        L1c:
            java.lang.Object r8 = r8.get(r3)     // Catch: java.lang.Throwable -> L48
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L48
            goto L24
        L23:
            r8 = 0
        L24:
            int r8 = android.support.v4.media.session.a.C(r8)     // Catch: java.lang.Throwable -> L48
            r4 = -1
            if (r8 == r4) goto L2e
            r6.b(r8, r0)     // Catch: java.lang.Throwable -> L48
        L2e:
            int r7 = android.support.v4.media.session.a.D(r7)     // Catch: java.lang.Throwable -> L48
            if (r7 == r4) goto L39
            if (r7 == r8) goto L39
            r6.b(r7, r0)     // Catch: java.lang.Throwable -> L48
        L39:
            r4 = 0
        L3a:
            if (r4 >= r2) goto L4a
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L48
            if (r5 == r8) goto L45
            if (r5 == r7) goto L45
            r6.b(r5, r0)     // Catch: java.lang.Throwable -> L48
        L45:
            int r4 = r4 + 1
            goto L3a
        L48:
            r7 = move-exception
            goto L97
        L4a:
            int r7 = r0.size()     // Catch: java.lang.Throwable -> L48
            w0.o[] r7 = new w0.o[r7]     // Catch: java.lang.Throwable -> L48
        L50:
            int r8 = r0.size()     // Catch: java.lang.Throwable -> L48
            if (r3 >= r8) goto L95
            java.lang.Object r8 = r0.get(r3)     // Catch: java.lang.Throwable -> L48
            w0.o r8 = (w0.o) r8     // Catch: java.lang.Throwable -> L48
            boolean r1 = r6.f9616b     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L90
            w0.o r1 = r8.d()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1 instanceof Q0.n     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L90
            w0.o r1 = r8.d()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1 instanceof Q0.q     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L90
            w0.o r1 = r8.d()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1 instanceof c1.C0230D     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L90
            w0.o r1 = r8.d()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1 instanceof y0.b     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L90
            w0.o r1 = r8.d()     // Catch: java.lang.Throwable -> L48
            boolean r1 = r1 instanceof O0.d     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L90
            T0.m r1 = new T0.m     // Catch: java.lang.Throwable -> L48
            B1.b r2 = r6.f9617c     // Catch: java.lang.Throwable -> L48
            r1.<init>(r8, r2)     // Catch: java.lang.Throwable -> L48
            r8 = r1
        L90:
            r7[r3] = r8     // Catch: java.lang.Throwable -> L48
            int r3 = r3 + 1
            goto L50
        L95:
            monitor-exit(r6)
            return r7
        L97:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L48
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.m.a(android.net.Uri, java.util.Map):w0.o[]");
    }

    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, d1.d] */
    public final void b(int i3, ArrayList arrayList) {
        int i4;
        int i5 = 2;
        int i6 = 0;
        switch (i3) {
            case 0:
                arrayList.add(new C0234a());
                return;
            case 1:
                arrayList.add(new C0236c());
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                arrayList.add(new C0237d());
                return;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                arrayList.add(new C0899a());
                return;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                o c3 = f9613f.c(0);
                if (c3 != null) {
                    arrayList.add(c3);
                    return;
                } else {
                    arrayList.add(new B0.d());
                    return;
                }
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                arrayList.add(new C0.b());
                return;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                B1.b bVar = this.f9617c;
                if (this.f9616b) {
                    i5 = 0;
                }
                arrayList.add(new O0.d(bVar, i5));
                return;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                arrayList.add(new P0.d());
                return;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                B1.b bVar2 = this.f9617c;
                if (this.f9616b) {
                    i4 = 0;
                } else {
                    i4 = 32;
                }
                D1.G g3 = I.f197n;
                arrayList.add(new Q0.n(bVar2, i4, null, null, b0.f231q, null));
                B1.b bVar3 = this.f9617c;
                if (!this.f9616b) {
                    i6 = 16;
                }
                arrayList.add(new Q0.q(bVar3, i6));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new c1.z());
                return;
            case 11:
                if (this.f9615a == null) {
                    D1.G g4 = I.f197n;
                    this.f9615a = b0.f231q;
                }
                arrayList.add(new C0230D(1, !this.f9616b ? 1 : 0, this.f9617c, new U.y(0L), new B.b(0, this.f9615a)));
                return;
            case 12:
                ?? obj = new Object();
                obj.f5178c = 0;
                obj.f5179d = -1L;
                obj.f5181f = -1;
                obj.f5182g = -1L;
                arrayList.add(obj);
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new A0.a(this.f9618d));
                return;
            case 15:
                o c4 = f9614g.c(new Object[0]);
                if (c4 != null) {
                    arrayList.add(c4);
                    return;
                }
                return;
            case 16:
                arrayList.add(new y0.b(!this.f9616b ? 1 : 0, this.f9617c));
                return;
            case 17:
                arrayList.add(new A0.a(1, (byte) 0));
                return;
            case 18:
                arrayList.add(new D0.a(1));
                return;
            case 19:
                arrayList.add(new A0.a(0, (byte) 0));
                return;
            case 20:
                arrayList.add(new D0.a(0));
                return;
            case 21:
                arrayList.add(new D0.a(2));
                return;
        }
    }
}
