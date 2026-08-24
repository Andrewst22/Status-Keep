package androidx.datastore.preferences.protobuf;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum EF6 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: androidx.datastore.preferences.protobuf.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0194q {

    /* renamed from: n  reason: collision with root package name */
    public static final EnumC0194q f4294n;

    /* renamed from: o  reason: collision with root package name */
    public static final EnumC0194q f4295o;

    /* renamed from: p  reason: collision with root package name */
    public static final EnumC0194q[] f4296p;

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ EnumC0194q[] f4297q;

    /* renamed from: m  reason: collision with root package name */
    public final int f4298m;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC0194q EF6;

    static {
        EnumC0202z enumC0202z = EnumC0202z.DOUBLE;
        EnumC0194q enumC0194q = new EnumC0194q("DOUBLE", 0, 0, 1, enumC0202z);
        EnumC0202z enumC0202z2 = EnumC0202z.FLOAT;
        EnumC0194q enumC0194q2 = new EnumC0194q("FLOAT", 1, 1, 1, enumC0202z2);
        EnumC0202z enumC0202z3 = EnumC0202z.LONG;
        EnumC0194q enumC0194q3 = new EnumC0194q("INT64", 2, 2, 1, enumC0202z3);
        EnumC0194q enumC0194q4 = new EnumC0194q("UINT64", 3, 3, 1, enumC0202z3);
        EnumC0202z enumC0202z4 = EnumC0202z.INT;
        EnumC0194q enumC0194q5 = new EnumC0194q("INT32", 4, 4, 1, enumC0202z4);
        EnumC0194q enumC0194q6 = new EnumC0194q("FIXED64", 5, 5, 1, enumC0202z3);
        EnumC0194q enumC0194q7 = new EnumC0194q("FIXED32", 6, 6, 1, enumC0202z4);
        EnumC0202z enumC0202z5 = EnumC0202z.BOOLEAN;
        EnumC0194q enumC0194q8 = new EnumC0194q("BOOL", 7, 7, 1, enumC0202z5);
        EnumC0202z enumC0202z6 = EnumC0202z.STRING;
        EnumC0194q enumC0194q9 = new EnumC0194q("STRING", 8, 8, 1, enumC0202z6);
        EnumC0202z enumC0202z7 = EnumC0202z.MESSAGE;
        EnumC0194q enumC0194q10 = new EnumC0194q("MESSAGE", 9, 9, 1, enumC0202z7);
        EnumC0202z enumC0202z8 = EnumC0202z.BYTE_STRING;
        EnumC0194q enumC0194q11 = new EnumC0194q("BYTES", 10, 10, 1, enumC0202z8);
        EnumC0194q enumC0194q12 = new EnumC0194q("UINT32", 11, 11, 1, enumC0202z4);
        EnumC0202z enumC0202z9 = EnumC0202z.ENUM;
        EnumC0194q enumC0194q13 = new EnumC0194q("ENUM", 12, 12, 1, enumC0202z9);
        EnumC0194q enumC0194q14 = new EnumC0194q("SFIXED32", 13, 13, 1, enumC0202z4);
        EnumC0194q enumC0194q15 = new EnumC0194q("SFIXED64", 14, 14, 1, enumC0202z3);
        EnumC0194q enumC0194q16 = new EnumC0194q("SINT32", 15, 15, 1, enumC0202z4);
        EnumC0194q enumC0194q17 = new EnumC0194q("SINT64", 16, 16, 1, enumC0202z3);
        EnumC0194q enumC0194q18 = new EnumC0194q("GROUP", 17, 17, 1, enumC0202z7);
        EnumC0194q enumC0194q19 = new EnumC0194q("DOUBLE_LIST", 18, 18, 2, enumC0202z);
        EnumC0194q enumC0194q20 = new EnumC0194q("FLOAT_LIST", 19, 19, 2, enumC0202z2);
        EnumC0194q enumC0194q21 = new EnumC0194q("INT64_LIST", 20, 20, 2, enumC0202z3);
        EnumC0194q enumC0194q22 = new EnumC0194q("UINT64_LIST", 21, 21, 2, enumC0202z3);
        EnumC0194q enumC0194q23 = new EnumC0194q("INT32_LIST", 22, 22, 2, enumC0202z4);
        EnumC0194q enumC0194q24 = new EnumC0194q("FIXED64_LIST", 23, 23, 2, enumC0202z3);
        EnumC0194q enumC0194q25 = new EnumC0194q("FIXED32_LIST", 24, 24, 2, enumC0202z4);
        EnumC0194q enumC0194q26 = new EnumC0194q("BOOL_LIST", 25, 25, 2, enumC0202z5);
        EnumC0194q enumC0194q27 = new EnumC0194q("STRING_LIST", 26, 26, 2, enumC0202z6);
        EnumC0194q enumC0194q28 = new EnumC0194q("MESSAGE_LIST", 27, 27, 2, enumC0202z7);
        EnumC0194q enumC0194q29 = new EnumC0194q("BYTES_LIST", 28, 28, 2, enumC0202z8);
        EnumC0194q enumC0194q30 = new EnumC0194q("UINT32_LIST", 29, 29, 2, enumC0202z4);
        EnumC0194q enumC0194q31 = new EnumC0194q("ENUM_LIST", 30, 30, 2, enumC0202z9);
        EnumC0194q enumC0194q32 = new EnumC0194q("SFIXED32_LIST", 31, 31, 2, enumC0202z4);
        EnumC0194q enumC0194q33 = new EnumC0194q("SFIXED64_LIST", 32, 32, 2, enumC0202z3);
        EnumC0194q enumC0194q34 = new EnumC0194q("SINT32_LIST", 33, 33, 2, enumC0202z4);
        EnumC0194q enumC0194q35 = new EnumC0194q("SINT64_LIST", 34, 34, 2, enumC0202z3);
        EnumC0194q enumC0194q36 = new EnumC0194q("DOUBLE_LIST_PACKED", 35, 35, 3, enumC0202z);
        f4294n = enumC0194q36;
        EnumC0194q enumC0194q37 = new EnumC0194q("FLOAT_LIST_PACKED", 36, 36, 3, enumC0202z2);
        EnumC0194q enumC0194q38 = new EnumC0194q("INT64_LIST_PACKED", 37, 37, 3, enumC0202z3);
        EnumC0194q enumC0194q39 = new EnumC0194q("UINT64_LIST_PACKED", 38, 38, 3, enumC0202z3);
        EnumC0194q enumC0194q40 = new EnumC0194q("INT32_LIST_PACKED", 39, 39, 3, enumC0202z4);
        EnumC0194q enumC0194q41 = new EnumC0194q("FIXED64_LIST_PACKED", 40, 40, 3, enumC0202z3);
        EnumC0194q enumC0194q42 = new EnumC0194q("FIXED32_LIST_PACKED", 41, 41, 3, enumC0202z4);
        EnumC0194q enumC0194q43 = new EnumC0194q("BOOL_LIST_PACKED", 42, 42, 3, enumC0202z5);
        EnumC0194q enumC0194q44 = new EnumC0194q("UINT32_LIST_PACKED", 43, 43, 3, enumC0202z4);
        EnumC0194q enumC0194q45 = new EnumC0194q("ENUM_LIST_PACKED", 44, 44, 3, enumC0202z9);
        EnumC0194q enumC0194q46 = new EnumC0194q("SFIXED32_LIST_PACKED", 45, 45, 3, enumC0202z4);
        EnumC0194q enumC0194q47 = new EnumC0194q("SFIXED64_LIST_PACKED", 46, 46, 3, enumC0202z3);
        EnumC0194q enumC0194q48 = new EnumC0194q("SINT32_LIST_PACKED", 47, 47, 3, enumC0202z4);
        EnumC0194q enumC0194q49 = new EnumC0194q("SINT64_LIST_PACKED", 48, 48, 3, enumC0202z3);
        f4295o = enumC0194q49;
        f4297q = new EnumC0194q[]{enumC0194q, enumC0194q2, enumC0194q3, enumC0194q4, enumC0194q5, enumC0194q6, enumC0194q7, enumC0194q8, enumC0194q9, enumC0194q10, enumC0194q11, enumC0194q12, enumC0194q13, enumC0194q14, enumC0194q15, enumC0194q16, enumC0194q17, enumC0194q18, enumC0194q19, enumC0194q20, enumC0194q21, enumC0194q22, enumC0194q23, enumC0194q24, enumC0194q25, enumC0194q26, enumC0194q27, enumC0194q28, enumC0194q29, enumC0194q30, enumC0194q31, enumC0194q32, enumC0194q33, enumC0194q34, enumC0194q35, enumC0194q36, enumC0194q37, enumC0194q38, enumC0194q39, enumC0194q40, enumC0194q41, enumC0194q42, enumC0194q43, enumC0194q44, enumC0194q45, enumC0194q46, enumC0194q47, enumC0194q48, enumC0194q49, new EnumC0194q("GROUP_LIST", 49, 49, 2, enumC0202z7), new EnumC0194q("MAP", 50, 50, 4, EnumC0202z.VOID)};
        EnumC0194q[] values = values();
        f4296p = new EnumC0194q[values.length];
        for (EnumC0194q enumC0194q50 : values) {
            f4296p[enumC0194q50.f4298m] = enumC0194q50;
        }
    }

    public EnumC0194q(String str, int i3, int i4, int i5, EnumC0202z enumC0202z) {
        this.f4298m = i4;
        int b3 = N.j.b(i5);
        if (b3 != 1) {
            if (b3 == 3) {
                enumC0202z.getClass();
            }
        } else {
            enumC0202z.getClass();
        }
        if (i5 == 1) {
            enumC0202z.ordinal();
        }
    }

    public static EnumC0194q valueOf(String str) {
        return (EnumC0194q) Enum.valueOf(EnumC0194q.class, str);
    }

    public static EnumC0194q[] values() {
        return (EnumC0194q[]) f4297q.clone();
    }

    public final int a() {
        return this.f4298m;
    }
}
