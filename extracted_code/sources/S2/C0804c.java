package s2;

import D2.i;
import java.io.Serializable;
/* renamed from: s2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0804c implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    public final Throwable f9224m;

    public C0804c(Throwable th) {
        i.e(th, "exception");
        this.f9224m = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0804c) {
            if (i.a(this.f9224m, ((C0804c) obj).f9224m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9224m.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f9224m + ')';
    }
}
