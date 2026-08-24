package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum DISTINCT uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class Z2 {
    public static final Z2 DISTINCT;
    public static final Z2 ORDERED;
    public static final Z2 SHORT_CIRCUIT;
    public static final Z2 SIZED;
    public static final Z2 SORTED;

    /* renamed from: f  reason: collision with root package name */
    static final int f7070f;

    /* renamed from: g  reason: collision with root package name */
    static final int f7071g;

    /* renamed from: h  reason: collision with root package name */
    static final int f7072h;

    /* renamed from: i  reason: collision with root package name */
    private static final int f7073i;

    /* renamed from: j  reason: collision with root package name */
    private static final int f7074j;

    /* renamed from: k  reason: collision with root package name */
    private static final int f7075k;

    /* renamed from: l  reason: collision with root package name */
    static final int f7076l;

    /* renamed from: m  reason: collision with root package name */
    static final int f7077m;

    /* renamed from: n  reason: collision with root package name */
    static final int f7078n;

    /* renamed from: o  reason: collision with root package name */
    static final int f7079o;

    /* renamed from: p  reason: collision with root package name */
    static final int f7080p;

    /* renamed from: q  reason: collision with root package name */
    static final int f7081q;

    /* renamed from: r  reason: collision with root package name */
    static final int f7082r;

    /* renamed from: s  reason: collision with root package name */
    static final int f7083s;

    /* renamed from: t  reason: collision with root package name */
    static final int f7084t;

    /* renamed from: u  reason: collision with root package name */
    static final int f7085u;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ Z2[] f7086v;

    /* renamed from: a  reason: collision with root package name */
    private final EnumMap f7087a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7088b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7089c;

    /* renamed from: d  reason: collision with root package name */
    private final int f7090d;

    /* renamed from: e  reason: collision with root package name */
    private final int f7091e;

    public static Z2 valueOf(String str) {
        return (Z2) Enum.valueOf(Z2.class, str);
    }

    public static Z2[] values() {
        return (Z2[]) f7086v.clone();
    }

    static {
        Y2 y22 = Y2.SPLITERATOR;
        X2 z3 = z(y22);
        Y2 y23 = Y2.STREAM;
        z3.a(y23);
        Y2 y24 = Y2.OP;
        z3.f7061a.put((EnumMap) y24, (Y2) 3);
        Z2 z22 = new Z2("DISTINCT", 0, 0, z3);
        DISTINCT = z22;
        X2 z4 = z(y22);
        z4.a(y23);
        z4.f7061a.put((EnumMap) y24, (Y2) 3);
        Z2 z23 = new Z2("SORTED", 1, 1, z4);
        SORTED = z23;
        X2 z5 = z(y22);
        z5.a(y23);
        EnumMap enumMap = z5.f7061a;
        enumMap.put((EnumMap) y24, (Y2) 3);
        Y2 y25 = Y2.TERMINAL_OP;
        enumMap.put((EnumMap) y25, (Y2) 2);
        Y2 y26 = Y2.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) y26, (Y2) 2);
        Z2 z24 = new Z2("ORDERED", 2, 2, z5);
        ORDERED = z24;
        X2 z6 = z(y22);
        z6.a(y23);
        z6.f7061a.put((EnumMap) y24, (Y2) 2);
        Z2 z25 = new Z2("SIZED", 3, 3, z6);
        SIZED = z25;
        X2 z7 = z(y24);
        z7.a(y25);
        Z2 z26 = new Z2("SHORT_CIRCUIT", 4, 12, z7);
        SHORT_CIRCUIT = z26;
        f7086v = new Z2[]{z22, z23, z24, z25, z26};
        f7070f = o(y22);
        f7071g = o(y23);
        f7072h = o(y24);
        o(y25);
        o(y26);
        int i3 = 0;
        for (Z2 z27 : values()) {
            i3 |= z27.f7091e;
        }
        f7073i = i3;
        int i4 = f7071g;
        f7074j = i4;
        int i5 = i4 << 1;
        f7075k = i5;
        f7076l = i4 | i5;
        Z2 z28 = DISTINCT;
        f7077m = z28.f7089c;
        f7078n = z28.f7090d;
        Z2 z29 = SORTED;
        f7079o = z29.f7089c;
        f7080p = z29.f7090d;
        Z2 z210 = ORDERED;
        f7081q = z210.f7089c;
        f7082r = z210.f7090d;
        Z2 z211 = SIZED;
        f7083s = z211.f7089c;
        f7084t = z211.f7090d;
        f7085u = SHORT_CIRCUIT.f7089c;
    }

    private static X2 z(Y2 y22) {
        X2 x22 = new X2(new EnumMap(Y2.class));
        x22.a(y22);
        return x22;
    }

    private Z2(String str, int i3, int i4, X2 x22) {
        Y2[] values = Y2.values();
        int length = values.length;
        int i5 = 0;
        while (true) {
            EnumMap enumMap = x22.f7061a;
            if (i5 < length) {
                Map.EL.a(enumMap, values[i5], 0);
                i5++;
            } else {
                this.f7087a = enumMap;
                int i6 = i4 * 2;
                this.f7088b = i6;
                this.f7089c = 1 << i6;
                this.f7090d = 2 << i6;
                this.f7091e = 3 << i6;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r(int i3) {
        return (i3 & this.f7091e) == this.f7089c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean v(int i3) {
        int i4 = this.f7091e;
        return (i3 & i4) == i4;
    }

    private static int o(Y2 y22) {
        Z2[] values;
        int i3 = 0;
        for (Z2 z22 : values()) {
            i3 |= ((Integer) z22.f7087a.get(y22)).intValue() << z22.f7088b;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(int i3, int i4) {
        int i5;
        if (i3 == 0) {
            i5 = f7073i;
        } else {
            i5 = ~(((f7074j & i3) << 1) | i3 | ((f7075k & i3) >> 1));
        }
        return i3 | (i4 & i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int A(int i3) {
        return i3 & ((~i3) >> 1) & f7074j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i3 = characteristics & 4;
        int i4 = f7070f;
        return (i3 == 0 || spliterator.getComparator() == null) ? characteristics & i4 : characteristics & i4 & (-5);
    }
}
