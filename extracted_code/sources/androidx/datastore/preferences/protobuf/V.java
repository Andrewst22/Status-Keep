package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f4208a;

    /* renamed from: b  reason: collision with root package name */
    public static final c0 f4209b;

    /* renamed from: c  reason: collision with root package name */
    public static final c0 f4210c;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, androidx.datastore.preferences.protobuf.c0] */
    static {
        Class<?> cls;
        Class<?> cls2;
        Q q3 = Q.f4198c;
        c0 c0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f4208a = cls;
        try {
            Q q4 = Q.f4198c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                c0Var = (c0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f4209b = c0Var;
        f4210c = new Object();
    }

    public static void A(c0 c0Var, Object obj, Object obj2) {
        c0Var.getClass();
        AbstractC0197u abstractC0197u = (AbstractC0197u) obj;
        b0 b0Var = abstractC0197u.unknownFields;
        b0 b0Var2 = ((AbstractC0197u) obj2).unknownFields;
        b0 b0Var3 = b0.f4227f;
        if (!b0Var3.equals(b0Var2)) {
            if (b0Var3.equals(b0Var)) {
                int i3 = b0Var.f4228a + b0Var2.f4228a;
                int[] copyOf = Arrays.copyOf(b0Var.f4229b, i3);
                System.arraycopy(b0Var2.f4229b, 0, copyOf, b0Var.f4228a, b0Var2.f4228a);
                Object[] copyOf2 = Arrays.copyOf(b0Var.f4230c, i3);
                System.arraycopy(b0Var2.f4230c, 0, copyOf2, b0Var.f4228a, b0Var2.f4228a);
                b0Var = new b0(i3, copyOf, copyOf2, true);
            } else {
                b0Var.getClass();
                if (!b0Var2.equals(b0Var3)) {
                    if (b0Var.f4232e) {
                        int i4 = b0Var.f4228a + b0Var2.f4228a;
                        b0Var.a(i4);
                        System.arraycopy(b0Var2.f4229b, 0, b0Var.f4229b, b0Var.f4228a, b0Var2.f4228a);
                        System.arraycopy(b0Var2.f4230c, 0, b0Var.f4230c, b0Var.f4228a, b0Var2.f4228a);
                        b0Var.f4228a = i4;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        abstractC0197u.unknownFields = b0Var;
    }

    public static boolean B(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static void C(int i3, List list, D d3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0188k c0188k = (C0188k) d3.f4168a;
            int i4 = 0;
            if (z3) {
                c0188k.S0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Boolean) list.get(i6)).getClass();
                    Logger logger = C0188k.f4272g;
                    i5++;
                }
                c0188k.U0(i5);
                while (i4 < list.size()) {
                    c0188k.F0(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : (byte) 0);
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                c0188k.H0(i3, ((Boolean) list.get(i4)).booleanValue());
                i4++;
            }
        }
    }

    public static void D(int i3, List list, D d3) {
        if (list != null && !list.isEmpty()) {
            d3.getClass();
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((C0188k) d3.f4168a).I0(i3, (C0184g) list.get(i4));
            }
        }
    }

    public static void E(int i3, List list, D d3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0188k c0188k = (C0188k) d3.f4168a;
            int i4 = 0;
            if (z3) {
                c0188k.S0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Double) list.get(i6)).getClass();
                    Logger logger = C0188k.f4272g;
                    i5 += 8;
                }
                c0188k.U0(i5);
                while (i4 < list.size()) {
                    c0188k.N0(Double.doubleToRawLongBits(((Double) list.get(i4)).doubleValue()));
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                double doubleValue = ((Double) list.get(i4)).doubleValue();
                c0188k.getClass();
                c0188k.M0(Double.doubleToRawLongBits(doubleValue), i3);
                i4++;
            }
        }
    }

    public static void F(int i3, List list, D d3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0188k c0188k = (C0188k) d3.f4168a;
            int i4 = 0;
            if (z3) {
                c0188k.S0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += C0188k.C0(((Integer) list.get(i6)).intValue());
                }
                c0188k.U0(i5);
                while (i4 < list.size()) {
                    c0188k.P0(((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                c0188k.O0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
        }
    }

    public static void G(int i3, List list, D d3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0188k c0188k = (C0188k) d3.f4168a;
            int i4 = 0;
            if (z3) {
                c0188k.S0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) list.get(i6)).getClass();
                    Logger logger = C0188k.f4272g;
                    i5 += 4;
                }
                c0188k.U0(i5);
                while (i4 < list.size()) {
                    c0188k.L0(((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                c0188k.K0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
        }
    }

    public static void H(int i3, List list, D d3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0188k c0188k = (C0188k) d3.f4168a;
            int i4 = 0;
            if (z3) {
                c0188k.S0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Long) list.get(i6)).getClass();
                    Logger logger = C0188k.f4272g;
                    i5 += 8;
                }
                c0188k.U0(i5);
                while (i4 < list.size()) {
                    c0188k.N0(((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                c0188k.M0(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
        }
    }

    public static void I(int i3, List list, D d3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0188k c0188k = (C0188k) d3.f4168a;
            int i4 = 0;
            if (z3) {
                c0188k.S0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Float) list.get(i6)).getClass();
                    Logger logger = C0188k.f4272g;
                    i5 += 4;
                }
                c0188k.U0(i5);
                while (i4 < list.size()) {
                    c0188k.L0(Float.floatToRawIntBits(((Float) list.get(i4)).floatValue()));
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                float floatValue = ((Float) list.get(i4)).floatValue();
                c0188k.getClass();
                c0188k.K0(i3, Float.floatToRawIntBits(floatValue));
                i4++;
            }
        }
    }

    public static void J(int i3, List list, D d3, U u3) {
        if (list != null && !list.isEmpty()) {
            d3.getClass();
            for (int i4 = 0; i4 < list.size(); i4++) {
                d3.h(i3, list.get(i4), u3);
            }
        }
    }

    public static void K(int i3, List list, D d3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0188k c0188k = (C0188k) d3.f4168a;
            int i4 = 0;
            if (z3) {
                c0188k.S0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += C0188k.C0(((Integer) list.get(i6)).intValue());
                }
                c0188k.U0(i5);
                while (i4 < list.size()) {
                    c0188k.P0(((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                c0188k.O0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
        }
    }

    public static void L(int i3, List list, D d3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0188k c0188k = (C0188k) d3.f4168a;
            int i4 = 0;
            if (z3) {
                c0188k.S0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += C0188k.C0(((Long) list.get(i6)).longValue());
                }
                c0188k.U0(i5);
                while (i4 < list.size()) {
                    c0188k.W0(((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                c0188k.V0(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
        }
    }

    public static void M(int i3, List list, D d3, U u3) {
        if (list != null && !list.isEmpty()) {
            d3.getClass();
            for (int i4 = 0; i4 < list.size(); i4++) {
                d3.k(i3, list.get(i4), u3);
            }
        }
    }

    public static void N(int i3, List list, D d3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0188k c0188k = (C0188k) d3.f4168a;
            int i4 = 0;
            if (z3) {
                c0188k.S0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) list.get(i6)).getClass();
                    Logger logger = C0188k.f4272g;
                    i5 += 4;
                }
                c0188k.U0(i5);
                while (i4 < list.size()) {
                    c0188k.L0(((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                c0188k.K0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
        }
    }

    public static void O(int i3, List list, D d3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0188k c0188k = (C0188k) d3.f4168a;
            int i4 = 0;
            if (z3) {
                c0188k.S0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Long) list.get(i6)).getClass();
                    Logger logger = C0188k.f4272g;
                    i5 += 8;
                }
                c0188k.U0(i5);
                while (i4 < list.size()) {
                    c0188k.N0(((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                c0188k.M0(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
        }
    }

    public static void P(int i3, List list, D d3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0188k c0188k = (C0188k) d3.f4168a;
            int i4 = 0;
            if (z3) {
                c0188k.S0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    int intValue = ((Integer) list.get(i6)).intValue();
                    i5 += C0188k.A0((intValue >> 31) ^ (intValue << 1));
                }
                c0188k.U0(i5);
                while (i4 < list.size()) {
                    int intValue2 = ((Integer) list.get(i4)).intValue();
                    c0188k.U0((intValue2 >> 31) ^ (intValue2 << 1));
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                int intValue3 = ((Integer) list.get(i4)).intValue();
                c0188k.T0(i3, (intValue3 >> 31) ^ (intValue3 << 1));
                i4++;
            }
        }
    }

    public static void Q(int i3, List list, D d3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0188k c0188k = (C0188k) d3.f4168a;
            int i4 = 0;
            if (z3) {
                c0188k.S0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    long longValue = ((Long) list.get(i6)).longValue();
                    i5 += C0188k.C0((longValue >> 63) ^ (longValue << 1));
                }
                c0188k.U0(i5);
                while (i4 < list.size()) {
                    long longValue2 = ((Long) list.get(i4)).longValue();
                    c0188k.W0((longValue2 >> 63) ^ (longValue2 << 1));
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                long longValue3 = ((Long) list.get(i4)).longValue();
                c0188k.V0((longValue3 >> 63) ^ (longValue3 << 1), i3);
                i4++;
            }
        }
    }

    public static void R(int i3, List list, D d3) {
        if (list != null && !list.isEmpty()) {
            d3.getClass();
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((C0188k) d3.f4168a).Q0((String) list.get(i4), i3);
            }
        }
    }

    public static void S(int i3, List list, D d3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0188k c0188k = (C0188k) d3.f4168a;
            int i4 = 0;
            if (z3) {
                c0188k.S0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += C0188k.A0(((Integer) list.get(i6)).intValue());
                }
                c0188k.U0(i5);
                while (i4 < list.size()) {
                    c0188k.U0(((Integer) list.get(i4)).intValue());
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                c0188k.T0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
        }
    }

    public static void T(int i3, List list, D d3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0188k c0188k = (C0188k) d3.f4168a;
            int i4 = 0;
            if (z3) {
                c0188k.S0(i3, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += C0188k.C0(((Long) list.get(i6)).longValue());
                }
                c0188k.U0(i5);
                while (i4 < list.size()) {
                    c0188k.W0(((Long) list.get(i4)).longValue());
                    i4++;
                }
                return;
            }
            while (i4 < list.size()) {
                c0188k.V0(((Long) list.get(i4)).longValue(), i3);
                i4++;
            }
        }
    }

    public static int a(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0188k.i0(i3) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y02 = C0188k.y0(i3) * size;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int size2 = ((C0184g) list.get(i4)).size();
            y02 += C0188k.A0(size2) + size2;
        }
        return y02;
    }

    public static int d(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0188k.y0(i3) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0188k.C0(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    public static int f(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0188k.m0(i3) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0188k.n0(i3) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i3, List list, U u3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += C0188k.p0(i3, (AbstractC0178a) list.get(i5), u3);
        }
        return i4;
    }

    public static int k(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0188k.y0(i3) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0188k.C0(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    public static int m(int i3, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0188k.y0(i3) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0188k.C0(((Long) list.get(i4)).longValue());
        }
        return i3;
    }

    public static int o(int i3, Object obj, U u3) {
        int y02 = C0188k.y0(i3);
        int a3 = ((AbstractC0178a) obj).a(u3);
        return C0188k.A0(a3) + a3 + y02;
    }

    public static int p(int i3, List list, U u3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y02 = C0188k.y0(i3) * size;
        for (int i4 = 0; i4 < size; i4++) {
            int a3 = ((AbstractC0178a) list.get(i4)).a(u3);
            y02 += C0188k.A0(a3) + a3;
        }
        return y02;
    }

    public static int q(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0188k.y0(i3) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int intValue = ((Integer) list.get(i4)).intValue();
            i3 += C0188k.A0((intValue >> 31) ^ (intValue << 1));
        }
        return i3;
    }

    public static int s(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0188k.y0(i3) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            long longValue = ((Long) list.get(i4)).longValue();
            i3 += C0188k.C0((longValue >> 63) ^ (longValue << 1));
        }
        return i3;
    }

    public static int u(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y02 = C0188k.y0(i3) * size;
        for (int i4 = 0; i4 < size; i4++) {
            Object obj = list.get(i4);
            if (obj instanceof C0184g) {
                int size2 = ((C0184g) obj).size();
                y02 = C0188k.A0(size2) + size2 + y02;
            } else {
                y02 = C0188k.x0((String) obj) + y02;
            }
        }
        return y02;
    }

    public static int v(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0188k.y0(i3) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0188k.A0(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    public static int x(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0188k.y0(i3) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += C0188k.C0(((Long) list.get(i4)).longValue());
        }
        return i3;
    }

    public static Object z(Object obj, int i3, InterfaceC0198v interfaceC0198v, Object obj2, c0 c0Var) {
        return obj2;
    }
}
