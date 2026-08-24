package K;

import K2.C0085n;
import java.util.concurrent.CancellationException;
import s2.C0808g;
/* loaded from: classes.dex */
public final class M extends D2.j implements C2.p {

    /* renamed from: n  reason: collision with root package name */
    public static final M f552n = new D2.j(2);

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        T t3 = (T) obj;
        Throwable th = (Throwable) obj2;
        D2.i.e(t3, "msg");
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        t3.f580b.K(new C0085n(th, false));
        return C0808g.f9229a;
    }
}
