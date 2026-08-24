package defpackage;

import m2.AbstractC0635d;
/* renamed from: a  reason: default package */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f3594a;

    public a(Boolean bool) {
        this.f3594a = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return android.support.v4.media.session.a.p(AbstractC0635d.s(this.f3594a), AbstractC0635d.s(((a) obj).f3594a));
    }

    public final int hashCode() {
        return AbstractC0635d.s(this.f3594a).hashCode();
    }

    public final String toString() {
        return "IsEnabledMessage(enabled=" + this.f3594a + ")";
    }
}
