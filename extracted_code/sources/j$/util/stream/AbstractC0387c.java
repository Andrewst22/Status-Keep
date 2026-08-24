package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: j$.util.stream.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0387c extends AbstractC0397e {

    /* renamed from: h  reason: collision with root package name */
    protected final AtomicReference f7129h;

    /* renamed from: i  reason: collision with root package name */
    protected volatile boolean f7130i;

    protected abstract Object j();

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0387c(AbstractC0382b abstractC0382b, Spliterator spliterator) {
        super(abstractC0382b, spliterator);
        this.f7129h = new AtomicReference(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0387c(AbstractC0387c abstractC0387c, Spliterator spliterator) {
        super(abstractC0387c, spliterator);
        this.f7129h = abstractC0387c.f7129h;
    }

    @Override // j$.util.stream.AbstractC0397e, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object obj;
        Spliterator trySplit;
        Spliterator spliterator = this.f7149b;
        long estimateSize = spliterator.estimateSize();
        long j3 = this.f7150c;
        if (j3 == 0) {
            j3 = AbstractC0397e.g(estimateSize);
            this.f7150c = j3;
        }
        AtomicReference atomicReference = this.f7129h;
        boolean z3 = false;
        AbstractC0387c abstractC0387c = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z4 = abstractC0387c.f7130i;
            if (!z4) {
                CountedCompleter<?> completer = abstractC0387c.getCompleter();
                while (true) {
                    AbstractC0387c abstractC0387c2 = (AbstractC0387c) ((AbstractC0397e) completer);
                    if (z4 || abstractC0387c2 == null) {
                        break;
                    }
                    z4 = abstractC0387c2.f7130i;
                    completer = abstractC0387c2.getCompleter();
                }
            }
            if (z4) {
                obj = abstractC0387c.j();
                break;
            } else if (estimateSize <= j3 || (trySplit = spliterator.trySplit()) == null) {
                break;
            } else {
                AbstractC0387c abstractC0387c3 = (AbstractC0387c) abstractC0387c.e(trySplit);
                abstractC0387c.f7151d = abstractC0387c3;
                AbstractC0387c abstractC0387c4 = (AbstractC0387c) abstractC0387c.e(spliterator);
                abstractC0387c.f7152e = abstractC0387c4;
                abstractC0387c.setPendingCount(1);
                if (z3) {
                    spliterator = trySplit;
                    abstractC0387c = abstractC0387c3;
                    abstractC0387c3 = abstractC0387c4;
                } else {
                    abstractC0387c = abstractC0387c4;
                }
                z3 = !z3;
                abstractC0387c3.fork();
                estimateSize = spliterator.estimateSize();
            }
        }
        obj = abstractC0387c.a();
        abstractC0387c.f(obj);
        abstractC0387c.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0397e
    public final void f(Object obj) {
        if (!d()) {
            super.f(obj);
        } else if (obj != null) {
            AtomicReference atomicReference = this.f7129h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC0397e, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return c();
    }

    @Override // j$.util.stream.AbstractC0397e
    public final Object c() {
        if (d()) {
            Object obj = this.f7129h.get();
            return obj == null ? j() : obj;
        }
        return super.c();
    }

    protected void h() {
        this.f7130i = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i() {
        AbstractC0387c abstractC0387c = this;
        for (AbstractC0387c abstractC0387c2 = (AbstractC0387c) ((AbstractC0397e) getCompleter()); abstractC0387c2 != null; abstractC0387c2 = (AbstractC0387c) ((AbstractC0397e) abstractC0387c2.getCompleter())) {
            if (abstractC0387c2.f7151d == abstractC0387c) {
                AbstractC0387c abstractC0387c3 = (AbstractC0387c) abstractC0387c2.f7152e;
                if (!abstractC0387c3.f7130i) {
                    abstractC0387c3.h();
                }
            }
            abstractC0387c = abstractC0387c2;
        }
    }
}
