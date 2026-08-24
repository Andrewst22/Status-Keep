package androidx.datastore.preferences.protobuf;
/* loaded from: classes.dex */
public final class C implements J {

    /* renamed from: a  reason: collision with root package name */
    public J[] f4166a;

    @Override // androidx.datastore.preferences.protobuf.J
    public final boolean a(Class cls) {
        for (J j3 : this.f4166a) {
            if (j3.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public final T b(Class cls) {
        J[] jArr;
        for (J j3 : this.f4166a) {
            if (j3.a(cls)) {
                return j3.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
