package n2;

import java.util.Map;
import java.util.Objects;
/* renamed from: n2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0663f {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f8404a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f8405b;

    /* renamed from: c  reason: collision with root package name */
    public Map f8406c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0663f.class != obj.getClass()) {
            return false;
        }
        C0663f c0663f = (C0663f) obj;
        if (this.f8404a.equals(c0663f.f8404a) && this.f8405b.equals(c0663f.f8405b) && this.f8406c.equals(c0663f.f8406c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f8404a, this.f8405b, this.f8406c);
    }
}
