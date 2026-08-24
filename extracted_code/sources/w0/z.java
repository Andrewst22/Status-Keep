package w0;
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final B f9661a;

    /* renamed from: b  reason: collision with root package name */
    public final B f9662b;

    public z(B b3, B b4) {
        this.f9661a = b3;
        this.f9662b = b4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f9661a.equals(zVar.f9661a) && this.f9662b.equals(zVar.f9662b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9662b.hashCode() + (this.f9661a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        B b3 = this.f9661a;
        sb.append(b3);
        B b4 = this.f9662b;
        if (b3.equals(b4)) {
            str = "";
        } else {
            str = ", " + b4;
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
