package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Objects;
/* renamed from: j$.util.stream.i2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0420i2 implements InterfaceC0440m2 {

    /* renamed from: a  reason: collision with root package name */
    protected final InterfaceC0440m2 f7182a;

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

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void f(long j3) {
        AbstractC0482v0.l();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer h(Consumer consumer) {
        return j$.com.android.tools.r8.a.a(this, consumer);
    }

    public AbstractC0420i2(InterfaceC0440m2 interfaceC0440m2) {
        Objects.requireNonNull(interfaceC0440m2);
        this.f7182a = interfaceC0440m2;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public void s(long j3) {
        this.f7182a.s(j3);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public void r() {
        this.f7182a.r();
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public boolean v() {
        return this.f7182a.v();
    }
}
