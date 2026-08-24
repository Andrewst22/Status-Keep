package j$.util;

import j$.util.function.InterfaceC0362q;
/* renamed from: j$.util.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0368j implements InterfaceC0362q {
    private long count;
    private long sum;
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    @Override // j$.util.function.InterfaceC0362q
    public final void e(int i3) {
        this.count++;
        this.sum += i3;
        this.min = Math.min(this.min, i3);
        this.max = Math.max(this.max, i3);
    }

    public final void b(C0368j c0368j) {
        this.count += c0368j.count;
        this.sum += c0368j.sum;
        this.min = Math.min(this.min, c0368j.min);
        this.max = Math.max(this.max, c0368j.max);
    }

    public final String toString() {
        String simpleName = C0368j.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        Long valueOf2 = Long.valueOf(this.sum);
        Integer valueOf3 = Integer.valueOf(this.min);
        long j3 = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(j3 > 0 ? this.sum / j3 : 0.0d), Integer.valueOf(this.max));
    }
}
