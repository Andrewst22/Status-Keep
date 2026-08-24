package w0;

import U.AbstractC0123a;
import g2.C0276a;
/* loaded from: classes.dex */
public class s implements InterfaceC0890A {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9621a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9622b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f9623c;

    public /* synthetic */ s(Object obj, long j3, int i3) {
        this.f9621a = i3;
        this.f9623c = obj;
        this.f9622b = j3;
    }

    @Override // w0.InterfaceC0890A
    public final boolean c() {
        switch (this.f9621a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // w0.InterfaceC0890A
    public final z i(long j3) {
        long j4;
        switch (this.f9621a) {
            case 0:
                t tVar = (t) this.f9623c;
                AbstractC0123a.k(tVar.f9634k);
                C0276a c0276a = tVar.f9634k;
                long[] jArr = (long[]) c0276a.f5777n;
                int f3 = U.A.f(jArr, U.A.k((tVar.f9628e * j3) / 1000000, 0L, tVar.f9633j - 1), false);
                long j5 = 0;
                if (f3 == -1) {
                    j4 = 0;
                } else {
                    j4 = jArr[f3];
                }
                long[] jArr2 = (long[]) c0276a.f5778o;
                if (f3 != -1) {
                    j5 = jArr2[f3];
                }
                int i3 = tVar.f9628e;
                long j6 = (j4 * 1000000) / i3;
                long j7 = this.f9622b;
                B b3 = new B(j6, j5 + j7);
                if (j6 != j3 && f3 != jArr.length - 1) {
                    int i4 = f3 + 1;
                    return new z(b3, new B((jArr[i4] * 1000000) / i3, j7 + jArr2[i4]));
                }
                return new z(b3, b3);
            case 1:
                return (z) this.f9623c;
            default:
                y0.b bVar = (y0.b) this.f9623c;
                z b4 = bVar.f9709i[0].b(j3);
                int i5 = 1;
                while (true) {
                    y0.e[] eVarArr = bVar.f9709i;
                    if (i5 < eVarArr.length) {
                        z b5 = eVarArr[i5].b(j3);
                        if (b5.f9661a.f9510b < b4.f9661a.f9510b) {
                            b4 = b5;
                        }
                        i5++;
                    } else {
                        return b4;
                    }
                }
        }
    }

    @Override // w0.InterfaceC0890A
    public final long k() {
        switch (this.f9621a) {
            case 0:
                return ((t) this.f9623c).b();
            case 1:
                return this.f9622b;
            default:
                return this.f9622b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(long j3) {
        this(j3, 0L);
        this.f9621a = 1;
    }

    public s(long j3, long j4) {
        this.f9621a = 1;
        this.f9622b = j3;
        B b3 = j4 == 0 ? B.f9508c : new B(0L, j4);
        this.f9623c = new z(b3, b3);
    }
}
