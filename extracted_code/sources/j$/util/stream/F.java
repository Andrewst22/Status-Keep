package j$.util.stream;

import j$.util.C0373o;
/* loaded from: classes2.dex */
final class F extends I implements InterfaceC0430k2 {

    /* renamed from: c  reason: collision with root package name */
    static final D f6918c;

    /* renamed from: d  reason: collision with root package name */
    static final D f6919d;

    @Override // j$.util.stream.I, j$.util.stream.InterfaceC0440m2
    public final void e(int i3) {
        w(Integer.valueOf(i3));
    }

    @Override // j$.util.function.M
    public final Object get() {
        if (this.f6936a) {
            return C0373o.d(((Integer) this.f6937b).intValue());
        }
        return null;
    }

    static {
        EnumC0381a3 enumC0381a3 = EnumC0381a3.INT_VALUE;
        f6918c = new D(true, enumC0381a3, C0373o.a(), new C0457q(2), new C0447o(5));
        f6919d = new D(false, enumC0381a3, C0373o.a(), new C0457q(2), new C0447o(5));
    }
}
