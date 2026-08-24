package k0;

import D1.I;
import D1.b0;
import D1.g0;
import R.C0113p;
import R.U;
import U.AbstractC0123a;
import Y.P;
import Y.l0;
import android.net.Uri;
import android.os.Handler;
import g2.C0276a;
import java.io.IOException;
import java.util.ArrayList;
import javax.net.SocketFactory;
import o0.InterfaceC0698w;
import o0.InterfaceC0699x;
import o0.T;
/* loaded from: classes.dex */
public final class r implements InterfaceC0699x {

    /* renamed from: A */
    public long f7646A;

    /* renamed from: B */
    public boolean f7647B;

    /* renamed from: C */
    public boolean f7648C;

    /* renamed from: D */
    public boolean f7649D;

    /* renamed from: E */
    public boolean f7650E;

    /* renamed from: F */
    public boolean f7651F;

    /* renamed from: G */
    public int f7652G;

    /* renamed from: H */
    public boolean f7653H;

    /* renamed from: m */
    public final s0.e f7654m;

    /* renamed from: n */
    public final Handler f7655n = U.A.n(null);

    /* renamed from: o */
    public final C0558m f7656o;

    /* renamed from: p */
    public final C0557l f7657p;

    /* renamed from: q */
    public final ArrayList f7658q;

    /* renamed from: r */
    public final ArrayList f7659r;

    /* renamed from: s */
    public final C0558m f7660s;

    /* renamed from: t */
    public final e0.l f7661t;

    /* renamed from: u */
    public InterfaceC0698w f7662u;

    /* renamed from: v */
    public b0 f7663v;

    /* renamed from: w */
    public IOException f7664w;
    public A2.b x;

    /* renamed from: y */
    public long f7665y;

    /* renamed from: z */
    public long f7666z;

    public r(s0.e eVar, e0.l lVar, Uri uri, C0558m c0558m, String str, SocketFactory socketFactory) {
        this.f7654m = eVar;
        this.f7661t = lVar;
        this.f7660s = c0558m;
        C0558m c0558m2 = new C0558m(this, 1);
        this.f7656o = c0558m2;
        this.f7657p = new C0557l(c0558m2, c0558m2, str, uri, socketFactory);
        this.f7658q = new ArrayList();
        this.f7659r = new ArrayList();
        this.f7666z = -9223372036854775807L;
        this.f7665y = -9223372036854775807L;
        this.f7646A = -9223372036854775807L;
    }

    public static /* synthetic */ long a(r rVar) {
        return rVar.f7666z;
    }

    public static /* synthetic */ void c(r rVar) {
        rVar.f7666z = -9223372036854775807L;
    }

    public static /* synthetic */ long e(r rVar) {
        return rVar.f7646A;
    }

    public static /* synthetic */ void f(r rVar) {
        rVar.f7646A = -9223372036854775807L;
    }

    public static /* synthetic */ ArrayList i(r rVar) {
        return rVar.f7659r;
    }

    public static /* synthetic */ C0558m j(r rVar) {
        return rVar.f7660s;
    }

    public static boolean k(r rVar) {
        if (rVar.f7666z != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ long n(r rVar) {
        return rVar.f7665y;
    }

    public static /* synthetic */ void s(r rVar) {
        rVar.f7665y = -9223372036854775807L;
    }

    public static void w(r rVar) {
        rVar.f7647B = true;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = rVar.f7658q;
            if (i3 < arrayList.size()) {
                rVar.f7647B = ((q) arrayList.get(i3)).f7643d & rVar.f7647B;
                i3++;
            } else {
                return;
            }
        }
    }

    public static void x(r rVar) {
        if (!rVar.f7649D && !rVar.f7650E) {
            int i3 = 0;
            while (true) {
                ArrayList arrayList = rVar.f7658q;
                if (i3 < arrayList.size()) {
                    if (((q) arrayList.get(i3)).f7642c.u() != null) {
                        i3++;
                    } else {
                        return;
                    }
                } else {
                    rVar.f7650E = true;
                    I j3 = I.j(arrayList);
                    D1.F f3 = new D1.F();
                    for (int i4 = 0; i4 < j3.size(); i4++) {
                        T t3 = ((q) j3.get(i4)).f7642c;
                        String num = Integer.toString(i4);
                        C0113p u3 = t3.u();
                        AbstractC0123a.h(u3);
                        f3.c(new U(num, u3));
                    }
                    rVar.f7663v = f3.g();
                    InterfaceC0698w interfaceC0698w = rVar.f7662u;
                    AbstractC0123a.h(interfaceC0698w);
                    interfaceC0698w.j(rVar);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.IOException, A2.b] */
    public static void y(r rVar) {
        rVar.f7653H = true;
        C0557l c0557l = rVar.f7657p;
        c0557l.getClass();
        try {
            c0557l.close();
            y yVar = new y(new C0276a(c0557l));
            c0557l.f7626u = yVar;
            yVar.a(c0557l.g(c0557l.f7625t));
            c0557l.f7628w = null;
            c0557l.f7615C = false;
            c0557l.f7630z = null;
        } catch (IOException e2) {
            c0557l.f7619n.m(new IOException(e2));
        }
        rVar.f7661t.getClass();
        e0.l lVar = new e0.l(19);
        ArrayList arrayList = rVar.f7658q;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = rVar.f7659r;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            q qVar = (q) arrayList.get(i3);
            if (!qVar.f7643d) {
                p pVar = qVar.f7640a;
                q qVar2 = new q(rVar, pVar.f7636a, i3, lVar);
                arrayList2.add(qVar2);
                qVar2.b();
                if (arrayList3.contains(pVar)) {
                    arrayList4.add(qVar2.f7640a);
                }
            } else {
                arrayList2.add(qVar);
            }
        }
        I j3 = I.j(arrayList);
        arrayList.clear();
        arrayList.addAll(arrayList2);
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        for (int i4 = 0; i4 < j3.size(); i4++) {
            ((q) j3.get(i4)).a();
        }
    }

    @Override // o0.W
    public final boolean d() {
        int i3;
        if (!this.f7647B && ((i3 = this.f7657p.f7613A) == 2 || i3 == 1)) {
            return true;
        }
        return false;
    }

    @Override // o0.InterfaceC0699x
    public final o0.b0 g() {
        AbstractC0123a.j(this.f7650E);
        b0 b0Var = this.f7663v;
        b0Var.getClass();
        return new o0.b0((U[]) b0Var.toArray(new U[0]));
    }

    @Override // o0.W
    public final boolean h(P p3) {
        return d();
    }

    @Override // o0.InterfaceC0699x
    public final void l(InterfaceC0698w interfaceC0698w, long j3) {
        C0557l c0557l = this.f7657p;
        this.f7662u = interfaceC0698w;
        try {
            c0557l.getClass();
            try {
                c0557l.f7626u.a(c0557l.g(c0557l.f7625t));
                Uri uri = c0557l.f7625t;
                String str = c0557l.f7628w;
                B0.b bVar = c0557l.f7624s;
                bVar.k(bVar.e(4, str, g0.f255s, uri));
            } catch (IOException e2) {
                U.A.h(c0557l.f7626u);
                throw e2;
            }
        } catch (IOException e3) {
            this.f7664w = e3;
            U.A.h(c0557l);
        }
    }

    @Override // o0.W
    public final long m() {
        if (!this.f7647B) {
            ArrayList arrayList = this.f7658q;
            if (!arrayList.isEmpty()) {
                long j3 = this.f7665y;
                if (j3 != -9223372036854775807L) {
                    return j3;
                }
                boolean z3 = true;
                long j4 = Long.MAX_VALUE;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    q qVar = (q) arrayList.get(i3);
                    if (!qVar.f7643d) {
                        j4 = Math.min(j4, qVar.f7642c.o());
                        z3 = false;
                    }
                }
                if (z3 || j4 == Long.MIN_VALUE) {
                    return 0L;
                }
                return j4;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // o0.InterfaceC0699x
    public final void o() {
        IOException iOException = this.f7664w;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }

    @Override // o0.InterfaceC0699x
    public final long p(r0.s[] sVarArr, boolean[] zArr, o0.U[] uArr, boolean[] zArr2, long j3) {
        ArrayList arrayList;
        for (int i3 = 0; i3 < sVarArr.length; i3++) {
            if (uArr[i3] != null && (sVarArr[i3] == null || !zArr[i3])) {
                uArr[i3] = null;
            }
        }
        ArrayList arrayList2 = this.f7659r;
        arrayList2.clear();
        int i4 = 0;
        while (true) {
            int length = sVarArr.length;
            arrayList = this.f7658q;
            if (i4 >= length) {
                break;
            }
            r0.s sVar = sVarArr[i4];
            if (sVar != null) {
                U b3 = sVar.b();
                b0 b0Var = this.f7663v;
                b0Var.getClass();
                int indexOf = b0Var.indexOf(b3);
                q qVar = (q) arrayList.get(indexOf);
                qVar.getClass();
                arrayList2.add(qVar.f7640a);
                if (this.f7663v.contains(b3) && uArr[i4] == null) {
                    uArr[i4] = new B.b(this, indexOf);
                    zArr2[i4] = true;
                }
            }
            i4++;
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            q qVar2 = (q) arrayList.get(i5);
            if (!arrayList2.contains(qVar2.f7640a)) {
                qVar2.a();
            }
        }
        this.f7651F = true;
        if (j3 != 0) {
            this.f7665y = j3;
            this.f7666z = j3;
            this.f7646A = j3;
        }
        z();
        return j3;
    }

    @Override // o0.InterfaceC0699x
    public final long q(long j3) {
        boolean z3;
        if (m() == 0 && !this.f7653H) {
            this.f7646A = j3;
            return j3;
        }
        r(j3);
        this.f7665y = j3;
        if (this.f7666z != -9223372036854775807L) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            C0557l c0557l = this.f7657p;
            int i3 = c0557l.f7613A;
            if (i3 != 1) {
                if (i3 == 2) {
                    this.f7666z = j3;
                    c0557l.h(j3);
                    return j3;
                }
                throw new IllegalStateException();
            }
            return j3;
        }
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f7658q;
            if (i4 < arrayList.size()) {
                if (!((q) arrayList.get(i4)).f7642c.G(j3, false)) {
                    this.f7666z = j3;
                    if (this.f7647B) {
                        for (int i5 = 0; i5 < this.f7658q.size(); i5++) {
                            q qVar = (q) this.f7658q.get(i5);
                            AbstractC0123a.j(qVar.f7643d);
                            qVar.f7643d = false;
                            w(qVar.f7645f);
                            qVar.b();
                        }
                        if (this.f7653H) {
                            this.f7657p.i(U.A.Z(j3));
                        } else {
                            this.f7657p.h(j3);
                        }
                    } else {
                        this.f7657p.h(j3);
                    }
                    for (int i6 = 0; i6 < this.f7658q.size(); i6++) {
                        q qVar2 = (q) this.f7658q.get(i6);
                        if (!qVar2.f7643d) {
                            C0551f c0551f = qVar2.f7640a.f7637b.f7572t;
                            c0551f.getClass();
                            synchronized (c0551f.f7580e) {
                                c0551f.f7586k = true;
                            }
                            qVar2.f7642c.D(false);
                            qVar2.f7642c.f8544t = j3;
                        }
                    }
                    return j3;
                }
                i4++;
            } else {
                return j3;
            }
        }
    }

    @Override // o0.InterfaceC0699x
    public final void r(long j3) {
        if (this.f7666z != -9223372036854775807L) {
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f7658q;
            if (i3 < arrayList.size()) {
                q qVar = (q) arrayList.get(i3);
                if (!qVar.f7643d) {
                    qVar.f7642c.i(j3, true);
                }
                i3++;
            } else {
                return;
            }
        }
    }

    @Override // o0.W
    public final long t() {
        return m();
    }

    @Override // o0.InterfaceC0699x
    public final long u() {
        if (this.f7648C) {
            this.f7648C = false;
            return 0L;
        }
        return -9223372036854775807L;
    }

    public final void z() {
        ArrayList arrayList;
        boolean z3;
        int i3 = 0;
        boolean z4 = true;
        while (true) {
            arrayList = this.f7659r;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (((p) arrayList.get(i3)).f7638c != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 &= z3;
            i3++;
        }
        if (z4 && this.f7651F) {
            C0557l c0557l = this.f7657p;
            c0557l.f7622q.addAll(arrayList);
            c0557l.f();
        }
    }

    @Override // o0.W
    public final void v(long j3) {
    }

    @Override // o0.InterfaceC0699x
    public final long b(long j3, l0 l0Var) {
        return j3;
    }
}
