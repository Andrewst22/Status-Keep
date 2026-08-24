package j$.util.stream;

import j$.util.function.IntFunction;
/* loaded from: classes2.dex */
abstract class R0 extends J0 implements G0 {
    @Override // j$.util.stream.H0
    public final /* synthetic */ Object[] p(IntFunction intFunction) {
        return AbstractC0482v0.m(this, intFunction);
    }

    @Override // j$.util.stream.G0
    public final void j(Object obj) {
        ((G0) this.f6946a).j(obj);
        ((G0) this.f6947b).j(obj);
    }

    @Override // j$.util.stream.G0
    public final void u(int i3, Object obj) {
        H0 h02 = this.f6946a;
        ((G0) h02).u(i3, obj);
        ((G0) this.f6947b).u(i3 + ((int) ((G0) h02).count()), obj);
    }

    @Override // j$.util.stream.G0
    public final Object i() {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object g3 = g((int) count);
        u(0, g3);
        return g3;
    }

    public final String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f6946a, this.f6947b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }
}
