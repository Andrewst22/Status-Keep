package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0479u2 extends AbstractC0501z {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ long f7268m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ long f7269n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0479u2(AbstractC0382b abstractC0382b, int i3, long j3, long j4) {
        super(abstractC0382b, i3, 0);
        this.f7268m = j3;
        this.f7269n = j4;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.B3, j$.util.Spliterator] */
    @Override // j$.util.stream.AbstractC0382b
    final Spliterator T(AbstractC0382b abstractC0382b, Spliterator spliterator) {
        long j3;
        long j4;
        long K3 = abstractC0382b.K(spliterator);
        long j5 = this.f7269n;
        if (K3 > 0 && spliterator.hasCharacteristics(16384)) {
            long j6 = this.f7268m;
            return new AbstractC0470s3((j$.util.B) abstractC0382b.b0(spliterator), j6, AbstractC0482v0.B(j6, j5));
        }
        if (!Z2.ORDERED.r(abstractC0382b.O())) {
            j$.util.B b3 = (j$.util.B) abstractC0382b.b0(spliterator);
            long j7 = this.f7268m;
            if (j7 <= K3) {
                long j8 = K3 - j7;
                if (j5 >= 0) {
                    j8 = Math.min(j5, j8);
                }
                j3 = j8;
                j4 = 0;
            } else {
                j3 = j5;
                j4 = j7;
            }
            return new B3(b3, j4, j3);
        }
        return ((H0) new C0489w2(this, abstractC0382b, spliterator, new Y1(3), this.f7268m, this.f7269n).invoke()).spliterator();
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [j$.util.stream.B3, j$.util.Spliterator] */
    @Override // j$.util.stream.AbstractC0382b
    final H0 S(AbstractC0382b abstractC0382b, Spliterator spliterator, IntFunction intFunction) {
        long j3;
        long j4;
        long K3 = abstractC0382b.K(spliterator);
        if (K3 > 0 && spliterator.hasCharacteristics(16384)) {
            return AbstractC0482v0.F(abstractC0382b, AbstractC0482v0.C(abstractC0382b.N(), spliterator, this.f7268m, this.f7269n), true);
        }
        if (!Z2.ORDERED.r(abstractC0382b.O())) {
            j$.util.B b3 = (j$.util.B) abstractC0382b.b0(spliterator);
            long j5 = this.f7268m;
            long j6 = this.f7269n;
            if (j5 <= K3) {
                j3 = j6 >= 0 ? Math.min(j6, K3 - j5) : K3 - j5;
                j4 = 0;
            } else {
                j3 = j6;
                j4 = j5;
            }
            return AbstractC0482v0.F(this, new B3(b3, j4, j3), true);
        }
        return (H0) new C0489w2(this, abstractC0382b, spliterator, intFunction, this.f7268m, this.f7269n).invoke();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0382b
    public final InterfaceC0440m2 V(int i3, InterfaceC0440m2 interfaceC0440m2) {
        return new C0474t2(this, interfaceC0440m2);
    }
}
