package R0;

import R.C0113p;
import g2.C0276a;
import java.util.Arrays;
import w0.AbstractC0892b;
import w0.t;
/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: n  reason: collision with root package name */
    public t f2025n;

    /* renamed from: o  reason: collision with root package name */
    public Q0.e f2026o;

    @Override // R0.i
    public final long b(U.t tVar) {
        byte[] bArr = tVar.f2477a;
        if (bArr[0] == -1) {
            int i3 = (bArr[2] & 255) >> 4;
            if (i3 == 6 || i3 == 7) {
                tVar.H(4);
                tVar.B();
            }
            int t3 = AbstractC0892b.t(i3, tVar);
            tVar.G(0);
            return t3;
        }
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [Q0.e, java.lang.Object] */
    @Override // R0.i
    public final boolean c(U.t tVar, long j3, B1.a aVar) {
        byte[] bArr = tVar.f2477a;
        t tVar2 = this.f2025n;
        if (tVar2 == null) {
            t tVar3 = new t(bArr, 17);
            this.f2025n = tVar3;
            aVar.f50n = tVar3.c(Arrays.copyOfRange(bArr, 9, tVar.f2479c), null);
            return true;
        }
        byte b3 = bArr[0];
        if ((b3 & Byte.MAX_VALUE) == 3) {
            C0276a u3 = AbstractC0892b.u(tVar);
            t tVar4 = new t(tVar2.f9624a, tVar2.f9625b, tVar2.f9626c, tVar2.f9627d, tVar2.f9628e, tVar2.f9630g, tVar2.f9631h, tVar2.f9633j, u3, tVar2.f9635l);
            this.f2025n = tVar4;
            ?? obj = new Object();
            obj.f1541o = tVar4;
            obj.f1542p = u3;
            obj.f1539m = -1L;
            obj.f1540n = -1L;
            this.f2026o = obj;
            return true;
        } else if (b3 != -1) {
            return true;
        } else {
            Q0.e eVar = this.f2026o;
            if (eVar != null) {
                eVar.f1539m = j3;
                aVar.f51o = eVar;
            }
            ((C0113p) aVar.f50n).getClass();
            return false;
        }
    }

    @Override // R0.i
    public final void d(boolean z3) {
        super.d(z3);
        if (z3) {
            this.f2025n = null;
            this.f2026o = null;
        }
    }
}
