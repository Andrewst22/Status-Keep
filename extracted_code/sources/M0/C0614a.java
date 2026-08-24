package m0;

import D1.b0;
import Q0.n;
import Q0.u;
import Q0.v;
import R.C0113p;
import U.A;
import U.AbstractC0123a;
import W.h;
import Y.P;
import Y.l0;
import android.net.Uri;
import android.os.SystemClock;
import b0.j;
import d1.C0255e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import m2.AbstractC0635d;
import n0.C0656a;
import o0.C0678b;
import p0.AbstractC0732e;
import p0.C0731d;
import p0.InterfaceC0733f;
import p0.i;
import p0.l;
import p0.m;
import r0.s;
import s0.o;
/* renamed from: m0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0614a implements i {

    /* renamed from: a  reason: collision with root package name */
    public final o f8144a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8145b;

    /* renamed from: c  reason: collision with root package name */
    public final InterfaceC0733f[] f8146c;

    /* renamed from: d  reason: collision with root package name */
    public final h f8147d;

    /* renamed from: e  reason: collision with root package name */
    public s f8148e;

    /* renamed from: f  reason: collision with root package name */
    public n0.c f8149f;

    /* renamed from: g  reason: collision with root package name */
    public int f8150g;

    /* renamed from: h  reason: collision with root package name */
    public C0678b f8151h;

    public C0614a(o oVar, n0.c cVar, int i3, s sVar, h hVar, B1.b bVar, boolean z3) {
        v[] vVarArr;
        int i4;
        int i5;
        this.f8144a = oVar;
        this.f8149f = cVar;
        this.f8145b = i3;
        this.f8148e = sVar;
        this.f8147d = hVar;
        n0.b bVar2 = cVar.f8364f[i3];
        this.f8146c = new InterfaceC0733f[sVar.length()];
        for (int i6 = 0; i6 < this.f8146c.length; i6++) {
            int k3 = sVar.k(i6);
            C0113p c0113p = bVar2.f8352j[k3];
            if (c0113p.f1978q != null) {
                C0656a c0656a = cVar.f8363e;
                c0656a.getClass();
                vVarArr = c0656a.f8342c;
            } else {
                vVarArr = null;
            }
            v[] vVarArr2 = vVarArr;
            int i7 = bVar2.f8343a;
            if (i7 == 2) {
                i4 = 4;
            } else {
                i4 = 0;
            }
            u uVar = new u(k3, i7, bVar2.f8345c, -9223372036854775807L, cVar.f8365g, c0113p, 0, vVarArr2, i4, null, null);
            if (!z3) {
                i5 = 35;
            } else {
                i5 = 3;
            }
            this.f8146c[i6] = new C0731d(new n(bVar, i5, null, uVar, b0.f231q, null), bVar2.f8343a, c0113p);
        }
    }

    @Override // p0.i
    public final void a() {
        C0678b c0678b = this.f8151h;
        if (c0678b == null) {
            this.f8144a.a();
            return;
        }
        throw c0678b;
    }

    @Override // p0.i
    public final long b(long j3, l0 l0Var) {
        long j4;
        n0.b bVar = this.f8149f.f8364f[this.f8145b];
        int f3 = A.f(bVar.f8357o, j3, true);
        long[] jArr = bVar.f8357o;
        long j5 = jArr[f3];
        if (j5 < j3 && f3 < bVar.f8353k - 1) {
            j4 = jArr[f3 + 1];
        } else {
            j4 = j5;
        }
        return l0Var.a(j3, j5, j4);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [o0.b, java.io.IOException] */
    @Override // p0.i
    public final void c(P p3, long j3, List list, A.i iVar) {
        n0.c cVar;
        int a3;
        long b3;
        long j4;
        boolean z3;
        boolean z4;
        boolean z5;
        if (this.f8151h != null) {
            return;
        }
        n0.b[] bVarArr = this.f8149f.f8364f;
        int i3 = this.f8145b;
        n0.b bVar = bVarArr[i3];
        if (bVar.f8353k == 0) {
            iVar.f15a = !cVar.f8362d;
            return;
        }
        boolean isEmpty = list.isEmpty();
        long[] jArr = bVar.f8357o;
        if (isEmpty) {
            a3 = A.f(jArr, j3, true);
        } else {
            a3 = (int) (((l) list.get(list.size() - 1)).a() - this.f8150g);
            if (a3 < 0) {
                this.f8151h = new IOException();
                return;
            }
        }
        if (a3 >= bVar.f8353k) {
            iVar.f15a = !this.f8149f.f8362d;
            return;
        }
        long j5 = p3.f3150a;
        long j6 = j3 - j5;
        n0.c cVar2 = this.f8149f;
        if (!cVar2.f8362d) {
            b3 = -9223372036854775807L;
        } else {
            n0.b bVar2 = cVar2.f8364f[i3];
            int i4 = bVar2.f8353k - 1;
            b3 = (bVar2.b(i4) + bVar2.f8357o[i4]) - j5;
        }
        int length = this.f8148e.length();
        m[] mVarArr = new m[length];
        for (int i5 = 0; i5 < length; i5++) {
            this.f8148e.k(i5);
            mVarArr[i5] = new j(bVar, a3);
        }
        this.f8148e.p(j5, j6, b3, list, mVarArr);
        long j7 = jArr[a3];
        long b4 = bVar.b(a3) + j7;
        if (list.isEmpty()) {
            j4 = j3;
        } else {
            j4 = -9223372036854775807L;
        }
        int i6 = this.f8150g + a3;
        int f3 = this.f8148e.f();
        InterfaceC0733f interfaceC0733f = this.f8146c[f3];
        int k3 = this.f8148e.k(f3);
        C0113p[] c0113pArr = bVar.f8352j;
        if (c0113pArr != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        ArrayList arrayList = bVar.f8356n;
        if (arrayList != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        AbstractC0123a.j(z4);
        if (a3 < arrayList.size()) {
            z5 = true;
        } else {
            z5 = false;
        }
        AbstractC0123a.j(z5);
        String num = Integer.toString(c0113pArr[k3].f1970i);
        String l3 = ((Long) arrayList.get(a3)).toString();
        Uri y3 = AbstractC0123a.y(bVar.f8354l, bVar.f8355m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l3).replace("{start_time}", l3));
        SystemClock.elapsedRealtime();
        C0113p d3 = this.f8148e.d();
        int e2 = this.f8148e.e();
        Object l4 = this.f8148e.l();
        Map emptyMap = Collections.emptyMap();
        AbstractC0123a.l(y3, "The uri must be set.");
        iVar.f16b = new p0.j(this.f8147d, new W.l(y3, 1, null, emptyMap, 0L, -1L, null, 0), d3, e2, l4, j7, b4, j4, -9223372036854775807L, i6, 1, j7, interfaceC0733f);
    }

    @Override // p0.i
    public final boolean d(AbstractC0732e abstractC0732e, boolean z3, B.b bVar, e0.l lVar) {
        s0.h i3 = AbstractC0635d.i(this.f8148e);
        lVar.getClass();
        C0255e t3 = e0.l.t(i3, bVar);
        if (z3 && t3 != null && t3.f5183a == 2) {
            s sVar = this.f8148e;
            if (sVar.r(t3.f5184b, sVar.i(abstractC0732e.f8781p))) {
                return true;
            }
        }
        return false;
    }

    @Override // p0.i
    public final boolean e(long j3, AbstractC0732e abstractC0732e, List list) {
        if (this.f8151h != null) {
            return false;
        }
        return this.f8148e.q(j3, abstractC0732e, list);
    }

    @Override // p0.i
    public final int f(long j3, List list) {
        if (this.f8151h == null && this.f8148e.length() >= 2) {
            return this.f8148e.n(j3, list);
        }
        return list.size();
    }

    @Override // p0.i
    public final void release() {
        for (InterfaceC0733f interfaceC0733f : this.f8146c) {
            ((C0731d) interfaceC0733f).f8769m.release();
        }
    }

    @Override // p0.i
    public final void g(AbstractC0732e abstractC0732e) {
    }
}
