package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* renamed from: j$.util.stream.g2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0410g2 implements InterfaceC0430k2 {

    /* renamed from: a  reason: collision with root package name */
    protected final InterfaceC0440m2 f7169a;

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

    @Override // j$.util.stream.InterfaceC0430k2
    public final /* synthetic */ void t(Integer num) {
        AbstractC0482v0.f(this, num);
    }

    public AbstractC0410g2(InterfaceC0440m2 interfaceC0440m2) {
        Objects.requireNonNull(interfaceC0440m2);
        this.f7169a = interfaceC0440m2;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public void s(long j3) {
        this.f7169a.s(j3);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public void r() {
        this.f7169a.r();
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public boolean v() {
        return this.f7169a.v();
    }
}
