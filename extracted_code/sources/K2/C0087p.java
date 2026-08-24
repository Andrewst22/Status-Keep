package K2;

import u2.InterfaceC0869g;
/* renamed from: K2.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087p extends D2.j implements C2.p {

    /* renamed from: o  reason: collision with root package name */
    public static final C0087p f848o = new C0087p(2, 0);

    /* renamed from: p  reason: collision with root package name */
    public static final C0087p f849p = new C0087p(2, 1);

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f850n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0087p(int i3, int i4) {
        super(i3);
        this.f850n = i4;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        switch (this.f850n) {
            case 0:
                return ((u2.i) obj).n((InterfaceC0869g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                InterfaceC0869g interfaceC0869g = (InterfaceC0869g) obj2;
                return bool;
            default:
                return ((u2.i) obj).n((InterfaceC0869g) obj2);
        }
    }
}
