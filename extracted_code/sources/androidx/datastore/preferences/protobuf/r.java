package androidx.datastore.preferences.protobuf;
/* loaded from: classes.dex */
public final class r implements J {

    /* renamed from: b  reason: collision with root package name */
    public static final r f4309b = new r(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4310a;

    public /* synthetic */ r(int i3) {
        this.f4310a = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public final boolean a(Class cls) {
        switch (this.f4310a) {
            case 0:
                return AbstractC0197u.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public final T b(Class cls) {
        switch (this.f4310a) {
            case 0:
                if (AbstractC0197u.class.isAssignableFrom(cls)) {
                    try {
                        return (T) AbstractC0197u.f(cls.asSubclass(AbstractC0197u.class)).e(3);
                    } catch (Exception e2) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
