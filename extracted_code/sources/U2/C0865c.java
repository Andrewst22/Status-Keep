package u2;

import C2.p;
import java.io.Serializable;
/* renamed from: u2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0865c implements i, Serializable {

    /* renamed from: m  reason: collision with root package name */
    public final i f9458m;

    /* renamed from: n  reason: collision with root package name */
    public final InterfaceC0869g f9459n;

    public C0865c(i iVar, InterfaceC0869g interfaceC0869g) {
        D2.i.e(iVar, "left");
        D2.i.e(interfaceC0869g, "element");
        this.f9458m = iVar;
        this.f9459n = interfaceC0869g;
    }

    @Override // u2.i
    public final Object c(Object obj, p pVar) {
        return pVar.i(this.f9458m.c(obj, pVar), this.f9459n);
    }

    @Override // u2.i
    public final InterfaceC0869g d(h hVar) {
        D2.i.e(hVar, "key");
        C0865c c0865c = this;
        while (true) {
            InterfaceC0869g d3 = c0865c.f9459n.d(hVar);
            if (d3 != null) {
                return d3;
            }
            i iVar = c0865c.f9458m;
            if (iVar instanceof C0865c) {
                c0865c = (C0865c) iVar;
            } else {
                return iVar.d(hVar);
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z3;
        if (this != obj) {
            if (!(obj instanceof C0865c)) {
                return false;
            }
            C0865c c0865c = (C0865c) obj;
            c0865c.getClass();
            int i3 = 2;
            C0865c c0865c2 = c0865c;
            int i4 = 2;
            while (true) {
                i iVar = c0865c2.f9458m;
                if (iVar instanceof C0865c) {
                    c0865c2 = (C0865c) iVar;
                } else {
                    c0865c2 = null;
                }
                if (c0865c2 == null) {
                    break;
                }
                i4++;
            }
            C0865c c0865c3 = this;
            while (true) {
                i iVar2 = c0865c3.f9458m;
                if (iVar2 instanceof C0865c) {
                    c0865c3 = (C0865c) iVar2;
                } else {
                    c0865c3 = null;
                }
                if (c0865c3 == null) {
                    break;
                }
                i3++;
            }
            if (i4 != i3) {
                return false;
            }
            C0865c c0865c4 = this;
            while (true) {
                InterfaceC0869g interfaceC0869g = c0865c4.f9459n;
                if (!D2.i.a(c0865c.d(interfaceC0869g.getKey()), interfaceC0869g)) {
                    z3 = false;
                    break;
                }
                i iVar3 = c0865c4.f9458m;
                if (iVar3 instanceof C0865c) {
                    c0865c4 = (C0865c) iVar3;
                } else {
                    D2.i.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    InterfaceC0869g interfaceC0869g2 = (InterfaceC0869g) iVar3;
                    z3 = D2.i.a(c0865c.d(interfaceC0869g2.getKey()), interfaceC0869g2);
                    break;
                }
            }
            if (!z3) {
                return false;
            }
        }
        return true;
    }

    @Override // u2.i
    public final i f(h hVar) {
        D2.i.e(hVar, "key");
        InterfaceC0869g interfaceC0869g = this.f9459n;
        InterfaceC0869g d3 = interfaceC0869g.d(hVar);
        i iVar = this.f9458m;
        if (d3 != null) {
            return iVar;
        }
        i f3 = iVar.f(hVar);
        if (f3 == iVar) {
            return this;
        }
        if (f3 != j.f9461m) {
            return new C0865c(f3, interfaceC0869g);
        }
        return interfaceC0869g;
    }

    public final int hashCode() {
        return this.f9459n.hashCode() + this.f9458m.hashCode();
    }

    @Override // u2.i
    public final i n(i iVar) {
        D2.i.e(iVar, "context");
        if (iVar == j.f9461m) {
            return this;
        }
        return (i) iVar.c(this, new C0864b(1));
    }

    public final String toString() {
        return "[" + ((String) c("", new C0864b(0))) + ']';
    }
}
