package j$.util.stream;

import j$.util.C0367i;
import j$.util.C0368j;
import j$.util.C0370l;
import j$.util.function.BiConsumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0348c;
import j$.util.function.InterfaceC0350e;
import j$.util.function.InterfaceC0354i;
import java.util.LinkedHashSet;
/* renamed from: j$.util.stream.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0447o implements BiConsumer, j$.util.function.G, j$.util.function.M, j$.util.function.A, InterfaceC0348c, IntFunction, InterfaceC0350e, InterfaceC0354i, j$.util.function.O {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7216a;

    public /* synthetic */ C0447o(int i3) {
        this.f7216a = i3;
    }

    @Override // j$.util.function.InterfaceC0350e
    public double b(double d3, double d4) {
        switch (this.f7216a) {
            case 22:
                return Math.min(d3, d4);
            default:
                return Math.max(d3, d4);
        }
    }

    @Override // j$.util.function.InterfaceC0354i
    public Object e(double d3) {
        return Double.valueOf(d3);
    }

    @Override // j$.util.function.A
    public Object o(long j3) {
        switch (this.f7216a) {
            case N.k.BYTES_FIELD_NUMBER /* 8 */:
                return AbstractC0482v0.J(j3);
            case 9:
            default:
                return AbstractC0482v0.T(j3);
            case 10:
                return AbstractC0482v0.R(j3);
        }
    }

    @Override // j$.util.function.O
    public double d(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // j$.util.function.G
    public void a(Object obj, double d3) {
        switch (this.f7216a) {
            case 1:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                AbstractC0422j.a(dArr, d3);
                dArr[3] = dArr[3] + d3;
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
            default:
                ((C0367i) obj).d(d3);
                return;
            case N.k.INTEGER_FIELD_NUMBER /* 3 */:
                double[] dArr2 = (double[]) obj;
                AbstractC0422j.a(dArr2, d3);
                dArr2[2] = dArr2[2] + d3;
                return;
        }
    }

    @Override // j$.util.function.M
    public Object get() {
        switch (this.f7216a) {
            case N.k.LONG_FIELD_NUMBER /* 4 */:
                return new Object();
            case N.k.STRING_FIELD_NUMBER /* 5 */:
                return new Object();
            case N.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new Object();
            case N.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return new Object();
            case 16:
                return new C0367i();
            case 17:
                return new C0368j();
            case 18:
                return new C0370l();
            case 19:
                return new LinkedHashSet();
            default:
                return new double[4];
        }
    }

    @Override // j$.util.function.BiConsumer
    public void u(Object obj, Object obj2) {
        switch (this.f7216a) {
            case 0:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                AbstractC0422j.a(dArr, dArr2[0]);
                AbstractC0422j.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                return;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                AbstractC0422j.a(dArr3, dArr4[0]);
                AbstractC0422j.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                return;
            case 20:
                ((LinkedHashSet) obj).add(obj2);
                return;
            case 21:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                return;
            default:
                ((C0367i) obj).b((C0367i) obj2);
                return;
        }
    }

    @Override // j$.util.function.IntFunction
    public Object j(int i3) {
        switch (this.f7216a) {
            case 15:
                return new Object[i3];
            default:
                return new Double[i3];
        }
    }

    @Override // j$.util.function.BiFunction
    public Object c(Object obj, Object obj2) {
        switch (this.f7216a) {
            case 9:
                return new J0((B0) obj, (B0) obj2);
            case 10:
            case 12:
            default:
                return new J0((H0) obj, (H0) obj2);
            case 11:
                return new J0((D0) obj, (D0) obj2);
            case 13:
                return new J0((F0) obj, (F0) obj2);
        }
    }
}
