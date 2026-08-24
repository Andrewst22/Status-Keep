package p2;

import R.C0113p;
import Y.G;
import java.util.Objects;
import n2.AbstractC0662e;
import o2.AbstractC0704a;
/* renamed from: p2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0739c extends AbstractC0704a {
    @Override // o2.AbstractC0704a
    public final void g() {
        int i3;
        G g3 = (G) this.f8683o;
        g3.J();
        C0113p c0113p = g3.L;
        Objects.requireNonNull(c0113p);
        int b3 = AbstractC0662e.b(c0113p.f1983v);
        int i4 = c0113p.f1980s;
        int i5 = c0113p.f1981t;
        if (b3 != 2 && b3 != 4) {
            i3 = i5;
        } else {
            b3 = AbstractC0662e.b(0);
            i3 = i4;
            i4 = i5;
        }
        this.f8684p.b(i4, i3, g3.t(), AbstractC0662e.c(b3));
    }
}
