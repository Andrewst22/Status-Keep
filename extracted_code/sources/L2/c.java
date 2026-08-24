package L2;

import K2.AbstractC0089s;
import K2.B;
import K2.C0090t;
import K2.InterfaceC0095y;
import K2.P;
import P2.p;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import u2.i;
/* loaded from: classes.dex */
public final class c extends AbstractC0089s implements InterfaceC0095y {
    private volatile c _immediate;

    /* renamed from: o  reason: collision with root package name */
    public final Handler f970o;

    /* renamed from: p  reason: collision with root package name */
    public final String f971p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f972q;

    /* renamed from: r  reason: collision with root package name */
    public final c f973r;

    public c(Handler handler, String str, boolean z3) {
        this.f970o = handler;
        this.f971p = str;
        this.f972q = z3;
        this._immediate = z3 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f973r = cVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof c) && ((c) obj).f970o == this.f970o) {
            return true;
        }
        return false;
    }

    @Override // K2.AbstractC0089s
    public final void g(i iVar, Runnable runnable) {
        if (!this.f970o.post(runnable)) {
            CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
            P p3 = (P) iVar.d(C0090t.f856n);
            if (p3 != null) {
                p3.b(cancellationException);
            }
            B.f786b.g(iVar, runnable);
        }
    }

    @Override // K2.AbstractC0089s
    public final boolean h() {
        if (this.f972q && D2.i.a(Looper.myLooper(), this.f970o.getLooper())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f970o);
    }

    @Override // K2.AbstractC0089s
    public final String toString() {
        c cVar;
        String str;
        R2.d dVar = B.f785a;
        c cVar2 = p.f1508a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f973r;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            if (this == cVar) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.f971p;
            if (str2 == null) {
                str2 = this.f970o.toString();
            }
            if (this.f972q) {
                return str2 + ".immediate";
            }
            return str2;
        }
        return str;
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
