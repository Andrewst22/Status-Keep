package j$.util.function;

import java.util.function.IntConsumer;
/* renamed from: j$.util.function.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0361p implements InterfaceC0362q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntConsumer f6851a;

    private /* synthetic */ C0361p(IntConsumer intConsumer) {
        this.f6851a = intConsumer;
    }

    public static /* synthetic */ C0361p b(IntConsumer intConsumer) {
        if (intConsumer == null) {
            return null;
        }
        return new C0361p(intConsumer);
    }

    @Override // j$.util.function.InterfaceC0362q
    public final /* synthetic */ void e(int i3) {
        this.f6851a.accept(i3);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntConsumer intConsumer = this.f6851a;
        if (obj instanceof C0361p) {
            obj = ((C0361p) obj).f6851a;
        }
        return intConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6851a.hashCode();
    }
}
