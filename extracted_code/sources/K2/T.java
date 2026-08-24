package K2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public class T extends Z {

    /* renamed from: o  reason: collision with root package name */
    public final boolean f804o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(P p3) {
        super(true);
        C0081j c0081j;
        C0081j c0081j2;
        boolean z3 = true;
        H(p3);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Z.f820n;
        InterfaceC0080i interfaceC0080i = (InterfaceC0080i) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0080i instanceof C0081j) {
            c0081j = (C0081j) interfaceC0080i;
        } else {
            c0081j = null;
        }
        if (c0081j != null) {
            Z n3 = c0081j.n();
            while (!n3.B()) {
                InterfaceC0080i interfaceC0080i2 = (InterfaceC0080i) atomicReferenceFieldUpdater.get(n3);
                if (interfaceC0080i2 instanceof C0081j) {
                    c0081j2 = (C0081j) interfaceC0080i2;
                } else {
                    c0081j2 = null;
                }
                if (c0081j2 != null) {
                    n3 = c0081j2.n();
                }
            }
            this.f804o = z3;
        }
        z3 = false;
        this.f804o = z3;
    }

    @Override // K2.Z
    public final boolean B() {
        return this.f804o;
    }

    @Override // K2.Z
    public final boolean C() {
        return true;
    }
}
