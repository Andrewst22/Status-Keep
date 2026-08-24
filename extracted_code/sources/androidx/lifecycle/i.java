package androidx.lifecycle;
/* loaded from: classes.dex */
public final class i {
    public static k a(l lVar) {
        D2.i.e(lVar, "state");
        int ordinal = lVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return null;
                }
                return k.ON_RESUME;
            }
            return k.ON_START;
        }
        return k.ON_CREATE;
    }
}
