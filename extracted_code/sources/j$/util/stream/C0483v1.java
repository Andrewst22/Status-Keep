package j$.util.stream;

import java.util.concurrent.CountedCompleter;
/* renamed from: j$.util.stream.v1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0483v1 extends CountedCompleter {

    /* renamed from: a  reason: collision with root package name */
    protected final H0 f7284a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f7285b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f7286c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f7287d;

    public C0483v1(H0 h02, Object obj, int i3) {
        this.f7286c = i3;
        this.f7284a = h02;
        this.f7285b = 0;
        this.f7287d = obj;
    }

    C0483v1(C0483v1 c0483v1, H0 h02, int i3, byte b3) {
        super(c0483v1);
        this.f7284a = h02;
        this.f7285b = i3;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        C0483v1 c0483v1 = this;
        while (c0483v1.f7284a.o() != 0) {
            c0483v1.setPendingCount(c0483v1.f7284a.o() - 1);
            int i3 = 0;
            int i4 = 0;
            while (i3 < c0483v1.f7284a.o() - 1) {
                C0483v1 a3 = c0483v1.a(i3, c0483v1.f7285b + i4);
                i4 = (int) (i4 + a3.f7284a.count());
                a3.fork();
                i3++;
            }
            c0483v1 = c0483v1.a(i3, c0483v1.f7285b + i4);
        }
        switch (c0483v1.f7286c) {
            case 0:
                ((G0) c0483v1.f7284a).u(c0483v1.f7285b, c0483v1.f7287d);
                break;
            default:
                c0483v1.f7284a.m((Object[]) c0483v1.f7287d, c0483v1.f7285b);
                break;
        }
        c0483v1.propagateCompletion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0483v1(C0483v1 c0483v1, H0 h02, int i3) {
        this(c0483v1, h02, i3, (byte) 0);
        this.f7286c = 1;
        this.f7287d = (Object[]) c0483v1.f7287d;
    }

    final C0483v1 a(int i3, int i4) {
        switch (this.f7286c) {
            case 0:
                return new C0483v1(this, ((G0) this.f7284a).c(i3), i4);
            default:
                return new C0483v1(this, this.f7284a.c(i3), i4);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0483v1(C0483v1 c0483v1, G0 g02, int i3) {
        this(c0483v1, g02, i3, (byte) 0);
        this.f7286c = 0;
        this.f7287d = c0483v1.f7287d;
    }
}
