package j$.util.stream;

import java.util.Objects;
/* renamed from: j$.util.stream.g0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0408g0 extends AbstractC0415h2 {

    /* renamed from: b  reason: collision with root package name */
    boolean f7166b;

    /* renamed from: c  reason: collision with root package name */
    C0393d0 f7167c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0481v f7168d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0408g0(C0481v c0481v, InterfaceC0440m2 interfaceC0440m2) {
        super(interfaceC0440m2);
        this.f7168d = c0481v;
        InterfaceC0440m2 interfaceC0440m22 = this.f7176a;
        Objects.requireNonNull(interfaceC0440m22);
        this.f7167c = new C0393d0(interfaceC0440m22);
    }

    @Override // j$.util.stream.AbstractC0415h2, j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        this.f7176a.s(-1L);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void f(long j3) {
        InterfaceC0433l0 interfaceC0433l0 = (InterfaceC0433l0) ((j$.util.function.z) this.f7168d.f7276n).f6858a.apply(j3);
        if (interfaceC0433l0 != null) {
            try {
                boolean z3 = this.f7166b;
                C0393d0 c0393d0 = this.f7167c;
                if (!z3) {
                    interfaceC0433l0.sequential().e(c0393d0);
                } else {
                    j$.util.F spliterator = ((AbstractC0423j0) interfaceC0433l0.sequential()).spliterator();
                    while (!this.f7176a.v() && spliterator.j(c0393d0)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    ((AbstractC0382b) interfaceC0433l0).close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC0433l0 != null) {
            ((AbstractC0382b) interfaceC0433l0).close();
        }
    }

    @Override // j$.util.stream.AbstractC0415h2, j$.util.stream.InterfaceC0440m2
    public final boolean v() {
        this.f7166b = true;
        return this.f7176a.v();
    }
}
