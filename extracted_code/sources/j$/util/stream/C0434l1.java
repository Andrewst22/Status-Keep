package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.l1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0434l1 implements F0 {

    /* renamed from: a  reason: collision with root package name */
    final long[] f7201a;

    /* renamed from: b  reason: collision with root package name */
    int f7202b;

    @Override // j$.util.stream.H0
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0482v0.s(this, consumer);
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
        return AbstractC0482v0.v(this, j3, j4);
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
        AbstractC0482v0.p(this, (Long[]) objArr, i3);
    }

    @Override // j$.util.stream.G0
    public final void j(Object obj) {
        j$.util.function.y yVar = (j$.util.function.y) obj;
        for (int i3 = 0; i3 < this.f7202b; i3++) {
            yVar.f(this.f7201a[i3]);
        }
    }

    @Override // j$.util.stream.G0
    public final void u(int i3, Object obj) {
        int i4 = this.f7202b;
        System.arraycopy(this.f7201a, 0, (long[]) obj, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0434l1(long j3) {
        if (j3 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f7201a = new long[(int) j3];
        this.f7202b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0434l1(long[] jArr) {
        this.f7201a = jArr;
        this.f7202b = jArr.length;
    }

    @Override // j$.util.stream.G0, j$.util.stream.H0
    public final j$.util.H spliterator() {
        return j$.util.W.l(this.f7201a, 0, this.f7202b);
    }

    @Override // j$.util.stream.H0
    public final Spliterator spliterator() {
        return j$.util.W.l(this.f7201a, 0, this.f7202b);
    }

    @Override // j$.util.stream.G0
    public final Object i() {
        long[] jArr = this.f7201a;
        int length = jArr.length;
        int i3 = this.f7202b;
        return length == i3 ? jArr : Arrays.copyOf(jArr, i3);
    }

    @Override // j$.util.stream.H0
    public final long count() {
        return this.f7202b;
    }

    public String toString() {
        long[] jArr = this.f7201a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.f7202b), Arrays.toString(jArr));
    }
}
