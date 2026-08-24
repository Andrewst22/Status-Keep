package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class L implements U {

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f4178n = new int[0];

    /* renamed from: o  reason: collision with root package name */
    public static final Unsafe f4179o = h0.i();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f4180a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f4181b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4182c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4183d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC0178a f4184e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4185f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f4186g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4187h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4188i;

    /* renamed from: j  reason: collision with root package name */
    public final N f4189j;

    /* renamed from: k  reason: collision with root package name */
    public final A f4190k;

    /* renamed from: l  reason: collision with root package name */
    public final c0 f4191l;

    /* renamed from: m  reason: collision with root package name */
    public final H f4192m;

    public L(int[] iArr, Object[] objArr, int i3, int i4, AbstractC0178a abstractC0178a, int[] iArr2, int i5, int i6, N n3, A a3, c0 c0Var, C0191n c0191n, H h3) {
        this.f4180a = iArr;
        this.f4181b = objArr;
        this.f4182c = i3;
        this.f4183d = i4;
        this.f4185f = abstractC0178a instanceof AbstractC0197u;
        this.f4186g = iArr2;
        this.f4187h = i5;
        this.f4188i = i6;
        this.f4189j = n3;
        this.f4190k = a3;
        this.f4191l = c0Var;
        this.f4184e = abstractC0178a;
        this.f4192m = h3;
    }

    public static long A(long j3, Object obj) {
        return ((Long) h0.f4256c.h(j3, obj)).longValue();
    }

    public static Field G(Class cls, String str) {
        Field[] declaredFields;
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int L(int i3) {
        return (i3 & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0197u) {
            return ((AbstractC0197u) obj).i();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.datastore.preferences.protobuf.L x(androidx.datastore.preferences.protobuf.T r32, androidx.datastore.preferences.protobuf.N r33, androidx.datastore.preferences.protobuf.A r34, androidx.datastore.preferences.protobuf.c0 r35, androidx.datastore.preferences.protobuf.C0191n r36, androidx.datastore.preferences.protobuf.H r37) {
        /*
            Method dump skipped, instructions count: 1007
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.L.x(androidx.datastore.preferences.protobuf.T, androidx.datastore.preferences.protobuf.N, androidx.datastore.preferences.protobuf.A, androidx.datastore.preferences.protobuf.c0, androidx.datastore.preferences.protobuf.n, androidx.datastore.preferences.protobuf.H):androidx.datastore.preferences.protobuf.L");
    }

    public static long y(int i3) {
        return i3 & 1048575;
    }

    public static int z(long j3, Object obj) {
        return ((Integer) h0.f4256c.h(j3, obj)).intValue();
    }

    public final int B(int i3) {
        if (i3 < this.f4182c || i3 > this.f4183d) {
            return -1;
        }
        int[] iArr = this.f4180a;
        int length = (iArr.length / 3) - 1;
        int i4 = 0;
        while (i4 <= length) {
            int i5 = (length + i4) >>> 1;
            int i6 = i5 * 3;
            int i7 = iArr[i6];
            if (i3 == i7) {
                return i6;
            }
            if (i3 < i7) {
                length = i5 - 1;
            } else {
                i4 = i5 + 1;
            }
        }
        return -1;
    }

    public final void C(Object obj, long j3, U.m mVar, U u3, C0190m c0190m) {
        int u4;
        this.f4190k.getClass();
        InterfaceC0198v b3 = A.b(j3, obj);
        int i3 = mVar.f2454a;
        if ((i3 & 7) == 3) {
            do {
                AbstractC0197u g3 = u3.g();
                mVar.c(g3, u3, c0190m);
                u3.h(g3);
                ((S) b3).add(g3);
                AbstractC0187j abstractC0187j = (AbstractC0187j) mVar.f2457d;
                if (!abstractC0187j.c() && mVar.f2456c == 0) {
                    u4 = abstractC0187j.u();
                } else {
                    return;
                }
            } while (u4 == i3);
            mVar.f2456c = u4;
            return;
        }
        throw C0201y.b();
    }

    public final void D(Object obj, int i3, U.m mVar, U u3, C0190m c0190m) {
        int u4;
        this.f4190k.getClass();
        InterfaceC0198v b3 = A.b(i3 & 1048575, obj);
        int i4 = mVar.f2454a;
        if ((i4 & 7) == 2) {
            do {
                AbstractC0197u g3 = u3.g();
                mVar.d(g3, u3, c0190m);
                u3.h(g3);
                ((S) b3).add(g3);
                AbstractC0187j abstractC0187j = (AbstractC0187j) mVar.f2457d;
                if (!abstractC0187j.c() && mVar.f2456c == 0) {
                    u4 = abstractC0187j.u();
                } else {
                    return;
                }
            } while (u4 == i4);
            mVar.f2456c = u4;
            return;
        }
        throw C0201y.b();
    }

    public final void E(int i3, U.m mVar, Object obj) {
        boolean z3;
        if ((536870912 & i3) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            mVar.y(2);
            h0.o(obj, i3 & 1048575, ((AbstractC0187j) mVar.f2457d).t());
        } else if (this.f4185f) {
            mVar.y(2);
            h0.o(obj, i3 & 1048575, ((AbstractC0187j) mVar.f2457d).s());
        } else {
            h0.o(obj, i3 & 1048575, mVar.f());
        }
    }

    public final void F(int i3, U.m mVar, Object obj) {
        boolean z3;
        if ((536870912 & i3) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        A a3 = this.f4190k;
        if (z3) {
            a3.getClass();
            mVar.t(A.b(i3 & 1048575, obj), true);
            return;
        }
        a3.getClass();
        mVar.t(A.b(i3 & 1048575, obj), false);
    }

    public final void H(int i3, Object obj) {
        int i4 = this.f4180a[i3 + 2];
        long j3 = 1048575 & i4;
        if (j3 == 1048575) {
            return;
        }
        h0.m(j3, obj, (1 << (i4 >>> 20)) | h0.f4256c.f(j3, obj));
    }

    public final void I(int i3, int i4, Object obj) {
        h0.m(this.f4180a[i4 + 2] & 1048575, obj, i3);
    }

    public final void J(Object obj, int i3, AbstractC0178a abstractC0178a) {
        f4179o.putObject(obj, M(i3) & 1048575, abstractC0178a);
        H(i3, obj);
    }

    public final void K(Object obj, int i3, int i4, AbstractC0178a abstractC0178a) {
        f4179o.putObject(obj, M(i4) & 1048575, abstractC0178a);
        I(i3, i4, obj);
    }

    public final int M(int i3) {
        return this.f4180a[i3 + 1];
    }

    public final void N(Object obj, D d3) {
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr = this.f4180a;
        int length = iArr.length;
        Unsafe unsafe = f4179o;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        while (i10 < length) {
            int M3 = M(i10);
            int i11 = iArr[i10];
            int L = L(M3);
            if (L <= 17) {
                int i12 = iArr[i10 + 2];
                int i13 = i12 & i7;
                if (i13 != i8) {
                    if (i13 == i7) {
                        i9 = 0;
                    } else {
                        i9 = unsafe.getInt(obj, i13);
                    }
                    i8 = i13;
                }
                i3 = i8;
                i4 = i9;
                i5 = 1 << (i12 >>> 20);
            } else {
                i3 = i8;
                i4 = i9;
                i5 = 0;
            }
            long j3 = M3 & i7;
            switch (L) {
                case 0:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        d3.c(i11, h0.f4256c.d(j3, obj));
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                case 1:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        d3.g(h0.f4256c.e(j3, obj), i11);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        d3.j(unsafe.getLong(obj, j3), i11);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        d3.q(unsafe.getLong(obj, j3), i11);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                case N.k.LONG_FIELD_NUMBER /* 4 */:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        d3.i(i11, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                case N.k.STRING_FIELD_NUMBER /* 5 */:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        d3.f(unsafe.getLong(obj, j3), i11);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        d3.e(i11, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        d3.a(i11, h0.f4256c.c(j3, obj));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                case N.k.BYTES_FIELD_NUMBER /* 8 */:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        Object object = unsafe.getObject(obj, j3);
                        if (object instanceof String) {
                            ((C0188k) d3.f4168a).Q0((String) object, i11);
                        } else {
                            d3.b(i11, (C0184g) object);
                        }
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                case 9:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        d3.k(i11, unsafe.getObject(obj, j3), m(i10));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                case 10:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        d3.b(i11, (C0184g) unsafe.getObject(obj, j3));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                case 11:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        d3.p(i11, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                case 12:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        d3.d(i11, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                case 13:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        d3.l(i11, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                case 14:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        d3.m(unsafe.getLong(obj, j3), i11);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                case 15:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        d3.n(i11, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                case 16:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        d3.o(unsafe.getLong(obj, j3), i11);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                case 17:
                    i6 = i3;
                    if (o(obj, i10, i3, i4, i5)) {
                        d3.h(i11, unsafe.getObject(obj, j3), m(i10));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                case 18:
                    V.E(iArr[i10], (List) unsafe.getObject(obj, j3), d3, false);
                    break;
                case 19:
                    V.I(iArr[i10], (List) unsafe.getObject(obj, j3), d3, false);
                    break;
                case 20:
                    V.L(iArr[i10], (List) unsafe.getObject(obj, j3), d3, false);
                    break;
                case 21:
                    V.T(iArr[i10], (List) unsafe.getObject(obj, j3), d3, false);
                    break;
                case 22:
                    V.K(iArr[i10], (List) unsafe.getObject(obj, j3), d3, false);
                    break;
                case 23:
                    V.H(iArr[i10], (List) unsafe.getObject(obj, j3), d3, false);
                    break;
                case 24:
                    V.G(iArr[i10], (List) unsafe.getObject(obj, j3), d3, false);
                    break;
                case 25:
                    V.C(iArr[i10], (List) unsafe.getObject(obj, j3), d3, false);
                    break;
                case 26:
                    V.R(iArr[i10], (List) unsafe.getObject(obj, j3), d3);
                    break;
                case 27:
                    V.M(iArr[i10], (List) unsafe.getObject(obj, j3), d3, m(i10));
                    break;
                case 28:
                    V.D(iArr[i10], (List) unsafe.getObject(obj, j3), d3);
                    break;
                case 29:
                    V.S(iArr[i10], (List) unsafe.getObject(obj, j3), d3, false);
                    break;
                case 30:
                    V.F(iArr[i10], (List) unsafe.getObject(obj, j3), d3, false);
                    break;
                case 31:
                    V.N(iArr[i10], (List) unsafe.getObject(obj, j3), d3, false);
                    break;
                case 32:
                    V.O(iArr[i10], (List) unsafe.getObject(obj, j3), d3, false);
                    break;
                case 33:
                    V.P(iArr[i10], (List) unsafe.getObject(obj, j3), d3, false);
                    break;
                case 34:
                    V.Q(iArr[i10], (List) unsafe.getObject(obj, j3), d3, false);
                    break;
                case 35:
                    V.E(iArr[i10], (List) unsafe.getObject(obj, j3), d3, true);
                    break;
                case 36:
                    V.I(iArr[i10], (List) unsafe.getObject(obj, j3), d3, true);
                    break;
                case 37:
                    V.L(iArr[i10], (List) unsafe.getObject(obj, j3), d3, true);
                    break;
                case 38:
                    V.T(iArr[i10], (List) unsafe.getObject(obj, j3), d3, true);
                    break;
                case 39:
                    V.K(iArr[i10], (List) unsafe.getObject(obj, j3), d3, true);
                    break;
                case 40:
                    V.H(iArr[i10], (List) unsafe.getObject(obj, j3), d3, true);
                    break;
                case 41:
                    V.G(iArr[i10], (List) unsafe.getObject(obj, j3), d3, true);
                    break;
                case 42:
                    V.C(iArr[i10], (List) unsafe.getObject(obj, j3), d3, true);
                    break;
                case 43:
                    V.S(iArr[i10], (List) unsafe.getObject(obj, j3), d3, true);
                    break;
                case 44:
                    V.F(iArr[i10], (List) unsafe.getObject(obj, j3), d3, true);
                    break;
                case 45:
                    V.N(iArr[i10], (List) unsafe.getObject(obj, j3), d3, true);
                    break;
                case 46:
                    V.O(iArr[i10], (List) unsafe.getObject(obj, j3), d3, true);
                    break;
                case 47:
                    V.P(iArr[i10], (List) unsafe.getObject(obj, j3), d3, true);
                    break;
                case 48:
                    V.Q(iArr[i10], (List) unsafe.getObject(obj, j3), d3, true);
                    break;
                case 49:
                    V.J(iArr[i10], (List) unsafe.getObject(obj, j3), d3, m(i10));
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j3);
                    if (object2 != null) {
                        int i14 = 2;
                        Object obj2 = this.f4181b[(i10 / 3) * 2];
                        this.f4192m.getClass();
                        E e2 = ((F) obj2).f4172a;
                        C0188k c0188k = (C0188k) d3.f4168a;
                        c0188k.getClass();
                        for (Map.Entry entry : ((G) object2).entrySet()) {
                            c0188k.S0(i11, i14);
                            c0188k.U0(F.a(e2, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C0193p.b(c0188k, e2.f4169a, 1, key);
                            C0193p.b(c0188k, e2.f4170b, 2, value);
                            i14 = 2;
                        }
                        break;
                    }
                    break;
                case 51:
                    if (q(i11, i10, obj)) {
                        d3.c(i11, ((Double) h0.f4256c.h(j3, obj)).doubleValue());
                        break;
                    }
                    break;
                case 52:
                    if (q(i11, i10, obj)) {
                        d3.g(((Float) h0.f4256c.h(j3, obj)).floatValue(), i11);
                        break;
                    }
                    break;
                case 53:
                    if (q(i11, i10, obj)) {
                        d3.j(A(j3, obj), i11);
                        break;
                    }
                    break;
                case 54:
                    if (q(i11, i10, obj)) {
                        d3.q(A(j3, obj), i11);
                        break;
                    }
                    break;
                case 55:
                    if (q(i11, i10, obj)) {
                        d3.i(i11, z(j3, obj));
                        break;
                    }
                    break;
                case 56:
                    if (q(i11, i10, obj)) {
                        d3.f(A(j3, obj), i11);
                        break;
                    }
                    break;
                case 57:
                    if (q(i11, i10, obj)) {
                        d3.e(i11, z(j3, obj));
                        break;
                    }
                    break;
                case 58:
                    if (q(i11, i10, obj)) {
                        d3.a(i11, ((Boolean) h0.f4256c.h(j3, obj)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (q(i11, i10, obj)) {
                        Object object3 = unsafe.getObject(obj, j3);
                        if (object3 instanceof String) {
                            ((C0188k) d3.f4168a).Q0((String) object3, i11);
                            break;
                        } else {
                            d3.b(i11, (C0184g) object3);
                            break;
                        }
                    }
                    break;
                case 60:
                    if (q(i11, i10, obj)) {
                        d3.k(i11, unsafe.getObject(obj, j3), m(i10));
                        break;
                    }
                    break;
                case 61:
                    if (q(i11, i10, obj)) {
                        d3.b(i11, (C0184g) unsafe.getObject(obj, j3));
                        break;
                    }
                    break;
                case 62:
                    if (q(i11, i10, obj)) {
                        d3.p(i11, z(j3, obj));
                        break;
                    }
                    break;
                case 63:
                    if (q(i11, i10, obj)) {
                        d3.d(i11, z(j3, obj));
                        break;
                    }
                    break;
                case 64:
                    if (q(i11, i10, obj)) {
                        d3.l(i11, z(j3, obj));
                        break;
                    }
                    break;
                case 65:
                    if (q(i11, i10, obj)) {
                        d3.m(A(j3, obj), i11);
                        break;
                    }
                    break;
                case 66:
                    if (q(i11, i10, obj)) {
                        d3.n(i11, z(j3, obj));
                        break;
                    }
                    break;
                case 67:
                    if (q(i11, i10, obj)) {
                        d3.o(A(j3, obj), i11);
                        break;
                    }
                    break;
                case 68:
                    if (q(i11, i10, obj)) {
                        d3.h(i11, unsafe.getObject(obj, j3), m(i10));
                        break;
                    }
                    break;
            }
            i6 = i3;
            i10 += 3;
            i8 = i6;
            i9 = i4;
            i7 = 1048575;
        }
        this.f4191l.getClass();
        ((AbstractC0197u) obj).unknownFields.d(d3);
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final boolean a(Object obj) {
        int i3;
        int i4;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < this.f4187h) {
            int i8 = this.f4186g[i7];
            int[] iArr = this.f4180a;
            int i9 = iArr[i8];
            int M3 = M(i8);
            int i10 = iArr[i8 + 2];
            int i11 = i10 & 1048575;
            int i12 = 1 << (i10 >>> 20);
            if (i11 != i5) {
                if (i11 != 1048575) {
                    i6 = f4179o.getInt(obj, i11);
                }
                i4 = i6;
                i3 = i11;
            } else {
                i3 = i5;
                i4 = i6;
            }
            if ((268435456 & M3) != 0 && !o(obj, i8, i3, i4, i12)) {
                return false;
            }
            int L = L(M3);
            if (L != 9 && L != 17) {
                if (L != 27) {
                    if (L != 60 && L != 68) {
                        if (L != 49) {
                            if (L != 50) {
                                continue;
                            } else {
                                Object h3 = h0.f4256c.h(M3 & 1048575, obj);
                                this.f4192m.getClass();
                                G g3 = (G) h3;
                                if (g3.isEmpty()) {
                                    continue;
                                } else {
                                    if (((F) this.f4181b[(i8 / 3) * 2]).f4172a.f4170b.f4292m != q0.MESSAGE) {
                                        continue;
                                    } else {
                                        U u3 = null;
                                        for (Object obj2 : g3.values()) {
                                            if (u3 == null) {
                                                u3 = Q.f4198c.a(obj2.getClass());
                                            }
                                            if (!u3.a(obj2)) {
                                                return false;
                                            }
                                        }
                                        continue;
                                    }
                                }
                            }
                        }
                    } else if (q(i9, i8, obj)) {
                        if (!m(i8).a(h0.f4256c.h(M3 & 1048575, obj))) {
                            return false;
                        }
                    } else {
                        continue;
                    }
                }
                List list = (List) h0.f4256c.h(M3 & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    U m3 = m(i8);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!m3.a(list.get(i13))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (o(obj, i8, i3, i4, i12)) {
                if (!m(i8).a(h0.f4256c.h(M3 & 1048575, obj))) {
                    return false;
                }
            } else {
                continue;
            }
            i7++;
            i5 = i3;
            i6 = i4;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void b(Object obj, Object obj2) {
        if (p(obj)) {
            obj2.getClass();
            int i3 = 0;
            while (true) {
                int[] iArr = this.f4180a;
                if (i3 < iArr.length) {
                    int M3 = M(i3);
                    long j3 = 1048575 & M3;
                    int i4 = iArr[i3];
                    switch (L(M3)) {
                        case 0:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                g0 g0Var = h0.f4256c;
                                g0Var.l(obj, j3, g0Var.d(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case 1:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                g0 g0Var2 = h0.f4256c;
                                g0Var2.m(obj, j3, g0Var2.e(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                h0.n(obj, j3, h0.f4256c.g(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                h0.n(obj, j3, h0.f4256c.g(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case N.k.LONG_FIELD_NUMBER /* 4 */:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                h0.m(j3, obj, h0.f4256c.f(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case N.k.STRING_FIELD_NUMBER /* 5 */:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                h0.n(obj, j3, h0.f4256c.g(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                h0.m(j3, obj, h0.f4256c.f(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                g0 g0Var3 = h0.f4256c;
                                g0Var3.j(obj, j3, g0Var3.c(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case N.k.BYTES_FIELD_NUMBER /* 8 */:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                h0.o(obj, j3, h0.f4256c.h(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case 9:
                            t(i3, obj, obj2);
                            break;
                        case 10:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                h0.o(obj, j3, h0.f4256c.h(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case 11:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                h0.m(j3, obj, h0.f4256c.f(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case 12:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                h0.m(j3, obj, h0.f4256c.f(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case 13:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                h0.m(j3, obj, h0.f4256c.f(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case 14:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                h0.n(obj, j3, h0.f4256c.g(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case 15:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                h0.m(j3, obj, h0.f4256c.f(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case 16:
                            if (!n(i3, obj2)) {
                                break;
                            } else {
                                h0.n(obj, j3, h0.f4256c.g(j3, obj2));
                                H(i3, obj);
                                break;
                            }
                        case 17:
                            t(i3, obj, obj2);
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f4190k.getClass();
                            g0 g0Var4 = h0.f4256c;
                            InterfaceC0198v interfaceC0198v = (InterfaceC0198v) g0Var4.h(j3, obj);
                            InterfaceC0198v interfaceC0198v2 = (InterfaceC0198v) g0Var4.h(j3, obj2);
                            S s3 = (S) interfaceC0198v;
                            int i5 = s3.f4203o;
                            int i6 = ((S) interfaceC0198v2).f4203o;
                            if (i5 > 0 && i6 > 0) {
                                if (!((AbstractC0179b) interfaceC0198v).f4226m) {
                                    interfaceC0198v = s3.c(i6 + i5);
                                }
                                ((AbstractC0179b) interfaceC0198v).addAll(interfaceC0198v2);
                            }
                            if (i5 > 0) {
                                interfaceC0198v2 = interfaceC0198v;
                            }
                            h0.o(obj, j3, interfaceC0198v2);
                            break;
                        case 50:
                            Class cls = V.f4208a;
                            g0 g0Var5 = h0.f4256c;
                            Object h3 = g0Var5.h(j3, obj);
                            Object h4 = g0Var5.h(j3, obj2);
                            this.f4192m.getClass();
                            h0.o(obj, j3, H.b(h3, h4));
                            break;
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                            if (!q(i4, i3, obj2)) {
                                break;
                            } else {
                                h0.o(obj, j3, h0.f4256c.h(j3, obj2));
                                I(i4, i3, obj);
                                break;
                            }
                        case 60:
                            u(i3, obj, obj2);
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (!q(i4, i3, obj2)) {
                                break;
                            } else {
                                h0.o(obj, j3, h0.f4256c.h(j3, obj2));
                                I(i4, i3, obj);
                                break;
                            }
                        case 68:
                            u(i3, obj, obj2);
                            break;
                    }
                    i3 += 3;
                } else {
                    V.A(this.f4191l, obj, obj2);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void c(Object obj, D d3) {
        d3.getClass();
        N(obj, d3);
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void d(Object obj, U.m mVar, C0190m c0190m) {
        c0190m.getClass();
        if (p(obj)) {
            r(this.f4191l, obj, mVar, c0190m);
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00df, code lost:
        if (r4 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e3, code lost:
        r3 = r8 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0217, code lost:
        if (r4 != false) goto L52;
     */
    @Override // androidx.datastore.preferences.protobuf.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(androidx.datastore.preferences.protobuf.AbstractC0197u r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.L.e(androidx.datastore.preferences.protobuf.u):int");
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final int f(AbstractC0197u abstractC0197u) {
        int i3;
        int i4;
        int i5;
        int k02;
        int w02;
        int i6;
        int y02;
        int A02;
        Unsafe unsafe = f4179o;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f4180a;
            if (i10 < iArr.length) {
                int M3 = M(i10);
                int L = L(M3);
                int i12 = iArr[i10];
                int i13 = iArr[i10 + 2];
                int i14 = i13 & i7;
                if (L <= 17) {
                    if (i14 != i8) {
                        if (i14 == i7) {
                            i9 = 0;
                        } else {
                            i9 = unsafe.getInt(abstractC0197u, i14);
                        }
                        i8 = i14;
                    }
                    i3 = i8;
                    i4 = i9;
                    i5 = 1 << (i13 >>> 20);
                } else {
                    i3 = i8;
                    i4 = i9;
                    i5 = 0;
                }
                long j3 = M3 & i7;
                if (L >= EnumC0194q.f4294n.a()) {
                    EnumC0194q.f4295o.a();
                }
                switch (L) {
                    case 0:
                        if (!o(abstractC0197u, i10, i3, i4, i5)) {
                            break;
                        } else {
                            k02 = C0188k.k0(i12);
                            i11 += k02;
                            break;
                        }
                    case 1:
                        if (!o(abstractC0197u, i10, i3, i4, i5)) {
                            break;
                        } else {
                            k02 = C0188k.o0(i12);
                            i11 += k02;
                            break;
                        }
                    case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                        if (!o(abstractC0197u, i10, i3, i4, i5)) {
                            break;
                        } else {
                            k02 = C0188k.r0(unsafe.getLong(abstractC0197u, j3), i12);
                            i11 += k02;
                            break;
                        }
                    case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                        if (!o(abstractC0197u, i10, i3, i4, i5)) {
                            break;
                        } else {
                            k02 = C0188k.B0(unsafe.getLong(abstractC0197u, j3), i12);
                            i11 += k02;
                            break;
                        }
                    case N.k.LONG_FIELD_NUMBER /* 4 */:
                        if (!o(abstractC0197u, i10, i3, i4, i5)) {
                            break;
                        } else {
                            k02 = C0188k.q0(i12, unsafe.getInt(abstractC0197u, j3));
                            i11 += k02;
                            break;
                        }
                    case N.k.STRING_FIELD_NUMBER /* 5 */:
                        if (!o(abstractC0197u, i10, i3, i4, i5)) {
                            break;
                        } else {
                            k02 = C0188k.n0(i12);
                            i11 += k02;
                            break;
                        }
                    case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (!o(abstractC0197u, i10, i3, i4, i5)) {
                            break;
                        } else {
                            k02 = C0188k.m0(i12);
                            i11 += k02;
                            break;
                        }
                    case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (!o(abstractC0197u, i10, i3, i4, i5)) {
                            break;
                        } else {
                            k02 = C0188k.i0(i12);
                            i11 += k02;
                            break;
                        }
                    case N.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (!o(abstractC0197u, i10, i3, i4, i5)) {
                            break;
                        } else {
                            Object object = unsafe.getObject(abstractC0197u, j3);
                            if (object instanceof C0184g) {
                                w02 = C0188k.j0(i12, (C0184g) object);
                            } else {
                                w02 = C0188k.w0((String) object, i12);
                            }
                            i11 = w02 + i11;
                            break;
                        }
                    case 9:
                        if (!o(abstractC0197u, i10, i3, i4, i5)) {
                            break;
                        } else {
                            k02 = V.o(i12, unsafe.getObject(abstractC0197u, j3), m(i10));
                            i11 += k02;
                            break;
                        }
                    case 10:
                        if (!o(abstractC0197u, i10, i3, i4, i5)) {
                            break;
                        } else {
                            k02 = C0188k.j0(i12, (C0184g) unsafe.getObject(abstractC0197u, j3));
                            i11 += k02;
                            break;
                        }
                    case 11:
                        if (!o(abstractC0197u, i10, i3, i4, i5)) {
                            break;
                        } else {
                            k02 = C0188k.z0(i12, unsafe.getInt(abstractC0197u, j3));
                            i11 += k02;
                            break;
                        }
                    case 12:
                        if (!o(abstractC0197u, i10, i3, i4, i5)) {
                            break;
                        } else {
                            k02 = C0188k.l0(i12, unsafe.getInt(abstractC0197u, j3));
                            i11 += k02;
                            break;
                        }
                    case 13:
                        if (!o(abstractC0197u, i10, i3, i4, i5)) {
                            break;
                        } else {
                            k02 = C0188k.s0(i12);
                            i11 += k02;
                            break;
                        }
                    case 14:
                        if (!o(abstractC0197u, i10, i3, i4, i5)) {
                            break;
                        } else {
                            k02 = C0188k.t0(i12);
                            i11 += k02;
                            break;
                        }
                    case 15:
                        if (!o(abstractC0197u, i10, i3, i4, i5)) {
                            break;
                        } else {
                            k02 = C0188k.u0(i12, unsafe.getInt(abstractC0197u, j3));
                            i11 += k02;
                            break;
                        }
                    case 16:
                        if (!o(abstractC0197u, i10, i3, i4, i5)) {
                            break;
                        } else {
                            k02 = C0188k.v0(unsafe.getLong(abstractC0197u, j3), i12);
                            i11 += k02;
                            break;
                        }
                    case 17:
                        if (!o(abstractC0197u, i10, i3, i4, i5)) {
                            break;
                        } else {
                            k02 = C0188k.p0(i12, (AbstractC0178a) unsafe.getObject(abstractC0197u, j3), m(i10));
                            i11 += k02;
                            break;
                        }
                    case 18:
                        k02 = V.h(i12, (List) unsafe.getObject(abstractC0197u, j3));
                        i11 += k02;
                        break;
                    case 19:
                        k02 = V.f(i12, (List) unsafe.getObject(abstractC0197u, j3));
                        i11 += k02;
                        break;
                    case 20:
                        k02 = V.m(i12, (List) unsafe.getObject(abstractC0197u, j3));
                        i11 += k02;
                        break;
                    case 21:
                        k02 = V.x(i12, (List) unsafe.getObject(abstractC0197u, j3));
                        i11 += k02;
                        break;
                    case 22:
                        k02 = V.k(i12, (List) unsafe.getObject(abstractC0197u, j3));
                        i11 += k02;
                        break;
                    case 23:
                        k02 = V.h(i12, (List) unsafe.getObject(abstractC0197u, j3));
                        i11 += k02;
                        break;
                    case 24:
                        k02 = V.f(i12, (List) unsafe.getObject(abstractC0197u, j3));
                        i11 += k02;
                        break;
                    case 25:
                        k02 = V.a(i12, (List) unsafe.getObject(abstractC0197u, j3));
                        i11 += k02;
                        break;
                    case 26:
                        k02 = V.u(i12, (List) unsafe.getObject(abstractC0197u, j3));
                        i11 += k02;
                        break;
                    case 27:
                        k02 = V.p(i12, (List) unsafe.getObject(abstractC0197u, j3), m(i10));
                        i11 += k02;
                        break;
                    case 28:
                        k02 = V.c(i12, (List) unsafe.getObject(abstractC0197u, j3));
                        i11 += k02;
                        break;
                    case 29:
                        k02 = V.v(i12, (List) unsafe.getObject(abstractC0197u, j3));
                        i11 += k02;
                        break;
                    case 30:
                        k02 = V.d(i12, (List) unsafe.getObject(abstractC0197u, j3));
                        i11 += k02;
                        break;
                    case 31:
                        k02 = V.f(i12, (List) unsafe.getObject(abstractC0197u, j3));
                        i11 += k02;
                        break;
                    case 32:
                        k02 = V.h(i12, (List) unsafe.getObject(abstractC0197u, j3));
                        i11 += k02;
                        break;
                    case 33:
                        k02 = V.q(i12, (List) unsafe.getObject(abstractC0197u, j3));
                        i11 += k02;
                        break;
                    case 34:
                        k02 = V.s(i12, (List) unsafe.getObject(abstractC0197u, j3));
                        i11 += k02;
                        break;
                    case 35:
                        i6 = V.i((List) unsafe.getObject(abstractC0197u, j3));
                        if (i6 <= 0) {
                            break;
                        } else {
                            y02 = C0188k.y0(i12);
                            A02 = C0188k.A0(i6);
                            i11 += A02 + y02 + i6;
                            break;
                        }
                    case 36:
                        i6 = V.g((List) unsafe.getObject(abstractC0197u, j3));
                        if (i6 <= 0) {
                            break;
                        } else {
                            y02 = C0188k.y0(i12);
                            A02 = C0188k.A0(i6);
                            i11 += A02 + y02 + i6;
                            break;
                        }
                    case 37:
                        i6 = V.n((List) unsafe.getObject(abstractC0197u, j3));
                        if (i6 <= 0) {
                            break;
                        } else {
                            y02 = C0188k.y0(i12);
                            A02 = C0188k.A0(i6);
                            i11 += A02 + y02 + i6;
                            break;
                        }
                    case 38:
                        i6 = V.y((List) unsafe.getObject(abstractC0197u, j3));
                        if (i6 <= 0) {
                            break;
                        } else {
                            y02 = C0188k.y0(i12);
                            A02 = C0188k.A0(i6);
                            i11 += A02 + y02 + i6;
                            break;
                        }
                    case 39:
                        i6 = V.l((List) unsafe.getObject(abstractC0197u, j3));
                        if (i6 <= 0) {
                            break;
                        } else {
                            y02 = C0188k.y0(i12);
                            A02 = C0188k.A0(i6);
                            i11 += A02 + y02 + i6;
                            break;
                        }
                    case 40:
                        i6 = V.i((List) unsafe.getObject(abstractC0197u, j3));
                        if (i6 <= 0) {
                            break;
                        } else {
                            y02 = C0188k.y0(i12);
                            A02 = C0188k.A0(i6);
                            i11 += A02 + y02 + i6;
                            break;
                        }
                    case 41:
                        i6 = V.g((List) unsafe.getObject(abstractC0197u, j3));
                        if (i6 <= 0) {
                            break;
                        } else {
                            y02 = C0188k.y0(i12);
                            A02 = C0188k.A0(i6);
                            i11 += A02 + y02 + i6;
                            break;
                        }
                    case 42:
                        i6 = V.b((List) unsafe.getObject(abstractC0197u, j3));
                        if (i6 <= 0) {
                            break;
                        } else {
                            y02 = C0188k.y0(i12);
                            A02 = C0188k.A0(i6);
                            i11 += A02 + y02 + i6;
                            break;
                        }
                    case 43:
                        i6 = V.w((List) unsafe.getObject(abstractC0197u, j3));
                        if (i6 <= 0) {
                            break;
                        } else {
                            y02 = C0188k.y0(i12);
                            A02 = C0188k.A0(i6);
                            i11 += A02 + y02 + i6;
                            break;
                        }
                    case 44:
                        i6 = V.e((List) unsafe.getObject(abstractC0197u, j3));
                        if (i6 <= 0) {
                            break;
                        } else {
                            y02 = C0188k.y0(i12);
                            A02 = C0188k.A0(i6);
                            i11 += A02 + y02 + i6;
                            break;
                        }
                    case 45:
                        i6 = V.g((List) unsafe.getObject(abstractC0197u, j3));
                        if (i6 <= 0) {
                            break;
                        } else {
                            y02 = C0188k.y0(i12);
                            A02 = C0188k.A0(i6);
                            i11 += A02 + y02 + i6;
                            break;
                        }
                    case 46:
                        i6 = V.i((List) unsafe.getObject(abstractC0197u, j3));
                        if (i6 <= 0) {
                            break;
                        } else {
                            y02 = C0188k.y0(i12);
                            A02 = C0188k.A0(i6);
                            i11 += A02 + y02 + i6;
                            break;
                        }
                    case 47:
                        i6 = V.r((List) unsafe.getObject(abstractC0197u, j3));
                        if (i6 <= 0) {
                            break;
                        } else {
                            y02 = C0188k.y0(i12);
                            A02 = C0188k.A0(i6);
                            i11 += A02 + y02 + i6;
                            break;
                        }
                    case 48:
                        i6 = V.t((List) unsafe.getObject(abstractC0197u, j3));
                        if (i6 <= 0) {
                            break;
                        } else {
                            y02 = C0188k.y0(i12);
                            A02 = C0188k.A0(i6);
                            i11 += A02 + y02 + i6;
                            break;
                        }
                    case 49:
                        k02 = V.j(i12, (List) unsafe.getObject(abstractC0197u, j3), m(i10));
                        i11 += k02;
                        break;
                    case 50:
                        Object object2 = unsafe.getObject(abstractC0197u, j3);
                        Object obj = this.f4181b[(i10 / 3) * 2];
                        this.f4192m.getClass();
                        k02 = H.a(i12, object2, obj);
                        i11 += k02;
                        break;
                    case 51:
                        if (!q(i12, i10, abstractC0197u)) {
                            break;
                        } else {
                            k02 = C0188k.k0(i12);
                            i11 += k02;
                            break;
                        }
                    case 52:
                        if (!q(i12, i10, abstractC0197u)) {
                            break;
                        } else {
                            k02 = C0188k.o0(i12);
                            i11 += k02;
                            break;
                        }
                    case 53:
                        if (!q(i12, i10, abstractC0197u)) {
                            break;
                        } else {
                            k02 = C0188k.r0(A(j3, abstractC0197u), i12);
                            i11 += k02;
                            break;
                        }
                    case 54:
                        if (!q(i12, i10, abstractC0197u)) {
                            break;
                        } else {
                            k02 = C0188k.B0(A(j3, abstractC0197u), i12);
                            i11 += k02;
                            break;
                        }
                    case 55:
                        if (!q(i12, i10, abstractC0197u)) {
                            break;
                        } else {
                            k02 = C0188k.q0(i12, z(j3, abstractC0197u));
                            i11 += k02;
                            break;
                        }
                    case 56:
                        if (!q(i12, i10, abstractC0197u)) {
                            break;
                        } else {
                            k02 = C0188k.n0(i12);
                            i11 += k02;
                            break;
                        }
                    case 57:
                        if (!q(i12, i10, abstractC0197u)) {
                            break;
                        } else {
                            k02 = C0188k.m0(i12);
                            i11 += k02;
                            break;
                        }
                    case 58:
                        if (!q(i12, i10, abstractC0197u)) {
                            break;
                        } else {
                            k02 = C0188k.i0(i12);
                            i11 += k02;
                            break;
                        }
                    case 59:
                        if (!q(i12, i10, abstractC0197u)) {
                            break;
                        } else {
                            Object object3 = unsafe.getObject(abstractC0197u, j3);
                            if (object3 instanceof C0184g) {
                                w02 = C0188k.j0(i12, (C0184g) object3);
                            } else {
                                w02 = C0188k.w0((String) object3, i12);
                            }
                            i11 = w02 + i11;
                            break;
                        }
                    case 60:
                        if (!q(i12, i10, abstractC0197u)) {
                            break;
                        } else {
                            k02 = V.o(i12, unsafe.getObject(abstractC0197u, j3), m(i10));
                            i11 += k02;
                            break;
                        }
                    case 61:
                        if (!q(i12, i10, abstractC0197u)) {
                            break;
                        } else {
                            k02 = C0188k.j0(i12, (C0184g) unsafe.getObject(abstractC0197u, j3));
                            i11 += k02;
                            break;
                        }
                    case 62:
                        if (!q(i12, i10, abstractC0197u)) {
                            break;
                        } else {
                            k02 = C0188k.z0(i12, z(j3, abstractC0197u));
                            i11 += k02;
                            break;
                        }
                    case 63:
                        if (!q(i12, i10, abstractC0197u)) {
                            break;
                        } else {
                            k02 = C0188k.l0(i12, z(j3, abstractC0197u));
                            i11 += k02;
                            break;
                        }
                    case 64:
                        if (!q(i12, i10, abstractC0197u)) {
                            break;
                        } else {
                            k02 = C0188k.s0(i12);
                            i11 += k02;
                            break;
                        }
                    case 65:
                        if (!q(i12, i10, abstractC0197u)) {
                            break;
                        } else {
                            k02 = C0188k.t0(i12);
                            i11 += k02;
                            break;
                        }
                    case 66:
                        if (!q(i12, i10, abstractC0197u)) {
                            break;
                        } else {
                            k02 = C0188k.u0(i12, z(j3, abstractC0197u));
                            i11 += k02;
                            break;
                        }
                    case 67:
                        if (!q(i12, i10, abstractC0197u)) {
                            break;
                        } else {
                            k02 = C0188k.v0(A(j3, abstractC0197u), i12);
                            i11 += k02;
                            break;
                        }
                    case 68:
                        if (!q(i12, i10, abstractC0197u)) {
                            break;
                        } else {
                            k02 = C0188k.p0(i12, (AbstractC0178a) unsafe.getObject(abstractC0197u, j3), m(i10));
                            i11 += k02;
                            break;
                        }
                }
                i10 += 3;
                i8 = i3;
                i9 = i4;
                i7 = 1048575;
            } else {
                this.f4191l.getClass();
                return abstractC0197u.unknownFields.b() + i11;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final AbstractC0197u g() {
        this.f4189j.getClass();
        return ((AbstractC0197u) this.f4184e).k();
    }

    @Override // androidx.datastore.preferences.protobuf.U
    public final void h(Object obj) {
        if (!p(obj)) {
            return;
        }
        if (obj instanceof AbstractC0197u) {
            AbstractC0197u abstractC0197u = (AbstractC0197u) obj;
            abstractC0197u.d();
            abstractC0197u.c();
            abstractC0197u.j();
        }
        int[] iArr = this.f4180a;
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int M3 = M(i3);
            long j3 = 1048575 & M3;
            int L = L(M3);
            if (L != 9) {
                if (L != 60 && L != 68) {
                    switch (L) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f4190k.getClass();
                            A.a(j3, obj);
                            break;
                        case 50:
                            Unsafe unsafe = f4179o;
                            Object object = unsafe.getObject(obj, j3);
                            if (object != null) {
                                this.f4192m.getClass();
                                H.c(object);
                                unsafe.putObject(obj, j3, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (q(iArr[i3], i3, obj)) {
                    m(i3).h(f4179o.getObject(obj, j3));
                }
            }
            if (n(i3, obj)) {
                m(i3).h(f4179o.getObject(obj, j3));
            }
        }
        this.f4191l.getClass();
        c0.b(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ec, code lost:
        if (java.lang.Double.doubleToLongBits(r5.d(r7, r12)) == java.lang.Double.doubleToLongBits(r5.d(r7, r13))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (androidx.datastore.preferences.protobuf.V.B(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
        if (androidx.datastore.preferences.protobuf.V.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0108, code lost:
        if (androidx.datastore.preferences.protobuf.V.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0120, code lost:
        if (androidx.datastore.preferences.protobuf.V.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0138, code lost:
        if (androidx.datastore.preferences.protobuf.V.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014c, code lost:
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0160, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0176, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018a, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019f, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b4, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01cf, code lost:
        if (java.lang.Float.floatToIntBits(r5.e(r7, r12)) == java.lang.Float.floatToIntBits(r5.e(r7, r13))) goto L85;
     */
    @Override // androidx.datastore.preferences.protobuf.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(androidx.datastore.preferences.protobuf.AbstractC0197u r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.L.i(androidx.datastore.preferences.protobuf.u, java.lang.Object):boolean");
    }

    public final boolean j(AbstractC0197u abstractC0197u, Object obj, int i3) {
        if (n(i3, abstractC0197u) == n(i3, obj)) {
            return true;
        }
        return false;
    }

    public final void k(int i3, Object obj, Object obj2) {
        int i4 = this.f4180a[i3];
        if (h0.f4256c.h(M(i3) & 1048575, obj) == null) {
            return;
        }
        l(i3);
    }

    public final void l(int i3) {
        if (this.f4181b[((i3 / 3) * 2) + 1] == null) {
            return;
        }
        throw new ClassCastException();
    }

    public final U m(int i3) {
        int i4 = (i3 / 3) * 2;
        Object[] objArr = this.f4181b;
        U u3 = (U) objArr[i4];
        if (u3 != null) {
            return u3;
        }
        U a3 = Q.f4198c.a((Class) objArr[i4 + 1]);
        objArr[i4] = a3;
        return a3;
    }

    public final boolean n(int i3, Object obj) {
        int i4 = this.f4180a[i3 + 2];
        long j3 = i4 & 1048575;
        if (j3 == 1048575) {
            int M3 = M(i3);
            long j4 = M3 & 1048575;
            switch (L(M3)) {
                case 0:
                    if (Double.doubleToRawLongBits(h0.f4256c.d(j4, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(h0.f4256c.e(j4, obj)) == 0) {
                        return false;
                    }
                    return true;
                case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                    if (h0.f4256c.g(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                    if (h0.f4256c.g(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case N.k.LONG_FIELD_NUMBER /* 4 */:
                    if (h0.f4256c.f(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case N.k.STRING_FIELD_NUMBER /* 5 */:
                    if (h0.f4256c.g(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (h0.f4256c.f(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    return h0.f4256c.c(j4, obj);
                case N.k.BYTES_FIELD_NUMBER /* 8 */:
                    Object h3 = h0.f4256c.h(j4, obj);
                    if (h3 instanceof String) {
                        return !((String) h3).isEmpty();
                    }
                    if (h3 instanceof C0184g) {
                        return !C0184g.f4242o.equals(h3);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (h0.f4256c.h(j4, obj) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return !C0184g.f4242o.equals(h0.f4256c.h(j4, obj));
                case 11:
                    if (h0.f4256c.f(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (h0.f4256c.f(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (h0.f4256c.f(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (h0.f4256c.g(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (h0.f4256c.f(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (h0.f4256c.g(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (h0.f4256c.h(j4, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i4 >>> 20)) & h0.f4256c.f(j3, obj)) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean o(Object obj, int i3, int i4, int i5, int i6) {
        if (i4 == 1048575) {
            return n(i3, obj);
        }
        if ((i5 & i6) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q(int i3, int i4, Object obj) {
        if (h0.f4256c.f(this.f4180a[i4 + 2] & 1048575, obj) == i3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0648 A[Catch: all -> 0x025c, TryCatch #3 {all -> 0x025c, blocks: (B:67:0x0257, B:120:0x0643, B:122:0x0648, B:123:0x064d, B:70:0x025f, B:71:0x0272, B:72:0x0285, B:73:0x0298, B:74:0x02ab, B:75:0x02c4, B:76:0x02d7, B:77:0x02ea, B:78:0x02fd, B:79:0x0310, B:80:0x0323, B:81:0x0336, B:82:0x0349, B:83:0x035c, B:84:0x036f, B:85:0x0382, B:86:0x0395, B:87:0x03a8, B:88:0x03bb, B:89:0x03d4, B:90:0x03e7, B:91:0x03fa, B:92:0x040e, B:93:0x0416, B:94:0x0429, B:95:0x043c, B:96:0x044f, B:97:0x0462, B:98:0x0475, B:99:0x0488, B:100:0x049b, B:101:0x04ae, B:102:0x04c7, B:103:0x04dd, B:104:0x04f3, B:105:0x050a, B:106:0x0521, B:107:0x053a, B:108:0x0550, B:109:0x0563, B:110:0x057c, B:111:0x0587, B:112:0x059f, B:113:0x05b6, B:114:0x05cd, B:115:0x05e3, B:116:0x05f9, B:117:0x060e, B:118:0x0626), top: B:144:0x0257 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0653 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(androidx.datastore.preferences.protobuf.c0 r20, java.lang.Object r21, U.m r22, androidx.datastore.preferences.protobuf.C0190m r23) {
        /*
            Method dump skipped, instructions count: 1808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.L.r(androidx.datastore.preferences.protobuf.c0, java.lang.Object, U.m, androidx.datastore.preferences.protobuf.m):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
        r0.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(java.lang.Object r9, int r10, java.lang.Object r11, androidx.datastore.preferences.protobuf.C0190m r12, U.m r13) {
        /*
            r8 = this;
            int r10 = r8.M(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            androidx.datastore.preferences.protobuf.g0 r10 = androidx.datastore.preferences.protobuf.h0.f4256c
            java.lang.Object r10 = r10.h(r0, r9)
            androidx.datastore.preferences.protobuf.H r2 = r8.f4192m
            if (r10 != 0) goto L20
            r2.getClass()
            androidx.datastore.preferences.protobuf.G r10 = androidx.datastore.preferences.protobuf.G.f4173n
            androidx.datastore.preferences.protobuf.G r10 = r10.b()
            androidx.datastore.preferences.protobuf.h0.o(r9, r0, r10)
            goto L37
        L20:
            r2.getClass()
            r3 = r10
            androidx.datastore.preferences.protobuf.G r3 = (androidx.datastore.preferences.protobuf.G) r3
            boolean r3 = r3.f4174m
            if (r3 != 0) goto L37
            androidx.datastore.preferences.protobuf.G r3 = androidx.datastore.preferences.protobuf.G.f4173n
            androidx.datastore.preferences.protobuf.G r3 = r3.b()
            androidx.datastore.preferences.protobuf.H.b(r3, r10)
            androidx.datastore.preferences.protobuf.h0.o(r9, r0, r3)
            r10 = r3
        L37:
            r2.getClass()
            androidx.datastore.preferences.protobuf.G r10 = (androidx.datastore.preferences.protobuf.G) r10
            androidx.datastore.preferences.protobuf.F r11 = (androidx.datastore.preferences.protobuf.F) r11
            androidx.datastore.preferences.protobuf.E r9 = r11.f4172a
            r11 = 2
            r13.y(r11)
            java.lang.Object r0 = r13.f2457d
            androidx.datastore.preferences.protobuf.j r0 = (androidx.datastore.preferences.protobuf.AbstractC0187j) r0
            int r1 = r0.v()
            int r1 = r0.e(r1)
            java.lang.String r2 = ""
            N.k r3 = r9.f4171c
            r4 = r3
        L55:
            int r5 = r13.b()     // Catch: java.lang.Throwable -> L79
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L9b
            boolean r6 = r0.c()     // Catch: java.lang.Throwable -> L79
            if (r6 == 0) goto L65
            goto L9b
        L65:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L86
            if (r5 == r11) goto L7b
            boolean r5 = r13.z()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0200x -> L8e
            if (r5 == 0) goto L73
            goto L55
        L73:
            androidx.datastore.preferences.protobuf.y r5 = new androidx.datastore.preferences.protobuf.y     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0200x -> L8e
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0200x -> L8e
            throw r5     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0200x -> L8e
        L79:
            r9 = move-exception
            goto La2
        L7b:
            androidx.datastore.preferences.protobuf.n0 r5 = r9.f4170b     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0200x -> L8e
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0200x -> L8e
            java.lang.Object r4 = r13.j(r5, r6, r12)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0200x -> L8e
            goto L55
        L86:
            androidx.datastore.preferences.protobuf.l0 r5 = r9.f4169a     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0200x -> L8e
            r6 = 0
            java.lang.Object r2 = r13.j(r5, r6, r6)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C0200x -> L8e
            goto L55
        L8e:
            boolean r5 = r13.z()     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L95
            goto L55
        L95:
            androidx.datastore.preferences.protobuf.y r9 = new androidx.datastore.preferences.protobuf.y     // Catch: java.lang.Throwable -> L79
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L79
            throw r9     // Catch: java.lang.Throwable -> L79
        L9b:
            r10.put(r2, r4)     // Catch: java.lang.Throwable -> L79
            r0.d(r1)
            return
        La2:
            r0.d(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.L.s(java.lang.Object, int, java.lang.Object, androidx.datastore.preferences.protobuf.m, U.m):void");
    }

    public final void t(int i3, Object obj, Object obj2) {
        if (!n(i3, obj2)) {
            return;
        }
        long M3 = M(i3) & 1048575;
        Unsafe unsafe = f4179o;
        Object object = unsafe.getObject(obj2, M3);
        if (object != null) {
            U m3 = m(i3);
            if (!n(i3, obj)) {
                if (!p(object)) {
                    unsafe.putObject(obj, M3, object);
                } else {
                    AbstractC0197u g3 = m3.g();
                    m3.b(g3, object);
                    unsafe.putObject(obj, M3, g3);
                }
                H(i3, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, M3);
            if (!p(object2)) {
                AbstractC0197u g4 = m3.g();
                m3.b(g4, object2);
                unsafe.putObject(obj, M3, g4);
                object2 = g4;
            }
            m3.b(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f4180a[i3] + " is present but null: " + obj2);
    }

    public final void u(int i3, Object obj, Object obj2) {
        int[] iArr;
        int i4 = this.f4180a[i3];
        if (!q(i4, i3, obj2)) {
            return;
        }
        long M3 = M(i3) & 1048575;
        Unsafe unsafe = f4179o;
        Object object = unsafe.getObject(obj2, M3);
        if (object != null) {
            U m3 = m(i3);
            if (!q(i4, i3, obj)) {
                if (!p(object)) {
                    unsafe.putObject(obj, M3, object);
                } else {
                    AbstractC0197u g3 = m3.g();
                    m3.b(g3, object);
                    unsafe.putObject(obj, M3, g3);
                }
                I(i4, i3, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, M3);
            if (!p(object2)) {
                AbstractC0197u g4 = m3.g();
                m3.b(g4, object2);
                unsafe.putObject(obj, M3, g4);
                object2 = g4;
            }
            m3.b(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i3] + " is present but null: " + obj2);
    }

    public final Object v(int i3, Object obj) {
        U m3 = m(i3);
        long M3 = M(i3) & 1048575;
        if (!n(i3, obj)) {
            return m3.g();
        }
        Object object = f4179o.getObject(obj, M3);
        if (p(object)) {
            return object;
        }
        AbstractC0197u g3 = m3.g();
        if (object != null) {
            m3.b(g3, object);
        }
        return g3;
    }

    public final Object w(int i3, int i4, Object obj) {
        U m3 = m(i4);
        if (!q(i3, i4, obj)) {
            return m3.g();
        }
        Object object = f4179o.getObject(obj, M(i4) & 1048575);
        if (p(object)) {
            return object;
        }
        AbstractC0197u g3 = m3.g();
        if (object != null) {
            m3.b(g3, object);
        }
        return g3;
    }
}
