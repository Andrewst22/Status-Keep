package j$.util.stream;
/* loaded from: classes2.dex */
final class K3 extends AbstractC0420i2 implements Z3 {

    /* renamed from: b  reason: collision with root package name */
    long f6963b;

    /* renamed from: c  reason: collision with root package name */
    boolean f6964c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f6965d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ L3 f6966e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K3(L3 l3, InterfaceC0440m2 interfaceC0440m2, boolean z3) {
        super(interfaceC0440m2);
        this.f6966e = l3;
        this.f6965d = z3;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        boolean z3;
        boolean z4;
        if (!this.f6964c) {
            boolean g3 = this.f6966e.f6973m.g(obj);
            this.f6964c = !g3;
            if (g3) {
                z3 = false;
                z4 = this.f6965d;
                if (z4 && !z3) {
                    this.f6963b++;
                }
                if (!z4 || z3) {
                    this.f7182a.accept(obj);
                }
                return;
            }
        }
        z3 = true;
        z4 = this.f6965d;
        if (z4) {
            this.f6963b++;
        }
        if (z4) {
        }
        this.f7182a.accept(obj);
    }

    @Override // j$.util.stream.Z3
    public final long k() {
        return this.f6963b;
    }
}
