package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.IntFunction;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0437m extends AbstractC0395d2 {
    static L0 c0(AbstractC0382b abstractC0382b, Spliterator spliterator) {
        C0447o c0447o = new C0447o(19);
        C0447o c0447o2 = new C0447o(20);
        return new L0((Collection) new A1(EnumC0381a3.REFERENCE, new C0447o(21), c0447o2, c0447o, 3).c(abstractC0382b, spliterator));
    }

    @Override // j$.util.stream.AbstractC0382b
    final H0 S(AbstractC0382b abstractC0382b, Spliterator spliterator, IntFunction intFunction) {
        if (Z2.DISTINCT.r(abstractC0382b.O())) {
            return abstractC0382b.G(spliterator, false, intFunction);
        }
        if (Z2.ORDERED.r(abstractC0382b.O())) {
            return c0(abstractC0382b, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new N(new C0438m0(5, atomicBoolean, concurrentHashMap), false).c(abstractC0382b, spliterator);
        Set keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new L0(keySet);
    }

    @Override // j$.util.stream.AbstractC0382b
    final Spliterator T(AbstractC0382b abstractC0382b, Spliterator spliterator) {
        if (Z2.DISTINCT.r(abstractC0382b.O())) {
            return abstractC0382b.b0(spliterator);
        }
        if (Z2.ORDERED.r(abstractC0382b.O())) {
            return c0(abstractC0382b, spliterator).spliterator();
        }
        return new C0421i3(abstractC0382b.b0(spliterator));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0382b
    public final InterfaceC0440m2 V(int i3, InterfaceC0440m2 interfaceC0440m2) {
        Objects.requireNonNull(interfaceC0440m2);
        if (Z2.DISTINCT.r(i3)) {
            return interfaceC0440m2;
        }
        if (Z2.SORTED.r(i3)) {
            return new C0427k(interfaceC0440m2);
        }
        return new C0432l(interfaceC0440m2);
    }
}
