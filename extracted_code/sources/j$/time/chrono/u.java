package j$.time.chrono;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class u implements n {
    public static final u BCE;
    public static final u CE;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ u[] f6485a;

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

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f6485a.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, j$.time.chrono.u] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, j$.time.chrono.u] */
    static {
        ?? r22 = new Enum("BCE", 0);
        BCE = r22;
        ?? r3 = new Enum("CE", 1);
        CE = r3;
        f6485a = new u[]{r22, r3};
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
