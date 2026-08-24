package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C0355j;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0352g;
import j$.util.function.InterfaceC0362q;
import j$.util.function.Predicate;
import java.util.Objects;
/* renamed from: j$.util.stream.v0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0482v0 implements F3 {

    /* renamed from: a  reason: collision with root package name */
    private static final Z0 f7277a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final D0 f7278b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final F0 f7279c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final B0 f7280d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f7281e = new int[0];

    /* renamed from: f  reason: collision with root package name */
    private static final long[] f7282f = new long[0];

    /* renamed from: g  reason: collision with root package name */
    private static final double[] f7283g = new double[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long B(long j3, long j4) {
        long j5 = j4 >= 0 ? j3 + j4 : Long.MAX_VALUE;
        if (j5 >= 0) {
            return j5;
        }
        return Long.MAX_VALUE;
    }

    public abstract Q1 d0();

    @Override // j$.util.stream.F3
    public /* synthetic */ int g() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long A(long j3, long j4, long j5) {
        if (j3 >= 0) {
            return Math.max(-1L, Math.min(j3 - j4, j5));
        }
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.Stream, j$.util.stream.b] */
    public static Stream e0(Spliterator spliterator, boolean z3) {
        Objects.requireNonNull(spliterator);
        return new AbstractC0382b(spliterator, Z2.q(spliterator), z3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Spliterator C(EnumC0381a3 enumC0381a3, Spliterator spliterator, long j3, long j4) {
        long j5 = j4 >= 0 ? j3 + j4 : Long.MAX_VALUE;
        long j6 = j5 >= 0 ? j5 : Long.MAX_VALUE;
        int i3 = AbstractC0484v2.f7288a[enumC0381a3.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException("Unknown shape " + enumC0381a3);
                    }
                    return new AbstractC0470s3((j$.util.B) spliterator, j3, j6);
                }
                return new AbstractC0470s3((j$.util.F) spliterator, j3, j6);
            }
            return new AbstractC0470s3((j$.util.D) spliterator, j3, j6);
        }
        return new C0475t3(spliterator, j3, j6);
    }

    public static C0472t0 b0(Predicate predicate, EnumC0467s0 enumC0467s0) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(enumC0467s0);
        return new C0472t0(EnumC0381a3.REFERENCE, enumC0467s0, new C0438m0(3, enumC0467s0, predicate));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC0379a1 L(EnumC0381a3 enumC0381a3) {
        int i3 = I0.f6938a[enumC0381a3.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        return (AbstractC0379a1) f7280d;
                    }
                    throw new IllegalStateException("Unknown shape " + enumC0381a3);
                }
                return (AbstractC0379a1) f7279c;
            }
            return (AbstractC0379a1) f7278b;
        }
        return f7277a;
    }

    public static C0472t0 Y(j$.util.function.r rVar, EnumC0467s0 enumC0467s0) {
        Objects.requireNonNull(rVar);
        Objects.requireNonNull(enumC0467s0);
        return new C0472t0(EnumC0381a3.INT_VALUE, enumC0467s0, new C0438m0(1, enumC0467s0, rVar));
    }

    public static Stream c0(AbstractC0400e2 abstractC0400e2, long j3, long j4) {
        if (j3 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j3);
        }
        return new C0450o2(abstractC0400e2, M(j4), j3, j4);
    }

    public static H0 w(H0 h02, long j3, long j4, IntFunction intFunction) {
        if (j3 == 0 && j4 == h02.count()) {
            return h02;
        }
        Spliterator spliterator = h02.spliterator();
        long j5 = j4 - j3;
        InterfaceC0502z0 D3 = D(j5, intFunction);
        D3.s(j5);
        for (int i3 = 0; i3 < j3 && spliterator.p(new C0457q(28)); i3++) {
        }
        if (j4 == h02.count()) {
            spliterator.b(D3);
        } else {
            for (int i4 = 0; i4 < j5 && spliterator.p(D3); i4++) {
            }
        }
        D3.r();
        return D3.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static J0 I(EnumC0381a3 enumC0381a3, H0 h02, H0 h03) {
        int i3 = I0.f6938a[enumC0381a3.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException("Unknown shape " + enumC0381a3);
                    }
                    return new J0((B0) h02, (B0) h03);
                }
                return new J0((F0) h02, (F0) h03);
            }
            return new J0((D0) h02, (D0) h03);
        }
        return new J0(h02, h03);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.b, j$.util.stream.c0] */
    public static InterfaceC0388c0 S(j$.util.D d3) {
        return new AbstractC0382b(d3, Z2.q(d3), false);
    }

    public static C0472t0 a0(j$.util.function.B b3, EnumC0467s0 enumC0467s0) {
        Objects.requireNonNull(b3);
        Objects.requireNonNull(enumC0467s0);
        return new C0472t0(EnumC0381a3.LONG_VALUE, enumC0467s0, new C0438m0(0, enumC0467s0, b3));
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static C0472t0 W(C0355j c0355j, EnumC0467s0 enumC0467s0) {
        Objects.requireNonNull(c0355j);
        Objects.requireNonNull(enumC0467s0);
        return new C0472t0(EnumC0381a3.DOUBLE_VALUE, enumC0467s0, new C0438m0(2, enumC0467s0, c0355j));
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.stream.z0, j$.util.stream.W2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.z0, j$.util.stream.K0] */
    public static InterfaceC0502z0 D(long j3, IntFunction intFunction) {
        if (j3 >= 0 && j3 < 2147483639) {
            return new K0(j3, intFunction);
        }
        return new W2();
    }

    public static void a() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void f(InterfaceC0430k2 interfaceC0430k2, Integer num) {
        if (I3.f6943a) {
            I3.a(interfaceC0430k2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        } else {
            interfaceC0430k2.e(num.intValue());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.l0, j$.util.stream.b] */
    public static InterfaceC0433l0 U(j$.util.F f3) {
        return new AbstractC0382b(f3, Z2.q(f3), false);
    }

    public static void i(InterfaceC0435l2 interfaceC0435l2, Long l3) {
        if (I3.f6943a) {
            I3.a(interfaceC0435l2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        } else {
            interfaceC0435l2.f(l3.longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.stream.x0, j$.util.stream.V2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.x0, j$.util.stream.c1] */
    public static InterfaceC0492x0 R(long j3) {
        if (j3 < 0 || j3 >= 2147483639) {
            return new V2();
        }
        return new C0389c1(j3);
    }

    public static void d(InterfaceC0425j2 interfaceC0425j2, Double d3) {
        if (I3.f6943a) {
            I3.a(interfaceC0425j2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        } else {
            interfaceC0425j2.d(d3.doubleValue());
        }
    }

    public static InterfaceC0388c0 X(AbstractC0382b abstractC0382b, long j3, long j4) {
        if (j3 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j3);
        }
        return new C0460q2(abstractC0382b, M(j4), j3, j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.stream.y0, j$.util.stream.V2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.y0, j$.util.stream.l1] */
    public static InterfaceC0497y0 T(long j3) {
        if (j3 < 0 || j3 >= 2147483639) {
            return new V2();
        }
        return new C0434l1(j3);
    }

    public static Object[] m(G0 g02, IntFunction intFunction) {
        if (I3.f6943a) {
            I3.a(g02.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        } else if (g02.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            Object[] objArr = (Object[]) intFunction.j((int) g02.count());
            g02.m(objArr, 0);
            return objArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.b, j$.util.stream.C] */
    public static C K(j$.util.B b3) {
        return new AbstractC0382b(b3, Z2.q(b3), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.stream.w0, j$.util.stream.V2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.util.stream.w0, j$.util.stream.T0] */
    public static InterfaceC0487w0 J(long j3) {
        if (j3 < 0 || j3 >= 2147483639) {
            return new V2();
        }
        return new T0(j3);
    }

    public static H0 E(AbstractC0382b abstractC0382b, Spliterator spliterator, boolean z3, IntFunction intFunction) {
        long K3 = abstractC0382b.K(spliterator);
        if (K3 < 0 || !spliterator.hasCharacteristics(16384)) {
            H0 h02 = (H0) new N0(abstractC0382b, spliterator, new C0377a(1, intFunction), new C0447o(14)).invoke();
            return z3 ? N(h02, intFunction) : h02;
        } else if (K3 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            Object[] objArr = (Object[]) intFunction.j((int) K3);
            new C0463r1(spliterator, abstractC0382b, objArr).invoke();
            return new K0(objArr);
        }
    }

    public static void r(D0 d02, Consumer consumer) {
        if (consumer instanceof InterfaceC0362q) {
            d02.j((InterfaceC0362q) consumer);
        } else if (I3.f6943a) {
            I3.a(d02.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
            throw null;
        } else {
            ((j$.util.D) d02.spliterator()).b(consumer);
        }
    }

    public static InterfaceC0433l0 Z(AbstractC0382b abstractC0382b, long j3, long j4) {
        if (j3 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j3);
        }
        return new C0469s2(abstractC0382b, M(j4), j3, j4);
    }

    public static void o(D0 d02, Integer[] numArr, int i3) {
        if (I3.f6943a) {
            I3.a(d02.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) d02.i();
        for (int i4 = 0; i4 < iArr.length; i4++) {
            numArr[i3 + i4] = Integer.valueOf(iArr[i4]);
        }
    }

    public static D0 u(D0 d02, long j3, long j4) {
        if (j3 == 0 && j4 == d02.count()) {
            return d02;
        }
        long j5 = j4 - j3;
        j$.util.D d3 = (j$.util.D) d02.spliterator();
        InterfaceC0492x0 R3 = R(j5);
        R3.s(j5);
        for (int i3 = 0; i3 < j3 && d3.c(new C0(0)); i3++) {
        }
        if (j4 == d02.count()) {
            d3.g(R3);
        } else {
            for (int i4 = 0; i4 < j5 && d3.c(R3); i4++) {
            }
        }
        R3.r();
        return R3.a();
    }

    public static D0 G(AbstractC0382b abstractC0382b, Spliterator spliterator, boolean z3) {
        long K3 = abstractC0382b.K(spliterator);
        if (K3 < 0 || !spliterator.hasCharacteristics(16384)) {
            D0 d02 = (D0) new N0(abstractC0382b, spliterator, new C0447o(10), new C0447o(11)).invoke();
            return z3 ? P(d02) : d02;
        } else if (K3 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            int[] iArr = new int[(int) K3];
            new C0454p1(spliterator, abstractC0382b, iArr).invoke();
            return new C0389c1(iArr);
        }
    }

    public static F0 H(AbstractC0382b abstractC0382b, Spliterator spliterator, boolean z3) {
        long K3 = abstractC0382b.K(spliterator);
        if (K3 < 0 || !spliterator.hasCharacteristics(16384)) {
            F0 f02 = (F0) new N0(abstractC0382b, spliterator, new C0447o(12), new C0447o(13)).invoke();
            return z3 ? Q(f02) : f02;
        } else if (K3 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            long[] jArr = new long[(int) K3];
            new C0459q1(spliterator, abstractC0382b, jArr).invoke();
            return new C0434l1(jArr);
        }
    }

    public static void s(F0 f02, Consumer consumer) {
        if (consumer instanceof j$.util.function.y) {
            f02.j((j$.util.function.y) consumer);
        } else if (I3.f6943a) {
            I3.a(f02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        } else {
            ((j$.util.F) f02.spliterator()).b(consumer);
        }
    }

    public static void p(F0 f02, Long[] lArr, int i3) {
        if (I3.f6943a) {
            I3.a(f02.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) f02.i();
        for (int i4 = 0; i4 < jArr.length; i4++) {
            lArr[i3 + i4] = Long.valueOf(jArr[i4]);
        }
    }

    public static F0 v(F0 f02, long j3, long j4) {
        if (j3 == 0 && j4 == f02.count()) {
            return f02;
        }
        long j5 = j4 - j3;
        j$.util.F f3 = (j$.util.F) f02.spliterator();
        InterfaceC0497y0 T3 = T(j5);
        T3.s(j5);
        for (int i3 = 0; i3 < j3 && f3.j(new E0(0)); i3++) {
        }
        if (j4 == f02.count()) {
            f3.i(T3);
        } else {
            for (int i4 = 0; i4 < j5 && f3.j(T3); i4++) {
            }
        }
        T3.r();
        return T3.a();
    }

    public static B0 F(AbstractC0382b abstractC0382b, Spliterator spliterator, boolean z3) {
        long K3 = abstractC0382b.K(spliterator);
        if (K3 < 0 || !spliterator.hasCharacteristics(16384)) {
            B0 b02 = (B0) new N0(abstractC0382b, spliterator, new C0447o(8), new C0447o(9)).invoke();
            return z3 ? O(b02) : b02;
        } else if (K3 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            double[] dArr = new double[(int) K3];
            new C0449o1(spliterator, abstractC0382b, dArr).invoke();
            return new T0(dArr);
        }
    }

    public static C V(AbstractC0382b abstractC0382b, long j3, long j4) {
        if (j3 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j3);
        }
        return new C0479u2(abstractC0382b, M(j4), j3, j4);
    }

    public static H0 N(H0 h02, IntFunction intFunction) {
        if (h02.o() > 0) {
            long count = h02.count();
            if (count >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            Object[] objArr = (Object[]) intFunction.j((int) count);
            new C0483v1(h02, objArr, 1).invoke();
            return new K0(objArr);
        }
        return h02;
    }

    public static void q(B0 b02, Consumer consumer) {
        if (consumer instanceof InterfaceC0352g) {
            b02.j((InterfaceC0352g) consumer);
        } else if (I3.f6943a) {
            I3.a(b02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        } else {
            ((j$.util.B) b02.spliterator()).b(consumer);
        }
    }

    public static D0 P(D0 d02) {
        if (d02.o() > 0) {
            long count = d02.count();
            if (count >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            int[] iArr = new int[(int) count];
            new C0483v1(d02, iArr, 0).invoke();
            return new C0389c1(iArr);
        }
        return d02;
    }

    public static void n(B0 b02, Double[] dArr, int i3) {
        if (I3.f6943a) {
            I3.a(b02.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) b02.i();
        for (int i4 = 0; i4 < dArr2.length; i4++) {
            dArr[i3 + i4] = Double.valueOf(dArr2[i4]);
        }
    }

    public static B0 t(B0 b02, long j3, long j4) {
        if (j3 == 0 && j4 == b02.count()) {
            return b02;
        }
        long j5 = j4 - j3;
        j$.util.B b3 = (j$.util.B) b02.spliterator();
        InterfaceC0487w0 J3 = J(j5);
        J3.s(j5);
        for (int i3 = 0; i3 < j3 && b3.m(new A0(0)); i3++) {
        }
        if (j4 == b02.count()) {
            b3.o(J3);
        } else {
            for (int i4 = 0; i4 < j5 && b3.m(J3); i4++) {
            }
        }
        J3.r();
        return J3.a();
    }

    public static F0 Q(F0 f02) {
        if (f02.o() > 0) {
            long count = f02.count();
            if (count >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            long[] jArr = new long[(int) count];
            new C0483v1(f02, jArr, 0).invoke();
            return new C0434l1(jArr);
        }
        return f02;
    }

    private static int M(long j3) {
        return (j3 != -1 ? Z2.f7085u : 0) | Z2.f7084t;
    }

    public static B0 O(B0 b02) {
        if (b02.o() > 0) {
            long count = b02.count();
            if (count >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            double[] dArr = new double[(int) count];
            new C0483v1(b02, dArr, 0).invoke();
            return new T0(dArr);
        }
        return b02;
    }

    @Override // j$.util.stream.F3
    public Object b(AbstractC0382b abstractC0382b, Spliterator spliterator) {
        Q1 d02 = d0();
        abstractC0382b.E(spliterator, abstractC0382b.a0(d02));
        return d02.get();
    }

    @Override // j$.util.stream.F3
    public Object c(AbstractC0382b abstractC0382b, Spliterator spliterator) {
        return ((Q1) new X1(this, abstractC0382b, spliterator).invoke()).get();
    }
}
