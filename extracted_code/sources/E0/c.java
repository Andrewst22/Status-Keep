package E0;

import N.k;
import U.A;
import U.AbstractC0123a;
import android.os.SystemClock;
import b0.h;
import c0.j;
import w0.G;
import w0.InterfaceC0890A;
import w0.l;
import w0.p;
import w0.q;
/* loaded from: classes.dex */
public final class c implements p, q, h {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f357m;

    /* renamed from: n  reason: collision with root package name */
    public long f358n;

    /* renamed from: o  reason: collision with root package name */
    public Object f359o;

    public /* synthetic */ c(long j3, Object obj, int i3) {
        this.f357m = i3;
        this.f358n = j3;
        this.f359o = obj;
    }

    @Override // w0.p
    public void A(int i3) {
        ((l) this.f359o).a(i3, false);
    }

    @Override // b0.h
    public long B(long j3, long j4) {
        return -9223372036854775807L;
    }

    @Override // b0.h
    public j C(long j3) {
        w0.j jVar = (w0.j) this.f359o;
        int i3 = (int) j3;
        return new j(jVar.f9594c[i3], jVar.f9593b[i3], null);
    }

    @Override // w0.p
    public long D() {
        return ((l) this.f359o).f9608p - this.f358n;
    }

    public int E(int i3) {
        c cVar = (c) this.f359o;
        if (cVar == null) {
            if (i3 >= 64) {
                return Long.bitCount(this.f358n);
            }
            return Long.bitCount(this.f358n & ((1 << i3) - 1));
        } else if (i3 < 64) {
            return Long.bitCount(this.f358n & ((1 << i3) - 1));
        } else {
            return Long.bitCount(this.f358n) + cVar.E(i3 - 64);
        }
    }

    public boolean F(int i3) {
        if (i3 >= 64) {
            if (((c) this.f359o) == null) {
                this.f359o = new c(5);
            }
            return ((c) this.f359o).F(i3 - 64);
        } else if ((this.f358n & (1 << i3)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void G() {
        this.f358n = 0L;
        c cVar = (c) this.f359o;
        if (cVar != null) {
            cVar.G();
        }
    }

    public void H(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f359o) == null) {
            this.f359o = exc;
            this.f358n = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f358n) {
            Exception exc2 = (Exception) this.f359o;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f359o;
            this.f359o = null;
            throw exc3;
        }
    }

    @Override // b0.h
    public long a(long j3) {
        return ((w0.j) this.f359o).f9596e[(int) j3] - this.f358n;
    }

    @Override // b0.h
    public long b(long j3, long j4) {
        return A.f(((w0.j) this.f359o).f9596e, j3 + this.f358n, true);
    }

    @Override // w0.p
    public void c() {
        ((l) this.f359o).f9610r = 0;
    }

    @Override // w0.p
    public void d(int i3) {
        ((l) this.f359o).d(i3);
    }

    @Override // b0.h
    public boolean e() {
        return true;
    }

    @Override // b0.h
    public long h(long j3, long j4) {
        return ((w0.j) this.f359o).f9595d[(int) j3];
    }

    @Override // w0.p
    public boolean i(byte[] bArr, int i3, int i4, boolean z3) {
        return ((l) this.f359o).i(bArr, 0, i4, z3);
    }

    @Override // b0.h
    public long k() {
        return 0L;
    }

    @Override // w0.p
    public long m() {
        return ((l) this.f359o).f9607o - this.f358n;
    }

    @Override // w0.q
    public void n(InterfaceC0890A interfaceC0890A) {
        ((q) this.f359o).n(new d(this, interfaceC0890A, interfaceC0890A));
    }

    @Override // w0.p
    public boolean p(byte[] bArr, int i3, int i4, boolean z3) {
        return ((l) this.f359o).p(bArr, i3, i4, z3);
    }

    @Override // b0.h
    public long q(long j3) {
        return ((w0.j) this.f359o).f9592a;
    }

    @Override // b0.h
    public long r(long j3, long j4) {
        return ((w0.j) this.f359o).f9592a;
    }

    @Override // R.InterfaceC0107j
    public int read(byte[] bArr, int i3, int i4) {
        return ((l) this.f359o).read(bArr, i3, i4);
    }

    @Override // w0.p
    public void readFully(byte[] bArr, int i3, int i4) {
        ((l) this.f359o).i(bArr, i3, i4, false);
    }

    @Override // w0.q
    public void s() {
        ((q) this.f359o).s();
    }

    @Override // b0.h
    public long t(long j3, long j4) {
        return 0L;
    }

    public String toString() {
        switch (this.f357m) {
            case k.STRING_FIELD_NUMBER /* 5 */:
                if (((c) this.f359o) == null) {
                    return Long.toBinaryString(this.f358n);
                }
                return ((c) this.f359o).toString() + "xx" + Long.toBinaryString(this.f358n);
            default:
                return super.toString();
        }
    }

    @Override // w0.p
    public long u() {
        return ((l) this.f359o).u() - this.f358n;
    }

    @Override // w0.q
    public G w(int i3, int i4) {
        return ((q) this.f359o).w(i3, i4);
    }

    @Override // w0.p
    public void z(byte[] bArr, int i3, int i4) {
        ((l) this.f359o).p(bArr, i3, i4, false);
    }

    public /* synthetic */ c(Object obj, long j3, int i3) {
        this.f357m = i3;
        this.f359o = obj;
        this.f358n = j3;
    }

    public c(l lVar, long j3) {
        this.f357m = 1;
        this.f359o = lVar;
        AbstractC0123a.e(lVar.f9608p >= j3);
        this.f358n = j3;
    }

    public c(int i3) {
        this.f357m = i3;
        switch (i3) {
            case k.STRING_FIELD_NUMBER /* 5 */:
                this.f358n = 0L;
                return;
            default:
                return;
        }
    }
}
