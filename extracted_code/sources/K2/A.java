package K2;

import P2.AbstractC0097a;
import java.util.concurrent.CancellationException;
import m2.AbstractC0635d;
import n2.AbstractC0664g;
import s2.AbstractC0805d;
import s2.C0808g;
import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public abstract class A extends R2.h {

    /* renamed from: o  reason: collision with root package name */
    public int f784o;

    public A(int i3) {
        super(0L, R2.k.f2142g);
        this.f784o = i3;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract InterfaceC0866d c();

    public Throwable d(Object obj) {
        C0085n c0085n;
        if (obj instanceof C0085n) {
            c0085n = (C0085n) obj;
        } else {
            c0085n = null;
        }
        if (c0085n == null) {
            return null;
        }
        return c0085n.f845a;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC0635d.b(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        D2.i.b(th);
        AbstractC0092v.d(new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().h());
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        j0 j0Var;
        P p3;
        Object obj = C0808g.f9229a;
        R2.i iVar = this.f2133n;
        try {
            InterfaceC0866d c3 = c();
            D2.i.c(c3, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            P2.h hVar = (P2.h) c3;
            w2.b bVar = hVar.f1485q;
            Object obj2 = hVar.f1487s;
            u2.i h3 = bVar.h();
            Object n3 = AbstractC0097a.n(h3, obj2);
            if (n3 != AbstractC0097a.f1475f) {
                j0Var = AbstractC0092v.m(bVar, h3, n3);
            } else {
                j0Var = null;
            }
            u2.i h4 = bVar.h();
            Object j3 = j();
            Throwable d3 = d(j3);
            if (d3 == null && AbstractC0092v.f(this.f784o)) {
                p3 = (P) h4.d(C0090t.f856n);
            } else {
                p3 = null;
            }
            if (p3 != null && !p3.a()) {
                CancellationException A3 = ((Z) p3).A();
                b(j3, A3);
                bVar.k(AbstractC0664g.f(A3));
            } else if (d3 != null) {
                bVar.k(AbstractC0664g.f(d3));
            } else {
                bVar.k(f(j3));
            }
            if (j0Var == null || j0Var.X()) {
                AbstractC0097a.h(h3, n3);
            }
            try {
                iVar.getClass();
            } catch (Throwable th) {
                obj = AbstractC0664g.f(th);
            }
            i(null, AbstractC0805d.a(obj));
        } catch (Throwable th2) {
            try {
                iVar.getClass();
            } catch (Throwable th3) {
                obj = AbstractC0664g.f(th3);
            }
            i(th2, AbstractC0805d.a(obj));
        }
    }

    public Object f(Object obj) {
        return obj;
    }
}
