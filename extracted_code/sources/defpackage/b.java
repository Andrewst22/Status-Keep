package defpackage;

import android.support.v4.media.session.a;
import m2.AbstractC0635d;
/* renamed from: b  reason: default package */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f4505a;

    public b(Boolean bool) {
        this.f4505a = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return a.p(AbstractC0635d.s(this.f4505a), AbstractC0635d.s(((b) obj).f4505a));
    }

    public final int hashCode() {
        return AbstractC0635d.s(this.f4505a).hashCode();
    }

    public final String toString() {
        return "ToggleMessage(enable=" + this.f4505a + ")";
    }
}
