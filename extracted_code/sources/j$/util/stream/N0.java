package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.InterfaceC0348c;
import java.util.concurrent.CountedCompleter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class N0 extends AbstractC0397e {

    /* renamed from: h  reason: collision with root package name */
    protected final AbstractC0382b f6983h;

    /* renamed from: i  reason: collision with root package name */
    protected final j$.util.function.A f6984i;

    /* renamed from: j  reason: collision with root package name */
    protected final InterfaceC0348c f6985j;

    @Override // j$.util.stream.AbstractC0397e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0397e abstractC0397e = this.f7151d;
        if (abstractC0397e != null) {
            f((H0) this.f6985j.c((H0) ((N0) abstractC0397e).c(), (H0) ((N0) this.f7152e).c()));
        }
        super.onCompletion(countedCompleter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public N0(AbstractC0382b abstractC0382b, Spliterator spliterator, j$.util.function.A a3, InterfaceC0348c interfaceC0348c) {
        super(abstractC0382b, spliterator);
        this.f6983h = abstractC0382b;
        this.f6984i = a3;
        this.f6985j = interfaceC0348c;
    }

    N0(N0 n02, Spliterator spliterator) {
        super(n02, spliterator);
        this.f6983h = n02.f6983h;
        this.f6984i = n02.f6984i;
        this.f6985j = n02.f6985j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0397e
    public final AbstractC0397e e(Spliterator spliterator) {
        return new N0(this, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0397e
    public final Object a() {
        InterfaceC0502z0 interfaceC0502z0 = (InterfaceC0502z0) this.f6984i.o(this.f6983h.K(this.f7149b));
        this.f6983h.Z(this.f7149b, interfaceC0502z0);
        return interfaceC0502z0.a();
    }
}
