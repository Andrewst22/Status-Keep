package o0;
/* renamed from: o0.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0701z {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8653a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8654b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8655c;

    /* renamed from: d  reason: collision with root package name */
    public final long f8656d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8657e;

    public C0701z(Object obj) {
        this(-1L, obj);
    }

    public final C0701z a(Object obj) {
        if (this.f8653a.equals(obj)) {
            return this;
        }
        return new C0701z(obj, this.f8654b, this.f8655c, this.f8656d, this.f8657e);
    }

    public final boolean b() {
        if (this.f8654b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0701z)) {
            return false;
        }
        C0701z c0701z = (C0701z) obj;
        if (this.f8653a.equals(c0701z.f8653a) && this.f8654b == c0701z.f8654b && this.f8655c == c0701z.f8655c && this.f8656d == c0701z.f8656d && this.f8657e == c0701z.f8657e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f8653a.hashCode() + 527) * 31) + this.f8654b) * 31) + this.f8655c) * 31) + ((int) this.f8656d)) * 31) + this.f8657e;
    }

    public C0701z(long j3, Object obj) {
        this(obj, -1, -1, j3, -1);
    }

    public C0701z(Object obj, long j3, int i3) {
        this(obj, -1, -1, j3, i3);
    }

    public C0701z(Object obj, int i3, int i4, long j3, int i5) {
        this.f8653a = obj;
        this.f8654b = i3;
        this.f8655c = i4;
        this.f8656d = j3;
        this.f8657e = i5;
    }
}
