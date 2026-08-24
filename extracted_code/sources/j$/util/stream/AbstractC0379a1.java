package j$.util.stream;

import j$.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.a1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0379a1 implements H0 {
    @Override // j$.util.stream.H0
    public final long count() {
        return 0L;
    }

    public final void j(Object obj) {
    }

    @Override // j$.util.stream.H0
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.H0
    public /* synthetic */ H0 q(long j3, long j4, IntFunction intFunction) {
        return AbstractC0482v0.w(this, j3, j4, intFunction);
    }

    @Override // j$.util.stream.H0
    public H0 c(int i3) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.H0
    public final Object[] p(IntFunction intFunction) {
        return (Object[]) intFunction.j(0);
    }

    public final void u(int i3, Object obj) {
    }
}
