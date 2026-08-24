package C;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;
/* loaded from: classes.dex */
public final class S {

    /* renamed from: a  reason: collision with root package name */
    public final Q f83a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            int i3 = P.f80l;
        } else {
            int i4 = Q.f81b;
        }
    }

    public S(WindowInsets windowInsets) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            this.f83a = new P(this, windowInsets);
        } else if (i3 >= 29) {
            this.f83a = new N(this, windowInsets);
        } else if (i3 >= 28) {
            this.f83a = new M(this, windowInsets);
        } else {
            this.f83a = new L(this, windowInsets);
        }
    }

    public static S a(WindowInsets windowInsets, View view) {
        S j3;
        windowInsets.getClass();
        S s3 = new S(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = y.f117a;
            if (Build.VERSION.SDK_INT >= 23) {
                j3 = r.a(view);
            } else {
                j3 = AbstractC0016q.j(view);
            }
            Q q3 = s3.f83a;
            q3.k(j3);
            q3.d(view.getRootView());
        }
        return s3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        return Objects.equals(this.f83a, ((S) obj).f83a);
    }

    public final int hashCode() {
        Q q3 = this.f83a;
        if (q3 == null) {
            return 0;
        }
        return q3.hashCode();
    }

    public S() {
        this.f83a = new Q(this);
    }
}
