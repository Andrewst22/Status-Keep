package O2;

import P2.u;
import a.AbstractC0155a;
import java.util.ArrayList;
import s2.C0808g;
import t2.AbstractC0827d;
import u2.InterfaceC0866d;
import v2.EnumC0879a;
/* loaded from: classes.dex */
public abstract class f implements j {

    /* renamed from: m  reason: collision with root package name */
    public final u2.i f1340m;

    /* renamed from: n  reason: collision with root package name */
    public final int f1341n;

    /* renamed from: o  reason: collision with root package name */
    public final int f1342o;

    public f(u2.i iVar, int i3, int i4) {
        this.f1340m = iVar;
        this.f1341n = i3;
        this.f1342o = i4;
    }

    @Override // O2.j
    public final N2.d J(u2.i iVar, int i3, int i4) {
        u2.i iVar2 = this.f1340m;
        u2.i n3 = iVar.n(iVar2);
        int i5 = this.f1342o;
        int i6 = this.f1341n;
        if (i4 == 1) {
            if (i6 != -3) {
                if (i3 != -3) {
                    if (i6 != -2) {
                        if (i3 != -2) {
                            i3 += i6;
                            if (i3 < 0) {
                                i3 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i3 = i6;
            }
            i4 = i5;
        }
        if (D2.i.a(n3, iVar2) && i3 == i6 && i4 == i5) {
            return this;
        }
        return b(n3, i3, i4);
    }

    public abstract Object a(M2.p pVar, InterfaceC0866d interfaceC0866d);

    public abstract f b(u2.i iVar, int i3, int i4);

    public String toString() {
        String str;
        ArrayList arrayList = new ArrayList(4);
        u2.j jVar = u2.j.f9461m;
        u2.i iVar = this.f1340m;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i3 = this.f1341n;
        if (i3 != -3) {
            arrayList.add("capacity=" + i3);
        }
        int i4 = this.f1342o;
        if (i4 != 1) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        str = "null";
                    } else {
                        str = "DROP_LATEST";
                    }
                } else {
                    str = "DROP_OLDEST";
                }
            } else {
                str = "SUSPEND";
            }
            arrayList.add("onBufferOverflow=".concat(str));
        }
        return getClass().getSimpleName() + '[' + AbstractC0827d.F(arrayList, ", ", null, null, null, 62) + ']';
    }

    @Override // N2.d
    public Object x(N2.e eVar, InterfaceC0866d interfaceC0866d) {
        d dVar = new d(eVar, this, null);
        u uVar = new u(interfaceC0866d, interfaceC0866d.h());
        Object K3 = AbstractC0155a.K(uVar, uVar, dVar);
        if (K3 != EnumC0879a.f9494m) {
            return C0808g.f9229a;
        }
        return K3;
    }
}
