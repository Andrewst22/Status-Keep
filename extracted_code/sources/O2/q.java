package O2;

import K2.C0090t;
import K2.InterfaceC0080i;
import K2.P;
import K2.Z;
import P2.u;
import u2.InterfaceC0869g;
/* loaded from: classes.dex */
public final class q extends D2.j implements C2.p {

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ n f1359n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar) {
        super(2);
        this.f1359n = nVar;
    }

    @Override // C2.p
    public final Object i(Object obj, Object obj2) {
        int i3;
        int intValue = ((Number) obj).intValue();
        InterfaceC0869g interfaceC0869g = (InterfaceC0869g) obj2;
        u2.h key = interfaceC0869g.getKey();
        InterfaceC0869g d3 = this.f1359n.f1353q.d(key);
        if (key != C0090t.f856n) {
            if (interfaceC0869g != d3) {
                i3 = Integer.MIN_VALUE;
            } else {
                i3 = intValue + 1;
            }
            return Integer.valueOf(i3);
        }
        P p3 = (P) d3;
        P p4 = (P) interfaceC0869g;
        while (true) {
            if (p4 == null) {
                p4 = null;
                break;
            } else if (p4 == p3 || !(p4 instanceof u)) {
                break;
            } else {
                InterfaceC0080i interfaceC0080i = (InterfaceC0080i) Z.f820n.get((Z) p4);
                if (interfaceC0080i != null) {
                    p4 = interfaceC0080i.getParent();
                } else {
                    p4 = null;
                }
            }
        }
        if (p4 == p3) {
            if (p3 != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + p4 + ", expected child of " + p3 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
