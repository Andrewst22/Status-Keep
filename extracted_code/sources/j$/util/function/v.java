package j$.util.function;

import java.util.function.LongBinaryOperator;
/* loaded from: classes2.dex */
public final /* synthetic */ class v implements w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LongBinaryOperator f6856a;

    private /* synthetic */ v(LongBinaryOperator longBinaryOperator) {
        this.f6856a = longBinaryOperator;
    }

    public static /* synthetic */ v a(LongBinaryOperator longBinaryOperator) {
        if (longBinaryOperator == null) {
            return null;
        }
        return new v(longBinaryOperator);
    }

    @Override // j$.util.function.w
    public final /* synthetic */ long c(long j3, long j4) {
        return this.f6856a.applyAsLong(j3, j4);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongBinaryOperator longBinaryOperator = this.f6856a;
        if (obj instanceof v) {
            obj = ((v) obj).f6856a;
        }
        return longBinaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6856a.hashCode();
    }
}
