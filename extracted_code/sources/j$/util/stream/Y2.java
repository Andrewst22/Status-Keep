package j$.util.stream;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class Y2 {
    public static final Y2 OP;
    public static final Y2 SPLITERATOR;
    public static final Y2 STREAM;
    public static final Y2 TERMINAL_OP;
    public static final Y2 UPSTREAM_TERMINAL_OP;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ Y2[] f7064a;

    public static Y2 valueOf(String str) {
        return (Y2) Enum.valueOf(Y2.class, str);
    }

    public static Y2[] values() {
        return (Y2[]) f7064a.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [j$.util.stream.Y2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [j$.util.stream.Y2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [j$.util.stream.Y2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [j$.util.stream.Y2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [j$.util.stream.Y2, java.lang.Enum] */
    static {
        ?? r5 = new Enum("SPLITERATOR", 0);
        SPLITERATOR = r5;
        ?? r6 = new Enum("STREAM", 1);
        STREAM = r6;
        ?? r7 = new Enum("OP", 2);
        OP = r7;
        ?? r8 = new Enum("TERMINAL_OP", 3);
        TERMINAL_OP = r8;
        ?? r9 = new Enum("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = r9;
        f7064a = new Y2[]{r5, r6, r7, r8, r9};
    }
}
