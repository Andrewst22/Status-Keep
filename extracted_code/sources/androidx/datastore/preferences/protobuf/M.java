package androidx.datastore.preferences.protobuf;
/* loaded from: classes.dex */
public final class M implements U {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0197u f4193a;

    /* renamed from: b  reason: collision with root package name */
    public final c0 f4194b;

    /* renamed from: c  reason: collision with root package name */
    public final C0191n f4195c;

    public M(c0 c0Var, C0191n c0191n, AbstractC0197u abstractC0197u) {
        this.f4194b = c0Var;
        c0191n.getClass();
        this.f4195c = c0191n;
        this.f4193a = abstractC0197u;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final boolean a(Object obj) {
        this.f4195c.getClass();
        D2.h.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void b(Object obj, Object obj2) {
        V.A(this.f4194b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void c(Object obj, D d3) {
        this.f4195c.getClass();
        D2.h.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void d(Object obj, U.m mVar, C0190m c0190m) {
        this.f4194b.getClass();
        c0.a(obj);
        this.f4195c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final int e(AbstractC0197u abstractC0197u) {
        this.f4194b.getClass();
        return abstractC0197u.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final int f(AbstractC0197u abstractC0197u) {
        this.f4194b.getClass();
        b0 b0Var = abstractC0197u.unknownFields;
        int i3 = b0Var.f4231d;
        if (i3 == -1) {
            int i4 = 0;
            for (int i5 = 0; i5 < b0Var.f4228a; i5++) {
                int z0 = C0188k.z0(2, b0Var.f4229b[i5] >>> 3);
                i4 += C0188k.j0(3, (C0184g) b0Var.f4230c[i5]) + z0 + (C0188k.y0(1) * 2);
            }
            b0Var.f4231d = i4;
            return i4;
        }
        return i3;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final AbstractC0197u g() {
        AbstractC0197u abstractC0197u = this.f4193a;
        if (abstractC0197u instanceof AbstractC0197u) {
            return abstractC0197u.k();
        }
        return ((AbstractC0195s) abstractC0197u.e(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void h(Object obj) {
        this.f4194b.getClass();
        c0.b(obj);
        this.f4195c.getClass();
        D2.h.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final boolean i(AbstractC0197u abstractC0197u, Object obj) {
        this.f4194b.getClass();
        if (!abstractC0197u.unknownFields.equals(((AbstractC0197u) obj).unknownFields)) {
            return false;
        }
        return true;
    }
}
