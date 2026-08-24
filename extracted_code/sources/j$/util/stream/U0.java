package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class U0 extends T0 implements InterfaceC0487w0 {
    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        w((Double) obj);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void e(int i3) {
        AbstractC0482v0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ void f(long j3) {
        AbstractC0482v0.l();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer h(Consumer consumer) {
        return j$.com.android.tools.r8.a.a(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0425j2
    public final /* synthetic */ void w(Double d3) {
        AbstractC0482v0.d(this, d3);
    }

    @Override // j$.util.stream.InterfaceC0502z0
    public final /* bridge */ /* synthetic */ H0 a() {
        a();
        return this;
    }

    @Override // j$.util.stream.InterfaceC0487w0, j$.util.stream.InterfaceC0502z0
    public final B0 a() {
        int i3 = this.f7035b;
        double[] dArr = this.f7034a;
        if (i3 >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f7035b), Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        double[] dArr = this.f7034a;
        if (j3 != dArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j3), Integer.valueOf(dArr.length)));
        }
        this.f7035b = 0;
    }

    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final void d(double d3) {
        int i3 = this.f7035b;
        double[] dArr = this.f7034a;
        if (i3 < dArr.length) {
            this.f7035b = 1 + i3;
            dArr[i3] = d3;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(dArr.length)));
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void r() {
        int i3 = this.f7035b;
        double[] dArr = this.f7034a;
        if (i3 < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f7035b), Integer.valueOf(dArr.length)));
        }
    }

    @Override // j$.util.stream.T0
    public final String toString() {
        double[] dArr = this.f7034a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(dArr.length - this.f7035b), Arrays.toString(dArr));
    }
}
