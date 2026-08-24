package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0382b implements InterfaceC0407g {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0382b f7100a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0382b f7101b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f7102c;

    /* renamed from: d  reason: collision with root package name */
    private AbstractC0382b f7103d;

    /* renamed from: e  reason: collision with root package name */
    private int f7104e;

    /* renamed from: f  reason: collision with root package name */
    private int f7105f;

    /* renamed from: g  reason: collision with root package name */
    private Spliterator f7106g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7107h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f7108i;

    /* renamed from: j  reason: collision with root package name */
    private Runnable f7109j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7110k;

    abstract H0 J(AbstractC0382b abstractC0382b, Spliterator spliterator, boolean z3, IntFunction intFunction);

    abstract boolean L(Spliterator spliterator, InterfaceC0440m2 interfaceC0440m2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract EnumC0381a3 M();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract InterfaceC0502z0 R(long j3, IntFunction intFunction);

    abstract boolean U();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract InterfaceC0440m2 V(int i3, InterfaceC0440m2 interfaceC0440m2);

    abstract Spliterator Y(AbstractC0382b abstractC0382b, j$.util.function.M m3, boolean z3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0382b(Spliterator spliterator, int i3, boolean z3) {
        this.f7101b = null;
        this.f7106g = spliterator;
        this.f7100a = this;
        int i4 = Z2.f7071g & i3;
        this.f7102c = i4;
        this.f7105f = (~(i4 << 1)) & Z2.f7076l;
        this.f7104e = 0;
        this.f7110k = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0382b(AbstractC0382b abstractC0382b, int i3) {
        if (abstractC0382b.f7107h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC0382b.f7107h = true;
        abstractC0382b.f7103d = this;
        this.f7101b = abstractC0382b;
        this.f7102c = Z2.f7072h & i3;
        this.f7105f = Z2.m(i3, abstractC0382b.f7105f);
        AbstractC0382b abstractC0382b2 = abstractC0382b.f7100a;
        this.f7100a = abstractC0382b2;
        if (U()) {
            abstractC0382b2.f7108i = true;
        }
        this.f7104e = abstractC0382b.f7104e + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object H(F3 f3) {
        if (this.f7107h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f7107h = true;
        if (this.f7100a.f7110k) {
            return f3.c(this, W(f3.g()));
        }
        return f3.b(this, W(f3.g()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final H0 I(IntFunction intFunction) {
        AbstractC0382b abstractC0382b;
        if (this.f7107h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f7107h = true;
        if (this.f7100a.f7110k && (abstractC0382b = this.f7101b) != null && U()) {
            this.f7104e = 0;
            return S(abstractC0382b, abstractC0382b.W(0), intFunction);
        }
        return G(W(0), true, intFunction);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Spliterator X() {
        AbstractC0382b abstractC0382b = this.f7100a;
        if (this != abstractC0382b) {
            throw new IllegalStateException();
        }
        if (this.f7107h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f7107h = true;
        Spliterator spliterator = abstractC0382b.f7106g;
        if (spliterator != null) {
            abstractC0382b.f7106g = null;
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    @Override // j$.util.stream.InterfaceC0407g
    public final InterfaceC0407g sequential() {
        this.f7100a.f7110k = false;
        return this;
    }

    @Override // j$.util.stream.InterfaceC0407g
    public final InterfaceC0407g parallel() {
        this.f7100a.f7110k = true;
        return this;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f7107h = true;
        this.f7106g = null;
        AbstractC0382b abstractC0382b = this.f7100a;
        Runnable runnable = abstractC0382b.f7109j;
        if (runnable != null) {
            abstractC0382b.f7109j = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.InterfaceC0407g
    public final InterfaceC0407g onClose(Runnable runnable) {
        if (this.f7107h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        Objects.requireNonNull(runnable);
        AbstractC0382b abstractC0382b = this.f7100a;
        Runnable runnable2 = abstractC0382b.f7109j;
        if (runnable2 != null) {
            runnable = new E3(runnable2, runnable);
        }
        abstractC0382b.f7109j = runnable;
        return this;
    }

    @Override // j$.util.stream.InterfaceC0407g
    public Spliterator spliterator() {
        if (this.f7107h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f7107h = true;
        AbstractC0382b abstractC0382b = this.f7100a;
        if (this == abstractC0382b) {
            Spliterator spliterator = abstractC0382b.f7106g;
            if (spliterator != null) {
                abstractC0382b.f7106g = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return Y(this, new C0377a(0, this), abstractC0382b.f7110k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Spliterator Q() {
        return W(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final H0 G(Spliterator spliterator, boolean z3, IntFunction intFunction) {
        if (this.f7100a.f7110k) {
            return J(this, spliterator, z3, intFunction);
        }
        InterfaceC0502z0 R3 = R(K(spliterator), intFunction);
        Z(spliterator, R3);
        return R3.a();
    }

    @Override // j$.util.stream.InterfaceC0407g
    public final boolean isParallel() {
        return this.f7100a.f7110k;
    }

    private Spliterator W(int i3) {
        int i4;
        int i5;
        AbstractC0382b abstractC0382b = this.f7100a;
        Spliterator spliterator = abstractC0382b.f7106g;
        if (spliterator != null) {
            abstractC0382b.f7106g = null;
            if (abstractC0382b.f7110k && abstractC0382b.f7108i) {
                AbstractC0382b abstractC0382b2 = abstractC0382b.f7103d;
                int i6 = 1;
                while (abstractC0382b != this) {
                    int i7 = abstractC0382b2.f7102c;
                    if (abstractC0382b2.U()) {
                        if (Z2.SHORT_CIRCUIT.r(i7)) {
                            i7 &= ~Z2.f7085u;
                        }
                        spliterator = abstractC0382b2.T(abstractC0382b, spliterator);
                        if (spliterator.hasCharacteristics(64)) {
                            i4 = (~Z2.f7084t) & i7;
                            i5 = Z2.f7083s;
                        } else {
                            i4 = (~Z2.f7083s) & i7;
                            i5 = Z2.f7084t;
                        }
                        i7 = i4 | i5;
                        i6 = 0;
                    }
                    abstractC0382b2.f7104e = i6;
                    abstractC0382b2.f7105f = Z2.m(i7, abstractC0382b.f7105f);
                    i6++;
                    AbstractC0382b abstractC0382b3 = abstractC0382b2;
                    abstractC0382b2 = abstractC0382b2.f7103d;
                    abstractC0382b = abstractC0382b3;
                }
            }
            if (i3 != 0) {
                this.f7105f = Z2.m(i3, this.f7105f);
            }
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final EnumC0381a3 N() {
        AbstractC0382b abstractC0382b = this;
        while (abstractC0382b.f7104e > 0) {
            abstractC0382b = abstractC0382b.f7101b;
        }
        return abstractC0382b.M();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long K(Spliterator spliterator) {
        if (Z2.SIZED.r(this.f7105f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InterfaceC0440m2 Z(Spliterator spliterator, InterfaceC0440m2 interfaceC0440m2) {
        Objects.requireNonNull(interfaceC0440m2);
        E(spliterator, a0(interfaceC0440m2));
        return interfaceC0440m2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E(Spliterator spliterator, InterfaceC0440m2 interfaceC0440m2) {
        Objects.requireNonNull(interfaceC0440m2);
        if (!Z2.SHORT_CIRCUIT.r(this.f7105f)) {
            interfaceC0440m2.s(spliterator.getExactSizeIfKnown());
            spliterator.b(interfaceC0440m2);
            interfaceC0440m2.r();
            return;
        }
        F(spliterator, interfaceC0440m2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean F(Spliterator spliterator, InterfaceC0440m2 interfaceC0440m2) {
        AbstractC0382b abstractC0382b = this;
        while (abstractC0382b.f7104e > 0) {
            abstractC0382b = abstractC0382b.f7101b;
        }
        interfaceC0440m2.s(spliterator.getExactSizeIfKnown());
        boolean L = abstractC0382b.L(spliterator, interfaceC0440m2);
        interfaceC0440m2.r();
        return L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int O() {
        return this.f7105f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean P() {
        return Z2.ORDERED.r(this.f7105f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final InterfaceC0440m2 a0(InterfaceC0440m2 interfaceC0440m2) {
        Objects.requireNonNull(interfaceC0440m2);
        AbstractC0382b abstractC0382b = this;
        while (abstractC0382b.f7104e > 0) {
            AbstractC0382b abstractC0382b2 = abstractC0382b.f7101b;
            interfaceC0440m2 = abstractC0382b.V(abstractC0382b2.f7105f, interfaceC0440m2);
            abstractC0382b = abstractC0382b2;
        }
        return interfaceC0440m2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Spliterator b0(Spliterator spliterator) {
        return this.f7104e == 0 ? spliterator : Y(this, new C0377a(7, spliterator), this.f7100a.f7110k);
    }

    H0 S(AbstractC0382b abstractC0382b, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator T(AbstractC0382b abstractC0382b, Spliterator spliterator) {
        return S(abstractC0382b, spliterator, new C0447o(15)).spliterator();
    }
}
