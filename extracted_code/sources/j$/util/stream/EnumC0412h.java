package j$.util.stream;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.util.stream.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0412h {
    public static final EnumC0412h CONCURRENT;
    public static final EnumC0412h IDENTITY_FINISH;
    public static final EnumC0412h UNORDERED;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ EnumC0412h[] f7175a;

    public static EnumC0412h valueOf(String str) {
        return (EnumC0412h) Enum.valueOf(EnumC0412h.class, str);
    }

    public static EnumC0412h[] values() {
        return (EnumC0412h[]) f7175a.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [j$.util.stream.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [j$.util.stream.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [j$.util.stream.h, java.lang.Enum] */
    static {
        ?? r3 = new Enum("CONCURRENT", 0);
        CONCURRENT = r3;
        ?? r4 = new Enum("UNORDERED", 1);
        UNORDERED = r4;
        ?? r5 = new Enum("IDENTITY_FINISH", 2);
        IDENTITY_FINISH = r5;
        f7175a = new EnumC0412h[]{r3, r4, r5};
    }
}
