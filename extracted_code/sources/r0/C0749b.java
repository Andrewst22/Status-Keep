package r0;

import D1.F;
import D1.I;
import R.C0113p;
import R.U;
import U.A;
import U.AbstractC0123a;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
/* renamed from: r0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0749b extends AbstractC0750c {

    /* renamed from: g  reason: collision with root package name */
    public final s0.d f8889g;

    /* renamed from: h  reason: collision with root package name */
    public final long f8890h;

    /* renamed from: i  reason: collision with root package name */
    public final long f8891i;

    /* renamed from: j  reason: collision with root package name */
    public final long f8892j;

    /* renamed from: k  reason: collision with root package name */
    public final int f8893k;

    /* renamed from: l  reason: collision with root package name */
    public final int f8894l;

    /* renamed from: m  reason: collision with root package name */
    public final float f8895m;

    /* renamed from: n  reason: collision with root package name */
    public final float f8896n;

    /* renamed from: o  reason: collision with root package name */
    public final I f8897o;

    /* renamed from: p  reason: collision with root package name */
    public final U.v f8898p;

    /* renamed from: q  reason: collision with root package name */
    public float f8899q;

    /* renamed from: r  reason: collision with root package name */
    public int f8900r;

    /* renamed from: s  reason: collision with root package name */
    public int f8901s;

    /* renamed from: t  reason: collision with root package name */
    public long f8902t;

    /* renamed from: u  reason: collision with root package name */
    public p0.l f8903u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0749b(U u3, int[] iArr, s0.d dVar, long j3, long j4, long j5, I i3) {
        super(u3, iArr);
        U.v vVar = U.v.f2483a;
        if (j5 < j3) {
            AbstractC0123a.A("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j5 = j3;
        }
        this.f8889g = dVar;
        this.f8890h = j3 * 1000;
        this.f8891i = j4 * 1000;
        this.f8892j = j5 * 1000;
        this.f8893k = 1279;
        this.f8894l = 719;
        this.f8895m = 0.7f;
        this.f8896n = 0.75f;
        this.f8897o = I.j(i3);
        this.f8898p = vVar;
        this.f8899q = 1.0f;
        this.f8901s = 0;
        this.f8902t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j3 = 0;
        for (long j4 : jArr) {
            j3 += j4;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            F f3 = (F) arrayList.get(i3);
            if (f3 != null) {
                f3.a(new C0748a(j3, jArr[i3]));
            }
        }
    }

    public static long x(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        p0.l lVar = (p0.l) D1.r.l(list);
        long j3 = lVar.f8784s;
        if (j3 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j4 = lVar.f8785t;
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j4 - j3;
    }

    @Override // r0.s
    public final int e() {
        return this.f8901s;
    }

    @Override // r0.s
    public final int f() {
        return this.f8900r;
    }

    @Override // r0.AbstractC0750c, r0.s
    public final void h() {
        this.f8902t = -9223372036854775807L;
        this.f8903u = null;
    }

    @Override // r0.AbstractC0750c, r0.s
    public final void j(float f3) {
        this.f8899q = f3;
    }

    @Override // r0.s
    public final Object l() {
        return null;
    }

    @Override // r0.AbstractC0750c, r0.s
    public final int n(long j3, List list) {
        p0.l lVar;
        int i3;
        int i4;
        this.f8898p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = this.f8902t;
        if (j4 != -9223372036854775807L && elapsedRealtime - j4 < 1000 && (list.isEmpty() || ((p0.l) D1.r.l(list)).equals(this.f8903u))) {
            return list.size();
        }
        this.f8902t = elapsedRealtime;
        if (list.isEmpty()) {
            lVar = null;
        } else {
            lVar = (p0.l) D1.r.l(list);
        }
        this.f8903u = lVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long C3 = A.C(((p0.l) list.get(size - 1)).f8784s - j3, this.f8899q);
        long j5 = this.f8892j;
        if (C3 < j5) {
            return size;
        }
        x(list);
        C0113p c0113p = this.f8907d[w(elapsedRealtime)];
        for (int i5 = 0; i5 < size; i5++) {
            p0.l lVar2 = (p0.l) list.get(i5);
            C0113p c0113p2 = lVar2.f8781p;
            if (A.C(lVar2.f8784s - j3, this.f8899q) >= j5 && c0113p2.f1970i < c0113p.f1970i && (i3 = c0113p2.f1981t) != -1 && i3 <= this.f8894l && (i4 = c0113p2.f1980s) != -1 && i4 <= this.f8893k && i3 < c0113p.f1981t) {
                return i5;
            }
        }
        return size;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    @Override // r0.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(long r14, long r16, long r18, java.util.List r20, p0.m[] r21) {
        /*
            r13 = this;
            r0 = r13
            r1 = r21
            U.v r2 = r0.f8898p
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r4 = r0.f8900r
            int r5 = r1.length
            if (r4 >= r5) goto L27
            r4 = r1[r4]
            boolean r4 = r4.next()
            if (r4 == 0) goto L27
            int r4 = r0.f8900r
            r1 = r1[r4]
            long r4 = r1.e()
            long r6 = r1.k()
        L25:
            long r4 = r4 - r6
            goto L43
        L27:
            int r4 = r1.length
            r5 = 0
        L29:
            if (r5 >= r4) goto L3f
            r6 = r1[r5]
            boolean r7 = r6.next()
            if (r7 == 0) goto L3c
            long r4 = r6.e()
            long r6 = r6.k()
            goto L25
        L3c:
            int r5 = r5 + 1
            goto L29
        L3f:
            long r4 = x(r20)
        L43:
            int r1 = r0.f8901s
            if (r1 != 0) goto L51
            r1 = 1
            r0.f8901s = r1
            int r1 = r13.w(r2)
            r0.f8900r = r1
            return
        L51:
            int r6 = r0.f8900r
            boolean r7 = r20.isEmpty()
            r8 = -1
            if (r7 == 0) goto L5c
            r7 = -1
            goto L68
        L5c:
            java.lang.Object r7 = D1.r.l(r20)
            p0.l r7 = (p0.l) r7
            R.p r7 = r7.f8781p
            int r7 = r13.i(r7)
        L68:
            if (r7 == r8) goto L73
            java.lang.Object r1 = D1.r.l(r20)
            p0.l r1 = (p0.l) r1
            int r1 = r1.f8782q
            r6 = r7
        L73:
            int r7 = r13.w(r2)
            if (r7 == r6) goto Lb8
            boolean r2 = r13.o(r2, r6)
            if (r2 != 0) goto Lb8
            R.p[] r2 = r0.f8907d
            r3 = r2[r6]
            r2 = r2[r7]
            long r8 = r0.f8890h
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
            if (r12 != 0) goto L91
            goto La4
        L91:
            int r12 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r12 == 0) goto L98
            long r4 = r18 - r4
            goto L9a
        L98:
            r4 = r18
        L9a:
            float r4 = (float) r4
            float r5 = r0.f8896n
            float r4 = r4 * r5
            long r4 = (long) r4
            long r8 = java.lang.Math.min(r4, r8)
        La4:
            int r2 = r2.f1970i
            int r3 = r3.f1970i
            if (r2 <= r3) goto Laf
            int r4 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r4 >= 0) goto Laf
            goto Lb7
        Laf:
            if (r2 >= r3) goto Lb8
            long r2 = r0.f8891i
            int r4 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r4 < 0) goto Lb8
        Lb7:
            r7 = r6
        Lb8:
            if (r7 != r6) goto Lbb
            goto Lbc
        Lbb:
            r1 = 3
        Lbc:
            r0.f8901s = r1
            r0.f8900r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.C0749b.p(long, long, long, java.util.List, p0.m[]):void");
    }

    @Override // r0.AbstractC0750c, r0.s
    public final void s() {
        this.f8903u = null;
    }

    public final int w(long j3) {
        long j4;
        long j5;
        s0.g gVar = (s0.g) this.f8889g;
        synchronized (gVar) {
            j4 = gVar.f9181k;
        }
        this.f8889g.getClass();
        long j6 = (((float) j4) * this.f8895m) / this.f8899q;
        if (!this.f8897o.isEmpty()) {
            int i3 = 1;
            while (i3 < this.f8897o.size() - 1 && ((C0748a) this.f8897o.get(i3)).f8887a < j6) {
                i3++;
            }
            C0748a c0748a = (C0748a) this.f8897o.get(i3 - 1);
            C0748a c0748a2 = (C0748a) this.f8897o.get(i3);
            long j7 = c0748a.f8887a;
            float f3 = ((float) (j6 - j7)) / ((float) (c0748a2.f8887a - j7));
            j6 = c0748a.f8888b + (f3 * ((float) (c0748a2.f8888b - j5)));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f8905b; i5++) {
            if (j3 == Long.MIN_VALUE || !o(j3, i5)) {
                if (g(i5).f1970i <= j6) {
                    return i5;
                }
                i4 = i5;
            }
        }
        return i4;
    }
}
