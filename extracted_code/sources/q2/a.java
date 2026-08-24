package q2;

import R.C0113p;
import R.c0;
import Y.G;
import android.os.Build;
import java.util.Objects;
import n2.AbstractC0662e;
import o2.AbstractC0704a;
/* loaded from: classes.dex */
public final class a extends AbstractC0704a {

    /* renamed from: q  reason: collision with root package name */
    public boolean f8880q;

    @Override // o2.AbstractC0704a
    public final void g() {
        G g3 = (G) this.f8683o;
        g3.J();
        c0 c0Var = g3.f3053b0;
        int i3 = c0Var.f1880a;
        int i4 = 1;
        int i5 = c0Var.f1881b;
        if (i3 != 0 && i5 != 0) {
            try {
                if (Build.VERSION.SDK_INT <= 21) {
                    int b3 = AbstractC0662e.b(c0Var.f1882c);
                    if (b3 == 3) {
                        i4 = b3;
                    }
                } else if (!this.f8880q) {
                    g3.J();
                    C0113p c0113p = g3.L;
                    Objects.requireNonNull(c0113p);
                    i4 = AbstractC0662e.b(c0113p.f1983v);
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        this.f8684p.b(i3, i5, g3.t(), AbstractC0662e.c(i4));
    }
}
