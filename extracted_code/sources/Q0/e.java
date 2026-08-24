package Q0;

import U.A;
import U.AbstractC0123a;
import g2.C0276a;
import w0.InterfaceC0890A;
/* loaded from: classes.dex */
public final class e implements R0.g {

    /* renamed from: m  reason: collision with root package name */
    public long f1539m;

    /* renamed from: n  reason: collision with root package name */
    public long f1540n;

    /* renamed from: o  reason: collision with root package name */
    public Object f1541o;

    /* renamed from: p  reason: collision with root package name */
    public Object f1542p;

    public e(long j3, int i3) {
        AbstractC0123a.j(((s0.a) this.f1541o) == null);
        this.f1539m = j3;
        this.f1540n = j3 + i3;
    }

    @Override // R0.g
    public long b(w0.l lVar) {
        long j3 = this.f1540n;
        if (j3 < 0) {
            return -1L;
        }
        long j4 = -(j3 + 2);
        this.f1540n = -1L;
        return j4;
    }

    @Override // R0.g
    public InterfaceC0890A f() {
        boolean z3;
        if (this.f1539m != -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0123a.j(z3);
        return new w0.s((w0.t) this.f1541o, this.f1539m, 0);
    }

    @Override // R0.g
    public void j(long j3) {
        long[] jArr = (long[]) ((C0276a) this.f1542p).f5777n;
        this.f1540n = jArr[A.f(jArr, j3, true)];
    }

    public e(String str, byte[] bArr, long j3, long j4) {
        this.f1541o = str;
        this.f1542p = bArr;
        this.f1539m = j3;
        this.f1540n = j4;
    }
}
