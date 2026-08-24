package j$.util;

import j$.util.function.InterfaceC0362q;
/* renamed from: j$.util.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0370l implements j$.util.function.y, InterfaceC0362q {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    @Override // j$.util.function.InterfaceC0362q
    public final void e(int i3) {
        f(i3);
    }

    @Override // j$.util.function.y
    public final void f(long j3) {
        this.count++;
        this.sum += j3;
        this.min = Math.min(this.min, j3);
        this.max = Math.max(this.max, j3);
    }

    public final void b(C0370l c0370l) {
        this.count += c0370l.count;
        this.sum += c0370l.sum;
        this.min = Math.min(this.min, c0370l.min);
        this.max = Math.max(this.max, c0370l.max);
    }

    public final String toString() {
        String simpleName = C0370l.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        Long valueOf2 = Long.valueOf(this.sum);
        Long valueOf3 = Long.valueOf(this.min);
        long j3 = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(j3 > 0 ? this.sum / j3 : 0.0d), Long.valueOf(this.max));
    }
}
