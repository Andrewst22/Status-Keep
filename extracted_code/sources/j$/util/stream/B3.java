package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes2.dex */
abstract class B3 {

    /* renamed from: a  reason: collision with root package name */
    protected final Spliterator f6893a;

    /* renamed from: b  reason: collision with root package name */
    protected final boolean f6894b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f6895c;

    /* renamed from: d  reason: collision with root package name */
    private final long f6896d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicLong f6897e;

    protected abstract Spliterator u(Spliterator spliterator);

    /* JADX INFO: Access modifiers changed from: package-private */
    public B3(Spliterator spliterator, long j3, long j4) {
        this.f6893a = spliterator;
        int i3 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
        this.f6894b = i3 < 0;
        this.f6896d = i3 >= 0 ? j4 : 0L;
        this.f6895c = 128;
        this.f6897e = new AtomicLong(i3 >= 0 ? j3 + j4 : j3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B3(Spliterator spliterator, B3 b3) {
        this.f6893a = spliterator;
        this.f6894b = b3.f6894b;
        this.f6897e = b3.f6897e;
        this.f6896d = b3.f6896d;
        this.f6895c = b3.f6895c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long q(long j3) {
        AtomicLong atomicLong;
        long j4;
        boolean z3;
        long min;
        do {
            atomicLong = this.f6897e;
            j4 = atomicLong.get();
            z3 = this.f6894b;
            if (j4 != 0) {
                min = Math.min(j4, j3);
                if (min <= 0) {
                    break;
                }
            } else if (z3) {
                return j3;
            } else {
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j4, j4 - min));
        if (z3) {
            return Math.max(j3 - min, 0L);
        }
        long j5 = this.f6896d;
        return j4 > j5 ? Math.max(min - (j4 - j5), 0L) : min;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final A3 x() {
        if (this.f6897e.get() > 0) {
            return A3.MAYBE_MORE;
        }
        return this.f6894b ? A3.UNLIMITED : A3.NO_MORE;
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public final Spliterator m3trySplit() {
        Spliterator trySplit;
        if (this.f6897e.get() == 0 || (trySplit = this.f6893a.trySplit()) == null) {
            return null;
        }
        return u(trySplit);
    }

    public final long estimateSize() {
        return this.f6893a.estimateSize();
    }

    public final int characteristics() {
        return this.f6893a.characteristics() & (-16465);
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.H m2trySplit() {
        return (j$.util.H) m3trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.D m0trySplit() {
        return (j$.util.D) m3trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.F m1trySplit() {
        return (j$.util.F) m3trySplit();
    }

    public /* bridge */ /* synthetic */ j$.util.B trySplit() {
        return (j$.util.B) m3trySplit();
    }
}
