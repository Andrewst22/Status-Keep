package a0;
/* renamed from: a0.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0168l {

    /* renamed from: d  reason: collision with root package name */
    public static final C0168l f3765d = new Object().a();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3766a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3767b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3768c;

    public C0168l(C0167k c0167k) {
        this.f3766a = c0167k.f3762a;
        this.f3767b = c0167k.f3763b;
        this.f3768c = c0167k.f3764c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0168l.class != obj.getClass()) {
            return false;
        }
        C0168l c0168l = (C0168l) obj;
        if (this.f3766a == c0168l.f3766a && this.f3767b == c0168l.f3767b && this.f3768c == c0168l.f3768c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f3766a ? 1 : 0) << 2) + ((this.f3767b ? 1 : 0) << 1) + (this.f3768c ? 1 : 0);
    }
}
