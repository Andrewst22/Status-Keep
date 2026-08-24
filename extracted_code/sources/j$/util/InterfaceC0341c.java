package j$.util;

import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.stream.Stream;
/* renamed from: j$.util.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0341c {
    void b(Consumer consumer);

    boolean c(Predicate predicate);

    Spliterator spliterator();

    Stream stream();
}
