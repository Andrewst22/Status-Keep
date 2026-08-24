package j$.util.stream;

import j$.util.function.Function;
/* renamed from: j$.util.stream.b2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0385b2 extends AbstractC0395d2 {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ int f7112m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ Function f7113n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0385b2(AbstractC0400e2 abstractC0400e2, int i3, Function function, int i4) {
        super(abstractC0400e2, i3, 1);
        this.f7112m = i4;
        this.f7113n = function;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0382b
    public final InterfaceC0440m2 V(int i3, InterfaceC0440m2 interfaceC0440m2) {
        switch (this.f7112m) {
            case 0:
                return new C0432l(this, interfaceC0440m2, 3);
            default:
                return new C0427k(this, interfaceC0440m2);
        }
    }
}
