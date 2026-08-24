package N;

import androidx.datastore.preferences.protobuf.AbstractC0195s;
import androidx.datastore.preferences.protobuf.AbstractC0197u;
import androidx.datastore.preferences.protobuf.C0184g;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.T;
/* loaded from: classes.dex */
public final class k extends AbstractC0197u {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final k DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile P PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        AbstractC0197u.l(k.class, kVar);
    }

    public static i F() {
        return (i) ((AbstractC0195s) DEFAULT_INSTANCE.e(5));
    }

    public static void n(k kVar, long j3) {
        kVar.valueCase_ = 4;
        kVar.value_ = Long.valueOf(j3);
    }

    public static void o(k kVar, String str) {
        kVar.getClass();
        str.getClass();
        kVar.valueCase_ = 5;
        kVar.value_ = str;
    }

    public static void p(k kVar, h hVar) {
        kVar.getClass();
        kVar.value_ = hVar;
        kVar.valueCase_ = 6;
    }

    public static void q(k kVar, double d3) {
        kVar.valueCase_ = 7;
        kVar.value_ = Double.valueOf(d3);
    }

    public static void r(k kVar, C0184g c0184g) {
        kVar.getClass();
        kVar.valueCase_ = 8;
        kVar.value_ = c0184g;
    }

    public static void s(k kVar, boolean z3) {
        kVar.valueCase_ = 1;
        kVar.value_ = Boolean.valueOf(z3);
    }

    public static void t(k kVar, float f3) {
        kVar.valueCase_ = 2;
        kVar.value_ = Float.valueOf(f3);
    }

    public static void u(k kVar, int i3) {
        kVar.valueCase_ = 3;
        kVar.value_ = Integer.valueOf(i3);
    }

    public static k x() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long B() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String C() {
        if (this.valueCase_ == 5) {
            return (String) this.value_;
        }
        return "";
    }

    public final h D() {
        if (this.valueCase_ == 6) {
            return (h) this.value_;
        }
        return h.o();
    }

    public final int E() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return 2;
            case INTEGER_FIELD_NUMBER /* 3 */:
                return 3;
            case LONG_FIELD_NUMBER /* 4 */:
                return 4;
            case STRING_FIELD_NUMBER /* 5 */:
                return 5;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case BYTES_FIELD_NUMBER /* 8 */:
                return 8;
            default:
                return 0;
        }
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [androidx.datastore.preferences.protobuf.P, java.lang.Object] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0197u
    public final Object e(int i3) {
        switch (j.b(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return new T(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", h.class});
            case INTEGER_FIELD_NUMBER /* 3 */:
                return new k();
            case LONG_FIELD_NUMBER /* 4 */:
                return new AbstractC0195s(DEFAULT_INSTANCE);
            case STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                P p3 = PARSER;
                P p4 = p3;
                if (p3 == null) {
                    synchronized (k.class) {
                        try {
                            P p5 = PARSER;
                            P p6 = p5;
                            if (p5 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                p6 = obj;
                            }
                        } finally {
                        }
                    }
                }
                return p4;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean v() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final C0184g w() {
        if (this.valueCase_ == 8) {
            return (C0184g) this.value_;
        }
        return C0184g.f4242o;
    }

    public final double y() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float z() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }
}
