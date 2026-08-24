package j$.util.stream;

import j$.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.t1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0473t1 extends W2 implements H0, InterfaceC0502z0 {
    @Override // j$.util.stream.InterfaceC0502z0
    public final H0 a() {
        return this;
    }

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

    @Override // j$.util.stream.H0
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ H0 q(long j3, long j4, IntFunction intFunction) {
        return AbstractC0482v0.w(this, j3, j4, intFunction);
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void r() {
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // j$.util.stream.H0
    public final H0 c(int i3) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.H0
    public final void m(Object[] objArr, int i3) {
        long j3 = i3;
        long count = count() + j3;
        if (count > objArr.length || count < j3) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f7139c == 0) {
            System.arraycopy(this.f7054e, 0, objArr, i3, this.f7138b);
            return;
        }
        for (int i4 = 0; i4 < this.f7139c; i4++) {
            Object[] objArr2 = this.f7055f[i4];
            System.arraycopy(objArr2, 0, objArr, i3, objArr2.length);
            i3 += this.f7055f[i4].length;
        }
        int i5 = this.f7138b;
        if (i5 > 0) {
            System.arraycopy(this.f7054e, 0, objArr, i3, i5);
        }
    }

    @Override // j$.util.stream.H0
    public final Object[] p(IntFunction intFunction) {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.j((int) count);
        m(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        clear();
        x(j3);
    }
}
