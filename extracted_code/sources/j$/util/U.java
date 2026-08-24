package j$.util;

import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class U implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    private final Collection f6725a;

    /* renamed from: b  reason: collision with root package name */
    private Iterator f6726b = null;

    /* renamed from: c  reason: collision with root package name */
    private final int f6727c;

    /* renamed from: d  reason: collision with root package name */
    private long f6728d;

    /* renamed from: e  reason: collision with root package name */
    private int f6729e;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0340b.f(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i3) {
        return AbstractC0340b.h(this, i3);
    }

    public U(Collection collection, int i3) {
        this.f6725a = collection;
        this.f6727c = i3 | 16448;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        long j3;
        Iterator it = this.f6726b;
        if (it == null) {
            Collection collection = this.f6725a;
            Iterator it2 = collection.iterator();
            this.f6726b = it2;
            j3 = collection.size();
            this.f6728d = j3;
            it = it2;
        } else {
            j3 = this.f6728d;
        }
        if (j3 <= 1 || !it.hasNext()) {
            return null;
        }
        int i3 = this.f6729e + 1024;
        if (i3 > j3) {
            i3 = (int) j3;
        }
        if (i3 > 33554432) {
            i3 = 33554432;
        }
        Object[] objArr = new Object[i3];
        int i4 = 0;
        do {
            objArr[i4] = it.next();
            i4++;
            if (i4 >= i3) {
                break;
            }
        } while (it.hasNext());
        this.f6729e = i4;
        long j4 = this.f6728d;
        if (j4 != Long.MAX_VALUE) {
            this.f6728d = j4 - i4;
        }
        return new M(objArr, 0, i4, this.f6727c);
    }

    @Override // j$.util.Spliterator
    public final void b(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f6726b;
        if (it == null) {
            Collection collection = this.f6725a;
            Iterator it2 = collection.iterator();
            this.f6726b = it2;
            this.f6728d = collection.size();
            it = it2;
        }
        if (it instanceof InterfaceC0369k) {
            ((InterfaceC0369k) it).b(consumer);
            return;
        }
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    @Override // j$.util.Spliterator
    public final boolean p(Consumer consumer) {
        consumer.getClass();
        if (this.f6726b == null) {
            Collection collection = this.f6725a;
            this.f6726b = collection.iterator();
            this.f6728d = collection.size();
        }
        if (this.f6726b.hasNext()) {
            consumer.accept(this.f6726b.next());
            return true;
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.f6726b == null) {
            Collection collection = this.f6725a;
            this.f6726b = collection.iterator();
            long size = collection.size();
            this.f6728d = size;
            return size;
        }
        return this.f6728d;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f6727c;
    }

    @Override // j$.util.Spliterator
    public Comparator getComparator() {
        if (AbstractC0340b.h(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
