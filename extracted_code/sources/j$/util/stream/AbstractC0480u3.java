package j$.util.stream;

import j$.util.Spliterator;
/* renamed from: j$.util.stream.u3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0480u3 {

    /* renamed from: a  reason: collision with root package name */
    final long f7270a;

    /* renamed from: b  reason: collision with root package name */
    final long f7271b;

    /* renamed from: c  reason: collision with root package name */
    Spliterator f7272c;

    /* renamed from: d  reason: collision with root package name */
    long f7273d;

    /* renamed from: e  reason: collision with root package name */
    long f7274e;

    protected abstract Spliterator a(Spliterator spliterator, long j3, long j4, long j5, long j6);

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0480u3(Spliterator spliterator, long j3, long j4, long j5, long j6) {
        this.f7272c = spliterator;
        this.f7270a = j3;
        this.f7271b = j4;
        this.f7273d = j5;
        this.f7274e = j6;
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public final Spliterator m7trySplit() {
        long j3 = this.f7274e;
        if (this.f7270a >= j3 || this.f7273d >= j3) {
            return null;
        }
        while (true) {
            Spliterator trySplit = this.f7272c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.f7273d;
            long min = Math.min(estimateSize, this.f7271b);
            long j4 = this.f7270a;
            if (j4 >= min) {
                this.f7273d = min;
            } else {
                long j5 = this.f7271b;
                if (min >= j5) {
                    this.f7272c = trySplit;
                    this.f7274e = min;
                } else {
                    long j6 = this.f7273d;
                    if (j6 >= j4 && estimateSize <= j5) {
                        this.f7273d = min;
                        return trySplit;
                    }
                    this.f7273d = min;
                    return a(trySplit, j4, j5, j6, min);
                }
            }
        }
    }

    public final long estimateSize() {
        long j3 = this.f7274e;
        long j4 = this.f7270a;
        if (j4 < j3) {
            return j3 - Math.max(j4, this.f7273d);
        }
        return 0L;
    }

    public final int characteristics() {
        return this.f7272c.characteristics();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.H m6trySplit() {
        return (j$.util.H) m7trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.D m4trySplit() {
        return (j$.util.D) m7trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.F m5trySplit() {
        return (j$.util.F) m7trySplit();
    }

    public /* bridge */ /* synthetic */ j$.util.B trySplit() {
        return (j$.util.B) m7trySplit();
    }
}
