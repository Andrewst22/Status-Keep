package O2;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: m  reason: collision with root package name */
    public c[] f1330m;

    /* renamed from: n  reason: collision with root package name */
    public int f1331n;

    /* renamed from: o  reason: collision with root package name */
    public int f1332o;

    public final void b(N2.s sVar) {
        synchronized (this) {
            try {
                int i3 = this.f1331n - 1;
                this.f1331n = i3;
                if (i3 == 0) {
                    this.f1332o = 0;
                }
                D2.i.c(sVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                N2.q qVar = (N2.q) this;
                N2.s.f1181a.set(sVar, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
