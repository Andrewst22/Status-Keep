package j$.util;

import j$.util.function.Predicate;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
/* renamed from: j$.util.Collection$-CC  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class Collection$CC {
    public static boolean $default$removeIf(Collection collection, Predicate predicate) {
        if (DesugarCollections.f6693a.isInstance(collection)) {
            return DesugarCollections.c(collection, predicate);
        }
        Objects.requireNonNull(predicate);
        Iterator it = collection.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            if (predicate.g(it.next())) {
                it.remove();
                z3 = true;
            }
        }
        return z3;
    }
}
