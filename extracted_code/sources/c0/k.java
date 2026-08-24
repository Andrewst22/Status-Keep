package c0;

import D1.I;
import R.C0113p;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class k extends m implements b0.h {

    /* renamed from: r  reason: collision with root package name */
    public final n f4758r;

    public k(long j3, C0113p c0113p, I i3, n nVar, ArrayList arrayList) {
        super(c0113p, i3, nVar, arrayList);
        this.f4758r = nVar;
    }

    @Override // b0.h
    public final long B(long j3, long j4) {
        n nVar = this.f4758r;
        if (nVar.f4768f != null) {
            return -9223372036854775807L;
        }
        long b3 = nVar.b(j3, j4) + nVar.c(j3, j4);
        return (nVar.e(b3, j3) + nVar.g(b3)) - nVar.f4771i;
    }

    @Override // b0.h
    public final j C(long j3) {
        return this.f4758r.h(this, j3);
    }

    @Override // b0.h
    public final long a(long j3) {
        return this.f4758r.g(j3);
    }

    @Override // b0.h
    public final long b(long j3, long j4) {
        return this.f4758r.f(j3, j4);
    }

    @Override // c0.m
    public final String c() {
        return null;
    }

    @Override // b0.h
    public final boolean e() {
        return this.f4758r.i();
    }

    @Override // c0.m
    public final j f() {
        return null;
    }

    @Override // b0.h
    public final long h(long j3, long j4) {
        return this.f4758r.e(j3, j4);
    }

    @Override // b0.h
    public final long k() {
        return this.f4758r.f4766d;
    }

    @Override // b0.h
    public final long q(long j3) {
        return this.f4758r.d(j3);
    }

    @Override // b0.h
    public final long r(long j3, long j4) {
        return this.f4758r.b(j3, j4);
    }

    @Override // b0.h
    public final long t(long j3, long j4) {
        return this.f4758r.c(j3, j4);
    }

    @Override // c0.m
    public final b0.h d() {
        return this;
    }
}
