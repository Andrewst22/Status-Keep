package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class K0 implements H0 {

    /* renamed from: a  reason: collision with root package name */
    final Object[] f6956a;

    /* renamed from: b  reason: collision with root package name */
    int f6957b;

    @Override // j$.util.stream.H0
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ H0 q(long j3, long j4, IntFunction intFunction) {
        return AbstractC0482v0.w(this, j3, j4, intFunction);
    }

    @Override // j$.util.stream.H0
    public final H0 c(int i3) {
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public K0(long j3, IntFunction intFunction) {
        if (j3 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f6956a = (Object[]) intFunction.j((int) j3);
        this.f6957b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public K0(Object[] objArr) {
        this.f6956a = objArr;
        this.f6957b = objArr.length;
    }

    @Override // j$.util.stream.H0
    public final Spliterator spliterator() {
        return j$.util.W.m(this.f6956a, 0, this.f6957b);
    }

    @Override // j$.util.stream.H0
    public final void m(Object[] objArr, int i3) {
        System.arraycopy(this.f6956a, 0, objArr, i3, this.f6957b);
    }

    @Override // j$.util.stream.H0
    public final Object[] p(IntFunction intFunction) {
        Object[] objArr = this.f6956a;
        if (objArr.length == this.f6957b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.H0
    public final long count() {
        return this.f6957b;
    }

    @Override // j$.util.stream.H0
    public final void b(Consumer consumer) {
        for (int i3 = 0; i3 < this.f6957b; i3++) {
            consumer.accept(this.f6956a[i3]);
        }
    }

    public String toString() {
        Object[] objArr = this.f6956a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f6957b), Arrays.toString(objArr));
    }
}
