package R;
/* renamed from: R.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102e {

    /* renamed from: c  reason: collision with root package name */
    public static final C0102e f1884c = new C0102e(0);

    /* renamed from: a  reason: collision with root package name */
    public final int f1885a;

    /* renamed from: b  reason: collision with root package name */
    public C1.j f1886b;

    static {
        D2.h.m(0, 1, 2, 3, 4);
    }

    public C0102e(int i3) {
        this.f1885a = i3;
    }

    public final C1.j a() {
        if (this.f1886b == null) {
            this.f1886b = new C1.j(this);
        }
        return this.f1886b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0102e.class == obj.getClass() && this.f1885a == ((C0102e) obj).f1885a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((527 + this.f1885a) * 961) + 1) * 31) + 1) * 31;
    }
}
