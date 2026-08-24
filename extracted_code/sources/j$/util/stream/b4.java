package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.concurrent.CountedCompleter;
/* loaded from: classes2.dex */
final class b4 extends AbstractC0387c {

    /* renamed from: j  reason: collision with root package name */
    private final AbstractC0382b f7123j;

    /* renamed from: k  reason: collision with root package name */
    private final IntFunction f7124k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f7125l;

    /* renamed from: m  reason: collision with root package name */
    private long f7126m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f7127n;

    /* renamed from: o  reason: collision with root package name */
    private volatile boolean f7128o;

    @Override // j$.util.stream.AbstractC0387c
    protected final void h() {
        this.f7130i = true;
        if (this.f7125l && this.f7128o) {
            f(AbstractC0482v0.L(this.f7123j.M()));
        }
    }

    @Override // j$.util.stream.AbstractC0397e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        Object I3;
        AbstractC0397e abstractC0397e = this.f7151d;
        if (abstractC0397e != null) {
            this.f7127n = ((b4) abstractC0397e).f7127n | ((b4) this.f7152e).f7127n;
            if (this.f7125l && this.f7130i) {
                this.f7126m = 0L;
                I3 = AbstractC0482v0.L(this.f7123j.M());
            } else {
                if (this.f7125l) {
                    b4 b4Var = (b4) this.f7151d;
                    if (b4Var.f7127n) {
                        this.f7126m = b4Var.f7126m;
                        I3 = (H0) b4Var.c();
                    }
                }
                b4 b4Var2 = (b4) this.f7151d;
                long j3 = b4Var2.f7126m;
                b4 b4Var3 = (b4) this.f7152e;
                this.f7126m = j3 + b4Var3.f7126m;
                if (b4Var2.f7126m == 0) {
                    I3 = (H0) b4Var3.c();
                } else if (b4Var3.f7126m == 0) {
                    I3 = (H0) b4Var2.c();
                } else {
                    I3 = AbstractC0482v0.I(this.f7123j.M(), (H0) ((b4) this.f7151d).c(), (H0) ((b4) this.f7152e).c());
                }
            }
            f(I3);
        }
        this.f7128o = true;
        super.onCompletion(countedCompleter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b4(AbstractC0382b abstractC0382b, AbstractC0382b abstractC0382b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC0382b2, spliterator);
        this.f7123j = abstractC0382b;
        this.f7124k = intFunction;
        this.f7125l = Z2.ORDERED.r(abstractC0382b2.O());
    }

    b4(b4 b4Var, Spliterator spliterator) {
        super(b4Var, spliterator);
        this.f7123j = b4Var.f7123j;
        this.f7124k = b4Var.f7124k;
        this.f7125l = b4Var.f7125l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0397e
    public final AbstractC0397e e(Spliterator spliterator) {
        return new b4(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0387c
    protected final Object j() {
        return AbstractC0482v0.L(this.f7123j.M());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0397e
    public final Object a() {
        InterfaceC0502z0 R3 = this.f7148a.R(-1L, this.f7124k);
        InterfaceC0440m2 V3 = this.f7123j.V(this.f7148a.O(), R3);
        AbstractC0382b abstractC0382b = this.f7148a;
        boolean F3 = abstractC0382b.F(this.f7149b, abstractC0382b.a0(V3));
        this.f7127n = F3;
        if (F3) {
            i();
        }
        H0 a3 = R3.a();
        this.f7126m = a3.count();
        return a3;
    }
}
