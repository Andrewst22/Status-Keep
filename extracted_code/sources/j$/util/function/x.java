package j$.util.function;

import java.util.function.LongConsumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class x implements y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LongConsumer f6857a;

    private /* synthetic */ x(LongConsumer longConsumer) {
        this.f6857a = longConsumer;
    }

    public static /* synthetic */ x b(LongConsumer longConsumer) {
        if (longConsumer == null) {
            return null;
        }
        return new x(longConsumer);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongConsumer longConsumer = this.f6857a;
        if (obj instanceof x) {
            obj = ((x) obj).f6857a;
        }
        return longConsumer.equals(obj);
    }

    @Override // j$.util.function.y
    public final /* synthetic */ void f(long j3) {
        this.f6857a.accept(j3);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6857a.hashCode();
    }
}
