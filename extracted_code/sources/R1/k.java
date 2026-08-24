package r1;

import C.S;
import android.graphics.Rect;
import o1.C0703b;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final C0703b f9029a;

    /* renamed from: b  reason: collision with root package name */
    public final S f9030b;

    public k(C0703b c0703b, S s3) {
        D2.i.e(s3, "_windowInsetsCompat");
        this.f9029a = c0703b;
        this.f9030b = s3;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!k.class.equals(cls)) {
            return false;
        }
        D2.i.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        k kVar = (k) obj;
        if (D2.i.a(this.f9029a, kVar.f9029a) && D2.i.a(this.f9030b, kVar.f9030b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9030b.hashCode() + (this.f9029a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f9029a + ", windowInsetsCompat=" + this.f9030b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Rect rect, S s3) {
        this(new C0703b(rect), s3);
        D2.i.e(s3, "insets");
    }
}
