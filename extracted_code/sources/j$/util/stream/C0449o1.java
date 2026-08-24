package j$.util.stream;

import j$.util.Spliterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.o1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0449o1 extends AbstractC0468s1 implements InterfaceC0425j2 {

    /* renamed from: h  reason: collision with root package name */
    private final double[] f7219h;

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        w((Double) obj);
    }

    @Override // j$.util.stream.InterfaceC0425j2
    public final /* synthetic */ void w(Double d3) {
        AbstractC0482v0.d(this, d3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0449o1(Spliterator spliterator, AbstractC0382b abstractC0382b, double[] dArr) {
        super(spliterator, abstractC0382b, dArr.length);
        this.f7219h = dArr;
    }

    C0449o1(C0449o1 c0449o1, Spliterator spliterator, long j3, long j4) {
        super(c0449o1, spliterator, j3, j4, c0449o1.f7219h.length);
        this.f7219h = c0449o1.f7219h;
    }

    @Override // j$.util.stream.AbstractC0468s1
    final AbstractC0468s1 b(Spliterator spliterator, long j3, long j4) {
        return new C0449o1(this, spliterator, j3, j4);
    }

    @Override // j$.util.stream.AbstractC0468s1, j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final void d(double d3) {
        int i3 = this.f7254f;
        if (i3 >= this.f7255g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f7254f));
        }
        double[] dArr = this.f7219h;
        this.f7254f = i3 + 1;
        dArr[i3] = d3;
    }
}
