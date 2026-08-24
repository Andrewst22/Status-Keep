package m2;
/* renamed from: m2.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0639h {

    /* renamed from: a  reason: collision with root package name */
    public final String f8257a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8258b;

    public C0639h(String str, boolean z3) {
        this.f8257a = str;
        this.f8258b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0639h)) {
            return false;
        }
        C0639h c0639h = (C0639h) obj;
        if (D2.i.a(this.f8257a, c0639h.f8257a) && this.f8258b == c0639h.f8258b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i3;
        String str = this.f8257a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = hashCode * 31;
        if (this.f8258b) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        return i4 + i3;
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f8257a + ", useDataStore=" + this.f8258b + ")";
    }
}
