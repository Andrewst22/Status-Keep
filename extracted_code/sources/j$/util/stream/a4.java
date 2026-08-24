package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.concurrent.CountedCompleter;
/* loaded from: classes2.dex */
final class a4 extends AbstractC0397e {

    /* renamed from: h  reason: collision with root package name */
    private final AbstractC0382b f7095h;

    /* renamed from: i  reason: collision with root package name */
    private final IntFunction f7096i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f7097j;

    /* renamed from: k  reason: collision with root package name */
    private long f7098k;

    /* renamed from: l  reason: collision with root package name */
    private long f7099l;

    @Override // j$.util.stream.AbstractC0397e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        H0 I3;
        AbstractC0397e abstractC0397e = this.f7151d;
        if (abstractC0397e != null) {
            if (this.f7097j) {
                a4 a4Var = (a4) abstractC0397e;
                long j3 = a4Var.f7099l;
                this.f7099l = j3;
                if (j3 == a4Var.f7098k) {
                    this.f7099l = j3 + ((a4) this.f7152e).f7099l;
                }
            }
            a4 a4Var2 = (a4) abstractC0397e;
            long j4 = a4Var2.f7098k;
            a4 a4Var3 = (a4) this.f7152e;
            this.f7098k = j4 + a4Var3.f7098k;
            if (a4Var2.f7098k == 0) {
                I3 = (H0) a4Var3.c();
            } else if (a4Var3.f7098k == 0) {
                I3 = (H0) a4Var2.c();
            } else {
                I3 = AbstractC0482v0.I(this.f7095h.M(), (H0) ((a4) this.f7151d).c(), (H0) ((a4) this.f7152e).c());
            }
            H0 h02 = I3;
            if (d() && this.f7097j) {
                h02 = h02.q(this.f7099l, h02.count(), this.f7096i);
            }
            f(h02);
        }
        super.onCompletion(countedCompleter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a4(AbstractC0382b abstractC0382b, AbstractC0382b abstractC0382b2, Spliterator spliterator, IntFunction intFunction) {
        super(abstractC0382b2, spliterator);
        this.f7095h = abstractC0382b;
        this.f7096i = intFunction;
        this.f7097j = Z2.ORDERED.r(abstractC0382b2.O());
    }

    a4(a4 a4Var, Spliterator spliterator) {
        super(a4Var, spliterator);
        this.f7095h = a4Var.f7095h;
        this.f7096i = a4Var.f7096i;
        this.f7097j = a4Var.f7097j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0397e
    public final AbstractC0397e e(Spliterator spliterator) {
        return new a4(this, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0397e
    public final Object a() {
        boolean d3 = d();
        InterfaceC0502z0 R3 = this.f7148a.R((!d3 && this.f7097j && Z2.SIZED.v(this.f7095h.f7102c)) ? this.f7095h.K(this.f7149b) : -1L, this.f7096i);
        Z3 n3 = ((Y3) this.f7095h).n(R3, this.f7097j && !d3);
        this.f7148a.Z(this.f7149b, n3);
        H0 a3 = R3.a();
        this.f7098k = a3.count();
        this.f7099l = n3.k();
        return a3;
    }
}
