package D1;

import java.util.Objects;
/* loaded from: classes.dex */
public final class L extends C {
    @Override // D1.C
    public final C b(Object obj) {
        obj.getClass();
        a(obj);
        return this;
    }

    public final M g() {
        int i3 = this.f186b;
        if (i3 != 0) {
            if (i3 != 1) {
                M i4 = M.i(i3, this.f185a);
                this.f186b = i4.size();
                this.f187c = true;
                return i4;
            }
            Object obj = this.f185a[0];
            Objects.requireNonNull(obj);
            int i5 = M.f202o;
            return new o0(obj);
        }
        int i6 = M.f202o;
        return h0.f263v;
    }
}
