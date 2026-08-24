package j$.util.stream;
/* loaded from: classes2.dex */
final class E3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Runnable f6916a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Runnable f6917b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E3(Runnable runnable, Runnable runnable2) {
        this.f6916a = runnable;
        this.f6917b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f6917b;
        try {
            this.f6916a.run();
            runnable.run();
        } catch (Throwable th) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                try {
                    th.addSuppressed(th2);
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}
