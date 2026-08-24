package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.n1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0444n1 extends T2 implements F0, InterfaceC0497y0 {
    @Override // j$.util.stream.InterfaceC0497y0, j$.util.stream.InterfaceC0502z0
    public final F0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC0502z0
    public final H0 a() {
        return this;
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        n((Long) obj);
    }

    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final /* synthetic */ void d(double d3) {
        AbstractC0482v0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void e(int i3) {
        AbstractC0482v0.k();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer h(Consumer consumer) {
        return j$.com.android.tools.r8.a.a(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0435l2
    public final /* synthetic */ void n(Long l3) {
        AbstractC0482v0.i(this, l3);
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
        return AbstractC0482v0.v(this, j3, j4);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void r() {
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ boolean v() {
        return false;
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
        AbstractC0482v0.p(this, (Long[]) objArr, i3);
    }

    @Override // j$.util.stream.V2, j$.util.stream.G0
    public final void j(Object obj) {
        super.j((j$.util.function.y) obj);
    }

    @Override // j$.util.stream.V2, j$.util.stream.G0
    public final void u(int i3, Object obj) {
        super.u(i3, (long[]) obj);
    }

    @Override // j$.util.stream.T2, j$.util.stream.V2, java.lang.Iterable
    public final j$.util.H spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.T2, j$.util.stream.V2, java.lang.Iterable
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
        return (long[]) super.i();
    }
}
