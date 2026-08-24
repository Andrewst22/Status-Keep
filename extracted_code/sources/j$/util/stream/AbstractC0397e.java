package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;
/* renamed from: j$.util.stream.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0397e extends CountedCompleter {

    /* renamed from: g  reason: collision with root package name */
    private static final int f7147g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* renamed from: a  reason: collision with root package name */
    protected final AbstractC0382b f7148a;

    /* renamed from: b  reason: collision with root package name */
    protected Spliterator f7149b;

    /* renamed from: c  reason: collision with root package name */
    protected long f7150c;

    /* renamed from: d  reason: collision with root package name */
    protected AbstractC0397e f7151d;

    /* renamed from: e  reason: collision with root package name */
    protected AbstractC0397e f7152e;

    /* renamed from: f  reason: collision with root package name */
    private Object f7153f;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object a();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract AbstractC0397e e(Spliterator spliterator);

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0397e(AbstractC0382b abstractC0382b, Spliterator spliterator) {
        super(null);
        this.f7148a = abstractC0382b;
        this.f7149b = spliterator;
        this.f7150c = 0L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0397e(AbstractC0397e abstractC0397e, Spliterator spliterator) {
        super(abstractC0397e);
        this.f7149b = spliterator;
        this.f7148a = abstractC0397e.f7148a;
        this.f7150c = abstractC0397e.f7150c;
    }

    public static int b() {
        return f7147g;
    }

    public static long g(long j3) {
        long j4 = j3 / f7147g;
        if (j4 > 0) {
            return j4;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f7153f;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object c() {
        return this.f7153f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(Object obj) {
        this.f7153f = obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean d() {
        return ((AbstractC0397e) getCompleter()) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f7149b;
        long estimateSize = spliterator.estimateSize();
        long j3 = this.f7150c;
        if (j3 == 0) {
            j3 = g(estimateSize);
            this.f7150c = j3;
        }
        boolean z3 = false;
        AbstractC0397e abstractC0397e = this;
        while (estimateSize > j3 && (trySplit = spliterator.trySplit()) != null) {
            AbstractC0397e e2 = abstractC0397e.e(trySplit);
            abstractC0397e.f7151d = e2;
            AbstractC0397e e3 = abstractC0397e.e(spliterator);
            abstractC0397e.f7152e = e3;
            abstractC0397e.setPendingCount(1);
            if (z3) {
                spliterator = trySplit;
                abstractC0397e = e2;
                e2 = e3;
            } else {
                abstractC0397e = e3;
            }
            z3 = !z3;
            e2.fork();
            estimateSize = spliterator.estimateSize();
        }
        abstractC0397e.f(abstractC0397e.a());
        abstractC0397e.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f7149b = null;
        this.f7152e = null;
        this.f7151d = null;
    }
}
