package j$.util.stream;

import j$.util.Spliterator;
/* renamed from: j$.util.stream.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0427k extends AbstractC0420i2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7190b = 2;

    /* renamed from: c  reason: collision with root package name */
    boolean f7191c;

    /* renamed from: d  reason: collision with root package name */
    Object f7192d;

    public /* synthetic */ C0427k(InterfaceC0440m2 interfaceC0440m2) {
        super(interfaceC0440m2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0427k(J3 j3, InterfaceC0440m2 interfaceC0440m2) {
        super(interfaceC0440m2);
        this.f7192d = j3;
        this.f7191c = true;
    }

    @Override // j$.util.stream.AbstractC0420i2, j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        switch (this.f7190b) {
            case 0:
                this.f7191c = false;
                this.f7192d = null;
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
        switch (this.f7190b) {
            case 0:
                InterfaceC0440m2 interfaceC0440m2 = this.f7182a;
                if (obj == null) {
                    if (this.f7191c) {
                        return;
                    }
                    this.f7191c = true;
                    this.f7192d = null;
                    interfaceC0440m2.accept(null);
                    return;
                }
                Object obj2 = this.f7192d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.f7192d = obj;
                    interfaceC0440m2.accept(obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((C0385b2) this.f7192d).f7113n.a(obj);
                if (stream != null) {
                    try {
                        boolean z3 = this.f7191c;
                        InterfaceC0440m2 interfaceC0440m22 = this.f7182a;
                        if (!z3) {
                            ((Stream) stream.sequential()).b(interfaceC0440m22);
                        } else {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!interfaceC0440m22.v() && spliterator.p(interfaceC0440m22)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.f7191c) {
                    boolean g3 = ((J3) this.f7192d).f6954m.g(obj);
                    this.f7191c = g3;
                    if (g3) {
                        this.f7182a.accept(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0420i2, j$.util.stream.InterfaceC0440m2
    public boolean v() {
        switch (this.f7190b) {
            case 1:
                this.f7191c = true;
                return this.f7182a.v();
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return !this.f7191c || this.f7182a.v();
            default:
                return super.v();
        }
    }

    @Override // j$.util.stream.AbstractC0420i2, j$.util.stream.InterfaceC0440m2
    public void r() {
        switch (this.f7190b) {
            case 0:
                this.f7191c = false;
                this.f7192d = null;
                this.f7182a.r();
                return;
            default:
                super.r();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0427k(C0385b2 c0385b2, InterfaceC0440m2 interfaceC0440m2) {
        super(interfaceC0440m2);
        this.f7192d = c0385b2;
    }
}
