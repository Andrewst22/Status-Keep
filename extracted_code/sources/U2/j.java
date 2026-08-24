package u2;

import C2.p;
import java.io.Serializable;
/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: m  reason: collision with root package name */
    public static final j f9461m = new Object();

    @Override // u2.i
    public final InterfaceC0869g d(h hVar) {
        D2.i.e(hVar, "key");
        return null;
    }

    @Override // u2.i
    public final i f(h hVar) {
        D2.i.e(hVar, "key");
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // u2.i
    public final i n(i iVar) {
        D2.i.e(iVar, "context");
        return iVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // u2.i
    public final Object c(Object obj, p pVar) {
        return obj;
    }
}
