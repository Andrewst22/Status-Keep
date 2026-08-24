package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC0352g;
/* renamed from: j$.util.stream.j3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0426j3 implements InterfaceC0425j2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7188a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0352g f7189b;

    public /* synthetic */ C0426j3(InterfaceC0352g interfaceC0352g, int i3) {
        this.f7188a = i3;
        this.f7189b = interfaceC0352g;
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
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f7188a) {
            case 0:
                w((Double) obj);
                return;
            default:
                w((Double) obj);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final void d(double d3) {
        switch (this.f7188a) {
            case 0:
                ((P2) this.f7189b).d(d3);
                return;
            default:
                this.f7189b.d(d3);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void e(int i3) {
        switch (this.f7188a) {
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
        switch (this.f7188a) {
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
        switch (this.f7188a) {
            case 0:
                return j$.com.android.tools.r8.a.a(this, consumer);
            default:
                return j$.com.android.tools.r8.a.a(this, consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void r() {
        int i3 = this.f7188a;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void s(long j3) {
        int i3 = this.f7188a;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ boolean v() {
        switch (this.f7188a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.InterfaceC0425j2
    public final /* synthetic */ void w(Double d3) {
        switch (this.f7188a) {
            case 0:
                AbstractC0482v0.d(this, d3);
                return;
            default:
                AbstractC0482v0.d(this, d3);
                return;
        }
    }
}
