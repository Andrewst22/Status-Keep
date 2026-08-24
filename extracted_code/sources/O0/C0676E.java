package o0;

import R.C0113p;
import java.util.List;
import p0.AbstractC0732e;
/* renamed from: o0.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0676E implements r0.s {

    /* renamed from: a  reason: collision with root package name */
    public final r0.s f8417a;

    /* renamed from: b  reason: collision with root package name */
    public final R.U f8418b;

    public C0676E(r0.s sVar, R.U u3) {
        this.f8417a = sVar;
        this.f8418b = u3;
    }

    @Override // r0.s
    public final int a() {
        return this.f8417a.a();
    }

    @Override // r0.s
    public final R.U b() {
        return this.f8418b;
    }

    @Override // r0.s
    public final void c(boolean z3) {
        this.f8417a.c(z3);
    }

    @Override // r0.s
    public final C0113p d() {
        return this.f8418b.f1824d[this.f8417a.a()];
    }

    @Override // r0.s
    public final int e() {
        return this.f8417a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0676E)) {
            return false;
        }
        C0676E c0676e = (C0676E) obj;
        if (this.f8417a.equals(c0676e.f8417a) && this.f8418b.equals(c0676e.f8418b)) {
            return true;
        }
        return false;
    }

    @Override // r0.s
    public final int f() {
        return this.f8417a.f();
    }

    @Override // r0.s
    public final C0113p g(int i3) {
        return this.f8418b.f1824d[this.f8417a.k(i3)];
    }

    @Override // r0.s
    public final void h() {
        this.f8417a.h();
    }

    public final int hashCode() {
        return this.f8417a.hashCode() + ((this.f8418b.hashCode() + 527) * 31);
    }

    @Override // r0.s
    public final int i(C0113p c0113p) {
        return this.f8417a.u(this.f8418b.b(c0113p));
    }

    @Override // r0.s
    public final void j(float f3) {
        this.f8417a.j(f3);
    }

    @Override // r0.s
    public final int k(int i3) {
        return this.f8417a.k(i3);
    }

    @Override // r0.s
    public final Object l() {
        return this.f8417a.l();
    }

    @Override // r0.s
    public final int length() {
        return this.f8417a.length();
    }

    @Override // r0.s
    public final void m() {
        this.f8417a.m();
    }

    @Override // r0.s
    public final int n(long j3, List list) {
        return this.f8417a.n(j3, list);
    }

    @Override // r0.s
    public final boolean o(long j3, int i3) {
        return this.f8417a.o(j3, i3);
    }

    @Override // r0.s
    public final void p(long j3, long j4, long j5, List list, p0.m[] mVarArr) {
        this.f8417a.p(j3, j4, j5, list, mVarArr);
    }

    @Override // r0.s
    public final boolean q(long j3, AbstractC0732e abstractC0732e, List list) {
        return this.f8417a.q(j3, abstractC0732e, list);
    }

    @Override // r0.s
    public final boolean r(long j3, int i3) {
        return this.f8417a.r(j3, i3);
    }

    @Override // r0.s
    public final void s() {
        this.f8417a.s();
    }

    @Override // r0.s
    public final void t() {
        this.f8417a.t();
    }

    @Override // r0.s
    public final int u(int i3) {
        return this.f8417a.u(i3);
    }
}
