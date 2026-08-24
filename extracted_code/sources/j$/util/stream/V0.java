package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0352g;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class V0 extends P2 implements B0, InterfaceC0487w0 {
    @Override // j$.util.stream.InterfaceC0487w0, j$.util.stream.InterfaceC0502z0
    public final B0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC0502z0
    public final H0 a() {
        return this;
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        w((Double) obj);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void e(int i3) {
        AbstractC0482v0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void f(long j3) {
        AbstractC0482v0.l();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer h(Consumer consumer) {
        return j$.com.android.tools.r8.a.a(this, consumer);
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ Object[] p(IntFunction intFunction) {
        return AbstractC0482v0.m(this, intFunction);
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ H0 q(long j3, long j4, IntFunction intFunction) {
        return AbstractC0482v0.t(this, j3, j4);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void r() {
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0425j2
    public final /* synthetic */ void w(Double d3) {
        AbstractC0482v0.d(this, d3);
    }

    @Override // j$.util.stream.H0
    public final /* bridge */ /* synthetic */ H0 c(int i3) {
        c(i3);
        throw null;
    }

    @Override // j$.util.stream.G0, j$.util.stream.H0
    public final G0 c(int i3) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ void m(Object[] objArr, int i3) {
        AbstractC0482v0.n(this, (Double[]) objArr, i3);
    }

    @Override // j$.util.stream.V2, j$.util.stream.G0
    public final void j(Object obj) {
        super.j((InterfaceC0352g) obj);
    }

    @Override // j$.util.stream.V2, j$.util.stream.G0
    public final void u(int i3, Object obj) {
        super.u(i3, (double[]) obj);
    }

    @Override // j$.util.stream.P2, j$.util.stream.V2, java.lang.Iterable
    public final j$.util.H spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.P2, j$.util.stream.V2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        clear();
        A(j3);
    }

    @Override // j$.util.stream.V2, j$.util.stream.G0
    public final Object i() {
        return (double[]) super.i();
    }
}
