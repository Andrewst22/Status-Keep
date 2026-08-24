package j$.util.stream;
/* renamed from: j$.util.stream.e3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0401e3 extends AbstractC0406f3 implements j$.util.function.y {

    /* renamed from: c  reason: collision with root package name */
    final long[] f7156c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0401e3(int i3) {
        this.f7156c = new long[i3];
    }

    @Override // j$.util.stream.AbstractC0406f3
    public final void b(Object obj, long j3) {
        j$.util.function.y yVar = (j$.util.function.y) obj;
        for (int i3 = 0; i3 < j3; i3++) {
            yVar.f(this.f7156c[i3]);
        }
    }

    @Override // j$.util.function.y
    public final void f(long j3) {
        int i3 = this.f7162b;
        this.f7162b = i3 + 1;
        this.f7156c[i3] = j3;
    }
}
