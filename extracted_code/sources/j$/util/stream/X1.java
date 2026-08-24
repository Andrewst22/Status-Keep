package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class X1 extends AbstractC0397e {

    /* renamed from: h  reason: collision with root package name */
    private final AbstractC0482v0 f7060h;

    @Override // j$.util.stream.AbstractC0397e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0397e abstractC0397e = this.f7151d;
        if (abstractC0397e != null) {
            Q1 q1 = (Q1) ((X1) abstractC0397e).c();
            q1.l((Q1) ((X1) this.f7152e).c());
            f(q1);
        }
        super.onCompletion(countedCompleter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public X1(AbstractC0482v0 abstractC0482v0, AbstractC0382b abstractC0382b, Spliterator spliterator) {
        super(abstractC0382b, spliterator);
        this.f7060h = abstractC0482v0;
    }

    X1(X1 x12, Spliterator spliterator) {
        super(x12, spliterator);
        this.f7060h = x12.f7060h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0397e
    public final AbstractC0397e e(Spliterator spliterator) {
        return new X1(this, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0397e
    public final Object a() {
        AbstractC0382b abstractC0382b = this.f7148a;
        Q1 d02 = this.f7060h.d0();
        abstractC0382b.Z(this.f7149b, d02);
        return d02;
    }
}
