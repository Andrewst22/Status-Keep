package s0;

import D1.I;
import D1.b0;
import D1.g0;
import U.v;
import W.B;
import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k0.C0558m;
import o0.C0701z;
/* loaded from: classes.dex */
public final class g implements d, B {

    /* renamed from: n  reason: collision with root package name */
    public static final b0 f9164n = I.n(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: o  reason: collision with root package name */
    public static final b0 f9165o = I.n(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: p  reason: collision with root package name */
    public static final b0 f9166p = I.n(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: q  reason: collision with root package name */
    public static final b0 f9167q = I.n(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: r  reason: collision with root package name */
    public static final b0 f9168r = I.n(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: s  reason: collision with root package name */
    public static final b0 f9169s = I.n(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: t  reason: collision with root package name */
    public static g f9170t;

    /* renamed from: a  reason: collision with root package name */
    public final g0 f9171a;

    /* renamed from: b  reason: collision with root package name */
    public final C0558m f9172b = new C0558m(12);

    /* renamed from: c  reason: collision with root package name */
    public final v f9173c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f9174d;

    /* renamed from: e  reason: collision with root package name */
    public final s f9175e;

    /* renamed from: f  reason: collision with root package name */
    public int f9176f;

    /* renamed from: g  reason: collision with root package name */
    public long f9177g;

    /* renamed from: h  reason: collision with root package name */
    public long f9178h;

    /* renamed from: i  reason: collision with root package name */
    public long f9179i;

    /* renamed from: j  reason: collision with root package name */
    public long f9180j;

    /* renamed from: k  reason: collision with root package name */
    public long f9181k;

    /* renamed from: l  reason: collision with root package name */
    public long f9182l;

    /* renamed from: m  reason: collision with root package name */
    public int f9183m;

    public g(Context context, HashMap hashMap, int i3, v vVar, boolean z3) {
        this.f9171a = g0.a(hashMap);
        this.f9175e = new s(i3);
        this.f9173c = vVar;
        this.f9174d = z3;
        if (context != null) {
            U.r c3 = U.r.c(context);
            int d3 = c3.d();
            this.f9183m = d3;
            this.f9181k = b(d3);
            f fVar = new f(this);
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c3.f2467c;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            copyOnWriteArrayList.add(new WeakReference(fVar));
            ((Handler) c3.f2466b).post(new U.n(0, c3, fVar));
            return;
        }
        this.f9183m = 0;
        this.f9181k = b(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:942:0x0cd6, code lost:
        if (r8.equals("AI") == false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] a(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 8582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.g.a(java.lang.String):int[]");
    }

    public final long b(int i3) {
        Integer valueOf = Integer.valueOf(i3);
        g0 g0Var = this.f9171a;
        Long l3 = (Long) g0Var.get(valueOf);
        if (l3 == null) {
            l3 = (Long) g0Var.get(0);
        }
        if (l3 == null) {
            l3 = 1000000L;
        }
        return l3.longValue();
    }

    public final void c(final int i3, final long j3, final long j4) {
        if (i3 == 0 && j3 == 0 && j4 == this.f9182l) {
            return;
        }
        this.f9182l = j4;
        Iterator it = ((CopyOnWriteArrayList) this.f9172b.f7632n).iterator();
        while (it.hasNext()) {
            final c cVar = (c) it.next();
            if (!cVar.f9156c) {
                cVar.f9154a.post(new Runnable() { // from class: s0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0701z c0701z;
                        Z.f fVar = c.this.f9155b;
                        Z.e eVar = fVar.f3479p;
                        if (((I) eVar.f3471b).isEmpty()) {
                            c0701z = null;
                        } else {
                            c0701z = (C0701z) D1.r.l((I) eVar.f3471b);
                        }
                        Z.a G3 = fVar.G(c0701z);
                        fVar.J(G3, 1006, new T0.n(G3, i3, j3, j4));
                    }
                });
            }
        }
    }
}
