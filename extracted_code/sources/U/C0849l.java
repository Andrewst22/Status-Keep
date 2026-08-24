package u;

import android.content.res.Resources;
import java.util.Objects;
/* renamed from: u.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0849l {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f9292a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources.Theme f9293b;

    public C0849l(Resources resources, Resources.Theme theme) {
        this.f9292a = resources;
        this.f9293b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0849l.class != obj.getClass()) {
            return false;
        }
        C0849l c0849l = (C0849l) obj;
        if (this.f9292a.equals(c0849l.f9292a) && Objects.equals(this.f9293b, c0849l.f9293b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f9292a, this.f9293b);
    }
}
