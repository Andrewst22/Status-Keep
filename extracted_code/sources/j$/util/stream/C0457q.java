package j$.util.stream;

import j$.util.C0368j;
import j$.util.C0370l;
import j$.util.C0371m;
import j$.util.C0372n;
import j$.util.C0373o;
import j$.util.C0374p;
import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0360o;
import j$.util.function.Predicate;
/* renamed from: j$.util.stream.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0457q implements j$.util.function.M, Predicate, IntFunction, j$.util.function.Q, InterfaceC0360o, j$.util.function.I, BiConsumer, j$.util.function.K, j$.util.function.w, j$.util.function.T, j$.util.function.A, Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7230a;

    public /* synthetic */ C0457q(int i3) {
        this.f7230a = i3;
    }

    @Override // j$.util.function.Consumer
    public void accept(Object obj) {
    }

    @Override // j$.util.function.InterfaceC0360o
    public int b(int i3, int i4) {
        switch (this.f7230a) {
            case 9:
                return Math.min(i3, i4);
            case 12:
                return i3 + i4;
            default:
                return Math.max(i3, i4);
        }
    }

    @Override // j$.util.function.w
    public long c(long j3, long j4) {
        switch (this.f7230a) {
            case 18:
                return Math.min(j3, j4);
            case 26:
                return Math.max(j3, j4);
            default:
                return j3 + j4;
        }
    }

    @Override // j$.util.function.Predicate
    public boolean g(Object obj) {
        switch (this.f7230a) {
            case 1:
                return ((C0372n) obj).c();
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C0373o) obj).c();
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                return ((C0374p) obj).c();
            default:
                return ((C0371m) obj).c();
        }
    }

    @Override // j$.util.function.Consumer
    public /* synthetic */ Consumer h(Consumer consumer) {
        return j$.com.android.tools.r8.a.a(this, consumer);
    }

    @Override // j$.util.function.A
    public Object o(long j3) {
        return Long.valueOf(j3);
    }

    @Override // j$.util.function.IntFunction
    public Object j(int i3) {
        switch (this.f7230a) {
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return new Object[i3];
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new Integer[i3];
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                return Integer.valueOf(i3);
            case 21:
                return new Long[i3];
            default:
                return new Object[i3];
        }
    }

    @Override // j$.util.function.T
    public long q(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // j$.util.function.Q
    public int p(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // j$.util.function.M
    public Object get() {
        switch (this.f7230a) {
            case 0:
                return new double[3];
            case 14:
                return new long[2];
            default:
                return new long[2];
        }
    }

    @Override // j$.util.function.K
    public void i(Object obj, long j3) {
        switch (this.f7230a) {
            case 17:
                ((C0370l) obj).f(j3);
                return;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j3;
                return;
        }
    }

    @Override // j$.util.function.BiConsumer
    public void u(Object obj, Object obj2) {
        switch (this.f7230a) {
            case 11:
                ((C0368j) obj).b((C0368j) obj2);
                return;
            case 16:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                return;
            case 20:
                ((C0370l) obj).b((C0370l) obj2);
                return;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                return;
        }
    }

    @Override // j$.util.function.I
    public void m(int i3, Object obj) {
        switch (this.f7230a) {
            case 10:
                ((C0368j) obj).e(i3);
                return;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + i3;
                return;
        }
    }
}
