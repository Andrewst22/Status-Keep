package j$.util.stream;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class A3 {
    public static final A3 MAYBE_MORE;
    public static final A3 NO_MORE;
    public static final A3 UNLIMITED;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ A3[] f6887a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, j$.util.stream.A3] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, j$.util.stream.A3] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.util.stream.A3] */
    static {
        ?? r3 = new Enum("NO_MORE", 0);
        NO_MORE = r3;
        ?? r4 = new Enum("MAYBE_MORE", 1);
        MAYBE_MORE = r4;
        ?? r5 = new Enum("UNLIMITED", 2);
        UNLIMITED = r5;
        f6887a = new A3[]{r3, r4, r5};
    }

    public static A3 valueOf(String str) {
        return (A3) Enum.valueOf(A3.class, str);
    }

    public static A3[] values() {
        return (A3[]) f6887a.clone();
    }
}
