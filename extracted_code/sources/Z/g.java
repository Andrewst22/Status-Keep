package Z;

import R.T;
import o0.C0701z;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f3485a;

    /* renamed from: b  reason: collision with root package name */
    public int f3486b;

    /* renamed from: c  reason: collision with root package name */
    public long f3487c;

    /* renamed from: d  reason: collision with root package name */
    public final C0701z f3488d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3489e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3490f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ h f3491g;

    public g(h hVar, String str, int i3, C0701z c0701z) {
        long j3;
        this.f3491g = hVar;
        this.f3485a = str;
        this.f3486b = i3;
        if (c0701z == null) {
            j3 = -1;
        } else {
            j3 = c0701z.f8656d;
        }
        this.f3487c = j3;
        if (c0701z != null && c0701z.b()) {
            this.f3488d = c0701z;
        }
    }

    public final boolean a(a aVar) {
        C0701z c0701z = aVar.f3457d;
        if (c0701z == null) {
            if (this.f3486b != aVar.f3456c) {
                return true;
            }
            return false;
        }
        long j3 = this.f3487c;
        if (j3 == -1) {
            return false;
        }
        if (c0701z.f8656d > j3) {
            return true;
        }
        C0701z c0701z2 = this.f3488d;
        if (c0701z2 == null) {
            return false;
        }
        T t3 = aVar.f3455b;
        int b3 = t3.b(c0701z.f8653a);
        int b4 = t3.b(c0701z2.f8653a);
        if (c0701z.f8656d < c0701z2.f8656d || b3 < b4) {
            return false;
        }
        if (b3 > b4) {
            return true;
        }
        boolean b5 = c0701z.b();
        int i3 = c0701z2.f8654b;
        if (b5) {
            int i4 = c0701z.f8654b;
            if (i4 > i3) {
                return true;
            }
            if (i4 == i3) {
                if (c0701z.f8655c > c0701z2.f8655c) {
                    return true;
                }
            }
            return false;
        }
        int i5 = c0701z.f8657e;
        if (i5 == -1 || i5 > i3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 < r8.o()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(R.T r7, R.T r8) {
        /*
            r6 = this;
            int r0 = r6.f3486b
            int r1 = r7.o()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L11
            int r7 = r8.o()
            if (r0 >= r7) goto L36
            goto L37
        L11:
            Z.h r1 = r6.f3491g
            R.S r4 = r1.f3494a
            r7.n(r0, r4)
            R.S r0 = r1.f3494a
            int r4 = r0.f1817n
        L1c:
            int r5 = r0.f1818o
            if (r4 > r5) goto L36
            java.lang.Object r5 = r7.l(r4)
            int r5 = r8.b(r5)
            if (r5 == r3) goto L33
            R.Q r7 = r1.f3495b
            R.Q r7 = r8.f(r5, r7, r2)
            int r0 = r7.f1797c
            goto L37
        L33:
            int r4 = r4 + 1
            goto L1c
        L36:
            r0 = -1
        L37:
            r6.f3486b = r0
            if (r0 != r3) goto L3c
            return r2
        L3c:
            o0.z r7 = r6.f3488d
            r0 = 1
            if (r7 != 0) goto L42
            return r0
        L42:
            java.lang.Object r7 = r7.f8653a
            int r7 = r8.b(r7)
            if (r7 == r3) goto L4b
            r2 = 1
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Z.g.b(R.T, R.T):boolean");
    }
}
