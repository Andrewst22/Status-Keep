package j$.util.stream;

import j$.util.Spliterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.p1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0454p1 extends AbstractC0468s1 implements InterfaceC0430k2 {

    /* renamed from: h  reason: collision with root package name */
    private final int[] f7226h;

    @Override // j$.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        t((Integer) obj);
    }

    @Override // j$.util.stream.InterfaceC0430k2
    public final /* synthetic */ void t(Integer num) {
        AbstractC0482v0.f(this, num);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0454p1(Spliterator spliterator, AbstractC0382b abstractC0382b, int[] iArr) {
        super(spliterator, abstractC0382b, iArr.length);
        this.f7226h = iArr;
    }

    C0454p1(C0454p1 c0454p1, Spliterator spliterator, long j3, long j4) {
        super(c0454p1, spliterator, j3, j4, c0454p1.f7226h.length);
        this.f7226h = c0454p1.f7226h;
    }

    @Override // j$.util.stream.AbstractC0468s1
    final AbstractC0468s1 b(Spliterator spliterator, long j3, long j4) {
        return new C0454p1(this, spliterator, j3, j4);
    }

    @Override // j$.util.stream.AbstractC0468s1, j$.util.stream.InterfaceC0440m2
    public final void e(int i3) {
        int i4 = this.f7254f;
        if (i4 >= this.f7255g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f7254f));
        }
        int[] iArr = this.f7226h;
        this.f7254f = i4 + 1;
        iArr[i4] = i3;
    }
}
