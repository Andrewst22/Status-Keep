package j$.util.stream;

import j$.util.function.InterfaceC0348c;
import j$.util.function.InterfaceC0350e;
import j$.util.function.InterfaceC0360o;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.y1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0498y1 extends AbstractC0482v0 {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f7308h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ Object f7309i;

    public /* synthetic */ C0498y1(EnumC0381a3 enumC0381a3, Object obj, int i3) {
        this.f7308h = i3;
        this.f7309i = obj;
    }

    @Override // j$.util.stream.AbstractC0482v0
    public final Q1 d0() {
        switch (this.f7308h) {
            case 0:
                return new P1((j$.util.function.w) this.f7309i);
            case 1:
                return new B1((InterfaceC0350e) this.f7309i);
            case N.k.FLOAT_FIELD_NUMBER /* 2 */:
                return new G1((InterfaceC0348c) this.f7309i);
            default:
                return new M1((InterfaceC0360o) this.f7309i);
        }
    }
}
