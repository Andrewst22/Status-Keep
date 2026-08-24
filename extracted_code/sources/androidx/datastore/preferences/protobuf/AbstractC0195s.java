package androidx.datastore.preferences.protobuf;
/* renamed from: androidx.datastore.preferences.protobuf.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0195s implements Cloneable {

    /* renamed from: m  reason: collision with root package name */
    public final AbstractC0197u f4311m;

    /* renamed from: n  reason: collision with root package name */
    public AbstractC0197u f4312n;

    public AbstractC0195s(AbstractC0197u abstractC0197u) {
        this.f4311m = abstractC0197u;
        if (!abstractC0197u.i()) {
            this.f4312n = abstractC0197u.k();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final AbstractC0197u a() {
        AbstractC0197u b3 = b();
        b3.getClass();
        if (AbstractC0197u.h(b3, true)) {
            return b3;
        }
        throw new a0();
    }

    public final AbstractC0197u b() {
        if (!this.f4312n.i()) {
            return this.f4312n;
        }
        AbstractC0197u abstractC0197u = this.f4312n;
        abstractC0197u.getClass();
        Q q3 = Q.f4198c;
        q3.getClass();
        q3.a(abstractC0197u.getClass()).h(abstractC0197u);
        abstractC0197u.j();
        return this.f4312n;
    }

    public final void c() {
        if (!this.f4312n.i()) {
            AbstractC0197u k3 = this.f4311m.k();
            AbstractC0197u abstractC0197u = this.f4312n;
            Q q3 = Q.f4198c;
            q3.getClass();
            q3.a(k3.getClass()).b(k3, abstractC0197u);
            this.f4312n = k3;
        }
    }

    public final Object clone() {
        AbstractC0195s abstractC0195s = (AbstractC0195s) this.f4311m.e(5);
        abstractC0195s.f4312n = b();
        return abstractC0195s;
    }
}
