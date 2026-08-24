package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
final class J extends AbstractC0387c {

    /* renamed from: j  reason: collision with root package name */
    private final D f6944j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f6945k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J(D d3, boolean z3, AbstractC0382b abstractC0382b, Spliterator spliterator) {
        super(abstractC0382b, spliterator);
        this.f6945k = z3;
        this.f6944j = d3;
    }

    J(J j3, Spliterator spliterator) {
        super(j3, spliterator);
        this.f6945k = j3.f6945k;
        this.f6944j = j3.f6944j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0397e
    public final AbstractC0397e e(Spliterator spliterator) {
        return new J(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0387c
    protected final Object j() {
        return this.f6944j.f6904b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0397e
    public final Object a() {
        AbstractC0382b abstractC0382b = this.f7148a;
        G3 g3 = (G3) this.f6944j.f6906d.get();
        abstractC0382b.Z(this.f7149b, g3);
        Object obj = g3.get();
        if (!this.f6945k) {
            if (obj != null) {
                AtomicReference atomicReference = this.f7129h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        } else if (obj != null) {
            AbstractC0397e abstractC0397e = this;
            while (true) {
                if (abstractC0397e == null) {
                    AtomicReference atomicReference2 = this.f7129h;
                    while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
                    }
                } else {
                    AbstractC0397e abstractC0397e2 = (AbstractC0397e) abstractC0397e.getCompleter();
                    if (abstractC0397e2 != null && abstractC0397e2.f7151d != abstractC0397e) {
                        i();
                        break;
                    }
                    abstractC0397e = abstractC0397e2;
                }
            }
            return obj;
        } else {
            return null;
        }
    }

    @Override // j$.util.stream.AbstractC0397e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.f6945k) {
            J j3 = (J) this.f7151d;
            J j4 = null;
            while (true) {
                if (j3 != j4) {
                    Object c3 = j3.c();
                    if (c3 == null || !this.f6944j.f6905c.g(c3)) {
                        j4 = j3;
                        j3 = (J) this.f7152e;
                    } else {
                        f(c3);
                        AbstractC0397e abstractC0397e = this;
                        while (true) {
                            if (abstractC0397e == null) {
                                AtomicReference atomicReference = this.f7129h;
                                while (!atomicReference.compareAndSet(null, c3) && atomicReference.get() == null) {
                                }
                            } else {
                                AbstractC0397e abstractC0397e2 = (AbstractC0397e) abstractC0397e.getCompleter();
                                if (abstractC0397e2 != null && abstractC0397e2.f7151d != abstractC0397e) {
                                    i();
                                    break;
                                }
                                abstractC0397e = abstractC0397e2;
                            }
                        }
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
