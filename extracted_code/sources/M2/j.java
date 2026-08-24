package M2;

import P2.v;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* loaded from: classes.dex */
public final class j extends v {

    /* renamed from: q  reason: collision with root package name */
    public final b f1094q;

    /* renamed from: r  reason: collision with root package name */
    public final AtomicReferenceArray f1095r;

    public j(long j3, j jVar, b bVar, int i3) {
        super(j3, jVar, i3);
        this.f1094q = bVar;
        this.f1095r = new AtomicReferenceArray(d.f1071b * 2);
    }

    @Override // P2.v
    public final int f() {
        return d.f1071b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
        if (r1 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
        D2.i.b(r4);
        r7 = r4.f1068n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
        if (r7 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0067, code lost:
        P2.AbstractC0097a.a(r7, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    @Override // P2.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r7, u2.i r8) {
        /*
            r6 = this;
            int r0 = M2.d.f1071b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f1095r
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.k(r7)
            boolean r3 = r2 instanceof K2.l0
            M2.b r4 = r6.f1094q
            r5 = 0
            if (r3 != 0) goto L6b
            boolean r3 = r2 instanceof M2.s
            if (r3 == 0) goto L22
            goto L6b
        L22:
            C1.f r3 = M2.d.f1079j
            if (r2 == r3) goto L5b
            C1.f r3 = M2.d.f1080k
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            C1.f r3 = M2.d.f1076g
            if (r2 == r3) goto L12
            C1.f r3 = M2.d.f1075f
            if (r2 != r3) goto L34
            goto L12
        L34:
            C1.f r7 = M2.d.f1078i
            if (r2 == r7) goto L5a
            C1.f r7 = M2.d.f1073d
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            C1.f r7 = M2.d.f1081l
            if (r2 != r7) goto L42
            return
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            return
        L5b:
            r6.m(r7, r5)
            if (r1 == 0) goto L6a
            D2.i.b(r4)
            C2.l r7 = r4.f1068n
            if (r7 == 0) goto L6a
            P2.AbstractC0097a.a(r7, r0, r8)
        L6a:
            return
        L6b:
            if (r1 == 0) goto L70
            C1.f r3 = M2.d.f1079j
            goto L72
        L70:
            C1.f r3 = M2.d.f1080k
        L72:
            boolean r2 = r6.j(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.m(r7, r5)
            r2 = r1 ^ 1
            r6.l(r7, r2)
            if (r1 == 0) goto L8c
            D2.i.b(r4)
            C2.l r7 = r4.f1068n
            if (r7 == 0) goto L8c
            P2.AbstractC0097a.a(r7, r0, r8)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.j.g(int, u2.i):void");
    }

    public final boolean j(int i3, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f1095r;
        int i4 = (i3 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i4, obj, obj2)) {
            if (atomicReferenceArray.get(i4) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i3) {
        return this.f1095r.get((i3 * 2) + 1);
    }

    public final void l(int i3, boolean z3) {
        if (z3) {
            b bVar = this.f1094q;
            D2.i.b(bVar);
            bVar.C((this.f1515o * d.f1071b) + i3);
        }
        h();
    }

    public final void m(int i3, Object obj) {
        this.f1095r.lazySet(i3 * 2, obj);
    }

    public final void n(int i3, C1.f fVar) {
        this.f1095r.set((i3 * 2) + 1, fVar);
    }
}
