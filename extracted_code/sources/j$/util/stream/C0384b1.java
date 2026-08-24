package j$.util.stream;

import j$.util.function.Consumer;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.b1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0384b1 extends K0 implements InterfaceC0502z0 {
    @Override // j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final /* synthetic */ void d(double d3) {
        AbstractC0482v0.a();
        throw null;
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

    @Override // j$.util.stream.InterfaceC0502z0
    public final H0 a() {
        int i3 = this.f6957b;
        Object[] objArr = this.f6956a;
        if (i3 >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f6957b), Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        Object[] objArr = this.f6956a;
        if (j3 != objArr.length) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j3), Integer.valueOf(objArr.length)));
        }
        this.f6957b = 0;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i3 = this.f6957b;
        Object[] objArr = this.f6956a;
        if (i3 < objArr.length) {
            this.f6957b = 1 + i3;
            objArr[i3] = obj;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(objArr.length)));
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void r() {
        int i3 = this.f6957b;
        Object[] objArr = this.f6956a;
        if (i3 < objArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f6957b), Integer.valueOf(objArr.length)));
        }
    }

    @Override // j$.util.stream.K0
    public final String toString() {
        Object[] objArr = this.f6956a;
        return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(objArr.length - this.f6957b), Arrays.toString(objArr));
    }
}
