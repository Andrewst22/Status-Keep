package j$.util;
/* loaded from: classes2.dex */
public interface H extends Spliterator {
    void forEachRemaining(Object obj);

    boolean tryAdvance(Object obj);

    @Override // j$.util.Spliterator
    H trySplit();
}
