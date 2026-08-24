package K2;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class X implements L {

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f811n = AtomicIntegerFieldUpdater.newUpdater(X.class, "_isCompleting");

    /* renamed from: o  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f812o = AtomicReferenceFieldUpdater.newUpdater(X.class, Object.class, "_rootCause");

    /* renamed from: p  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f813p = AtomicReferenceFieldUpdater.newUpdater(X.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: m  reason: collision with root package name */
    public final a0 f814m;

    public X(a0 a0Var, Throwable th) {
        this.f814m = a0Var;
        this._rootCause = th;
    }

    @Override // K2.L
    public final boolean a() {
        if (c() == null) {
            return true;
        }
        return false;
    }

    public final void b(Throwable th) {
        Throwable c3 = c();
        if (c3 == null) {
            f812o.set(this, th);
        } else if (th == c3) {
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f813p;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
            } else if (obj instanceof Throwable) {
                if (th == obj) {
                    return;
                }
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(th);
                atomicReferenceFieldUpdater.set(this, arrayList);
            } else if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
    }

    public final Throwable c() {
        return (Throwable) f812o.get(this);
    }

    public final boolean d() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (f811n.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f813p;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
        Throwable c3 = c();
        if (c3 != null) {
            arrayList.add(0, c3);
        }
        if (th != null && !th.equals(c3)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0092v.f863g);
        return arrayList;
    }

    @Override // K2.L
    public final a0 g() {
        return this.f814m;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + c() + ", exceptions=" + f813p.get(this) + ", list=" + this.f814m + ']';
    }
}
