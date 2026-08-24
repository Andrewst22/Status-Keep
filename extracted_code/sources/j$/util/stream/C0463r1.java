package j$.util.stream;

import j$.util.Spliterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.r1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0463r1 extends AbstractC0468s1 {

    /* renamed from: h  reason: collision with root package name */
    private final Object[] f7240h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0463r1(Spliterator spliterator, AbstractC0382b abstractC0382b, Object[] objArr) {
        super(spliterator, abstractC0382b, objArr.length);
        this.f7240h = objArr;
    }

    C0463r1(C0463r1 c0463r1, Spliterator spliterator, long j3, long j4) {
        super(c0463r1, spliterator, j3, j4, c0463r1.f7240h.length);
        this.f7240h = c0463r1.f7240h;
    }

    @Override // j$.util.stream.AbstractC0468s1
    final AbstractC0468s1 b(Spliterator spliterator, long j3, long j4) {
        return new C0463r1(this, spliterator, j3, j4);
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        int i3 = this.f7254f;
        if (i3 >= this.f7255g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f7254f));
        }
        Object[] objArr = this.f7240h;
        this.f7254f = i3 + 1;
        objArr[i3] = obj;
    }
}
