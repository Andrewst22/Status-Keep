package androidx.datastore.preferences.protobuf;
/* loaded from: classes.dex */
public final class F {

    /* renamed from: a  reason: collision with root package name */
    public final E f4172a;

    public F(l0 l0Var, n0 n0Var, N.k kVar) {
        this.f4172a = new E(l0Var, n0Var, kVar);
    }

    public static int a(E e2, Object obj, Object obj2) {
        int C02;
        int size;
        int A02;
        int size2;
        int A03;
        int i3 = 1;
        int i4 = C0193p.f4285c;
        int y02 = C0188k.y0(1);
        m0 m0Var = p0.f4289p;
        l0 l0Var = e2.f4169a;
        if (l0Var == m0Var) {
            y02 *= 2;
        }
        switch (l0Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                C02 = 8;
                break;
            case 1:
                ((Float) obj).getClass();
                C02 = 4;
                break;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                C02 = C0188k.C0(((Long) obj).longValue());
                break;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                C02 = C0188k.C0(((Long) obj).longValue());
                break;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                C02 = C0188k.C0(((Integer) obj).intValue());
                break;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                ((Long) obj).getClass();
                C02 = 8;
                break;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj).getClass();
                C02 = 4;
                break;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Boolean) obj).getClass();
                C02 = 1;
                break;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof C0184g) {
                    size = ((C0184g) obj).size();
                    A02 = C0188k.A0(size);
                    C02 = size + A02;
                    break;
                } else {
                    C02 = C0188k.x0((String) obj);
                    break;
                }
            case 9:
                C02 = ((AbstractC0197u) ((AbstractC0178a) obj)).a(null);
                break;
            case 10:
                size = ((AbstractC0197u) ((AbstractC0178a) obj)).a(null);
                A02 = C0188k.A0(size);
                C02 = size + A02;
                break;
            case 11:
                if (obj instanceof C0184g) {
                    size = ((C0184g) obj).size();
                    A02 = C0188k.A0(size);
                } else {
                    size = ((byte[]) obj).length;
                    A02 = C0188k.A0(size);
                }
                C02 = size + A02;
                break;
            case 12:
                C02 = C0188k.A0(((Integer) obj).intValue());
                break;
            case 13:
                C02 = C0188k.C0(((Integer) obj).intValue());
                break;
            case 14:
                ((Integer) obj).getClass();
                C02 = 4;
                break;
            case 15:
                ((Long) obj).getClass();
                C02 = 8;
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                C02 = C0188k.A0((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                C02 = C0188k.C0((longValue >> 63) ^ (longValue << 1));
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        int i5 = C02 + y02;
        int y03 = C0188k.y0(2);
        n0 n0Var = e2.f4170b;
        if (n0Var == m0Var) {
            y03 *= 2;
        }
        switch (n0Var.ordinal()) {
            case 0:
                ((Double) obj2).getClass();
                i3 = 8;
                break;
            case 1:
                ((Float) obj2).getClass();
                i3 = 4;
                break;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                i3 = C0188k.C0(((Long) obj2).longValue());
                break;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                i3 = C0188k.C0(((Long) obj2).longValue());
                break;
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                i3 = C0188k.C0(((Integer) obj2).intValue());
                break;
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                ((Long) obj2).getClass();
                i3 = 8;
                break;
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj2).getClass();
                i3 = 4;
                break;
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Boolean) obj2).getClass();
                break;
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                if (obj2 instanceof C0184g) {
                    size2 = ((C0184g) obj2).size();
                    A03 = C0188k.A0(size2);
                    i3 = A03 + size2;
                    break;
                } else {
                    i3 = C0188k.x0((String) obj2);
                    break;
                }
            case 9:
                i3 = ((AbstractC0197u) ((AbstractC0178a) obj2)).a(null);
                break;
            case 10:
                size2 = ((AbstractC0197u) ((AbstractC0178a) obj2)).a(null);
                A03 = C0188k.A0(size2);
                i3 = A03 + size2;
                break;
            case 11:
                if (obj2 instanceof C0184g) {
                    size2 = ((C0184g) obj2).size();
                    A03 = C0188k.A0(size2);
                } else {
                    size2 = ((byte[]) obj2).length;
                    A03 = C0188k.A0(size2);
                }
                i3 = A03 + size2;
                break;
            case 12:
                i3 = C0188k.A0(((Integer) obj2).intValue());
                break;
            case 13:
                i3 = C0188k.C0(((Integer) obj2).intValue());
                break;
            case 14:
                ((Integer) obj2).getClass();
                i3 = 4;
                break;
            case 15:
                ((Long) obj2).getClass();
                i3 = 8;
                break;
            case 16:
                int intValue2 = ((Integer) obj2).intValue();
                i3 = C0188k.A0((intValue2 >> 31) ^ (intValue2 << 1));
                break;
            case 17:
                long longValue2 = ((Long) obj2).longValue();
                i3 = C0188k.C0((longValue2 >> 63) ^ (longValue2 << 1));
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return i3 + y03 + i5;
    }
}
