package D1;

import java.io.Serializable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class X implements C1.k, Serializable {

    /* renamed from: m  reason: collision with root package name */
    public final int f220m;

    public X() {
        r.e("expectedValuesPerKey", 2);
        this.f220m = 2;
    }

    @Override // C1.k
    public final Object get() {
        return new ArrayList(this.f220m);
    }
}
