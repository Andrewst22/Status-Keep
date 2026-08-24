package j$.util;

import j$.util.function.InterfaceC0352g;
/* renamed from: j$.util.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0367i implements InterfaceC0352g {

    /* renamed from: a  reason: collision with root package name */
    private double f6865a;

    /* renamed from: b  reason: collision with root package name */
    private double f6866b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    @Override // j$.util.function.InterfaceC0352g
    public final void d(double d3) {
        this.count++;
        this.f6866b += d3;
        c(d3);
        this.min = Math.min(this.min, d3);
        this.max = Math.max(this.max, d3);
    }

    public final void b(C0367i c0367i) {
        this.count += c0367i.count;
        this.f6866b += c0367i.f6866b;
        c(c0367i.sum);
        c(c0367i.f6865a);
        this.min = Math.min(this.min, c0367i.min);
        this.max = Math.max(this.max, c0367i.max);
    }

    private void c(double d3) {
        double d4 = d3 - this.f6865a;
        double d5 = this.sum;
        double d6 = d5 + d4;
        this.f6865a = (d6 - d5) - d4;
        this.sum = d6;
    }

    public final String toString() {
        double d3;
        String simpleName = C0367i.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        double d4 = this.sum + this.f6865a;
        if (Double.isNaN(d4) && Double.isInfinite(this.f6866b)) {
            d4 = this.f6866b;
        }
        Double valueOf2 = Double.valueOf(d4);
        Double valueOf3 = Double.valueOf(this.min);
        if (this.count > 0) {
            double d5 = this.sum + this.f6865a;
            if (Double.isNaN(d5) && Double.isInfinite(this.f6866b)) {
                d5 = this.f6866b;
            }
            d3 = d5 / this.count;
        } else {
            d3 = 0.0d;
        }
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(d3), Double.valueOf(this.max));
    }
}
