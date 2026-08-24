package j$.util.stream;

import j$.util.Spliterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.q1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0459q1 extends AbstractC0468s1 implements InterfaceC0435l2 {

    /* renamed from: h  reason: collision with root package name */
    private final long[] f7233h;

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        n((Long) obj);
    }

    @Override // j$.util.stream.InterfaceC0435l2
    public final /* synthetic */ void n(Long l3) {
        AbstractC0482v0.i(this, l3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0459q1(Spliterator spliterator, AbstractC0382b abstractC0382b, long[] jArr) {
        super(spliterator, abstractC0382b, jArr.length);
        this.f7233h = jArr;
    }

    C0459q1(C0459q1 c0459q1, Spliterator spliterator, long j3, long j4) {
        super(c0459q1, spliterator, j3, j4, c0459q1.f7233h.length);
        this.f7233h = c0459q1.f7233h;
    }

    @Override // j$.util.stream.AbstractC0468s1
    final AbstractC0468s1 b(Spliterator spliterator, long j3, long j4) {
        return new C0459q1(this, spliterator, j3, j4);
    }

    @Override // j$.util.stream.AbstractC0468s1, j$.util.stream.InterfaceC0440m2
    public final void f(long j3) {
        int i3 = this.f7254f;
        if (i3 >= this.f7255g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f7254f));
        }
        long[] jArr = this.f7233h;
        this.f7254f = i3 + 1;
        jArr[i3] = j3;
    }
}
