package j$.util.function;

import java.util.function.DoubleConsumer;
/* renamed from: j$.util.function.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0351f implements InterfaceC0352g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DoubleConsumer f6844a;

    private /* synthetic */ C0351f(DoubleConsumer doubleConsumer) {
        this.f6844a = doubleConsumer;
    }

    public static /* synthetic */ C0351f b(DoubleConsumer doubleConsumer) {
        if (doubleConsumer == null) {
            return null;
        }
        return new C0351f(doubleConsumer);
    }

    @Override // j$.util.function.InterfaceC0352g
    public final /* synthetic */ void d(double d3) {
        this.f6844a.accept(d3);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleConsumer doubleConsumer = this.f6844a;
        if (obj instanceof C0351f) {
            obj = ((C0351f) obj).f6844a;
        }
        return doubleConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6844a.hashCode();
    }
}
