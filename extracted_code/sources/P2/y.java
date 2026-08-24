package P2;

import K2.g0;
import u2.InterfaceC0869g;
/* loaded from: classes.dex */
public final class y extends D2.j implements C2.p {

    /* renamed from: o  reason: collision with root package name */
    public static final y f1518o = new y(2, 0);

    /* renamed from: p  reason: collision with root package name */
    public static final y f1519p = new y(2, 1);

    /* renamed from: q  reason: collision with root package name */
    public static final y f1520q = new y(2, 2);

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f1521n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i3, int i4) {
        super(i3);
        this.f1521n = i4;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        Integer num;
        int i3;
        switch (this.f1521n) {
            case 0:
                InterfaceC0869g interfaceC0869g = (InterfaceC0869g) obj2;
                if (interfaceC0869g instanceof g0) {
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        i3 = num.intValue();
                    } else {
                        i3 = 1;
                    }
                    if (i3 == 0) {
                        return interfaceC0869g;
                    }
                    return Integer.valueOf(i3 + 1);
                }
                return obj;
            case 1:
                g0 g0Var = (g0) obj;
                InterfaceC0869g interfaceC0869g2 = (InterfaceC0869g) obj2;
                if (g0Var == null) {
                    if (interfaceC0869g2 instanceof g0) {
                        return (g0) interfaceC0869g2;
                    }
                    return null;
                }
                return g0Var;
            default:
                InterfaceC0869g interfaceC0869g3 = (InterfaceC0869g) obj2;
                return (A) obj;
        }
    }
}
