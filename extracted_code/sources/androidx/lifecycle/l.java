package androidx.lifecycle;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: m  reason: collision with root package name */
    public static final l f4342m;

    /* renamed from: n  reason: collision with root package name */
    public static final l f4343n;

    /* renamed from: o  reason: collision with root package name */
    public static final l f4344o;

    /* renamed from: p  reason: collision with root package name */
    public static final l f4345p;

    /* renamed from: q  reason: collision with root package name */
    public static final l f4346q;

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ l[] f4347r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, androidx.lifecycle.l] */
    static {
        ?? r5 = new Enum("DESTROYED", 0);
        f4342m = r5;
        ?? r6 = new Enum("INITIALIZED", 1);
        f4343n = r6;
        ?? r7 = new Enum("CREATED", 2);
        f4344o = r7;
        ?? r8 = new Enum("STARTED", 3);
        f4345p = r8;
        ?? r9 = new Enum("RESUMED", 4);
        f4346q = r9;
        f4347r = new l[]{r5, r6, r7, r8, r9};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f4347r.clone();
    }
}
