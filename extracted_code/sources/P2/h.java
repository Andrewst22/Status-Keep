package P2;

import K2.AbstractC0089s;
import K2.AbstractC0092v;
import K2.C0085n;
import K2.C0086o;
import K2.H;
import K2.h0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s2.AbstractC0805d;
import t2.C0825b;
import u2.InterfaceC0866d;
/* loaded from: classes.dex */
public final class h extends K2.A implements w2.c, InterfaceC0866d {

    /* renamed from: t  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1483t = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: p  reason: collision with root package name */
    public final AbstractC0089s f1484p;

    /* renamed from: q  reason: collision with root package name */
    public final w2.b f1485q;

    /* renamed from: r  reason: collision with root package name */
    public Object f1486r;

    /* renamed from: s  reason: collision with root package name */
    public final Object f1487s;

    public h(AbstractC0089s abstractC0089s, w2.b bVar) {
        super(-1);
        this.f1484p = abstractC0089s;
        this.f1485q = bVar;
        this.f1486r = AbstractC0097a.f1472c;
        this.f1487s = AbstractC0097a.m(bVar.h());
    }

    @Override // K2.A
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0086o) {
            ((C0086o) obj).f847b.b(cancellationException);
        }
    }

    @Override // w2.c
    public final w2.c e() {
        w2.b bVar = this.f1485q;
        if (!(bVar instanceof w2.c)) {
            return null;
        }
        return bVar;
    }

    @Override // u2.InterfaceC0866d
    public final u2.i h() {
        return this.f1485q.h();
    }

    @Override // K2.A
    public final Object j() {
        Object obj = this.f1486r;
        this.f1486r = AbstractC0097a.f1472c;
        return obj;
    }

    @Override // u2.InterfaceC0866d
    public final void k(Object obj) {
        Object c0085n;
        w2.b bVar = this.f1485q;
        u2.i h3 = bVar.h();
        Throwable a3 = AbstractC0805d.a(obj);
        if (a3 == null) {
            c0085n = obj;
        } else {
            c0085n = new C0085n(a3, false);
        }
        AbstractC0089s abstractC0089s = this.f1484p;
        if (abstractC0089s.h()) {
            this.f1486r = c0085n;
            this.f784o = 0;
            abstractC0089s.g(h3, this);
            return;
        }
        H a4 = h0.a();
        if (a4.f793o >= 4294967296L) {
            this.f1486r = c0085n;
            this.f784o = 0;
            C0825b c0825b = a4.f795q;
            if (c0825b == null) {
                c0825b = new C0825b();
                a4.f795q = c0825b;
            }
            c0825b.addLast(this);
            return;
        }
        a4.k(true);
        try {
            u2.i h4 = bVar.h();
            Object n3 = AbstractC0097a.n(h4, this.f1487s);
            bVar.k(obj);
            AbstractC0097a.h(h4, n3);
            do {
            } while (a4.m());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f1484p + ", " + AbstractC0092v.k(this.f1485q) + ']';
    }

    @Override // K2.A
    public final InterfaceC0866d c() {
        return this;
    }
}
