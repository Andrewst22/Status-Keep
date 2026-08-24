package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Objects;
/* renamed from: j$.util.stream.z3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0505z3 extends B3 implements Spliterator, Consumer {

    /* renamed from: f  reason: collision with root package name */
    Object f7316f;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0340b.f(this);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer h(Consumer consumer) {
        return j$.com.android.tools.r8.a.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i3) {
        return AbstractC0340b.h(this, i3);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f7316f = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean p(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (x() != A3.NO_MORE && this.f6893a.p(this)) {
            if (q(1L) == 1) {
                consumer.accept(this.f7316f);
                this.f7316f = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void b(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C0411g3 c0411g3 = null;
        while (true) {
            A3 x = x();
            if (x == A3.NO_MORE) {
                return;
            }
            A3 a3 = A3.MAYBE_MORE;
            Spliterator spliterator = this.f6893a;
            if (x == a3) {
                int i3 = this.f6895c;
                if (c0411g3 == null) {
                    c0411g3 = new C0411g3(i3);
                } else {
                    c0411g3.f7177a = 0;
                }
                long j3 = 0;
                while (spliterator.p(c0411g3)) {
                    j3++;
                    if (j3 >= i3) {
                        break;
                    }
                }
                if (j3 == 0) {
                    return;
                }
                long q3 = q(j3);
                for (int i4 = 0; i4 < q3; i4++) {
                    consumer.accept(c0411g3.f7170b[i4]);
                }
            } else {
                spliterator.b(consumer);
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.B3, j$.util.Spliterator] */
    @Override // j$.util.stream.B3
    protected final Spliterator u(Spliterator spliterator) {
        return new B3(spliterator, this);
    }
}
