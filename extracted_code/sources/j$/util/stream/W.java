package j$.util.stream;

import j$.util.function.IntFunction;
import java.util.Objects;
/* loaded from: classes2.dex */
final class W extends AbstractC0410g2 {

    /* renamed from: b  reason: collision with root package name */
    boolean f7050b;

    /* renamed from: c  reason: collision with root package name */
    S f7051c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0476u f7052d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(C0476u c0476u, InterfaceC0440m2 interfaceC0440m2) {
        super(interfaceC0440m2);
        this.f7052d = c0476u;
        InterfaceC0440m2 interfaceC0440m22 = this.f7169a;
        Objects.requireNonNull(interfaceC0440m22);
        this.f7051c = new S(interfaceC0440m22);
    }

    @Override // j$.util.stream.AbstractC0410g2, j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        this.f7169a.s(-1L);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void e(int i3) {
        InterfaceC0388c0 interfaceC0388c0 = (InterfaceC0388c0) ((IntFunction) this.f7052d.f7266n).j(i3);
        if (interfaceC0388c0 != null) {
            try {
                boolean z3 = this.f7050b;
                S s3 = this.f7051c;
                if (!z3) {
                    interfaceC0388c0.sequential().w(s3);
                } else {
                    j$.util.D spliterator = ((AbstractC0378a0) interfaceC0388c0.sequential()).spliterator();
                    while (!this.f7169a.v() && spliterator.c(s3)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    ((AbstractC0382b) interfaceC0388c0).close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC0388c0 != null) {
            ((AbstractC0382b) interfaceC0388c0).close();
        }
    }

    @Override // j$.util.stream.AbstractC0410g2, j$.util.stream.InterfaceC0440m2
    public final boolean v() {
        this.f7050b = true;
        return this.f7169a.v();
    }
}
