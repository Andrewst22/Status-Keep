package j$.util.stream;

import j$.util.function.C0353h;
import java.util.Objects;
/* renamed from: j$.util.stream.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0486w extends AbstractC0405f2 {

    /* renamed from: b  reason: collision with root package name */
    boolean f7290b;

    /* renamed from: c  reason: collision with root package name */
    C0442n f7291c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0471t f7292d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0486w(C0471t c0471t, InterfaceC0440m2 interfaceC0440m2) {
        super(interfaceC0440m2);
        this.f7292d = c0471t;
        InterfaceC0440m2 interfaceC0440m22 = this.f7161a;
        Objects.requireNonNull(interfaceC0440m22);
        this.f7291c = new C0442n(interfaceC0440m22);
    }

    @Override // j$.util.stream.AbstractC0405f2, j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        this.f7161a.s(-1L);
    }

    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final void d(double d3) {
        C c3 = (C) ((C0353h) this.f7292d.f7259n).f6845a.apply(d3);
        if (c3 != null) {
            try {
                boolean z3 = this.f7290b;
                C0442n c0442n = this.f7291c;
                if (!z3) {
                    c3.sequential().g(c0442n);
                } else {
                    j$.util.B spliterator = ((A) c3.sequential()).spliterator();
                    while (!this.f7161a.v() && spliterator.m(c0442n)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    ((AbstractC0382b) c3).close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (c3 != null) {
            ((AbstractC0382b) c3).close();
        }
    }

    @Override // j$.util.stream.AbstractC0405f2, j$.util.stream.InterfaceC0440m2
    public final boolean v() {
        this.f7290b = true;
        return this.f7161a.v();
    }
}
