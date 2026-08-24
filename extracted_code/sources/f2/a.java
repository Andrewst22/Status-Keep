package F2;

import D2.i;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
/* loaded from: classes.dex */
public final class a extends E2.a {
    @Override // E2.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        i.d(current, "current(...)");
        return current;
    }
}
