package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.Spliterator;
import j$.util.function.Consumer;
/* loaded from: classes2.dex */
final class e4 extends g4 implements j$.util.function.y, j$.util.F {

    /* renamed from: e  reason: collision with root package name */
    final j$.util.function.B f7157e;

    /* renamed from: f  reason: collision with root package name */
    long f7158f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f7159g;

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0340b.e(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean p(Consumer consumer) {
        return AbstractC0340b.n(this, consumer);
    }

    @Override // j$.util.H
    /* renamed from: i */
    public final void forEachRemaining(j$.util.function.y yVar) {
        do {
        } while (j(yVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(j$.util.F f3, j$.util.function.B b3, int i3) {
        super(f3);
        this.f7159g = i3;
        this.f7157e = b3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(j$.util.F f3, e4 e4Var, int i3) {
        super(f3, e4Var);
        this.f7159g = i3;
        this.f7157e = e4Var.f7157e;
    }

    @Override // j$.util.function.y
    public final void f(long j3) {
        this.f7174d = (this.f7174d + 1) & 63;
        this.f7158f = j3;
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.H trySplit() {
        switch (this.f7159g) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f7159g) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.g4
    final Spliterator u(Spliterator spliterator) {
        switch (this.f7159g) {
            case 0:
                return new e4((j$.util.F) spliterator, this, 0);
            default:
                return new e4((j$.util.F) spliterator, this, 1);
        }
    }

    @Override // j$.util.H
    /* renamed from: j */
    public final boolean tryAdvance(j$.util.function.y yVar) {
        boolean j3;
        boolean z3;
        switch (this.f7159g) {
            case 0:
                boolean z4 = this.f7173c;
                Spliterator spliterator = this.f7171a;
                if (z4) {
                    boolean z5 = false;
                    this.f7173c = false;
                    while (true) {
                        j3 = ((j$.util.F) spliterator).j(this);
                        if (j3 && q()) {
                            if (this.f7157e.f6821a.test(this.f7158f)) {
                                z5 = true;
                            }
                        }
                    }
                    if (j3) {
                        if (z5) {
                            this.f7172b.set(true);
                        }
                        yVar.f(this.f7158f);
                        return j3;
                    }
                    return j3;
                }
                return ((j$.util.F) spliterator).j(yVar);
            default:
                if (this.f7173c && q() && ((j$.util.F) this.f7171a).j(this)) {
                    z3 = this.f7157e.f6821a.test(this.f7158f);
                    if (z3) {
                        yVar.f(this.f7158f);
                        return true;
                    }
                } else {
                    z3 = true;
                }
                this.f7173c = false;
                if (!z3) {
                    this.f7172b.set(true);
                }
                return false;
        }
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public j$.util.F trySplit() {
        switch (this.f7159g) {
            case 1:
                if (this.f7172b.get()) {
                    return null;
                }
                return (j$.util.F) super.trySplit();
            default:
                return super.trySplit();
        }
    }
}
