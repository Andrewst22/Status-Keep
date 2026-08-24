package j$.util.stream;

import j$.util.C0372n;
/* loaded from: classes2.dex */
final class E extends I implements InterfaceC0425j2 {

    /* renamed from: c  reason: collision with root package name */
    static final D f6911c;

    /* renamed from: d  reason: collision with root package name */
    static final D f6912d;

    @Override // j$.util.stream.I, j$.util.stream.InterfaceC0440m2, j$.util.function.InterfaceC0352g
    public final void d(double d3) {
        w(Double.valueOf(d3));
    }

    @Override // j$.util.function.M
    public final Object get() {
        if (this.f6936a) {
            return C0372n.d(((Double) this.f6937b).doubleValue());
        }
        return null;
    }

    static {
        EnumC0381a3 enumC0381a3 = EnumC0381a3.DOUBLE_VALUE;
        f6911c = new D(true, enumC0381a3, C0372n.a(), new C0457q(1), new C0447o(4));
        f6912d = new D(false, enumC0381a3, C0372n.a(), new C0457q(1), new C0447o(4));
    }
}
