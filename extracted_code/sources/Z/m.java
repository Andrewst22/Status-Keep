package Z;

import U.A;
import U.AbstractC0123a;
import android.media.metrics.LogSessionId;
import java.util.Objects;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f3529a;

    /* renamed from: b  reason: collision with root package name */
    public final l f3530b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3531c;

    static {
        if (A.f2405a < 31) {
            new m("");
        } else {
            new m(l.f3527b, "");
        }
    }

    public m(String str) {
        AbstractC0123a.j(A.f2405a < 31);
        this.f3529a = str;
        this.f3530b = null;
        this.f3531c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (Objects.equals(this.f3529a, mVar.f3529a) && Objects.equals(this.f3530b, mVar.f3530b) && Objects.equals(this.f3531c, mVar.f3531c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3529a, this.f3530b, this.f3531c);
    }

    public m(LogSessionId logSessionId, String str) {
        this(new l(logSessionId), str);
    }

    public m(l lVar, String str) {
        this.f3530b = lVar;
        this.f3529a = str;
        this.f3531c = new Object();
    }
}
