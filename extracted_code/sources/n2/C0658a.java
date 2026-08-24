package n2;

import java.util.Objects;
/* renamed from: n2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0658a {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f8399a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0658a.class == obj.getClass()) {
            return this.f8399a.equals(((C0658a) obj).f8399a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f8399a);
    }
}
