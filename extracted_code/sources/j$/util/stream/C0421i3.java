package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer;
import java.util.Comparator;
/* renamed from: j$.util.stream.i3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0421i3 implements Spliterator, Consumer {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f7183d = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Spliterator f7184a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap f7185b;

    /* renamed from: c  reason: collision with root package name */
    private Object f7186c;

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

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0421i3(Spliterator spliterator) {
        this(spliterator, new ConcurrentHashMap());
    }

    private C0421i3(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f7184a = spliterator;
        this.f7185b = concurrentHashMap;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f7186c = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(Consumer consumer, Object obj) {
        if (this.f7185b.putIfAbsent(obj != null ? obj : f7183d, Boolean.TRUE) == null) {
            consumer.accept(obj);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean p(Consumer consumer) {
        while (this.f7184a.p(this)) {
            Object obj = this.f7186c;
            if (obj == null) {
                obj = f7183d;
            }
            if (this.f7185b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.f7186c);
                this.f7186c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void b(Consumer consumer) {
        this.f7184a.b(new C0438m0(4, this, consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator trySplit = this.f7184a.trySplit();
        if (trySplit != null) {
            return new C0421i3(trySplit, this.f7185b);
        }
        return null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f7184a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return (this.f7184a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f7184a.getComparator();
    }
}
