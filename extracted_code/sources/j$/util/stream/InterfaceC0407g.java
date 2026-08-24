package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;
/* renamed from: j$.util.stream.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0407g extends AutoCloseable {
    boolean isParallel();

    Iterator iterator();

    InterfaceC0407g onClose(Runnable runnable);

    InterfaceC0407g parallel();

    InterfaceC0407g sequential();

    Spliterator spliterator();

    InterfaceC0407g unordered();
}
