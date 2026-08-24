package D1;

import java.io.Serializable;
/* loaded from: classes.dex */
public class J extends AbstractC0037p implements Serializable {

    /* renamed from: p  reason: collision with root package name */
    public final transient g0 f198p;

    public J(g0 g0Var, int i3) {
        this.f198p = g0Var;
    }

    @Override // D1.AbstractC0036o
    public final boolean b(Object obj) {
        if (obj != null && super.b(obj)) {
            return true;
        }
        return false;
    }

    @Override // D1.AbstractC0036o
    /* renamed from: c */
    public g0 a() {
        return this.f198p;
    }

    public final I d(String str) {
        I i3 = (I) this.f198p.get(str);
        if (i3 == null) {
            G g3 = I.f197n;
            return b0.f231q;
        }
        return i3;
    }

    public final M e() {
        return this.f198p.keySet();
    }
}
