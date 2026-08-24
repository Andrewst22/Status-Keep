package j$.util.stream;

import j$.util.C0374p;
/* loaded from: classes2.dex */
final class G extends I implements InterfaceC0435l2 {

    /* renamed from: c  reason: collision with root package name */
    static final D f6923c;

    /* renamed from: d  reason: collision with root package name */
    static final D f6924d;

    @Override // j$.util.stream.I, j$.util.stream.InterfaceC0440m2
    public final void f(long j3) {
        w(Long.valueOf(j3));
    }

    @Override // j$.util.function.M
    public final Object get() {
        if (this.f6936a) {
            return C0374p.d(((Long) this.f6937b).longValue());
        }
        return null;
    }

    static {
        EnumC0381a3 enumC0381a3 = EnumC0381a3.LONG_VALUE;
        f6923c = new D(true, enumC0381a3, C0374p.a(), new C0457q(3), new C0447o(6));
        f6924d = new D(false, enumC0381a3, C0374p.a(), new C0457q(3), new C0447o(6));
    }
}
