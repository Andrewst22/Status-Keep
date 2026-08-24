package j$.util;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class G implements Spliterator.OfPrimitive {

    /* renamed from: a */
    public final /* synthetic */ H f6699a;

    private /* synthetic */ G(H h3) {
        this.f6699a = h3;
    }

    public static /* synthetic */ Spliterator.OfPrimitive a(H h3) {
        if (h3 == null) {
            return null;
        }
        return h3 instanceof B ? A.a((B) h3) : h3 instanceof D ? C.a((D) h3) : h3 instanceof F ? E.a((F) h3) : new G(h3);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f6699a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        H h3 = this.f6699a;
        if (obj instanceof G) {
            obj = ((G) obj).f6699a;
        }
        return h3.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f6699a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f6699a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f6699a.b(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f6699a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f6699a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i3) {
        return this.f6699a.hasCharacteristics(i3);
    }

    public final /* synthetic */ int hashCode() {
        return this.f6699a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f6699a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f6699a.p(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return a(this.f6699a.trySplit());
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f6699a.trySplit());
    }
}
