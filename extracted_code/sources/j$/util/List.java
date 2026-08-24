package j$.util;

import j$.util.function.UnaryOperator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
public interface List<E> extends InterfaceC0341c {
    void replaceAll(UnaryOperator<E> unaryOperator);

    void sort(Comparator<? super E> comparator);

    @Override // j$.util.InterfaceC0341c
    Spliterator<E> spliterator();

    /* renamed from: j$.util.List$-CC  reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        public static void $default$replaceAll(java.util.List list, UnaryOperator unaryOperator) {
            Objects.requireNonNull(unaryOperator);
            ListIterator<E> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                listIterator.set((E) unaryOperator.a(listIterator.next()));
            }
        }

        public static void $default$sort(java.util.List list, Comparator comparator) {
            Object[] array = list.toArray();
            Arrays.sort(array, comparator);
            ListIterator<E> listIterator = list.listIterator();
            for (Object obj : array) {
                listIterator.next();
                listIterator.set(obj);
            }
        }

        public static Spliterator $default$spliterator(java.util.List list) {
            if (!(list instanceof RandomAccess)) {
                Objects.requireNonNull(list);
                return new U(list, 16);
            }
            return new C0339a(list);
        }
    }
}
