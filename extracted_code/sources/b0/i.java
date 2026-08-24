package b0;

import U.AbstractC0123a;
import c0.C0222b;
import java.io.IOException;
import p0.C0731d;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final C0731d f4589a;

    /* renamed from: b  reason: collision with root package name */
    public final c0.m f4590b;

    /* renamed from: c  reason: collision with root package name */
    public final C0222b f4591c;

    /* renamed from: d  reason: collision with root package name */
    public final h f4592d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4593e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4594f;

    public i(long j3, c0.m mVar, C0222b c0222b, C0731d c0731d, long j4, h hVar) {
        this.f4593e = j3;
        this.f4590b = mVar;
        this.f4591c = c0222b;
        this.f4594f = j4;
        this.f4589a = c0731d;
        this.f4592d = hVar;
    }

    public final i a(long j3, c0.m mVar) {
        long b3;
        h d3 = this.f4590b.d();
        h d4 = mVar.d();
        if (d3 == null) {
            return new i(j3, mVar, this.f4591c, this.f4589a, this.f4594f, d3);
        } else if (!d3.e()) {
            return new i(j3, mVar, this.f4591c, this.f4589a, this.f4594f, d4);
        } else {
            long q3 = d3.q(j3);
            if (q3 == 0) {
                return new i(j3, mVar, this.f4591c, this.f4589a, this.f4594f, d4);
            }
            AbstractC0123a.k(d4);
            long k3 = d3.k();
            long a3 = d3.a(k3);
            long j4 = q3 + k3;
            long j5 = j4 - 1;
            long a4 = d3.a(j5);
            long k4 = d4.k();
            long a5 = d4.a(k4);
            long j6 = this.f4594f;
            int i3 = ((d3.h(j5, j3) + a4) > a5 ? 1 : ((d3.h(j5, j3) + a4) == a5 ? 0 : -1));
            if (i3 == 0) {
                b3 = (j4 - k4) + j6;
            } else if (i3 >= 0) {
                if (a5 < a3) {
                    b3 = j6 - (d4.b(a3, j3) - k3);
                } else {
                    b3 = (d3.b(a5, j3) - k4) + j6;
                }
            } else {
                throw new IOException();
            }
            return new i(j3, mVar, this.f4591c, this.f4589a, b3, d4);
        }
    }

    public final long b(long j3) {
        h hVar = this.f4592d;
        AbstractC0123a.k(hVar);
        return hVar.t(this.f4593e, j3) + this.f4594f;
    }

    public final long c(long j3) {
        long b3 = b(j3);
        h hVar = this.f4592d;
        AbstractC0123a.k(hVar);
        return (hVar.r(this.f4593e, j3) + b3) - 1;
    }

    public final long d() {
        h hVar = this.f4592d;
        AbstractC0123a.k(hVar);
        return hVar.q(this.f4593e);
    }

    public final long e(long j3) {
        long f3 = f(j3);
        h hVar = this.f4592d;
        AbstractC0123a.k(hVar);
        return hVar.h(j3 - this.f4594f, this.f4593e) + f3;
    }

    public final long f(long j3) {
        h hVar = this.f4592d;
        AbstractC0123a.k(hVar);
        return hVar.a(j3 - this.f4594f);
    }

    public final boolean g(long j3, long j4) {
        h hVar = this.f4592d;
        AbstractC0123a.k(hVar);
        if (hVar.e() || j4 == -9223372036854775807L || e(j3) <= j4) {
            return true;
        }
        return false;
    }
}
