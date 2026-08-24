package j$.util;

import j$.util.List;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0352g;
import j$.util.function.InterfaceC0362q;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Set;
import java.util.SortedSet;
/* renamed from: j$.util.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0340b {
    public static Optional q(C0371m c0371m) {
        if (c0371m == null) {
            return null;
        }
        if (c0371m.c()) {
            return Optional.of(c0371m.b());
        }
        return Optional.empty();
    }

    public static OptionalDouble r(C0372n c0372n) {
        if (c0372n == null) {
            return null;
        }
        if (c0372n.c()) {
            return OptionalDouble.of(c0372n.b());
        }
        return OptionalDouble.empty();
    }

    public static OptionalLong t(C0374p c0374p) {
        if (c0374p == null) {
            return null;
        }
        if (c0374p.c()) {
            return OptionalLong.of(c0374p.b());
        }
        return OptionalLong.empty();
    }

    public static OptionalInt s(C0373o c0373o) {
        if (c0373o == null) {
            return null;
        }
        if (c0373o.c()) {
            return OptionalInt.of(c0373o.b());
        }
        return OptionalInt.empty();
    }

    public static C0344e x(Comparator comparator, Comparator comparator2) {
        if (comparator instanceof InterfaceC0345f) {
            EnumC0365g enumC0365g = (EnumC0365g) ((InterfaceC0345f) comparator);
            enumC0365g.getClass();
            return new C0344e(enumC0365g, comparator2, 0);
        }
        return new C0344e(comparator, comparator2, 0);
    }

    public static Comparator v() {
        return EnumC0365g.INSTANCE;
    }

    public static long f(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static Spliterator w(Collection collection) {
        if (collection instanceof InterfaceC0341c) {
            return ((InterfaceC0341c) collection).spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            LinkedHashSet linkedHashSet = (LinkedHashSet) collection;
            Objects.requireNonNull(linkedHashSet);
            return new U(linkedHashSet, 17);
        } else if (collection instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) collection;
            return new z(sortedSet, sortedSet);
        } else if (collection instanceof Set) {
            Set set = (Set) collection;
            Objects.requireNonNull(set);
            return new U(set, 1);
        } else if (collection instanceof java.util.List) {
            return List.CC.$default$spliterator((java.util.List) collection);
        } else {
            Objects.requireNonNull(collection);
            return new U(collection, 0);
        }
    }

    public static boolean h(Spliterator spliterator, int i3) {
        return (spliterator.characteristics() & i3) == i3;
    }

    public static void u(Collection collection, Consumer consumer) {
        if (collection instanceof InterfaceC0341c) {
            ((InterfaceC0341c) collection).b(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        for (Object obj : collection) {
            consumer.accept(obj);
        }
    }

    public static boolean l(D d3, Consumer consumer) {
        if (consumer instanceof InterfaceC0362q) {
            return d3.c((InterfaceC0362q) consumer);
        }
        if (Y.f6738a) {
            Y.a(d3.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return d3.c(new C0506t(consumer));
    }

    public static void d(D d3, Consumer consumer) {
        if (consumer instanceof InterfaceC0362q) {
            d3.g((InterfaceC0362q) consumer);
        } else if (Y.f6738a) {
            Y.a(d3.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            d3.g(new C0506t(consumer));
        }
    }

    public static boolean n(F f3, Consumer consumer) {
        if (consumer instanceof j$.util.function.y) {
            return f3.j((j$.util.function.y) consumer);
        }
        if (Y.f6738a) {
            Y.a(f3.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return f3.j(new C0509w(consumer));
    }

    public static void e(F f3, Consumer consumer) {
        if (consumer instanceof j$.util.function.y) {
            f3.i((j$.util.function.y) consumer);
        } else if (Y.f6738a) {
            Y.a(f3.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            f3.i(new C0509w(consumer));
        }
    }

    public static boolean k(B b3, Consumer consumer) {
        if (consumer instanceof InterfaceC0352g) {
            return b3.m((InterfaceC0352g) consumer);
        }
        if (Y.f6738a) {
            Y.a(b3.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return b3.m(new C0375q(consumer));
    }

    public static void a(B b3, Consumer consumer) {
        if (consumer instanceof InterfaceC0352g) {
            b3.o((InterfaceC0352g) consumer);
        } else if (Y.f6738a) {
            Y.a(b3.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            b3.o(new C0375q(consumer));
        }
    }

    public Spliterator trySplit() {
        return null;
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public long estimateSize() {
        return 0L;
    }

    public int characteristics() {
        return 16448;
    }
}
