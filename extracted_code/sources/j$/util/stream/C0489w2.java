package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;
/* renamed from: j$.util.stream.w2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0489w2 extends AbstractC0387c {

    /* renamed from: j  reason: collision with root package name */
    private final AbstractC0382b f7295j;

    /* renamed from: k  reason: collision with root package name */
    private final IntFunction f7296k;

    /* renamed from: l  reason: collision with root package name */
    private final long f7297l;

    /* renamed from: m  reason: collision with root package name */
    private final long f7298m;

    /* renamed from: n  reason: collision with root package name */
    private long f7299n;

    /* renamed from: o  reason: collision with root package name */
    private volatile boolean f7300o;

    @Override // j$.util.stream.AbstractC0387c
    protected final void h() {
        this.f7130i = true;
        if (this.f7300o) {
            f(AbstractC0482v0.L(this.f7295j.M()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
        if (r2 >= r0) goto L51;
     */
    @Override // j$.util.stream.AbstractC0397e, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r14) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.C0489w2.onCompletion(java.util.concurrent.CountedCompleter):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0489w2(AbstractC0382b abstractC0382b, AbstractC0382b abstractC0382b2, Spliterator spliterator, IntFunction intFunction, long j3, long j4) {
        super(abstractC0382b2, spliterator);
        this.f7295j = abstractC0382b;
        this.f7296k = intFunction;
        this.f7297l = j3;
        this.f7298m = j4;
    }

    C0489w2(C0489w2 c0489w2, Spliterator spliterator) {
        super(c0489w2, spliterator);
        this.f7295j = c0489w2.f7295j;
        this.f7296k = c0489w2.f7296k;
        this.f7297l = c0489w2.f7297l;
        this.f7298m = c0489w2.f7298m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0397e
    public final AbstractC0397e e(Spliterator spliterator) {
        return new C0489w2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0387c
    protected final Object j() {
        return AbstractC0482v0.L(this.f7295j.M());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0397e
    public final Object a() {
        if (d()) {
            InterfaceC0502z0 R3 = this.f7295j.R(Z2.SIZED.v(this.f7295j.f7102c) ? this.f7295j.K(this.f7149b) : -1L, this.f7296k);
            InterfaceC0440m2 V3 = this.f7295j.V(this.f7148a.O(), R3);
            AbstractC0382b abstractC0382b = this.f7148a;
            abstractC0382b.F(this.f7149b, abstractC0382b.a0(V3));
            return R3.a();
        }
        InterfaceC0502z0 R4 = this.f7295j.R(-1L, this.f7296k);
        if (this.f7297l == 0) {
            InterfaceC0440m2 V4 = this.f7295j.V(this.f7148a.O(), R4);
            AbstractC0382b abstractC0382b2 = this.f7148a;
            abstractC0382b2.F(this.f7149b, abstractC0382b2.a0(V4));
        } else {
            this.f7148a.Z(this.f7149b, R4);
        }
        H0 a3 = R4.a();
        this.f7299n = a3.count();
        this.f7300o = true;
        this.f7149b = null;
        return a3;
    }

    private long k(long j3) {
        if (this.f7300o) {
            return this.f7299n;
        }
        C0489w2 c0489w2 = (C0489w2) this.f7151d;
        C0489w2 c0489w22 = (C0489w2) this.f7152e;
        if (c0489w2 == null || c0489w22 == null) {
            return this.f7299n;
        }
        long k3 = c0489w2.k(j3);
        return k3 >= j3 ? k3 : k3 + c0489w22.k(j3);
    }
}
