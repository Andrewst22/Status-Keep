package K2;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class Q extends CancellationException {

    /* renamed from: m  reason: collision with root package name */
    public final transient Z f803m;

    public Q(String str, Throwable th, Z z3) {
        super(str);
        this.f803m = z3;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Q) {
                Q q3 = (Q) obj;
                if (!D2.i.a(q3.getMessage(), getMessage()) || !D2.i.a(q3.f803m, this.f803m) || !D2.i.a(q3.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i3;
        String message = getMessage();
        D2.i.b(message);
        int hashCode = (this.f803m.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i3 = cause.hashCode();
        } else {
            i3 = 0;
        }
        return hashCode + i3;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f803m;
    }
}
