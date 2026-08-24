package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class O implements F3, G3 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f6996a;

    public /* synthetic */ void d(double d3) {
        AbstractC0482v0.a();
        throw null;
    }

    public /* synthetic */ void e(int i3) {
        AbstractC0482v0.k();
        throw null;
    }

    public /* synthetic */ void f(long j3) {
        AbstractC0482v0.l();
        throw null;
    }

    @Override // j$.util.function.M
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer h(Consumer consumer) {
        return j$.com.android.tools.r8.a.a(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void r() {
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void s(long j3) {
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ boolean v() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public O(boolean z3) {
        this.f6996a = z3;
    }

    @Override // j$.util.stream.F3
    public final int g() {
        if (this.f6996a) {
            return 0;
        }
        return Z2.f7082r;
    }

    @Override // j$.util.stream.F3
    public final Object c(AbstractC0382b abstractC0382b, Spliterator spliterator) {
        if (this.f6996a) {
            new P(abstractC0382b, spliterator, this).invoke();
            return null;
        }
        new Q(abstractC0382b, spliterator, abstractC0382b.a0(this)).invoke();
        return null;
    }

    @Override // j$.util.stream.F3
    public final Object b(AbstractC0382b abstractC0382b, Spliterator spliterator) {
        abstractC0382b.E(spliterator, abstractC0382b.a0(this));
        return null;
    }
}
