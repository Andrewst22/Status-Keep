package K;

import n2.AbstractC0664g;
import u2.C0864b;
import u2.InterfaceC0869g;
/* loaded from: classes.dex */
public final class e0 implements InterfaceC0869g {

    /* renamed from: m  reason: collision with root package name */
    public final e0 f617m;

    /* renamed from: n  reason: collision with root package name */
    public final Q f618n;

    public e0(e0 e0Var, Q q3) {
        D2.i.e(q3, "instance");
        this.f617m = e0Var;
        this.f618n = q3;
    }

    @Override // u2.i
    public final Object c(Object obj, C2.p pVar) {
        return pVar.i(obj, this);
    }

    @Override // u2.i
    public final InterfaceC0869g d(u2.h hVar) {
        return AbstractC0664g.m(this, hVar);
    }

    public final void e(Q q3) {
        if (this.f618n != q3) {
            e0 e0Var = this.f617m;
            if (e0Var != null) {
                e0Var.e(q3);
                return;
            }
            return;
        }
        throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
    }

    @Override // u2.i
    public final u2.i f(u2.h hVar) {
        return AbstractC0664g.r(this, hVar);
    }

    @Override // u2.InterfaceC0869g
    public final u2.h getKey() {
        return d0.f612m;
    }

    @Override // u2.i
    public final u2.i n(u2.i iVar) {
        D2.i.e(iVar, "context");
        if (iVar == u2.j.f9461m) {
            return this;
        }
        return (u2.i) iVar.c(this, new C0864b(1));
    }
}
