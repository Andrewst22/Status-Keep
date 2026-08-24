package j$.time.format;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class y {
    public static final y LENIENT;
    public static final y SMART;
    public static final y STRICT;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ y[] f6572a;

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f6572a.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.format.y, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [j$.time.format.y, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [j$.time.format.y, java.lang.Enum] */
    static {
        ?? r3 = new Enum("STRICT", 0);
        STRICT = r3;
        ?? r4 = new Enum("SMART", 1);
        SMART = r4;
        ?? r5 = new Enum("LENIENT", 2);
        LENIENT = r5;
        f6572a = new y[]{r3, r4, r5};
    }
}
