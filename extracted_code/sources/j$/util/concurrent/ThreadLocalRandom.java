package j$.util.concurrent;

import j$.util.stream.AbstractC0482v0;
import j$.util.stream.B;
import j$.util.stream.C0383b0;
import j$.util.stream.C0428k0;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
/* loaded from: classes2.dex */
public class ThreadLocalRandom extends Random {
    private static final long serialVersionUID = -5851777807851030925L;

    /* renamed from: a  reason: collision with root package name */
    long f6765a;

    /* renamed from: b  reason: collision with root package name */
    int f6766b;

    /* renamed from: c  reason: collision with root package name */
    boolean f6767c;
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal f6761d = new ThreadLocal();

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicInteger f6762e = new AtomicInteger();

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadLocal f6763f = new ThreadLocal();

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicLong f6764g = new AtomicLong(h(System.currentTimeMillis()) ^ h(System.nanoTime()));

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ThreadLocalRandom(int i3) {
        this();
    }

    private static int g(long j3) {
        long j4 = (j3 ^ (j3 >>> 33)) * (-49064778989728563L);
        return (int) (((j4 ^ (j4 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    private static long h(long j3) {
        long j4 = (j3 ^ (j3 >>> 33)) * (-49064778989728563L);
        long j5 = (j4 ^ (j4 >>> 33)) * (-4265267296055464877L);
        return j5 ^ (j5 >>> 33);
    }

    private ThreadLocalRandom() {
        this.f6767c = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void f() {
        int addAndGet = f6762e.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long h3 = h(f6764g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f6763f.get();
        threadLocalRandom.f6765a = h3;
        threadLocalRandom.f6766b = addAndGet;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f6763f.get();
        if (threadLocalRandom.f6766b == 0) {
            f();
        }
        return threadLocalRandom;
    }

    @Override // java.util.Random
    public final void setSeed(long j3) {
        if (this.f6767c) {
            throw new UnsupportedOperationException();
        }
    }

    final long i() {
        long j3 = this.f6765a - 7046029254386353131L;
        this.f6765a = j3;
        return j3;
    }

    @Override // java.util.Random
    protected final int next(int i3) {
        return nextInt() >>> (32 - i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long e(long j3, long j4) {
        long h3 = h(i());
        if (j3 >= j4) {
            return h3;
        }
        long j5 = j4 - j3;
        long j6 = j5 - 1;
        if ((j5 & j6) == 0) {
            return (h3 & j6) + j3;
        }
        if (j5 > 0) {
            while (true) {
                long j7 = h3 >>> 1;
                long j8 = j7 + j6;
                long j9 = j7 % j5;
                if (j8 - j9 >= 0) {
                    return j9 + j3;
                }
                h3 = h(i());
            }
        } else {
            while (true) {
                if (h3 >= j3 && h3 < j4) {
                    return h3;
                }
                h3 = h(i());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(int i3, int i4) {
        int i5;
        int g3 = g(i());
        if (i3 < i4) {
            int i6 = i4 - i3;
            int i7 = i6 - 1;
            if ((i6 & i7) == 0) {
                i5 = g3 & i7;
            } else if (i6 > 0) {
                int i8 = g3 >>> 1;
                while (true) {
                    int i9 = i8 + i7;
                    i5 = i8 % i6;
                    if (i9 - i5 >= 0) {
                        break;
                    }
                    i8 = g(i()) >>> 1;
                }
            } else {
                while (true) {
                    if (g3 >= i3 && g3 < i4) {
                        return g3;
                    }
                    g3 = g(i());
                }
            }
            return i5 + i3;
        }
        return g3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final double c(double d3, double d4) {
        double nextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d3 < d4) {
            double d5 = ((d4 - d3) * nextLong) + d3;
            return d5 >= d4 ? Double.longBitsToDouble(Double.doubleToLongBits(d4) - 1) : d5;
        }
        return nextLong;
    }

    @Override // java.util.Random
    public final int nextInt() {
        return g(i());
    }

    @Override // java.util.Random
    public final int nextInt(int i3) {
        if (i3 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int g3 = g(i());
        int i4 = i3 - 1;
        if ((i3 & i4) == 0) {
            return g3 & i4;
        }
        while (true) {
            int i5 = g3 >>> 1;
            int i6 = i5 + i4;
            int i7 = i5 % i3;
            if (i6 - i7 >= 0) {
                return i7;
            }
            g3 = g(i());
        }
    }

    public final int nextInt(int i3, int i4) {
        if (i3 >= i4) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return d(i3, i4);
    }

    @Override // java.util.Random
    public final long nextLong() {
        return h(i());
    }

    public final long nextLong(long j3) {
        if (j3 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        long h3 = h(i());
        long j4 = j3 - 1;
        if ((j3 & j4) == 0) {
            return h3 & j4;
        }
        while (true) {
            long j5 = h3 >>> 1;
            long j6 = j5 + j4;
            long j7 = j5 % j3;
            if (j6 - j7 >= 0) {
                return j7;
            }
            h3 = h(i());
        }
    }

    public final long nextLong(long j3, long j4) {
        if (j3 >= j4) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return e(j3, j4);
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (h(i()) >>> 11) * 1.1102230246251565E-16d;
    }

    public final double nextDouble(double d3) {
        if (d3 <= 0.0d) {
            throw new IllegalArgumentException("bound must be positive");
        }
        double h3 = (h(i()) >>> 11) * 1.1102230246251565E-16d * d3;
        return h3 < d3 ? h3 : Double.longBitsToDouble(Double.doubleToLongBits(d3) - 1);
    }

    public final double nextDouble(double d3, double d4) {
        if (d3 >= d4) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return c(d3, d4);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return g(i()) < 0;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (g(i()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = f6761d;
        Double d3 = (Double) threadLocal.get();
        if (d3 != null) {
            threadLocal.set(null);
            return d3.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d4 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d4 < 1.0d && d4 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d4) * (-2.0d)) / d4);
                threadLocal.set(Double.valueOf(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    @Override // java.util.Random
    public final IntStream ints(long j3) {
        if (j3 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        return C0383b0.n(AbstractC0482v0.S(new z(0L, j3, Integer.MAX_VALUE, 0)));
    }

    @Override // java.util.Random
    public final IntStream ints() {
        return C0383b0.n(AbstractC0482v0.S(new z(0L, Long.MAX_VALUE, Integer.MAX_VALUE, 0)));
    }

    @Override // java.util.Random
    public final IntStream ints(long j3, int i3, int i4) {
        if (j3 >= 0) {
            if (i3 >= i4) {
                throw new IllegalArgumentException("bound must be greater than origin");
            }
            return C0383b0.n(AbstractC0482v0.S(new z(0L, j3, i3, i4)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final IntStream ints(int i3, int i4) {
        if (i3 >= i4) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return C0383b0.n(AbstractC0482v0.S(new z(0L, Long.MAX_VALUE, i3, i4)));
    }

    @Override // java.util.Random
    public final LongStream longs(long j3) {
        if (j3 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        return C0428k0.n(AbstractC0482v0.U(new A(0L, j3, Long.MAX_VALUE, 0L)));
    }

    @Override // java.util.Random
    public final LongStream longs() {
        return C0428k0.n(AbstractC0482v0.U(new A(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L)));
    }

    @Override // java.util.Random
    public final LongStream longs(long j3, long j4, long j5) {
        if (j3 >= 0) {
            if (j4 >= j5) {
                throw new IllegalArgumentException("bound must be greater than origin");
            }
            return C0428k0.n(AbstractC0482v0.U(new A(0L, j3, j4, j5)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final LongStream longs(long j3, long j4) {
        if (j3 >= j4) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return C0428k0.n(AbstractC0482v0.U(new A(0L, Long.MAX_VALUE, j3, j4)));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j3) {
        if (j3 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        return B.n(AbstractC0482v0.K(new y(0L, j3, Double.MAX_VALUE, 0.0d)));
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        return B.n(AbstractC0482v0.K(new y(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d)));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j3, double d3, double d4) {
        if (j3 >= 0) {
            if (d3 >= d4) {
                throw new IllegalArgumentException("bound must be greater than origin");
            }
            return B.n(AbstractC0482v0.K(new y(0L, j3, d3, d4)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d3, double d4) {
        if (d3 >= d4) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return B.n(AbstractC0482v0.K(new y(0L, Long.MAX_VALUE, d3, d4)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int b() {
        return ((ThreadLocalRandom) f6763f.get()).f6766b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int a(int i3) {
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >>> 17);
        int i6 = i5 ^ (i5 << 5);
        ((ThreadLocalRandom) f6763f.get()).f6766b = i6;
        return i6;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.security.PrivilegedAction] */
    static {
        if (((Boolean) AccessController.doPrivileged((PrivilegedAction<Object>) new Object())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j3 = seed[0] & 255;
            for (int i3 = 1; i3 < 8; i3++) {
                j3 = (j3 << 8) | (seed[i3] & 255);
            }
            f6764g.set(j3);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("rnd", this.f6765a);
        putFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    private Object readResolve() {
        return current();
    }
}
