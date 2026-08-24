package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0352g;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class T0 implements B0 {

    /* renamed from: a  reason: collision with root package name */
    final double[] f7034a;

    /* renamed from: b  reason: collision with root package name */
    int f7035b;

    @Override // j$.util.stream.H0
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0482v0.q(this, consumer);
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ Object[] p(IntFunction intFunction) {
        return AbstractC0482v0.m(this, intFunction);
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ H0 q(long j3, long j4, IntFunction intFunction) {
        return AbstractC0482v0.t(this, j3, j4);
    }

    @Override // j$.util.stream.H0
    public final /* bridge */ /* synthetic */ H0 c(int i3) {
        c(i3);
        throw null;
    }

    @Override // j$.util.stream.G0, j$.util.stream.H0
    public final G0 c(int i3) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ void m(Object[] objArr, int i3) {
        AbstractC0482v0.n(this, (Double[]) objArr, i3);
    }

    @Override // j$.util.stream.G0
    public final void j(Object obj) {
        InterfaceC0352g interfaceC0352g = (InterfaceC0352g) obj;
        for (int i3 = 0; i3 < this.f7035b; i3++) {
            interfaceC0352g.d(this.f7034a[i3]);
        }
    }

    @Override // j$.util.stream.G0
    public final void u(int i3, Object obj) {
        int i4 = this.f7035b;
        System.arraycopy(this.f7034a, 0, (double[]) obj, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public T0(long j3) {
        if (j3 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f7034a = new double[(int) j3];
        this.f7035b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public T0(double[] dArr) {
        this.f7034a = dArr;
        this.f7035b = dArr.length;
    }

    @Override // j$.util.stream.G0, j$.util.stream.H0
    public final j$.util.H spliterator() {
        return j$.util.W.j(this.f7034a, 0, this.f7035b);
    }

    @Override // j$.util.stream.H0
    public final Spliterator spliterator() {
        return j$.util.W.j(this.f7034a, 0, this.f7035b);
    }

    @Override // j$.util.stream.G0
    public final Object i() {
        double[] dArr = this.f7034a;
        int length = dArr.length;
        int i3 = this.f7035b;
        return length == i3 ? dArr : Arrays.copyOf(dArr, i3);
    }

    @Override // j$.util.stream.H0
    public final long count() {
        return this.f7035b;
    }

    public String toString() {
        double[] dArr = this.f7034a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.f7035b), Arrays.toString(dArr));
    }
}
