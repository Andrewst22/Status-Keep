package j$.util.stream;

import j$.util.function.Consumer;
/* renamed from: j$.util.stream.n3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0446n3 implements InterfaceC0435l2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7214a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j$.util.function.y f7215b;

    public /* synthetic */ C0446n3(j$.util.function.y yVar, int i3) {
        this.f7214a = i3;
        this.f7215b = yVar;
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
        switch (this.f7214a) {
            case 0:
                n((Long) obj);
                return;
            default:
                n((Long) obj);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final /* synthetic */ void d(double d3) {
        switch (this.f7214a) {
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
        switch (this.f7214a) {
            case 0:
                AbstractC0482v0.k();
                throw null;
            default:
                AbstractC0482v0.k();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void f(long j3) {
        switch (this.f7214a) {
            case 0:
                ((T2) this.f7215b).f(j3);
                return;
            default:
                this.f7215b.f(j3);
                return;
        }
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer h(Consumer consumer) {
        switch (this.f7214a) {
            case 0:
                return j$.com.android.tools.r8.a.a(this, consumer);
            default:
                return j$.com.android.tools.r8.a.a(this, consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC0435l2
    public final /* synthetic */ void n(Long l3) {
        switch (this.f7214a) {
            case 0:
                AbstractC0482v0.i(this, l3);
                return;
            default:
                AbstractC0482v0.i(this, l3);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void r() {
        int i3 = this.f7214a;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void s(long j3) {
        int i3 = this.f7214a;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ boolean v() {
        switch (this.f7214a) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
