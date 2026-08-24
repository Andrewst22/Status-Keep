package j$.util.stream;

import java.util.Comparator;
/* loaded from: classes2.dex */
abstract class A2 extends AbstractC0420i2 {

    /* renamed from: b  reason: collision with root package name */
    protected final Comparator f6885b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f6886c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public A2(InterfaceC0440m2 interfaceC0440m2, Comparator comparator) {
        super(interfaceC0440m2);
        this.f6885b = comparator;
    }

    @Override // j$.util.stream.AbstractC0420i2, j$.util.stream.InterfaceC0440m2
    public final boolean v() {
        this.f6886c = true;
        return false;
    }
}
