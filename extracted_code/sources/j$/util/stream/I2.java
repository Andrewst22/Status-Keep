package j$.util.stream;

import j$.util.AbstractC0340b;
import j$.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
/* loaded from: classes2.dex */
final class I2 extends A2 {

    /* renamed from: d  reason: collision with root package name */
    private ArrayList f6942d;

    @Override // j$.util.stream.AbstractC0420i2, j$.util.stream.InterfaceC0440m2
    public final void s(long j3) {
        if (j3 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f6942d = j3 >= 0 ? new ArrayList((int) j3) : new ArrayList();
    }

    @Override // j$.util.stream.AbstractC0420i2, j$.util.stream.InterfaceC0440m2
    public final void r() {
        ArrayList arrayList = this.f6942d;
        boolean z3 = arrayList instanceof List;
        Comparator comparator = this.f6885b;
        if (z3) {
            ((List) arrayList).sort(comparator);
        } else {
            List.CC.$default$sort(arrayList, comparator);
        }
        InterfaceC0440m2 interfaceC0440m2 = this.f7182a;
        interfaceC0440m2.s(this.f6942d.size());
        if (!this.f6886c) {
            AbstractC0340b.u(this.f6942d, new C0377a(2, interfaceC0440m2));
        } else {
            Iterator it = this.f6942d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (interfaceC0440m2.v()) {
                    break;
                }
                interfaceC0440m2.accept(next);
            }
        }
        interfaceC0440m2.r();
        this.f6942d = null;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f6942d.add(obj);
    }
}
