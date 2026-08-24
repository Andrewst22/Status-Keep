package r1;

import o1.C0703b;
/* renamed from: r1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0761c {

    /* renamed from: a  reason: collision with root package name */
    public final C0703b f9011a;

    /* renamed from: b  reason: collision with root package name */
    public final C0760b f9012b;

    /* renamed from: c  reason: collision with root package name */
    public final C0760b f9013c;

    public C0761c(C0703b c0703b, C0760b c0760b, C0760b c0760b2) {
        this.f9011a = c0703b;
        this.f9012b = c0760b;
        this.f9013c = c0760b2;
        if (c0703b.b() == 0 && c0703b.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (c0703b.f8659a != 0 && c0703b.f8660b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C0761c.class.equals(cls)) {
            return false;
        }
        D2.i.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        C0761c c0761c = (C0761c) obj;
        if (D2.i.a(this.f9011a, c0761c.f9011a) && D2.i.a(this.f9012b, c0761c.f9012b) && D2.i.a(this.f9013c, c0761c.f9013c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f9012b.hashCode();
        return this.f9013c.hashCode() + ((hashCode + (this.f9011a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return C0761c.class.getSimpleName() + " { " + this.f9011a + ", type=" + this.f9012b + ", state=" + this.f9013c + " }";
    }
}
