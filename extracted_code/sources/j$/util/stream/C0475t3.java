package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.t3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0475t3 extends AbstractC0480u3 implements Spliterator {
    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0340b.f(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i3) {
        return AbstractC0340b.h(this, i3);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0475t3(Spliterator spliterator, long j3, long j4) {
        super(spliterator, j3, j4, 0L, Math.min(spliterator.estimateSize(), j4));
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [j$.util.stream.u3, j$.util.Spliterator] */
    @Override // j$.util.stream.AbstractC0480u3
    protected final Spliterator a(Spliterator spliterator, long j3, long j4, long j5, long j6) {
        return new AbstractC0480u3(spliterator, j3, j4, j5, j6);
    }

    @Override // j$.util.Spliterator
    public final boolean p(Consumer consumer) {
        long j3;
        Objects.requireNonNull(consumer);
        long j4 = this.f7274e;
        long j5 = this.f7270a;
        if (j5 >= j4) {
            return false;
        }
        while (true) {
            j3 = this.f7273d;
            if (j5 <= j3) {
                break;
            }
            this.f7272c.p(new Y1(4));
            this.f7273d++;
        }
        if (j3 >= this.f7274e) {
            return false;
        }
        this.f7273d = j3 + 1;
        return this.f7272c.p(consumer);
    }

    @Override // j$.util.Spliterator
    public final void b(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j3 = this.f7274e;
        long j4 = this.f7270a;
        if (j4 >= j3) {
            return;
        }
        long j5 = this.f7273d;
        if (j5 >= j3) {
            return;
        }
        if (j5 >= j4 && this.f7272c.estimateSize() + j5 <= this.f7271b) {
            this.f7272c.b(consumer);
            this.f7273d = this.f7274e;
            return;
        }
        while (j4 > this.f7273d) {
            this.f7272c.p(new Y1(5));
            this.f7273d++;
        }
        while (this.f7273d < this.f7274e) {
            this.f7272c.p(consumer);
            this.f7273d++;
        }
    }
}
