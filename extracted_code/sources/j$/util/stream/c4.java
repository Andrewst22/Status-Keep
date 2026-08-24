package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.Spliterator;
import j$.util.function.C0355j;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC0352g;
/* loaded from: classes2.dex */
final class c4 extends g4 implements InterfaceC0352g, j$.util.B {

    /* renamed from: e  reason: collision with root package name */
    final C0355j f7134e;

    /* renamed from: f  reason: collision with root package name */
    double f7135f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f7136g;

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public final /* synthetic */ void b(Consumer consumer) {
        AbstractC0340b.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean p(Consumer consumer) {
        return AbstractC0340b.k(this, consumer);
    }

    @Override // j$.util.H
    /* renamed from: o */
    public final void forEachRemaining(InterfaceC0352g interfaceC0352g) {
        do {
        } while (m(interfaceC0352g));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(j$.util.B b3, C0355j c0355j, int i3) {
        super(b3);
        this.f7136g = i3;
        this.f7134e = c0355j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(j$.util.B b3, c4 c4Var, int i3) {
        super(b3, c4Var);
        this.f7136g = i3;
        this.f7134e = c4Var.f7134e;
    }

    @Override // j$.util.function.InterfaceC0352g
    public final void d(double d3) {
        this.f7174d = (this.f7174d + 1) & 63;
        this.f7135f = d3;
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.H trySplit() {
        switch (this.f7136g) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.g4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f7136g) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.g4
    final Spliterator u(Spliterator spliterator) {
        switch (this.f7136g) {
            case 0:
                return new c4((j$.util.B) spliterator, this, 0);
            default:
                return new c4((j$.util.B) spliterator, this, 1);
        }
    }

    @Override // j$.util.H
    /* renamed from: m */
    public final boolean tryAdvance(InterfaceC0352g interfaceC0352g) {
        boolean m3;
        boolean z3;
        switch (this.f7136g) {
            case 0:
                boolean z4 = this.f7173c;
                Spliterator spliterator = this.f7171a;
                if (z4) {
                    boolean z5 = false;
                    this.f7173c = false;
                    while (true) {
                        m3 = ((j$.util.B) spliterator).m(this);
                        if (m3 && q()) {
                            if (this.f7134e.f6846a.test(this.f7135f)) {
                                z5 = true;
                            }
                        }
                    }
                    if (m3) {
                        if (z5) {
                            this.f7172b.set(true);
                        }
                        interfaceC0352g.d(this.f7135f);
                        return m3;
                    }
                    return m3;
                }
                return ((j$.util.B) spliterator).m(interfaceC0352g);
            default:
                if (this.f7173c && q() && ((j$.util.B) this.f7171a).m(this)) {
                    z3 = this.f7134e.f6846a.test(this.f7135f);
                    if (z3) {
                        interfaceC0352g.d(this.f7135f);
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
    public j$.util.B trySplit() {
        switch (this.f7136g) {
            case 1:
                if (this.f7172b.get()) {
                    return null;
                }
                return (j$.util.B) super.trySplit();
            default:
                return super.trySplit();
        }
    }
}
