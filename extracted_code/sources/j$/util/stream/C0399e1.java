package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0362q;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.e1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0399e1 extends R2 implements D0, InterfaceC0492x0 {
    @Override // j$.util.stream.InterfaceC0492x0, j$.util.stream.InterfaceC0502z0
    public final D0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC0502z0
    public final H0 a() {
        return this;
    }

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        t((Integer) obj);
    }

    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final /* synthetic */ void d(double d3) {
        AbstractC0482v0.a();
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
        return AbstractC0482v0.u(this, j3, j4);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void r() {
    }

    @Override // j$.util.stream.InterfaceC0430k2
    public final /* synthetic */ void t(Integer num) {
        AbstractC0482v0.f(this, num);
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
        AbstractC0482v0.o(this, (Integer[]) objArr, i3);
    }

    @Override // j$.util.stream.V2, j$.util.stream.G0
    public final void j(Object obj) {
        super.j((InterfaceC0362q) obj);
    }

    @Override // j$.util.stream.V2, j$.util.stream.G0
    public final void u(int i3, Object obj) {
        super.u(i3, (int[]) obj);
    }

    @Override // j$.util.stream.R2, j$.util.stream.V2, java.lang.Iterable
    public final j$.util.H spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.R2, j$.util.stream.V2, java.lang.Iterable
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
        return (int[]) super.i();
    }
}
