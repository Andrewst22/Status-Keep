package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;
/* renamed from: j$.util.stream.f */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0402f implements BaseStream {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0407g f7160a;

    private /* synthetic */ C0402f(InterfaceC0407g interfaceC0407g) {
        this.f7160a = interfaceC0407g;
    }

    public static /* synthetic */ BaseStream n(InterfaceC0407g interfaceC0407g) {
        if (interfaceC0407g == null) {
            return null;
        }
        return interfaceC0407g instanceof C ? B.n((C) interfaceC0407g) : interfaceC0407g instanceof InterfaceC0388c0 ? C0383b0.n((InterfaceC0388c0) interfaceC0407g) : interfaceC0407g instanceof InterfaceC0433l0 ? C0428k0.n((InterfaceC0433l0) interfaceC0407g) : interfaceC0407g instanceof Stream ? Stream.Wrapper.convert((Stream) interfaceC0407g) : new C0402f(interfaceC0407g);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f7160a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0407g interfaceC0407g = this.f7160a;
        if (obj instanceof C0402f) {
            obj = ((C0402f) obj).f7160a;
        }
        return interfaceC0407g.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f7160a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f7160a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f7160a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return n(this.f7160a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return n(this.f7160a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return n(this.f7160a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.f7160a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return n(this.f7160a.unordered());
    }
}
