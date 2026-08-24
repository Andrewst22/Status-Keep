package I1;

import java.lang.reflect.Field;
import java.util.Locale;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: m  reason: collision with root package name */
    public static final a f462m;

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ g[] f463n;

    static {
        a aVar = new a();
        f462m = aVar;
        f463n = new g[]{aVar, new g() { // from class: I1.b
            @Override // I1.g
            public final String b(Field field) {
                return g.c(field.getName());
            }
        }, new g() { // from class: I1.c
            @Override // I1.g
            public final String b(Field field) {
                return g.c(g.a(field.getName(), " "));
            }
        }, new g() { // from class: I1.d
            @Override // I1.g
            public final String b(Field field) {
                return g.a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        }, new g() { // from class: I1.e
            @Override // I1.g
            public final String b(Field field) {
                return g.a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        }, new g() { // from class: I1.f
            @Override // I1.g
            public final String b(Field field) {
                return g.a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length() - 1;
        int i3 = 0;
        while (!Character.isLetter(str.charAt(i3)) && i3 < length) {
            i3++;
        }
        char charAt = str.charAt(i3);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i3 == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i3) + upperCase + str.substring(i3 + 1);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f463n.clone();
    }

    public abstract String b(Field field);
}
