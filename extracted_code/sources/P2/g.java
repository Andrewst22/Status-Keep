package P2;
/* loaded from: classes.dex */
public final class g extends RuntimeException {

    /* renamed from: m  reason: collision with root package name */
    public final transient u2.i f1482m;

    public g(u2.i iVar) {
        this.f1482m = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f1482m.toString();
    }
}
