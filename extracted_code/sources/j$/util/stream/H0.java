package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
/* loaded from: classes2.dex */
interface H0 {
    void b(Consumer consumer);

    H0 c(int i3);

    long count();

    void m(Object[] objArr, int i3);

    int o();

    Object[] p(IntFunction intFunction);

    H0 q(long j3, long j4, IntFunction intFunction);

    Spliterator spliterator();
}
