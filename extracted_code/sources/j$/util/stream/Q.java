package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
/* loaded from: classes2.dex */
final class Q extends CountedCompleter {

    /* renamed from: a  reason: collision with root package name */
    private Spliterator f7016a;

    /* renamed from: b  reason: collision with root package name */
    private final InterfaceC0440m2 f7017b;

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC0382b f7018c;

    /* renamed from: d  reason: collision with root package name */
    private long f7019d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q(AbstractC0382b abstractC0382b, Spliterator spliterator, InterfaceC0440m2 interfaceC0440m2) {
        super(null);
        this.f7017b = interfaceC0440m2;
        this.f7018c = abstractC0382b;
        this.f7016a = spliterator;
        this.f7019d = 0L;
    }

    Q(Q q3, Spliterator spliterator) {
        super(q3);
        this.f7016a = spliterator;
        this.f7017b = q3.f7017b;
        this.f7019d = q3.f7019d;
        this.f7018c = q3.f7018c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f7016a;
        long estimateSize = spliterator.estimateSize();
        long j3 = this.f7019d;
        if (j3 == 0) {
            j3 = AbstractC0397e.g(estimateSize);
            this.f7019d = j3;
        }
        boolean r3 = Z2.SHORT_CIRCUIT.r(this.f7018c.O());
        InterfaceC0440m2 interfaceC0440m2 = this.f7017b;
        boolean z3 = false;
        Q q3 = this;
        while (true) {
            if (r3 && interfaceC0440m2.v()) {
                break;
            } else if (estimateSize <= j3 || (trySplit = spliterator.trySplit()) == null) {
                break;
            } else {
                Q q4 = new Q(q3, trySplit);
                q3.addToPendingCount(1);
                if (z3) {
                    spliterator = trySplit;
                } else {
                    Q q5 = q3;
                    q3 = q4;
                    q4 = q5;
                }
                z3 = !z3;
                q3.fork();
                q3 = q4;
                estimateSize = spliterator.estimateSize();
            }
        }
        q3.f7018c.E(spliterator, interfaceC0440m2);
        q3.f7016a = null;
        q3.propagateCompletion();
    }
}
