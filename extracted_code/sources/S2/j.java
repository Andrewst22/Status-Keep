package S2;

import P2.v;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* loaded from: classes.dex */
public final class j extends v {

    /* renamed from: q  reason: collision with root package name */
    public final AtomicReferenceArray f2227q;

    public j(long j3, j jVar, int i3) {
        super(j3, jVar, i3);
        this.f2227q = new AtomicReferenceArray(i.f2226f);
    }

    @Override // P2.v
    public final int f() {
        return i.f2226f;
    }

    @Override // P2.v
    public final void g(int i3, u2.i iVar) {
        this.f2227q.set(i3, i.f2225e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f1515o + ", hashCode=" + hashCode() + ']';
    }
}
