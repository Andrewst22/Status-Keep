package R;

import java.io.IOException;
/* loaded from: classes.dex */
public class H extends IOException {

    /* renamed from: m  reason: collision with root package name */
    public final boolean f1774m;

    /* renamed from: n  reason: collision with root package name */
    public final int f1775n;

    public H(String str, Exception exc, boolean z3, int i3) {
        super(str, exc);
        this.f1774m = z3;
        this.f1775n = i3;
    }

    public static H a(RuntimeException runtimeException, String str) {
        return new H(str, runtimeException, true, 1);
    }

    public static H b(String str, Exception exc) {
        return new H(str, exc, true, 4);
    }

    public static H c(String str) {
        return new H(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.f1774m + ", dataType=" + this.f1775n + "}";
    }
}
