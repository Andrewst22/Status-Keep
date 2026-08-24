package p0;

import R.C0113p;
import R.r;
import U.AbstractC0123a;
import android.util.SparseArray;
import g2.C0276a;
import w0.G;
import w0.InterfaceC0890A;
import w0.o;
import w0.q;
/* renamed from: p0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0731d implements q, InterfaceC0733f {

    /* renamed from: v  reason: collision with root package name */
    public static final A.i f8767v;

    /* renamed from: w  reason: collision with root package name */
    public static final r f8768w;

    /* renamed from: m  reason: collision with root package name */
    public final o f8769m;

    /* renamed from: n  reason: collision with root package name */
    public final int f8770n;

    /* renamed from: o  reason: collision with root package name */
    public final C0113p f8771o;

    /* renamed from: p  reason: collision with root package name */
    public final SparseArray f8772p = new SparseArray();

    /* renamed from: q  reason: collision with root package name */
    public boolean f8773q;

    /* renamed from: r  reason: collision with root package name */
    public C0276a f8774r;

    /* renamed from: s  reason: collision with root package name */
    public long f8775s;

    /* renamed from: t  reason: collision with root package name */
    public InterfaceC0890A f8776t;

    /* renamed from: u  reason: collision with root package name */
    public C0113p[] f8777u;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, A.i] */
    /* JADX WARN: Type inference failed for: r0v1, types: [R.r, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.f16b = new B1.b(18);
        f8767v = obj;
        f8768w = new Object();
    }

    public C0731d(o oVar, int i3, C0113p c0113p) {
        this.f8769m = oVar;
        this.f8770n = i3;
        this.f8771o = c0113p;
    }

    public final void a(C0276a c0276a, long j3, long j4) {
        this.f8774r = c0276a;
        this.f8775s = j4;
        boolean z3 = this.f8773q;
        o oVar = this.f8769m;
        if (!z3) {
            oVar.h(this);
            if (j3 != -9223372036854775807L) {
                oVar.b(0L, j3);
            }
            this.f8773q = true;
            return;
        }
        if (j3 == -9223372036854775807L) {
            j3 = 0;
        }
        oVar.b(0L, j3);
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f8772p;
            if (i3 < sparseArray.size()) {
                C0730c c0730c = (C0730c) sparseArray.valueAt(i3);
                if (c0276a == null) {
                    c0730c.f8765e = c0730c.f8763c;
                } else {
                    c0730c.f8766f = j4;
                    G l3 = c0276a.l(c0730c.f8761a);
                    c0730c.f8765e = l3;
                    C0113p c0113p = c0730c.f8764d;
                    if (c0113p != null) {
                        l3.c(c0113p);
                    }
                }
                i3++;
            } else {
                return;
            }
        }
    }

    @Override // w0.q
    public final void n(InterfaceC0890A interfaceC0890A) {
        this.f8776t = interfaceC0890A;
    }

    @Override // w0.q
    public final void s() {
        SparseArray sparseArray = this.f8772p;
        C0113p[] c0113pArr = new C0113p[sparseArray.size()];
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            C0113p c0113p = ((C0730c) sparseArray.valueAt(i3)).f8764d;
            AbstractC0123a.k(c0113p);
            c0113pArr[i3] = c0113p;
        }
        this.f8777u = c0113pArr;
    }

    @Override // w0.q
    public final G w(int i3, int i4) {
        boolean z3;
        C0113p c0113p;
        SparseArray sparseArray = this.f8772p;
        C0730c c0730c = (C0730c) sparseArray.get(i3);
        if (c0730c == null) {
            if (this.f8777u == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0123a.j(z3);
            if (i4 == this.f8770n) {
                c0113p = this.f8771o;
            } else {
                c0113p = null;
            }
            c0730c = new C0730c(i3, i4, c0113p);
            C0276a c0276a = this.f8774r;
            long j3 = this.f8775s;
            if (c0276a == null) {
                c0730c.f8765e = c0730c.f8763c;
            } else {
                c0730c.f8766f = j3;
                G l3 = c0276a.l(i4);
                c0730c.f8765e = l3;
                C0113p c0113p2 = c0730c.f8764d;
                if (c0113p2 != null) {
                    l3.c(c0113p2);
                }
            }
            sparseArray.put(i3, c0730c);
        }
        return c0730c;
    }
}
