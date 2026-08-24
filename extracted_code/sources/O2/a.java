package O2;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class a extends CancellationException {

    /* renamed from: m  reason: collision with root package name */
    public final transient N2.e f1329m;

    public a(N2.e eVar) {
        super("Flow was aborted, no more elements needed");
        this.f1329m = eVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
