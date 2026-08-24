package j$.time.format;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class z {
    public static final z ALWAYS;
    public static final z EXCEEDS_PAD;
    public static final z NEVER;
    public static final z NORMAL;
    public static final z NOT_NEGATIVE;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ z[] f6573a;

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f6573a.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, j$.time.format.z] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, j$.time.format.z] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, j$.time.format.z] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, j$.time.format.z] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, j$.time.format.z] */
    static {
        ?? r5 = new Enum("NORMAL", 0);
        NORMAL = r5;
        ?? r6 = new Enum("ALWAYS", 1);
        ALWAYS = r6;
        ?? r7 = new Enum("NEVER", 2);
        NEVER = r7;
        ?? r8 = new Enum("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = r8;
        ?? r9 = new Enum("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = r9;
        f6573a = new z[]{r5, r6, r7, r8, r9};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m(boolean z3, boolean z4, boolean z5) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return (z3 && z4) ? false : true;
        } else if (ordinal == 1 || ordinal == 4) {
            return true;
        } else {
            return (z4 || z5) ? false : true;
        }
    }
}
