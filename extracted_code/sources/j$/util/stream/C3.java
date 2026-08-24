package j$.util.stream;

import j$.util.function.Consumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class C3 implements InterfaceC0440m2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6901a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Consumer f6902b;

    public /* synthetic */ C3(Consumer consumer, int i3) {
        this.f6901a = i3;
        this.f6902b = consumer;
    }

    private final /* synthetic */ void b(long j3) {
    }

    private final /* synthetic */ void c(long j3) {
    }

    private final /* synthetic */ void g() {
    }

    private final /* synthetic */ void i() {
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f6901a) {
            case 0:
                ((W2) this.f6902b).accept(obj);
                return;
            default:
                this.f6902b.accept(obj);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final /* synthetic */ void d(double d3) {
        switch (this.f6901a) {
            case 0:
                AbstractC0482v0.a();
                throw null;
            default:
                AbstractC0482v0.a();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void e(int i3) {
        switch (this.f6901a) {
            case 0:
                AbstractC0482v0.k();
                throw null;
            default:
                AbstractC0482v0.k();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void f(long j3) {
        switch (this.f6901a) {
            case 0:
                AbstractC0482v0.l();
                throw null;
            default:
                AbstractC0482v0.l();
                throw null;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer h(Consumer consumer) {
        switch (this.f6901a) {
            case 0:
                return j$.com.android.tools.r8.a.a(this, consumer);
            default:
                return j$.com.android.tools.r8.a.a(this, consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void r() {
        int i3 = this.f6901a;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void s(long j3) {
        int i3 = this.f6901a;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ boolean v() {
        switch (this.f6901a) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
