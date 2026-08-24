package j$.time.chrono;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class s implements n {
    public static final s AH;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ s[] f6483a;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean f(j$.time.temporal.s sVar) {
        return AbstractC0335i.j(this, sVar);
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return 1;
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

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f6483a.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, j$.time.chrono.s] */
    static {
        ?? r12 = new Enum("AH", 0);
        AH = r12;
        f6483a = new s[]{r12};
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w r(j$.time.temporal.s sVar) {
        if (sVar == j$.time.temporal.a.ERA) {
            return j$.time.temporal.w.j(1L, 1L);
        }
        return j$.time.temporal.n.d(this, sVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m A(j$.time.temporal.m mVar) {
        return mVar.d(1, j$.time.temporal.a.ERA);
    }
}
