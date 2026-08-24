package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.InterfaceC0362q;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.c1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0389c1 implements D0 {

    /* renamed from: a  reason: collision with root package name */
    final int[] f7131a;

    /* renamed from: b  reason: collision with root package name */
    int f7132b;

    @Override // j$.util.stream.H0
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0482v0.r(this, consumer);
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
        return AbstractC0482v0.u(this, j3, j4);
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
        AbstractC0482v0.o(this, (Integer[]) objArr, i3);
    }

    @Override // j$.util.stream.G0
    public final void j(Object obj) {
        InterfaceC0362q interfaceC0362q = (InterfaceC0362q) obj;
        for (int i3 = 0; i3 < this.f7132b; i3++) {
            interfaceC0362q.e(this.f7131a[i3]);
        }
    }

    @Override // j$.util.stream.G0
    public final void u(int i3, Object obj) {
        int i4 = this.f7132b;
        System.arraycopy(this.f7131a, 0, (int[]) obj, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0389c1(long j3) {
        if (j3 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f7131a = new int[(int) j3];
        this.f7132b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0389c1(int[] iArr) {
        this.f7131a = iArr;
        this.f7132b = iArr.length;
    }

    @Override // j$.util.stream.G0, j$.util.stream.H0
    public final j$.util.H spliterator() {
        return j$.util.W.k(this.f7131a, 0, this.f7132b);
    }

    @Override // j$.util.stream.H0
    public final Spliterator spliterator() {
        return j$.util.W.k(this.f7131a, 0, this.f7132b);
    }

    @Override // j$.util.stream.G0
    public final Object i() {
        int[] iArr = this.f7131a;
        int length = iArr.length;
        int i3 = this.f7132b;
        return length == i3 ? iArr : Arrays.copyOf(iArr, i3);
    }

    @Override // j$.util.stream.H0
    public final long count() {
        return this.f7132b;
    }

    public String toString() {
        int[] iArr = this.f7131a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.f7132b), Arrays.toString(iArr));
    }
}
