package K2;

import t2.C0825b;
/* loaded from: classes.dex */
public abstract class H extends AbstractC0089s {

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ int f792r = 0;

    /* renamed from: o  reason: collision with root package name */
    public long f793o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f794p;

    /* renamed from: q  reason: collision with root package name */
    public C0825b f795q;

    public final void i(boolean z3) {
        long j3;
        long j4 = this.f793o;
        if (z3) {
            j3 = 4294967296L;
        } else {
            j3 = 1;
        }
        long j5 = j4 - j3;
        this.f793o = j5;
        if (j5 <= 0 && this.f794p) {
            o();
        }
    }

    public abstract Thread j();

    public final void k(boolean z3) {
        long j3;
        long j4 = this.f793o;
        if (z3) {
            j3 = 4294967296L;
        } else {
            j3 = 1;
        }
        this.f793o = j3 + j4;
        if (!z3) {
            this.f794p = true;
        }
    }

    public abstract long l();

    public final boolean m() {
        Object removeFirst;
        C0825b c0825b = this.f795q;
        if (c0825b == null) {
            return false;
        }
        if (c0825b.isEmpty()) {
            removeFirst = null;
        } else {
            removeFirst = c0825b.removeFirst();
        }
        A a3 = (A) removeFirst;
        if (a3 == null) {
            return false;
        }
        a3.run();
        return true;
    }

    public abstract void o();
}
