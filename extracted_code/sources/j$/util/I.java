package j$.util;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
final class I implements Iterator, Consumer {

    /* renamed from: a  reason: collision with root package name */
    boolean f6700a = false;

    /* renamed from: b  reason: collision with root package name */
    Object f6701b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Spliterator f6702c;

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer h(Consumer consumer) {
        return j$.com.android.tools.r8.a.a(this, consumer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public I(Spliterator spliterator) {
        this.f6702c = spliterator;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f6700a = true;
        this.f6701b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f6700a) {
            this.f6702c.p(this);
        }
        return this.f6700a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f6700a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6700a = false;
        return this.f6701b;
    }
}
