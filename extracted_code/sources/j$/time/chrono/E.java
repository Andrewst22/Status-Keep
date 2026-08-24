package j$.time.chrono;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class E implements n {
    public static final E BEFORE_ROC;
    public static final E ROC;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ E[] f6440a;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean f(j$.time.temporal.s sVar) {
        return AbstractC0335i.j(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int o(j$.time.temporal.s sVar) {
        return AbstractC0335i.f(this, (j$.time.temporal.a) sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long v(j$.time.temporal.s sVar) {
        return AbstractC0335i.g(this, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object z(j$.time.temporal.t tVar) {
        return AbstractC0335i.n(this, tVar);
    }

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f6440a.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, j$.time.chrono.E] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, j$.time.chrono.E] */
    static {
        ?? r22 = new Enum("BEFORE_ROC", 0);
        BEFORE_ROC = r22;
        ?? r3 = new Enum("ROC", 1);
        ROC = r3;
        f6440a = new E[]{r22, r3};
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w r(j$.time.temporal.s sVar) {
        return j$.time.temporal.n.d(this, sVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return mVar.d(getValue(), j$.time.temporal.a.ERA);
    }
}
