package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0362q;
/* loaded from: classes2.dex */
final class d4 extends g4 implements InterfaceC0362q, j$.util.D {

    /* renamed from: e  reason: collision with root package name */
    final j$.util.function.r f7144e;

    /* renamed from: f  reason: collision with root package name */
    int f7145f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f7146g;

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0340b.d(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean p(Consumer consumer) {
        return AbstractC0340b.l(this, consumer);
    }

    @Override // j$.util.H
    /* renamed from: g */
    public final void forEachRemaining(InterfaceC0362q interfaceC0362q) {
        do {
        } while (c(interfaceC0362q));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(j$.util.D d3, j$.util.function.r rVar, int i3) {
        super(d3);
        this.f7146g = i3;
        this.f7144e = rVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(j$.util.D d3, d4 d4Var, int i3) {
        super(d3, d4Var);
        this.f7146g = i3;
        this.f7144e = d4Var.f7144e;
    }

    @Override // j$.util.function.InterfaceC0362q
    public final void e(int i3) {
        this.f7174d = (this.f7174d + 1) & 63;
        this.f7145f = i3;
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.H trySplit() {
        switch (this.f7146g) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f7146g) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.g4
    final Spliterator u(Spliterator spliterator) {
        switch (this.f7146g) {
            case 0:
                return new d4((j$.util.D) spliterator, this, 0);
            default:
                return new d4((j$.util.D) spliterator, this, 1);
        }
    }

    @Override // j$.util.H
    /* renamed from: c */
    public final boolean tryAdvance(InterfaceC0362q interfaceC0362q) {
        boolean c3;
        boolean z3;
        switch (this.f7146g) {
            case 0:
                boolean z4 = this.f7173c;
                Spliterator spliterator = this.f7171a;
                if (z4) {
                    boolean z5 = false;
                    this.f7173c = false;
                    while (true) {
                        c3 = ((j$.util.D) spliterator).c(this);
                        if (c3 && q()) {
                            if (this.f7144e.f6852a.test(this.f7145f)) {
                                z5 = true;
                            }
                        }
                    }
                    if (c3) {
                        if (z5) {
                            this.f7172b.set(true);
                        }
                        interfaceC0362q.e(this.f7145f);
                        return c3;
                    }
                    return c3;
                }
                return ((j$.util.D) spliterator).c(interfaceC0362q);
            default:
                if (this.f7173c && q() && ((j$.util.D) this.f7171a).c(this)) {
                    z3 = this.f7144e.f6852a.test(this.f7145f);
                    if (z3) {
                        interfaceC0362q.e(this.f7145f);
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
    public j$.util.D trySplit() {
        switch (this.f7146g) {
            case 1:
                if (this.f7172b.get()) {
                    return null;
                }
                return (j$.util.D) super.trySplit();
            default:
                return super.trySplit();
        }
    }
}
