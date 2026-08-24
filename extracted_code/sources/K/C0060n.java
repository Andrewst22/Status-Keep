package K;

import java.util.LinkedHashSet;
/* renamed from: K.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0060n extends D2.j implements C2.a {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f654n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Q f655o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0060n(Q q3, int i3) {
        super(0);
        this.f654n = i3;
        this.f655o = q3;
    }

    @Override // C2.a
    public final Object c() {
        switch (this.f654n) {
            case 0:
                return ((M.i) this.f655o.f576v.a()).f1007c;
            default:
                M.f fVar = this.f655o.f567m;
                String n3 = ((T2.l) fVar.f991d.a()).f2380m.n();
                synchronized (M.f.f987f) {
                    LinkedHashSet linkedHashSet = M.f.f986e;
                    if (!linkedHashSet.contains(n3)) {
                        linkedHashSet.add(n3);
                    } else {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + n3 + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                }
                return new M.i(fVar.f988a, (T2.l) fVar.f991d.a(), (a0) fVar.f989b.i((T2.l) fVar.f991d.a(), fVar.f988a), new M.e(fVar, 1));
        }
    }
}
