package o0;

import R.C0112o;
import R.C0113p;
/* renamed from: o0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0679c implements U {

    /* renamed from: m  reason: collision with root package name */
    public final U f8582m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f8583n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ C0680d f8584o;

    public C0679c(C0680d c0680d, U u3) {
        this.f8584o = c0680d;
        this.f8582m = u3;
    }

    @Override // o0.U
    public final void a() {
        this.f8582m.a();
    }

    @Override // o0.U
    public final boolean f() {
        if (!this.f8584o.a() && this.f8582m.f()) {
            return true;
        }
        return false;
    }

    @Override // o0.U
    public final int i(B1.a aVar, X.f fVar, int i3) {
        C0680d c0680d = this.f8584o;
        if (c0680d.a()) {
            return -3;
        }
        if (this.f8583n) {
            fVar.f1529n = 4;
            return -4;
        }
        long m3 = c0680d.m();
        int i4 = this.f8582m.i(aVar, fVar, i3);
        if (i4 == -5) {
            C0113p c0113p = (C0113p) aVar.f51o;
            c0113p.getClass();
            int i5 = c0113p.f1955E;
            int i6 = c0113p.f1954D;
            if (i6 != 0 || i5 != 0) {
                if (c0680d.f8590q != 0) {
                    i6 = 0;
                }
                if (c0680d.f8591r != Long.MIN_VALUE) {
                    i5 = 0;
                }
                C0112o a3 = c0113p.a();
                a3.f1919C = i6;
                a3.f1920D = i5;
                aVar.f51o = new C0113p(a3);
            }
            return -5;
        }
        long j3 = c0680d.f8591r;
        if (j3 != Long.MIN_VALUE && ((i4 == -4 && fVar.f2936s >= j3) || (i4 == -3 && m3 == Long.MIN_VALUE && !fVar.f2935r))) {
            fVar.e();
            fVar.f1529n = 4;
            this.f8583n = true;
            return -4;
        }
        return i4;
    }

    @Override // o0.U
    public final int n(long j3) {
        if (this.f8584o.a()) {
            return -3;
        }
        return this.f8582m.n(j3);
    }
}
