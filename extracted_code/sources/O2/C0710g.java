package o2;

import java.util.Objects;
/* renamed from: o2.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0710g {

    /* renamed from: a  reason: collision with root package name */
    public Long f8697a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0710g.class == obj.getClass()) {
            return this.f8697a.equals(((C0710g) obj).f8697a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f8697a);
    }
}
