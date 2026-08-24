package e0;

import R.C0110m;
import R.C0112o;
import R.C0113p;
import R.E;
import R.F;
import java.util.Map;
import o0.T;
/* loaded from: classes.dex */
public final class s extends T {

    /* renamed from: H  reason: collision with root package name */
    public final Map f5332H;

    /* renamed from: I  reason: collision with root package name */
    public C0110m f5333I;

    public s(s0.e eVar, d0.g gVar, d0.d dVar, Map map) {
        super(eVar, gVar, dVar);
        this.f5332H = map;
    }

    @Override // o0.T
    public final C0113p n(C0113p c0113p) {
        C0110m c0110m;
        C0110m c0110m2 = this.f5333I;
        if (c0110m2 == null) {
            c0110m2 = c0113p.f1978q;
        }
        if (c0110m2 != null && (c0110m = (C0110m) this.f5332H.get(c0110m2.f1914o)) != null) {
            c0110m2 = c0110m;
        }
        F f3 = c0113p.f1972k;
        F f4 = null;
        if (f3 != null) {
            E[] eArr = f3.f1770m;
            int length = eArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    E e2 = eArr[i3];
                    if ((e2 instanceof K0.m) && "com.apple.streaming.transportStreamTimestamp".equals(((K0.m) e2).f731n)) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (i3 != -1) {
                if (length != 1) {
                    E[] eArr2 = new E[length - 1];
                    for (int i4 = 0; i4 < length; i4++) {
                        if (i4 != i3) {
                            eArr2[i4 < i3 ? i4 : i4 - 1] = eArr[i4];
                        }
                    }
                    f4 = new F(eArr2);
                }
            }
            if (c0110m2 == c0113p.f1978q || f3 != c0113p.f1972k) {
                C0112o a3 = c0113p.a();
                a3.f1941p = c0110m2;
                a3.f1935j = f3;
                c0113p = new C0113p(a3);
            }
            return super.n(c0113p);
        }
        f3 = f4;
        if (c0110m2 == c0113p.f1978q) {
        }
        C0112o a32 = c0113p.a();
        a32.f1941p = c0110m2;
        a32.f1935j = f3;
        c0113p = new C0113p(a32);
        return super.n(c0113p);
    }
}
