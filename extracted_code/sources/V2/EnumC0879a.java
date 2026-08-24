package v2;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: v2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0879a {

    /* renamed from: m  reason: collision with root package name */
    public static final EnumC0879a f9494m;

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ EnumC0879a[] f9495n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, v2.a] */
    static {
        ?? r3 = new Enum("COROUTINE_SUSPENDED", 0);
        f9494m = r3;
        f9495n = new EnumC0879a[]{r3, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
    }

    public static EnumC0879a valueOf(String str) {
        return (EnumC0879a) Enum.valueOf(EnumC0879a.class, str);
    }

    public static EnumC0879a[] values() {
        return (EnumC0879a[]) f9495n.clone();
    }
}
