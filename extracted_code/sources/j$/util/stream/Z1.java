package j$.util.stream;

import j$.util.function.Function;
import java.util.Objects;
/* loaded from: classes2.dex */
final class Z1 extends AbstractC0420i2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7066b = 2;

    /* renamed from: c  reason: collision with root package name */
    boolean f7067c;

    /* renamed from: d  reason: collision with root package name */
    Object f7068d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AbstractC0382b f7069e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z1(C0476u c0476u, InterfaceC0440m2 interfaceC0440m2) {
        super(interfaceC0440m2);
        this.f7069e = c0476u;
        InterfaceC0440m2 interfaceC0440m22 = this.f7182a;
        Objects.requireNonNull(interfaceC0440m22);
        this.f7068d = new S(interfaceC0440m22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z1(C0471t c0471t, InterfaceC0440m2 interfaceC0440m2) {
        super(interfaceC0440m2);
        this.f7069e = c0471t;
        InterfaceC0440m2 interfaceC0440m22 = this.f7182a;
        Objects.requireNonNull(interfaceC0440m22);
        this.f7068d = new C0442n(interfaceC0440m22);
    }

    @Override // j$.util.stream.AbstractC0420i2, j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        switch (this.f7066b) {
            case 0:
                this.f7182a.s(-1L);
                return;
            case 1:
                this.f7182a.s(-1L);
                return;
            default:
                this.f7182a.s(-1L);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f7066b) {
            case 0:
                InterfaceC0433l0 interfaceC0433l0 = (InterfaceC0433l0) ((Function) ((C0481v) this.f7069e).f7276n).a(obj);
                if (interfaceC0433l0 != null) {
                    try {
                        boolean z3 = this.f7067c;
                        C0393d0 c0393d0 = (C0393d0) this.f7068d;
                        if (!z3) {
                            interfaceC0433l0.sequential().e(c0393d0);
                        } else {
                            j$.util.F spliterator = ((AbstractC0423j0) interfaceC0433l0.sequential()).spliterator();
                            while (!this.f7182a.v() && spliterator.j(c0393d0)) {
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
                    return;
                }
                return;
            case 1:
                InterfaceC0388c0 interfaceC0388c0 = (InterfaceC0388c0) ((Function) ((C0476u) this.f7069e).f7266n).a(obj);
                if (interfaceC0388c0 != null) {
                    try {
                        boolean z4 = this.f7067c;
                        S s3 = (S) this.f7068d;
                        if (!z4) {
                            interfaceC0388c0.sequential().w(s3);
                        } else {
                            j$.util.D spliterator2 = ((AbstractC0378a0) interfaceC0388c0.sequential()).spliterator();
                            while (!this.f7182a.v() && spliterator2.c(s3)) {
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            ((AbstractC0382b) interfaceC0388c0).close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                if (interfaceC0388c0 != null) {
                    ((AbstractC0382b) interfaceC0388c0).close();
                    return;
                }
                return;
            default:
                C c3 = (C) ((Function) ((C0471t) this.f7069e).f7259n).a(obj);
                if (c3 != null) {
                    try {
                        boolean z5 = this.f7067c;
                        C0442n c0442n = (C0442n) this.f7068d;
                        if (!z5) {
                            c3.sequential().g(c0442n);
                        } else {
                            j$.util.B spliterator3 = ((A) c3.sequential()).spliterator();
                            while (!this.f7182a.v() && spliterator3.m(c0442n)) {
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            ((AbstractC0382b) c3).close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                if (c3 != null) {
                    ((AbstractC0382b) c3).close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0420i2, j$.util.stream.InterfaceC0440m2
    public final boolean v() {
        switch (this.f7066b) {
            case 0:
                this.f7067c = true;
                return this.f7182a.v();
            case 1:
                this.f7067c = true;
                return this.f7182a.v();
            default:
                this.f7067c = true;
                return this.f7182a.v();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z1(C0481v c0481v, InterfaceC0440m2 interfaceC0440m2) {
        super(interfaceC0440m2);
        this.f7069e = c0481v;
        InterfaceC0440m2 interfaceC0440m22 = this.f7182a;
        Objects.requireNonNull(interfaceC0440m22);
        this.f7068d = new C0393d0(interfaceC0440m22);
    }
}
