package m2;
/* renamed from: m2.N  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0631N {

    /* renamed from: a  reason: collision with root package name */
    public final String f8237a;

    /* renamed from: b  reason: collision with root package name */
    public final EnumC0629L f8238b;

    public C0631N(String str, EnumC0629L enumC0629L) {
        this.f8237a = str;
        this.f8238b = enumC0629L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0631N)) {
            return false;
        }
        C0631N c0631n = (C0631N) obj;
        if (D2.i.a(this.f8237a, c0631n.f8237a) && this.f8238b == c0631n.f8238b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f8237a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f8238b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f8237a + ", type=" + this.f8238b + ")";
    }
}
