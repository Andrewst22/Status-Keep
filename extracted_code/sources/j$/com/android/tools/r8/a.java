package j$.com.android.tools.r8;

import j$.util.concurrent.t;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;
/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ long d(long j3, long j4) {
        long j5 = j3 / j4;
        return (j3 - (j4 * j5) != 0 && (((j3 ^ j4) >> 63) | 1) < 0) ? j5 - 1 : j5;
    }

    public static /* synthetic */ List e(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ boolean f(Unsafe unsafe, Object obj, long j3, Object obj2) {
        while (!unsafe.compareAndSwapObject(obj, j3, (Object) null, obj2)) {
            if (unsafe.getObject(obj, j3) != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ long g(long j3, long j4) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j4) + Long.numberOfLeadingZeros(j4) + Long.numberOfLeadingZeros(~j3) + Long.numberOfLeadingZeros(j3);
        if (numberOfLeadingZeros > 65) {
            return j3 * j4;
        }
        if (numberOfLeadingZeros >= 64) {
            int i3 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if ((i3 >= 0) | (j4 != Long.MIN_VALUE)) {
                long j5 = j3 * j4;
                if (i3 == 0 || j5 / j3 == j4) {
                    return j5;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long h(long j3, long j4) {
        long j5 = j3 + j4;
        if (((j4 ^ j3) < 0) || ((j3 ^ j5) >= 0)) {
            return j5;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long i(long j3, long j4) {
        long j5 = j3 % j4;
        if (j5 == 0) {
            return 0L;
        }
        return (((j3 ^ j4) >> 63) | 1) > 0 ? j5 : j5 + j4;
    }

    public static /* synthetic */ long j(long j3, long j4) {
        long j5 = j3 - j4;
        if (((j4 ^ j3) >= 0) || ((j3 ^ j5) >= 0)) {
            return j5;
        }
        throw new ArithmeticException();
    }

    public static t a(Consumer consumer, Consumer consumer2) {
        Objects.requireNonNull(consumer2);
        return new t(consumer, consumer2);
    }

    public static int b(int i3, int i4) {
        if (i3 < i4) {
            return -1;
        }
        return i3 == i4 ? 0 : 1;
    }

    public static int c(long j3, long j4) {
        int i3 = (j3 > j4 ? 1 : (j3 == j4 ? 0 : -1));
        if (i3 < 0) {
            return -1;
        }
        return i3 == 0 ? 0 : 1;
    }
}
