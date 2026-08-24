package androidx.datastore.preferences.protobuf;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum EF12 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class p0 {

    /* renamed from: o  reason: collision with root package name */
    public static final l0 f4288o;

    /* renamed from: p  reason: collision with root package name */
    public static final m0 f4289p;

    /* renamed from: q  reason: collision with root package name */
    public static final n0 f4290q;

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ p0[] f4291r;

    /* renamed from: m  reason: collision with root package name */
    public final q0 f4292m;

    /* renamed from: n  reason: collision with root package name */
    public final int f4293n;
    /* JADX INFO: Fake field, exist only in values array */
    p0 EF10;
    /* JADX INFO: Fake field, exist only in values array */
    p0 EF11;
    /* JADX INFO: Fake field, exist only in values array */
    p0 EF12;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.p0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.datastore.preferences.protobuf.p0, androidx.datastore.preferences.protobuf.n0] */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.datastore.preferences.protobuf.m0, androidx.datastore.preferences.protobuf.p0] */
    static {
        p0 p0Var = new p0("DOUBLE", 0, q0.DOUBLE, 1);
        p0 p0Var2 = new p0("FLOAT", 1, q0.FLOAT, 5);
        q0 q0Var = q0.LONG;
        p0 p0Var3 = new p0("INT64", 2, q0Var, 0);
        p0 p0Var4 = new p0("UINT64", 3, q0Var, 0);
        q0 q0Var2 = q0.INT;
        p0 p0Var5 = new p0("INT32", 4, q0Var2, 0);
        p0 p0Var6 = new p0("FIXED64", 5, q0Var, 1);
        p0 p0Var7 = new p0("FIXED32", 6, q0Var2, 5);
        p0 p0Var8 = new p0("BOOL", 7, q0.BOOLEAN, 0);
        ?? p0Var9 = new p0("STRING", 8, q0.STRING, 2);
        f4288o = p0Var9;
        q0 q0Var3 = q0.MESSAGE;
        ?? p0Var10 = new p0("GROUP", 9, q0Var3, 3);
        f4289p = p0Var10;
        ?? p0Var11 = new p0("MESSAGE", 10, q0Var3, 2);
        f4290q = p0Var11;
        f4291r = new p0[]{p0Var, p0Var2, p0Var3, p0Var4, p0Var5, p0Var6, p0Var7, p0Var8, p0Var9, p0Var10, p0Var11, new p0("BYTES", 11, q0.BYTE_STRING, 2), new p0("UINT32", 12, q0Var2, 0), new p0("ENUM", 13, q0.ENUM, 0), new p0("SFIXED32", 14, q0Var2, 5), new p0("SFIXED64", 15, q0Var, 1), new p0("SINT32", 16, q0Var2, 0), new p0("SINT64", 17, q0Var, 0)};
    }

    public p0(String str, int i3, q0 q0Var, int i4) {
        this.f4292m = q0Var;
        this.f4293n = i4;
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f4291r.clone();
    }
}
