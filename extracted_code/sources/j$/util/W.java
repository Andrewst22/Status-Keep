package j$.util;

import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes2.dex */
public abstract class W {

    /* renamed from: a  reason: collision with root package name */
    private static final Spliterator f6734a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final D f6735b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final F f6736c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final B f6737d = new Object();

    public static Spliterator e() {
        return f6734a;
    }

    public static D c() {
        return f6735b;
    }

    public static F d() {
        return f6736c;
    }

    public static B b() {
        return f6737d;
    }

    public static Spliterator m(Object[] objArr, int i3, int i4) {
        Objects.requireNonNull(objArr);
        a(objArr.length, i3, i4);
        return new M(objArr, i3, i4, 1040);
    }

    public static D k(int[] iArr, int i3, int i4) {
        Objects.requireNonNull(iArr);
        a(iArr.length, i3, i4);
        return new T(iArr, i3, i4, 1040);
    }

    public static F l(long[] jArr, int i3, int i4) {
        Objects.requireNonNull(jArr);
        a(jArr.length, i3, i4);
        return new V(jArr, i3, i4, 1040);
    }

    public static B j(double[] dArr, int i3, int i4) {
        Objects.requireNonNull(dArr);
        a(dArr.length, i3, i4);
        return new N(dArr, i3, i4, 1040);
    }

    private static void a(int i3, int i4, int i5) {
        if (i4 <= i5) {
            if (i4 < 0) {
                throw new ArrayIndexOutOfBoundsException(i4);
            }
            if (i5 > i3) {
                throw new ArrayIndexOutOfBoundsException(i5);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i4 + ") > fence(" + i5 + ")");
    }

    public static Iterator i(Spliterator spliterator) {
        Objects.requireNonNull(spliterator);
        return new I(spliterator);
    }

    public static InterfaceC0508v g(D d3) {
        Objects.requireNonNull(d3);
        return new J(d3);
    }

    public static InterfaceC0511y h(F f3) {
        Objects.requireNonNull(f3);
        return new K(f3);
    }

    public static InterfaceC0376s f(B b3) {
        Objects.requireNonNull(b3);
        return new L(b3);
    }
}
