package f2;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: m  reason: collision with root package name */
    public static final d f5563m;

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ d[] f5564n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, f2.d] */
    static {
        ?? r12 = new Enum("PLAIN_TEXT", 0);
        f5563m = r12;
        f5564n = new d[]{r12};
    }

    public static d a(String str) {
        d[] values;
        for (d dVar : values()) {
            dVar.getClass();
            if ("text/plain".equals(str)) {
                return dVar;
            }
        }
        throw new NoSuchFieldException(D2.h.l("No such ClipboardContentFormat: ", str));
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f5564n.clone();
    }
}
