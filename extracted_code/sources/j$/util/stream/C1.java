package j$.util.stream;

import j$.util.Spliterator;
/* loaded from: classes2.dex */
final class C1 extends AbstractC0482v0 {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f6899h;

    public /* synthetic */ C1(int i3) {
        this.f6899h = i3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, j$.util.stream.Q1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, j$.util.stream.Q1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, j$.util.stream.Q1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, j$.util.stream.Q1] */
    @Override // j$.util.stream.AbstractC0482v0
    public final Q1 d0() {
        switch (this.f6899h) {
            case 0:
                return new Object();
            case 1:
                return new Object();
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return new Object();
            default:
                return new Object();
        }
    }

    @Override // j$.util.stream.AbstractC0482v0, j$.util.stream.F3
    public final Object b(AbstractC0382b abstractC0382b, Spliterator spliterator) {
        switch (this.f6899h) {
            case 0:
                if (Z2.SIZED.r(abstractC0382b.O())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.b(abstractC0382b, spliterator);
            case 1:
                if (Z2.SIZED.r(abstractC0382b.O())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.b(abstractC0382b, spliterator);
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                if (Z2.SIZED.r(abstractC0382b.O())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.b(abstractC0382b, spliterator);
            default:
                if (Z2.SIZED.r(abstractC0382b.O())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.b(abstractC0382b, spliterator);
        }
    }

    @Override // j$.util.stream.AbstractC0482v0, j$.util.stream.F3
    public final Object c(AbstractC0382b abstractC0382b, Spliterator spliterator) {
        switch (this.f6899h) {
            case 0:
                if (Z2.SIZED.r(abstractC0382b.O())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.c(abstractC0382b, spliterator);
            case 1:
                if (Z2.SIZED.r(abstractC0382b.O())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.c(abstractC0382b, spliterator);
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                if (Z2.SIZED.r(abstractC0382b.O())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.c(abstractC0382b, spliterator);
            default:
                if (Z2.SIZED.r(abstractC0382b.O())) {
                    return Long.valueOf(spliterator.getExactSizeIfKnown());
                }
                return (Long) super.c(abstractC0382b, spliterator);
        }
    }

    @Override // j$.util.stream.AbstractC0482v0, j$.util.stream.F3
    public final int g() {
        switch (this.f6899h) {
            case 0:
                return Z2.f7082r;
            case 1:
                return Z2.f7082r;
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return Z2.f7082r;
            default:
                return Z2.f7082r;
        }
    }
}
