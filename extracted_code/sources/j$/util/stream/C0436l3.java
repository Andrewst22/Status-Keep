package j$.util.stream;

import j$.util.function.Consumer;
import j$.util.function.InterfaceC0362q;
/* renamed from: j$.util.stream.l3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0436l3 implements InterfaceC0430k2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7203a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0362q f7204b;

    public /* synthetic */ C0436l3(InterfaceC0362q interfaceC0362q, int i3) {
        this.f7203a = i3;
        this.f7204b = interfaceC0362q;
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
        switch (this.f7203a) {
            case 0:
                t((Integer) obj);
                return;
            default:
                t((Integer) obj);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final /* synthetic */ void d(double d3) {
        switch (this.f7203a) {
            case 0:
                AbstractC0482v0.a();
                throw null;
            default:
                AbstractC0482v0.a();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void e(int i3) {
        switch (this.f7203a) {
            case 0:
                ((R2) this.f7204b).e(i3);
                return;
            default:
                this.f7204b.e(i3);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void f(long j3) {
        switch (this.f7203a) {
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
        switch (this.f7203a) {
            case 0:
                return j$.com.android.tools.r8.a.a(this, consumer);
            default:
                return j$.com.android.tools.r8.a.a(this, consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void r() {
        int i3 = this.f7203a;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void s(long j3) {
        int i3 = this.f7203a;
    }

    @Override // j$.util.stream.InterfaceC0430k2
    public final /* synthetic */ void t(Integer num) {
        switch (this.f7203a) {
            case 0:
                AbstractC0482v0.f(this, num);
                return;
            default:
                AbstractC0482v0.f(this, num);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ boolean v() {
        switch (this.f7203a) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
