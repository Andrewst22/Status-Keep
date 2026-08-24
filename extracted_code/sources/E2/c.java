package E2;

import D2.i;
import java.util.Random;
/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: o  reason: collision with root package name */
    public final b f365o = new ThreadLocal();

    @Override // E2.a
    public final Random a() {
        Object obj = this.f365o.get();
        i.d(obj, "get(...)");
        return (Random) obj;
    }
}
