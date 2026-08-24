package C;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import v.C0872c;
/* loaded from: classes.dex */
public class Q {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f81b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final S f82a;

    static {
        J f3;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            f3 = new I();
        } else if (i3 >= 29) {
            f3 = new H();
        } else {
            f3 = new F();
        }
        f3.b().f83a.a().f83a.b().f83a.c();
    }

    public Q(S s3) {
        this.f82a = s3;
    }

    public S a() {
        return this.f82a;
    }

    public S b() {
        return this.f82a;
    }

    public S c() {
        return this.f82a;
    }

    public C0004e e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q3 = (Q) obj;
        if (i() == q3.i() && h() == q3.h() && Objects.equals(g(), q3.g()) && Objects.equals(f(), q3.f()) && Objects.equals(e(), q3.e())) {
            return true;
        }
        return false;
    }

    public C0872c f() {
        return C0872c.f9463e;
    }

    public C0872c g() {
        return C0872c.f9463e;
    }

    public boolean h() {
        return false;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(i()), Boolean.valueOf(h()), g(), f(), e());
    }

    public boolean i() {
        return false;
    }

    public void d(View view) {
    }

    public void j(C0872c[] c0872cArr) {
    }

    public void k(S s3) {
    }

    public void l(C0872c c0872c) {
    }
}
